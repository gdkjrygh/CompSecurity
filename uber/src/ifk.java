// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

public final class ifk
    implements icd
{

    private final boolean a;
    private final Object b;

    private ifk()
    {
        this((byte)0);
    }

    private ifk(byte byte0)
    {
        a = false;
        b = null;
    }

    ifk(char c)
    {
        this();
    }

    private ick a(ick ick1)
    {
        ifm ifm1 = new ifm(ick1, a, b);
        ick1.a(new ich(ifm1) {

            final ifm a;
            final ifk b;
            private final AtomicBoolean c = new AtomicBoolean(false);

            public final void a(long l)
            {
                if (l > 0L && c.compareAndSet(false, true))
                {
                    a.e();
                }
            }

            
            {
                b = ifk.this;
                a = ifm1;
                super();
            }
        });
        ick1.a(ifm1);
        return ifm1;
    }

    public static ifk a()
    {
        return ifl.a;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
