/**
 * 
 */
package com.profile.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.entity.Profile;
import com.profile.repository.ProfileRepository;
import com.profile.service.ProfileService;

/**
 * @author Harish
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	ProfileRepository profileRepository;
	public Profile saveOrUpdate(Profile profile) {
		return profileRepository.save(profile);
		
	}
}
