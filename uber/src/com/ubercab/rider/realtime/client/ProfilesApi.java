// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.OnBoardUserBody;
import com.ubercab.rider.realtime.request.body.ProfilesBody;
import com.ubercab.rider.realtime.request.body.UpdateProfileBody;
import ica;

public interface ProfilesApi
{

    public abstract ica postOnBoardUser(OnBoardUserBody onboarduserbody);

    public abstract ica postProfiles(ProfilesBody profilesbody);

    public abstract ica postProfilesThemeOptions(ProfilesBody profilesbody);

    public abstract ica postUpdateProfile(UpdateProfileBody updateprofilebody);
}
