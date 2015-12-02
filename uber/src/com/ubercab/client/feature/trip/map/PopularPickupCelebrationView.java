// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PopularPickupCelebrationView extends FrameLayout
{

    private final Resources a;
    private final Set b;
    private HotspotCircleView c;

    public PopularPickupCelebrationView(Context context)
    {
        this(context, null);
    }

    public PopularPickupCelebrationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PopularPickupCelebrationView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new HashSet();
        a = getResources();
    }

    static Set a(PopularPickupCelebrationView popularpickupcelebrationview)
    {
        return popularpickupcelebrationview.b;
    }

    public final void a()
    {
        c.a();
    }

    public final void a(int i, int j)
    {
        setPadding(0, i, 0, j);
    }

    public final void a(Listener listener)
    {
        b.add(listener);
    }

    public final void b()
    {
        c.b();
    }

    public final boolean c()
    {
        return c.getVisibility() == 0;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        int i = a.getDimensionPixelSize(0x7f0800c2);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i * 4, i * 4, 17);
        AnimatorListenerAdapter animatorlisteneradapter = new AnimatorListenerAdapter() {

            final PopularPickupCelebrationView a;

            public void onAnimationCancel(Animator animator)
            {
                for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((Listener)animator.next()).f()) { }
            }

            public void onAnimationEnd(Animator animator)
            {
                for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((Listener)animator.next()).f()) { }
            }

            public void onAnimationStart(Animator animator)
            {
                for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((Listener)animator.next()).e()) { }
            }

            
            {
                a = PopularPickupCelebrationView.this;
                super();
            }

            private class Listener
            {

                public abstract void e();

                public abstract void f();
            }

        };
        c = new HotspotCircleView(getContext());
        c.setVisibility(8);
        c.a(animatorlisteneradapter);
        addView(c, layoutparams);
    }

    private class HotspotCircleView extends View
    {

        private final Paint a;
        private final Paint b;
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final Resources g;
        private AnimatorSet h;
        private AnimatorListenerAdapter i;
        private AnimatorListenerAdapter j = new AnimatorListenerAdapter() {

            final HotspotCircleView a;

            public void onAnimationStart(Animator animator)
            {
                a.setAlpha(0.0F);
                a.setVisibility(0);
            }

                
                {
                    a = HotspotCircleView.this;
                    super();
                }
        };
        private float k;
        private float l;
        private float m;

        final void a()
        {
            if (h == null)
            {
                Object obj1 = ObjectAnimator.ofFloat(this, "outerCircleRadius", new float[] {
                    e, f
                });
                Object obj = ObjectAnimator.ofFloat(this, "outerCircleRadius", new float[] {
                    f, e
                });
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "innerCircleRadius", new float[] {
                    k, 0.0F
                });
                objectanimator.setStartDelay(200L);
                objectanimator.setDuration(600L);
                ObjectAnimator objectanimator1 = ObjectAnimator.ofObject(this, "strokeWidth", new FloatEvaluator(), new Object[] {
                    Float.valueOf(c), Float.valueOf(d)
                });
                ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                    0.0F, 1.0F
                });
                objectanimator2.setDuration(200L);
                ObjectAnimator.ofFloat(this, "alpha", new float[] {
                    1.0F, 0.0F
                }).setDuration(200L);
                AnimatorSet animatorset = new AnimatorSet();
                animatorset.playTogether(new Animator[] {
                    objectanimator2, objectanimator1, obj1
                });
                obj1 = new AnimatorSet();
                ((AnimatorSet) (obj1)).playTogether(new Animator[] {
                    obj
                });
                obj = new AnimatorSet();
                ((AnimatorSet) (obj)).playSequentially(new Animator[] {
                    animatorset, obj1
                });
                h = new AnimatorSet();
                h.playTogether(new Animator[] {
                    obj, objectanimator
                });
                h.setDuration(600L);
                h.setStartDelay(200L);
                h.setInterpolator(new FastOutSlowInInterpolator());
                h.addListener(j);
                if (i != null)
                {
                    h.addListener(i);
                }
            }
            if (!h.isRunning())
            {
                h.start();
            }
        }

        final void a(AnimatorListenerAdapter animatorlisteneradapter)
        {
            i = animatorlisteneradapter;
        }

        final void b()
        {
            setVisibility(8);
            if (h != null && h.isRunning())
            {
                h.end();
            }
        }

        protected void onDraw(Canvas canvas)
        {
            if (getVisibility() == 0)
            {
                int i1 = getWidth() / 2;
                int j1 = getHeight() / 2;
                canvas.drawCircle(i1, j1, k, a);
                canvas.drawCircle(i1, j1, l, b);
            }
        }

        public void setInnerCircleRadius(float f1)
        {
            k = f1;
            invalidate();
        }

        public void setOuterCircleRadius(float f1)
        {
            l = f1;
            invalidate();
        }

        public void setStrokeWidth(float f1)
        {
            m = f1;
            b.setStrokeWidth(m);
            invalidate();
        }

        public HotspotCircleView(Context context)
        {
            this(context, null);
        }

        public HotspotCircleView(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, 0);
        }

        public HotspotCircleView(Context context, AttributeSet attributeset, int i1)
        {
            super(context, attributeset, i1);
            a = new Paint(1);
            b = new Paint(1);
            g = getResources();
            c = g.getDimensionPixelSize(0x7f0800c4);
            d = g.getDimensionPixelSize(0x7f0800c0);
            k = g.getDimensionPixelSize(0x7f0800c1);
            e = g.getDimensionPixelSize(0x7f0800c3);
            f = g.getDimensionPixelSize(0x7f0800c2);
            l = e;
            m = c;
            b.setStyle(android.graphics.Paint.Style.STROKE);
            b.setStrokeWidth(m);
            b.setColor(g.getColor(0x7f0d0080));
            a.setStyle(android.graphics.Paint.Style.FILL);
            a.setColor(g.getColor(0x7f0d0080));
        }
    }

}
