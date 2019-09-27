package mb;

public class LineManager {

	private Long contLines;

	public Long getContLines() {
		return contLines;
	}

	public void addLine(Long contLines) {
		this.contLines = this.contLines + contLines;
	}

}
