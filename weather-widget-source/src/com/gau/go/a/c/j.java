// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.c;

import android.content.ContentResolver;
import android.content.Context;
import com.gau.go.a.a.a;
import com.gau.go.a.f.e;
import com.gau.go.launcherex.gowidget.weatherwidget.StaticDataContentProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.a.c:
//            h, a

class j
    implements Runnable
{

    final Map a;
    final h b;

    j(h h1, Map map)
    {
        b = h1;
        a = map;
        super();
    }

    public void run()
    {
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (a)a.get(obj);
            ContentResolver contentresolver = com.gau.go.a.c.h.a(b).getContentResolver();
            try
            {
                contentresolver.insert(StaticDataContentProvider.c, ((a) (obj)).a());
            }
            catch (Exception exception1)
            {
                try
                {
                    com.gau.go.a.c.h.a(b, true);
                    h.b(b).a(a.b, ((a) (obj)).a());
                }
                catch (Exception exception)
                {
                    e.a(exception);
                }
            }
        }

    }
}
