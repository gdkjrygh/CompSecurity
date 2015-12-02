// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import chp;
import cix;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.SupportIssue;
import com.ubercab.rds.core.model.SupportTree;
import com.ubercab.rds.core.model.TripHistory;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.rds.feature.trip.TripHistoryActivity;
import com.ubercab.rds.feature.trip.TripProblemActivity;
import cwt;
import cxb;
import gmg;
import hbj;
import hbk;
import hbm;
import hbn;
import hbo;
import hbt;
import hch;
import hck;
import hcl;
import hcr;
import hfh;
import hfi;
import hga;
import hgc;
import hge;
import hgl;
import hgn;
import i;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SupportHomeActivity extends RdsActivity
    implements hge, hgl
{

    public chp c;
    public gmg d;
    public cix e;
    public hch f;
    public hck g;
    public SupportApi h;
    private String i;
    private SupportTree j;
    private TripHistory k;

    public SupportHomeActivity()
    {
    }

    public static Intent a(Context context)
    {
        return (new Intent(context, com/ubercab/rds/feature/support/SupportHomeActivity)).putExtra("com.ubercab.rds.RETURN_LOCATION", "com.ubercab.rds.RETURN_SUPPORT_HOME");
    }

    static SupportTree a(SupportHomeActivity supporthomeactivity)
    {
        return supporthomeactivity.j;
    }

    static SupportTree a(SupportHomeActivity supporthomeactivity, SupportTree supporttree)
    {
        supporthomeactivity.j = supporttree;
        return supporttree;
    }

    static TripHistory a(SupportHomeActivity supporthomeactivity, TripHistory triphistory)
    {
        supporthomeactivity.k = triphistory;
        return triphistory;
    }

    static String a(SupportHomeActivity supporthomeactivity, String s)
    {
        supporthomeactivity.i = s;
        return s;
    }

    public static void a(RdsActivity rdsactivity)
    {
        rdsactivity.startActivity((new Intent(rdsactivity, com/ubercab/rds/feature/support/SupportHomeActivity)).addFlags(0x4000000));
    }

    private void a(hga hga1)
    {
        hga1.a(this);
    }

    static void b(SupportHomeActivity supporthomeactivity)
    {
        supporthomeactivity.h();
    }

    static void c(SupportHomeActivity supporthomeactivity)
    {
        supporthomeactivity.d();
    }

    static void d(SupportHomeActivity supporthomeactivity)
    {
        supporthomeactivity.d();
    }

    private void d(String s)
    {
        s = hcr.a(s, false);
        if (s != null)
        {
            c.a(s);
        }
    }

    private hga g()
    {
        return hfh.a().a(new hbt(getApplication())).a();
    }

    private void h()
    {
        if (j != null && k != null)
        {
            t();
            hgc hgc2 = (hgc)a(hgc);
            hgc hgc1 = hgc2;
            if (hgc2 == null)
            {
                hgc1 = hgc.a(hcr.b(j), k.getTrips());
                a(hbk.ub__support_viewgroup_content, hgc1);
            }
            hgc1.a(this);
        }
    }

    public final void a(SupportIssue supportissue)
    {
        if (supportissue != null)
        {
            d(supportissue.getType());
            a(j, supportissue, null, null);
        }
    }

    public final void a(SupportIssue supportissue, TripReceipt tripreceipt)
    {
        if (supportissue != null)
        {
            d(supportissue.getType());
            a(j, supportissue, null, tripreceipt);
        }
    }

    public final void a(TripSummary tripsummary)
    {
        c.a(i.x);
        startActivity(TripProblemActivity.a(this, tripsummary));
    }

    protected final volatile void a(Object obj)
    {
        a((hga)obj);
    }

    protected final Object c()
    {
        return g();
    }

    public final void f()
    {
        c.a(i.s);
        startActivity(TripHistoryActivity.a(this).setAction("com.ubercab.rds.ACTION_TRIP_PROBLEM"));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__support_activity_home);
        a(getString(hbo.ub__rds__how_can_we_help));
        b(getString(hbo.ub__rds__something_went_wrong));
        e();
        if (bundle != null)
        {
            j = (SupportTree)bundle.getParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE");
            k = (TripHistory)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_HISTORY");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(hbn.ub__support_home_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == hbk.ub__support_home_call)
        {
            c.a(i.A);
            hgn.a(this, i);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (d.a(hcl.d) && !TextUtils.isEmpty(i))
        {
            String s = g.y();
            menu = menu.findItem(hbk.ub__support_home_call);
            if ("client".equals(s))
            {
                menu.setIcon(hbj.ub__icon_phone_rider).setVisible(true);
            } else
            if ("driver".equals(s))
            {
                menu.setIcon(hbj.ub__icon_phone_driver).setVisible(true);
                return true;
            }
        }
        return true;
    }

    public void onResume()
    {
        super.onResume();
        if (j == null)
        {
            s();
            Callback callback = new Callback() {

                final SupportHomeActivity a;

                private void a(SupportTree supporttree)
                {
                    if (a.isFinishing())
                    {
                        return;
                    }
                    SupportHomeActivity.a(a, supporttree);
                    SupportHomeActivity supporthomeactivity = a;
                    if (SupportHomeActivity.a(a) != null)
                    {
                        supporttree = SupportHomeActivity.a(a).getSupportNumber();
                    } else
                    {
                        supporttree = null;
                    }
                    SupportHomeActivity.a(supporthomeactivity, supporttree);
                    a.invalidateOptionsMenu();
                    SupportHomeActivity.b(a);
                }

                public final void failure(RetrofitError retrofiterror)
                {
                    SupportHomeActivity.c(a);
                }

                public final void success(Object obj1, Response response)
                {
                    a((SupportTree)obj1);
                }

            
            {
                a = SupportHomeActivity.this;
                super();
            }
            };
            Object obj = e.c();
            if (obj != null && ((UberLocation) (obj)).g() != null)
            {
                obj = ((UberLocation) (obj)).g();
                double d4 = ((UberLatLng) (obj)).a();
                double d3 = ((UberLatLng) (obj)).b();
                double d2 = d4;
                double d1 = d3;
                if (f.a())
                {
                    d2 = cxb.a(getString(hbo.ub__rds__hailstorm_latitude), d4);
                    d1 = cxb.a(getString(hbo.ub__rds__hailstorm_longitude), d3);
                }
                h.supportHome("android", g.y(), cwt.a(), d2, d1, callback);
            } else
            {
                h.supportHome("android", g.y(), cwt.a(), callback);
            }
        }
        if (k == null)
        {
            s();
            h.tripHistory(g.z(), g.y(), g.x(), 0, 2, new Callback() {

                final SupportHomeActivity a;

                private void a(TripHistory triphistory)
                {
                    if (a.isFinishing())
                    {
                        return;
                    } else
                    {
                        SupportHomeActivity.a(a, triphistory);
                        SupportHomeActivity.b(a);
                        return;
                    }
                }

                public final void failure(RetrofitError retrofiterror)
                {
                    SupportHomeActivity.d(a);
                }

                public final void success(Object obj1, Response response)
                {
                    a((TripHistory)obj1);
                }

            
            {
                a = SupportHomeActivity.this;
                super();
            }
            });
        }
        if (j != null)
        {
            i = j.getSupportNumber();
        }
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (j != null && k != null)
        {
            h();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE", j);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_HISTORY", k);
    }
}
