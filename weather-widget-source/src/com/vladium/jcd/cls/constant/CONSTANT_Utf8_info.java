// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_info, ICONSTANTVisitor

public final class CONSTANT_Utf8_info extends CONSTANT_info
{

    public static final byte TAG = 1;
    public String m_value;

    protected CONSTANT_Utf8_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_value = udatainputstream.readUTF();
    }

    public CONSTANT_Utf8_info(String s)
    {
        m_value = s;
    }

    public Object accept(ICONSTANTVisitor iconstantvisitor, Object obj)
    {
        return iconstantvisitor.visit(this, obj);
    }

    public final byte tag()
    {
        return 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CONSTANT_Utf8: [").append(m_value).append(']').toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeUTF(m_value);
    }
}
