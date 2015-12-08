// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;


// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService, MeridianLocation

public static interface Y
{

    public abstract void onLocationError(Throwable throwable);

    public abstract void onLocationUpdate(MeridianLocation meridianlocation);

    public abstract void onRequestBluetooth();

    public abstract void onRequestGPS();

    public abstract void onRequestWiFi();
}
