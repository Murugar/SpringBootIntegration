package com.iqmsoft.spring.integration.shop.model;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MusicPlayer extends Item{

	 public MusicPlayer(String name, BigDecimal price) {
	        super(name, price);
	    }
}
