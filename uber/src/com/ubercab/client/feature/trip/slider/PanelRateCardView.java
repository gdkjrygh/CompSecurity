// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Fare;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import czi;
import fqc;
import fqp;
import fte;
import fym;
import fyy;
import java.util.Map;
import n;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            SurgeCircleView, RateCardAddressView

public class PanelRateCardView extends LinearLayout
{

    public chp a;
    public cev b;
    public fqc c;
    public fte d;
    private Map e;
    private Map f;
    private int g;
    private String h;
    private Map i;
    RateCardAddressView mAddressViewDestination;
    ProgressBar mProgressBarLoading;
    SurgeCircleView mSurgeCircle;
    View mSurgeSpacer;
    TextView mTextViewEta;
    TextView mTextViewFare;
    TextView mTextViewFareEstimateError;
    TextView mTextViewLegend;
    TextView mTextViewMaxSize;
    TextView mTextViewMinFare;
    FrameLayout mViewGroupDestination;
    ViewGroup mViewGroupEstimate;
    FrameLayout mViewGroupFare;
    ViewGroup mViewGroupMinFare;
    ViewGroup mViewGroupPostFare;
    ViewGroup mViewGroupPreFare;

    public PanelRateCardView(Context context)
    {
        this(context, null);
    }

    public PanelRateCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PanelRateCardView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        if (!isInEditMode())
        {
            ((fqp)((czi)context).d()).a(this);
        }
        g = getResources().getDimensionPixelSize(0x7f08027b);
    }

    private void a(VehicleView vehicleview)
    {
        int j;
        int k;
        boolean flag;
        if (vehicleview.getAllowFareEstimate() && vehicleview.isDestinationEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        if (flag)
        {
            k = 0x7f0200fb;
        } else
        {
            k = 0x7f0200e9;
        }
        mViewGroupFare.setBackgroundResource(k);
        mViewGroupMinFare.setBackgroundResource(k);
        mViewGroupEstimate.setEnabled(flag);
        mViewGroupEstimate.setVisibility(j);
        mViewGroupDestination.setEnabled(flag);
        mViewGroupDestination.setVisibility(j);
        mTextViewLegend.setVisibility(j);
    }

    private void a(VehicleView vehicleview, DynamicFare dynamicfare)
    {
        if (dynamicfare != null)
        {
            boolean flag;
            if (dynamicfare.getMultiplier() > 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag & vehicleview.getAllowedToSurge())
            {
                mSurgeCircle.a(String.format("%sx", new Object[] {
                    Float.valueOf(dynamicfare.getMultiplier())
                }));
                vehicleview = mSurgeSpacer.getLayoutParams();
                vehicleview.width = g;
                mSurgeSpacer.setLayoutParams(vehicleview);
                mSurgeSpacer.setBackgroundResource(0);
                mSurgeCircle.a();
                return;
            }
        }
        vehicleview = mSurgeSpacer.getLayoutParams();
        vehicleview.width = 1;
        mSurgeSpacer.setLayoutParams(vehicleview);
        mSurgeSpacer.setBackgroundResource(0x7f020128);
        mSurgeCircle.b();
    }

    private void b(VehicleView vehicleview)
    {
        if (f != null)
        {
            vehicleview = (NearbyVehicle)f.get(vehicleview.getId());
        } else
        {
            vehicleview = null;
        }
        if (vehicleview != null)
        {
            vehicleview = vehicleview.getEtaStringShort();
            if (!TextUtils.isEmpty(vehicleview))
            {
                mTextViewEta.setText(vehicleview);
                return;
            }
        }
        mTextViewEta.setText(getResources().getString(0x7f07077d));
    }

    private void b(VehicleView vehicleview, DynamicFare dynamicfare)
    {
        if (!vehicleview.getAllowFareEstimate())
        {
            mTextViewMinFare.setText(getResources().getString(0x7f07077d));
            return;
        }
        vehicleview = vehicleview.getFare();
        if (dynamicfare == null || dynamicfare.getMultiplier() <= 1.0F)
        {
            dynamicfare = vehicleview;
        }
        if (dynamicfare != null && !TextUtils.isEmpty(dynamicfare.getMinimum()))
        {
            mTextViewMinFare.setText(dynamicfare.getMinimum());
            return;
        } else
        {
            mTextViewMinFare.setText(getResources().getString(0x7f07077d));
            return;
        }
    }

    private void c()
    {
        VehicleView vehicleview = g();
        if (vehicleview == null)
        {
            return;
        } else
        {
            DynamicFare dynamicfare = f();
            e();
            d();
            a(vehicleview, dynamicfare);
            c(vehicleview);
            b(vehicleview, dynamicfare);
            b(vehicleview);
            a(vehicleview);
            return;
        }
    }

    private void c(VehicleView vehicleview)
    {
        int j = vehicleview.getCapacity();
        if (j == 1)
        {
            vehicleview = getResources().getString(0x7f070087);
        } else
        {
            vehicleview = getResources().getString(0x7f070086, new Object[] {
                Integer.valueOf(j)
            });
        }
        mTextViewMaxSize.setText(vehicleview);
    }

    private void d()
    {
        if (g() != null && !g().getAllowFareEstimate())
        {
            mViewGroupPreFare.setVisibility(0);
            mViewGroupPostFare.setVisibility(8);
            return;
        }
        if (d.j())
        {
            mAddressViewDestination.a(d.i());
            mViewGroupPreFare.setVisibility(8);
            mViewGroupPostFare.setVisibility(0);
            return;
        } else
        {
            mViewGroupPreFare.setVisibility(0);
            mViewGroupPostFare.setVisibility(8);
            return;
        }
    }

    private void e()
    {
        boolean flag = true;
        boolean flag1 = false;
        int k = c.a();
        Object obj;
        String s;
        Map map;
        int j;
        if (k == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (k != 2)
        {
            flag = false;
        }
        obj = mProgressBarLoading;
        if (j != 0)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        ((ProgressBar) (obj)).setVisibility(k);
        obj = mTextViewFare;
        if (j != 0 || flag)
        {
            j = 8;
        } else
        {
            j = 0;
        }
        ((TextView) (obj)).setVisibility(j);
        obj = mTextViewFareEstimateError;
        if (flag)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 8;
        }
        ((TextView) (obj)).setVisibility(j);
        s = "";
        map = c.b();
        obj = s;
        if (map != null)
        {
            obj = s;
            if (map.containsKey(h))
            {
                obj = (String)map.get(h);
            }
        }
        mTextViewFare.setText(((CharSequence) (obj)));
    }

    private DynamicFare f()
    {
        if (TextUtils.isEmpty(h) || e == null)
        {
            return null;
        } else
        {
            return (DynamicFare)e.get(h);
        }
    }

    private VehicleView g()
    {
        if (TextUtils.isEmpty(h) || i == null)
        {
            return null;
        } else
        {
            return (VehicleView)i.get(h);
        }
    }

    private void h()
    {
        a.a(n.dv);
        b.c(new fym());
    }

    final void a()
    {
        e();
    }

    final void a(String s)
    {
        h = s;
        c();
    }

    final void a(Map map, Map map1, Map map2)
    {
        i = map;
        f = map1;
        e = map2;
        c();
    }

    final void b()
    {
        d();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    public void onViewGroupDestinationClick()
    {
        h();
    }

    public void onViewGroupEstimateClick()
    {
        h();
    }

    public void onViewGroupFareClick()
    {
        b.c(new fyy());
    }

    public void onViewGroupMinFareClick()
    {
        b.c(new fyy());
    }
}
