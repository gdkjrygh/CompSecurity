// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import hbk;
import hbm;
import hbo;
import hbt;
import hck;
import hhh;
import hhi;
import hhy;
import hia;
import hic;
import i;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripProblemActivity

public class TripDetailsActivity extends RdsActivity
    implements hic
{

    public chp c;
    public SupportApi d;
    public hck e;
    private TripSummary f;

    public TripDetailsActivity()
    {
    }

    public static Intent a(Context context, TripSummary tripsummary)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripDetailsActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripDetailsActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_UUID", s);
    }

    static TripSummary a(TripDetailsActivity tripdetailsactivity, TripSummary tripsummary)
    {
        tripdetailsactivity.f = tripsummary;
        return tripsummary;
    }

    private void a(TripSummary tripsummary)
    {
        hia hia2 = (hia)a(hia);
        hia hia1 = hia2;
        if (hia2 == null)
        {
            hia1 = hia.a(tripsummary);
            a(hbk.ub__support_viewgroup_content, ((android.support.v4.app.Fragment) (hia1)));
        }
        hia1.a(this);
    }

    static void a(TripDetailsActivity tripdetailsactivity)
    {
        tripdetailsactivity.t();
    }

    private void a(hhy hhy1)
    {
        hhy1.a(this);
    }

    static TripSummary b(TripDetailsActivity tripdetailsactivity)
    {
        return tripdetailsactivity.f;
    }

    static void b(TripDetailsActivity tripdetailsactivity, TripSummary tripsummary)
    {
        tripdetailsactivity.a(tripsummary);
    }

    static void c(TripDetailsActivity tripdetailsactivity)
    {
        tripdetailsactivity.t();
    }

    static void d(TripDetailsActivity tripdetailsactivity)
    {
        tripdetailsactivity.d();
    }

    private hhy g()
    {
        return hhh.a().a(new hbt(getApplication())).a();
    }

    protected final volatile void a(Object obj)
    {
        a((hhy)obj);
    }

    protected final Object c()
    {
        return g();
    }

    public final void f()
    {
        c.a(i.B);
        startActivity(TripProblemActivity.a(this, f));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__trip_details_activity);
        a(getString(hbo.ub__rds__trip_details));
        b(getString(hbo.ub__rds__something_went_wrong));
        e();
        if (bundle != null && bundle.containsKey("com.ubercab.rds.EXTRA_TRIP_SUMMARY"))
        {
            f = (TripSummary)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
            a(f);
        } else
        if (getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY"))
        {
            f = (TripSummary)getIntent().getParcelableExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
            a(f);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (f == null && getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_UUID"))
        {
            s();
            d.singleTrip(getIntent().getStringExtra("com.ubercab.rds.EXTRA_TRIP_UUID"), e.y(), e.x(), new Callback() {

                final TripDetailsActivity a;

                private void a(TripSummary tripsummary)
                {
                    if (a.isFinishing())
                    {
                        return;
                    } else
                    {
                        TripDetailsActivity.a(a);
                        TripDetailsActivity.a(a, tripsummary);
                        TripDetailsActivity.b(a, TripDetailsActivity.b(a));
                        return;
                    }
                }

                public final void failure(RetrofitError retrofiterror)
                {
                    if (a.isFinishing())
                    {
                        return;
                    } else
                    {
                        TripDetailsActivity.c(a);
                        TripDetailsActivity.d(a);
                        return;
                    }
                }

                public final void success(Object obj, Response response)
                {
                    a((TripSummary)obj);
                }

            
            {
                a = TripDetailsActivity.this;
                super();
            }
            });
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", f);
    }
}
