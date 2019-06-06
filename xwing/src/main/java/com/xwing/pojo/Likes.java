package com.xwing.pojo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "likes")
public class Likes  implements Serializable {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private Long id;

	private Long count;

	@Column(name = "likeId")
	private Long likeid;

	@Column(name = "createTime")
	private java.util.Date createtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getLikeid() {
		return likeid;
	}

	public void setLikeid(Long likeid) {
		this.likeid = likeid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Likes{" +
				"id=" + id +
				", count=" + count +
				", likeid=" + likeid +
				", createtime=" + createtime +
				'}';
	}
}
