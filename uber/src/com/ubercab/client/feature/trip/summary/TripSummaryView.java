// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.summary;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import gek;
import gjz;

// Referenced classes of package com.ubercab.client.feature.trip.summary:
//            TripSummaryTabView

public class TripSummaryView extends LinearLayout
{

    private AnimatorSet a;
    private AnimatorSet b;
    private gek c;
    TripSummaryTabView mCapacityTabView;
    TripSummaryTabView mFareTabView;
    View mLeftDivider;
    TripSummaryTabView mPaymentTabView;
    View mRightDivider;

    public TripSummaryView(Context context)
    {
        this(context, null);
    }

    public TripSummaryView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripSummaryView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void f()
    {
        mCapacityTabView.a(0x7f02016c);
        mCapacityTabView.b(0x7f020231);
        mFareTabView.a(0x7f0201ec);
        mFareTabView.b(0x7f020323);
        mPaymentTabView.b(0x7f020231);
    }

    private void g()
    {
        float f2 = 1.0F;
        if (b != null && b.isRunning())
        {
            b.cancel();
        }
        while (a != null && a.isRunning() || mFareTabView.isShown()) 
        {
            return;
        }
        a = new AnimatorSet();
        a.setDuration(getResources().getInteger(0x7f0b000c));
        ValueAnimator valueanimator = new ValueAnimator();
        float f3 = mFareTabView.a();
        float f1;
        ValueAnimator valueanimator1;
        ValueAnimator valueanimator2;
        if (mPaymentTabView.isShown())
        {
            f1 = 3.3F;
        } else
        {
            f1 = 1.0F;
        }
        valueanimator.setFloatValues(new float[] {
            f3, f1
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mFareTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        valueanimator.addListener(new AnimatorListenerAdapter() {

            final TripSummaryView a;

            public final void onAnimationStart(Animator animator)
            {
                a.mFareTabView.setVisibility(0);
                a.mLeftDivider.setVisibility(0);
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        valueanimator1 = new ValueAnimator();
        f3 = mCapacityTabView.a();
        f1 = f2;
        if (mPaymentTabView.isShown())
        {
            f1 = 2.5F;
        }
        valueanimator1.setFloatValues(new float[] {
            f3, f1
        });
        valueanimator1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mCapacityTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        valueanimator2 = new ValueAnimator();
        valueanimator2.setFloatValues(new float[] {
            mPaymentTabView.a(), 4.2F
        });
        valueanimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mPaymentTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        a.playTogether(new Animator[] {
            valueanimator, valueanimator1, valueanimator2
        });
        a.start();
    }

    private void h()
    {
        if (a != null && a.isRunning())
        {
            a.cancel();
        }
        while (b != null && b.isRunning() || !mFareTabView.isShown()) 
        {
            return;
        }
        b = new AnimatorSet();
        b.setDuration(getResources().getInteger(0x7f0b000c));
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setFloatValues(new float[] {
            mFareTabView.a(), 0.0F
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mFareTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        valueanimator.addListener(new AnimatorListenerAdapter() {

            final TripSummaryView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mFareTabView.setVisibility(8);
                a.mLeftDivider.setVisibility(8);
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        ValueAnimator valueanimator1 = new ValueAnimator();
        valueanimator1.setFloatValues(new float[] {
            mCapacityTabView.a(), 1.0F
        });
        valueanimator1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mCapacityTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        ValueAnimator valueanimator2 = new ValueAnimator();
        valueanimator2.setFloatValues(new float[] {
            mPaymentTabView.a(), 1.0F
        });
        valueanimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final TripSummaryView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator3)
            {
                a.mPaymentTabView.a(((Float)valueanimator3.getAnimatedValue()).floatValue());
            }

            
            {
                a = TripSummaryView.this;
                super();
            }
        });
        b.playTogether(new Animator[] {
            valueanimator, valueanimator1, valueanimator2
        });
        b.start();
    }

    public final void a(int i)
    {
        mPaymentTabView.a(i);
    }

    public final void a(gek gek1)
    {
        c = (gek)gjz.a(gek1);
    }

    public final void a(String s)
    {
        gjz.a(s);
        mCapacityTabView.a(s, false);
    }

    public final void a(String s, boolean flag)
    {
        gjz.a(s);
        mFareTabView.a(s, flag);
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = mPaymentTabView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((TripSummaryTabView) (obj)).setVisibility(i);
        obj = mRightDivider;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
    }

    public final boolean a()
    {
        return mCapacityTabView.c();
    }

    public final void b()
    {
        ViewGroup viewgroup = (ViewGroup)getParent();
        if (viewgroup == null)
        {
            return;
        } else
        {
            viewgroup.removeView(this);
            return;
        }
    }

    public final void b(String s)
    {
        gjz.a(s);
        mPaymentTabView.a(s, false);
    }

    public final void b(boolean flag)
    {
        mCapacityTabView.b(flag);
    }

    public final void c(boolean flag)
    {
        mFareTabView.a(flag);
    }

    public final boolean c()
    {
        return mPaymentTabView.b();
    }

    public final void d(boolean flag)
    {
        if (!mFareTabView.isShown() && flag)
        {
            g();
        } else
        if (mFareTabView.isShown() && !flag)
        {
            h();
            return;
        }
    }

    public final boolean d()
    {
        return mFareTabView.b();
    }

    public final void e(boolean flag)
    {
        mFareTabView.b(flag);
    }

    public final boolean e()
    {
        return mFareTabView.c();
    }

    public void onCapacityClicked()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public void onFareClicked()
    {
        if (c != null)
        {
            c.c();
        }
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
            f();
            return;
        }
    }

    public void onPaymentClicked()
    {
        if (c != null)
        {
            c.b();
        }
    }
}
