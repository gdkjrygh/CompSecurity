// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import butterknife.ButterKnife;
import com.ubercab.client.feature.trip.confirm.ConfirmationRequestButton;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.TextView;
import gdi;
import gdj;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.trip.ridepool:
//            RideHijackItemView

public class RideHijackView extends LinearLayout
{

    ObjectAnimator a;
    ObjectAnimator b;
    ObjectAnimator c;
    ObjectAnimator d;
    private final gdj e;
    private gdi f;
    LinearLayout mCallOutContainer;
    TextView mCallOutView;
    TextView mLeftItemMemo;
    RideHijackItemView mLeftItemView;
    LinearLayout mLeftMemoContainer;
    ViewSwitcher mMemoViewSwitcher;
    ConfirmationRequestButton mRequestButton;
    TextView mRightItemMemo;
    RideHijackItemView mRightItemView;
    LinearLayout mRightMemoContainer;
    TextView mTextEta;
    LinearLayout mToggleContainer;
    ViewGroup mTripSummaryContainer;

    public RideHijackView(Context context)
    {
        this(context, null, 0);
    }

    public RideHijackView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RideHijackView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new gdj(this, (byte)0);
    }

    private void j()
    {
        Resources resources = getResources();
        int i1 = resources.getDimensionPixelSize(0x7f0801ec);
        int j1 = resources.getInteger(0x7f0b000c);
        d = ObjectAnimator.ofInt(e, "viewSwitcherHeight", new int[] {
            0, i1
        });
        d.setDuration(j1);
        d.setInterpolator(new DecelerateInterpolator());
        d.addListener(new AnimatorListenerAdapter() {

            final RideHijackView a;

            public final void onAnimationStart(Animator animator)
            {
                a.mMemoViewSwitcher.setVisibility(0);
            }

            
            {
                a = RideHijackView.this;
                super();
            }
        });
        c = ObjectAnimator.ofInt(e, "viewSwitcherHeight", new int[] {
            i1, 0
        });
        c.setDuration(j1);
        c.setInterpolator(new DecelerateInterpolator());
        c.addListener(new AnimatorListenerAdapter() {

            final RideHijackView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mMemoViewSwitcher.setVisibility(8);
            }

            
            {
                a = RideHijackView.this;
                super();
            }
        });
    }

    private void k()
    {
        Resources resources = getResources();
        int i1 = resources.getDimensionPixelSize(0x7f0801e6);
        int j1 = resources.getInteger(0x7f0b000c);
        b = ObjectAnimator.ofFloat(mCallOutContainer, "translationY", new float[] {
            (float)i1, 0.0F
        });
        b.setDuration(j1);
        b.setInterpolator(new DecelerateInterpolator());
        b.addListener(new AnimatorListenerAdapter() {

            final RideHijackView a;

            public final void onAnimationStart(Animator animator)
            {
                a.mCallOutContainer.setVisibility(0);
            }

            
            {
                a = RideHijackView.this;
                super();
            }
        });
        a = ObjectAnimator.ofFloat(mCallOutContainer, "translationY", new float[] {
            0.0F, (float)i1
        });
        a.setDuration(j1);
        a.setInterpolator(new DecelerateInterpolator());
        a.addListener(new AnimatorListenerAdapter() {

            final RideHijackView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mCallOutContainer.setVisibility(8);
            }

            
            {
                a = RideHijackView.this;
                super();
            }
        });
    }

    private void l()
    {
        mMemoViewSwitcher.setInAnimation(getContext(), 0x7f040019);
        mMemoViewSwitcher.setOutAnimation(getContext(), 0x7f04001c);
    }

    private void m()
    {
        if (d != null)
        {
            d.end();
        }
        if (c != null)
        {
            c.end();
        }
        if (b != null)
        {
            b.end();
        }
        if (a != null)
        {
            a.end();
        }
    }

    public final void a()
    {
        f = null;
        m();
        ButterKnife.reset(this);
        ((ViewGroup)getParent()).removeView(this);
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            if (c != null && c.isStarted())
            {
                c.cancel();
            }
            if (!d.isStarted())
            {
                d.start();
            }
        } else
        {
            if (d != null && d.isStarted())
            {
                d.cancel();
            }
            if (!c.isStarted())
            {
                c.start();
                return;
            }
        }
    }

    public final void a(VehicleView vehicleview, boolean flag)
    {
        mRequestButton.a(vehicleview, flag);
    }

    public final void a(gdi gdi1)
    {
        f = gdi1;
    }

    public final void a(String s)
    {
        mLeftItemView.a(s);
    }

    public final void a(String s, String s1)
    {
        mLeftItemMemo.setText(s);
        mRightItemMemo.setText(s1);
    }

    public final void a(Map map, VehicleView vehicleview)
    {
        map = (NearbyVehicle)map.get(vehicleview.getId());
        if (map == null)
        {
            return;
        }
        map = map.getEtaString();
        vehicleview = vehicleview.getPickupEtaString();
        if (!TextUtils.isEmpty(map))
        {
            if (TextUtils.isEmpty(vehicleview))
            {
                map = null;
            } else
            {
                map = vehicleview.replace("{string}", map);
            }
            mTextEta.setText(map);
            mTextEta.setVisibility(0);
            return;
        } else
        {
            mTextEta.setText(0x7f07077e);
            mTextEta.setVisibility(4);
            return;
        }
    }

    public final void b()
    {
        mLeftItemView.setSelected(true);
        mRightItemView.setSelected(false);
    }

    public final void b(int i1)
    {
        e();
        if (i1 == 0)
        {
            if (a != null && a.isStarted())
            {
                a.cancel();
            }
            if (!b.isStarted())
            {
                b.start();
            }
        } else
        {
            if (b != null && b.isStarted())
            {
                b.cancel();
            }
            if (!a.isStarted())
            {
                a.start();
                return;
            }
        }
    }

    public final void b(String s)
    {
        mLeftItemView.b(s);
    }

    public final void c()
    {
        mRightItemView.setSelected(true);
        mLeftItemView.setSelected(false);
    }

    public final void c(String s)
    {
        mRightItemView.a(s);
    }

    public final void d()
    {
        if (mMemoViewSwitcher.getCurrentView().equals(mRightMemoContainer))
        {
            mMemoViewSwitcher.showNext();
        }
    }

    public final void d(String s)
    {
        mRightItemView.b(s);
    }

    public final void e()
    {
        if (mMemoViewSwitcher.getCurrentView().equals(mLeftMemoContainer))
        {
            mMemoViewSwitcher.showPrevious();
        }
    }

    public final void e(String s)
    {
        mCallOutView.setText(s);
    }

    public final String f()
    {
        return mCallOutView.getText().toString();
    }

    public final void g()
    {
        mCallOutView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f0202d4, 0);
    }

    public final void h()
    {
        mToggleContainer.setBackgroundResource(0x7f02010d);
    }

    public final void i()
    {
        mTripSummaryContainer.setVisibility(0);
    }

    public void onCallOutClick()
    {
        f.c();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
        k();
        j();
        l();
    }

    public void onLeftItemViewClick()
    {
        b();
        f.a();
    }

    public void onRequestButtonClick()
    {
        f.d();
    }

    public void onRightItemViewClick()
    {
        c();
        f.b();
    }
}
