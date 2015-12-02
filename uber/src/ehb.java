// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicProviderChooserFragment;

public final class ehb
    implements eit
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;
    private hsr h;

    private ehb(ehc ehc1)
    {
        if (!a && ehc1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ehc1);
            return;
        }
    }

    ehb(ehc ehc1, byte byte0)
    {
        this(ehc1);
    }

    public static ehc a()
    {
        return new ehc((byte)0);
    }

    private void a(ehc ehc1)
    {
        b = new hst(ehc1) {

            final ehc a;
            final ehb b;

            private cev b()
            {
                cev cev = ehc.a(a).D();
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
                b = ehb.this;
                a = ehc1;
                super();
            }
        };
        c = hsw.a(djd.a(ehc.b(ehc1), b));
        d = new hst(ehc1) {

            final ehc a;
            final ehb b;

            private chp b()
            {
                chp chp = ehc.a(a).e();
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
                b = ehb.this;
                a = ehc1;
                super();
            }
        };
        e = hsw.a(djc.a(ehc.b(ehc1), d));
        f = hsw.a(dje.a(ehc.b(ehc1), c, e));
        g = czc.a(hsu.a(), f);
        h = eiu.a(g, b);
    }

    public final void a(MusicProviderChooserFragment musicproviderchooserfragment)
    {
        h.injectMembers(musicproviderchooserfragment);
    }

    static 
    {
        boolean flag;
        if (!ehb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
