// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ForgotPasswordBody

public abstract class ForgotPasswordBody
{

    public ForgotPasswordBody()
    {
    }

    public static ForgotPasswordBody create()
    {
        return new Shape_ForgotPasswordBody();
    }

    public abstract String getLogin();

    public abstract ForgotPasswordBody setLogin(String s);
}
