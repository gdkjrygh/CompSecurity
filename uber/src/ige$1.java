// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;

final class ang.Object
    implements idd
{

    final int a = 0;
    final int b = 0;
    final ige c;

    public final void a()
    {
        int k = 0;
        int i = 0;
        int l = ige.a(c).size();
        if (l < a)
        {
            for (k = b; i < k - l; i++)
            {
                ige.a(c).add(c.b());
            }

        } else
        if (l > b)
        {
            int i1 = b;
            for (int j = k; j < l - i1; j++)
            {
                ige.a(c).poll();
            }

        }
    }

    (ige ige1)
    {
        c = ige1;
        super();
    }
}
