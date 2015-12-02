// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.emergency;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rds.feature.support.SupportHomeActivity;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dbf;
import dfp;
import diw;
import dzc;
import dzd;
import dzg;
import gmg;
import hkr;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.emergency:
//            EmergencyFragment

public class EmergencyHelpChooserFragment extends cyz
{

    public chp a;
    public hkr b;
    public gmg c;
    TextView mTextViewEmergency;
    TextView mTextViewHelp;

    public EmergencyHelpChooserFragment()
    {
    }

    public static void a(RiderActivity rideractivity)
    {
        (new EmergencyHelpChooserFragment()).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/emergency/EmergencyHelpChooserFragment.getName());
    }

    private void a(dzg dzg1)
    {
        dzg1.a(this);
    }

    private dzg b(dfp dfp)
    {
        return dzc.a().a(new diw(this)).a(dfp).a();
    }

    private String d()
    {
        ClientStatus clientstatus = b.d();
        if (clientstatus != null)
        {
            return clientstatus.getStatus();
        } else
        {
            return "";
        }
    }

    public final cic a()
    {
        return l.gc;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dzg)czj);
    }

    void onClickEmergency()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.eq).setValue(d());
        a.a(analyticsevent);
        EmergencyFragment.a(b());
        dismiss();
    }

    void onClickHelp()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.er).setValue(d());
        a.a(analyticsevent);
        startActivity(SupportHomeActivity.a(b()));
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03005c, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = c.b(dbf.cc, "safety_emergency");
        if (!TextUtils.isEmpty(view))
        {
            mTextViewEmergency.setText(view);
        }
        view = c.b(dbf.cc, "safety_emergency_help");
        if (!TextUtils.isEmpty(view))
        {
            mTextViewHelp.setText(view);
        }
    }
}
