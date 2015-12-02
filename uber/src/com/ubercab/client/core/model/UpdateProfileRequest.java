// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpdateProfileRequest, UserUuidAndProfile

public abstract class UpdateProfileRequest
{

    public UpdateProfileRequest()
    {
    }

    public static UpdateProfileRequest create(String s, Profile profile)
    {
        return (new Shape_UpdateProfileRequest()).setRequest(UserUuidAndProfile.create(s, profile));
    }

    public abstract UserUuidAndProfile getRequest();

    abstract UpdateProfileRequest setRequest(UserUuidAndProfile useruuidandprofile);
}
