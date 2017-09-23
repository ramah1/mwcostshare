package ch.costshare.utils;

public class SQLStatements {
	// ------------------------------------- USER
	public static final String FIND_ALL = "SELECT * FROM "
			+ MappingsConfig.TABLE_NAMES.get("User");
	
	public static final String FIND_USER_BY_USERNAME = "SELECT * FROM "
			+ MappingsConfig.TABLE_NAMES.get("User") + " WHERE username = ?";
	
	public static final String FIND_USER_BY_EMAIL = "SELECT * FROM "
			+ MappingsConfig.TABLE_NAMES.get("User") + " WHERE email = ?";

	public static final String UPDATE_USER_BY_ID = "UPDATE " + MappingsConfig.TABLE_NAMES.get("User")
			+ " SET username = ?, email = ?, password = ?, isadmin = ? WHERE id = ?";

	public static final String CREATE_USER = "INSERT INTO " + MappingsConfig.TABLE_NAMES.get("User")
			+ " (username, email, password, isadmin) VALUES (?,?,?,?) ";

	// ----------------------------------GROUP
	public static final String FIND_GROUP_BY_ID = "SELECT * FROM "
			+ MappingsConfig.TABLE_NAMES.get("Group") + " WHERE id = ?";

	public static final String FIND_GROUP_BY_NAME = "SELECT * FROM " + MappingsConfig.TABLE_NAMES.get("Group")
			+ " WHERE name = ?";

	public static final String CREATE_GROUP = "INSERT INTO " + MappingsConfig.TABLE_NAMES.get("Group")
			+ " (name, description, isActive) VALUES (?,?,?,?)";

	public static final String UPDATE_GROUP_BY_ID = "UPDATE " + MappingsConfig.TABLE_NAMES.get("Group")
			+ " SET name = ?, description = ?, isActive = ? where id = ?";
}

	