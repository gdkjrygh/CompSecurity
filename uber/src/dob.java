// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dob
    implements cyu
{

    private final chp a;

    public dob(chp chp1)
    {
        a = chp1;
    }

    public final void a(List list)
    {
        String s;
        for (list = list.iterator(); list.hasNext(); a.a(AnalyticsEvent.create("system").setName(m.a).setValue(s)))
        {
            s = (String)list.next();
        }

    }

    public final void a(Map map)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (((Boolean)entry.getValue()).booleanValue())
            {
                a.a(AnalyticsEvent.create("system").setName(m.c).setValue((String)entry.getKey()));
            } else
            {
                a.a(AnalyticsEvent.create("system").setName(m.b).setValue((String)entry.getKey()));
            }
        }

    }
}
