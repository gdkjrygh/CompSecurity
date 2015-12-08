// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.io.OutputStream;
import java.util.List;
import org.a.c.a.c;

// Referenced classes of package org.a.c.b.b.c:
//            b, m, n, k

public class g extends b
{

    public g()
    {
    }

    public g(int i)
    {
        super(i);
    }

    public final void a(OutputStream outputstream, m m1)
    {
        int i;
        n n1 = a(m1);
        m1 = m1.a(n1);
        i = 0;
        int j = 8;
        do
        {
            if (i >= m1.size())
            {
                n1.a(a);
                outputstream = new c(outputstream, a);
                a(((c) (outputstream)));
                i = 0;
                break MISSING_BLOCK_LABEL_59;
            }
            k k2 = (k)m1.get(i);
            k2.a(j);
            int i1 = k2.c();
            j = j + i1 + (4 - i1 % 4) % 4;
            i++;
        } while (true);
_L2:
        int l;
        int j1;
        if (i >= m1.size())
        {
            return;
        }
        k k1 = (k)m1.get(i);
        k1.a(outputstream);
        j1 = k1.c();
        l = 0;
_L3:
label0:
        {
            if (l < (4 - j1 % 4) % 4)
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        outputstream.write(0);
        l++;
          goto _L3
    }
}
