// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.maps.MapInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.location:
//            Beacon

public class ClientLocationData
{

    private String a;
    private String b;
    private EditorKey c;
    private Map d;
    private List e;
    private List f;
    private List g;
    private Map h;
    private List i;
    private String j;
    private String k;
    private String l;
    private String m;

    public ClientLocationData()
    {
    }

    public static ClientLocationData fromJSONObject(JSONObject jsonobject, EditorKey editorkey)
        throws JSONException
    {
        boolean flag = false;
        ClientLocationData clientlocationdata = new ClientLocationData();
        clientlocationdata.setAppKey(editorkey);
        if (jsonobject.has("location_beacon_uuid"))
        {
            clientlocationdata.setLocationBeaconUUID(jsonobject.getString("location_beacon_uuid"));
        }
        Object obj = jsonobject.optString("proximity_beacon_uuid");
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            clientlocationdata.setProximityBeaconUUID(((String) (obj)));
        }
        ArrayList arraylist = new ArrayList();
        if (jsonobject.has("beacons"))
        {
            JSONArray jsonarray2 = jsonobject.getJSONArray("beacons");
            for (int i1 = 0; i1 < jsonarray2.length(); i1++)
            {
                arraylist.add(Beacon.fromJSON(((String) (obj)), editorkey.getId(), jsonarray2.getJSONObject(i1)));
            }

        }
        clientlocationdata.setBeacons(arraylist);
        obj = new HashMap();
        if (jsonobject.has("beacons"))
        {
            Object obj1 = new ArrayList();
            JSONArray jsonarray3 = jsonobject.getJSONArray("beacons");
            for (int j1 = 0; j1 < jsonarray3.length(); j1++)
            {
                ((List) (obj1)).add(Placemark.fromClientLocationDataJSON(jsonarray3.getJSONObject(j1), editorkey));
            }

            Placemark placemark;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Map) (obj)).put(placemark.majorMinorString(), placemark))
            {
                placemark = (Placemark)((Iterator) (obj1)).next();
            }

        }
        clientlocationdata.setBeaconPlacemarks(((Map) (obj)));
        clientlocationdata.setProximityBeacons(new ArrayList());
        obj = new ArrayList();
        if (jsonobject.has("outdoor_areas"))
        {
            JSONArray jsonarray = jsonobject.getJSONArray("outdoor_areas");
            for (int k1 = 0; k1 < jsonarray.length(); k1++)
            {
                ((List) (obj)).add(Placemark.fromClientLocationDataJSON(jsonarray.getJSONObject(k1), editorkey));
            }

        }
        clientlocationdata.setOutdoorAreas(((List) (obj)));
        obj = new HashMap();
        if (jsonobject.has("outdoor_maps"))
        {
            Object obj2 = new ArrayList();
            JSONArray jsonarray4 = jsonobject.getJSONArray("outdoor_maps");
            for (int l1 = 0; l1 < jsonarray4.length(); l1++)
            {
                ((List) (obj2)).add(MapInfo.fromClientLocationDataJSON(jsonarray4.getJSONObject(l1), editorkey));
            }

            MapInfo mapinfo;
            for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((Map) (obj)).put(mapinfo.key, mapinfo))
            {
                mapinfo = (MapInfo)((Iterator) (obj2)).next();
            }

        }
        clientlocationdata.setOutdoorAreaMaps(((Map) (obj)));
        obj = new ArrayList();
        if (jsonobject.has("exclusion_areas"))
        {
            JSONArray jsonarray1 = jsonobject.getJSONArray("exclusion_areas");
            for (int i2 = ((flag) ? 1 : 0); i2 < jsonarray1.length(); i2++)
            {
                ((List) (obj)).add(Placemark.fromClientLocationDataJSON(jsonarray1.getJSONObject(i2), editorkey));
            }

        }
        clientlocationdata.setExclusionAreas(((List) (obj)));
        if (jsonobject.has("rtls_id"))
        {
            clientlocationdata.j = jsonobject.optString("rtls_id");
            clientlocationdata.k = jsonobject.optString("rtls_location_server");
            if (clientlocationdata.k != null)
            {
                clientlocationdata.k = (new StringBuilder()).append(clientlocationdata.k).append("/current").toString();
            }
            clientlocationdata.l = jsonobject.optString("rtls_campus_id");
            clientlocationdata.m = jsonobject.optString("rtls_ssid");
        }
        return clientlocationdata;
    }

    public EditorKey getAppKey()
    {
        return c;
    }

    public Map getBeaconPlacemarks()
    {
        return d;
    }

    public List getBeacons()
    {
        return e;
    }

    public List getExclusionAreas()
    {
        return i;
    }

    public String getLocationBeaconUUID()
    {
        return a;
    }

    public String getLocationsServer()
    {
        return k;
    }

    public Map getOutdoorAreaMaps()
    {
        return h;
    }

    public List getOutdoorAreas()
    {
        return g;
    }

    public String getProximityBeaconUUID()
    {
        return b;
    }

    public List getProximityBeacons()
    {
        return f;
    }

    public String getRTLSID()
    {
        return j;
    }

    public void setAppKey(EditorKey editorkey)
    {
        c = editorkey;
    }

    public void setBeaconPlacemarks(Map map)
    {
        d = map;
    }

    public void setBeacons(List list)
    {
        e = list;
    }

    public void setExclusionAreas(List list)
    {
        i = list;
    }

    public void setLocationBeaconUUID(String s)
    {
        a = s;
    }

    public void setOutdoorAreaMaps(Map map)
    {
        h = map;
    }

    public void setOutdoorAreas(List list)
    {
        g = list;
    }

    public void setProximityBeaconUUID(String s)
    {
        b = s;
    }

    public void setProximityBeacons(List list)
    {
        f = list;
    }
}
