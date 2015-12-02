// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;

public final class eep
{

    private boolean a;
    private UberLatLng b;
    private UberLatLngBounds c;
    private Float d;
    private int e;

    private eep()
    {
    }

    eep(byte byte0)
    {
        this();
    }

    static int a(eep eep1, int i)
    {
        eep1.e = i;
        return i;
    }

    static UberLatLng a(eep eep1, UberLatLng uberlatlng)
    {
        eep1.b = uberlatlng;
        return uberlatlng;
    }

    static UberLatLngBounds a(eep eep1, UberLatLngBounds uberlatlngbounds)
    {
        eep1.c = uberlatlngbounds;
        return uberlatlngbounds;
    }

    public static eeq a()
    {
        return new eeq((byte)0);
    }

    static Float a(eep eep1, Float float1)
    {
        eep1.d = float1;
        return float1;
    }

    static boolean a(eep eep1, boolean flag)
    {
        eep1.a = flag;
        return flag;
    }

    public final cji a(int i, int j)
    {
        new cjk();
        if (c != null && i > 0 && j > 0)
        {
            return cjk.a(c, e);
        }
        if (b != null)
        {
            if (d != null)
            {
                return cjk.a(b, d.floatValue());
            } else
            {
                return cjk.a(b);
            }
        } else
        {
            return null;
        }
    }

    public final boolean b()
    {
        return a;
    }
}
