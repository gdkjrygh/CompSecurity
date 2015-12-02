// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;
import com.ubercab.android.location.UberLatLng;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class dcj extends LruCache
{

    private dcj()
    {
        super(10);
    }

    dcj(byte byte0)
    {
        this();
    }

    private dck a(UberLatLng uberlatlng)
    {
        for (Iterator iterator = snapshot().keySet().iterator(); iterator.hasNext();)
        {
            UberLatLng uberlatlng1 = (UberLatLng)iterator.next();
            if (dch.a(uberlatlng1, uberlatlng))
            {
                return (dck)get(uberlatlng1);
            }
        }

        return null;
    }

    static dck a(dcj dcj1, UberLatLng uberlatlng)
    {
        return dcj1.a(uberlatlng);
    }

    private void a(UberLatLng uberlatlng, dck dck1)
    {
        for (Iterator iterator = snapshot().keySet().iterator(); iterator.hasNext();)
        {
            if (dch.a((UberLatLng)iterator.next(), uberlatlng))
            {
                return;
            }
        }

        put(uberlatlng, dck1);
    }

    static void a(dcj dcj1, UberLatLng uberlatlng, dck dck1)
    {
        dcj1.a(uberlatlng, dck1);
    }
}
