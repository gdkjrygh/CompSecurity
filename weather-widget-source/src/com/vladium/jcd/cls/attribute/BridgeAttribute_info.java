// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, IAttributeVisitor

public final class BridgeAttribute_info extends Attribute_info
{

    public BridgeAttribute_info(int i)
    {
        super(i, 0L);
    }

    BridgeAttribute_info(int i, long l)
    {
        super(i, l);
    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        return super.clone();
    }

    public long length()
    {
        return 6L;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BridgeAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(m_attribute_length).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
    }
}
