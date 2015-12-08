// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.go.weatherex.messagecenter:
//            b, a, d

class g extends AsyncQueryHandler
{

    final b a;

    public g(b b1, ContentResolver contentresolver)
    {
        a = b1;
        super(contentresolver);
    }

    protected void onDeleteComplete(int i, Object obj, int j)
    {
        super.onDeleteComplete(i, obj, j);
        if (j > 0)
        {
            obj = new ArrayList();
            Iterator iterator = b.a(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                a a1 = (a)iterator.next();
                if (a1.a())
                {
                    ((ArrayList) (obj)).add(a1);
                }
            } while (true);
            if (!((ArrayList) (obj)).isEmpty())
            {
                b.a(a).removeAll(((java.util.Collection) (obj)));
            }
            b.c(a).notifyDataSetChanged();
        }
    }
}
