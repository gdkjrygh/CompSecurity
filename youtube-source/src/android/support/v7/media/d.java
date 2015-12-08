// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            c

public final class d
{

    private final Bundle a;
    private ArrayList b;

    public d(c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        a = new Bundle(android.support.v7.media.c.a(c1));
        android.support.v7.media.c.b(c1);
        if (!android.support.v7.media.c.c(c1).isEmpty())
        {
            b = new ArrayList(android.support.v7.media.c.c(c1));
        }
    }

    public d(String s, String s1)
    {
        a = new Bundle();
        a.putString("id", s);
        a.putString("name", s1);
    }

    public final c a()
    {
        if (b != null)
        {
            a.putParcelableArrayList("controlFilters", b);
        }
        return new c(a, b, (byte)0);
    }

    public final d a(int i)
    {
        a.putInt("playbackType", i);
        return this;
    }

    public final d a(IntentFilter intentfilter)
    {
        if (intentfilter == null)
        {
            throw new IllegalArgumentException("filter must not be null");
        }
        if (b == null)
        {
            b = new ArrayList();
        }
        if (!b.contains(intentfilter))
        {
            b.add(intentfilter);
        }
        return this;
    }

    public final d a(Bundle bundle)
    {
        a.putBundle("extras", bundle);
        return this;
    }

    public final d a(String s)
    {
        a.putString("status", s);
        return this;
    }

    public final d a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((IntentFilter)collection.next())) { }
        }
        return this;
    }

    public final d a(boolean flag)
    {
        a.putBoolean("enabled", flag);
        return this;
    }

    public final d b(int i)
    {
        a.putInt("playbackStream", i);
        return this;
    }

    public final d b(boolean flag)
    {
        a.putBoolean("connecting", true);
        return this;
    }

    public final d c(int i)
    {
        a.putInt("volume", i);
        return this;
    }

    public final d d(int i)
    {
        a.putInt("volumeMax", i);
        return this;
    }

    public final d e(int i)
    {
        a.putInt("volumeHandling", i);
        return this;
    }

    public final d f(int i)
    {
        a.putInt("presentationDisplayId", i);
        return this;
    }
}
