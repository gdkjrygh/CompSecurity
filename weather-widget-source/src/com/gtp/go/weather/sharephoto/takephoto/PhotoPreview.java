// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class PhotoPreview extends View
{

    private Drawable a;
    private boolean b;

    public PhotoPreview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        b();
    }

    public PhotoPreview(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        b();
    }

    private void b()
    {
    }

    private void c()
    {
        if (a != null)
        {
            float f2 = a.getIntrinsicWidth();
            float f = a.getIntrinsicHeight();
            float f1 = Math.min((float)getWidth() / f2, (float)getHeight() / f);
            f2 *= f1;
            f *= f1;
            int i = (int)(((float)getWidth() - f2) / 2.0F);
            int j = (int)(((float)getHeight() - f) / 2.0F);
            int k = (int)(f2 + (float)i);
            int l = (int)(f + (float)j);
            a.setBounds(i, j, k, l);
            b = false;
        }
    }

    public Rect a()
    {
        if (a != null)
        {
            return a.getBounds();
        } else
        {
            return null;
        }
    }

    public void a(Drawable drawable)
    {
        if (a != drawable)
        {
            a = drawable;
            b = true;
        }
        requestLayout();
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        if (a != null)
        {
            a.draw(canvas);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag || b)
        {
            c();
        }
    }
}
