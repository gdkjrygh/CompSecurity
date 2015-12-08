// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report.html;

import com.vladium.util.ObjectIntMap;

// Referenced classes of package com.vladium.emma.report.html:
//            ReportGenerator

private static final class m_out
{

    private final ObjectIntMap m_namespace;
    private final int m_out[];

    String getID(String s)
    {
        int ai[] = m_out;
        int i;
        if (m_namespace.get(s, ai))
        {
            i = ai[0];
        } else
        {
            i = m_namespace.size();
            m_namespace.put(s, i);
        }
        return Integer.toHexString(i);
    }

    ()
    {
        m_namespace = new ObjectIntMap(101);
        m_out = new int[1];
    }

    m_out(int i)
    {
        m_namespace = new ObjectIntMap(i);
        m_out = new int[1];
    }
}
