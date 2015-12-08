// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.c;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import com.gau.go.a.a.c;
import com.gau.go.a.f.e;
import com.gau.go.launcherex.gowidget.weatherwidget.StaticDataContentProvider;

// Referenced classes of package com.gau.go.a.c:
//            h, a

class i
    implements Runnable
{

    final c a;
    final h b;

    i(h h1, c c1)
    {
        b = h1;
        a = c1;
        super();
    }

    public void run()
    {
        ContentResolver contentresolver = h.a(b).getContentResolver();
        if (contentresolver.insert(StaticDataContentProvider.a, a.a()) != null)
        {
            a.a(true);
        }
        e.a((new StringBuilder()).append("Insert static Data to DB:").append(a.a().get(a.i)).toString());
_L1:
        return;
        Exception exception;
        exception;
        try
        {
            h.a(b, true);
            if (h.b(b).a(a.a, a.a()) != -1L)
            {
                a.a(true);
                return;
            }
        }
        catch (Exception exception1)
        {
            e.a(exception1);
            return;
        }
          goto _L1
    }
}
