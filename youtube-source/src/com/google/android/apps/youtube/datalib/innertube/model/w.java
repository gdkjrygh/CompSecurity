// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ai;
import com.google.a.a.a.a.lv;
import com.google.a.a.a.a.mw;
import com.google.android.apps.youtube.common.fromguava.c;

public final class w
{

    private final mw a;
    private final int b;
    private final boolean c;
    private final boolean d;

    public w(mw mw1, boolean flag)
    {
        a = (mw)com.google.android.apps.youtube.common.fromguava.c.a(mw1);
        b = mw1.b;
        if (flag)
        {
            if (b == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = mw1.f;
        }
        d = flag;
        c = mw1.e;
    }

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return a.c;
    }

    public final boolean c()
    {
        return b == 0;
    }

    public final boolean d()
    {
        return b == 0 || b == 3 || b == 4 || b == 5;
    }

    public final boolean e()
    {
        return b == 3;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (w)obj;
            if (a == null && ((w) (obj)).a != null)
            {
                return false;
            }
            if (b != ((w) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        return b == 4;
    }

    public final boolean g()
    {
        return b == 5;
    }

    public final boolean h()
    {
        return c;
    }

    public final int hashCode()
    {
        return b + 31;
    }

    public final ai i()
    {
        if (c)
        {
            return null;
        } else
        {
            return a.g;
        }
    }

    public final boolean j()
    {
        return d;
    }

    public final lv k()
    {
        if (d)
        {
            return null;
        } else
        {
            return a.h;
        }
    }
}
