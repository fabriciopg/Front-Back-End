package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DataUnitTest {
	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		
		LocalDate date = LocalDate.of(2030, 01, 01);
		DateUtils.isEqualOrFutureDate(date);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
		System.out.println(DateUtils.isEqualOrFutureDate(date));
		
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		
		LocalDate date = LocalDate.of(2010, 01, 01);
		DateUtils.isEqualOrFutureDate(date);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
		System.out.println(DateUtils.isEqualOrFutureDate(date));
		
	}
	
	@Test
	public void deveRetornarTrueParaDatasPresentes() {
		
		LocalDate date = LocalDate.now();
		DateUtils.isEqualOrFutureDate(date);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
		System.out.println(DateUtils.isEqualOrFutureDate(date));
		
	}

}
