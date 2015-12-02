// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.surge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.vendor.google.GmmProductSurge;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import czj;
import czq;
import daj;
import dak;
import dfe;
import dfp;
import dtp;
import foe;
import fof;
import foo;
import fop;
import fpa;
import fpb;
import fpc;
import fpd;
import fpe;
import fpf;
import hkm;
import hkr;
import ica;
import icl;
import ico;
import java.util.Collection;
import java.util.Collections;
import k;
import n;

// Referenced classes of package com.ubercab.client.feature.surge:
//            SurgeFragmentDeprecated

public class SurgeActivityDeprecated extends RiderActivity
{

    public chp h;
    public hkr i;
    public czq j;
    public daj k;
    public dak l;
    public hkm m;
    private String n;
    private icl o;
    private boolean p;

    public SurgeActivityDeprecated()
    {
    }

    public static Intent a(Context context, String s1, boolean flag, GmmProductSurge gmmproductsurge)
    {
        context = new Intent(context, com/ubercab/client/feature/surge/SurgeActivityDeprecated);
        context.putExtra("com.ubercab.SELECTED_VEHICLE_VIEW", s1);
        context.putExtra("com.ubercab.SHOW_SOBRIETY", flag);
        context.putExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED", gmmproductsurge);
        return context;
    }

    public static String a(SurgeActivityDeprecated surgeactivitydeprecated)
    {
        return surgeactivitydeprecated.n;
    }

    private void a(long l1)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.FARE_ID", l1);
        setResult(-1, intent);
        finish();
    }

    private void a(fop fop1)
    {
        fop1.a(this);
    }

    private fop b(dfp dfp)
    {
        return foe.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (getSupportFragmentManager().findFragmentByTag(SurgeFragmentDeprecated.a) == null)
        {
            SurgeFragmentDeprecated.a(false, (GmmProductSurge)getIntent().getParcelableExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED")).show(getSupportFragmentManager(), SurgeFragmentDeprecated.a);
        }
    }

    private void g()
    {
        SurgeFragmentDeprecated surgefragmentdeprecated = (SurgeFragmentDeprecated)getSupportFragmentManager().findFragmentByTag(SurgeFragmentDeprecated.a);
        if (surgefragmentdeprecated != null)
        {
            surgefragmentdeprecated.dismiss();
        }
        SurgeFragmentDeprecated.a(true, (GmmProductSurge)getIntent().getParcelableExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED")).show(getSupportFragmentManager(), SurgeFragmentDeprecated.b);
        p = true;
    }

    private boolean h()
    {
        return getIntent().getBooleanExtra("com.ubercab.SHOW_SOBRIETY", false);
    }

    private void i()
    {
        h.a(n.hg);
    }

    private void j()
    {
        h.a(k.k);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fop)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        n = getIntent().getStringExtra("com.ubercab.SELECTED_VEHICLE_VIEW");
        f();
    }

    protected final Collection e()
    {
        return Collections.singleton(j);
    }

    public void onBackPressed()
    {
        if (getSupportFragmentManager().findFragmentByTag(SurgeFragmentDeprecated.b) == null)
        {
            i();
        }
        super.onBackPressed();
    }

    public void onPause()
    {
        super.onPause();
        if (o != null && !o.c())
        {
            o.b();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        n = bundle.getString("com.ubercab.BUNDLE_VEHICLE_VIEW_ID", null);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.BUNDLE_VEHICLE_VIEW_ID", n);
    }

    public void onSurgeAcceptedEvent(fpa fpa1)
    {
        if (h() && !p)
        {
            fpa1 = (SurgeFragmentDeprecated)a(com/ubercab/client/feature/surge/SurgeFragmentDeprecated);
            if (fpa1 != null)
            {
                fpa1.dismiss();
            }
            g();
            return;
        } else
        {
            a(fpa1.a());
            return;
        }
    }

    public void onSurgeCancelledEvent(fpb fpb)
    {
        i();
        setResult(0);
        finish();
    }

    public void onSurgeConfirmNotificationEvent(fpc fpc1)
    {
        Object obj = i.b();
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(n);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            long l1 = fpc1.a();
            int i1 = Integer.valueOf(((VehicleView) (obj)).getId()).intValue();
            fpc1 = l.b();
            if (fpc1 == null)
            {
                fpc1 = null;
            } else
            {
                fpc1 = fpc1.getCnLocation();
            }
            if (fpc1 != null)
            {
                b(getString(0x7f070453), null);
                o = m.a(l1, i1, fpc1).a(ico.a()).a(new foo(this, (byte)0));
                return;
            }
        }
    }

    public void onSurgeExpiredEvent(fpd fpd)
    {
        j();
        setResult(0);
        finish();
    }

    public void onSurgeSobrietyBackEvent(fpe fpe)
    {
        fpe = (SurgeFragmentDeprecated)getSupportFragmentManager().findFragmentByTag(SurgeFragmentDeprecated.b);
        if (fpe != null)
        {
            fpe.dismiss();
        }
        p = false;
        f();
    }

    public void onSurgeSobrietyFailedEvent(fpf fpf1)
    {
        dtp.a(this, 1010, getString(0x7f07045c, new Object[] {
            Float.valueOf(fpf1.a())
        }));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
