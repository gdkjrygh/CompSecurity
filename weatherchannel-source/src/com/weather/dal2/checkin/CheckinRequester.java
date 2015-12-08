// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.checkin;

import android.net.TrafficStats;
import android.util.Log;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.TwcPreconditions;
import com.weather.util.net.HttpRequest;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.checkin:
//            CheckinFactory, GetCheckinResponse, Checkin

public class CheckinRequester
{

    public static final int MAX_SUPPORTED_GEOHASH_LENGTH = 7;
    private static final String NEARBY_REQUEST = (new StringBuilder()).append(REQUEST_BASE).append("/g/%s/(%s)").toString();
    private static final String POST_URL = (new StringBuilder()).append(TwcDataServer.getSecureDsxUrl()).append("/p/wxcheckin").toString();
    private static final String REQUEST_BASE = (new StringBuilder()).append(TwcDataServer.getSecureDsxUrl()).append("/wxcheckin/cc").toString();
    private static final String TAG = "CheckinRequester";
    public static final int TIMEOUT = 15000;
    private final CheckinFactory checkinFactory;

    public CheckinRequester(CheckinFactory checkinfactory)
    {
        checkinFactory = (CheckinFactory)Preconditions.checkNotNull(checkinfactory);
    }

    private static boolean containsTooLongGeoHash(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (((String)iterable.next()).length() > 7)
            {
                return true;
            }
        }

        return false;
    }

    private static String escapeJsonString(String s)
    {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static String getGeoHash(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optString("id", "");
        int i = jsonobject.lastIndexOf('/');
        if (i < 0)
        {
            return jsonobject;
        } else
        {
            return jsonobject.substring(i + 1);
        }
    }

    private GetCheckinResponse parseCheckins(JSONArray jsonarray, int i)
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int l = jsonarray.length();
        int k = 0;
        int j = 0;
        while (j < l) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(j);
                builder.add(checkinFactory.create(jsonobject.getDouble("lat"), jsonobject.getDouble("lon"), Byte.parseByte(jsonobject.getString("userIconCode")), jsonobject.getString("checkinId")));
            }
            catch (JSONException jsonexception)
            {
                k++;
            }
            j++;
        }
        return GetCheckinResponse.forSuccess(i, k, builder.build());
    }

    private GetCheckinResponse parseResponse(JSONObject jsonobject)
    {
        int i = jsonobject.optInt("status", -1);
        if (i < 0)
        {
            return GetCheckinResponse.forCorruptRecord();
        }
        if (i >= 400)
        {
            return GetCheckinResponse.forHttpError(i);
        }
        jsonobject = jsonobject.optJSONObject("doc");
        if (jsonobject == null)
        {
            jsonobject = null;
        } else
        {
            jsonobject = jsonobject.optJSONArray("result");
        }
        if (jsonobject == null)
        {
            return GetCheckinResponse.forCorruptRecord(i);
        } else
        {
            return parseCheckins(jsonobject, i);
        }
    }

    private Map parseResponse(String s, Collection collection)
        throws JSONException
    {
        s = new JSONArray(s);
        int j = s.length();
        java.util.HashMap hashmap = Maps.newHashMap();
        for (int i = 0; i < j; i++)
        {
            JSONObject jsonobject = s.getJSONObject(i);
            String s1 = getGeoHash(jsonobject);
            if (collection.contains(s1))
            {
                hashmap.put(s1, parseResponse(jsonobject));
            }
        }

        return hashmap;
    }

    public Map getCheckinNear(Collection collection)
        throws com.weather.util.net.HttpRequest.HttpRequestException, DalException
    {
        Object obj;
        HttpRequest httprequest;
        String s;
        boolean flag;
        if (!containsTooLongGeoHash(collection))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Server only supports geohashes up to %d digits", new Object[] {
            Integer.valueOf(7)
        });
        obj = Joiner.on(';').join(TwcPreconditions.checkNotEmpty(collection));
        s = String.format(Locale.US, NEARBY_REQUEST, new Object[] {
            Locale.getDefault().toString(), obj
        });
        obj = null;
        TrafficStats.setThreadStatsTag(53249);
        httprequest = HttpRequest.get(s).useCaches(false).header("Cache-Control", "no-cache").header("Cookie", getDsxCookie()).acceptJson().acceptGzipEncoding().readTimeout(15000).connectTimeout(15000).uncompress(true);
        obj = httprequest;
        if (httprequest.success())
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = httprequest;
        throw new DalException((new StringBuilder()).append("Server request failed: url=\"").append(s).append("\", Error Code ").append(httprequest.code()).toString());
        obj = httprequest;
        Object obj1 = httprequest.body();
        obj = httprequest;
        obj1 = parseResponse(((String) (obj1)), collection);
        obj = httprequest;
        Iterator iterator = collection.iterator();
_L2:
        obj = httprequest;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = httprequest;
        String s1 = (String)iterator.next();
        obj = httprequest;
        if (((Map) (obj1)).containsKey(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = httprequest;
        ((Map) (obj1)).put(s1, GetCheckinResponse.forMissing());
        if (true) goto _L2; else goto _L1
_L4:
        throw new DalException("Invalid response received", collection);
_L1:
        obj = httprequest;
        if (((Map) (obj1)).keySet().containsAll(collection))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = httprequest;
        try
        {
            throw new DalException("Invalid response received: Not all requested geohashes returned results");
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            obj = httprequest;
        }
        finally
        {
            if (obj != null)
            {
                ((HttpRequest) (obj)).disconnect();
            }
            TrafficStats.clearThreadStatsTag();
            throw collection;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
        TrafficStats.clearThreadStatsTag();
        return ((Map) (obj1));
    }

    public String getDsxCookie()
    {
        String s1 = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_ACCOUNT_COOKIE, "");
        String s = s1;
        if (s1.isEmpty())
        {
            s = null;
        }
        return s;
    }

    public boolean postCheckin(Checkin checkin, SavedLocation savedlocation, String s, int i, double d, String s1)
    {
        double d1;
        double d2;
        byte byte0;
        String s2;
        String s3;
        String s4;
        String s5;
        s2 = savedlocation.getAddress();
        savedlocation = s2;
        if (s2 == null)
        {
            savedlocation = "";
        }
        d1 = checkin.getLatitude();
        d2 = checkin.getLongitude();
        byte0 = checkin.getUserIconCode();
        s3 = escapeJsonString(savedlocation);
        s4 = escapeJsonString(s);
        s5 = escapeJsonString(s1);
        s2 = null;
        s1 = null;
        TrafficStats.setThreadStatsTag(53249);
        s = s1;
        savedlocation = s2;
        s3 = String.format(Locale.US, "{\"lat\":%.8f,\"lon\":%.8f, \"userIconCode\":\"%d\", \"wxIconCode\":\"%d\", \"address\":\"%s\", \"temperature\":%f, \"conditionPhrase\":\"%s\", \"checkinId\":\"%s\"}", new Object[] {
            Double.valueOf(d1), Double.valueOf(d2), Byte.valueOf(byte0), Integer.valueOf(i), s3, Double.valueOf(d), s4, s5
        });
        s = s1;
        savedlocation = s2;
        s4 = getDsxCookie();
        s = s1;
        savedlocation = s2;
        s1 = HttpRequest.post(POST_URL).trustAllHosts().contentType("application/json", "UTF-8").header("Cookie", s4).send(s3);
        s = s1;
        savedlocation = s1;
        boolean flag = s1.success();
        s = s1;
        savedlocation = s1;
        checkin = (new StringBuilder()).append(" url=").append(POST_URL).append(", checkin=").append(checkin).append(", jsonRequestBody=").append(s3).append(", code=").append(s1.code()).append(", body=").append(s1.body()).toString();
        if (!flag) goto _L2; else goto _L1
_L1:
        s = s1;
        savedlocation = s1;
        Log.v("CheckinRequester", (new StringBuilder()).append("Checkin posted to server.").append(checkin).toString());
_L3:
        if (s1 != null)
        {
            try
            {
                s1.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Checkin checkin) { }
        }
        TrafficStats.clearThreadStatsTag();
        return flag;
_L2:
        s = s1;
        savedlocation = s1;
        EventLog.w("CheckinRequester", (new StringBuilder()).append("Checkin post to server failed.").append(checkin).toString());
          goto _L3
        checkin;
        savedlocation = s;
        EventLog.w("CheckinRequester", (new StringBuilder()).append("Checkin post to server failed with exception. e=").append(checkin.getClass().getSimpleName()).append(": ").append(checkin.getMessage()).toString());
        if (s != null)
        {
            try
            {
                s.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Checkin checkin) { }
        }
        TrafficStats.clearThreadStatsTag();
        return false;
        checkin;
        if (savedlocation != null)
        {
            try
            {
                savedlocation.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (SavedLocation savedlocation) { }
        }
        TrafficStats.clearThreadStatsTag();
        throw checkin;
    }

}
