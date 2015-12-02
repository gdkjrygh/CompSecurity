// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import gam;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PinEtaView extends FrameLayout
{

    private int a;
    private final Set b;
    ImageView mImageViewPinDot;
    ImageView mImageViewPinEta;
    TextView mTextViewEtaLabel;
    TextView mTextViewEtaNumber;
    ViewGroup mViewGroupEta;
    ViewGroup mViewGroupPin;

    public PinEtaView(Context context)
    {
        this(context, null);
    }

    public PinEtaView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinEtaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new HashSet();
        a = getResources().getInteger(0x7f0b0010);
    }

    static Set a(PinEtaView pinetaview)
    {
        return pinetaview.b;
    }

    public final void a()
    {
        a(true);
    }

    public final void a(int i, int j, int k)
    {
        int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mViewGroupPin.measure(l, l);
        float f = i;
        f = ((float)(k - i - j) / 2.0F + f) - (float)mViewGroupPin.getMeasuredHeight();
        if (mViewGroupPin.getVisibility() == 0)
        {
            mViewGroupPin.animate().translationY(f).setInterpolator(new DecelerateInterpolator()).setDuration(a).start();
            return;
        } else
        {
            mViewGroupPin.setTranslationY(f);
            return;
        }
    }

    public final void a(gam gam)
    {
        b.add(gam);
    }

    public final void a(String s)
    {
        mTextViewEtaNumber.setText(s);
        mTextViewEtaLabel.setVisibility(0);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            mViewGroupPin.animate().alpha(1.0F).setListener(new AnimatorListenerAdapter() {

                final PinEtaView a;

                public final void onAnimationStart(Animator animator)
                {
                    a.mViewGroupPin.setVisibility(0);
                }

            
            {
                a = PinEtaView.this;
                super();
            }
            }).start();
            return;
        } else
        {
            mViewGroupPin.setVisibility(0);
            mViewGroupPin.setAlpha(1.0F);
            return;
        }
    }

    public final void b()
    {
        mViewGroupPin.animate().alpha(0.0F).setListener(new AnimatorListenerAdapter() {

            final PinEtaView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mViewGroupPin.setVisibility(8);
            }

            
            {
                a = PinEtaView.this;
                super();
            }
        }).start();
    }

    public final void b(gam gam)
    {
        b.remove(gam);
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            mImageViewPinDot.setVisibility(8);
            mImageViewPinEta.setVisibility(0);
            mViewGroupEta.setVisibility(0);
            return;
        } else
        {
            mImageViewPinDot.setVisibility(0);
            mImageViewPinEta.setVisibility(8);
            mViewGroupEta.setVisibility(8);
            return;
        }
    }

    public final void c()
    {
        mTextViewEtaNumber.setText("--");
        mTextViewEtaLabel.setVisibility(8);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        mImageViewPinEta.setOnClickListener(new android.view.View.OnClickListener() {

            final PinEtaView a;

            public final void onClick(View view)
            {
                for (view = PinEtaView.a(a).iterator(); view.hasNext(); ((gam)view.next()).a()) { }
            }

            
            {
                a = PinEtaView.this;
                super();
            }
        });
    }
}
