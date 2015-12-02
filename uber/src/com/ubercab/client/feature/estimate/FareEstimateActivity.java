// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.estimate;

import android.content.Intent;
import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.search.LocationSearchActivity;
import czj;
import dfe;
import dfp;
import eao;
import eap;
import eau;
import ebb;
import ebc;
import fta;

// Referenced classes of package com.ubercab.client.feature.estimate:
//            FareEstimateFragment

public class FareEstimateActivity extends RiderActivity
{

    public fta h;
    private Float i;
    private long j;
    private RiderLocation k;
    private RiderLocation l;

    public FareEstimateActivity()
    {
    }

    private void a(eau eau1)
    {
        eau1.a(this);
    }

    private eau b(dfp dfp)
    {
        return eao.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        FareEstimateFragment fareestimatefragment = (FareEstimateFragment)a(com/ubercab/client/feature/estimate/FareEstimateFragment);
        if (fareestimatefragment == null)
        {
            a(0x7f0e0114, FareEstimateFragment.a(l, k, j, i), true);
            return;
        } else
        {
            fareestimatefragment.a(l, k);
            return;
        }
    }

    private void g()
    {
        startActivityForResult(LocationSearchActivity.a(this, "com.ubercab.ACTION_PICKUP_LOCATION", l, k, null, false), 2009);
    }

    private void h()
    {
        startActivityForResult(LocationSearchActivity.a(this, "com.ubercab.ACTION_DESTINATION", l, k, null, false), 2010);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eau)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030062);
        if (bundle == null)
        {
            i = Float.valueOf(getIntent().getFloatExtra("com.ubercab.CURRENCY_TO_POINTS_RATIO", 0.0F));
            j = getIntent().getLongExtra("com.ubercab.FARE_ID", 0L);
            k = (RiderLocation)getIntent().getParcelableExtra("com.ubercab.LOCATION_DESTINATION");
            l = (RiderLocation)getIntent().getParcelableExtra("com.ubercab.LOCATION_PICKUP");
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == 0 && k == null)
        {
            finish();
        } else
        {
            if (i1 == 2009 && j1 == -1)
            {
                l = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
                h.a(l);
                setResult(-1, getIntent());
                return;
            }
            if (i1 == 2010 && j1 == -1)
            {
                k = (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION");
                intent = getIntent();
                intent.putExtra("com.ubercab.LOCATION_DESTINATION", k);
                setResult(-1, intent);
                return;
            }
        }
    }

    public void onDestinationChangeEvent(ebb ebb)
    {
        h();
    }

    public void onPickupChangeEvent(ebc ebc)
    {
        g();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        i = Float.valueOf(bundle.getFloat("com.ubercab.CURRENCY_TO_POINTS_RATIO", 0.0F));
        j = bundle.getLong("com.ubercab.FARE_ID");
        k = (RiderLocation)bundle.getParcelable("com.ubercab.LOCATION_DESTINATION");
        l = (RiderLocation)bundle.getParcelable("com.ubercab.LOCATION_PICKUP");
    }

    public void onResume()
    {
        super.onResume();
        if (isFinishing())
        {
            return;
        }
        if (k == null)
        {
            h();
            return;
        } else
        {
            f();
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putFloat("com.ubercab.CURRENCY_TO_POINTS_RATIO", i.floatValue());
        bundle.putParcelable("com.ubercab.LOCATION_DESTINATION", k);
        bundle.putParcelable("com.ubercab.LOCATION_PICKUP", l);
        bundle.putLong("com.ubercab.FARE_ID", j);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }
}
