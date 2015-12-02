// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;

final class ang.Object
    implements glv
{

    final hkr a;
    final ddn b;

    public final String a()
    {
        City city = a.b();
        if (city != null)
        {
            return city.getCityName();
        } else
        {
            return null;
        }
    }

    (ddn ddn1, hkr hkr1)
    {
        b = ddn1;
        a = hkr1;
        super();
    }
}
