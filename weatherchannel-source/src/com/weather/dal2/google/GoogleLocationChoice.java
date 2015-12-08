// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.google;

import com.weather.dal2.locations.Fetcher;
import com.weather.dal2.locations.LocationConnection;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.dal2.google:
//            AddressList

public class GoogleLocationChoice
    implements Fetcher
{

    private final double dlat;
    private final double dlong;
    private final String name;

    public GoogleLocationChoice(AddressList addresslist, int i)
    {
        name = addresslist.getFormattedAddress(i);
        dlat = addresslist.getLat(i).doubleValue();
        dlong = addresslist.getLong(i).doubleValue();
    }

    public void fetch(Receiver receiver, Object obj)
    {
        LocationConnection.getInstance().asyncFetch(dlat, dlong, receiver, obj, false);
    }

    public String toString()
    {
        return name;
    }
}
