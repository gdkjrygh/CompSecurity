// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.feature.music.MusicControlChannelService;

public final class egr
    implements eif
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hsr h;

    private egr(egs egs1)
    {
        if (!a && egs1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(egs1);
            return;
        }
    }

    egr(egs egs1, byte byte0)
    {
        this(egs1);
    }

    public static egs a()
    {
        return new egs((byte)0);
    }

    private void a(egs egs1)
    {
        b = new hst(egs1) {

            final egs a;
            final egr b;

            private cev b()
            {
                cev cev = egs.a(a).D();
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
                b = egr.this;
                a = egs1;
                super();
            }
        };
        c = new hst(egs1) {

            final egs a;
            final egr b;

            private gmg b()
            {
                gmg gmg = egs.a(a).f();
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
                b = egr.this;
                a = egs1;
                super();
            }
        };
        d = new hst(egs1) {

            final egs a;
            final egr b;

            private Application b()
            {
                Application application = egs.a(a).C();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = egr.this;
                a = egs1;
                super();
            }
        };
        e = new hst(egs1) {

            final egs a;
            final egr b;

            private gqu b()
            {
                gqu gqu = egs.a(a).aH();
                if (gqu == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return gqu;
                }
            }

            public final Object a()
            {
                return b();
            }

            
            {
                b = egr.this;
                a = egs1;
                super();
            }
        };
        f = new hst(egs1) {

            final egs a;
            final egr b;

            private dal b()
            {
                dal dal = egs.a(a).ap();
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
                b = egr.this;
                a = egs1;
                super();
            }
        };
        g = hsw.a(eii.a(egs.b(egs1), d, e, f));
        h = eij.a(hsu.a(), b, c, g);
    }

    public final void a(MusicControlChannelService musiccontrolchannelservice)
    {
        h.injectMembers(musiccontrolchannelservice);
    }

    static 
    {
        boolean flag;
        if (!egr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
