// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;

public class PhoneWavesProgressView extends FrameLayout
{

    private AnimatorSet a;
    private boolean b;
    ImageView mLargeWaveView;
    ImageView mMediumWaveView;
    ImageView mSmallWaveView;

    public PhoneWavesProgressView(Context context)
    {
        this(context, null);
    }

    public PhoneWavesProgressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PhoneWavesProgressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new AnimatorSet();
        inflate(context, 0x7f030132, this);
    }

    private static transient ObjectAnimator a(View view, float af[])
    {
        view = ObjectAnimator.ofFloat(view, "alpha", af);
        view.setRepeatCount(-1);
        return view;
    }

    public final void a()
    {
        ObjectAnimator objectanimator = a(((View) (mLargeWaveView)), new float[] {
            960F, 0.0F, 0.0F, 1.0F, 0.7F, 0.2F, 0.0F
        });
        ObjectAnimator objectanimator1 = a(((View) (mMediumWaveView)), new float[] {
            960F, 0.0F, 1.0F, 0.7F, 0.2F, 0.0F, 0.0F
        });
        ObjectAnimator objectanimator2 = a(((View) (mSmallWaveView)), new float[] {
            960F, 1.0F, 0.7F, 0.2F, 0.0F, 0.0F, 0.0F
        });
        a.playTogether(new Animator[] {
            objectanimator2, objectanimator1, objectanimator
        });
        a.setupStartValues();
        a.setDuration(960L);
        a.start();
        b = true;
    }

    public final void a(boolean flag)
    {
        a.cancel();
        b = false;
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        mSmallWaveView.setAlpha(f);
        mMediumWaveView.setAlpha(f);
        mLargeWaveView.setAlpha(f);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a.cancel();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
