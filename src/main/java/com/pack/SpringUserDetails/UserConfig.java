package com.pack.SpringUserDetails;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Configuration
@PropertySource("file:\\C:\\user_properties\\user.properties")
@ConfigurationProperties(prefix="user")
@Data //GetSet
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserConfig {
	private String fname;
	private String lname;
	private Integer age;
	private String gender;
	private String city;	
}

