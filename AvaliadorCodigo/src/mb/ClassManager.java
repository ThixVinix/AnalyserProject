package mb;

public class ClassManager {

	private Long contClasses;

	public Long getContClasses() {
		return contClasses;
	}

	public void addClasses(Long contClasses) {
		this.contClasses = this.contClasses + contClasses;
	}

}
