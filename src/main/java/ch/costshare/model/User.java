package ch.costshare.model;

import org.springframework.data.domain.Persistable;
 
@SuppressWarnings("serial")
public class User implements Persistable<Integer>{

	private int id;

	private String username;
    
	private String email;
     
	private String password;

    private Boolean isadmin;
    
    public User() { }
 
    public User(int id, String username, String email, String password, Boolean isadmin) {
        this.id = id;
    	this.username = username;
        this.email = email;
        this.password = password;
        this.isadmin = isadmin;
    }
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsAdmin() {
		return isadmin;
	}

	public void setIsAdmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean isNew() {
		// Assuming id is always > 0
		return (this.id <= 0);
	}
    
}