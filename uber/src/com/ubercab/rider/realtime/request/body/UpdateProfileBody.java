// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UpdateProfileBody, UserUuidAndProfileBody

public abstract class UpdateProfileBody
{

    public UpdateProfileBody()
    {
    }

    public static UpdateProfileBody create()
    {
        return new Shape_UpdateProfileBody();
    }

    public abstract UserUuidAndProfileBody getRequest();

    public abstract UpdateProfileBody setRequest(UserUuidAndProfileBody useruuidandprofilebody);
}
