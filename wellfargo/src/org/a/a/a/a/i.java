// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            g

class i
    implements g
{

    private final int a;
    private final String b[];

    i(int j, String as[])
    {
        a = j;
        b = as;
    }

    public int a()
    {
        int j = 0;
        int k = b.length;
        do
        {
            k--;
            if (k < 0)
            {
                break;
            }
            int l = b[k].length();
            if (l > j)
            {
                j = l;
            }
        } while (true);
        return j;
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        stringbuffer.append(b[calendar.get(a)]);
    }
}
