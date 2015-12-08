// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_literal_info, ICONSTANTVisitor

public final class CONSTANT_String_info extends CONSTANT_literal_info
{

    public static final byte TAG = 8;
    public int m_string_index;

    public CONSTANT_String_info(int i)
    {
        m_string_index = i;
    }

    protected CONSTANT_String_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_string_index = udatainputstream.readU2();
    }

    public Object accept(ICONSTANTVisitor iconstantvisitor, Object obj)
    {
        return iconstantvisitor.visit(this, obj);
    }

    public final byte tag()
    {
        return 8;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CONSTANT_String: [string_index = ").append(m_string_index).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeU2(m_string_index);
    }
}
