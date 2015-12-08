// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.lib.UDataInputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_ref_info, ICONSTANTVisitor

public final class CONSTANT_Methodref_info extends CONSTANT_ref_info
{

    public static final byte TAG = 10;

    public CONSTANT_Methodref_info(int i, int j)
    {
        super(i, j);
    }

    protected CONSTANT_Methodref_info(UDataInputStream udatainputstream)
        throws IOException
    {
        super(udatainputstream);
    }

    public Object accept(ICONSTANTVisitor iconstantvisitor, Object obj)
    {
        return iconstantvisitor.visit(this, obj);
    }

    public final byte tag()
    {
        return 10;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CONSTANT_Methodref_info: [class_index = ").append(m_class_index).append(", name_and_type_index = ").append(m_name_and_type_index).append(']').toString();
    }
}
