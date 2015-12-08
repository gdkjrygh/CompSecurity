// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            Log

class MetaModel
{
    public static interface Formatter
    {

        public abstract String format(String s);
    }

    public static class MetaInfo
    {

        private final String defaultValue;
        private final Formatter formatter;
        private final String urlParam;

        public String getDefaultValue()
        {
            return defaultValue;
        }

        public Formatter getFormatter()
        {
            return formatter;
        }

        public String getUrlParam(String s)
        {
            Object obj = null;
            if (s.contains("*"))
            {
                String s1 = urlParam;
                String as[] = s.split("\\*");
                s = obj;
                if (as.length > 1)
                {
                    int i;
                    try
                    {
                        i = Integer.parseInt(as[1]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        Log.w((new StringBuilder()).append("Unable to parse slot for url parameter ").append(s1).toString());
                        return null;
                    }
                    s = (new StringBuilder()).append(s1).append(i).toString();
                }
                return s;
            } else
            {
                return urlParam;
            }
        }

        public MetaInfo(String s, String s1, Formatter formatter1)
        {
            urlParam = s;
            defaultValue = s1;
            formatter = formatter1;
        }
    }


    private Map metaInfos;

    MetaModel()
    {
        metaInfos = new HashMap();
    }

    public void addField(String s, String s1, String s2, Formatter formatter)
    {
        metaInfos.put(s, new MetaInfo(s1, s2, formatter));
    }

    MetaInfo getMetaInfo(String s)
    {
        if (s.startsWith("&"))
        {
            return new MetaInfo(s.substring(1), null, null);
        }
        String s1 = s;
        if (s.contains("*"))
        {
            s1 = s.substring(0, s.indexOf("*"));
        }
        return (MetaInfo)metaInfos.get(s1);
    }
}
