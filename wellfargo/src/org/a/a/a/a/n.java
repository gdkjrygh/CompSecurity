// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            e

class n
    implements e
{

    private final e a;

    n(e e1)
    {
        a = e1;
    }

    public int a()
    {
        return a.a();
    }

    public void a(StringBuffer stringbuffer, int i)
    {
        a.a(stringbuffer, i);
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        int j = calendar.get(11);
        int i = j;
        if (j == 0)
        {
            i = calendar.getMaximum(11) + 1;
        }
        a.a(stringbuffer, i);
    }
}
