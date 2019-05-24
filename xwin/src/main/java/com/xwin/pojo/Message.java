package com.xwin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "message")
public class Message  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	private String content;

	private Long type;

	@Column(name = "read_flag")
	private Long readFlag;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(Long readFlag) {
		this.readFlag = readFlag;
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
		return "Message{" +
				"id=" + id +
				", userId=" + userId +
				", content='" + content + '\'' +
				", type=" + type +
				", readFlag=" + readFlag +
				", dataStatus=" + dataStatus +
				", createTime='" + createTime + '\'' +
				", lastUpdateTime='" + lastUpdateTime + '\'' +
				'}';
	}
}
