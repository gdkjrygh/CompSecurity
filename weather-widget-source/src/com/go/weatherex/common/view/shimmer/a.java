// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common.view.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.go.weatherex.common.view.shimmer:
//            b

public class a
{

    private View a;
    private Paint b;
    private float c;
    private LinearGradient d;
    private Matrix e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private b j;

    public a(View view, Paint paint, AttributeSet attributeset)
    {
        a = view;
        b = paint;
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        g = -1;
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        attributeset = a.getContext().obtainStyledAttributes(attributeset, com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.ShimmerView, 0, 0);
        if (attributeset == null) goto _L2; else goto _L3
_L3:
        g = attributeset.getColor(0, -1);
_L5:
        attributeset.recycle();
_L2:
        e = new Matrix();
        return;
        Object obj;
        obj;
        Log.e("ShimmerTextView", "Error while creating the view:", ((Throwable) (obj)));
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        attributeset.recycle();
        throw obj;
    }

    private void c()
    {
        float f1 = -a.getWidth();
        int k = f;
        int l = g;
        int i1 = f;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        d = new LinearGradient(f1, 0.0F, 0.0F, 0.0F, new int[] {
            k, l, i1
        }, new float[] {
            0.0F, 0.5F, 1.0F
        }, tilemode);
        b.setShader(d);
    }

    protected void a()
    {
        c();
        if (!i)
        {
            i = true;
            if (j != null)
            {
                j.a(a);
            }
        }
    }

    public void a(int k)
    {
        f = k;
        if (i)
        {
            c();
        }
    }

    public void b()
    {
        if (h)
        {
            if (b.getShader() == null)
            {
                b.setShader(d);
            }
            e.setTranslate(2.0F * c, 0.0F);
            d.setLocalMatrix(e);
            return;
        } else
        {
            b.setShader(null);
            return;
        }
    }
}
