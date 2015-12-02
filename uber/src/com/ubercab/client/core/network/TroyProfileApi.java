// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.ProfilesRequest;
import com.ubercab.client.core.model.UpdateProfileRequest;
import retrofit.Callback;

public interface TroyProfileApi
{

    public abstract void getProfiles(ProfilesRequest profilesrequest, Callback callback);

    public abstract void getProfilesThemeOptions(ProfilesRequest profilesrequest, Callback callback);

    public abstract void updateProfile(UpdateProfileRequest updateprofilerequest, Callback callback);
}
