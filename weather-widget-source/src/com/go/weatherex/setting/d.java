// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.widget.TextView;

// Referenced classes of package com.go.weatherex.setting:
//            e, b

class d
{

    final b a;
    private e b[];

    public d(b b1, e ae[])
    {
        a = b1;
        super();
        b = ae;
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
            com.go.weatherex.setting.b.a(a, b[i]);
            if (com.go.weatherex.setting.b.e(a) != null)
            {
                com.go.weatherex.setting.b.f(a).setText(com.go.weatherex.setting.b.e(a).a());
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
