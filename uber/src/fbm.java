// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class fbm
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();

    public fbm()
    {
    }

    public final int a()
    {
        return a.size() + b.size();
    }

    public final Object a(int i)
    {
        int j = a.size();
        if (i < j)
        {
            return a.get(j - 1 - i);
        } else
        {
            return b.get(i - j);
        }
    }

    public final void a(Object obj)
    {
        a.add(obj);
    }

    public final void a(Collection collection)
    {
        if (collection != null)
        {
            b.addAll(collection);
        }
    }
}
