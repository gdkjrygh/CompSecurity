// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.PromoActivity;

public final class fan
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private fan(hsr hsr1, hzb hzb1)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1)
    {
        return new fan(hsr1, hzb1);
    }

    private void a(PromoActivity promoactivity)
    {
        if (promoactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(promoactivity);
            promoactivity.h = (czq)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PromoActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!fan.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
