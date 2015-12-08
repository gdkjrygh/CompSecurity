// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.instr;


// Referenced classes of package com.vladium.emma.instr:
//            InstrProcessor

public static final class m_name
{

    public static final m_name OUT_MODE_COPY = new <init>("copy");
    public static final <init> OUT_MODE_FULLCOPY = new <init>("fullcopy");
    public static final <init> OUT_MODE_OVERWRITE = new <init>("overwrite");
    private final String m_name;

    public static m_name nameToMode(String s)
    {
        if (OUT_MODE_COPY.m_name.equals(s))
        {
            return OUT_MODE_COPY;
        }
        if (OUT_MODE_FULLCOPY.m_name.equals(s))
        {
            return OUT_MODE_FULLCOPY;
        }
        if (OUT_MODE_OVERWRITE.m_name.equals(s))
        {
            return OUT_MODE_OVERWRITE;
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return m_name;
    }

    public String toString()
    {
        return m_name;
    }


    private (String s)
    {
        m_name = s;
    }
}
