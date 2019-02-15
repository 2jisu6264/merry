package article.service;

import java.util.Map;

import article.model.WriterBean;

public class WriteRequest {

	private WriterBean writer;
	private String title;
	private String content;

	public WriteRequest(WriterBean writer, String title, String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public WriterBean getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void validate(Map<String, Boolean> errors) {
		if (title == null || title.trim().isEmpty()) {
			errors.put("title", Boolean.TRUE);
		}
	}
}