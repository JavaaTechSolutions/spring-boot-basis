package com.jts.spring_boot_basic.api.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressVersioningController {

	// http://localhost:8080/v1/address
	@GetMapping("v1/address")
	public AddressV1 addressV1() {
		return new AddressV1("India Mumbai");
	}

	// http://localhost:8080/v1/address
	@GetMapping("v2/address")
	public AddressV2 addressV2() {
		return new AddressV2(new Address("India", "Mumbai"));
	}

	@GetMapping(value = "/address/param", params = "version=1")
	public AddressV1 paramV1() {
		return new AddressV1("India Mumbai");
	}

	@GetMapping(value = "/address/param", params = "version=2")
	public AddressV2 paramV2() {
		return new AddressV2(new Address("India", "Mumbai"));
	}
	
	@GetMapping(value = "/address/header", headers = "version=1")
	public AddressV1 headerV1() {
		return new AddressV1("India Mumbai");
	}
	
	@GetMapping(value = "/address/header", headers = "version=2")
	public AddressV2 headerV2() {
		return new AddressV2(new Address("India", "Mumbai"));
	}
	
	@GetMapping(value = "/address/produces", produces = "application/v1+json")
    public AddressV1 producesV1() {
        return new AddressV1("India Mumbai");
    }
	
	@GetMapping(value = "/address/produces", produces = "application/v2+json")
    public AddressV2 producesV2() {
		return new AddressV2(new Address("India", "Mumbai"));
    }

}
