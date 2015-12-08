// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.api.b.a.ba;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            dd, et, ep, eo, 
//            ek, el, en, em, 
//            er, eq, es

public final class ej extends dd
{

    private final et a;
    private final Context b;
    private final Handler c;
    private es d;
    private SurfaceHolder e;

    public ej(et et1, Context context, Handler handler)
    {
        a = (et)com.google.android.apps.youtube.common.fromguava.c.a(et1, "listener cannot be null");
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        c = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
    }

    static SurfaceHolder a(ej ej1, SurfaceHolder surfaceholder)
    {
        ej1.e = surfaceholder;
        return surfaceholder;
    }

    static es a(ej ej1, es es1)
    {
        ej1.d = es1;
        return es1;
    }

    static et a(ej ej1)
    {
        return ej1.a;
    }

    static Context b(ej ej1)
    {
        return ej1.b;
    }

    public static boolean b(boolean flag)
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 13 && !"ka".equals(Build.DEVICE) && !"eagle".equals(Build.DEVICE))
            {
                flag = flag1;
                if (!"asura".equals(Build.DEVICE))
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static es c(ej ej1)
    {
        return ej1.d;
    }

    static SurfaceHolder d(ej ej1)
    {
        return ej1.e;
    }

    public final void a(int i)
    {
        c.post(new ep(this, i));
    }

    public final void a(int i, int j)
    {
        c.post(new eo(this, i, j));
    }

    public final void a(ba ba)
    {
        c.post(new ek(this, ba));
    }

    public final void a(boolean flag)
    {
        c.post(new el(this, flag));
    }

    public final boolean a()
    {
        AtomicBoolean atomicboolean = new AtomicBoolean();
        ConditionVariable conditionvariable = new ConditionVariable();
        c.post(new en(this, atomicboolean, conditionvariable));
        conditionvariable.block();
        return atomicboolean.get();
    }

    public final Rect b()
    {
        AtomicReference atomicreference = new AtomicReference();
        ConditionVariable conditionvariable = new ConditionVariable();
        c.post(new em(this, atomicreference, conditionvariable));
        conditionvariable.block();
        return (Rect)atomicreference.get();
    }

    public final void b(int i)
    {
        c.post(new er(this, i));
    }

    public final void c()
    {
        c.post(new eq(this));
    }

    public final void d()
    {
        a.e();
        if (d != null)
        {
            d.a();
            d = null;
        }
        e = null;
    }
}
