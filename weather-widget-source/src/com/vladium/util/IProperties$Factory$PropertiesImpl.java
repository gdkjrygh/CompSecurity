// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.vladium.util:
//            IProperties, IConstants

private static final class m_delegate
    implements IProperties, Cloneable
{

    private m_unmappedKeySet m_delegate;
    private final m_unmappedKeySet m_mapper;
    private transient Set m_unmappedKeySet;
    private HashMap m_valueMap;

    public IProperties copy()
    {
        m_delegate m_delegate1;
        m_delegate m_delegate2;
        m_delegate m_delegate3;
        try
        {
            m_delegate3 = (m_delegate)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new Error(clonenotsupportedexception.toString());
        }
        m_delegate3.m_valueMap = (HashMap)m_valueMap.clone();
        m_delegate3.m_unmappedKeySet = null;
        m_delegate2 = m_delegate3;
        m_delegate1 = m_delegate;
        while (m_delegate1 != null) 
        {
            m_delegate m_delegate4;
            try
            {
                m_delegate4 = (m_delegate)m_delegate1.clone();
            }
            catch (CloneNotSupportedException clonenotsupportedexception1)
            {
                throw new Error(clonenotsupportedexception1.toString());
            }
            m_delegate4.m_valueMap = (HashMap)m_delegate1.m_valueMap.clone();
            m_delegate4.m_unmappedKeySet = null;
            m_delegate2.setDelegate(m_delegate4);
            m_delegate2 = m_delegate4;
            m_delegate1 = m_delegate1.m_delegate;
        }
        return m_delegate3;
    }

    m_delegate getLastProperties()
    {
        m_delegate m_delegate2 = this;
        for (m_delegate m_delegate1 = m_delegate; m_delegate1 != null; m_delegate1 = m_delegate1.m_delegate)
        {
            if (m_delegate1 == this)
            {
                throw new IllegalStateException("cyclic delegation detected");
            }
            m_delegate2 = m_delegate1;
        }

        return m_delegate2;
    }

    public String getProperty(String s)
    {
        return getProperty(s, null);
    }

    public String getProperty(String s, String s1)
    {
        String s3 = (String)m_valueMap.get(s);
        String s2 = s3;
        if (s3 == null)
        {
            s2 = s3;
            if (m_mapper != null)
            {
                String s4 = m_mapper.m_mapper(s);
                s2 = s3;
                if (s4 != null)
                {
                    s2 = (String)m_valueMap.get(s4);
                }
            }
        }
        s3 = s2;
        if (s2 == null)
        {
            s3 = s2;
            if (m_delegate != null)
            {
                s3 = m_delegate.getProperty(s, null);
            }
        }
        if (s3 != null)
        {
            return s3;
        } else
        {
            return s1;
        }
    }

    public boolean isEmpty()
    {
        return m_valueMap.isEmpty() && (m_delegate == null || m_delegate != null && m_delegate.isEmpty());
    }

    public boolean isOverridden(String s)
    {
        return m_valueMap.containsKey(s);
    }

    public void list(PrintStream printstream)
    {
        if (printstream != null)
        {
            String s;
            String s1;
            for (Iterator iterator = properties(); iterator.hasNext(); printstream.println((new StringBuilder()).append(s).append(":\t[").append(s1).append("]").toString()))
            {
                s = (String)iterator.next();
                s1 = getProperty(s);
            }

        }
    }

    public void list(PrintWriter printwriter)
    {
        if (printwriter != null)
        {
            String s;
            String s1;
            for (Iterator iterator = properties(); iterator.hasNext(); printwriter.println((new StringBuilder()).append(s).append(":\t[").append(s1).append("]").toString()))
            {
                s = (String)iterator.next();
                s1 = getProperty(s);
            }

        }
    }

    public Iterator properties()
    {
        return unmappedKeySet().iterator();
    }

    void setDelegate(unmappedKeySet unmappedkeyset)
    {
        m_delegate = unmappedkeyset;
        m_unmappedKeySet = null;
    }

    public String setProperty(String s, String s1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("null input: value");
        } else
        {
            m_unmappedKeySet = null;
            return (String)m_valueMap.put(s, s1);
        }
    }

    public String[] toAppArgsForm(String s)
    {
        if (isEmpty())
        {
            return IConstants.EMPTY_STRING_ARRAY;
        }
        if (s == null)
        {
            throw new IllegalArgumentException("null input: prefix");
        }
        ArrayList arraylist = new ArrayList();
        String s1;
        String s2;
        for (Iterator iterator = properties(); iterator.hasNext(); arraylist.add(s.concat(s1).concat("=").concat(s2)))
        {
            s1 = (String)iterator.next();
            s2 = getProperty(s1, "");
        }

        s = new String[arraylist.size()];
        arraylist.toArray(s);
        return s;
    }

    public Properties toProperties()
    {
        Properties properties1 = new Properties();
        String s;
        for (Iterator iterator = properties(); iterator.hasNext(); properties1.setProperty(s, getProperty(s)))
        {
            s = (String)iterator.next();
        }

        return properties1;
    }

    Set unmappedKeySet()
    {
        Object obj = m_unmappedKeySet;
        if (obj == null)
        {
            obj = new TreeSet();
            ((Set) (obj)).addAll(m_valueMap.keySet());
            if (m_delegate != null)
            {
                ((Set) (obj)).addAll(m_delegate.unmappedKeySet());
            }
            m_unmappedKeySet = ((Set) (obj));
            return ((Set) (obj));
        } else
        {
            return ((Set) (obj));
        }
    }

    _cls9(HashMap hashmap, _cls9 _pcls9)
    {
        m_mapper = _pcls9;
        if (hashmap == null)
        {
            hashmap = new HashMap();
        }
        m_valueMap = hashmap;
        m_delegate = null;
    }
}
