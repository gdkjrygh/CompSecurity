// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.paypal.android.sdk.payments.PayPalConfiguration;

public final class eqi
    implements hst
{

    static final boolean a;
    private final eqg b;
    private final hzb c;
    private final hzb d;

    private eqi(eqg eqg1, hzb hzb1, hzb hzb2)
    {
        if (!a && eqg1 == null)
        {
            throw new AssertionError();
        }
        b = eqg1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(eqg eqg1, hzb hzb1, hzb hzb2)
    {
        return new eqi(eqg1, hzb1, hzb2);
    }

    private PayPalConfiguration b()
    {
        PayPalConfiguration paypalconfiguration = eqg.b((czf)c.a(), (Application)d.a());
        if (paypalconfiguration == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return paypalconfiguration;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!eqi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
