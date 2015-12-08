// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.b.b;
import android.support.v7.b.f;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

final class ab
{

    public static int a(Context context, int i)
    {
        TypedValue typedvalue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedvalue, true))
        {
            return typedvalue.resourceId;
        } else
        {
            return 0;
        }
    }

    public static Context a(Context context, boolean flag)
    {
        int i = 1;
        boolean flag1 = false;
        TypedValue typedvalue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.a, typedvalue, true) || typedvalue.data == 0)
        {
            i = 0;
        }
        if (i != 0 && flag)
        {
            context = new ContextThemeWrapper(context, f.a);
            i = ((flag1) ? 1 : 0);
        }
        if (i != 0)
        {
            i = f.c;
        } else
        {
            i = f.b;
        }
        return new ContextThemeWrapper(context, i);
    }

    public static Drawable b(Context context, int i)
    {
        i = a(context, i);
        if (i != 0)
        {
            return context.getResources().getDrawable(i);
        } else
        {
            return null;
        }
    }
}
