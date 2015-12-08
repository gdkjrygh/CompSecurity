// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.emma.report.ReportProperties;
import com.vladium.util.ClassLoaderResolver;
import com.vladium.util.IProperties;
import com.vladium.util.Property;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;

public abstract class EMMAProperties
{

    public static final String DEFAULT_COVERAGE_DATA_OUT_FILE = "coverage.ec";
    public static final Boolean DEFAULT_COVERAGE_DATA_OUT_MERGE;
    public static final String DEFAULT_META_DATA_OUT_FILE = "coverage.em";
    public static final Boolean DEFAULT_META_DATA_OUT_MERGE;
    public static final String DEFAULT_SESSION_DATA_OUT_FILE = "coverage.es";
    public static final Boolean DEFAULT_SESSION_DATA_OUT_MERGE;
    public static final String GENERIC_PROPERTY_OVERRIDE_PREFIX = "D";
    public static final String PREFIX_COVERAGE_DATA = "coverage.";
    public static final String PREFIX_META_DATA = "metadata.";
    public static final String PREFIX_SESSION_DATA = "session.";
    public static final String PROPERTY_COVERAGE_DATA_OUT_FILE = "coverage.out.file";
    public static final String PROPERTY_COVERAGE_DATA_OUT_MERGE = "coverage.out.merge";
    public static final String PROPERTY_META_DATA_OUT_FILE = "metadata.out.file";
    public static final String PROPERTY_META_DATA_OUT_MERGE = "metadata.out.merge";
    public static final String PROPERTY_SESSION_DATA_OUT_FILE = "session.out.file";
    public static final String PROPERTY_SESSION_DATA_OUT_MERGE = "session.out.merge";
    public static final String PROPERTY_TEMP_FILE_EXT = ".et";
    public static final Map SYSTEM_PROPERTY_REDIRECTS;
    private static final Map s_properties = new WeakHashMap();
    private static long s_timestamp;

    private EMMAProperties()
    {
    }

    public static IProperties getAppProperties()
    {
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorenter ;
        IProperties iproperties = getAppProperties(ClassLoaderResolver.getClassLoader());
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorexit ;
        return iproperties;
        Exception exception;
        exception;
        throw exception;
    }

    public static IProperties getAppProperties(ClassLoader classloader)
    {
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorenter ;
        Object obj = (IProperties)s_properties.get(classloader);
        if (obj == null) goto _L2; else goto _L1
_L1:
        classloader = ((ClassLoader) (obj));
_L5:
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorexit ;
        return classloader;
_L2:
        IProperties iproperties;
        IProperties iproperties1;
        iproperties = wrap(Property.getSystemPropertyRedirects(SYSTEM_PROPERTY_REDIRECTS));
        iproperties1 = wrap(Property.getProperties("emma_default.properties", classloader));
        obj = Property.getSystemProperty("emma.properties");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = new File(((String) (obj)));
_L3:
        obj = wrap(Property.getLazyPropertiesFromFile(((File) (obj))));
        IProperties iproperties2 = wrap(Property.getSystemProperties("emma"));
        obj = com.vladium.util.IProperties.Factory.combine(wrap(Property.getProperties("emma.properties", classloader)), com.vladium.util.IProperties.Factory.combine(iproperties2, com.vladium.util.IProperties.Factory.combine(((IProperties) (obj)), com.vladium.util.IProperties.Factory.combine(iproperties1, iproperties))));
        s_properties.put(classloader, obj);
        classloader = ((ClassLoader) (obj));
        continue; /* Loop/switch isn't completed */
        obj = null;
          goto _L3
        classloader;
        throw classloader;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static long getTimeStamp()
    {
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorenter ;
        long l1 = s_timestamp;
        long l;
        l = l1;
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l = System.currentTimeMillis();
        s_timestamp = l;
        com/vladium/emma/EMMAProperties;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public static String makeAppVersion(int i, int j, int k)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(i);
        stringbuffer.append('.');
        stringbuffer.append(j);
        stringbuffer.append('.');
        stringbuffer.append(k);
        return stringbuffer.toString();
    }

    public static IProperties wrap(Properties properties)
    {
        if (properties == null)
        {
            return null;
        } else
        {
            return com.vladium.util.IProperties.Factory.wrap(properties, ReportProperties.REPORT_PROPERTY_MAPPER);
        }
    }

    static 
    {
        DEFAULT_META_DATA_OUT_MERGE = Boolean.TRUE;
        DEFAULT_COVERAGE_DATA_OUT_MERGE = Boolean.TRUE;
        DEFAULT_SESSION_DATA_OUT_MERGE = Boolean.TRUE;
        HashMap hashmap = new HashMap();
        hashmap.put("report.".concat("out.encoding"), "file.encoding");
        hashmap.put("report.".concat("out.dir"), "user.dir");
        SYSTEM_PROPERTY_REDIRECTS = Collections.unmodifiableMap(hashmap);
    }
}
