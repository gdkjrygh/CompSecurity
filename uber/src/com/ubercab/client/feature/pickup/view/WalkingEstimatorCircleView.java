// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import exg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WalkingEstimatorCircleView extends View
{

    private final int a;
    private final int b;
    private final int c;
    private int d;
    private final Paint e;
    private final Paint f;
    private Paint g;
    private final Set h;
    private final ValueAnimator i;
    private final AnimatorListenerAdapter j;
    private boolean k;
    private int l;
    private float m;
    private Bitmap n;

    public WalkingEstimatorCircleView(Context context)
    {
        this(context, null);
    }

    public WalkingEstimatorCircleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WalkingEstimatorCircleView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new Paint(1);
        f = new Paint(1);
        g = e;
        h = new HashSet();
        i = ValueAnimator.ofFloat(new float[] {
            0.0F, 360F
        });
        j = new AnimatorListenerAdapter() {

            final WalkingEstimatorCircleView a;

            public final void onAnimationEnd(Animator animator)
            {
                WalkingEstimatorCircleView.a(a);
                WalkingEstimatorCircleView.b(a);
                WalkingEstimatorCircleView.c(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                WalkingEstimatorCircleView.d(a);
            }

            
            {
                a = WalkingEstimatorCircleView.this;
                super();
            }
        };
        l = -1;
        context = getResources();
        d = context.getDimensionPixelSize(0x7f0802c5);
        a = context.getDimensionPixelSize(0x7f0800a1);
        b = context.getDimensionPixelSize(0x7f0800a2);
        c = context.getDimensionPixelSize(0x7f0800a3);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setStrokeWidth(d);
        e.setColor(context.getColor(0x7f0d0080));
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStrokeWidth((float)d * 3F);
        f.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        f.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        f.setColor(context.getColor(0x7f0d0080));
        i.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final WalkingEstimatorCircleView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                a.setRotation(((Float)valueanimator.getAnimatedValue()).floatValue());
            }

            
            {
                a = WalkingEstimatorCircleView.this;
                super();
            }
        });
        i.setDuration(a(getCircumference()));
        i.setRepeatCount(-1);
        i.setInterpolator(new LinearInterpolator());
        c();
    }

    private static int a(float f1)
    {
        return Math.round(f1 / 0.125F);
    }

    private void a(float f1, float f2)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "circleRadius", new float[] {
            f1, f2
        });
        objectanimator.setDuration(350L);
        objectanimator.setInterpolator(new OvershootInterpolator(1.4F));
        objectanimator.addListener(j);
        if (!objectanimator.isRunning() || !objectanimator.isStarted())
        {
            objectanimator.start();
        }
    }

    static void a(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        walkingestimatorcircleview.b();
    }

    private void b()
    {
        i.setDuration(a(getCircumference()));
    }

    static void b(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        walkingestimatorcircleview.c();
    }

    private void c()
    {
        f.setPathEffect(new DashPathEffect(getDashEffectFromRadius(), 0.0F));
    }

    static void c(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        walkingestimatorcircleview.e();
    }

    private void d()
    {
        k = true;
    }

    static void d(WalkingEstimatorCircleView walkingestimatorcircleview)
    {
        walkingestimatorcircleview.d();
    }

    private void e()
    {
        k = false;
        if (f())
        {
            if ((float)l != getCircleRadius())
            {
                setRadius(l);
            }
            l = -1;
            return;
        } else
        {
            g();
            return;
        }
    }

    private boolean f()
    {
        return l != -1;
    }

    private void g()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((exg)iterator.next()).c()) { }
    }

    private float getCircumference()
    {
        return 6.283185F * getCircleRadius();
    }

    private float[] getDashEffectFromRadius()
    {
        float f1 = getCircumference();
        return (new float[] {
            1.0F, (float)Math.ceil((double)(f1 % 71F) / Math.floor(f1 / 71F)) + 70F
        });
    }

    private void setRadiusAndAnimate(int i1)
    {
        a(m, i1);
    }

    public final void a()
    {
        if (getCircleRadius() != 0.0F)
        {
            setRadius(0);
        }
    }

    public final void a(exg exg1)
    {
        h.add(exg1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            g = f;
            i.start();
        } else
        {
            g = e;
            if (i.isStarted() || i.isRunning())
            {
                i.cancel();
            }
            setRotation(0.0F);
        }
        invalidate();
    }

    public final void b(exg exg1)
    {
        h.remove(exg1);
    }

    public Bitmap getBitmap()
    {
        if (n != null)
        {
            return n;
        } else
        {
            int i1 = a + b;
            int j1 = a + c;
            n = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(n);
            float f1 = getCircleRadius();
            setCircleRadius((float)a / 2.0F);
            e.setStrokeWidth((float)d * 5F);
            layout(0, 0, j1, j1);
            draw(canvas);
            setCircleRadius(f1);
            e.setStrokeWidth(d);
            return n;
        }
    }

    public float getCircleRadius()
    {
        return m;
    }

    protected void onDraw(Canvas canvas)
    {
        if (getVisibility() == 0)
        {
            int i1 = getWidth() / 2;
            int j1 = getHeight() / 2;
            canvas.drawCircle(i1, j1, m, g);
        }
    }

    public void setCircleRadius(float f1)
    {
        m = f1;
        invalidate();
    }

    public void setRadius(int i1)
    {
        if (!k)
        {
            setRadiusAndAnimate(Math.round(1.2F * (float)i1));
            return;
        } else
        {
            l = i1;
            return;
        }
    }
}
