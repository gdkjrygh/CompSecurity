// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.model.y;
import com.jiubang.core.c.j;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            m, o

class q extends j
{

    final m a;

    public q(m m1, ContentResolver contentresolver, Context context)
    {
        a = m1;
        super(contentresolver);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        super.a(i, obj, cursor);
        if (cursor != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            break;
        }
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        cursor.moveToFirst();
        boolean flag;
        do
        {
            m.f(a).a(Long.valueOf(cursor.getString(0)).longValue());
            flag = cursor.moveToNext();
        } while (flag);
_L4:
        cursor.close();
        if (m.g(a) == null)
        {
            m.a(a, new o(a, null));
            m.g(a).execute(new Void[0]);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L4
        obj;
        cursor.close();
        throw obj;
    }
}
