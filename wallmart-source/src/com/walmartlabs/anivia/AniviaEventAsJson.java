// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.walmartlabs.anivia:
//            Json

public class AniviaEventAsJson
{
    public static class Builder
    {

        private final HashMap mMap;

        AniviaEventAsJson build()
        {
            return new AniviaEventAsJson(new JSONObject(mMap));
        }

        public boolean containsAttributeWithValue(String s, Object obj)
        {
            return mMap.containsKey(s) && mMap.get(s).equals(obj);
        }

        public HashMap getObjectMapCopy()
        {
            return new HashMap(mMap);
        }

        public boolean isEvent(String s)
        {
            return mMap.get("event").equals(s);
        }

        public Builder putBoolean(String s, boolean flag)
        {
            mMap.put(s, Boolean.valueOf(flag));
            return this;
        }

        public Builder putInt(String s, int i)
        {
            mMap.put(s, Integer.valueOf(i));
            return this;
        }

        public Builder putLong(String s, long l)
        {
            mMap.put(s, Long.valueOf(l));
            return this;
        }

        public Builder putObject(String s, Object obj)
        {
            mMap.put(s, Json.wrap(obj));
            return this;
        }

        public Builder putString(String s, String s1)
        {
            mMap.put(s, s1);
            return this;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            java.util.Map.Entry entry;
            for (Iterator iterator = mMap.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getKey()).append(": ").append(entry.getValue().toString()))
            {
                entry = (java.util.Map.Entry)iterator.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.toString();
        }

        Builder()
        {
            mMap = new HashMap();
        }

        public Builder(String s)
        {
            mMap = new HashMap();
            mMap.put("event", s);
            mMap.put("ets", Long.valueOf(System.currentTimeMillis()));
        }
    }


    public String eventAsJson;

    public AniviaEventAsJson(String s)
    {
        eventAsJson = s;
    }

    public AniviaEventAsJson(JSONObject jsonobject)
    {
        eventAsJson = jsonobject.toString();
    }
}
