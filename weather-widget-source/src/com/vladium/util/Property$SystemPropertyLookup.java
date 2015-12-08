// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

// Referenced classes of package com.vladium.util:
//            XProperties, Property

private static final class m_systemPrefix extends XProperties
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

    (String s)
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
