// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            g

class f
{

    static final f a = new g("unused", null);
    private volatile int b;
    private final String c;
    private final String d;

    f(String s, String s1)
    {
        c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        d = s1;
    }

    String a()
    {
        return d;
    }

    String b()
    {
        return c;
    }

    final f c()
    {
        return new f(b(), null);
    }

    final boolean d()
    {
        return d != null;
    }

    public final String e()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b());
        if (d())
        {
            stringbuilder.append(":").append(a());
        }
        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof f))
            {
                return false;
            }
            obj = (f)obj;
            if (!com.google.android.apps.youtube.common.fromguava.b.a(d, ((f) (obj)).d) || !c.equals(((f) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            if (d == null)
            {
                i = 0;
            } else
            {
                i = d.hashCode();
            }
            i = (i + 527) * 31 + c.hashCode();
            b = i;
        }
        return i;
    }

    public String toString()
    {
        return String.format("Identity{gaiaId='%s' managingAccountName='%s'}", new Object[] {
            d, c
        });
    }

}
