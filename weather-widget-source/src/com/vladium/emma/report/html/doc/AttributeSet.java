// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;

import com.vladium.util.Strings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.vladium.emma.report.html.doc:
//            IContent, Attribute, HTMLWriter

public abstract class AttributeSet
    implements IContent
{
    private static final class AttributeSetImpl extends AttributeSet
    {

        private static final int MAX_BUF_LENGTH = 4096;
        private final Map m_attrMap = new HashMap();
        private StringBuffer m_buf;

        public void emit(HTMLWriter htmlwriter)
        {
            boolean flag = true;
            Iterator iterator = m_attrMap.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                Attribute attribute = (Attribute)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue().toString();
                if (flag)
                {
                    flag = false;
                } else
                {
                    htmlwriter.write(' ');
                }
                htmlwriter.write(attribute.getName());
                htmlwriter.write("=\"");
                if (m_buf != null && m_buf.length() <= 4096)
                {
                    m_buf.setLength(0);
                } else
                {
                    m_buf = new StringBuffer();
                }
                Strings.HTMLEscape(((String) (obj)), m_buf);
                htmlwriter.write(m_buf.toString());
                htmlwriter.write('"');
            }
        }

        public boolean isEmpty()
        {
            return m_attrMap.isEmpty();
        }

        public AttributeSet set(Attribute attribute, int i)
        {
            m_attrMap.put(attribute, new Integer(i));
            return this;
        }

        public AttributeSet set(Attribute attribute, String s)
        {
            m_attrMap.put(attribute, s);
            return this;
        }

        AttributeSetImpl()
        {
        }
    }


    AttributeSet()
    {
    }

    public static AttributeSet create()
    {
        return new AttributeSetImpl();
    }

    public abstract boolean isEmpty();

    public abstract AttributeSet set(Attribute attribute, int i);

    public abstract AttributeSet set(Attribute attribute, String s);
}
