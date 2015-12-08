// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            db, cv

final class dd
    implements Runnable
{

    final IBinder a;
    final IBinder b;
    final AtomicInteger c;
    final android.view.WindowManager.LayoutParams d;
    final int e;
    final int f;
    final int g;
    final boolean h;
    final Rect i;
    final Rect j;
    final Rect k;
    final Configuration l;
    final Surface m;
    final ConditionVariable n;
    final db o;

    dd(db db1, IBinder ibinder, IBinder ibinder1, AtomicInteger atomicinteger, android.view.WindowManager.LayoutParams layoutparams, int i1, int j1, 
            int k1, boolean flag, Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface, 
            ConditionVariable conditionvariable)
    {
        o = db1;
        a = ibinder;
        b = ibinder1;
        c = atomicinteger;
        d = layoutparams;
        e = i1;
        f = j1;
        g = k1;
        h = flag;
        i = rect;
        j = rect1;
        k = rect2;
        l = configuration;
        m = surface;
        n = conditionvariable;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = db.a(o).newInstance(new Object[] {
                a
            });
            Object obj1 = db.b(o).newInstance(new Object[] {
                b
            });
            c.set(((Integer)db.c(o).invoke(obj1, new Object[] {
                obj, d, Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Boolean.valueOf(h), i, j, k, l, 
                m
            })).intValue());
            cv.a(o.b, m);
            n.open();
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new IllegalStateException((new StringBuilder("Error invoking relayout method: ")).append(invocationtargetexception).toString());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new IllegalStateException((new StringBuilder("Error invoking relayout method: ")).append(illegalargumentexception).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder("Error invoking relayout method: ")).append(illegalaccessexception).toString());
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder("Error invoking relayout method: ")).append(instantiationexception).toString());
        }
    }
}
