// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecordEnum, TwcJsonAnonAttribute

public final class RecordsJsonMapper
{

    private static final JsonParser JParser = new JsonParser();
    private static final String TAG = "RecordsJsonMapper";
    private static final Gson defaultMapper = (new GsonBuilder()).create();

    private RecordsJsonMapper()
    {
    }

    public static Object fromJson(String s, Class class1)
        throws ReflectiveOperationException, JSONException
    {
        Object obj = JParser.parse(s);
        if (((JsonElement) (obj)).isJsonArray())
        {
            obj = ((JsonElement) (obj)).getAsJsonArray();
            Map map = getElementMap(class1.getFields());
            class1 = ((Class) (class1.getConstructor(new Class[0]).newInstance(new Object[0])));
            s = class1;
            if (map != null)
            {
                int i = 0;
                int j = ((JsonArray) (obj)).size();
                do
                {
                    s = class1;
                    if (i >= j)
                    {
                        break;
                    }
                    s = ((JsonArray) (obj)).get(i).getAsJsonObject().get("id");
                    if (s != null)
                    {
                        Object obj1 = s.getAsString();
                        s = DsxRecordEnum.find(((String) (obj1)));
                        if (s != null)
                        {
                            LogUtil.d("RecordsJsonMapper", LoggingMetaTags.TWC_DAL, "class=%s", new Object[] {
                                s
                            });
                            obj1 = defaultMapper.fromJson(((JsonArray) (obj)).get(i), s);
                            s = s.getName();
                            if (map.containsKey(s))
                            {
                                ((Field)map.get(s)).set(class1, obj1);
                            }
                        } else
                        {
                            EventLog.e("RecordsJsonMapper", (new StringBuilder()).append("Could not find record id ").append(((String) (obj1))).append(" Element: ").append(i).append("  Records queried: ").append(DsxRecordEnum.RECORD_URL_VALUES).toString());
                        }
                    } else
                    {
                        EventLog.e("RecordsJsonMapper", (new StringBuilder()).append("Error retrieving record id. Element: ").append(i).append("  Records queried: ").append(DsxRecordEnum.RECORD_URL_VALUES).append(" Number of ").append("records retrieve: ").append(j).toString());
                    }
                    i++;
                } while (true);
            }
        } else
        {
            s = ((String) (JsonObjectMapper.fromJson(s, class1)));
        }
        return s;
    }

    private static Map getElementMap(Field afield[])
    {
        HashMap hashmap = new HashMap();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field = afield[i];
            if (field.isAnnotationPresent(com/weather/dal2/dsx/TwcJsonAnonAttribute))
            {
                hashmap.put(field.getType().getName(), field);
            }
        }

        afield = hashmap;
        if (hashmap.isEmpty())
        {
            afield = null;
        }
        return afield;
    }

}
