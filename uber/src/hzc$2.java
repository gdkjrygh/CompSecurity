// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements hzw
{

    final hzw a;
    final hzc b;

    public final void close()
    {
        a.close();
        b.exit(true);
        return;
        Object obj;
        obj;
        throw b.exit(((IOException) (obj)));
        obj;
        b.exit(false);
        throw obj;
    }

    public final long read(hzf hzf, long l)
    {
        b.enter();
        l = a.read(hzf, l);
        b.exit(true);
        return l;
        hzf;
        throw b.exit(hzf);
        hzf;
        b.exit(false);
        throw hzf;
    }

    public final hzx timeout()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
    }

    (hzc hzc1, hzw hzw1)
    {
        b = hzc1;
        a = hzw1;
        super();
    }
}
