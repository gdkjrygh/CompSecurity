// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.overlay.AccessibilityDeafOverlayView;

public final class gch
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;

    private gch(hsr hsr1, hzb hzb1, hzb hzb2)
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
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2)
    {
        return new gch(hsr1, hzb1, hzb2);
    }

    private void a(AccessibilityDeafOverlayView accessibilitydeafoverlayview)
    {
        if (accessibilitydeafoverlayview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(accessibilitydeafoverlayview);
            accessibilitydeafoverlayview.a = (chp)c.a();
            accessibilitydeafoverlayview.b = (cgh)d.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((AccessibilityDeafOverlayView)obj);
    }

    static 
    {
        boolean flag;
        if (!gch.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
