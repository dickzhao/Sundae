package com.xwin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "image")
public class Image  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "post_id")
	private Long postId;

	@Column(name = "abbreviation_id")
	private Long abbreviationId;

	private String path;

	private String name;

	private String sequence;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
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
		return "Image{" +
				"id=" + id +
				", postId=" + postId +
				", abbreviationId=" + abbreviationId +
				", path='" + path + '\'' +
				", name='" + name + '\'' +
				", sequence='" + sequence + '\'' +
				", dataStatus=" + dataStatus +
				", createTime='" + createTime + '\'' +
				", lastUpdateTime='" + lastUpdateTime + '\'' +
				'}';
	}
}
