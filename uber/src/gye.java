// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.vendor.cash.CashSelectPaymentActivity;

public final class gye
    implements gya
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hsr d;

    private gye(gyf gyf1)
    {
        if (!a && gyf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gyf1);
            return;
        }
    }

    gye(gyf gyf1, byte byte0)
    {
        this(gyf1);
    }

    public static gyf a()
    {
        return new gyf((byte)0);
    }

    private void a(gyf gyf1)
    {
        b = new _cls1(gyf1);
        c = new _cls2(gyf1);
        d = gyb.a(hsu.a(), b, c);
    }

    public final void a(CashSelectPaymentActivity cashselectpaymentactivity)
    {
        d.injectMembers(cashselectpaymentactivity);
    }

    static 
    {
        boolean flag;
        if (!gye.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
