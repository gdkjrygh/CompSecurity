// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.network.AlipayApi;
import com.ubercab.client.core.vendor.alipay.AlipayAuthorizationActivity;

public final class dvh
{

    private final AlipayAuthorizationActivity a;

    public dvh(AlipayAuthorizationActivity alipayauthorizationactivity)
    {
        a = alipayauthorizationactivity;
    }

    static AlipayApi a(grs grs1)
    {
        return (AlipayApi)grs1.a(com/ubercab/client/core/network/AlipayApi);
    }

    static djy a(cev cev, AlipayApi alipayapi)
    {
        return new djy(cev, alipayapi);
    }

    final iu a()
    {
        return new iu(a);
    }
}
