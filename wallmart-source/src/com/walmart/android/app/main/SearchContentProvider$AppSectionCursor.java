// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.database.MatrixCursor;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.main:
//            SearchContentProvider

public static class nName extends MatrixCursor
{

    public I(String s)
    {
        super(SearchContentProvider.access$000());
        Iterator iterator = SearchContentProvider.access$100().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            I i = (I)iterator.next();
            if (i.nName.toLowerCase(Locale.US).startsWith(s.toLowerCase(Locale.US)))
            {
                addRow(new Object[] {
                    Integer.valueOf(i.addRow), i.ceName, SearchContentProvider.access$200(), i.Data, Integer.valueOf(i.Extra), null, i.nName, null
                });
            }
        } while (true);
    }
}
