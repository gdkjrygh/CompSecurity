// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;

final class ang.Object
    implements gjv
{

    final gbv a;

    private static UberLatLng a(UberLatLng uberlatlng)
    {
        return new UberLatLng(uberlatlng.a(), uberlatlng.b());
    }

    public final Object apply(Object obj)
    {
        return a((UberLatLng)obj);
    }

    (gbv gbv1)
    {
        a = gbv1;
        super();
    }
}
