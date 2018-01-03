package dto;

import java.io.Serializable;

public class HumanDto implements Serializable {
	private int seq;
	private String id;
	private String created_at;
	
	public HumanDto() {
		// TODO Auto-generated constructor stub
	}
	
	public HumanDto(int seq, String id, String created_at) {
		super();
		this.seq = seq;
		this.id = id;
		this.created_at = created_at;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "HumanDto [seq=" + seq + ", id=" + id + ", created_at=" + created_at + "]";
	}



}
