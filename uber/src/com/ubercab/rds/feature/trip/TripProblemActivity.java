// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.SupportIssue;
import com.ubercab.rds.core.model.SupportTree;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import cwt;
import hbk;
import hbm;
import hbo;
import hbt;
import hck;
import hcr;
import hgj;
import hgl;
import hhp;
import hhq;
import hin;
import hip;
import hir;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class TripProblemActivity extends RdsActivity
    implements hgl, hir
{

    public chp c;
    public hck d;
    public SupportApi e;
    private SupportTree f;
    private TripSummary g;

    public TripProblemActivity()
    {
    }

    public static Intent a(Context context, TripReceipt tripreceipt, TripSummary tripsummary)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripProblemActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_RECEIPT", tripreceipt).putExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
    }

    public static Intent a(Context context, TripSummary tripsummary)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripProblemActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
    }

    public static Intent a(Context context, String s)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripProblemActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_UUID", s);
    }

    static SupportTree a(TripProblemActivity tripproblemactivity, SupportTree supporttree)
    {
        tripproblemactivity.f = supporttree;
        return supporttree;
    }

    static TripSummary a(TripProblemActivity tripproblemactivity, TripSummary tripsummary)
    {
        tripproblemactivity.g = tripsummary;
        return tripsummary;
    }

    public static void a(RdsActivity rdsactivity)
    {
        rdsactivity.startActivity((new Intent(rdsactivity, com/ubercab/rds/feature/trip/TripProblemActivity)).addFlags(0x4000000).putExtra("com.ubercab.rds.FINISH_SELF", true));
    }

    static void a(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.t();
    }

    private void a(hin hin1)
    {
        hin1.a(this);
    }

    static void b(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.g();
    }

    static void c(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.t();
    }

    static void d(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.h();
    }

    private void d(String s)
    {
        s = hcr.a(s, true);
        if (s != null)
        {
            c.a(s);
        }
    }

    static void e(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.t();
    }

    private hin f()
    {
        return hhp.a().a(new hbt(getApplication())).a();
    }

    static void f(TripProblemActivity tripproblemactivity)
    {
        tripproblemactivity.d();
    }

    private void g()
    {
label0:
        {
            if (a(hip) == null && !isFinishing())
            {
                if (!getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_RECEIPT"))
                {
                    break label0;
                }
                TripReceipt tripreceipt = (TripReceipt)getIntent().getParcelableExtra("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
                a(hbk.ub__support_viewgroup_content, hip.a(tripreceipt, g));
            }
            return;
        }
        a(hbk.ub__support_viewgroup_content, hip.a(g));
    }

    private void h()
    {
        if (a(hgj) == null && !isFinishing())
        {
            a(hbk.ub__support_viewgroup_content, hgj.a(hcr.a(f), null));
        }
    }

    public final void a(SupportIssue supportissue, TripReceipt tripreceipt)
    {
        if (supportissue == null) goto _L2; else goto _L1
_L1:
        String s = null;
        if (g == null) goto _L4; else goto _L3
_L3:
        s = g.getId();
_L6:
        d(supportissue.getType());
        a(f, supportissue, s, tripreceipt);
_L2:
        return;
_L4:
        if (getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_UUID"))
        {
            s = getIntent().getStringExtra("com.ubercab.rds.EXTRA_TRIP_UUID");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(SupportTree supporttree, SupportIssue supportissue, TripReceipt tripreceipt)
    {
        if (supportissue != null)
        {
            f = supporttree;
            d(supportissue.getType());
            a(supporttree, supportissue, g.getId(), tripreceipt);
        }
    }

    protected final volatile void a(Object obj)
    {
        a((hin)obj);
    }

    protected final Object c()
    {
        return f();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__trip_problem_activity);
        a(getString(hbo.ub__rds__select_an_issue));
        b(getString(hbo.ub__rds__something_went_wrong));
        e();
        if (bundle != null && bundle.containsKey("com.ubercab.rds.EXTRA_TRIP_SUMMARY"))
        {
            g = (TripSummary)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
            g();
        } else
        {
            if (getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY"))
            {
                g = (TripSummary)getIntent().getParcelableExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
                g();
                return;
            }
            if (bundle != null && bundle.containsKey("com.ubercab.rds.EXTRA_SUPPORT_TREE"))
            {
                f = (SupportTree)bundle.getParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE");
                h();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (g == null && getIntent().hasExtra("com.ubercab.rds.EXTRA_TRIP_UUID"))
        {
            s();
            e.singleTrip(getIntent().getStringExtra("com.ubercab.rds.EXTRA_TRIP_UUID"), d.y(), d.x(), new Callback() {

                final TripProblemActivity a;

                private void a(TripSummary tripsummary)
                {
                    TripProblemActivity.a(a);
                    TripProblemActivity.a(a, tripsummary);
                    TripProblemActivity.b(a);
                }

                public final void failure(RetrofitError retrofiterror)
                {
                /* block-local class not found */
                class _cls1 {}

                    a.e.supportTerritory("00000000-0000-0000-0000-000000000000", "android", a.d.y(), cwt.a(), "trip", new _cls1());
                }

                public final void success(Object obj, Response response)
                {
                    a((TripSummary)obj);
                }

            
            {
                a = TripProblemActivity.this;
                super();
            }
            });
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (g != null)
        {
            bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", g);
        }
        if (f != null)
        {
            bundle.putParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE", f);
        }
    }
}
