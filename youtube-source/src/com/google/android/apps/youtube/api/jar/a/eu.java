// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.Surface;
import android.view.SurfaceView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            es

final class eu extends SurfaceView
    implements InvocationHandler
{

    private final Class a[] = new Class[0];
    private final Class b;
    private final Field c = android/view/SurfaceView.getDeclaredField("mSession");
    private final Method d;
    private final es e;
    private Object f;

    public eu(Context context, es es1)
    {
        super(context);
        e = (es)com.google.android.apps.youtube.common.fromguava.c.a(es1, "listener cannot be null");
        c.setAccessible(true);
        b = c.getType();
        context = Class.forName("android.view.IWindow");
        d = b.getDeclaredMethod("relayout", new Class[] {
            context, android/view/WindowManager$LayoutParams, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, android/graphics/Rect, android/graphics/Rect, android/graphics/Rect, android/content/res/Configuration, 
            android/view/Surface
        });
    }

    private IBinder a(Object obj)
    {
        return (IBinder)obj.getClass().getMethod("asBinder", a).invoke(obj, new Object[0]);
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        if (method.equals(d))
        {
            obj = a(f);
            method = a(aobj[0]);
            return Integer.valueOf(e.a(((IBinder) (obj)), method, (android.view.WindowManager.LayoutParams)aobj[1], ((Integer)aobj[2]).intValue(), ((Integer)aobj[3]).intValue(), ((Integer)aobj[4]).intValue(), ((Boolean)aobj[5]).booleanValue(), (Rect)aobj[6], (Rect)aobj[7], (Rect)aobj[8], (Configuration)aobj[9], (Surface)aobj[10]));
        } else
        {
            return method.invoke(f, aobj);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        try
        {
            f = c.get(this);
            c.set(this, Proxy.getProxyClass(b.getClassLoader(), new Class[] {
                b
            }).getConstructor(new Class[] {
                java/lang/reflect/InvocationHandler
            }).newInstance(new Object[] {
                this
            }));
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            L.b((new StringBuilder("Could not override call to IWindowSession.relayout: ")).append(illegalaccessexception.getMessage()).toString());
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            L.b((new StringBuilder("Could not override call to IWindowSession.relayout: ")).append(illegalargumentexception.getMessage()).toString());
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            L.b((new StringBuilder("Could not override call to IWindowSession.relayout: ")).append(nosuchmethodexception.getMessage()).toString());
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            L.b((new StringBuilder("Could not override call to IWindowSession.relayout: ")).append(invocationtargetexception.getMessage()).toString());
            return;
        }
        catch (InstantiationException instantiationexception)
        {
            L.b((new StringBuilder("Could not override call to IWindowSession.relayout: ")).append(instantiationexception.getMessage()).toString());
        }
    }
}
