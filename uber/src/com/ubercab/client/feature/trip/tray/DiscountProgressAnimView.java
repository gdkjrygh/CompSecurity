// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ubercab.client.core.ui.CircleView;

public class DiscountProgressAnimView extends FrameLayout
{

    private CircleView a[];
    private CircleView b;
    private CircleView c;
    private CircleView d;
    private ImageView e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public DiscountProgressAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new CircleView[4];
    }

    static void a(DiscountProgressAnimView discountprogressanimview)
    {
        discountprogressanimview.d();
    }

    static boolean b(DiscountProgressAnimView discountprogressanimview)
    {
        discountprogressanimview.f = true;
        return true;
    }

    static boolean c(DiscountProgressAnimView discountprogressanimview)
    {
        return discountprogressanimview.g;
    }

    private void d()
    {
        d.setVisibility(0);
        DecelerateInterpolator decelerateinterpolator = new DecelerateInterpolator(1.5F);
        c.a(1.0F, 4F, 500L, 0L, decelerateinterpolator);
        d.a(1.0F, 3F, 200L, 300L, decelerateinterpolator);
        e.setVisibility(0);
        e.setImageDrawable(getResources().getDrawable(0x7f0200de));
        e.animate().scaleX(6F).scaleY(6F).setDuration(300L).setStartDelay(200L).setInterpolator(decelerateinterpolator).setListener(new android.animation.Animator.AnimatorListener() {

            final DiscountProgressAnimView a;

            public final void onAnimationCancel(Animator animator)
            {
                DiscountProgressAnimView.b(a);
                if (DiscountProgressAnimView.c(a))
                {
                    a.c();
                }
            }

            public final void onAnimationEnd(Animator animator)
            {
                DiscountProgressAnimView.b(a);
                if (DiscountProgressAnimView.c(a))
                {
                    a.c();
                }
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = DiscountProgressAnimView.this;
                super();
            }
        }).start();
    }

    private void e()
    {
        if (b != null)
        {
            b.b();
        }
        CircleView acircleview[] = a;
        int k = acircleview.length;
        for (int j = 0; j < k; j++)
        {
            acircleview[j].b();
        }

    }

    public final void a()
    {
        if (!i)
        {
            h = true;
        } else
        {
            h = false;
            c.setScaleX(1.0F);
            c.setScaleY(1.0F);
            b.setVisibility(0);
            b.a(new DecelerateInterpolator());
            int j = 0;
            int k = 0;
            while (j < 4) 
            {
                a[j].setVisibility(0);
                a[j].a(1000L - (long)k, k, new AccelerateDecelerateInterpolator());
                k = (int)((long)k + 50L);
                j++;
            }
        }
    }

    public final void b()
    {
        e();
        postDelayed(new Runnable() {

            final DiscountProgressAnimView a;

            public final void run()
            {
                DiscountProgressAnimView.a(a);
            }

            
            {
                a = DiscountProgressAnimView.this;
                super();
            }
        }, 1000L);
    }

    public final void c()
    {
        if (!f)
        {
            g = true;
            return;
        } else
        {
            g = false;
            DecelerateInterpolator decelerateinterpolator = new DecelerateInterpolator(1.5F);
            e.animate().scaleX(0.0F).scaleY(0.0F).setDuration(500L).setStartDelay(0L).setInterpolator(decelerateinterpolator).start();
            d.a(3F, 0.0F, 500L, 0L, decelerateinterpolator);
            c.a(4F, 0.0F, 200L, 300L, decelerateinterpolator);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 49);
        for (int j = 0; j < 4; j++)
        {
            CircleView circleview = new CircleView(getContext());
            circleview.setAlpha(1.0F / (float)(j + 1));
            circleview.setVisibility(8);
            a[j] = circleview;
            addView(circleview, layoutparams);
        }

        b = new CircleView(getContext());
        layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
        b.setVisibility(8);
        addView(b, layoutparams);
        c = new CircleView(getContext());
        addView(c, layoutparams);
        d = new CircleView(getContext());
        d.a();
        d.setVisibility(8);
        addView(d, layoutparams);
        e = new ImageView(getContext());
        layoutparams = new android.widget.FrameLayout.LayoutParams(5, 5, 17);
        e.setVisibility(8);
        addView(e, layoutparams);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        i = true;
        if (h)
        {
            a();
        }
    }

    protected void onMeasure(int j, int k)
    {
        int l = android.view.View.MeasureSpec.getSize(j);
        k = android.view.View.MeasureSpec.getSize(k);
        j = Math.min(l, k);
        int i1 = (int)((float)j * 0.1F);
        int j1 = (int)((float)(j - i1 * 2) * 0.25F);
        CircleView acircleview[] = a;
        int k1 = acircleview.length;
        for (j = 0; j < k1; j++)
        {
            CircleView circleview = acircleview[j];
            if (circleview.getVisibility() != 8)
            {
                measureChild(circleview, android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000));
            }
        }

        if (b.getVisibility() != 8)
        {
            measureChild(b, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        }
        if (c.getVisibility() != 8)
        {
            measureChild(c, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        }
        if (d.getVisibility() != 8)
        {
            measureChild(d, android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        }
        if (e.getVisibility() != 8)
        {
            measureChild(e, android.view.View.MeasureSpec.makeMeasureSpec(5, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(5, 0x40000000));
        }
        setMeasuredDimension(l, k);
    }
}
