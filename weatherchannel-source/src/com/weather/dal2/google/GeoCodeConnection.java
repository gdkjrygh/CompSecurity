// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.google;

import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.Receiver;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.google:
//            GoogleApiConnection, AddressList

public final class GeoCodeConnection extends GoogleApiConnection
{

    public GeoCodeConnection()
    {
    }

    public void asyncFetch(String s, Receiver receiver, Object obj)
    {
        asyncFetch("address", s, receiver, obj);
    }

    public AddressList fetch(String s)
        throws IOException, DalException, JSONException
    {
        return fetch("address", s);
    }
}
