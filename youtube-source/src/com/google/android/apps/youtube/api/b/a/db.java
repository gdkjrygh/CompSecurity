// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            cw, cv, dd, dc

final class db extends cw
{

    final cv b;
    private final Constructor c;
    private final Constructor d = Class.forName("android.view.IWindow$Stub$Proxy").getDeclaredConstructor(new Class[] {
        Class.forName("android.os.IBinder")
    });
    private final Method e;

    public db(cv cv1)
    {
        b = cv1;
        super(cv1, (byte)0);
        cv1 = Class.forName("android.view.IWindow");
        Class class1 = Class.forName("android.view.IWindowSession$Stub$Proxy");
        d.setAccessible(true);
        c = class1.getDeclaredConstructor(new Class[] {
            Class.forName("android.os.IBinder")
        });
        c.setAccessible(true);
        e = class1.getDeclaredMethod("relayout", new Class[] {
            cv1, android/view/WindowManager$LayoutParams, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, android/graphics/Rect, android/graphics/Rect, android/graphics/Rect, android/content/res/Configuration, 
            android/view/Surface
        });
        e.setAccessible(true);
    }

    static Constructor a(db db1)
    {
        return db1.d;
    }

    static Constructor b(db db1)
    {
        return db1.c;
    }

    static Method c(db db1)
    {
        return db1.e;
    }

    public final int a(IBinder ibinder, IBinder ibinder1, android.view.WindowManager.LayoutParams layoutparams, int i, int j, int k, boolean flag, 
            Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface)
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        AtomicInteger atomicinteger = new AtomicInteger();
        cv.a(b).post(new dd(this, ibinder1, ibinder, atomicinteger, layoutparams, i, j, k, flag, rect, rect1, rect2, configuration, surface, conditionvariable));
        conditionvariable.block();
        return atomicinteger.get();
    }

    public final void a(Surface surface)
    {
        cv.a(b).post(new dc(this));
    }
}
