// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ifp
    implements icd
{

    private ifp()
    {
    }

    ifp(byte byte0)
    {
        this();
    }

    private ick a(ick ick1)
    {
        ift ift1 = new ift(ick1);
        ick ick2 = new ick(ift1, ick1) {

            boolean a;
            List b;
            final ift c;
            final ick d;
            final ifp e;

            public final void a()
            {
                if (!a)
                {
                    a = true;
                    ArrayList arraylist;
                    try
                    {
                        arraylist = new ArrayList(b);
                    }
                    catch (Throwable throwable)
                    {
                        a(throwable);
                        return;
                    }
                    b = null;
                    c.a(arraylist);
                }
            }

            public final void a(Object obj)
            {
                if (!a)
                {
                    b.add(obj);
                }
            }

            public final void a(Throwable throwable)
            {
                d.a(throwable);
            }

            public final void d()
            {
                a(0x7fffffffffffffffL);
            }

            
            {
                e = ifp.this;
                c = ift1;
                d = ick1;
                super();
                a = false;
                b = new LinkedList();
            }
        };
        ick1.a(ick2);
        ick1.a(ift1);
        return ick2;
    }

    public static ifp a()
    {
        return ifq.a;
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
