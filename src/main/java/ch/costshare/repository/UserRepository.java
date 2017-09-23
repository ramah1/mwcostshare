package ch.costshare.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.nurkiewicz.jdbcrepository.JdbcRepository;
import com.nurkiewicz.jdbcrepository.RowUnmapper;
import com.nurkiewicz.jdbcrepository.TableDescription;

import ch.costshare.model.User;
import ch.costshare.utils.SQLStatements;

@Component
public class UserRepository extends JdbcRepository<User, Integer> {
	public UserRepository() {
		this("costshare.benutzer");
	}

	public UserRepository(String tableName) {
		super(ROW_MAPPER, ROW_UNMAPPER, new TableDescription(tableName, null, "id"));
	}

	public static final RowMapper<User> ROW_MAPPER = new RowMapper<User>() {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"), rs.getBoolean("isadmin"));
		}
	};

	public static final RowUnmapper<User> ROW_UNMAPPER = new RowUnmapper<User>() {
		public Map<String, Object> mapColumns(User user) {
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put("id", user.getId());
			mapping.put("username", user.getUsername());
			mapping.put("email", user.getEmail());
			mapping.put("password", user.getPassword());
			mapping.put("isadmin", user.getIsAdmin());

			return mapping;
		}
	};

	public User findByUsername(String username){
		User user = getJdbcOperations().queryForObject(SQLStatements.FIND_USER_BY_USERNAME, ROW_MAPPER, username);
		return user;
	}
	
	public User findByEmail(String email){
		User user = getJdbcOperations().queryForObject(SQLStatements.FIND_USER_BY_EMAIL, ROW_MAPPER, email);
		return user;
	}

	public User createUser(User user){
		getJdbcOperations().update(SQLStatements.CREATE_USER, user.getUsername(), user.getEmail(), user.getPassword(), user.getIsAdmin());
		return user;
	}
	
	public User updateUser(User user, int id){
		getJdbcOperations().update(SQLStatements.UPDATE_USER_BY_ID, user.getUsername(), user.getEmail(), user.getPassword(), user.getIsAdmin(), id);
		return user;
	}
}