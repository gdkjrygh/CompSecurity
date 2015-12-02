// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.feature.trip.TripPickupDropoffView;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;

public class hia extends hbs
{

    chp a;
    gmg b;
    cgh c;
    LinearLayout d;
    TextView e;
    Button f;
    private hic g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private LinearLayout l;
    private LinearLayout m;
    private TripPickupDropoffView n;

    public hia()
    {
    }

    public static hia a(TripSummary tripsummary)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
        tripsummary = new hia();
        tripsummary.setArguments(bundle);
        return tripsummary;
    }

    static hic a(hia hia1)
    {
        return hia1.g;
    }

    private void a(hib hib1)
    {
        hib1.a(this);
    }

    private void a(String s)
    {
        android.graphics.Bitmap bitmap = BitmapFactory.decodeResource(getResources(), hbj.ub__map_grid_placeholder);
        c.a(s).a(new hhx(bitmap, 0.0F)).a().c().a(h);
    }

    private void b(String s)
    {
        s = cws.a(cxb.c(s), getResources().getString(hbo.ub__rds__hours_abbreviated), getResources().getString(hbo.ub__rds__minutes_abbreviated), getResources().getString(hbo.ub__rds__seconds_abbreviated));
        i.setText(s);
        k.setVisibility(0);
    }

    private hib c()
    {
        return hhj.a().a(new hbt(getActivity().getApplication())).a();
    }

    private void c(String s)
    {
        s = (new StringBuilder(String.format("%.1f", new Object[] {
            Float.valueOf(cxb.a(s))
        }))).append(" ").append(getResources().getString(hbo.ub__rds__miles));
        j.setText(s.toString());
        l.setVisibility(0);
    }

    private void d(String s)
    {
        e.setText(s);
        d.setVisibility(0);
    }

    public final void a(hic hic)
    {
        g = hic;
    }

    protected final volatile void a(Object obj)
    {
        a((hib)obj);
    }

    protected final Object b()
    {
        return c();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = (TripSummary)getArguments().getParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
        if (bundle == null)
        {
            getActivity().finish();
            return;
        }
        n.a(bundle.getPickupAddress(), bundle.getDropoffAddress());
        n.a();
        n.b();
        String s = bundle.getMapUrl();
        if (!TextUtils.isEmpty(s))
        {
            a(s);
        }
        if ("completed".equals(bundle.getStatus()))
        {
            b(bundle.getDuration());
            c(bundle.getDistance());
        } else
        {
            m.setVisibility(0);
        }
        if (b.a(hcl.c))
        {
            bundle = bundle.getFareLocalString();
            if (!TextUtils.isEmpty(bundle))
            {
                d(bundle);
            }
        }
        f.setOnClickListener(new _cls1());
        a.a(h.l);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(hbm.ub__trip_details_fragment, viewgroup, false);
        h = (ImageView)layoutinflater.findViewById(hbk.ub__trip_details_map);
        f = (Button)layoutinflater.findViewById(hbk.ub__trip_details_button_support);
        m = (LinearLayout)layoutinflater.findViewById(hbk.ub__trip_details_status);
        k = (LinearLayout)layoutinflater.findViewById(hbk.ub__trip_details_duration);
        l = (LinearLayout)layoutinflater.findViewById(hbk.ub__trip_details_distance);
        d = (LinearLayout)layoutinflater.findViewById(hbk.ub__trip_details_fare);
        i = (TextView)layoutinflater.findViewById(hbk.ub__trip_details_duration_value);
        j = (TextView)layoutinflater.findViewById(hbk.ub__trip_details_distance_value);
        e = (TextView)layoutinflater.findViewById(hbk.ub__trip_details_fare_value);
        n = (TripPickupDropoffView)layoutinflater.findViewById(hbk.ub__trip_pickup_dropoff);
        return layoutinflater;
    }

    /* member class not found */
    class _cls1 {}

}
