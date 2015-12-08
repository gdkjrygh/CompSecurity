// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute

private static abstract class m_name
    implements IItemAttribute
{

    private final String m_name;

    public String getName()
    {
        return m_name;
    }

    protected (String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: name");
        } else
        {
            m_name = s;
            return;
        }
    }
}
