// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UserUuidAndProfileBody

public abstract class UserUuidAndProfileBody
{

    public UserUuidAndProfileBody()
    {
    }

    public static UserUuidAndProfileBody create()
    {
        return new Shape_UserUuidAndProfileBody();
    }

    public abstract Profile getProfile();

    public abstract String getUserUuid();

    public abstract UserUuidAndProfileBody setProfile(Profile profile);

    public abstract UserUuidAndProfileBody setUserUuid(String s);
}
