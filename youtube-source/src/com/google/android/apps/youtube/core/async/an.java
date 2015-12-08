// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, ap, Timestamped, ao, 
//            NotFoundException

public abstract class an
    implements af
{

    private final a a;
    private final af b;
    private final b c;
    private final long d;

    protected an(a a1, af af1, b b1, long l)
    {
        a = a1;
        b = af1;
        c = b1;
        d = l;
    }

    static b a(an an1)
    {
        return an1.c;
    }

    public static an a(a a1, af af1, b b1, long l)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        com.google.android.apps.youtube.common.fromguava.c.a(af1);
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        boolean flag;
        if (l >= 0L && l <= 0x9a7ec800L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "time to live must be >=0 and <= 2592000000");
        return new ap(a1, af1, b1, l);
    }

    static a b(an an1)
    {
        return an1.a;
    }

    protected abstract Object a(Object obj);

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        if (d > 0L)
        {
            Timestamped timestamped = (Timestamped)a.a(a(obj));
            long l = c.a();
            if (timestamped != null && l >= timestamped.timestamp && timestamped.timestamp + d >= l)
            {
                b1.a(obj, timestamped.element);
                return;
            }
        }
        if (b != null)
        {
            b.a(obj, new ao(this, b1));
            return;
        } else
        {
            b1.a(obj, new NotFoundException());
            return;
        }
    }
}
