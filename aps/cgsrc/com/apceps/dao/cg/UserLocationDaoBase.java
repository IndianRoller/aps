package com.apceps.dao.cg;

import com.apceps.domain.UserLocation;
import java.util.List;

public interface UserLocationDaoBase {

	public UserLocation loadUserLocationByUserlocId(Long userlocId) throws Exception;

	public void deleteUserLocationByUserlocId(Long userlocId) throws Exception;

	public List<UserLocation> loadUserLocationByUserId(Long userId) throws Exception;

	public void deleteUserLocationByUserId(Long userId) throws Exception;

	public List<UserLocation> loadUserLocationByLocationId(Long locationId) throws Exception;

	public void deleteUserLocationByLocationId(Long locationId) throws Exception;

	public List<UserLocation> loadAllUserLocations() throws Exception;

	public Long addUserLocation(UserLocation userLocation) throws Exception;

	public void updateUserLocation(UserLocation userLocation) throws Exception;

}