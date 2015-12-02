// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoController;

public final class fbh
    implements fbj
{

    static final boolean a;
    private hzb b;
    private hsr c;

    private fbh(fbi fbi1)
    {
        if (!a && fbi1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(fbi1);
            return;
        }
    }

    fbh(fbi fbi1, byte byte0)
    {
        this(fbi1);
    }

    public static fbi a()
    {
        return new fbi((byte)0);
    }

    private void a(fbi fbi1)
    {
        b = fbl.a(fbi.a(fbi1));
        c = fbs.a(hsu.a(), b, fbu.b());
    }

    public final void a(PromoController promocontroller)
    {
        c.injectMembers(promocontroller);
    }

    static 
    {
        boolean flag;
        if (!fbh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
