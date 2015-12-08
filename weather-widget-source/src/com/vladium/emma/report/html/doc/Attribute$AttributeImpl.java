// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            Attribute, HTMLWriter

private static final class m_name extends Attribute
{

    private final String m_name;

    public void emit(HTMLWriter htmlwriter)
    {
        htmlwriter.write(m_name);
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof m_name))
        {
            return false;
        } else
        {
            return m_name.equals(((m_name)obj).m_name);
        }
    }

    public String getName()
    {
        return m_name;
    }

    public int hashCode()
    {
        return m_name.hashCode();
    }

    public String toString()
    {
        return m_name;
    }

    (String s)
    {
        m_name = s;
    }
}
