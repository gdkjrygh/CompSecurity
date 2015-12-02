// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.DynamicPickupsResponse;

public final class evl
{

    public final UberLatLng a;
    public final DynamicPickupsResponse b;
    public final int c;

    public evl(UberLatLng uberlatlng, int i, DynamicPickupsResponse dynamicpickupsresponse)
    {
        c = i;
        a = (UberLatLng)gjz.a(uberlatlng);
        b = (DynamicPickupsResponse)gjz.a(dynamicpickupsresponse);
    }
}
