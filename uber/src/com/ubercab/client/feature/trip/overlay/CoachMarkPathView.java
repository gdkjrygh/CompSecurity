// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import chm;

public class CoachMarkPathView extends FrameLayout
{

    private final AnimatorSet a;
    private final ValueAnimator b;
    private final ValueAnimator c;
    private final Paint d;
    private final Paint e;
    private final int f;
    private final int g;
    private boolean h;
    private int i;
    private RectF j;
    private ImageView k;
    private float l;
    private int m;
    private int n;
    private LinearGradient o;
    private boolean p;

    public CoachMarkPathView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CoachMarkPathView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new AnimatorSet();
        b = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        c = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        d = new Paint(1);
        e = new Paint(1);
        f = getResources().getColor(0x7f0d0078);
        g = getResources().getColor(0x7f0d007f);
        l = 0.67F;
        setWillNotDraw(false);
        attributeset = context.obtainStyledAttributes(attributeset, chm.CoachMarkPathView);
        android.graphics.drawable.Drawable drawable = attributeset.getDrawable(1);
        i1 = attributeset.getInt(0, 80);
        attributeset.recycle();
        k = new ImageView(context);
        b(i1);
        k.setImageDrawable(drawable);
        if (!isInEditMode())
        {
            k.setAlpha(0.0F);
        }
        addView(k);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setStrokeWidth(3F);
        d.setColor(f);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setStrokeWidth(3F);
        e.setColor(f);
        i1 = getResources().getInteger(0x7f0b000a);
        b.setDuration(i1);
        a.playSequentially(new Animator[] {
            c, b
        });
    }

    public final void a()
    {
        p = true;
        requestLayout();
    }

    public final void a(float f1)
    {
        l = f1;
    }

    public final void a(int i1)
    {
        k.setImageResource(i1);
    }

    public final void b()
    {
        p = false;
        a.cancel();
    }

    public final void b(int i1)
    {
        android.widget.FrameLayout.LayoutParams layoutparams;
        boolean flag;
        if (i1 == 48)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = i1 | 0x11;
        k.setLayoutParams(layoutparams);
        j = null;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int k1 = getWidth() / 2;
        float f1;
        if (j == null)
        {
            int l1 = i * 2;
            float f4;
            android.graphics.Shader.TileMode tilemode;
            int i1;
            int j1;
            if (h)
            {
                i1 = k1 - i;
            } else
            {
                i1 = k1 - i;
            }
            if (h)
            {
                j1 = n - l1;
            } else
            {
                j1 = m;
            }
            j = new RectF(i1, j1, i1 + l1, l1 + j1);
        }
        if (o == null)
        {
            tilemode = android.graphics.Shader.TileMode.REPEAT;
            float f2;
            if (h)
            {
                f1 = m;
            } else
            {
                f1 = n;
            }
            if (h)
            {
                f2 = n;
            } else
            {
                f2 = m;
            }
            o = new LinearGradient(k1, f1, k1, f2, g, f, tilemode);
            d.setShader(o);
        }
        if (h)
        {
            f1 = m;
        } else
        {
            f1 = n;
        }
        if (c.isRunning())
        {
            f4 = ((Float)c.getAnimatedValue()).floatValue();
            f2 = (float)m * f4;
            if (h)
            {
                i1 = m;
                j1 = n;
                f2 = (float)m - f4 * (float)(i1 - j1);
            }
            canvas.drawLine(k1, f1, k1, f2, d);
        } else
        {
            float f3;
            if (h)
            {
                f3 = n;
            } else
            {
                f3 = m;
            }
            canvas.drawLine(k1, f1, k1, f3, d);
            f3 = ((Float)b.getAnimatedValue()).floatValue();
            if (h)
            {
                f1 = -270F;
            } else
            {
                f1 = -90F;
            }
            canvas.drawArc(j, f1, -(f3 * 360F), false, e);
        }
        if (a.isRunning())
        {
            invalidate();
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (p)
        {
            i1 = k.getHeight();
            j1 = k.getWidth();
            if (i1 <= j1)
            {
                i1 = j1;
            }
            i = (int)((float)i1 * l);
            j1 = k.getBottom() - k.getHeight() / 2;
            if (h)
            {
                i1 = getHeight();
            } else
            {
                i1 = j1 - i;
            }
            m = i1;
            if (h)
            {
                i1 = i + j1;
            } else
            {
                i1 = 0;
            }
            n = i1;
            i1 = (int)((float)Math.abs(m - n) * 1.2F);
            c.setDuration(i1);
            a.start();
            k.animate().alpha(1.0F).setDuration(b.getDuration()).setStartDelay(c.getDuration()).start();
        }
    }
}
