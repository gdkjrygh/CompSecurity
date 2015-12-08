// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;
import org.a.a.a.c;

// Referenced classes of package org.a.a.a.a:
//            e

class f
    implements e
{

    private final int a;
    private final int b;

    f(int i, int j)
    {
        if (j < 3)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = i;
            b = j;
            return;
        }
    }

    public int a()
    {
        return 4;
    }

    public final void a(StringBuffer stringbuffer, int i)
    {
        if (i < 100)
        {
            int j = b;
            do
            {
                j--;
                if (j >= 2)
                {
                    stringbuffer.append('0');
                } else
                {
                    stringbuffer.append((char)(i / 10 + 48));
                    stringbuffer.append((char)(i % 10 + 48));
                    return;
                }
            } while (true);
        }
        int k;
        int l;
        if (i < 1000)
        {
            k = 3;
        } else
        {
            boolean flag;
            if (i > -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "Negative values should not be possible", i);
            k = Integer.toString(i).length();
        }
        l = b;
        do
        {
            l--;
            if (l >= k)
            {
                stringbuffer.append('0');
            } else
            {
                stringbuffer.append(Integer.toString(i));
                return;
            }
        } while (true);
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        a(stringbuffer, calendar.get(a));
    }
}
