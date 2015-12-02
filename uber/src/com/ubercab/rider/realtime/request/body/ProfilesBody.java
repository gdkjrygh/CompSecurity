// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ProfilesBody, UserUuidBody

public abstract class ProfilesBody
{

    public ProfilesBody()
    {
    }

    public static ProfilesBody create()
    {
        return new Shape_ProfilesBody();
    }

    public abstract UserUuidBody getRequest();

    public abstract ProfilesBody setRequest(UserUuidBody useruuidbody);
}
