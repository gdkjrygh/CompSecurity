// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v7.media:
//            c, k

public final class l
{

    private final Bundle a = new Bundle();
    private ArrayList b;

    public l()
    {
    }

    public final k a()
    {
        if (b != null)
        {
            int j = b.size();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                arraylist.add(((c)b.get(i)).o());
            }

            a.putParcelableArrayList("routes", arraylist);
        }
        return new k(a, b, (byte)0);
    }

    public final l a(c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        if (b == null)
        {
            b = new ArrayList();
        } else
        if (b.contains(c1))
        {
            throw new IllegalArgumentException("route descriptor already added");
        }
        b.add(c1);
        return this;
    }

    public final l a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("routes must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((c)collection.next())) { }
        }
        return this;
    }
}
