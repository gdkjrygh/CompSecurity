// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.config.ConfigException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.ads2.config:
//            GptUrl, AdUnitPrefix, AdSlot, AdSlotNotFoundException

public final class AdConfig
{

    static final int DEFAULT_AD_INTERVAL = 2;
    static final int DEFAULT_AD_START_POSITION = 1;
    private static final String KEY_AD_INTERVAL = "adRepeats";
    private static final String KEY_AD_START_POSITION = "adStartingPosition";
    private static final String KEY_COMMON_PARAMETERS = "commonParameters";
    private static final String KEY_PREFIX = "adUnitPrefixes";
    private static final String KEY_SCATTER_SHOT_ENABLE = "scatterShotEnabled";
    private static final String KEY_SLOT = "adSlots";
    private static final String KEY_URL = "gpt_url";
    private static final String KEY_WEATHER_FX_URL = "wfxUrl";
    private static final String TAG = "AdConfig";
    private final Map commonParameters;
    private final int interval;
    private final List prefixes;
    private final boolean scatterShotsEnabled;
    private final List slots;
    private final int startPosition;
    private final GptUrl url;
    private final String weatherFxUrl;

    public AdConfig(String s)
        throws JSONException, ConfigException
    {
        s = new JSONObject(s);
        scatterShotsEnabled = s.optBoolean("scatterShotEnabled");
        prefixes = extractPrefixes(s);
        slots = extractSlots(s);
        url = new GptUrl(s.getJSONObject("gpt_url"));
        commonParameters = extractCommonParameters(s);
        startPosition = extractStartPosition(s);
        interval = extractAdInterval(s);
        if (startPosition <= 0 || interval <= 0)
        {
            throw new ConfigException("Ad start position and interval position must greater than zero.");
        } else
        {
            weatherFxUrl = s.getString("wfxUrl");
            return;
        }
    }

    private static int extractAdInterval(JSONObject jsonobject)
    {
        return jsonobject.optInt("adRepeats", 2);
    }

    private static Map extractCommonParameters(JSONObject jsonobject)
        throws JSONException
    {
        if (!jsonobject.has("commonParameters"))
        {
            return ImmutableMap.of();
        }
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        jsonobject = jsonobject.getJSONObject("commonParameters");
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); builder.put(s, jsonobject.getString(s).replace('$', '%')))
        {
            s = (String)iterator.next();
        }

        return builder.build();
    }

    private static List extractPrefixes(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray("adUnitPrefixes");
        ArrayList arraylist = new ArrayList(jsonobject.length());
        boolean flag = false;
        int j = jsonobject.length();
        int i = 0;
        while (i < j) 
        {
            AdUnitPrefix adunitprefix = new AdUnitPrefix(jsonobject.getJSONObject(i));
            arraylist.add(adunitprefix);
            if (flag || adunitprefix.isInternational())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i++;
        }
        if (!flag)
        {
            throw new JSONException("Prefix Array is missing an international prefix");
        } else
        {
            return Ordering.natural().immutableSortedCopy(arraylist);
        }
    }

    private static List extractSlots(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray("adSlots");
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < jsonobject.length(); i++)
        {
            builder.add(new AdSlot(jsonobject.getJSONObject(i)));
        }

        return builder.build();
    }

    private static int extractStartPosition(JSONObject jsonobject)
    {
        return jsonobject.optInt("adStartingPosition", 1);
    }

    private static int getFeedPosition(AdSlot adslot, String s)
    {
        adslot = adslot.getSlotName();
        return Integer.parseInt(adslot.substring(adslot.indexOf(s) + s.length()));
    }

    private static boolean isValidFeedSlot(AdSlot adslot, String s)
    {
        if (!adslot.isMatched(s))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        getFeedPosition(adslot, s);
        return true;
        s;
        EventLog.w("AdConfig", (new StringBuilder()).append("Config contains a feed ad without a proper position:  ").append(adslot.getSlotName()).toString());
        return false;
    }

    public int getAdModuleInterval()
    {
        return interval;
    }

    public int getAdStartPosition()
    {
        return startPosition;
    }

    public AdUnitPrefix getAdUnitPrefixForCurrentLocale()
    {
        for (Iterator iterator = prefixes.iterator(); iterator.hasNext();)
        {
            AdUnitPrefix adunitprefix = (AdUnitPrefix)iterator.next();
            if (adunitprefix.isForCurrentLocale())
            {
                return adunitprefix;
            }
        }

        throw new IllegalStateException("Invalid configuration: unable to find a prefix for current locale");
    }

    public AdSlot getAdUnitSlot(String s)
        throws AdSlotNotFoundException
    {
        for (Iterator iterator = slots.iterator(); iterator.hasNext();)
        {
            AdSlot adslot = (AdSlot)iterator.next();
            if (adslot.isMatched(s))
            {
                return adslot;
            }
        }

        throw new AdSlotNotFoundException((new StringBuilder()).append(s).append(" not found in Ad Slot").toString());
    }

    public String getAdUrl()
    {
        return url.adUrl;
    }

    public List getFeedAdSlots(final String slotPrefix)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = slots.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AdSlot adslot = (AdSlot)iterator.next();
            if (isValidFeedSlot(adslot, slotPrefix))
            {
                arraylist.add(adslot);
            }
        } while (true);
        Collections.sort(arraylist, new Comparator() {

            final AdConfig this$0;
            final String val$slotPrefix;

            public int compare(AdSlot adslot1, AdSlot adslot2)
            {
                int i = AdConfig.getFeedPosition(adslot1, slotPrefix);
                int j = AdConfig.getFeedPosition(adslot2, slotPrefix);
                if (i < j)
                {
                    return -1;
                }
                return i != j ? 1 : 0;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((AdSlot)obj, (AdSlot)obj1);
            }

            
            {
                this$0 = AdConfig.this;
                slotPrefix = s;
                super();
            }
        });
        return arraylist;
    }

    public String getImaVideoAdUrl()
    {
        return url.imaVideoAdUrl;
    }

    public String getSubstitutionToken(String s)
    {
        return (String)commonParameters.get(s);
    }

    public String getUmUri()
    {
        return url.umUri;
    }

    public String getWeatherFxUrl()
    {
        return weatherFxUrl;
    }

    public boolean isScatterShotsEnabled()
    {
        return scatterShotsEnabled;
    }

}
