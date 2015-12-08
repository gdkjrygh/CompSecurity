// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            MetaModel, Log

public static class formatter
{

    private final String defaultValue;
    private final  formatter;
    private final String urlParam;

    public String getDefaultValue()
    {
        return defaultValue;
    }

    public  getFormatter()
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

    public (String s, String s1,  )
    {
        urlParam = s;
        defaultValue = s1;
        formatter = ;
    }
}
