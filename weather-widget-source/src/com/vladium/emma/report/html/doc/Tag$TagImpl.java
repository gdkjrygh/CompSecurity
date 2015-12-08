// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html.doc;


// Referenced classes of package com.vladium.emma.report.html.doc:
//            Tag, HTMLWriter

private static final class m_name extends Tag
{

    private final String m_name;

    public void emit(HTMLWriter htmlwriter)
    {
        htmlwriter.write(m_name);
    }

    public String getName()
    {
        return m_name;
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
