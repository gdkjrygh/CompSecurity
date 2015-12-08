// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;


// Referenced classes of package com.vladium.jcd.cls:
//            ClassDef

private static final class m_descriptor
    implements Comparable
{

    final String m_descriptor;
    final int m_modifiers;
    final String m_name;

    public final int compareTo(Object obj)
    {
        return m_name.compareTo(((m_name)obj).m_name);
    }

    (String s, int i, String s1)
    {
        m_name = s;
        m_modifiers = i;
        m_descriptor = s1;
    }
}
