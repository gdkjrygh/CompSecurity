// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class VersionInfo
{

    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    protected VersionInfo(String s, String s1, String s2, String s3, String s4)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        infoPackage = s;
        if (s1 == null)
        {
            s1 = "UNAVAILABLE";
        }
        infoModule = s1;
        if (s2 == null)
        {
            s2 = "UNAVAILABLE";
        }
        infoRelease = s2;
        if (s3 == null)
        {
            s3 = "UNAVAILABLE";
        }
        infoTimestamp = s3;
        if (s4 == null)
        {
            s4 = "UNAVAILABLE";
        }
        infoClassloader = s4;
    }

    protected static final VersionInfo fromMap(String s, Map map, ClassLoader classloader)
    {
        Object obj1;
        Object obj3;
        Object obj4;
label0:
        {
            Object obj;
            Object obj2;
label1:
            {
                if (s == null)
                {
                    throw new IllegalArgumentException("Package identifier must not be null.");
                }
                obj3 = null;
                obj4 = null;
                obj1 = null;
                if (map == null)
                {
                    break label0;
                }
                obj1 = (String)map.get("info.module");
                obj = obj1;
                if (obj1 != null)
                {
                    obj = obj1;
                    if (((String) (obj1)).length() < 1)
                    {
                        obj = null;
                    }
                }
                obj1 = (String)map.get("info.release");
                obj2 = obj1;
                if (obj1 == null)
                {
                    break label1;
                }
                if (((String) (obj1)).length() >= 1)
                {
                    obj2 = obj1;
                    if (!((String) (obj1)).equals("${pom.version}"))
                    {
                        break label1;
                    }
                }
                obj2 = null;
            }
            map = (String)map.get("info.timestamp");
            obj3 = obj;
            obj4 = obj2;
            obj1 = map;
            if (map == null)
            {
                break label0;
            }
            if (map.length() >= 1)
            {
                obj3 = obj;
                obj4 = obj2;
                obj1 = map;
                if (!map.equals("${mvn.timestamp}"))
                {
                    break label0;
                }
            }
            obj1 = null;
            obj4 = obj2;
            obj3 = obj;
        }
        map = null;
        if (classloader != null)
        {
            map = classloader.toString();
        }
        return new VersionInfo(s, ((String) (obj3)), ((String) (obj4)), ((String) (obj1)), map);
    }

    public static final VersionInfo loadVersionInfo(String s, ClassLoader classloader)
    {
        Object obj;
        ClassLoader classloader1;
        Object obj1;
        if (s == null)
        {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = Thread.currentThread().getContextClassLoader();
        }
        obj = null;
        obj1 = null;
        classloader = ((ClassLoader) (obj));
        InputStream inputstream = classloader1.getResourceAsStream((new StringBuilder()).append(s.replace('.', '/')).append("/").append("version.properties").toString());
        classloader = obj1;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        classloader = new Properties();
        classloader.load(inputstream);
        obj = classloader;
        classloader = ((ClassLoader) (obj));
        inputstream.close();
        classloader = ((ClassLoader) (obj));
_L2:
        obj = null;
        if (classloader != null)
        {
            obj = fromMap(s, classloader, classloader1);
        }
        return ((VersionInfo) (obj));
        Exception exception;
        exception;
        classloader = ((ClassLoader) (obj));
        inputstream.close();
        classloader = ((ClassLoader) (obj));
        try
        {
            throw exception;
        }
        catch (IOException ioexception) { }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final VersionInfo[] loadVersionInfo(String as[], ClassLoader classloader)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("Package identifier list must not be null.");
        }
        ArrayList arraylist = new ArrayList(as.length);
        for (int i = 0; i < as.length; i++)
        {
            VersionInfo versioninfo = loadVersionInfo(as[i], classloader);
            if (versioninfo != null)
            {
                arraylist.add(versioninfo);
            }
        }

        return (VersionInfo[])arraylist.toArray(new VersionInfo[arraylist.size()]);
    }

    public final String getClassloader()
    {
        return infoClassloader;
    }

    public final String getModule()
    {
        return infoModule;
    }

    public final String getPackage()
    {
        return infoPackage;
    }

    public final String getRelease()
    {
        return infoRelease;
    }

    public final String getTimestamp()
    {
        return infoTimestamp;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(infoPackage.length() + 20 + infoModule.length() + infoRelease.length() + infoTimestamp.length() + infoClassloader.length());
        stringbuilder.append("VersionInfo(").append(infoPackage).append(':').append(infoModule);
        if (!"UNAVAILABLE".equals(infoRelease))
        {
            stringbuilder.append(':').append(infoRelease);
        }
        if (!"UNAVAILABLE".equals(infoTimestamp))
        {
            stringbuilder.append(':').append(infoTimestamp);
        }
        stringbuilder.append(')');
        if (!"UNAVAILABLE".equals(infoClassloader))
        {
            stringbuilder.append('@').append(infoClassloader);
        }
        return stringbuilder.toString();
    }
}
