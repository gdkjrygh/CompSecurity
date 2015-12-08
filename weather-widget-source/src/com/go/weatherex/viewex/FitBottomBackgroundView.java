// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class FitBottomBackgroundView extends View
{

    private Bitmap a;
    private Paint b;
    private Rect c;
    private Rect d;
    private int e;

    public FitBottomBackgroundView(Context context)
    {
        super(context);
        c = new Rect();
        d = new Rect();
        e = -1;
        a();
    }

    public FitBottomBackgroundView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Rect();
        d = new Rect();
        e = -1;
        a();
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int k = 1;
        int l;
        do
        {
            l = k;
            if (j1 / k <= i)
            {
                break;
            }
            k++;
        } while (true);
        for (; i1 / l > j; l++) { }
        return Math.min(6, l);
    }

    public static Bitmap a(Resources resources, int i, int j, int k)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = a(options, j, k);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    private void a()
    {
        b = new Paint(1);
    }

    private void b()
    {
        if (a != null)
        {
            int k = getWidth();
            int l = getHeight();
            int i = a.getWidth();
            int j = a.getHeight();
            float f = (float)i / (float)k;
            k = (int)((float)j - f * (float)l);
            c.set(0, k, i, j);
        }
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            a = bitmap;
            b();
            invalidate();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null && !a.isRecycled())
        {
            a.recycle();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (a == null && e != -1)
        {
            int i = getWidth();
            int j = getHeight();
            a = a(getResources(), e, i, j);
            b();
        }
        if (a != null)
        {
            canvas.drawBitmap(a, c, d, b);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            d.set(i, j, k, l);
            b();
        }
    }
}
