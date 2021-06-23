package com.tms.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.booking.service.TmsBookingService;

@RestController
@RequestMapping("/api/v1.0/booking")
public class TmsBookingController {
	
	@Autowired
	private TmsBookingService tmsBookingService;
	
	@PostMapping("getById")
	public String getBookingById() {		
		return tmsBookingService.getBookingById();
	}

}
