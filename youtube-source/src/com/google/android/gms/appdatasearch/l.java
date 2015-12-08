// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            SearchResults, k

public class l
    implements Iterator
{

    protected int a;
    final SearchResults b;
    private final Map c[];

    l(SearchResults searchresults)
    {
        b = searchresults;
        super();
        if (searchresults.hasError())
        {
            searchresults = null;
        } else
        {
            searchresults = new Map[searchresults.kR.length];
        }
        c = searchresults;
    }

    protected void a()
    {
        a = a + 1;
    }

    public boolean hasNext()
    {
        return !b.hasError() && a < b.getNumResults();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException("No more results.");
        } else
        {
            k k1 = new k(b, a, this);
            a();
            return k1;
        }
    }

    public void remove()
    {
        throw new IllegalStateException("remove not supported");
    }
}
