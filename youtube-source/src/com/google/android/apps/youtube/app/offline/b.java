// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.exoplayer.upstream.cache.a;
import com.google.android.exoplayer.upstream.cache.d;
import java.util.Iterator;
import java.util.Set;

public final class b
{

    private final a a[];

    public transient b(a aa[])
    {
        a = (a[])c.a(aa);
    }

    private void b(String s)
    {
        a aa[] = a;
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            a a1 = aa[i];
            if (a1 == null)
            {
                continue;
            }
            Object obj = a1.a(s);
            if (obj == null)
            {
                continue;
            }
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a1.b((d)((Iterator) (obj)).next())) { }
        }

    }

    public final void a(String s)
    {
        c.a(s);
        a aa[] = a;
        int j = aa.length;
label0:
        for (int i = 0; i < j; i++)
        {
            Object obj = aa[i];
            if (obj == null)
            {
                continue;
            }
            Object obj1 = ((a) (obj)).a();
            obj = (new StringBuilder()).append(s).append(".").toString();
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                String s1;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label0;
                    }
                    s1 = (String)((Iterator) (obj1)).next();
                } while (!s1.startsWith(((String) (obj))));
                b(s1);
            } while (true);
        }

    }
}
