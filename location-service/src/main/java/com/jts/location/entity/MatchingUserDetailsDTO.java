package com.jts.location.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchingUserDetailsDTO implements Serializable {

	private static final long serialVersionUID = 3937414011943770889L;

	private String displayName;

	private String distance;

}
