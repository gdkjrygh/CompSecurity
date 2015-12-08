// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import com.vladium.util.IConstants;
import java.util.ArrayList;

// Referenced classes of package com.vladium.util.args:
//            OptsParser

static final class m_patternPrefix
    implements t
{

    private final String m_canonicalName;
    private final String m_name;
    private final String m_patternPrefix;
    private ArrayList m_values;

    void addValue(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: value");
        }
        if (m_values == null)
        {
            m_values = new ArrayList();
        }
        m_values.add(s);
    }

    public String getCanonicalName()
    {
        return m_canonicalName;
    }

    public String getFirstValue()
    {
        if (m_values == null)
        {
            return null;
        } else
        {
            return (String)m_values.get(0);
        }
    }

    public String getName()
    {
        return m_name;
    }

    public String getPatternPrefix()
    {
        return m_patternPrefix;
    }

    public int getValueCount()
    {
        if (m_values == null)
        {
            return 0;
        } else
        {
            return m_values.size();
        }
    }

    public String[] getValues()
    {
        if (m_values == null)
        {
            return IConstants.EMPTY_STRING_ARRAY;
        } else
        {
            String as[] = new String[m_values.size()];
            m_values.toArray(as);
            return as;
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(m_name);
        if (!m_canonicalName.equals(m_name))
        {
            stringbuffer.append((new StringBuilder()).append(" [").append(m_canonicalName).append("]").toString());
        }
        if (m_values != null)
        {
            stringbuffer.append(": ");
            stringbuffer.append(m_values);
        }
        return stringbuffer.toString();
    }

    t(String s, String s1, String s2)
    {
        m_name = s;
        m_canonicalName = s1;
        m_patternPrefix = s2;
    }
}
