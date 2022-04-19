package jacksonSerializable;

public class PostOperation {
	int id;
	String title;
	public PostOperation(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public PostOperation()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
