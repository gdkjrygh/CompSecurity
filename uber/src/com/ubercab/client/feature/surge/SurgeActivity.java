// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.surge;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.vendor.google.GmmProductSurge;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import czj;
import czq;
import dak;
import dfe;
import dfp;
import dtp;
import fog;
import foh;
import fom;
import fon;
import fpa;
import fpb;
import fpc;
import fpd;
import fpe;
import fpf;
import fqc;
import fqg;
import fte;
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
//            SurgeFragment

public class SurgeActivity extends RiderActivity
{

    public chp h;
    public hkr i;
    public dak j;
    public fqc k;
    public czq l;
    public fqg m;
    public hkm n;
    public fte o;
    private String p;
    private icl q;
    private boolean r;

    public SurgeActivity()
    {
    }

    public static Intent a(Context context, String s1, boolean flag, GmmProductSurge gmmproductsurge)
    {
        return (new Intent(context, com/ubercab/client/feature/surge/SurgeActivity)).putExtra("com.ubercab.SELECTED_VEHICLE_VIEW", s1).putExtra("com.ubercab.SHOW_SOBRIETY", flag).putExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED", gmmproductsurge);
    }

    public static String a(SurgeActivity surgeactivity)
    {
        return surgeactivity.p;
    }

    private void a(long l1)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.FARE_ID", l1);
        setResult(-1, intent);
        finish();
    }

    private void a(fon fon1)
    {
        fon1.a(this);
    }

    private fon b(dfp dfp)
    {
        return fog.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/surge/SurgeFragment) == null)
        {
            a(0x7f0e052b, SurgeFragment.a(false, (GmmProductSurge)getIntent().getParcelableExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED")), true);
        }
    }

    private void g()
    {
        a(0x7f0e052b, SurgeFragment.a(true, (GmmProductSurge)getIntent().getParcelableExtra("com.ubercab.GMM_PRODUCT_SURGE_DISPLAYED")));
        r = true;
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
        a((fon)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0301b9);
        p = getIntent().getStringExtra("com.ubercab.SELECTED_VEHICLE_VIEW");
        f();
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    public void onBackPressed()
    {
        if ((SurgeFragment)a(com/ubercab/client/feature/surge/SurgeFragment) != null)
        {
            r = false;
            i();
        }
        super.onBackPressed();
    }

    public void onPause()
    {
        super.onPause();
        o.e();
        m.f();
        k.d();
        if (q != null)
        {
            q.b();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        p = bundle.getString("com.ubercab.BUNDLE_VEHICLE_VIEW_ID", null);
    }

    public void onResume()
    {
        super.onResume();
        o.d();
        m.e();
        k.c();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.BUNDLE_VEHICLE_VIEW_ID", p);
    }

    public void onSurgeAcceptedEvent(fpa fpa1)
    {
        if (h() && !r)
        {
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
            obj = ((City) (obj)).findVehicleViewById(p);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            long l1 = fpc1.a();
            int i1 = Integer.valueOf(((VehicleView) (obj)).getId()).intValue();
            fpc1 = j.b();
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
                q = n.a(l1, i1, fpc1).a(ico.a()).a(new fom(this, (byte)0));
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
        r = false;
        onBackPressed();
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
