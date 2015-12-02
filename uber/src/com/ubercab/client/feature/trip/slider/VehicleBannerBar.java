// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import chp;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Tagline;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.VehicleView;
import czi;
import dbf;
import dux;
import fqp;
import fte;
import gdt;
import gdu;
import gjz;
import gmg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l;

public class VehicleBannerBar extends LinearLayout
{

    public chp a;
    public gmg b;
    public fte c;
    private Boolean d;
    private ObjectAnimator e;
    private ObjectAnimator f;
    private final List g;
    TextView mTextViewDetail;
    TextView mTextViewTitle;

    public VehicleBannerBar(Context context)
    {
        this(context, null);
    }

    public VehicleBannerBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleBannerBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        g = new CopyOnWriteArrayList();
        if (!isInEditMode())
        {
            ((fqp)((czi)context).d()).a(this);
        }
    }

    static Boolean a(VehicleBannerBar vehiclebannerbar, Boolean boolean1)
    {
        vehiclebannerbar.d = boolean1;
        return boolean1;
    }

    private CharSequence a(String s)
    {
        return dux.a((String)gjz.a(s), getResources().getColor(0x7f0d0078));
    }

    static void a(VehicleBannerBar vehiclebannerbar)
    {
        vehiclebannerbar.e();
    }

    private gdt b(City city, Trip trip)
    {
        if (trip == null)
        {
            city = city.findVehicleViewById(c.m());
            if (city == null)
            {
                city = null;
            } else
            {
                city = city.getTagline();
            }
            if (city != null && !TextUtils.isEmpty(city.getDetail()) && !TextUtils.isEmpty(city.getTitle()))
            {
                if (b.a(dbf.cM))
                {
                    trip = a(city.getDetail());
                } else
                {
                    trip = city.getDetail();
                }
                return new gdt(a(city.getTitle()), trip, (byte)0);
            }
        }
        return null;
    }

    private void c()
    {
        int i = a();
        int j = getContext().getResources().getInteger(0x7f0b0010);
        e = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            (float)i, 0.0F
        });
        f = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            0.0F, (float)i
        });
        e.setDuration(j);
        f.setDuration(j);
        e.setInterpolator(new DecelerateInterpolator());
        f.setInterpolator(new DecelerateInterpolator());
        e.addListener(new AnimatorListenerAdapter() {

            final VehicleBannerBar a;

            public final void onAnimationCancel(Animator animator)
            {
                VehicleBannerBar.a(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                VehicleBannerBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                VehicleBannerBar.a(a, Boolean.valueOf(true));
                VehicleBannerBar.a(a);
            }

            
            {
                a = VehicleBannerBar.this;
                super();
            }
        });
        f.addListener(new AnimatorListenerAdapter() {

            final VehicleBannerBar a;

            public final void onAnimationCancel(Animator animator)
            {
                VehicleBannerBar.a(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                VehicleBannerBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                VehicleBannerBar.a(a, Boolean.valueOf(false));
            }

            
            {
                a = VehicleBannerBar.this;
                super();
            }
        });
    }

    private void d()
    {
        f.cancel();
        e.cancel();
    }

    private void e()
    {
        int i;
        if (b())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    private void f()
    {
        a.a(l.ja);
        e.start();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gdu)iterator.next()).a()) { }
    }

    private void g()
    {
        f.start();
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((gdu)iterator.next()).a()) { }
    }

    final int a()
    {
        return getResources().getDimensionPixelSize(0x7f0802b9);
    }

    final void a(City city, Trip trip)
    {
        city = b(city, trip);
        if (city != null) goto _L2; else goto _L1
_L1:
        if (d != null) goto _L4; else goto _L3
_L3:
        d = Boolean.valueOf(false);
        setTranslationY(a());
        e();
_L6:
        return;
_L4:
        if (d.booleanValue())
        {
            d();
            g();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        mTextViewTitle.setText(((gdt) (city)).a);
        mTextViewDetail.setText(((gdt) (city)).b);
        if (d == null)
        {
            d = Boolean.valueOf(true);
            setTranslationY(0.0F);
            e();
            return;
        }
        if (!d.booleanValue())
        {
            d();
            f();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void a(gdu gdu1)
    {
        g.add(gdu1);
    }

    final boolean b()
    {
        return d != null && d.booleanValue();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        c();
    }
}
