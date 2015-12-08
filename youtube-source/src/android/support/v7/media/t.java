// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            s

public final class t
{

    private ArrayList a;

    public t()
    {
    }

    public t(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        s.b(s1);
        if (!s.c(s1).isEmpty())
        {
            a = new ArrayList(s.c(s1));
        }
    }

    private t a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((String)collection.next())) { }
        }
        return this;
    }

    public final s a()
    {
        if (a == null)
        {
            return s.a;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", a);
            return new s(bundle, a, (byte)0);
        }
    }

    public final t a(s s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            a(((Collection) (s1.a())));
            return this;
        }
    }

    public final t a(String s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        if (a == null)
        {
            a = new ArrayList();
        }
        if (!a.contains(s1))
        {
            a.add(s1);
        }
        return this;
    }
}
