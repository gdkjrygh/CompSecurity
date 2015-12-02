// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UserUuidBody

public abstract class UserUuidBody
{

    public UserUuidBody()
    {
    }

    public static UserUuidBody create()
    {
        return new Shape_UserUuidBody();
    }

    public abstract String getUserUuid();

    public abstract UserUuidBody setUserUuid(String s);
}
