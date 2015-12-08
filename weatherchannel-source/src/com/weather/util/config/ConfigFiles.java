// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import android.net.Uri;
import android.util.Log;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.config:
//            ConfigFileSettings, ConfigException, ConfigParser

public class ConfigFiles
{
    public static class Groups
    {

        public final Map groupsByLocal;

        public Groups(JSONObject jsonobject)
            throws JSONException
        {
            HashMap hashmap = new HashMap();
            for (int i = 0; i < jsonobject.names().length(); i++)
            {
                String s = jsonobject.names().getString(i);
                JSONObject jsonobject1 = jsonobject.getJSONObject(s);
                HashMap hashmap1 = new HashMap();
                for (int j = 0; j < jsonobject1.names().length(); j++)
                {
                    String s1 = jsonobject1.names().getString(j);
                    JSONObject jsonobject2 = jsonobject1.getJSONObject(s1);
                    hashmap1.put(s1, Range.closed(Integer.valueOf(jsonobject2.getInt("start")), Integer.valueOf(jsonobject2.getInt("end"))));
                }

                hashmap.put(s, ImmutableMap.copyOf(hashmap1));
            }

            groupsByLocal = ImmutableMap.copyOf(hashmap);
        }
    }


    public static final ConfigParser PARSER = new ConfigParser() {

        public ConfigFiles parse(String s)
            throws ConfigException
        {
            return ConfigFiles.parse(s);
        }

        public volatile Object parse(String s)
            throws ConfigException
        {
            return parse(s);
        }

    };
    private static final String TAG = "ConfigFiles";
    private final Map settingsMap;

    public ConfigFiles(String s)
        throws JSONException
    {
        com.google.common.collect.ImmutableMap.Builder builder;
        JSONArray jsonarray;
        JSONObject jsonobject;
        String s1;
        int i;
        int j;
        try
        {
            builder = ImmutableMap.builder();
            jsonarray = (new JSONObject(s)).getJSONArray("configs");
            j = jsonarray.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException((new StringBuilder()).append("Config file remote resource URL is invalid: ").append(s.getMessage()).toString());
        }
        i = 0;
        if (i >= j) goto _L2; else goto _L1
_L1:
        jsonobject = jsonarray.getJSONObject(i);
        s1 = jsonobject.getString("name");
        if (!jsonobject.has("refreshRate"))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        s = Integer.valueOf(jsonobject.getInt("refreshRate"));
_L3:
        builder.put(s1, new ConfigFileSettings(new URL(getFinalUrl(jsonobject, jsonobject.getString("url"), getRandomIntOnDevice())), s, jsonobject.optBoolean("updateImmediately", true)));
        i++;
        break MISSING_BLOCK_LABEL_31;
_L2:
        settingsMap = builder.build();
        return;
        s = null;
          goto _L3
    }

    public static String getFinalUrl(Set set, Groups groups, String s, int i)
    {
        if (groups != null) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String s1;
        Object obj;
        String s2;
        Set set1;
        s2 = getPreviousToLastPathSegment(s);
        obj = null;
        set1 = groups.groupsByLocal.keySet();
        if (!set1.contains(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = getGroupName((Map)groups.groupsByLocal.get(s2), i);
_L4:
        if (s1 != null)
        {
            set = getLastPathSegment(s);
            if (set != null)
            {
                return s.replace(set, (new StringBuilder()).append(s1).append('/').append(set).toString());
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1 = obj;
        if (set1.contains("default"))
        {
            s1 = obj;
            if (set != null)
            {
                s1 = obj;
                if (!set.contains(s2))
                {
                    s1 = getGroupName((Map)groups.groupsByLocal.get("default"), i);
                }
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static String getFinalUrl(JSONObject jsonobject, String s, int i)
    {
        Set set = getLocales(jsonobject.optJSONArray("locales"));
        jsonobject = getFinalUrl(set, getGroups(jsonobject.optJSONObject("groups")), getLocalizedUrl(set, s), i);
        LogUtil.d("ConfigFiles", LoggingMetaTags.TWC_GENERAL, "finalUrl url=%s", new Object[] {
            jsonobject
        });
        return jsonobject;
    }

    protected static String getGroupName(Map map, int i)
    {
        Object obj = null;
        Iterator iterator = map.entrySet().iterator();
        do
        {
            map = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            map = (java.util.Map.Entry)iterator.next();
            if (!((Range)map.getValue()).contains(Integer.valueOf(i)))
            {
                continue;
            }
            map = (String)map.getKey();
            break;
        } while (true);
        return map;
    }

    public static Groups getGroups(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        try
        {
            jsonobject = new Groups(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private static String getLastPathSegment(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    public static Set getLocales(JSONArray jsonarray)
    {
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        if (jsonarray != null)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                try
                {
                    builder.add(jsonarray.getString(i).toLowerCase(Locale.US));
                }
                catch (JSONException jsonexception)
                {
                    Log.e("ConfigFiles", jsonexception.toString(), jsonexception);
                }
                i++;
            }
        }
        return builder.build();
    }

    public static String getLocalizedUrl(Set set, String s)
    {
        Object obj;
        String s1;
        String s2;
        s2 = getLastPathSegment(s);
        s1 = s;
        obj = s1;
        if (s2 == null) goto _L2; else goto _L1
_L1:
        String s3;
        obj = Locale.getDefault();
        s3 = ((Locale) (obj)).toString().toLowerCase(Locale.US);
        if (!set.contains(s3)) goto _L4; else goto _L3
_L3:
        obj = s.replace(s2, (new StringBuilder()).append(s3).append('/').append(s2).toString());
_L2:
        LogUtil.d("ConfigFiles", LoggingMetaTags.TWC_GENERAL, "localized url=%s", new Object[] {
            obj
        });
        return ((String) (obj));
_L4:
        String s4 = ((Locale) (obj)).getLanguage().toLowerCase(Locale.US);
        obj = s1;
        if (set.contains(s4))
        {
            obj = s.replace(s2, (new StringBuilder()).append(s4).append('/').append(s2).toString());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected static String getPreviousToLastPathSegment(String s)
    {
        s = Uri.parse(s).getPathSegments();
        if (s.size() > 1)
        {
            return (String)s.get(s.size() - 2);
        } else
        {
            return null;
        }
    }

    private int getRandomIntOnDevice()
    {
        int j = TwcPrefs.getInstance().getInt(com.weather.util.prefs.TwcPrefs.Keys.RANDOM_INT, -1);
        int i = j;
        if (j == -1)
        {
            i = (new Random()).nextInt(100);
            TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.RANDOM_INT, i);
        }
        return i;
    }

    public static ConfigFiles parse(String s)
        throws ConfigException
    {
        try
        {
            s = new ConfigFiles(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ConfigException("Unable to parse input", s);
        }
        return s;
    }

    public ConfigFileSettings getSettingsFor(String s)
    {
        ConfigFileSettings configfilesettings1 = (ConfigFileSettings)settingsMap.get(s);
        ConfigFileSettings configfilesettings = configfilesettings1;
        if (configfilesettings1 == null)
        {
            Log.w("ConfigFiles", (new StringBuilder()).append("Could not find configuration settings for ").append(s).toString());
            configfilesettings = new ConfigFileSettings(null, null, false);
        }
        return configfilesettings;
    }

}
