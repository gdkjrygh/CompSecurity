// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;

// Referenced classes of package com.go.weatherex.setting:
//            bi, ba

class bh
{

    final ba a;
    private bi b[];

    public bh(ba ba1, bi abi[])
    {
        a = ba1;
        super();
        b = abi;
    }

    private void d()
    {
        int j = a();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!b[i].d)
                    {
                        break label0;
                    }
                    b[i].d = false;
                }
                return;
            }
            i++;
        } while (true);
    }

    public int a()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.length;
        }
    }

    public void a(int i)
    {
        d();
        if (i < a() && b != null)
        {
            b[i].d = true;
            ba.a(a, b[i]);
            if (ba.l(a) != null)
            {
                ba.m(a).setText(ba.l(a).a());
            }
        }
    }

    public CharSequence[] b()
    {
        int j = a();
        CharSequence acharsequence[] = new CharSequence[j];
        for (int i = 0; i < j; i++)
        {
            acharsequence[i] = b[i].a();
        }

        return acharsequence;
    }

    public int c()
    {
        int j = a();
        for (int i = 0; i < j; i++)
        {
            if (b[i].d)
            {
                return i;
            }
        }

        return 0;
    }
}
