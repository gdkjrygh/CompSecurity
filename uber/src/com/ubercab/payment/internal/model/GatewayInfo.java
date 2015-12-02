// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.model:
//            Shape_GatewayInfo

public abstract class GatewayInfo
    implements Parcelable
{

    public GatewayInfo()
    {
    }

    public static GatewayInfo create(String s)
    {
        return (new Shape_GatewayInfo()).setCardCode(s);
    }

    public static GatewayInfo create(String s, String s1, String s2, String s3)
    {
        return (new Shape_GatewayInfo()).setCardCode(s).setCardNumber(s1).setCardExpirationMonth(s2).setCardExpirationYear(s3);
    }

    public abstract String getCardCode();

    public abstract String getCardExpirationMonth();

    public abstract String getCardExpirationYear();

    public abstract String getCardNumber();

    public abstract GatewayInfo setCardCode(String s);

    public abstract GatewayInfo setCardExpirationMonth(String s);

    public abstract GatewayInfo setCardExpirationYear(String s);

    public abstract GatewayInfo setCardNumber(String s);
}
