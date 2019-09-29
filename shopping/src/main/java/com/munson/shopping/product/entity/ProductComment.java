package com.munson.shopping.product.entity;

import java.io.Serializable;
import java.util.Date;

import com.google.common.base.MoreObjects;

public class ProductComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long productId;
	
	private Long authorId;
	
	private String content;
	
	private Date created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("id", getId()).add("productId", getProductId()).add("authorId", getAuthorId()).add("content", getContent()).toString();
	}

}
