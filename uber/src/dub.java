// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;

public final class dub
{

    public static UberLatLng a(float f, UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        return new UberLatLng((uberlatlng1.a() - uberlatlng.a()) * (double)f + uberlatlng.a(), (uberlatlng1.b() - uberlatlng.b()) * (double)f + uberlatlng.b());
    }
}
