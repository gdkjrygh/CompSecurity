// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cgh;
import com.ubercab.client.feature.trip.tray.TrayPaymentLayout;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.CreditBalance;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.ui.TextView;
import czi;
import dtv;
import dui;
import dum;
import esj;
import eyn;
import eyo;
import eyy;
import ezc;
import fqp;
import fsx;
import gco;
import gmg;
import hkr;
import ijg;
import ijj;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            BadgeView

public class ProfileContainerView extends LinearLayout
{

    public hkr a;
    public gmg b;
    public cgh c;
    public eyy d;
    public fsx e;
    private final int f;
    private AccelerateInterpolator g;
    private boolean h;
    private boolean i;
    private int j;
    private eyn k;
    private PaymentProfile l;
    private int m;
    BadgeView mBadgeView;
    View mDividerLeft;
    View mDividerRight;
    ImageView mExpandArrow;
    LinearLayout mExpenseInfoContainer;
    ImageView mExpenseInfoImageView;
    TextView mExpenseInfoTextView;
    LinearLayout mPaymentClickContainer;
    LinearLayout mPaymentContainer;
    ImageView mPaymentImageView;
    TextView mPaymentTextView;
    FrameLayout mProfileContainer;
    TextView mProfileNameTextView;
    TextView mProfileNameTextViewMeasuring;
    FrameLayout mRightContainer;
    private gco n;
    private boolean o;

    public ProfileContainerView(Context context)
    {
        this(context, null);
    }

    public ProfileContainerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProfileContainerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = new AccelerateInterpolator();
        m = eyo.a;
        f = getResources().getDimensionPixelSize(0x7f0802da);
        if (isInEditMode())
        {
            return;
        } else
        {
            ((fqp)((czi)getContext()).d()).a(this);
            return;
        }
    }

    private void a(int i1)
    {
        m = i1;
    }

    private void a(Drawable drawable, String s, boolean flag, CreditBalance creditbalance)
    {
        if (flag)
        {
            mPaymentImageView.setImageResource(0x7f020277);
            if (creditbalance != null)
            {
                mPaymentTextView.setText(String.valueOf(creditbalance.getAmountString()));
            }
            return;
        } else
        {
            mPaymentImageView.setImageDrawable(drawable);
            mPaymentTextView.setText(s);
            return;
        }
    }

    private static void a(View view, float f1)
    {
        view = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        if (f1 > 0.0F)
        {
            view.width = 0;
            view.weight = f1;
            return;
        } else
        {
            view.width = -2;
            view.weight = 0.0F;
            return;
        }
    }

    private static void a(View view, int i1)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), 0);
    }

    private void a(View view, android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i1, float f1, boolean flag, int j1)
    {
        float f3 = f1 * (float)i1;
        i1 = marginlayoutparams.leftMargin;
        float f2;
        if (flag)
        {
            f2 = (float)i1 - f3;
        } else
        {
            f2 = f3 - (float)i1;
        }
        i1 = (int)f2 + j1;
        if (f1 == 0.0F || f1 == 1.0F)
        {
            i1 = 0;
        }
        marginlayoutparams.leftMargin = (int)(f3 + (float)j1);
        view.offsetLeftAndRight(i1);
        requestLayout();
    }

    private void b(float f1)
    {
        Object obj = (android.widget.LinearLayout.LayoutParams)mExpenseInfoTextView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mExpenseInfoImageView.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)mExpenseInfoContainer.getLayoutParams();
        int i1 = mExpenseInfoImageView.getMeasuredWidth();
        int k1 = mRightContainer.getMeasuredWidth();
        if (i1 != 0 && k1 != 0)
        {
            int j1 = getResources().getDimensionPixelSize(0x7f0802dd);
            k1 -= i1 + j1;
            a(mExpenseInfoContainer, layoutparams1, k1, f1, false, 0);
            i1 += j1 / 2;
            a(mExpenseInfoImageView, layoutparams, i1, f1, true, 0);
            a(mExpenseInfoTextView, ((android.view.ViewGroup.MarginLayoutParams) (obj)), i1, f1, true, 0);
            float f2 = 1.0F - f1;
            mExpenseInfoTextView.setAlpha(f2);
            f2 = g.getInterpolation(1.0F - f2);
            if (f1 == 0.0F)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            mPaymentContainer.setAlpha(f2);
            obj = mPaymentContainer;
            if (i1 != 0)
            {
                j1 = 8;
            } else
            {
                j1 = 0;
            }
            ((LinearLayout) (obj)).setVisibility(j1);
            mDividerRight.setAlpha(f2);
            obj = mDividerRight;
            if (i1 != 0)
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            ((View) (obj)).setVisibility(i1);
            mDividerLeft.setVisibility(0);
            if (mPaymentContainer.getTag() == null)
            {
                ((android.widget.FrameLayout.LayoutParams)mPaymentContainer.getLayoutParams()).width = k1;
                mPaymentContainer.setTag(Boolean.valueOf(true));
                return;
            }
        }
    }

    private void b(boolean flag, boolean flag1)
    {
        if (flag || flag1)
        {
            mProfileContainer.setBackgroundResource(0x7f02010f);
            mPaymentClickContainer.setBackgroundResource(0x7f020114);
            mExpenseInfoContainer.setBackgroundResource(0x7f020114);
            mDividerLeft.setBackgroundResource(0x7f02010e);
        } else
        {
            mProfileContainer.setBackgroundResource(0x7f0200f5);
            mPaymentClickContainer.setBackgroundResource(0x7f020101);
            mExpenseInfoContainer.setBackgroundResource(0x7f020101);
            mDividerLeft.setBackgroundResource(0x7f0200f2);
        }
        mDividerLeft.setVisibility(0);
    }

    private void c(float f1)
    {
        boolean flag = true;
        int i1 = 0;
        float f2 = 1.0F;
        int i2 = mBadgeView.getMeasuredWidth();
        int j2 = mExpandArrow.getMeasuredWidth();
        int k2 = mProfileContainer.getMeasuredWidth();
        int j1 = mProfileNameTextView.getMeasuredWidth();
        int k1 = getMeasuredWidth();
        if (k1 == 0)
        {
            return;
        }
        a(mProfileNameTextViewMeasuring, k1);
        int l1 = mProfileNameTextViewMeasuring.getMeasuredWidth();
        float f3 = f + i2 + j1 + f + j2 + mProfileContainer.getPaddingRight() + mProfileContainer.getPaddingLeft();
        Object obj = (android.widget.LinearLayout.LayoutParams)mExpandArrow.getLayoutParams();
        if (f1 == 1.0F)
        {
            a(mProfileNameTextView, 1.0F);
            obj.leftMargin = f;
            return;
        }
        if (f1 == 0.0F)
        {
            obj.leftMargin = f;
            flag = i1;
            if ((float)l1 > (float)k1 - (f3 - (float)j1))
            {
                flag = true;
            }
            obj = mProfileNameTextView;
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            a(((View) (obj)), f1);
            return;
        }
        mDividerLeft.setVisibility(0);
        i1 = mProfileContainer.getPaddingLeft();
        int l2 = f;
        int i3 = f;
        int j3 = k1 / 2;
        int k3 = mProfileContainer.getPaddingRight();
        if (f3 < (float)(k1 / 2))
        {
            a(mProfileNameTextView, 0.0F);
            a(mExpandArrow, ((android.view.ViewGroup.MarginLayoutParams) (obj)), j3 - j2 - k3 - (i2 + i1 + l2 + j1 + i3), f1, false, f);
            return;
        }
        if (f3 < (float)k2 || j1 > l1)
        {
            flag = false;
        }
        obj = mProfileNameTextView;
        if (flag)
        {
            f1 = f2;
        } else
        {
            f1 = 0.0F;
        }
        a(((View) (obj)), f1);
    }

    private void d()
    {
        mRightContainer.setAlpha(1.0F);
        mPaymentContainer.setAlpha(1.0F);
        mDividerRight.setAlpha(1.0F);
        mPaymentContainer.setTag(null);
    }

    private void d(float f1)
    {
        if (f1 == 1.0F)
        {
            f();
            return;
        }
        if (f1 == 0.0F)
        {
            g();
            return;
        } else
        {
            c(f1);
            float f2 = f1 / 2.0F;
            a(mProfileContainer, 1.0F - f2);
            a(mRightContainer, f2);
            mRightContainer.setAlpha(f1);
            mRightContainer.setVisibility(0);
            mPaymentContainer.setVisibility(0);
            mDividerLeft.setAlpha(f1);
            requestLayout();
            return;
        }
    }

    private void e()
    {
        mPaymentContainer.setVisibility(8);
        mExpenseInfoContainer.setVisibility(0);
        mRightContainer.setVisibility(0);
        i();
    }

    private void f()
    {
        mPaymentContainer.setVisibility(0);
        mPaymentContainer.getLayoutParams().width = -1;
        mExpenseInfoContainer.setVisibility(8);
        mRightContainer.setVisibility(0);
        i();
    }

    private void g()
    {
        mPaymentContainer.setVisibility(8);
        mExpenseInfoContainer.setVisibility(8);
        mRightContainer.setVisibility(8);
        mDividerLeft.setVisibility(8);
        c(0.0F);
        invalidate();
    }

    private void h()
    {
        int i1 = getResources().getDimensionPixelSize(0x7f0802da);
        int j1 = getResources().getDimensionPixelSize(0x7f0802db);
        ((android.widget.LinearLayout.LayoutParams)mDividerLeft.getLayoutParams()).setMargins(0, 0, 0, 0);
        mDividerRight.setVisibility(8);
        mPaymentClickContainer.setPadding(i1, 0, i1, 0);
        mProfileContainer.setPadding(j1, 0, j1, 0);
    }

    private void i()
    {
        boolean flag = false;
        float f2 = 1.0F;
        mDividerLeft.setVisibility(0);
        mDividerRight.setVisibility(4);
        a(mProfileNameTextView, 1.0F);
        if (m == eyo.a)
        {
            flag = true;
        }
        FrameLayout framelayout = mProfileContainer;
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 6F;
        }
        a(framelayout, f1);
        framelayout = mRightContainer;
        if (flag)
        {
            f1 = f2;
        } else
        {
            f1 = 4F;
        }
        a(framelayout, f1);
        invalidate();
    }

    public final int a()
    {
        return j;
    }

    public final void a(float f1)
    {
        if (dum.j(d.b()))
        {
            b(f1);
            return;
        } else
        {
            d(f1);
            return;
        }
    }

    public final void a(City city, List list, List list1)
    {
        Drawable drawable = null;
        boolean flag = true;
        PaymentProfile paymentprofile = e.a();
        boolean flag1 = e.d();
        if (l != null && l.equals(paymentprofile) && flag1 == o)
        {
            return;
        }
        if (paymentprofile != null && list != null)
        {
            l = paymentprofile;
            String s = paymentprofile.getCardType();
            drawable = esj.a(getContext(), s);
            if (drawable == null)
            {
                ijg.a(com/ubercab/client/feature/trip/tray/TrayPaymentLayout.getSimpleName()).d("No paymentDrawable found for: %s", new Object[] {
                    s
                });
            }
            list = dui.a(getContext(), paymentprofile, list, false);
        } else
        {
            Object obj = null;
            list = drawable;
            drawable = obj;
        }
        city = dtv.a(city.getCurrencyCode(), list1);
        if (!flag1 || city == null)
        {
            flag = false;
        }
        o = flag;
        a(drawable, ((String) (list)), o, ((CreditBalance) (city)));
    }

    public final void a(TripExpenseInfo tripexpenseinfo)
    {
        boolean flag;
        if (tripexpenseinfo != null && (!TextUtils.isEmpty(tripexpenseinfo.getCode()) || !TextUtils.isEmpty(tripexpenseinfo.getMemo())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != flag)
        {
            tripexpenseinfo = mExpenseInfoImageView;
            int i1;
            if (flag)
            {
                i1 = 0x7f020295;
            } else
            {
                i1 = 0x7f020294;
            }
            tripexpenseinfo.setImageResource(i1);
            i = flag;
        }
    }

    public final void a(eyn eyn1)
    {
        k = eyn1;
    }

    public final void a(gco gco1)
    {
        h = true;
        n = gco1;
    }

    public final void a(boolean flag)
    {
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        a(f1);
        d();
    }

    public final void a(boolean flag, boolean flag1)
    {
        c();
        if (dum.m(d.b()))
        {
            g();
            mDividerLeft.setVisibility(8);
            FrameLayout framelayout = mProfileContainer;
            int i1;
            if (flag || flag1)
            {
                i1 = 0x7f02010d;
            } else
            {
                i1 = 0x7f0200e8;
            }
            framelayout.setBackgroundResource(i1);
        } else
        {
            a(eyo.b);
            f();
            Client client = a.c();
            City city = a.b();
            if (city != null && client != null && client.getPaymentProfiles() != null)
            {
                a(city, client.getPaymentProfiles(), client.getCreditBalances());
            }
            b(flag, flag1);
        }
        h();
    }

    public final void b()
    {
        c();
        if (dum.j(d.b()))
        {
            e();
        } else
        {
            g();
        }
        d();
    }

    public final void c()
    {
        if (!isInEditMode() && d.f())
        {
            com.ubercab.rider.realtime.model.Profile profile = d.b();
            mProfileNameTextView.setText(dum.a(profile, getContext()));
            mProfileNameTextViewMeasuring.setText(dum.a(profile, getContext()));
            ezc.a(mBadgeView, profile, c);
        }
    }

    public void onExpenseInfoClick()
    {
        k.a();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        boolean flag;
        if (!d.f() && !d.g() && !d.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (isInEditMode() || flag)
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            j = getResources().getDimensionPixelSize(0x7f080299);
            return;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (h)
        {
            if (n != null)
            {
                n.b();
            }
            return true;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public void onPaymentContainerClick()
    {
        k.c();
    }

    public void onProfileContainerClick()
    {
        k.b();
    }
}
