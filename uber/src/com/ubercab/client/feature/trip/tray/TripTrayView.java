// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.chat.model.ConversationThread;
import com.ubercab.chat.model.Message;
import com.ubercab.client.feature.trip.slider.SlidePanelLayout;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import cxu;
import czi;
import dal;
import dbf;
import dqt;
import drc;
import dzw;
import eyy;
import fqp;
import fte;
import gfj;
import gfp;
import gju;
import gmg;
import hkr;

// Referenced classes of package com.ubercab.client.feature.trip.tray:
//            TrayWrapperLayout

public class TripTrayView extends FrameLayout
{

    public chp a;
    public dqt b;
    public drc c;
    public cev d;
    public cxu e;
    public gju f;
    public hkr g;
    public gmg h;
    public dzw i;
    public eyy j;
    public dal k;
    public fte l;
    gfp m;
    SlidePanelLayout mSlidePanel;
    TrayWrapperLayout mStackLayout;

    public TripTrayView(Context context)
    {
        this(context, null);
    }

    public TripTrayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripTrayView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        if (!isInEditMode())
        {
            ((fqp)((czi)context).d()).a(this);
        }
    }

    private boolean d()
    {
        return mSlidePanel.getVisibility() == 0;
    }

    private Message e()
    {
        if (g.f() == null || g.f().getDriver() == null)
        {
            return null;
        } else
        {
            return e.a(g.f().getDriver().getUuid(), g.f().getUuid()).getLastReceivedMessage();
        }
    }

    private boolean f()
    {
        return h.a(dbf.ai);
    }

    public final boolean a()
    {
        if (d() && mSlidePanel.a())
        {
            m.a();
            return true;
        } else
        {
            return false;
        }
    }

    public final int b()
    {
        return mSlidePanel.b() - mStackLayout.getPaddingTop();
    }

    public final void c()
    {
        int i1 = l.g();
        gfp gfp1 = m;
        com.ubercab.rider.realtime.model.City city = g.b();
        com.ubercab.rider.realtime.model.Client client = g.c();
        com.ubercab.rider.realtime.model.ClientStatus clientstatus = g.d();
        com.ubercab.rider.realtime.model.Eyeball eyeball = g.e();
        Message message;
        if (f())
        {
            message = e();
        } else
        {
            message = null;
        }
        gfp1.a(new gfj(city, client, clientstatus, eyeball, message, g.f(), i1));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        m = new gfp(a, b, c, d, f, getContext(), i, k, mSlidePanel, mStackLayout, j);
        c();
    }
}
