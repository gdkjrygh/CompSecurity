// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.logging.Logger;
import com.vladium.util.IProperties;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public abstract class AppLoggers
{

    private static final String COMMA_DELIMITERS = ", \t\r\n";
    public static final String DEFAULT_VERBOSITY_LEVEL = "info";
    public static final String PREFIX_VERBOSITY = "verbosity.";
    public static final String PROPERTY_VERBOSITY_FILTER = "verbosity.filter";
    public static final String PROPERTY_VERBOSITY_LEVEL = "verbosity.level";

    private AppLoggers()
    {
    }

    public static Logger create(String s, IProperties iproperties, Logger logger)
    {
        if (iproperties == null)
        {
            throw new IllegalArgumentException("null input: properties");
        }
        int i = Logger.stringToLevel(iproperties.getProperty("verbosity.level", "info"));
        Object obj1 = iproperties.getProperty("verbosity.filter");
        Object obj = null;
        iproperties = obj;
        if (obj1 != null)
        {
            obj1 = new StringTokenizer(((String) (obj1)), ", \t\r\n");
            iproperties = obj;
            if (((StringTokenizer) (obj1)).countTokens() > 0)
            {
                HashSet hashset = new HashSet(((StringTokenizer) (obj1)).countTokens());
                do
                {
                    iproperties = hashset;
                    if (!((StringTokenizer) (obj1)).hasMoreTokens())
                    {
                        break;
                    }
                    hashset.add(((StringTokenizer) (obj1)).nextToken());
                } while (true);
            }
        }
        return Logger.create(i, null, s, iproperties, logger);
    }
}
