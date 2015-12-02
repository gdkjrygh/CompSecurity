// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.slider.PanelRateCardView;

public final class gdn
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private gdn(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new gdn(hsr1, hzb1, hzb2, hzb3, hzb4);
    }

    private void a(PanelRateCardView panelratecardview)
    {
        if (panelratecardview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(panelratecardview);
            panelratecardview.a = (chp)c.a();
            panelratecardview.b = (cev)d.a();
            panelratecardview.c = (fqc)e.a();
            panelratecardview.d = (fte)f.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((PanelRateCardView)obj);
    }

    static 
    {
        boolean flag;
        if (!gdn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
