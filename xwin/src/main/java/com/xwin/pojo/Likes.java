package com.xwin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "likes")
public class Likes  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Long count;

	@Column(name = "likeId")
	private Long likeid;

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

	@Override
	public String toString() {
		return "Likes{" +
				"id=" + id +
				", count=" + count +
				", likeid=" + likeid +
				'}';
	}
}
