// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UserUuidAndProfile

public abstract class UserUuidAndProfile
{

    public UserUuidAndProfile()
    {
    }

    public static UserUuidAndProfile create(String s, Profile profile)
    {
        return (new Shape_UserUuidAndProfile()).setUserUuid(s).setProfile(profile);
    }

    public abstract Profile getProfile();

    public abstract String getUserUuid();

    abstract UserUuidAndProfile setProfile(Profile profile);

    abstract UserUuidAndProfile setUserUuid(String s);
}
