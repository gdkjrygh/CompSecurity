// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            f, ad, u, i, 
//            k

public final class ac
{

    private final f a;
    private final ArrayList b = new ArrayList();
    private final i c;
    private k d;

    ac(f f1)
    {
        a = f1;
        c = f1.c();
    }

    static f a(ac ac1)
    {
        return ac1.a;
    }

    static ArrayList b(ac ac1)
    {
        return ac1.b;
    }

    final int a(String s)
    {
        int k = b.size();
        for (int j = 0; j < k; j++)
        {
            if (ad.a((ad)b.get(j)).equals(s))
            {
                return j;
            }
        }

        return -1;
    }

    public final f a()
    {
        u.d();
        return a;
    }

    final boolean a(k k)
    {
        if (d != k)
        {
            d = k;
            return true;
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        return c.a();
    }

    public final ComponentName c()
    {
        return c.b();
    }

    public final String toString()
    {
        return (new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=")).append(c.a()).append(" }").toString();
    }
}
