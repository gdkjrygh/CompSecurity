// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.ui.Button;

public final class cut extends cql
    implements cud
{

    cuc c;
    chp d;
    cgh e;
    Button f;
    ImageView g;

    public cut()
    {
    }

    private void a(cuu cuu1)
    {
        cuu1.a(this);
    }

    public static cut b(String s)
    {
        cut cut1 = new cut();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_IMAGE_URL", s);
        cut1.setArguments(bundle);
        return cut1;
    }

    private cuu g()
    {
        return ctx.a().a(new crw(this)).a(c().d()).a();
    }

    final void a(View view)
    {
        d.a(c.B);
        c.a((ViewGroup)view.getRootView(), this);
    }

    public final volatile void a(crf crf)
    {
        a((cuu)crf);
    }

    protected final crf b()
    {
        return g();
    }

    public final void e()
    {
        d.a(b.H);
    }

    public final void f()
    {
        d.a(b.I);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(coc.ub__partner_funnel_onboarding_vehicle_inspection_own_inspection, viewgroup, false);
        f = (Button)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_vehicle_inspection_get_own_button);
        g = (ImageView)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_vehicle_inspection_image);
        f.setOnClickListener(new _cls1());
        if (getArguments() != null && !TextUtils.isEmpty(getArguments().getString("KEY_IMAGE_URL")))
        {
            g.setVisibility(0);
            e.a(getArguments().getString("KEY_IMAGE_URL")).a(cgc.b).a(g);
        }
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        f = null;
    }

    public final void onPause()
    {
        super.onPause();
        c.b();
    }

    public final void onResume()
    {
        super.onResume();
        d.a(b.G);
    }

    /* member class not found */
    class _cls1 {}

}
