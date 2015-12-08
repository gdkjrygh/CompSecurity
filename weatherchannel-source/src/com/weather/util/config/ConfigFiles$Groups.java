// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.config:
//            ConfigFiles

public static class Of
{

    public final Map groupsByLocal;

    public (JSONObject jsonobject)
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
