// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;

public class CircleView extends View
    implements android.animation.Animator.AnimatorListener, android.view.animation.Animation.AnimationListener
{

    private Paint a;
    private boolean b;

    public CircleView(Context context)
    {
        this(context, null);
    }

    public CircleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint(1);
        a.setColor(getResources().getColor(0x7f0d0078));
    }

    public final void a()
    {
        a.setColor(getResources().getColor(0x7f0d008e));
    }

    public final void a(float f, float f1, long l, long l1, Interpolator interpolator)
    {
        b = false;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
            f, f1
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
            f, f1
        });
        objectanimator.setRepeatCount(0);
        objectanimator1.setRepeatCount(0);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator).with(objectanimator1);
        animatorset.setDuration(l);
        animatorset.setStartDelay(l1);
        animatorset.setInterpolator(interpolator);
        animatorset.addListener(this);
        animatorset.start();
    }

    public final void a(long l, long l1, Interpolator interpolator)
    {
        b = false;
        RotateAnimation rotateanimation = new RotateAnimation(0.0F, 358F, 1, 0.5F, 2, 0.5F);
        rotateanimation.setRepeatMode(1);
        rotateanimation.setRepeatCount(-1);
        rotateanimation.setDuration(l);
        rotateanimation.setStartOffset(l1);
        rotateanimation.setInterpolator(interpolator);
        rotateanimation.setAnimationListener(this);
        setAnimation(rotateanimation);
    }

    public final void a(Interpolator interpolator)
    {
        b = false;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
            1.0F, 4F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
            1.0F, 4F
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator2.setRepeatCount(-1);
        objectanimator.setRepeatCount(-1);
        objectanimator1.setRepeatCount(-1);
        objectanimator2.addListener(this);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator2).with(objectanimator).with(objectanimator1);
        animatorset.setDuration(1000L);
        animatorset.setStartDelay(0L);
        animatorset.setInterpolator(interpolator);
        animatorset.start();
    }

    public final void b()
    {
        b = true;
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
    }

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animator animator)
    {
        if (b)
        {
            post(new Runnable(animator) {

                final Animator a;
                final CircleView b;

                public final void run()
                {
                    a.end();
                }

            
            {
                b = CircleView.this;
                a = animator;
                super();
            }
            });
            setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
        if (b)
        {
            animation.cancel();
            setVisibility(8);
        }
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onDraw(Canvas canvas)
    {
        if (getVisibility() == 0)
        {
            int i = getWidth() / 2;
            int j = getHeight() / 2;
            canvas.drawCircle(i, j, i, a);
        }
    }
}
