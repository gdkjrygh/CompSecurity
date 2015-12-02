// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import exx;
import exy;
import eyw;
import eyy;
import ezh;
import ezi;
import ezq;
import ezr;
import gke;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            TroyProfilePreferencesAdapter

public class ReportIntervalFragment extends czb
{

    public chp c;
    public cev d;
    public eyy e;
    private Profile f;
    private int g;
    private List h;

    public ReportIntervalFragment()
    {
    }

    private static int a(Bundle bundle)
    {
        return bundle.getInt("EXTRA_REPORT_INTERVAL_FRAGMENT_MODE");
    }

    public static ReportIntervalFragment a()
    {
        ReportIntervalFragment reportintervalfragment = new ReportIntervalFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_REPORT_INTERVAL_FRAGMENT_MODE", 0);
        reportintervalfragment.setArguments(bundle);
        return reportintervalfragment;
    }

    public static ReportIntervalFragment a(Profile profile)
    {
        ReportIntervalFragment reportintervalfragment = new ReportIntervalFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TROY_PROFILE_UUID", profile.getUuid());
        bundle.putInt("EXTRA_REPORT_INTERVAL_FRAGMENT_MODE", 1);
        reportintervalfragment.setArguments(bundle);
        return reportintervalfragment;
    }

    static List a(ReportIntervalFragment reportintervalfragment)
    {
        return reportintervalfragment.h;
    }

    private void a(Context context, ListView listview)
    {
        b(context, listview);
        listview.setAdapter(new TroyProfilePreferencesAdapter(context, Arrays.asList(new ezh[] {
            (new ezh(ezi.d, context.getString(0x7f07066e))).h().a(a("Weekly")), (new ezh(ezi.f, context.getString(0x7f0702bb))).h().a(a("Monthly"))
        }), d));
        if (g == 0)
        {
            c(context, listview);
        }
    }

    private void a(eyw eyw1)
    {
        eyw1.a(this);
    }

    private void a(ezi ezi1)
    {
        if (g == 0)
        {
            if (ezi1 == ezi.d)
            {
                c.a(n.iM);
            } else
            if (ezi1 == ezi.f)
            {
                c.a(n.iK);
                return;
            }
        }
    }

    private void a(String s, boolean flag)
    {
        if (flag)
        {
            h.add(s);
            return;
        } else
        {
            h.remove(s);
            return;
        }
    }

    private boolean a(String s)
    {
        return h != null && h.contains(s);
    }

    private eyw b(dfp dfp)
    {
        return exx.a().a(new djb(this)).a(dfp).a();
    }

    private void b(Context context, ListView listview)
    {
        if (g == 1 && f != null)
        {
            View view = LayoutInflater.from(context).inflate(0x7f030150, listview, false);
            ((TextView)view.findViewById(0x7f0e03d9)).setText(getString(0x7f070497, new Object[] {
                f.getEmail()
            }));
            listview.addFooterView(view, null, false);
        }
        context = LayoutInflater.from(context).inflate(0x7f03016d, listview, false);
        listview.addFooterView(context, null, false);
        context.findViewById(0x7f0e044a).setOnClickListener(new android.view.View.OnClickListener() {

            final ReportIntervalFragment a;

            public final void onClick(View view1)
            {
                a.d.c(new ezr(ReportIntervalFragment.a(a)));
            }

            
            {
                a = ReportIntervalFragment.this;
                super();
            }
        });
    }

    private void c(Context context, ListView listview)
    {
        listview.addHeaderView(LayoutInflater.from(context).inflate(0x7f030154, listview, false), null, false);
        ((Button)listview.findViewById(0x7f0e044a)).setText(getString(0x7f0702cc));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyw)czj);
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            f = e.a(bundle.getString("EXTRA_TROY_PROFILE_UUID"));
            g = a(bundle);
        }
        Object obj;
        if (g == 0)
        {
            bundle = gke.a("Monthly");
        } else
        {
            bundle = Collections.emptyList();
        }
        obj = bundle;
        if (f != null)
        {
            if (f.getSelectedSummaryPeriods() == null)
            {
                obj = bundle;
            } else
            {
                obj = f.getSelectedSummaryPeriods();
            }
        }
        h = new ArrayList(((java.util.Collection) (obj)));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030073, viewgroup, false);
        a(layoutinflater.getContext(), (ListView)layoutinflater.findViewById(0x7f0e014b));
        return layoutinflater;
    }

    public void onProfilePreferencesItemSelectEvent(ezq ezq1)
    {
        ezi ezi1 = ezq1.a();
        if (ezi1 != ezi.d) goto _L2; else goto _L1
_L1:
        a("Weekly", ezq1.b());
_L4:
        a(ezi1);
        return;
_L2:
        if (ezi1 == ezi.f)
        {
            a("Monthly", ezq1.b());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void onSaveButtonClick()
    {
        d.c(new ezr(h));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (g == 1)
        {
            d().b().a(0x7f070496);
        }
    }
}
