// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class iim
{

    private static final iim d = new iim();
    private final ici a;
    private final ici b;
    private final ici c;

    private iim()
    {
        ici ici = iia.a().d().a();
        if (ici != null)
        {
            a = ici;
        } else
        {
            a = new ifu();
        }
        ici = iia.a().d().b();
        if (ici != null)
        {
            b = ici;
        } else
        {
            b = new iic();
        }
        ici = iia.a().d().c();
        if (ici != null)
        {
            c = ici;
            return;
        } else
        {
            c = iil.c();
            return;
        }
    }

    public static ici a()
    {
        return iio.c();
    }

    public static ici a(Executor executor)
    {
        return new iig(executor);
    }

    public static ici b()
    {
        return d.a;
    }

    public static ici c()
    {
        return d.b;
    }

}
