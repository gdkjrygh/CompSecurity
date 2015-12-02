// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Handler;
import com.whatsapp.App;
import com.whatsapp.aoz;
import com.whatsapp.k;
import com.whatsapp.og;
import com.whatsapp.u5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.whatsapp.appwidget:
//            WidgetProvider, f, h

class b
    implements Runnable
{

    private final Context a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final int c[];
    private final AppWidgetManager d;

    b(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        a = context;
        d = appwidgetmanager;
        c = ai;
    }

    static AppWidgetManager a(b b1)
    {
        return b1.d;
    }

    private ArrayList b()
    {
        int i = WidgetProvider.d;
        if (c())
        {
            return null;
        }
        Object obj = u5.d();
        ArrayList arraylist = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (String)((Iterator) (obj)).next();
            if (c())
            {
                return null;
            }
            og og1 = App.az.e(((String) (obj1)));
            if (og1.c > 0)
            {
                obj1 = App.ah.a(((String) (obj1)), Math.min(og1.c, 100));
                if (obj1 != null)
                {
                    arraylist.addAll(((java.util.Collection) (obj1)));
                }
            }
        } while (i == 0);
        Collections.sort(arraylist, new f(this));
        return arraylist;
    }

    static int[] b(b b1)
    {
        return b1.c;
    }

    static Context c(b b1)
    {
        return b1.a;
    }

    private boolean c()
    {
        return b.get();
    }

    public void a()
    {
        b.set(true);
    }

    public void run()
    {
        ArrayList arraylist = b();
        if (arraylist != null)
        {
            App.au.ab().post(new h(this, arraylist));
        }
    }
}
