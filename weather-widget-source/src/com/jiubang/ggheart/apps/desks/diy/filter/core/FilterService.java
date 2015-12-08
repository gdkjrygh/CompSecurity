// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.apps.desks.diy.filter.core;

import android.content.Context;
import android.graphics.Bitmap;
import com.gtp.a.a.b.c;
import java.util.List;

// Referenced classes of package com.jiubang.ggheart.apps.desks.diy.filter.core:
//            FilterParameterBuidler, FilterRender, FilterParameter

public class FilterService
{

    public static final int USE_TYPE_ICON = 1;
    public static final int USE_TYPE_WALLPAPER = 0;
    private static FilterService a;
    public static boolean sLoadLibError;
    private FilterParameterBuidler b;
    private FilterRender c;
    private Context d;

    private FilterService(Context context)
    {
        d = context.getApplicationContext();
        b = new FilterParameterBuidler(context);
        c = new FilterRender(context);
    }

    private void a()
    {
        if (b != null)
        {
            b.cleanUp();
            b = null;
        }
        if (c != null)
        {
            c.cleanUp();
            c = null;
        }
    }

    public static void destroy()
    {
        com/jiubang/ggheart/apps/desks/diy/filter/core/FilterService;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.a();
            a = null;
        }
        com/jiubang/ggheart/apps/desks/diy/filter/core/FilterService;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static FilterService getService(Context context)
    {
        com/jiubang/ggheart/apps/desks/diy/filter/core/FilterService;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new FilterService(context);
        }
        context = a;
        com/jiubang/ggheart/apps/desks/diy/filter/core/FilterService;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public List getAllFilter(int i)
    {
        if (b == null)
        {
            b = new FilterParameterBuidler(d);
        }
        return b.buildParameter(i);
    }

    public Bitmap render(FilterParameter filterparameter)
    {
        if (c == null)
        {
            c = new FilterRender(d);
        }
        return c.render(filterparameter);
    }

    static 
    {
        System.loadLibrary("GOFilter");
_L1:
        return;
        Throwable throwable;
        throwable;
        sLoadLibError = true;
        if (com.gtp.a.a.b.c.a())
        {
            throwable.printStackTrace();
        }
          goto _L1
    }
}
