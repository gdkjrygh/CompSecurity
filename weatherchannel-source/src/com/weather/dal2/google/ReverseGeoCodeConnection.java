// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.google;

import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.locations.LocationUtils;
import com.weather.dal2.net.Receiver;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.google:
//            GoogleApiConnection, AddressList

public class ReverseGeoCodeConnection extends GoogleApiConnection
{

    public ReverseGeoCodeConnection()
    {
    }

    public void asyncFetch(double d, double d1, Receiver receiver, Object obj)
    {
        asyncFetch("latlng", LocationUtils.formatLatLong(d, d1, 7), receiver, obj);
    }

    public AddressList fetch(double d, double d1)
        throws IOException, DalException, JSONException
    {
        return fetch("latlng", LocationUtils.formatLatLong(d, d1, 7));
    }
}
