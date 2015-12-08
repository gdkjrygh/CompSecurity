// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.vladium.util:
//            IConstants

public interface IProperties
{
    public static abstract class Factory
    {

        public static IProperties combine(IProperties iproperties, IProperties iproperties1)
        {
            if (iproperties != null)
            {
                iproperties = iproperties.copy();
            } else
            {
                iproperties = create(null);
            }
            ((PropertiesImpl)iproperties).getLastProperties().setDelegate((PropertiesImpl)iproperties1);
            return iproperties;
        }

        public static IProperties create(IMapper imapper)
        {
            return new PropertiesImpl(null, imapper);
        }

        public static IProperties wrap(Properties properties1, IMapper imapper)
        {
            HashMap hashmap = new HashMap();
            String s;
            for (Enumeration enumeration = properties1.propertyNames(); enumeration.hasMoreElements(); hashmap.put(s, properties1.getProperty(s)))
            {
                s = (String)enumeration.nextElement();
            }

            return new PropertiesImpl(hashmap, imapper);
        }

        public Factory()
        {
        }
    }

    private static final class Factory.PropertiesImpl
        implements IProperties, Cloneable
    {

        private Factory.PropertiesImpl m_delegate;
        private final IMapper m_mapper;
        private transient Set m_unmappedKeySet;
        private HashMap m_valueMap;

        public IProperties copy()
        {
            Factory.PropertiesImpl propertiesimpl;
            Factory.PropertiesImpl propertiesimpl1;
            Factory.PropertiesImpl propertiesimpl2;
            try
            {
                propertiesimpl2 = (Factory.PropertiesImpl)super.clone();
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new Error(clonenotsupportedexception.toString());
            }
            propertiesimpl2.m_valueMap = (HashMap)m_valueMap.clone();
            propertiesimpl2.m_unmappedKeySet = null;
            propertiesimpl1 = propertiesimpl2;
            propertiesimpl = m_delegate;
            while (propertiesimpl != null) 
            {
                Factory.PropertiesImpl propertiesimpl3;
                try
                {
                    propertiesimpl3 = (Factory.PropertiesImpl)propertiesimpl.clone();
                }
                catch (CloneNotSupportedException clonenotsupportedexception1)
                {
                    throw new Error(clonenotsupportedexception1.toString());
                }
                propertiesimpl3.m_valueMap = (HashMap)propertiesimpl.m_valueMap.clone();
                propertiesimpl3.m_unmappedKeySet = null;
                propertiesimpl1.setDelegate(propertiesimpl3);
                propertiesimpl1 = propertiesimpl3;
                propertiesimpl = propertiesimpl.m_delegate;
            }
            return propertiesimpl2;
        }

        Factory.PropertiesImpl getLastProperties()
        {
            Factory.PropertiesImpl propertiesimpl1 = this;
            for (Factory.PropertiesImpl propertiesimpl = m_delegate; propertiesimpl != null; propertiesimpl = propertiesimpl.m_delegate)
            {
                if (propertiesimpl == this)
                {
                    throw new IllegalStateException("cyclic delegation detected");
                }
                propertiesimpl1 = propertiesimpl;
            }

            return propertiesimpl1;
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
                    String s4 = m_mapper.getMappedKey(s);
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

        void setDelegate(Factory.PropertiesImpl propertiesimpl)
        {
            m_delegate = propertiesimpl;
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

        Factory.PropertiesImpl(HashMap hashmap, IMapper imapper)
        {
            m_mapper = imapper;
            if (hashmap == null)
            {
                hashmap = new HashMap();
            }
            m_valueMap = hashmap;
            m_delegate = null;
        }
    }

    public static interface IMapper
    {

        public abstract String getMappedKey(String s);
    }


    public abstract IProperties copy();

    public abstract String getProperty(String s);

    public abstract String getProperty(String s, String s1);

    public abstract boolean isEmpty();

    public abstract boolean isOverridden(String s);

    public abstract void list(PrintStream printstream);

    public abstract void list(PrintWriter printwriter);

    public abstract Iterator properties();

    public abstract String setProperty(String s, String s1);

    public abstract String[] toAppArgsForm(String s);

    public abstract Properties toProperties();
}
