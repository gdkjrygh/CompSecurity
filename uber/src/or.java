// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

public final class or
{

    private final os a;
    private final Runnable b;
    private AdRequestParcel c;
    private boolean d;
    private boolean e;
    private long f;

    public or(oh oh)
    {
        this(oh, new os(ajc.a));
    }

    private or(oh oh, os os1)
    {
        d = false;
        e = false;
        f = 0L;
        a = os1;
        b = new _cls1(new WeakReference(oh));
    }

    static boolean a(or or1)
    {
        or1.d = false;
        return false;
    }

    static AdRequestParcel b(or or1)
    {
        return or1.c;
    }

    public final void a()
    {
        d = false;
        a.a(b);
    }

    public final void a(AdRequestParcel adrequestparcel)
    {
        a(adrequestparcel, 60000L);
    }

    public final void a(AdRequestParcel adrequestparcel, long l)
    {
        if (d)
        {
            of.e("An ad refresh is already scheduled.");
        } else
        {
            c = adrequestparcel;
            d = true;
            f = l;
            if (!e)
            {
                of.c((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
                a.a(b, l);
                return;
            }
        }
    }

    public final void b()
    {
        e = true;
        if (d)
        {
            a.a(b);
        }
    }

    public final void c()
    {
        e = false;
        if (d)
        {
            d = false;
            a(c, f);
        }
    }

    public final boolean d()
    {
        return d;
    }

    /* member class not found */
    class _cls1 {}

}
