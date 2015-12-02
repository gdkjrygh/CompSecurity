// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UpdatePasswordBody

public abstract class UpdatePasswordBody
{

    public UpdatePasswordBody()
    {
    }

    public static UpdatePasswordBody create()
    {
        return new Shape_UpdatePasswordBody();
    }

    public abstract String getEmailToken();

    public abstract String getPassword();

    public abstract UpdatePasswordBody setEmailToken(String s);

    public abstract UpdatePasswordBody setPassword(String s);
}
