// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JSONUtils
{

    public JSONUtils()
    {
    }

    public static String JSONifyMap(Map map)
    {
        if (map != null && map.size() > 0)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("{");
            boolean flag = true;
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                if (!flag)
                {
                    stringbuffer.append(", ");
                } else
                {
                    flag = false;
                }
                stringbuffer.append((new StringBuilder()).append("\"").append(s).append("\":\"").append((String)map.get(s)).append("\"").toString());
            }
            stringbuffer.append("}");
            return stringbuffer.toString();
        } else
        {
            return null;
        }
    }
}
