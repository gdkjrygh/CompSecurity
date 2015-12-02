// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body.payment;


// Referenced classes of package com.ubercab.rider.realtime.request.body.payment:
//            TokenData, Shape_TokenDataPaytm

public abstract class TokenDataPaytm
    implements TokenData
{

    public TokenDataPaytm()
    {
    }

    public static TokenDataPaytm create(String s, String s1)
    {
        return (new Shape_TokenDataPaytm()).setEmail(s).setMobile(s1);
    }

    public abstract String getEmail();

    public abstract String getMobile();

    abstract TokenDataPaytm setEmail(String s);

    abstract TokenDataPaytm setMobile(String s);
}
