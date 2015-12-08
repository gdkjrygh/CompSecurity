// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.cs;
import com.google.a.a.a.a.ct;
import com.google.a.a.a.a.ii;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            s, p

public abstract class b
    implements s
{

    public static final byte a[] = new byte[0];
    Map b;
    private byte c[];
    private boolean d;
    private final p e;

    public b(p p1)
    {
        d = false;
        e = p1;
    }

    public Map a()
    {
        if (b == null)
        {
            b = new HashMap();
        }
        return b;
    }

    public final void a(byte abyte0[])
    {
        com.google.android.apps.youtube.common.fromguava.c.a(abyte0);
        c = abyte0;
    }

    public final void b()
    {
        c();
        if (c == null)
        {
            throw new IllegalArgumentException("Must set clickTrackingParams.");
        } else
        {
            return;
        }
    }

    protected abstract void c();

    public final ii d()
    {
        ii ii1 = e.a();
        cs cs1 = new cs();
        cs1.b = c;
        ii1.f = cs1;
        if (d)
        {
            ii1.b.d = "OVERRIDE";
        }
        return ii1;
    }

}
