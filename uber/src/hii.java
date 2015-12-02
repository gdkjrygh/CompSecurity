// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.ubercab.rds.core.network.SupportApi;
import com.ubercab.ui.TextView;
import java.util.ArrayList;
import java.util.List;

public class hii extends hbs
{

    chp a;
    gmg b;
    cgh c;
    hck d;
    SupportApi e;
    ImageView f;
    ListView g;
    RelativeLayout h;
    TextView i;
    TextView j;
    hig k;
    private RelativeLayout l;
    private RelativeLayout m;
    private hik n;
    private List o;
    private boolean p;
    private boolean q;
    private boolean r;

    public hii()
    {
        p = false;
        q = false;
        r = true;
    }

    private void a(int i1)
    {
        p = true;
        e.tripHistory(d.z(), d.y(), d.x(), i1, 10, new _cls3());
    }

    private void a(View view)
    {
        h = (RelativeLayout)view.findViewById(hbk.ub__error_support_form);
        f = (ImageView)view.findViewById(hbk.ub__error_imageview);
        i = (TextView)view.findViewById(hbk.ub__error_textview_title);
        j = (TextView)view.findViewById(hbk.ub__error_textview_subtitle);
    }

    static void a(hii hii1)
    {
        hii1.d();
    }

    private void a(hij hij1)
    {
        hij1.a(this);
    }

    static hik b(hii hii1)
    {
        return hii1.n;
    }

    static RelativeLayout c(hii hii1)
    {
        return hii1.l;
    }

    public static hii c()
    {
        return new hii();
    }

    static RelativeLayout d(hii hii1)
    {
        return hii1.m;
    }

    private void d()
    {
        if (!q && r && !p)
        {
            g.addFooterView(m, null, false);
            a(k.getCount());
        }
    }

    private void e()
    {
        i.setText(getString(hbo.ub__rds__problem_loading_trips));
        j.setText(getString(hbo.ub__rds__please_try_again));
        j.setVisibility(0);
        h.setVisibility(0);
    }

    static void e(hii hii1)
    {
        hii1.f();
    }

    private void f()
    {
        f.setVisibility(8);
        i.setText(getString(hbo.ub__rds__no_trips));
        h.setVisibility(0);
    }

    static boolean f(hii hii1)
    {
        hii1.r = false;
        return false;
    }

    private hij g()
    {
        return hhn.a().a(new hbt(getActivity().getApplication())).a();
    }

    static boolean g(hii hii1)
    {
        hii1.p = false;
        return false;
    }

    static void h(hii hii1)
    {
        hii1.e();
    }

    public final void a(hik hik)
    {
        n = hik;
    }

    protected final volatile void a(Object obj)
    {
        a((hij)obj);
    }

    protected final Object b()
    {
        return g();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle != null)
        {
            o = bundle.getParcelableArrayList("com.ubercab.rds.EXTRA_TRIP_HISTORY");
            r = bundle.getBoolean("com.ubercab.rds.EXTRA_MORE_TRIPS", true);
        } else
        {
            o = new ArrayList();
        }
        k = new hig(c, getResources(), o, d.y(), b.a(hcl.c), b.a(hcl.b));
        g.addFooterView(m, null, false);
        g.setAdapter(k);
        g.removeFooterView(m);
        g.setOnScrollListener(new _cls1());
        g.setOnItemClickListener(new _cls2());
        if (o == null || o.size() == 0)
        {
            l.setVisibility(0);
            a(0);
        }
        a.a(h.m);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(hbm.ub__trip_history_fragment, viewgroup, false);
        g = (ListView)viewgroup.findViewById(hbk.ub__trip_history_listview);
        l = (RelativeLayout)viewgroup.findViewById(hbk.ub__support_loading);
        m = (RelativeLayout)layoutinflater.inflate(hbm.ub__trip_history_loading_footer, null, false);
        a(viewgroup);
        return viewgroup;
    }

    public void onPause()
    {
        super.onPause();
        q = true;
        l.setVisibility(8);
        g.removeFooterView(m);
    }

    public void onResume()
    {
        super.onResume();
        q = false;
        if (k != null && g != null)
        {
            int i1 = k.getCount();
            if (i1 > 0 && i1 - 1 == g.getLastVisiblePosition())
            {
                d();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("com.ubercab.rds.EXTRA_TRIP_HISTORY", (ArrayList)o);
        bundle.putBoolean("com.ubercab.rds.EXTRA_MORE_TRIPS", r);
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
