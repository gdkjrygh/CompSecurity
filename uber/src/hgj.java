// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.ubercab.rds.core.model.TripReceipt;
import java.util.ArrayList;
import java.util.List;

public class hgj extends hbs
{

    chp a;
    cgh b;
    hck c;
    private hgl d;
    private ListView e;
    private hgh f;
    private TripReceipt g;

    public hgj()
    {
    }

    static ListView a(hgj hgj1)
    {
        return hgj1.e;
    }

    public static hgj a(List list, TripReceipt tripreceipt)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.ubercab.rds.EXTRA_SUPPORT_ISSUES", (ArrayList)list);
        bundle.putParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT", tripreceipt);
        list = new hgj();
        list.setArguments(bundle);
        return list;
    }

    private void a(hgk hgk1)
    {
        hgk1.a(this);
    }

    static TripReceipt b(hgj hgj1)
    {
        return hgj1.g;
    }

    private hgk c()
    {
        return hfl.a().a(new hbt(getActivity().getApplication())).a();
    }

    static hgl c(hgj hgj1)
    {
        return hgj1.d;
    }

    protected final volatile void a(Object obj)
    {
        a((hgk)obj);
    }

    protected final Object b()
    {
        return c();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getActivity();
        if (bundle instanceof hgl)
        {
            d = (hgl)bundle;
            bundle = getArguments().getParcelableArrayList("com.ubercab.rds.EXTRA_SUPPORT_ISSUES");
            f = new hgh(b, bundle);
            e.setAdapter(f);
            e.setOnItemClickListener(new _cls1());
            g = (TripReceipt)getArguments().getParcelable("com.ubercab.rds.EXTRA_TRIP_RECEIPT");
            a.a(h.i);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append(bundle.toString()).append(" must implement SupportIssueFragment.Listener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if ("client".equals(c.y()) && g != null)
        {
            menuinflater.inflate(hbn.ub__trip_problem_receipt_menu, menu);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(hbm.ub__support_listview, viewgroup, false);
        e = (ListView)layoutinflater.findViewById(hbk.ub__support_listview);
        return layoutinflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == hbk.ub__trip_problem_receipt)
        {
            a.a(i.y);
            hiv.a(a(), g);
            return true;
        } else
        {
            return false;
        }
    }

    /* member class not found */
    class _cls1 {}

}
