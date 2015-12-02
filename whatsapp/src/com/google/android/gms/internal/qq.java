// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qw, qs, qt, qp

public abstract class qq extends qw
{

    protected qs ayW;

    public qq()
    {
    }

    public void a(qp qp)
    {
        boolean flag = qw.a;
        if (ayW != null)
        {
            int i = 0;
            do
            {
                if (i >= ayW.size())
                {
                    continue;
                }
                ayW.hi(i).a(qp);
                i++;
            } while (!flag);
        }
        break MISSING_BLOCK_LABEL_45;
        while (true) 
        {
            return;
        }
    }

    protected final boolean a(qq qq1)
    {
        if (ayW == null || ayW.isEmpty())
        {
            return qq1.ayW == null || qq1.ayW.isEmpty();
        } else
        {
            return ayW.equals(qq1.ayW);
        }
    }

    protected int c()
    {
        int j = 0;
        boolean flag = qw.a;
        if (ayW != null)
        {
            int i = 0;
            int k;
            do
            {
                k = i;
                if (j >= ayW.size())
                {
                    break;
                }
                k = i + ayW.hi(j).c();
                j++;
                i = k;
            } while (!flag);
            return k;
        } else
        {
            return 0;
        }
    }

    protected final int rQ()
    {
        if (ayW == null || ayW.isEmpty())
        {
            return 0;
        } else
        {
            return ayW.hashCode();
        }
    }
}
