package com.msa.reserve.dto;

import java.util.Date;

import com.msa.reserve.entity.Account;
import com.msa.reserve.entity.Product;
import com.msa.reserve.entity.Reserve;

import lombok.Getter;

public class ReserveDto {
	
	@Getter
	public static class Res {
		private long reserveId;
		private Product product;
		private Account account;
		private Date reserveFrom;
		private Date reserveTo;
		
		public Res(Reserve reserve) {
			this.reserveId = reserve.getId();
			this.product = reserve.getProduct();
			this.account = reserve.getAccount();
			this.reserveFrom = reserve.getReserveFrom();
			this.reserveTo = reserve.getReserveTo();
		}
		
	}

}
