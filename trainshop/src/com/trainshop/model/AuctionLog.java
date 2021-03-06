package com.trainshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AuctionLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "auction_log", catalog = "trainshop")
public class AuctionLog implements java.io.Serializable {

	// Fields

	private Long logId;
	private Long actId;
	private Long bidUser;
	private Double bidPrice;
	private Integer bidTime;

	// Constructors

	/** default constructor */
	public AuctionLog() {
	}

	/** full constructor */
	public AuctionLog(Long actId, Long bidUser, Double bidPrice, Integer bidTime) {
		this.actId = actId;
		this.bidUser = bidUser;
		this.bidPrice = bidPrice;
		this.bidTime = bidTime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "log_id", unique = true, nullable = false)
	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	@Column(name = "act_id", nullable = false)
	public Long getActId() {
		return this.actId;
	}

	public void setActId(Long actId) {
		this.actId = actId;
	}

	@Column(name = "bid_user", nullable = false)
	public Long getBidUser() {
		return this.bidUser;
	}

	public void setBidUser(Long bidUser) {
		this.bidUser = bidUser;
	}

	@Column(name = "bid_price", nullable = false, precision = 10)
	public Double getBidPrice() {
		return this.bidPrice;
	}

	public void setBidPrice(Double bidPrice) {
		this.bidPrice = bidPrice;
	}

	@Column(name = "bid_time", nullable = false)
	public Integer getBidTime() {
		return this.bidTime;
	}

	public void setBidTime(Integer bidTime) {
		this.bidTime = bidTime;
	}

}