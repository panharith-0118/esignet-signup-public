package io.mosip.signup.services;

import io.mosip.signup.api.dto.ProfileDto;
import io.mosip.signup.api.dto.ProfileResult;
import io.mosip.signup.api.exception.InvalidProfileException;
import io.mosip.signup.api.exception.ProfileException;
import io.mosip.signup.api.spi.ProfileRegistryPlugin;

public class ProfileRegistryPluginImpl implements ProfileRegistryPlugin {


    @Override
    public void validate(String action, ProfileDto profileDto) throws InvalidProfileException {

    }

    @Override
    public ProfileResult createProfile(String requestId, ProfileDto profileDto) throws ProfileException {
        return null;
    }

    @Override
    public ProfileResult updateProfile(String requestId, ProfileDto profileDto) throws ProfileException {
        return null;
    }

    @Override
    public ProfileResult getProfileStatus(String requestId, String individualId) throws ProfileException {
        return null;
    }

    @Override
    public ProfileDto getProfile(String individualId) throws ProfileException {
        return null;
    }

}
