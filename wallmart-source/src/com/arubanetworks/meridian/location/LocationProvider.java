// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;


// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocation, ClientLocationData

public abstract class LocationProvider
{
    static interface a
    {

        public abstract void onLocationUpdate(LocationProvider locationprovider, MeridianLocation meridianlocation);
    }


    private MeridianLocation a;
    protected ClientLocationData clientLocationData;
    protected a listener;

    public LocationProvider(ClientLocationData clientlocationdata, a a1)
    {
        clientLocationData = clientlocationdata;
        listener = a1;
    }

    protected void bluetoothStateChanged(int i)
    {
    }

    public MeridianLocation getLocation()
    {
        return a;
    }

    protected float getPriority()
    {
        return 0.0F;
    }

    public abstract ProviderType getType();

    protected void shutdown()
    {
    }

    protected void updateWithLocation(MeridianLocation meridianlocation)
    {
        if (meridianlocation != null)
        {
            meridianlocation.setProvider(this);
            a = meridianlocation;
            if (listener != null)
            {
                listener.onLocationUpdate(this, a);
            }
        }
    }

    protected void wifiStateChanged(int i)
    {
    }

    // Unreferenced inner class com/arubanetworks/meridian/location/LocationProvider$ProviderType
    /* block-local class not found */
    class ProviderType {}

}
