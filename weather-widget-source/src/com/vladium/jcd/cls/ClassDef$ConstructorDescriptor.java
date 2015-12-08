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

    public final int compareTo(Object obj)
    {
        return m_descriptor.compareTo(((m_descriptor)obj).m_descriptor);
    }

    (int i, String s)
    {
        m_modifiers = i;
        m_descriptor = s;
    }
}
