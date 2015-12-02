// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import fty;

public class GuidedPickupBannerView extends LinearLayout
{

    private fty a;
    TextView mTextViewDescription;
    TextView mTextViewLabel;

    public GuidedPickupBannerView(Context context)
    {
        this(context, null);
    }

    public GuidedPickupBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GuidedPickupBannerView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final GuidedPickupBannerView a;

            public final void onLayoutChange(View view, int k, int l, int i1, int j1, int k1, int l1, 
                    int i2, int j2)
            {
                view.removeOnLayoutChangeListener(this);
                a.a();
            }

            
            {
                a = GuidedPickupBannerView.this;
                super();
            }
        });
    }

    static void a(GuidedPickupBannerView guidedpickupbannerview)
    {
        guidedpickupbannerview.g();
    }

    static void b(GuidedPickupBannerView guidedpickupbannerview)
    {
        guidedpickupbannerview.f();
    }

    static void c(GuidedPickupBannerView guidedpickupbannerview)
    {
        guidedpickupbannerview.h();
    }

    private void d()
    {
        animate().setListener(new AnimatorListenerAdapter() {

            final GuidedPickupBannerView a;

            public final void onAnimationEnd(Animator animator)
            {
                GuidedPickupBannerView.b(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
                GuidedPickupBannerView.a(a);
            }

            
            {
                a = GuidedPickupBannerView.this;
                super();
            }
        }).alpha(1.0F).start();
    }

    static void d(GuidedPickupBannerView guidedpickupbannerview)
    {
        guidedpickupbannerview.i();
    }

    private void e()
    {
        animate().setListener(new AnimatorListenerAdapter() {

            final GuidedPickupBannerView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(4);
                GuidedPickupBannerView.d(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                GuidedPickupBannerView.c(a);
            }

            
            {
                a = GuidedPickupBannerView.this;
                super();
            }
        }).alpha(0.0F).start();
    }

    private void f()
    {
        if (a != null)
        {
            a.b();
        }
    }

    private void g()
    {
        if (a != null)
        {
            a.a();
        }
    }

    private void h()
    {
        if (a != null)
        {
            a.c();
        }
    }

    private void i()
    {
        if (a != null)
        {
            a.d();
        }
    }

    public final void a()
    {
        d();
    }

    public final void a(fty fty1)
    {
        a = fty1;
    }

    public final void a(String s)
    {
        mTextViewLabel.setText(s);
    }

    public final void b()
    {
        e();
    }

    public final void b(String s)
    {
        mTextViewDescription.setText(s);
    }

    public final int c()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)getLayoutParams();
        int j = getHeight();
        return marginlayoutparams.topMargin + j;
    }

    public void onFinishInflate()
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
