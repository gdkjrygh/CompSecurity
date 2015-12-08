// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import java.util.ArrayList;

// Referenced classes of package com.jiubang.core.a:
//            f, q, i, t

public class h extends f
{

    protected ArrayList m;
    protected ArrayList n;

    public h(int i)
    {
        super(i);
        this.i = true;
    }

    public void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("attachAnimator cannot be null");
        f1;
        this;
        JVM INSTR monitorexit ;
        throw f1;
        int i;
        if (m == null)
        {
            m = new ArrayList();
        }
        i = m.indexOf(f1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        m.add(f1);
          goto _L1
    }

    protected boolean a(q q, i i, long l, t t)
    {
        int j;
        int k;
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        k = m.size();
        j = 0;
_L1:
        boolean flag;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (!((f)m.get(j)).c())
        {
            flag = true;
        } else
        {
label0:
            {
                if (((f)m.get(j)).d())
                {
                    break label0;
                }
                flag = true;
            }
        }
_L2:
        if (!flag)
        {
            d = true;
        }
        return flag;
        j++;
          goto _L1
        flag = false;
          goto _L2
    }

    protected boolean c(q q, i i, long l, t t)
    {
        f f1;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        if (a(q, i, l, t))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (m == null) goto _L2; else goto _L1
_L1:
        k = m.size();
        flag1 = flag;
        if (k <= 0) goto _L2; else goto _L3
_L3:
        f1 = (f)m.get(0);
        if (f1 == null || !f1.e()) goto _L5; else goto _L4
_L4:
        if (f1.b(q, i, l, t))
        {
            flag1 = true;
            flag = flag1;
            if (f1.c())
            {
                flag = flag1;
                if (!f1.d())
                {
                    m.remove(f1);
                    flag = flag1;
                }
            }
        }
_L7:
        flag1 = flag;
        if (m.size() <= 0)
        {
            a(q, i, l, t);
            flag1 = flag;
        }
_L2:
        return flag1;
_L5:
        j = 0;
        flag1 = flag;
        while (j < k) 
        {
            f1 = (f)m.get(j);
            if (f1 != null && f1.b(q, i, l, t))
            {
                if (f1.c() && !f1.d())
                {
                    if (n == null)
                    {
                        n = new ArrayList();
                    }
                    n.add(f1);
                }
                flag = true;
            } else
            {
                flag = flag1;
            }
            j++;
            flag1 = flag;
        }
        if (n != null)
        {
            k = n.size();
            for (j = 0; j < k; j++)
            {
                m.remove(n.get(j));
            }

            n.clear();
            n = null;
        }
        flag = flag1;
        if (m.size() <= 0)
        {
            a(q, i, l, t);
            flag = flag1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
