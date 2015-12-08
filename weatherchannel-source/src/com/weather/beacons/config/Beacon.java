// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.config;

import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.beacons.config:
//            BeaconParameters

public class Beacon
{

    private static final String BEACON_KEY = "beacon";
    private static final String TAG = "Beacon";
    private final String beaconName;
    private final BeaconParameters beaconParameters;

    public Beacon(JSONObject jsonobject)
        throws JSONException
    {
        beaconName = jsonobject.getString("beacon");
        beaconParameters = new BeaconParameters(jsonobject);
    }

    public String getBeaconName()
    {
        return beaconName;
    }

    public Set getDynamicParameters()
    {
        return beaconParameters.getDynamicParameters();
    }

    public Map getStaticParameters()
    {
        return beaconParameters.getStaticParameters();
    }
}
