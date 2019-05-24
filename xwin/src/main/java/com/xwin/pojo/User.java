package com.xwin.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User  implements Serializable {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;

	private String username;

	private String nickname;

	@Column(name = "role_id")
	private Long roleid;

	private Long point;

	@Column(name = "avatar_url")
	private String avatarUrl;

	private Long gender;

	private String region;

	private String profile;

	@Column(name = "verification_code")
	private Long verificationCode;

	@Column(name = "create_time")
	private String createTime;

	@Column(name = "data_status")
	private Long dataStatus;

	@Column(name = "last_update_time")
	private String lastUpdateTime;

	private String token;

	@Column(name = "last_login_time")
	private String lastLoginTime;

	@Column(name = "last_login_ip")
	private String lastLoginIp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getPoint() {
		return point;
	}

	public void setPoint(Long point) {
		this.point = point;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Long getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(Long verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Long dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", nickname='" + nickname + '\'' +
				", roleid=" + roleid +
				", point=" + point +
				", avatarUrl='" + avatarUrl + '\'' +
				", gender=" + gender +
				", region='" + region + '\'' +
				", profile='" + profile + '\'' +
				", verificationCode=" + verificationCode +
				", createTime='" + createTime + '\'' +
				", dataStatus=" + dataStatus +
				", lastUpdateTime='" + lastUpdateTime + '\'' +
				", token='" + token + '\'' +
				", lastLoginTime='" + lastLoginTime + '\'' +
				", lastLoginIp='" + lastLoginIp + '\'' +
				'}';
	}
}
