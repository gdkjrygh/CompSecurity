// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.feature.profiles.ProfileContainerView;
import czi;
import dbf;
import dum;
import eyn;
import eyy;
import ezj;
import ezm;
import ezs;
import fqp;
import fsx;
import gdq;
import gfa;
import gfn;
import gfp;
import gmg;
import hkr;
import n;

public class TrayProfilesLayout extends FrameLayout
    implements eyn
{

    public chp a;
    public cev b;
    public hkr c;
    public gmg d;
    public eyy e;
    public gfn f;
    public fsx g;
    public boolean h;
    public int i;
    gfa j;
    public ProfileContainerView mProfileContainerView;

    public TrayProfilesLayout(Context context)
    {
        this(context, null, 0);
    }

    public TrayProfilesLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TrayProfilesLayout(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        if (!isInEditMode())
        {
            ((fqp)((czi)getContext()).d()).a(this);
        }
    }

    public static void a(TrayProfilesLayout trayprofileslayout)
    {
        trayprofileslayout.d();
    }

    private void d()
    {
        h = true;
        mProfileContainerView.a(this);
        i = mProfileContainerView.a();
        mProfileContainerView.b();
        j.a(c.b(), c.c());
    }

    public final void a()
    {
        chp chp1 = a;
        Object obj;
        if (gfa.a(j))
        {
            obj = n.jg;
        } else
        {
            obj = n.jf;
        }
        chp1.a(((cif) (obj)));
        obj = RiderTripExpenseInfo.create(g.b());
        ((RiderTripExpenseInfo) (obj)).setExpenseTrip(dum.h(e.b()));
        b.c(new ezj(((com.ubercab.rider.realtime.model.TripExpenseInfo) (obj))));
    }

    public final void b()
    {
        chp chp1 = a;
        n n1;
        if (gfa.a(j))
        {
            n1 = n.jm;
        } else
        {
            n1 = n.jl;
        }
        chp1.a(n1);
        b.c(new ezs());
    }

    public final void c()
    {
        a.a(n.jh);
        f.b();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b.a(this);
    }

    public void onCurrentlySelectedProfileSetEvent(ezm ezm)
    {
        if (mProfileContainerView != null)
        {
            mProfileContainerView.a(false);
            mProfileContainerView.b();
            j.b(j.d);
            j.a(j.e);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b.b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        break MISSING_BLOCK_LABEL_4;
        if (!isInEditMode() && !d.b(dbf.aH))
        {
            j = new gfa(this);
            ButterKnife.inject(this);
            gfp.a(this, j);
            if (e.f())
            {
                d();
                return;
            }
        }
        return;
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TrayProfilesLayout$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

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

}
