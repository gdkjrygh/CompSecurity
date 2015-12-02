// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.map.MapView;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.signup.form.model.PointOfInterest;
import java.util.ArrayList;

public final class cuq extends cql
    implements ctp
{

    private static final int d;
    chp c;
    private ctp e;
    private cta f;
    private PointOfInterest g;

    public cuq()
    {
    }

    public static cuq a(ArrayList arraylist, PointOfInterest pointofinterest, b b1, c c1, c c2)
    {
        cuq cuq1 = new cuq();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ARGUMENT_KEY_LIST_OF_POI", arraylist);
        bundle.putParcelable("ARGUMENT_KEY_SINGLE_POI", pointofinterest);
        bundle.putSerializable("ARGUMENT_KEY_IMPRESSION_EVENT", b1);
        bundle.putSerializable("ARGUMENT_KEY_DIRECTIONS_TAP_EVENT", c1);
        bundle.putSerializable("ARGUMENT_KEY_EMAIL_TAP_EVENT", c2);
        cuq1.setArguments(bundle);
        return cuq1;
    }

    private void a(cur cur1)
    {
        cur1.a(this);
    }

    private cur e()
    {
        return ctv.a().a(new crw(this)).a(c().d()).a();
    }

    public final void a(int i, int j, int k, int l)
    {
        f.a(l - k);
        if (f.e() != null)
        {
            f.e().setTranslationY((float)(-(k - i)) / 2.0F);
        }
        if (e != null)
        {
            e.a(i, j, k, l);
        }
    }

    public final volatile void a(crf crf)
    {
        a((cur)crf);
    }

    protected final crf b()
    {
        return e();
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        try
        {
            e = (ctp)context;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(coc.ub__partner_funnel_onboarding_vehicle_inspection_map, viewgroup, false);
    }

    public final void onDetach()
    {
        super.onDetach();
        e = null;
    }

    public final void onResume()
    {
        super.onResume();
        if (getArguments() == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        b b1 = (b)getArguments().getSerializable("ARGUMENT_KEY_IMPRESSION_EVENT");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        Object obj;
        if (g == null || g.getPoiId() == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = g.getPoiId();
_L1:
        obj = AnalyticsEvent.create("impression").setName(b1).setValue(((String) (obj)));
        c.a(((AnalyticsEvent) (obj)));
        return;
        obj = "";
          goto _L1
        ClassCastException classcastexception;
        classcastexception;
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        Object obj;
        Object obj1;
        obj = null;
        super.onViewCreated(view, bundle);
        obj1 = getArguments();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        bundle = ((Bundle) (obj1)).getParcelableArrayList("ARGUMENT_KEY_LIST_OF_POI");
        g = (PointOfInterest)((Bundle) (obj1)).getParcelable("ARGUMENT_KEY_SINGLE_POI");
        try
        {
            view = (c)((Bundle) (obj1)).getSerializable("ARGUMENT_KEY_DIRECTIONS_TAP_EVENT");
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view = null;
        }
        try
        {
            obj1 = (c)((Bundle) (obj1)).getSerializable("ARGUMENT_KEY_EMAIL_TAP_EVENT");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Object obj3 = null;
            obj = view;
            Bundle bundle1 = bundle;
            view = obj3;
            bundle = ((Bundle) (obj));
            obj = bundle1;
            continue; /* Loop/switch isn't completed */
        }
        obj = bundle;
        bundle = view;
        view = ((View) (obj1));
_L4:
        f = cta.a(((ArrayList) (obj)), g);
        getChildFragmentManager().beginTransaction().add(d, f, f.getClass().getName()).commit();
        if (g != null)
        {
            view = cto.a(g, bundle, view);
            view.a(this);
            getChildFragmentManager().beginTransaction().add(cob.ub__partner_funnel_onboarding_vehicle_inspection_infopanel, view, view.getClass().getName()).commit();
        }
        return;
_L2:
        view = null;
        Object obj2 = null;
        bundle = ((Bundle) (obj));
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        d = cob.ub__partner_funnel_onboarding_vehicle_inspection_map;
    }
}
