// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpdateProfileResponse

public abstract class UpdateProfileResponse
{

    public UpdateProfileResponse()
    {
    }

    public static UpdateProfileResponse create(Profile profile)
    {
        return (new Shape_UpdateProfileResponse()).setProfile(profile);
    }

    public abstract Profile getProfile();

    abstract UpdateProfileResponse setProfile(Profile profile);
}
