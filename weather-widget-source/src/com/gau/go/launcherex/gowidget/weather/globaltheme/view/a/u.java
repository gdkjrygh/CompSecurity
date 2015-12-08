// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.SQLException;
import com.gtp.a.a.b.c;
import com.jiubang.core.c.j;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            q

class u extends j
{

    private WeakReference a;

    public u(ContentResolver contentresolver, q q1)
    {
        super(contentresolver);
        a = new WeakReference(q1);
    }

    protected void a(int i, Object obj, Cursor cursor)
    {
        boolean flag1;
        flag1 = true;
        super.a(i, obj, cursor);
        obj = (q)a.get();
        boolean flag;
        if (obj == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (cursor == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((flag | i) != 0)
        {
            return;
        }
        if (cursor.getCount() <= 0)
        {
            flag1 = false;
        }
        q.a(((q) (obj)), flag1);
        if (!q.f(((q) (obj)))) goto _L2; else goto _L1
_L1:
        i = cursor.getColumnIndex("go_widget_type");
        if (i == -1) goto _L2; else goto _L3
_L3:
        if (!cursor.moveToFirst()) goto _L2; else goto _L4
_L4:
        cursor.getInt(i);
        JVM INSTR tableswitch 4 5: default 195
    //                   4 154
    //                   5 186;
           goto _L5 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_186;
_L8:
        flag1 = cursor.moveToNext();
        if (flag1) goto _L4; else goto _L2
_L2:
        cursor.close();
        return;
_L6:
        q.b(((q) (obj)), true);
          goto _L8
        obj;
        if (!c.a()) goto _L2; else goto _L9
_L9:
        ((SQLException) (obj)).printStackTrace();
          goto _L2
        obj;
        cursor.close();
        throw obj;
        com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.q.c(((q) (obj)), true);
          goto _L8
    }
}
