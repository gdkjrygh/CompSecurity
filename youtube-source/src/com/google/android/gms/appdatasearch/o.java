// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            SuggestionResults, n

public final class o
    implements Iterator
{

    final SuggestionResults a;
    private int b;

    public o(SuggestionResults suggestionresults)
    {
        a = suggestionresults;
        super();
        b = 0;
    }

    public final boolean hasNext()
    {
        return b < a.la.length;
    }

    public final Object next()
    {
        SuggestionResults suggestionresults = a;
        int i = b;
        b = i + 1;
        return new n(suggestionresults, i);
    }

    public final void remove()
    {
        throw new IllegalStateException("remove not supported");
    }
}
