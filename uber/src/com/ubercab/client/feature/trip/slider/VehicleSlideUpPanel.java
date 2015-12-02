// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import cyi;
import duq;
import fqp;
import gdp;
import gdq;
import gdr;
import gdu;
import gdw;
import gdy;
import gdz;
import gec;
import geg;
import gjy;
import gka;
import gki;
import gmg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import n;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionsBar, VehicleSeekBar, VehicleBannerBar, VehicleLabelBar, 
//            PanelRateCardView, VehicleOptionGroup, SlidePanelLayout

public class VehicleSlideUpPanel extends FrameLayout
    implements gdp, gdu, gdw, gdy, gdz
{

    public chp a;
    public cyi b;
    public cev c;
    public gmg d;
    private final List e;
    private String f;
    private String g;
    private duq h;
    private List i;
    private boolean j;
    VehicleBannerBar mBannerBar;
    TextView mBunkerMessage;
    VehicleLabelBar mLabelBar;
    VehicleOptionsBar mOptionsBar;
    PanelRateCardView mPanelRateCard;
    VehicleSeekBar mSeekBar;
    SlidePanelLayout mSlidePanelLayout;
    LinearLayout mViewGroupHeader;
    ViewGroup mViewGroupPanelContent;
    ViewGroup mViewGroupSlider;

    public VehicleSlideUpPanel(Context context)
    {
        this(context, null);
    }

    public VehicleSlideUpPanel(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleSlideUpPanel(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e = new CopyOnWriteArrayList();
        if (!isInEditMode())
        {
            ((fqp)((TripActivity)context).d()).a(this);
        }
    }

    private void a(float f1, int k)
    {
        if (h == null)
        {
            h = new duq(com/ubercab/client/feature/trip/event/PanelSlideEvent);
        }
        PanelSlideEvent panelslideevent = ((PanelSlideEvent)h.a()).a(k, f1);
        c.c(panelslideevent);
    }

    private void b(String s, String s1)
    {
        if (!s.equals(f) || !s1.equals(g))
        {
            f = s;
            g = s1;
            s = e.iterator();
            while (s.hasNext()) 
            {
                ((gec)s.next()).a(g);
            }
        }
    }

    private geg c(String s)
    {
        return (geg)gki.d(i, new gka(s) {

            final String a;
            final VehicleSlideUpPanel b;

            private boolean a(geg geg1)
            {
                return geg1.a(a);
            }

            public final boolean apply(Object obj)
            {
                return a((geg)obj);
            }

            
            {
                b = VehicleSlideUpPanel.this;
                a = s;
                super();
            }
        }).d();
    }

    private void d(String s)
    {
        mBunkerMessage.setText(s);
        mBunkerMessage.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0F).setListener(new AnimatorListenerAdapter() {

            final VehicleSlideUpPanel a;

            public final void onAnimationStart(Animator animator)
            {
                a.mBunkerMessage.setVisibility(0);
            }

            
            {
                a = VehicleSlideUpPanel.this;
                super();
            }
        }).start();
    }

    private void i()
    {
        mBunkerMessage.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.0F).setListener(new AnimatorListenerAdapter() {

            final VehicleSlideUpPanel a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mBunkerMessage.setVisibility(8);
            }

            
            {
                a = VehicleSlideUpPanel.this;
                super();
            }
        }).start();
    }

    public final void a()
    {
        gec gec1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); gec1.b())
        {
            gec1 = (gec)iterator.next();
            mOptionsBar.b();
        }

    }

    public final void a(MotionEvent motionevent)
    {
        mSeekBar.onTouchEvent(motionevent);
    }

    public final void a(City city, Map map, Map map1, Trip trip, String s)
    {
        s = geg.a(city, map, map1, s);
        if (s.equals(i))
        {
            return;
        } else
        {
            mBannerBar.a(city, trip);
            i = s;
            mSeekBar.a(i);
            mLabelBar.a(i);
            mOptionsBar.a(i, map);
            mPanelRateCard.a(city.getVehicleViews(), map1, map);
            return;
        }
    }

    public final void a(gdr gdr1)
    {
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[gdq.values().length];
                try
                {
                    a[gdq.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[gdq.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[gdq.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        String s;
        if (gdr1.d())
        {
            s = "swipe";
        } else
        {
            s = "tap";
        }
        _cls4.a[gdr1.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 67
    //                   2 101;
           goto _L1 _L2 _L3
_L1:
        a(gdr1.b(), mViewGroupPanelContent.getMeasuredHeight());
        return;
_L2:
        a.a(AnalyticsEvent.create("tap").setName(n.dz).setValue(s));
        b.a(true);
        continue; /* Loop/switch isn't completed */
_L3:
        a.a(AnalyticsEvent.create("tap").setName(n.dy).setValue(s));
        b.a(false);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(gec gec1)
    {
        e.add(gec1);
    }

    public final void a(String s)
    {
        if (s.equals(f))
        {
            return;
        } else
        {
            mOptionsBar.a(s);
            b(s, mOptionsBar.c());
            a.a(AnalyticsEvent.create("tap").setName(n.dx).setValue("switch_product").setValuePosition(Long.valueOf(mSeekBar.getProgress())));
            return;
        }
    }

    public final void a(String s, String s1)
    {
        b(s, s1);
        s = mOptionsBar.c(s1);
        if (s == null)
        {
            return;
        } else
        {
            int k = s.a().b(s1);
            a.a(AnalyticsEvent.create("tap").setName(n.dw).setValue("switch_product").setValuePosition(Long.valueOf(k)));
            return;
        }
    }

    public final void a(List list)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gec)iterator.next()).a(list)) { }
    }

    public final void a(boolean flag)
    {
        mSlidePanelLayout.a(flag);
    }

    public final void b()
    {
        gec gec1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); gec1.b())
        {
            gec1 = (gec)iterator.next();
            mOptionsBar.b();
        }

    }

    public final void b(gec gec1)
    {
        e.remove(gec1);
    }

    public final void b(String s)
    {
        Object obj = c(s);
        if (obj == null)
        {
            f = null;
            g = null;
            return;
        } else
        {
            obj = ((geg) (obj)).a();
            f = ((String) (obj));
            g = s;
            mSeekBar.a(((String) (obj)));
            mOptionsBar.b(s);
            mPanelRateCard.a(s);
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            if (!j)
            {
                j = true;
                d(getContext().getString(0x7f07066d));
            }
        } else
        if (j)
        {
            j = false;
            i();
            return;
        }
    }

    public final void c()
    {
        if (mSlidePanelLayout.e() == gdq.a)
        {
            mSlidePanelLayout.d();
            return;
        } else
        {
            mSlidePanelLayout.c();
            return;
        }
    }

    public final boolean d()
    {
        return mSlidePanelLayout.a();
    }

    public final void e()
    {
        mPanelRateCard.b();
    }

    public final void f()
    {
        mPanelRateCard.a();
    }

    public final int g()
    {
        int k = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x40000000);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mViewGroupHeader.measure(k, l);
        return mViewGroupSlider.getMeasuredHeight();
    }

    public final int h()
    {
        if (mOptionsBar.b())
        {
            return g() + mOptionsBar.a();
        }
        if (mBannerBar.b())
        {
            return g() + mBannerBar.a();
        }
        if (j)
        {
            return g() + mBunkerMessage.getHeight();
        } else
        {
            return g();
        }
    }

    public void onClickBannerBar()
    {
        a.a(AnalyticsEvent.create("tap").setName(n.jt));
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gec)iterator.next()).b(g)) { }
    }

    public void onClickBunkerMessage()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((gec)iterator.next()).a()) { }
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
            mSeekBar.a(this);
            mSlidePanelLayout.a(this);
            mOptionsBar.a(this);
            mBannerBar.a(this);
            return;
        }
    }
}
