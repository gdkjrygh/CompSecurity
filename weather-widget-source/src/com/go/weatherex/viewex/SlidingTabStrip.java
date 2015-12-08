// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.go.weatherex.viewex:
//            i, j

public class SlidingTabStrip extends LinearLayout
{

    private final int a;
    private final Paint b;
    private int c;
    private final Paint d;
    private int e;
    private final Paint f;
    private final float g;
    private int h;
    private float i;
    private j j;
    private final i k;
    private boolean l;

    public SlidingTabStrip(Context context)
    {
        this(context, null);
    }

    public SlidingTabStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = true;
        setWillNotDraw(false);
        float f1 = getResources().getDisplayMetrics().density;
        attributeset = new TypedValue();
        context.getTheme().resolveAttribute(0x1010030, attributeset, true);
        int i1 = ((TypedValue) (attributeset)).data;
        e = a(i1, (byte)38);
        k = new i(null);
        k.a(new int[] {
            0xff33b5e5
        });
        k.b(new int[] {
            a(i1, (byte)32)
        });
        a = (int)(2.0F * f1);
        b = new Paint();
        b.setColor(e);
        c = (int)(8F * f1);
        d = new Paint();
        g = 0.5F;
        f = new Paint();
        f.setStrokeWidth((int)(f1 * 1.0F));
    }

    private static int a(int i1, byte byte0)
    {
        return Color.argb(byte0, Color.red(i1), Color.green(i1), Color.blue(i1));
    }

    private static int a(int i1, int j1, float f1)
    {
        float f2 = 1.0F - f1;
        float f3 = Color.red(i1);
        float f4 = Color.red(j1);
        float f5 = Color.green(i1);
        float f6 = Color.green(j1);
        float f7 = Color.blue(i1);
        float f8 = Color.blue(j1);
        return Color.rgb((int)(f3 * f1 + f4 * f2), (int)(f5 * f1 + f6 * f2), (int)(f2 * f8 + f7 * f1));
    }

    public void a(byte byte0)
    {
        e = a(e, byte0);
        b.setColor(e);
        invalidate();
    }

    public void a(int i1)
    {
        c = i1;
    }

    public void a(int i1, float f1)
    {
        h = i1;
        i = f1;
        invalidate();
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public transient void a(int ai[])
    {
        j = null;
        k.a(ai);
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        int i3 = getHeight();
        int k2 = getChildCount();
        int l2 = (int)(Math.min(Math.max(0.0F, g), 1.0F) * (float)i3);
        Object obj;
        if (j != null)
        {
            obj = j;
        } else
        {
            obj = k;
        }
        if (k2 > 0)
        {
            View view = getChildAt(h);
            int i2 = view.getLeft();
            int j2 = view.getRight();
            int l1 = ((j) (obj)).a(h);
            int j1;
            if (i > 0.0F && h < getChildCount() - 1)
            {
                int j3 = ((j) (obj)).a(h + 1);
                int i1 = l1;
                if (l1 != j3)
                {
                    i1 = a(j3, l1, i);
                }
                view = getChildAt(h + 1);
                float f1 = i;
                float f2 = view.getLeft();
                float f3 = i;
                i2 = (int)((float)i2 * (1.0F - f3) + f1 * f2);
                f1 = i;
                f2 = view.getRight();
                f3 = i;
                j2 = (int)((float)j2 * (1.0F - f3) + f2 * f1);
                l1 = i1;
            } else
            {
                int k1 = j2;
                j2 = k1;
            }
            d.setColor(l1);
            canvas.drawRect(i2, i3 - c, j2, i3, d);
        }
        canvas.drawRect(0.0F, i3 - a, getWidth(), i3, b);
        if (l)
        {
            l1 = (i3 - l2) / 2;
            for (j1 = 0; j1 < k2 - 1; j1++)
            {
                view = getChildAt(j1);
                f.setColor(((j) (obj)).b(j1));
                canvas.drawLine(view.getRight(), l1, view.getRight(), l1 + l2, f);
            }

        }
    }
}
