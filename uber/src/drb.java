// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class drb
{

    final dra a;
    private final long b;
    private final TimeUnit c;
    private final hjn d;
    private icl e;
    private ScheduledFuture f;

    private drb(dra dra1, hjn hjn, long l, TimeUnit timeunit)
    {
        a = dra1;
        super();
        d = hjn;
        b = l;
        c = timeunit;
    }

    drb(dra dra1, hjn hjn, long l, TimeUnit timeunit, byte byte0)
    {
        this(dra1, hjn, l, timeunit);
    }

    static hjn a(drb drb1)
    {
        return drb1.d;
    }

    static icl a(drb drb1, icl icl1)
    {
        drb1.e = icl1;
        return icl1;
    }

    final drb a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null || f.isDone() || f.isCancelled())
        {
            Runnable runnable = new Runnable() {

                final drb a;

                public final void run()
                {
                    drb.a(a, ((ica)drb.a(a).a()).a(ico.a()).a(new icg(this) {

                        final _cls1 a;

                        public final void a()
                        {
                            dra.a(a.a);
                        }

                        public final void a(Object obj)
                        {
                        }

                        public final void a(Throwable throwable)
                        {
                            dra.a(a.a);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }));
                }

            
            {
                a = drb.this;
                super();
            }
            };
            f = dra.a(a).schedule(runnable, b, c);
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }

    public final drb b()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.b();
        }
        if (f != null && !f.isDone() && !f.isCancelled())
        {
            f.cancel(true);
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        Exception exception;
        exception;
        throw exception;
    }
}
