// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.addressbook.UploadContactsIntentService;

public final class dyk
    implements dyp
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hsr h;

    private dyk(dyl dyl1)
    {
        if (!a && dyl1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(dyl1);
            return;
        }
    }

    dyk(dyl dyl1, byte byte0)
    {
        this(dyl1);
    }

    public static dyl a()
    {
        return new dyl((byte)0);
    }

    private void a(dyl dyl1)
    {
        b = dyr.a(dyl.a(dyl1));
        c = new hst(dyl1) {

            final dyl a;
            final dyk b;

            private gmg b()
            {
                gmg gmg = dyl.b(a).f();
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
                b = dyk.this;
                a = dyl1;
                super();
            }
        };
        d = new hst(dyl1) {

            final dyl a;
            final dyk b;

            private hjo b()
            {
                hjo hjo = dyl.b(a).g();
                if (hjo == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return hjo;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dyk.this;
                a = dyl1;
                super();
            }
        };
        e = dys.a(dyl.a(dyl1), d);
        f = new hst(dyl1) {

            final dyl a;
            final dyk b;

            private dal b()
            {
                dal dal = dyl.b(a).ap();
                if (dal == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dal;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = dyk.this;
                a = dyl1;
                super();
            }
        };
        g = dyt.a(dyl.a(dyl1), b, c, e, f);
        h = dyu.a(hsu.a(), g);
    }

    public final void a(UploadContactsIntentService uploadcontactsintentservice)
    {
        h.injectMembers(uploadcontactsintentservice);
    }

    static 
    {
        boolean flag;
        if (!dyk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
