// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;

// Referenced classes of package org.a.a.a.a:
//            e

class p
    implements e
{

    private final int a;

    p(int i)
    {
        a = i;
    }

    public int a()
    {
        return 2;
    }

    public final void a(StringBuffer stringbuffer, int i)
    {
        if (i < 100)
        {
            stringbuffer.append((char)(i / 10 + 48));
            stringbuffer.append((char)(i % 10 + 48));
            return;
        } else
        {
            stringbuffer.append(Integer.toString(i));
            return;
        }
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        a(stringbuffer, calendar.get(a));
    }
}
