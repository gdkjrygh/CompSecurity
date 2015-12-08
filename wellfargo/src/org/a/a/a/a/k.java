// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.a.a.a.a:
//            g, b

class k
    implements g
{

    private final TimeZone a;
    private final String b;
    private final String c;

    k(TimeZone timezone, Locale locale, int i)
    {
        a = timezone;
        b = org.a.a.a.a.b.a(timezone, false, i, locale);
        c = org.a.a.a.a.b.a(timezone, true, i, locale);
    }

    public int a()
    {
        return Math.max(b.length(), c.length());
    }

    public void a(StringBuffer stringbuffer, Calendar calendar)
    {
        if (a.useDaylightTime() && calendar.get(16) != 0)
        {
            stringbuffer.append(c);
            return;
        } else
        {
            stringbuffer.append(b);
            return;
        }
    }
}
