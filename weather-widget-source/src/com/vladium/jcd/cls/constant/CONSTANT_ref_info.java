// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_info

public abstract class CONSTANT_ref_info extends CONSTANT_info
{

    public int m_class_index;
    public int m_name_and_type_index;

    protected CONSTANT_ref_info(int i, int j)
    {
        m_class_index = i;
        m_name_and_type_index = j;
    }

    protected CONSTANT_ref_info(UDataInputStream udatainputstream)
        throws IOException
    {
        m_class_index = udatainputstream.readU2();
        m_name_and_type_index = udatainputstream.readU2();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        udataoutputstream.writeU2(m_class_index);
        udataoutputstream.writeU2(m_name_and_type_index);
    }
}
