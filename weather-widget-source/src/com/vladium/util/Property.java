// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package com.vladium.util:
//            XProperties, ResourceLoader

public abstract class Property
{
    private static final class FilePropertyLookup extends XProperties
    {

        private Properties m_contents;
        private final File m_src;

        private void faultContents()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj1 = m_contents;
            Properties properties;
            properties = ((Properties) (obj1));
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            File file = m_src;
            properties = ((Properties) (obj1));
            if (file == null)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            properties = Property.getPropertiesFromFile(m_src);
            obj1 = properties;
            if (properties != null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            obj1 = new XProperties();
            m_contents = ((Properties) (obj1));
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            throw obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            throw new RuntimeException((new StringBuilder()).append("exception while processing properties file [").append(m_src.getAbsolutePath()).append("]: ").append(obj).toString());
        }

        public Object get(Object obj)
        {
            faultContents();
            return m_contents.get(obj);
        }

        public String getProperty(String s)
        {
            faultContents();
            return m_contents.getProperty(s);
        }

        public Enumeration keys()
        {
            faultContents();
            return m_contents.keys();
        }

        FilePropertyLookup(File file)
        {
            m_src = file;
        }
    }

    private static final class SystemPropertyLookup extends XProperties
    {

        private final String m_systemPrefix;

        public Object get(Object obj)
        {
            Object obj1;
            if (!(obj instanceof String))
            {
                obj1 = null;
            } else
            {
                String s = (String)super.get(obj);
                obj1 = s;
                if (s == null)
                {
                    obj1 = s;
                    if (m_systemPrefix != null)
                    {
                        obj = Property.getSystemProperty(m_systemPrefix.concat((String)obj), null);
                        obj1 = obj;
                        if (obj != null)
                        {
                            return obj;
                        }
                    }
                }
            }
            return obj1;
        }

        public String getProperty(String s)
        {
            return (String)get(s);
        }

        public Enumeration keys()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            String s;
            obj = new Hashtable();
            s = m_systemPrefix;
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            int i = m_systemPrefix.length();
            Enumeration enumeration = System.getProperties().propertyNames();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                String s1 = (String)enumeration.nextElement();
                if (s1.startsWith(m_systemPrefix))
                {
                    s1 = s1.substring(i);
                    ((Hashtable) (obj)).put(s1, s1);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_90;
            SecurityException securityexception;
            securityexception;
            securityexception.printStackTrace(System.out);
            obj = ((Hashtable) (obj)).keys();
            this;
            JVM INSTR monitorexit ;
            return ((Enumeration) (obj));
            Exception exception;
            exception;
            throw exception;
        }

        SystemPropertyLookup(String s)
        {
            String s1 = s;
            if (s != null)
            {
                s1 = s;
                if (!s.endsWith("."))
                {
                    s1 = s.concat(".");
                }
            }
            m_systemPrefix = s1;
        }
    }

    private static final class SystemRedirectsLookup extends XProperties
    {

        private final Map m_systemRedirects;

        public Object get(Object obj)
        {
            Object obj1;
            if (!(obj instanceof String))
            {
                obj1 = null;
            } else
            {
                String s = (String)super.get(obj);
                obj1 = s;
                if (s == null)
                {
                    obj1 = s;
                    if (m_systemRedirects != null)
                    {
                        obj = (String)m_systemRedirects.get(obj);
                        obj1 = s;
                        if (obj != null)
                        {
                            obj = Property.getSystemProperty(((String) (obj)), null);
                            obj1 = obj;
                            if (obj != null)
                            {
                                return obj;
                            }
                        }
                    }
                }
            }
            return obj1;
        }

        public String getProperty(String s)
        {
            return (String)get(s);
        }

        public Enumeration keys()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            Iterator iterator;
            obj = new Hashtable();
            if (m_systemRedirects == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            iterator = m_systemRedirects.keySet().iterator();
_L2:
            Object obj1;
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                obj1 = iterator.next();
            } while (obj1 == null);
            ((Hashtable) (obj)).put(obj1, obj1);
            if (true) goto _L2; else goto _L1
_L1:
            obj;
            throw obj;
            obj = ((Hashtable) (obj)).keys();
            this;
            JVM INSTR monitorexit ;
            return ((Enumeration) (obj));
        }

        SystemRedirectsLookup(Map map)
        {
            m_systemRedirects = map;
        }
    }


    private static String s_systemFingerprint;
    private static Properties s_systemProperties;
    private static Properties s_systemRedirects;

    public Property()
    {
    }

    public static Properties combine(Properties properties, Properties properties1)
    {
        if (properties1 == null)
        {
            properties1 = properties;
            if (properties == null)
            {
                properties1 = new XProperties();
            }
            return properties1;
        }
        if (properties == null)
        {
            return properties1;
        }
        properties1 = new XProperties(properties1);
        String s;
        for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); properties1.setProperty(s, properties.getProperty(s)))
        {
            s = (String)enumeration.nextElement();
        }

        return properties1;
    }

    public static Properties getAppProperties(String s, ClassLoader classloader)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null properties: appNameLC");
        }
        Properties properties = getProperties((new StringBuilder()).append(s).append("_default.properties").toString(), classloader);
        Object obj = getSystemProperty((new StringBuilder()).append(s).append(".properties").toString());
        Properties properties1;
        if (obj != null)
        {
            obj = new File(((String) (obj)));
        } else
        {
            obj = null;
        }
        obj = getLazyPropertiesFromFile(((File) (obj)));
        properties1 = getSystemProperties(s);
        return combine(getProperties((new StringBuilder()).append(s).append(".properties").toString(), classloader), combine(properties1, combine(((Properties) (obj)), properties)));
    }

    public static Properties getLazyPropertiesFromFile(File file)
    {
        return new FilePropertyLookup(file);
    }

    public static Properties getProperties(String s)
    {
        Object obj;
        String s1;
        XProperties xproperties;
        xproperties = null;
        s1 = null;
        obj = null;
        s = ResourceLoader.getResourceAsStream(s);
        obj = xproperties;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = s;
        s1 = s;
        xproperties = new XProperties();
        xproperties.load(s);
        obj = xproperties;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return ((Properties) (obj));
        s;
        s = ((String) (obj));
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
_L2:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            catch (Throwable throwable) { }
        }
        throw s;
        Object obj1;
        obj1;
        s1 = s;
        s = ((String) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Properties getProperties(String s, ClassLoader classloader)
    {
        String s1;
        String s2;
        Object obj;
        obj = null;
        s2 = null;
        s1 = null;
        s = ResourceLoader.getResourceAsStream(s, classloader);
        classloader = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s1 = s;
        s2 = s;
        classloader = new XProperties();
        classloader.load(s);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return classloader;
        s;
        s = s1;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
_L2:
        if (s2 != null)
        {
            try
            {
                s2.close();
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader) { }
        }
        throw s;
        classloader;
        s2 = s;
        s = classloader;
        if (true) goto _L2; else goto _L1
_L1:
        classloader;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Properties getPropertiesFromFile(File file)
        throws IOException
    {
        Object obj;
        if (file == null)
        {
            throw new IllegalArgumentException("null input: file");
        }
        obj = null;
        file = new BufferedInputStream(new FileInputStream(file), 8192);
        XProperties xproperties = new XProperties();
        xproperties.load(file);
        Exception exception;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return xproperties;
        exception;
        file = obj;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw exception;
        exception;
        continue; /* Loop/switch isn't completed */
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getSystemFingerprint()
    {
        if (s_systemFingerprint != null)
        {
            return s_systemFingerprint;
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(getSystemProperty("java.vm.name", ""));
            stringbuffer.append(':');
            stringbuffer.append(getSystemProperty("java.vm.version", ""));
            stringbuffer.append(':');
            stringbuffer.append(getSystemProperty("java.vm.vendor", ""));
            stringbuffer.append(':');
            stringbuffer.append(getSystemProperty("os.name", ""));
            stringbuffer.append(':');
            stringbuffer.append(getSystemProperty("os.version", ""));
            stringbuffer.append(':');
            stringbuffer.append(getSystemProperty("os.arch", ""));
            s_systemFingerprint = stringbuffer.toString();
            return s_systemFingerprint;
        }
    }

    public static Properties getSystemProperties(String s)
    {
        Properties properties = s_systemProperties;
        if (properties == null)
        {
            s = new SystemPropertyLookup(s);
            s_systemProperties = s;
            return s;
        } else
        {
            return properties;
        }
    }

    public static String getSystemProperty(String s)
    {
        try
        {
            s = System.getProperty(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String getSystemProperty(String s, String s1)
    {
        try
        {
            s = System.getProperty(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s;
    }

    public static Properties getSystemPropertyRedirects(Map map)
    {
        Properties properties = s_systemRedirects;
        if (properties == null)
        {
            map = new SystemRedirectsLookup(map);
            s_systemRedirects = map;
            return map;
        } else
        {
            return properties;
        }
    }

    public static boolean toBoolean(String s)
    {
        while (s == null || !s.startsWith("t") && !s.startsWith("y")) 
        {
            return false;
        }
        return true;
    }
}
