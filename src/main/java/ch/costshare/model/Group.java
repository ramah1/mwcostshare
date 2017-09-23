package ch.costshare.model;

import org.springframework.data.domain.Persistable;
 
public class Group implements Persistable<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String name;

	private String description;
	
	private Boolean isActive;
    
    public Group() { }
 
    public Group(long id, String name, String description, Boolean isActive) {
        this.id = id;
        this.name = name;
    	this.description = description;
    	this.isActive = isActive;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public boolean isNew() {
		return true;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
    
}