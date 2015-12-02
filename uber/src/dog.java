// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.push.ProcessPushService;

public final class dog
    implements doi
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private dog(doh doh1)
    {
        if (!a && doh1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(doh1);
            return;
        }
    }

    dog(doh doh1, byte byte0)
    {
        this(doh1);
    }

    public static doh a()
    {
        return new doh((byte)0);
    }

    private void a(doh doh1)
    {
        b = new hst(doh1) {

            final doh a;
            final dog b;

            private gmg b()
            {
                gmg gmg = doh.a(a).f();
                if (gmg == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gmg;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dog.this;
                a = doh1;
                super();
            }
        };
        c = new hst(doh1) {

            final doh a;
            final dog b;

            private bjw b()
            {
                bjw bjw = doh.a(a).F();
                if (bjw == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return bjw;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dog.this;
                a = doh1;
                super();
            }
        };
        d = new hst(doh1) {

            final doh a;
            final dog b;

            private eky b()
            {
                eky eky = doh.a(a).ak();
                if (eky == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eky;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dog.this;
                a = doh1;
                super();
            }
        };
        e = dok.a(hsu.a(), b, c, d);
    }

    public final void a(ProcessPushService processpushservice)
    {
        e.injectMembers(processpushservice);
    }

    static 
    {
        boolean flag;
        if (!dog.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
