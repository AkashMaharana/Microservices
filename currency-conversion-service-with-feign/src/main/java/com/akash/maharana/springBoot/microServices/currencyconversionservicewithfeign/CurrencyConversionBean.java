package com.akash.maharana.springBoot.microServices.currencyconversionservicewithfeign;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public CurrencyConversionBean() {

	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiplier() {
		return conversionMultiplier;
	}

	public void setConversionMultiplier(BigDecimal conversionMultiplier) {
		this.conversionMultiplier = conversionMultiplier;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiplier, BigDecimal quantity,
			BigDecimal calculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiplier = conversionMultiplier;
		this.quantity = quantity;
		this.calculatedAmount = calculatedAmount;
		this.port = port;
	}

	private BigDecimal conversionMultiplier;
	private BigDecimal quantity;
	private BigDecimal calculatedAmount;
	private int port;

}
