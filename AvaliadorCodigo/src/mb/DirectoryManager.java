package mb;

public class DirectoryManager {

	private Long contDirectories;

	public Long getContDirectories() {
		return contDirectories;
	}

	public void addDirectory(Long contDirectories) {
		this.contDirectories = this.contDirectories + contDirectories;
	}

}
