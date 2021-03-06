package com.trainshop.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PackageGoodsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class PackageGoodsId implements java.io.Serializable {

	// Fields

	private Long packageId;
	private Long goodsId;
	private Short adminId;
	private Long productId;

	// Constructors

	/** default constructor */
	public PackageGoodsId() {
	}

	/** full constructor */
	public PackageGoodsId(Long packageId, Long goodsId, Short adminId,
			Long productId) {
		this.packageId = packageId;
		this.goodsId = goodsId;
		this.adminId = adminId;
		this.productId = productId;
	}

	// Property accessors

	@Column(name = "package_id", nullable = false)
	public Long getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	@Column(name = "goods_id", nullable = false)
	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Column(name = "admin_id", nullable = false)
	public Short getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Short adminId) {
		this.adminId = adminId;
	}

	@Column(name = "product_id", nullable = false)
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PackageGoodsId))
			return false;
		PackageGoodsId castOther = (PackageGoodsId) other;

		return ((this.getPackageId() == castOther.getPackageId()) || (this
				.getPackageId() != null && castOther.getPackageId() != null && this
				.getPackageId().equals(castOther.getPackageId())))
				&& ((this.getGoodsId() == castOther.getGoodsId()) || (this
						.getGoodsId() != null && castOther.getGoodsId() != null && this
						.getGoodsId().equals(castOther.getGoodsId())))
				&& ((this.getAdminId() == castOther.getAdminId()) || (this
						.getAdminId() != null && castOther.getAdminId() != null && this
						.getAdminId().equals(castOther.getAdminId())))
				&& ((this.getProductId() == castOther.getProductId()) || (this
						.getProductId() != null
						&& castOther.getProductId() != null && this
						.getProductId().equals(castOther.getProductId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPackageId() == null ? 0 : this.getPackageId().hashCode());
		result = 37 * result
				+ (getGoodsId() == null ? 0 : this.getGoodsId().hashCode());
		result = 37 * result
				+ (getAdminId() == null ? 0 : this.getAdminId().hashCode());
		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		return result;
	}

}