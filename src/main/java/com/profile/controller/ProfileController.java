/**
 * 
 */
package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.profile.entity.Profile;
import com.profile.service.ProfileService;

/**
 * @author
 *
 */

@Controller
public class ProfileController {
	@Autowired  
	ProfileService profileService;  
	
	@PostMapping("/profile")
	private int saveProfile(@RequestBody Profile profile) {
		profileService.saveOrUpdate(profile);
		return profile.getId();
	}
}
