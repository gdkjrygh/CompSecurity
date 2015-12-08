// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import com.google.android.exoplayer.e.a;

public final class j
{

    public final Uri a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public j(Uri uri, long l, long l1, String s)
    {
        this(uri, l, l1, s, l, true);
    }

    public j(Uri uri, long l, long l1, String s, long l2)
    {
        this(uri, l, l1, s, l2, false);
    }

    private j(Uri uri, long l, long l1, String s, long l2, boolean flag)
    {
label0:
        {
            boolean flag2 = false;
            super();
            boolean flag1;
            if (l >= 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.exoplayer.e.a.a(flag1);
            if (l2 >= 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.exoplayer.e.a.a(flag1);
            if (l1 > 0L || l1 == -1L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.exoplayer.e.a.a(flag1);
            if (l != l2)
            {
                flag1 = flag2;
                if (flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        com.google.android.exoplayer.e.a.a(flag1);
        a = uri;
        b = flag;
        c = l;
        d = l2;
        e = l1;
        f = s;
    }

    public final String toString()
    {
        return (new StringBuilder("DataSpec[")).append(a).append(", ").append(b).append(", ").append(c).append(", ").append(d).append(", ").append(e).append(", ").append(f).append("]").toString();
    }
}
