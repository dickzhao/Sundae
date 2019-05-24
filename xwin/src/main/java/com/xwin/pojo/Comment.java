package com.xwin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "comment")
public class Comment  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "post_id")
	private Long postId;

	@Column(name = "abbreviation_id")
	private Long abbreviationId;

	private String content;

	@Column(name = "data_status")
	private Long dataStatus;

	@Column(name = "create_time")
	private String createTime;

	@Column(name = "last_update_time")
	private String lastUpdateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getAbbreviationId() {
		return abbreviationId;
	}

	public void setAbbreviationId(Long abbreviationId) {
		this.abbreviationId = abbreviationId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Long dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
	public String toString() {
		return "Comment{" +
				"id=" + id +
				", userId=" + userId +
				", postId=" + postId +
				", abbreviationId=" + abbreviationId +
				", content='" + content + '\'' +
				", dataStatus=" + dataStatus +
				", createTime='" + createTime + '\'' +
				", lastUpdateTime='" + lastUpdateTime + '\'' +
				'}';
	}
}
