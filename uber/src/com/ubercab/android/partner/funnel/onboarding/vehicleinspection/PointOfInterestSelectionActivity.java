// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import chp;
import cif;
import cis;
import ciu;
import ciw;
import cnx;
import cob;
import coc;
import coe;
import cof;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLocation;
import com.ubercab.android.location.service.model.UberLocationRequest;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.signup.form.model.PointOfInterest;
import com.ubercab.ui.Toolbar;
import cpu;
import cpw;
import cpx;
import cqg;
import cqi;
import csb;
import ctp;
import cub;
import cuk;
import cun;
import cuq;
import java.util.ArrayList;

public abstract class PointOfInterestSelectionActivity extends PartnerFunnelActivity
    implements ciw, cpx, ctp, cub, cuk
{

    public chp d;
    public cqg e;
    public cpu f;
    public cpw g;
    int h;
    private String i;
    private Toolbar j;
    private ValueAnimator k;
    private cis l;

    public PointOfInterestSelectionActivity()
    {
        i = "UNKNOWN";
    }

    static cis a(PointOfInterestSelectionActivity pointofinterestselectionactivity, cis cis1)
    {
        pointofinterestselectionactivity.l = cis1;
        return cis1;
    }

    private static String a(Fragment fragment)
    {
        return fragment.getClass().getName();
    }

    static String a(PointOfInterestSelectionActivity pointofinterestselectionactivity)
    {
        return pointofinterestselectionactivity.i;
    }

    private void a(int i1)
    {
        h = i1;
        j.getBackground().setAlpha(i1);
    }

    static void a(PointOfInterestSelectionActivity pointofinterestselectionactivity, int i1)
    {
        pointofinterestselectionactivity.a(i1);
    }

    static cis b(PointOfInterestSelectionActivity pointofinterestselectionactivity)
    {
        return pointofinterestselectionactivity.l;
    }

    private void l()
    {
        if (k != null && k.isRunning())
        {
            k.cancel();
            k = null;
        }
    }

    private void m()
    {
        l();
        if (h != 255)
        {
            k = ValueAnimator.ofInt(new int[] {
                h, 255
            });
            k.setDuration(getResources().getInteger(0x10e0000));
            k.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final PointOfInterestSelectionActivity a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    PointOfInterestSelectionActivity.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                }

            
            {
                a = PointOfInterestSelectionActivity.this;
                super();
            }
            });
            k.start();
        }
    }

    protected abstract cun a(ArrayList arraylist);

    protected abstract cuq a(ArrayList arraylist, PointOfInterest pointofinterest);

    public final void a(int i1, int j1, int k1, int l1)
    {
        l();
        a(((i1 - j1) * 255) / (k1 - j1));
    }

    protected final void a(Fragment fragment, boolean flag)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction().setCustomAnimations(cnx.ub__partner_funnel_slide_in_bottom_short, cnx.ub__partner_funnel_slide_out_bottom_short, cnx.ub__partner_funnel_slide_in_bottom_short, cnx.ub__partner_funnel_slide_out_bottom_short).addToBackStack(null);
        if (flag)
        {
            Fragment fragment1 = getSupportFragmentManager().findFragmentById(cob.ub__partner_funnel_onboarding_vehicle_inspection_fragment_main);
            if (fragment1 != null)
            {
                fragmenttransaction.remove(fragment1);
            }
            fragmenttransaction.add(cob.ub__partner_funnel_onboarding_vehicle_inspection_fragment_oversized, fragment, a(fragment));
        } else
        {
            fragmenttransaction.replace(cob.ub__partner_funnel_onboarding_vehicle_inspection_fragment_main, fragment, a(fragment));
        }
        fragmenttransaction.commit();
    }

    public final void a(ciu ciu)
    {
        b_();
    }

    public final void a(UberLocation uberlocation)
    {
    }

    public final void a(PointOfInterest pointofinterest)
    {
        d.a(AnalyticsEvent.create("tap").setName(f()).setValue(pointofinterest.getPoiId()));
        pointofinterest = a(g(), pointofinterest);
        e.a(coe.ub__partner_funnel_empty);
        a(((Fragment) (pointofinterest)), true);
    }

    public final void a(String s)
    {
        i = s;
        runOnUiThread(new Runnable() {

            final PointOfInterestSelectionActivity a;

            public final void run()
            {
                PointOfInterestSelectionActivity.a(a, csb.a(a.getApplication(), PointOfInterestSelectionActivity.a(a)));
                PointOfInterestSelectionActivity.b(a).a(UberLocationRequest.create().setPriority(2).setFastestInterval(cqi.a).setInterval(cqi.a));
                PointOfInterestSelectionActivity.b(a).a(a);
                PointOfInterestSelectionActivity.b(a).c();
            }

            
            {
                a = PointOfInterestSelectionActivity.this;
                super();
            }
        });
    }

    public final void b_()
    {
        runOnUiThread(new Runnable() {

            final PointOfInterestSelectionActivity a;

            public final void run()
            {
                PointOfInterestSelectionActivity.b(a).b(a);
                if ((cun)a.a(cun) == null)
                {
                    a.a(a.a(a.g()), false);
                }
            }

            
            {
                a = PointOfInterestSelectionActivity.this;
                super();
            }
        });
    }

    public final void c_()
    {
        a("UNKNOWN");
    }

    public int e()
    {
        return cof.Theme_Uber_Partner_Funnel_Toolbar_White;
    }

    protected abstract cif f();

    protected abstract ArrayList g();

    protected abstract int h();

    public final String j()
    {
        return i;
    }

    public final cis k()
    {
        return l;
    }

    public void onBackPressed()
    {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1)
        {
            e.a(h());
            m();
            super.onBackPressed();
            return;
        } else
        {
            NavUtils.navigateUpFromSameTask(this);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_onboarding_vehicle_inspection_activity);
        j = (Toolbar)findViewById(cob.ub__partner_funnel_toolbar);
        a(j);
        a(255);
        e.a(true);
        e.a(h());
        g.a(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (l != null && l.b())
        {
            l.b(this);
            l.d();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
