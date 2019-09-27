package mb;

public class CommentManager {

	private Long contComments;

	public Long getContComments() {
		return contComments;
	}

	public void addComment(Long contComments) {
		this.contComments = this.contComments + contComments;
	}

}
