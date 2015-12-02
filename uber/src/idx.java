// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class idx
    implements icc
{

    final List a;
    final ido b;

    public idx(List list, ido ido)
    {
        a = list;
        b = ido;
        if (list.size() > igg.c)
        {
            throw new IllegalArgumentException("More than RxRingBuffer.SIZE sources to combineLatest is not supported.");
        } else
        {
            return;
        }
    }

    private void a(ick ick1)
    {
        if (a.isEmpty())
        {
            ick1.a();
            return;
        }
        if (a.size() == 1)
        {
            ick1.a(new iea(ick1, (ica)a.get(0), b));
            return;
        } else
        {
            ick1.a(new idy(ick1, a, b));
            return;
        }
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
