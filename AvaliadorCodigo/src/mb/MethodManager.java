package mb;

public class MethodManager {

	private Long contMethods;

	public Long getContMethods() {
		return contMethods;
	}

	public void addMethod(Long contMethods) {
		this.contMethods = this.contMethods + contMethods;
	}

}
