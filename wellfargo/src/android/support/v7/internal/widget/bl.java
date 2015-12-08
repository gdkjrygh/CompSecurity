// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class bl
{

    private static Method a;

    public static int a(int i, int j)
    {
        return i | j;
    }

    public static void a(View view, Rect rect, Rect rect1)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        a.invoke(view, new Object[] {
            rect, rect1
        });
        return;
        view;
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", view);
        return;
    }

    public static boolean a(View view)
    {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static void b(View view)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        method.invoke(view, new Object[0]);
        return;
        view;
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        return;
        view;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", view);
        return;
        view;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", view);
        return;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        a = android/view/View.getDeclaredMethod("computeFitSystemWindows", new Class[] {
            android/graphics/Rect, android/graphics/Rect
        });
        if (!a.isAccessible())
        {
            a.setAccessible(true);
        }
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
    }
}
