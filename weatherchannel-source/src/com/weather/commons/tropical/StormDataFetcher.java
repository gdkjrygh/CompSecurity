// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.TwcDataServer;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.parsing.ValidationException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.tropical:
//            Storms, StormData, ActiveStorms

public class StormDataFetcher
{
    private static class StormCacheLoader extends CacheLoader
    {

        private final ConfigurationManagers configurationManagers;

        private StormData extractData(JSONArray jsonarray, String s)
            throws JSONException, ValidationException
        {
            Object obj = null;
            JSONObject jsonobject = getRecord(jsonarray, (new StringBuilder()).append("/wxd/v2/HPRecord/").append(s).toString());
            jsonarray = getRecord(jsonarray, (new StringBuilder()).append("/wxd/v2/HTRecord/").append(s).toString());
            if (jsonarray == null)
            {
                return null;
            }
            s = jsonarray.getJSONArray("doc");
            if (jsonobject == null)
            {
                jsonarray = obj;
            } else
            {
                jsonarray = jsonobject.getJSONObject("doc");
            }
            return StormData.fromJson(s, jsonarray);
        }

        private JSONObject getRecord(JSONArray jsonarray, String s)
            throws JSONException
        {
            int i = 0;
            for (int j = jsonarray.length(); i < j; i++)
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                if (s.equals(jsonobject.optString("id")))
                {
                    i = jsonobject.getInt("status");
                    if (i == 200)
                    {
                        return jsonobject;
                    } else
                    {
                        EventLog.w("StormDataFetcher", (new StringBuilder()).append("Record ").append(s).append(" had status ").append(i).toString());
                        return null;
                    }
                }
            }

            return null;
        }

        public Storms load(Object obj)
            throws Exception
        {
            obj = configurationManagers.getFlagshipConfig();
            Object obj1 = (new MetricsHttpGetRequest(new SimpleHttpGetRequest("StormDataFetcher"), com.weather.util.metric.Metric.MetricTag.TIMER_STORMS_LIST_DATA_REQUEST)).fetch((new StringBuilder()).append(((FlagshipConfig) (obj)).tropicalStormDataUrl).append('/').append(StormDataFetcher.STORMS_PATH).toString(), true);
            if (((String) (obj1)).isEmpty())
            {
                return new Storms(ImmutableList.of());
            }
            Object obj2 = ImmutableSet.copyOf(ActiveStorms.fromJson(new JSONObject(((String) (obj1)))).getStormIds());
            obj1 = Joiner.on(";").join(((Iterable) (obj2)));
            if (((String) (obj1)).isEmpty())
            {
                return new Storms(ImmutableList.of());
            }
            obj = new JSONArray((new MetricsHttpGetRequest(new SimpleHttpGetRequest("StormDataFetcher"), com.weather.util.metric.Metric.MetricTag.TIMER_STORM_DETAILS_DATA_REQUEST)).fetch((new StringBuilder()).append(((FlagshipConfig) (obj)).tropicalStormDataUrl).append('/').append(String.format(Locale.US, StormDataFetcher.STORM_DETAILS_PATH, new Object[] {
                obj1
            })).toString(), true));
            obj1 = ImmutableList.builder();
            obj2 = ((ImmutableSet) (obj2)).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj2)).next();
                StormData stormdata = extractData(((JSONArray) (obj)), s);
                if (stormdata != null)
                {
                    if (!s.equals(stormdata.getStormId()))
                    {
                        throw new ValidationException((new StringBuilder()).append("The HTHdr for a storm ").append(s).append(" had the wrong storm id ").append(stormdata.getStormId()).toString());
                    }
                    ((com.google.common.collect.ImmutableList.Builder) (obj1)).add(stormdata);
                }
            } while (true);
            return new Storms(((com.google.common.collect.ImmutableList.Builder) (obj1)).build());
        }

        public volatile Object load(Object obj)
            throws Exception
        {
            return load(obj);
        }

        StormCacheLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }
    }


    private static final Object KEY = new Object();
    private static final String STORMS_PATH = (new StringBuilder()).append("wxd/v2/ActiveTrops?api=").append(TwcDataServer.getApiKey()).toString();
    private static final String STORM_DETAILS_PATH = (new StringBuilder()).append("wxd/v2/(HPRecord;HTRecord)/(%s)?api=").append(TwcDataServer.getApiKey()).toString();
    private static final String TAG = "StormDataFetcher";
    private final ConfigurationManagers configurationManagers;
    private final MemCache stormCache;

    public StormDataFetcher(ConfigurationManagers configurationmanagers)
    {
        this(configurationmanagers, Ticker.systemTicker());
    }

    StormDataFetcher(ConfigurationManagers configurationmanagers, Ticker ticker)
    {
        stormCache = new MemCache(new StormCacheLoader(configurationmanagers), 1, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy), ticker);
        configurationManagers = configurationmanagers;
    }

    public void refresh(boolean flag, Receiver receiver, Object obj)
    {
        try
        {
            if (configurationManagers.getFlagshipConfig().hurricaneCentralEnabled)
            {
                stormCache.asyncFetch(KEY, flag, receiver, obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Receiver receiver)
        {
            throw new IllegalStateException("Unable to get flaghship configuration", receiver);
        }
        receiver.onCompletion(new Storms(ImmutableList.of()), obj);
        return;
    }



}
