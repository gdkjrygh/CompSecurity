// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.pickupnote.PickupNoteComposeFragment;

public final class gct
    implements gcy
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private gct(gcu gcu1)
    {
        if (!a && gcu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(gcu1);
            return;
        }
    }

    gct(gcu gcu1, byte byte0)
    {
        this(gcu1);
    }

    public static gcu a()
    {
        return new gcu((byte)0);
    }

    private void a(gcu gcu1)
    {
        b = new hst(gcu1) {

            final gcu a;
            final gct b;

            private cev b()
            {
                cev cev = gcu.a(a).D();
                if (cev == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return cev;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gct.this;
                a = gcu1;
                super();
            }
        };
        c = hsw.a(djd.a(gcu.b(gcu1), b));
        d = new hst(gcu1) {

            final gcu a;
            final gct b;

            private chp b()
            {
                chp chp = gcu.a(a).e();
                if (chp == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chp;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = gct.this;
                a = gcu1;
                super();
            }
        };
        e = hsw.a(djc.a(gcu.b(gcu1), d));
        f = hsw.a(dje.a(gcu.b(gcu1), c, e));
        g = czc.a(hsu.a(), f);
        h = gcz.a(g, d);
    }

    public final void a(PickupNoteComposeFragment pickupnotecomposefragment)
    {
        h.injectMembers(pickupnotecomposefragment);
    }

    static 
    {
        boolean flag;
        if (!gct.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
