// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;

public class eqq extends hpb
{

    final AddAlipayActivity b;

    private eqq(AddAlipayActivity addalipayactivity)
    {
        b = addalipayactivity;
        super();
    }

    public eqq(AddAlipayActivity addalipayactivity, byte byte0)
    {
        this(addalipayactivity);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        AddAlipayActivity.a(b);
    }
}
