// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            c

public final class k
{

    private final Bundle a;
    private List b;

    private k(Bundle bundle, List list)
    {
        a = bundle;
        b = list;
    }

    k(Bundle bundle, List list, byte byte0)
    {
        this(bundle, list);
    }

    public static k a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new k(bundle, null);
        } else
        {
            return null;
        }
    }

    private void d()
    {
        if (b == null)
        {
            ArrayList arraylist = a.getParcelableArrayList("routes");
            if (arraylist == null || arraylist.isEmpty())
            {
                b = Collections.emptyList();
            } else
            {
                int j = arraylist.size();
                b = new ArrayList(j);
                int i = 0;
                while (i < j) 
                {
                    b.add(android.support.v7.media.c.a((Bundle)arraylist.get(i)));
                    i++;
                }
            }
        }
    }

    public final List a()
    {
        d();
        return b;
    }

    public final boolean b()
    {
        d();
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            c c1 = (c)b.get(i);
            if (c1 == null || !c1.n())
            {
                return false;
            }
        }

        return true;
    }

    public final Bundle c()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteProviderDescriptor{ ");
        stringbuilder.append("routes=").append(Arrays.toString(a().toArray()));
        stringbuilder.append(", isValid=").append(b());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
