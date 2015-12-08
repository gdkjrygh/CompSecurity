// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            i

class k extends AsyncQueryHandler
{

    private SoftReference a;

    public k(ContentResolver contentresolver, i j)
    {
        super(contentresolver);
        a = new SoftReference(j);
    }

    protected void onQueryComplete(int j, Object obj, Cursor cursor)
    {
        if (cursor == null || a == null) goto _L2; else goto _L1
_L1:
        obj = (i)a.get();
        if (obj != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        j;
        JVM INSTR tableswitch 1 5: default 64
    //                   1 79
    //                   2 91
    //                   3 117
    //                   4 125
    //                   5 133;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_133;
_L4:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L11:
        if (j != 1 && j != 5)
        {
            i.g(((i) (obj)));
            return;
        }
        if (true) goto _L2; else goto _L10
_L10:
        i.a(((i) (obj)), cursor);
        i.h(((i) (obj)));
          goto _L11
_L6:
        i.b(((i) (obj)), cursor);
        i.a(((i) (obj)), false);
        if (!((i) (obj)).a)
        {
            obj.a = true;
        }
          goto _L11
_L7:
        i.c(((i) (obj)), cursor);
          goto _L11
_L8:
        i.d(((i) (obj)), cursor);
          goto _L11
        i.e(((i) (obj)), cursor);
        i.h(((i) (obj)));
          goto _L11
    }
}
