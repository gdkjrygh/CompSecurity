// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework.a;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.framework.a:
//            a

public class b
    implements a
{

    private static final SparseArray a = new SparseArray(3);
    private static final a b = new b();

    private b()
    {
    }

    public static a a()
    {
        return b;
    }

    private void a(ViewGroup viewgroup, int i, int j)
    {
        int l = viewgroup.getChildCount();
        int k = 0;
        while (k < l) 
        {
            View view = viewgroup.getChildAt(k);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, i, j);
            } else
            if (view instanceof TextView)
            {
                a((TextView)view, i, j);
            }
            k++;
        }
    }

    private void a(ViewGroup viewgroup, int i, boolean flag)
    {
        int k = viewgroup.getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = viewgroup.getChildAt(j);
            if (view instanceof ViewGroup)
            {
                a((ViewGroup)view, i, flag);
            } else
            if (view instanceof TextView)
            {
                a((TextView)view, i, flag);
            }
            j++;
        }
    }

    private void a(TextView textview, int i, int j)
    {
        textview.setTypeface(a(textview.getContext(), i, j), j);
    }

    private void a(TextView textview, int i, boolean flag)
    {
        boolean flag1 = false;
        int j = ((flag1) ? 1 : 0);
        if (flag)
        {
            j = ((flag1) ? 1 : 0);
            if (textview.getTypeface() != null)
            {
                j = textview.getTypeface().getStyle();
            }
        }
        textview.setTypeface(a(textview.getContext(), i, j), j);
    }

    private Typeface b(Context context, int i, int j)
    {
        long l = System.currentTimeMillis();
        i;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 68
    //                   2 155
    //                   3 129
    //                   4 142;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("fontType : ").append(i).append(" has not be defined yet").toString());
_L2:
        context = Typeface.defaultFromStyle(j);
_L7:
        long l1 = System.currentTimeMillis();
        c.a("FontManagerImpl", (new StringBuilder()).append("typeface.getStyle: ").append(context.getStyle()).append(" ,loadTypeface").append(i).append(" cost time: ").append(l1 - l).toString());
        return context;
_L4:
        context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Thin.ttf");
        continue; /* Loop/switch isn't completed */
_L5:
        context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
        continue; /* Loop/switch isn't completed */
_L3:
        if (j == 3)
        {
            context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BoldItalic.ttf");
        } else
        if (j == 1)
        {
            context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        } else
        if (j == 2)
        {
            context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Italic.ttf");
        } else
        {
            context = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Typeface a(Context context, int i, int j)
    {
        SparseArray sparsearray = (SparseArray)a.get(i);
        if (sparsearray == null)
        {
            sparsearray = new SparseArray(4);
            a.put(i, sparsearray);
        }
        Typeface typeface1 = (Typeface)sparsearray.get(j);
        Typeface typeface = typeface1;
        if (typeface1 == null)
        {
            typeface = b(context, i, j);
            sparsearray.put(j, typeface);
        }
        return typeface;
    }

    public void a(View view, int i, int j)
    {
        if (view instanceof TextView)
        {
            a((TextView)view, i, j);
        } else
        if (view instanceof ViewGroup)
        {
            a((ViewGroup)view, i, j);
            return;
        }
    }

    public void a(View view, int i, boolean flag)
    {
        if (view instanceof TextView)
        {
            a((TextView)view, i, flag);
        } else
        if (view instanceof ViewGroup)
        {
            a((ViewGroup)view, i, flag);
            return;
        }
    }

}
