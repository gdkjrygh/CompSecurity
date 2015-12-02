// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;

public final class eeq
{

    private UberLatLng a;
    private UberLatLngBounds b;
    private Float c;
    private boolean d;
    private int e;

    private eeq()
    {
    }

    eeq(byte byte0)
    {
        this();
    }

    public final eep a()
    {
        eep eep1 = new eep((byte)0);
        eep.a(eep1, a);
        eep.a(eep1, b);
        eep.a(eep1, e);
        eep.a(eep1, c);
        eep.a(eep1, d);
        return eep1;
    }

    public final eeq a(float f)
    {
        c = Float.valueOf(f);
        b = null;
        e = 0;
        return this;
    }

    public final eeq a(UberLatLng uberlatlng)
    {
        a = uberlatlng;
        b = null;
        e = 0;
        return this;
    }

    public final eeq a(UberLatLngBounds uberlatlngbounds, UberLatLng uberlatlng)
    {
        return a(uberlatlngbounds, uberlatlng, 15F, 0);
    }

    public final eeq a(UberLatLngBounds uberlatlngbounds, UberLatLng uberlatlng, float f, int i)
    {
        b = uberlatlngbounds;
        e = i;
        a = uberlatlng;
        c = Float.valueOf(f);
        return this;
    }

    public final eeq a(boolean flag)
    {
        d = flag;
        return this;
    }
}
