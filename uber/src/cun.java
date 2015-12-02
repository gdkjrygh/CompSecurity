// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLocation;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import java.util.ArrayList;

public class cun extends cua
{

    chp c;
    RecyclerView d;
    cuf e;
    private double f;

    public cun()
    {
        f = -1D;
    }

    public static cun a(ArrayList arraylist, String s, String s1, boolean flag, b b1)
    {
        cun cun1 = new cun();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ARGUMENT_KEY_LIST_OF_POI", arraylist);
        bundle.putString("ARGUMENT_KEY_HEADER_COPY", s);
        bundle.putString("ARGUMENT_KEY_FOOTER_COPY", s1);
        bundle.putBoolean("ARGUMENT_KEY_SHOW_INCENTIVES", flag);
        bundle.putSerializable("ARGUMENT_KEY_IMPRESSION_EVENT", b1);
        cun1.setArguments(bundle);
        return cun1;
    }

    private void a(cuo cuo1)
    {
        cuo1.a(this);
    }

    private cuo e()
    {
        return ctt.a().a(new crw(this)).a(c().d()).a();
    }

    public final void a(ciu ciu)
    {
        e.b(null);
    }

    public final void a(UberLocation uberlocation)
    {
        cuf cuf1 = e;
        if (uberlocation != null)
        {
            uberlocation = uberlocation.g();
        } else
        {
            uberlocation = null;
        }
        cuf1.b(uberlocation);
    }

    public final volatile void a(crf crf)
    {
        a((cuo)crf);
    }

    protected final crf b()
    {
        return e();
    }

    public final void b_()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = new RecyclerView(getActivity());
        d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        getActivity();
        layoutinflater = new LinearLayoutManager();
        layoutinflater.h();
        d.a(layoutinflater);
        d.h().i();
        return d;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d = null;
        e.a(null);
        e = null;
    }

    public void onResume()
    {
        super.onResume();
        if (getArguments() == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Object obj;
        try
        {
            obj = (b)getArguments().getSerializable("ARGUMENT_KEY_IMPRESSION_EVENT");
        }
        catch (ClassCastException classcastexception)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = AnalyticsEvent.create("impression").setName(((cia) (obj))).setValue(Double.valueOf(f));
        c.a(((AnalyticsEvent) (obj)));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        Object obj1 = null;
        super.onViewCreated(view, bundle);
        Object obj = getArguments();
        String s;
        String s1;
        UberLocation uberlocation;
        boolean flag;
        if (obj != null)
        {
            bundle = ((Bundle) (obj)).getParcelableArrayList("ARGUMENT_KEY_LIST_OF_POI");
            s1 = ((Bundle) (obj)).getString("ARGUMENT_KEY_HEADER_COPY");
            s = ((Bundle) (obj)).getString("ARGUMENT_KEY_FOOTER_COPY");
            flag = ((Bundle) (obj)).getBoolean("ARGUMENT_KEY_SHOW_INCENTIVES", false);
        } else
        {
            flag = false;
            s = null;
            s1 = null;
            bundle = null;
        }
        obj = bundle;
        if (bundle == null)
        {
            obj = new ArrayList();
        }
        uberlocation = l();
        bundle = obj1;
        if (uberlocation != null)
        {
            bundle = uberlocation.g();
        }
        e = (new cug(view.getContext())).a(s).b(s1).a(((java.util.List) (obj))).a(bundle).a(flag).a();
        e.a((cuk)getActivity());
        if (bundle != null && e.e() > 0)
        {
            try
            {
                f = e.a(bundle);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                ijg.c("IndexOfBounds while calculating distance", new Object[0]);
            }
        }
        d.a(e);
    }
}
