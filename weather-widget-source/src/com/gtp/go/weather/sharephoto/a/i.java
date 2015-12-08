// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.a;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gtp.go.weather.sharephoto.a:
//            g

class i extends AsyncQueryHandler
{

    private SoftReference a;

    public i(ContentResolver contentresolver, g g1)
    {
        super(contentresolver);
        a = new SoftReference(g1);
    }

    protected void onQueryComplete(int j, Object obj, Cursor cursor)
    {
label0:
        {
            if (cursor != null && a != null)
            {
                obj = (g)a.get();
                if (obj != null)
                {
                    break label0;
                }
            }
            return;
        }
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
            g.a(((g) (obj)), cursor);
            break;
        }
        g.a(((g) (obj)), false);
        g.a(((g) (obj)));
    }
}
