// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body.payment;


// Referenced classes of package com.ubercab.rider.realtime.request.body.payment:
//            TokenData, Shape_TokenDataPayPal

public abstract class TokenDataPayPal
    implements TokenData
{

    public TokenDataPayPal()
    {
    }

    public static TokenDataPayPal create(String s, String s1)
    {
        return (new Shape_TokenDataPayPal()).setAuthorizationToken(s).setApplicationCorrelationId(s1);
    }

    public abstract String getApplicationCorrelationId();

    public abstract String getAuthorizationToken();

    abstract TokenDataPayPal setApplicationCorrelationId(String s);

    abstract TokenDataPayPal setAuthorizationToken(String s);
}
