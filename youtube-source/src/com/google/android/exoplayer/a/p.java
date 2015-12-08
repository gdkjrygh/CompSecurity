// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import com.google.android.exoplayer.upstream.c;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.a:
//            q, m, r, t

public class p extends q
{

    private final c a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final float f;

    public p(c c1, int i, int j, int k, int l, float f1)
    {
        a = c1;
        b = i;
        c = (long)j * 1000L;
        d = (long)k * 1000L;
        e = (long)l * 1000L;
        f = f1;
    }

    protected m a(m am[], long l)
    {
        int i;
        if (l == -1L)
        {
            l = b;
        } else
        {
            l = (long)((float)l * f);
        }
        for (i = 0; i < am.length; i++)
        {
            m m1 = am[i];
            if ((long)m1.g <= l)
            {
                return m1;
            }
        }

        return am[am.length - 1];
    }

    public final void a(List list, long l, m am[], r r1)
    {
        m m1;
        boolean flag1;
        long l1;
        flag1 = true;
        boolean flag;
        if (list.isEmpty())
        {
            l1 = 0L;
        } else
        {
            l1 = ((t)list.get(list.size() - 1)).e - l;
        }
        m1 = r1.c;
        am = a(am, a.c());
        if (am != null && m1 != null && ((m) (am)).g > m1.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (am == null || m1 == null || ((m) (am)).g >= m1.g)
        {
            flag1 = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (l1 >= c) goto _L4; else goto _L3
_L3:
        list = m1;
_L7:
        if (m1 != null && list != m1)
        {
            r1.b = 2;
        }
        r1.c = list;
        return;
_L4:
        if (l1 >= e)
        {
            int i = 0;
            do
            {
                if (i >= list.size())
                {
                    break;
                }
                t t1 = (t)list.get(i);
                if (t1.d - l >= e && t1.a.g < ((m) (am)).g && t1.a.d < ((m) (am)).d && t1.a.d < 720)
                {
                    r1.a = i;
                    list = am;
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
            list = am;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (flag1 && m1 != null && l1 >= d)
        {
            list = m1;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        list = am;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
