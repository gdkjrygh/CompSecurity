// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;
import com.ubercab.rider.realtime.model.GeoJsonFeature;

public final class fwd
{

    public fwd()
    {
    }

    public static double a(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        gjz.a(uberlatlng);
        gjz.a(uberlatlng1);
        return UberLatLng.a(uberlatlng, uberlatlng1);
    }

    public static int a(Context context)
    {
        gjz.a(context);
        return cwt.j(context).x;
    }

    public static UberLatLng a(cjn cjn1)
    {
        gjz.a(cjn1);
        if (cjn1.b() != null)
        {
            return cjn1.b().a().c();
        } else
        {
            return null;
        }
    }

    public static UberLatLng a(com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation pickuplocation)
    {
        return ecx.a((GeoJsonFeature)gjz.a(pickuplocation));
    }

    public static UberLatLng b(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        gjz.a(uberlatlng);
        gjz.a(uberlatlng1);
        return new UberLatLng(uberlatlng.a(), uberlatlng1.b(), uberlatlng.c());
    }
}
