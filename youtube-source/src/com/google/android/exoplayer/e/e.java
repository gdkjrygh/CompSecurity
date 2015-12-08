// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.e:
//            f, g, h

public final class e
{

    private static final Comparator a = new f();
    private static final Comparator b = new g();
    private final int c;
    private final ArrayList d = new ArrayList();
    private final h e[] = new h[5];
    private int f;
    private int g;
    private int h;
    private int i;

    public e(int j)
    {
        c = j;
        f = -1;
    }

    public final float a(float f1)
    {
        if (f != 0)
        {
            Collections.sort(d, b);
            f = 0;
        }
        f1 = h;
        int j = 0;
        int k = 0;
        for (; j < d.size(); j++)
        {
            h h1 = (h)d.get(j);
            k += h1.b;
            if ((float)k >= 0.5F * f1)
            {
                return h1.c;
            }
        }

        if (d.isEmpty())
        {
            return (0.0F / 0.0F);
        } else
        {
            return ((h)d.get(d.size() - 1)).c;
        }
    }

    public final void a(int j, float f1)
    {
        if (f != 1)
        {
            Collections.sort(d, a);
            f = 1;
        }
        h h1;
        int l;
        if (i > 0)
        {
            h ah[] = e;
            int k = i - 1;
            i = k;
            h1 = ah[k];
        } else
        {
            h1 = new h((byte)0);
        }
        l = g;
        g = l + 1;
        h1.a = l;
        h1.b = j;
        h1.c = f1;
        d.add(h1);
        h = h + j;
        do
        {
            if (h <= c)
            {
                break;
            }
            j = h - c;
            h1 = (h)d.get(0);
            if (h1.b <= j)
            {
                h = h - h1.b;
                d.remove(0);
                if (i < 5)
                {
                    h ah1[] = e;
                    j = i;
                    i = j + 1;
                    ah1[j] = h1;
                }
            } else
            {
                h1.b = h1.b - j;
                h = h - j;
            }
        } while (true);
    }

}
