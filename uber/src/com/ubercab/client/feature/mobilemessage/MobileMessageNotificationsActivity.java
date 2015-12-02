// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.MobileMessage;
import czj;
import dfe;
import dfp;
import eeu;
import eev;
import efa;
import efg;
import efm;
import hkr;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageNotificationsAdapter, MobileMessagePopupWindow

public class MobileMessageNotificationsActivity extends RiderActivity
{

    public chp h;
    public cev i;
    public hkr j;
    public efa k;
    MobileMessagePopupWindow l;
    RecyclerView mListMobileMessages;

    public MobileMessageNotificationsActivity()
    {
    }

    private List a(City city)
    {
        List list1 = Collections.emptyList();
        List list = list1;
        if (city != null)
        {
            list = list1;
            if (city.getMessages() != null)
            {
                list = k.a(city.getMessages());
            }
        }
        return list;
    }

    private void a(Context context)
    {
        List list = a(j.b());
        LinearLayoutManager linearlayoutmanager = new LinearLayoutManager();
        mListMobileMessages.a(linearlayoutmanager);
        context = new MobileMessageNotificationsAdapter(context, i, list);
        mListMobileMessages.a(context);
        a(list);
    }

    private void a(efg efg1)
    {
        efg1.a(this);
    }

    private void a(List list)
    {
        Object obj;
        for (list = list.iterator(); list.hasNext(); h.a(((AnalyticsEvent) (obj))))
        {
            obj = (MobileMessage)list.next();
            obj = AnalyticsEvent.create("impression").setName(l.cV).setValue(((MobileMessage) (obj)).getId());
        }

    }

    private boolean a(MobileMessage mobilemessage)
    {
        if (l != null && (l.isShowing() || l.d()))
        {
            return false;
        } else
        {
            l = new MobileMessagePopupWindow(this, h, i, k, j);
            return l.a(mobilemessage);
        }
    }

    private efg b(dfp dfp)
    {
        return eeu.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((efg)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300a6);
        ButterKnife.inject(this);
        a(this);
    }

    public void onBackPressed()
    {
        if (l != null && l.isShowing())
        {
            l.c();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onMobileMessageForLookingEvent(efm efm1)
    {
        a(efm1.a());
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
