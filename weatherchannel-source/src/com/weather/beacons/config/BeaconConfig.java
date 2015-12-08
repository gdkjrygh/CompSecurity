// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.config;

import com.weather.util.config.ConfigException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.beacons.config:
//            BeaconParameters, Beacon

public final class BeaconConfig
{

    private static final String KEY_BEACONS = "beacons";
    private static final String KEY_COMMON_PARAMETERS = "commonParameters";
    private static final String VERSION = "version";
    private final Map beacons;
    private final BeaconParameters commonParameters;
    private final String version;

    public BeaconConfig(String s)
        throws JSONException, ConfigException
    {
        s = new JSONObject(s);
        beacons = extractBeacons(s);
        version = s.getString("version");
        commonParameters = new BeaconParameters(s.getJSONObject("commonParameters"));
    }

    private Map extractBeacons(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray("beacons");
        HashMap hashmap = new HashMap(jsonobject.length());
        int j = jsonobject.length();
        for (int i = 0; i < j; i++)
        {
            Beacon beacon = new Beacon(jsonobject.getJSONObject(i));
            hashmap.put(beacon.getBeaconName(), beacon);
        }

        return hashmap;
    }

    public Beacon getBeacon(String s)
    {
        return (Beacon)beacons.get(s);
    }

    public Set getDynamicParameters(Beacon beacon)
    {
        HashSet hashset = new HashSet(beacon.getDynamicParameters().size() + commonParameters.getDynamicParameters().size());
        hashset.addAll(beacon.getDynamicParameters());
        hashset.addAll(commonParameters.getDynamicParameters());
        return hashset;
    }

    public Map getStaticParameters(Beacon beacon)
    {
        HashMap hashmap = new HashMap(beacon.getStaticParameters().size() + commonParameters.getStaticParameters().size());
        hashmap.putAll(beacon.getStaticParameters());
        hashmap.putAll(commonParameters.getStaticParameters());
        return hashmap;
    }

    public String getVersion()
    {
        return version;
    }
}
