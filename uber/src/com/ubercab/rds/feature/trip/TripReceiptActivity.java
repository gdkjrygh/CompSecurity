// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import cgh;
import cgt;
import chp;
import com.ubercab.rds.core.app.RdsActivity;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.ui.Button;
import com.ubercab.ui.CircleImageView;
import com.ubercab.ui.TextView;
import h;
import hbi;
import hbj;
import hbk;
import hbm;
import hbo;
import hbt;
import hck;
import hcr;
import hht;
import hhu;
import hhx;
import hit;
import ijg;
import java.util.Calendar;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripReceiptView, TripProblemActivity

public class TripReceiptActivity extends RdsActivity
{

    public chp c;
    public Calendar d;
    public cgh e;
    public hck f;
    public SupportApi g;
    int h;
    Button i;
    CircleImageView j;
    FrameLayout k;
    ImageView l;
    ImageView m;
    TextView n;
    TextView o;
    TextView p;
    TextView q;
    RatingBar r;
    TripReceiptView s;
    View t;
    private TripReceipt u;
    private TripSummary v;
    private String w;

    public TripReceiptActivity()
    {
    }

    public static Intent a(Context context, TripSummary tripsummary)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripReceiptActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
    }

    public static Intent a(Context context, String s1)
    {
        return (new Intent(context, com/ubercab/rds/feature/trip/TripReceiptActivity)).putExtra("com.ubercab.rds.EXTRA_TRIP_UUID", s1);
    }

    static TripReceipt a(TripReceiptActivity tripreceiptactivity)
    {
        return tripreceiptactivity.u;
    }

    static TripReceipt a(TripReceiptActivity tripreceiptactivity, TripReceipt tripreceipt)
    {
        tripreceiptactivity.u = tripreceipt;
        return tripreceipt;
    }

    static TripSummary a(TripReceiptActivity tripreceiptactivity, TripSummary tripsummary)
    {
        tripreceiptactivity.v = tripsummary;
        return tripsummary;
    }

    static String a(TripReceiptActivity tripreceiptactivity, String s1)
    {
        tripreceiptactivity.w = s1;
        return s1;
    }

    private void a(TripReceipt tripreceipt, TripSummary tripsummary)
    {
        int i1 = 0;
        if (!TextUtils.isEmpty(tripreceipt.getMapUrl()))
        {
            m.getLayoutParams().height = h;
            hhx hhx1 = new hhx(BitmapFactory.decodeResource(getResources(), hbj.ub__map_grid_placeholder), 0.0F);
            e.a(tripreceipt.getMapUrl()).a(hhx1).b(hhx1).a().c().a(m);
            s.a(tripreceipt);
        }
        if (!TextUtils.isEmpty(tripsummary.getDriverPictureUrl()))
        {
            e.a(tripsummary.getDriverPictureUrl()).a(j);
        }
        if ("canceled".equals(tripsummary.getStatus()))
        {
            p.setText(getString(hbo.ub__rds__status));
            q.setText(getString(hbo.ub__rds__canceled));
            q.setVisibility(0);
        } else
        if (tripsummary.getDriverRating() > 0)
        {
            p.setText(getString(hbo.ub__rds__you_rated));
            r.setRating(tripsummary.getDriverRating());
            r.setVisibility(0);
        } else
        {
            p.setText(getString(hbo.ub__rds__you_rated));
            q.setText(getString(hbo.ub__rds__not_applicable));
            q.setVisibility(0);
        }
        tripreceipt = l;
        if (!tripsummary.getIsSurgeTrip())
        {
            i1 = 8;
        }
        tripreceipt.setVisibility(i1);
        o.setText(tripsummary.getFareLocalString());
        if (!TextUtils.isEmpty(tripsummary.getDriverName()))
        {
            n.setText(tripsummary.getDriverName());
        }
    }

    private void a(hit hit1)
    {
        hit1.a(this);
    }

    static TripSummary b(TripReceiptActivity tripreceiptactivity)
    {
        return tripreceiptactivity.v;
    }

    static void c(TripReceiptActivity tripreceiptactivity)
    {
        tripreceiptactivity.k();
    }

    static void d(TripReceiptActivity tripreceiptactivity)
    {
        tripreceiptactivity.d();
    }

    static void e(TripReceiptActivity tripreceiptactivity)
    {
        tripreceiptactivity.t();
    }

    static void f(TripReceiptActivity tripreceiptactivity)
    {
        tripreceiptactivity.d();
    }

    private hit g()
    {
        return hht.a().a(new hbt(getApplication())).a();
    }

    static void g(TripReceiptActivity tripreceiptactivity)
    {
        tripreceiptactivity.t();
    }

    private void h()
    {
        i = (Button)findViewById(hbk.ub__trip_receipt_button_help);
        j = (CircleImageView)findViewById(hbk.ub__trip_receipt_driver_picture);
        k = (FrameLayout)findViewById(hbk.ub__trip_receipt_root_view);
        l = (ImageView)findViewById(hbk.ub__trip_receipt_surge);
        m = (ImageView)findViewById(hbk.ub__trip_receipt_map);
        r = (RatingBar)findViewById(hbk.ub__trip_receipt_ratingbar);
        n = (TextView)findViewById(hbk.ub__trip_receipt_driver_name);
        o = (TextView)findViewById(hbk.ub__trip_receipt_fare);
        p = (TextView)findViewById(hbk.ub__trip_receipt_status_title);
        q = (TextView)findViewById(hbk.ub__trip_receipt_status_value);
        s = (TripReceiptView)findViewById(hbk.ub__trip_receipt_view);
        t = findViewById(hbk.ub__trip_receipt_avatar_placeholder);
        i.setOnClickListener(new android.view.View.OnClickListener() {

            final TripReceiptActivity a;

            public final void onClick(View view)
            {
                a.startActivity(TripProblemActivity.a(a, TripReceiptActivity.a(a), TripReceiptActivity.b(a)));
            }

            
            {
                a = TripReceiptActivity.this;
                super();
            }
        });
    }

    private void i()
    {
        k.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final TripReceiptActivity a;

            private void a()
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    a.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                } else
                {
                    a.k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    return;
                }
            }

            public final void onGlobalLayout()
            {
                a();
                a.h = a.a(a.k);
                a.f();
            }

            
            {
                a = TripReceiptActivity.this;
                super();
            }
        });
    }

    private void j()
    {
        if (TextUtils.isEmpty(w))
        {
            d();
            t();
            ijg.d("TripReceiptActivty instantiated without a Trip UUID.", new Object[0]);
            return;
        } else
        {
            s();
            g.singleTrip(w, f.y(), f.x(), new Callback() {

                final TripReceiptActivity a;

                private void a(TripSummary tripsummary)
                {
                    if (a.isFinishing())
                    {
                        return;
                    } else
                    {
                        TripReceiptActivity.a(a, tripsummary);
                        TripReceiptActivity.a(a, tripsummary.getId());
                        TripReceiptActivity.c(a);
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
                        TripReceiptActivity.f(a);
                        TripReceiptActivity.g(a);
                        return;
                    }
                }

                public final void success(Object obj, Response response)
                {
                    a((TripSummary)obj);
                }

            
            {
                a = TripReceiptActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void k()
    {
        if (u == null || v == null)
        {
            return;
        } else
        {
            a(u, v);
            t();
            return;
        }
    }

    final int a(ViewGroup viewgroup)
    {
        int i1 = viewgroup.getHeight();
        int j1 = t.getHeight();
        int k1 = n.getHeight();
        int l1 = i.getHeight();
        if (i1 > 0 && j1 > 0 && k1 > 0 && l1 > 0)
        {
            float f1 = getResources().getDimension(hbi.ui__spacing_unit_3x);
            return (int)((float)i1 - ((float)(j1 + k1 + l1) + f1));
        } else
        {
            return 0;
        }
    }

    protected final volatile void a(Object obj)
    {
        a((hit)obj);
    }

    protected final Object c()
    {
        return g();
    }

    final void f()
    {
        int j1 = 340;
        int i1 = Math.round(h / 2);
        int k1 = Math.round(hcr.a(getResources()) / 2);
        if (k1 > 0 && k1 < 340)
        {
            i1 = Math.round(((float)i1 / (float)k1) * 340F);
        } else
        {
            j1 = k1;
        }
        s();
        g.tripReceipt(w, f.x(), i1, j1, new Callback() {

            final TripReceiptActivity a;

            private void a(TripReceipt tripreceipt)
            {
                if (a.isFinishing())
                {
                    return;
                } else
                {
                    TripReceiptActivity.a(a, tripreceipt);
                    TripReceiptActivity.c(a);
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
                    TripReceiptActivity.d(a);
                    TripReceiptActivity.e(a);
                    return;
                }
            }

            public final void success(Object obj, Response response)
            {
                a((TripReceipt)obj);
            }

            
            {
                a = TripReceiptActivity.this;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(hbm.ub__trip_receipt_activity);
        c.a(h.l);
        b(getString(hbo.ub__rds__something_went_wrong));
        e();
        h();
        v = (TripSummary)getIntent().getParcelableExtra("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
        if (bundle != null)
        {
            w = bundle.getString("com.ubercab.rds.EXTRA_TRIP_UUID");
            v = (TripSummary)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
            u = (TripReceipt)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
            h = bundle.getInt("com.ubercab.rds.EXTRA_TRIP_MAP_HEIGHT");
        }
        if (v == null)
        {
            w = getIntent().getStringExtra("com.ubercab.rds.EXTRA_TRIP_UUID");
            a(getString(hbo.ub__rds__trip_details));
        } else
        {
            w = v.getId();
            a(hcr.a(this, d, v.getDate()));
        }
        k();
    }

    protected void onResume()
    {
        super.onResume();
        if (u == null)
        {
            i();
        }
        if (v == null)
        {
            j();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.ubercab.rds.EXTRA_TRIP_MAP_HEIGHT", h);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT", u);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", v);
        bundle.putString("com.ubercab.rds.EXTRA_TRIP_UUID", w);
    }
}
