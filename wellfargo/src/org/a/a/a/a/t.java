// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package org.a.a.a.a:
//            u

abstract class t
{

    private final ConcurrentMap a = new ConcurrentHashMap(7);
    private final ConcurrentMap b = new ConcurrentHashMap(7);

    t()
    {
    }

    protected abstract Format b(String s, TimeZone timezone, Locale locale);

    public Format c(String s, TimeZone timezone, Locale locale)
    {
label0:
        {
            if (s == null)
            {
                throw new NullPointerException("pattern must not be null");
            }
            TimeZone timezone1 = timezone;
            if (timezone == null)
            {
                timezone1 = TimeZone.getDefault();
            }
            timezone = locale;
            if (locale == null)
            {
                timezone = Locale.getDefault();
            }
            u u1 = new u(new Object[] {
                s, timezone1, timezone
            });
            Format format = (Format)a.get(u1);
            locale = format;
            if (format == null)
            {
                s = b(s, timezone1, timezone);
                locale = (Format)a.putIfAbsent(u1, s);
                if (locale == null)
                {
                    break label0;
                }
            }
            return locale;
        }
        return s;
    }
}
