// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.ubercab.rds.core.model.SupportTree;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.rds.feature.trip.TripCardView;
import java.util.ArrayList;

public class hip extends hbs
{

    chp a;
    gmg b;
    cgh c;
    hck d;
    SupportApi e;
    TripCardView f;
    TripReceipt g;
    private hir h;
    private ListView i;
    private FrameLayout j;
    private FrameLayout k;
    private hgh l;
    private TripSummary m;
    private SupportTree n;
    private ViewStub o;

    public hip()
    {
    }

    static SupportTree a(hip hip1)
    {
        return hip1.n;
    }

    static SupportTree a(hip hip1, SupportTree supporttree)
    {
        hip1.n = supporttree;
        return supporttree;
    }

    public static hip a(TripReceipt tripreceipt, TripSummary tripsummary)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT", tripreceipt);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
        tripreceipt = new hip();
        tripreceipt.setArguments(bundle);
        return tripreceipt;
    }

    public static hip a(TripSummary tripsummary)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY", tripsummary);
        tripsummary = new hip();
        tripsummary.setArguments(bundle);
        return tripsummary;
    }

    private void a(hiq hiq1)
    {
        hiq1.a(this);
    }

    static hgh b(hip hip1)
    {
        return hip1.l;
    }

    static ListView c(hip hip1)
    {
        return hip1.i;
    }

    private hiq c()
    {
        return hhr.a().a(new hbt(getActivity().getApplication())).a();
    }

    static hir d(hip hip1)
    {
        return hip1.h;
    }

    protected final volatile void a(Object obj)
    {
        a((hiq)obj);
    }

    protected final Object b()
    {
        return c();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Object obj = getActivity();
        if (obj instanceof hir)
        {
            h = (hir)obj;
            if (bundle != null)
            {
                if (bundle.containsKey("com.ubercab.rds.EXTRA_SUPPORT_TREE"))
                {
                    n = (SupportTree)bundle.getParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE");
                }
                if (bundle.containsKey("com.ubercab.rds.EXTRA_TRIP_RECEIPT"))
                {
                    g = (TripReceipt)bundle.getParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
                }
            }
            if (g == null && getArguments().containsKey("com.ubercab.rds.EXTRA_TRIP_RECEIPT"))
            {
                g = (TripReceipt)getArguments().getParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
            }
            if ("client".equals(d.y()) && g == null)
            {
                e.tripReceipt(m.getId(), d.x(), 0, 0, new _cls1(((android.app.Activity) (obj))));
            }
            if (n == null)
            {
                bundle = new ArrayList();
                obj = m.getTerritoryId();
                if (obj != null)
                {
                    e.supportTerritory(((String) (obj)), "android", d.y(), cwt.a(), "trip", new _cls2());
                }
            } else
            {
                bundle = hcr.a(n);
            }
            l = new hgh(c, bundle, true);
            i.setAdapter(l);
            i.setOnItemClickListener(new _cls3());
            a.a(h.j);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append(obj.toString()).append(" must implement TripProblemFragment.Listener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if ("client".equals(d.y()) && g != null)
        {
            menuinflater.inflate(hbn.ub__trip_problem_receipt_menu, menu);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(hbm.ub__support_listview_fullbleed, viewgroup, false);
        i = (ListView)viewgroup.findViewById(hbk.ub__support_listview);
        j = (FrameLayout)layoutinflater.inflate(hbm.ub__trip_problem_header, i, false);
        k = (FrameLayout)layoutinflater.inflate(hbm.ub__trip_problem_footer, i, false);
        o = (ViewStub)j.findViewById(hbk.ub__trip_problem_card_stub);
        return viewgroup;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == hbk.ub__trip_problem_receipt)
        {
            a.a(i.G);
            hiv.a(a(), g);
            return true;
        } else
        {
            return false;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.ubercab.rds.EXTRA_SUPPORT_TREE", n);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT", g);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        i.addHeaderView(j, null, false);
        i.addFooterView(k, null, false);
        m = (TripSummary)getArguments().getParcelable("com.ubercab.rds.EXTRA_TRIP_SUMMARY");
        f = (TripCardView)o.inflate();
        view = getResources();
        f.a(c, m, hcr.a(view, false), hcr.b(view, false), view.getDrawable(hbh.ub__uber_white_80), d.y(), hcr.a(view, 2.7F, false), b.a(hcl.c), b.a(hcl.b));
        f.setVisibility(0);
        f.a();
        cwp.a(f, view.getDrawable(hbj.ub__container_full_normal));
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
