// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.ubercab.rds.core.model.TripSummary;
import com.ubercab.rds.feature.support.SupportHomeHeaderView;
import java.util.ArrayList;
import java.util.List;

public class hgc extends hbs
    implements hgg
{

    chp a;
    gmg b;
    cgh c;
    hck d;
    SupportHomeHeaderView e;
    private ListView f;
    private hgh g;
    private hge h;

    public hgc()
    {
    }

    public static hgc a(List list, List list1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.ubercab.rds.EXTRA_SUPPORT_ISSUES", (ArrayList)list);
        bundle.putParcelableArrayList("com.ubercab.rds.EXTRA_TRIP_HISTORY", (ArrayList)list1);
        list = new hgc();
        list.setArguments(bundle);
        return list;
    }

    static hge a(hgc hgc1)
    {
        return hgc1.h;
    }

    private void a(hgd hgd1)
    {
        hgd1.a(this);
    }

    static ListView b(hgc hgc1)
    {
        return hgc1.f;
    }

    private hgd d()
    {
        return hfj.a().a(new hbt(getActivity().getApplication())).a();
    }

    public final void a(TripSummary tripsummary)
    {
        if (h != null)
        {
            h.a(tripsummary);
        }
    }

    public final void a(hge hge1)
    {
        h = hge1;
    }

    protected final volatile void a(Object obj)
    {
        a((hgd)obj);
    }

    protected final Object b()
    {
        return d();
    }

    public final void c()
    {
        if (h != null)
        {
            h.f();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        boolean flag = true;
        super.onActivityCreated(bundle);
        bundle = getArguments().getParcelableArrayList("com.ubercab.rds.EXTRA_TRIP_HISTORY");
        if (bundle != null && !bundle.isEmpty())
        {
            TripSummary tripsummary = (TripSummary)bundle.get(0);
            if (bundle.size() <= 1)
            {
                flag = false;
            }
            e.a(tripsummary, c, getResources(), d.y(), flag, b.a(hcl.c), b.a(hcl.b));
            e.a(this);
            f.addHeaderView(e, null, false);
        }
        bundle = getArguments().getParcelableArrayList("com.ubercab.rds.EXTRA_SUPPORT_ISSUES");
        g = new hgh(c, bundle);
        f.setAdapter(g);
        f.setOnItemClickListener(new _cls1());
        a.a(h.h);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(hbm.ub__support_listview, viewgroup, false);
        f = (ListView)viewgroup.findViewById(hbk.ub__support_listview);
        e = (SupportHomeHeaderView)layoutinflater.inflate(hbm.ub__support_header_home, f, false);
        return viewgroup;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        e.b(this);
    }

    /* member class not found */
    class _cls1 {}

}
