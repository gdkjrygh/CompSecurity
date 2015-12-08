// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;


// Referenced classes of package com.vladium.emma.report:
//            IItemMetadata, Item

protected static final class m_attributeIDs
    implements IItemMetadata
{

    private final long m_attributeIDs;
    private final int m_typeID;
    private final String m_typeName;

    public long getAttributeIDs()
    {
        return m_attributeIDs;
    }

    public int getTypeID()
    {
        return m_typeID;
    }

    public String getTypeName()
    {
        return m_typeName;
    }

    (int i, String s, long l)
    {
        m_typeID = i;
        m_typeName = s;
        m_attributeIDs = l;
    }
}
