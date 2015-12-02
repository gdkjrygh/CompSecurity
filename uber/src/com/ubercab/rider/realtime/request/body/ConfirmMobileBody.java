// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ConfirmMobileBody

public abstract class ConfirmMobileBody
{

    public ConfirmMobileBody()
    {
    }

    public static ConfirmMobileBody create()
    {
        return new Shape_ConfirmMobileBody();
    }

    public abstract String getMobileToken();

    public abstract String getStrategy();

    public abstract ConfirmMobileBody setMobileToken(String s);

    public abstract ConfirmMobileBody setStrategy(String s);
}
