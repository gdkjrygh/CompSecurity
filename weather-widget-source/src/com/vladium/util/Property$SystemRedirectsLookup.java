// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vladium.util:
//            XProperties, Property

private static final class m_systemRedirects extends XProperties
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

    (Map map)
    {
        m_systemRedirects = map;
    }
}
