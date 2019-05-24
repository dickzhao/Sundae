package com.xwin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "follow")
public class Follow  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "followed_user_id")
	private Long followedUserId;

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

	public Long getFollowedUserId() {
		return followedUserId;
	}

	public void setFollowedUserId(Long followedUserId) {
		this.followedUserId = followedUserId;
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
		return "Follow{" +
				"id=" + id +
				", userId=" + userId +
				", followedUserId=" + followedUserId +
				", dataStatus=" + dataStatus +
				", createTime='" + createTime + '\'' +
				", lastUpdateTime='" + lastUpdateTime + '\'' +
				'}';
	}
}
