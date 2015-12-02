// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;

final class ang.Object
    implements gjv
{

    final gao a;

    private static UberLatLng a(UberLatLng uberlatlng)
    {
        return new UberLatLng(uberlatlng.a(), uberlatlng.b());
    }

    public final Object apply(Object obj)
    {
        return a((UberLatLng)obj);
    }

    (gao gao1)
    {
        a = gao1;
        super();
    }
}
