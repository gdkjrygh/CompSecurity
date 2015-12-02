// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class SurgeCircleView extends FrameLayout
{

    private final int a;
    private final int b;
    TextView mTextViewSurge;

    public SurgeCircleView(Context context)
    {
        this(context, null);
    }

    public SurgeCircleView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SurgeCircleView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = getResources().getInteger(0x7f0b0010);
        b = getResources().getDimensionPixelSize(0x7f08027c);
    }

    private int a(float f)
    {
        return Math.abs((int)((f - getScaleX()) * (float)a));
    }

    final void a()
    {
        animate().setListener(null).cancel();
        animate().setInterpolator(new DecelerateInterpolator()).setDuration(a(1.0F)).scaleX(1.0F).scaleY(1.0F).translationY(0.0F).setListener(new AnimatorListenerAdapter() {

            final SurgeCircleView a;

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = SurgeCircleView.this;
                super();
            }
        }).start();
    }

    final void a(String s)
    {
        mTextViewSurge.setText(s);
    }

    final void b()
    {
        animate().setListener(null).cancel();
        animate().setInterpolator(new AccelerateInterpolator()).setDuration(a(0.0F)).scaleX(0.0F).scaleY(0.0F).translationY(b).setListener(new AnimatorListenerAdapter() {

            final SurgeCircleView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(4);
            }

            
            {
                a = SurgeCircleView.this;
                super();
            }
        }).start();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
