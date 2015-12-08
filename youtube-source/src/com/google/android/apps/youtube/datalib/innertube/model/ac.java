// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ol;
import com.google.a.a.a.a.om;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ad

public final class ac
{

    private final ol a;
    private final List b = new ArrayList();
    private final int c;
    private final byte d[];

    public ac(ol ol1, byte abyte0[])
    {
        a = (ol)com.google.android.apps.youtube.common.fromguava.c.a(ol1);
        d = (byte[])com.google.android.apps.youtube.common.fromguava.c.a(abyte0);
        c = ol1.c.length;
        int j = 0;
        while (j < c) 
        {
            abyte0 = ol1.c[j].b;
            if (abyte0 != null)
            {
                boolean flag = ol1.h;
                int k = c;
                float f1;
                if (flag)
                {
                    f1 = Math.max(Math.min(1.0F, (float)(k - j) / 5F), 0.0F);
                } else
                {
                    f1 = 1.0F;
                }
                abyte0 = new ad(abyte0, f1, ol1.e);
                b.add(abyte0);
            }
            j++;
        }
    }

    public final List a()
    {
        return b;
    }

    public final String b()
    {
        return a.e;
    }

    public final int c()
    {
        if (a.d != 0)
        {
            return a.d;
        } else
        {
            return -1;
        }
    }

    public final String d()
    {
        return a.b;
    }

    public final CharSequence e()
    {
        if (a.g == null)
        {
            return null;
        } else
        {
            return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g);
        }
    }

    public final int f()
    {
        return a.f;
    }

    public final boolean g()
    {
        return a.h;
    }

    public final boolean h()
    {
        return a.i;
    }

    public final int i()
    {
        return a.j;
    }
}
