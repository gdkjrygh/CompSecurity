// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.cls.constant.CONSTANT_Utf8_info;
import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            CodeAttribute_info, ConstantValueAttribute_info, ExceptionsAttribute_info, InnerClassesAttribute_info, 
//            SyntheticAttribute_info, BridgeAttribute_info, LineNumberTableAttribute_info, SourceFileAttribute_info, 
//            GenericAttribute_info, IAttributeVisitor

public abstract class Attribute_info
    implements Cloneable, IClassFormatOutput
{

    public static final String ATTRIBUTE_BRIDGE = "Bridge";
    public static final String ATTRIBUTE_CODE = "Code";
    public static final String ATTRIBUTE_CONSTANT_VALUE = "ConstantValue";
    public static final String ATTRIBUTE_EXCEPTIONS = "Exceptions";
    public static final String ATTRIBUTE_INNERCLASSES = "InnerClasses";
    public static final String ATTRIBUTE_LINE_NUMBER_TABLE = "LineNumberTable";
    public static final String ATTRIBUTE_SOURCEFILE = "SourceFile";
    public static final String ATTRIBUTE_SYNTHETIC = "Synthetic";
    protected long m_attribute_length;
    public int m_name_index;

    protected Attribute_info(int i, long l)
    {
        m_name_index = i;
        m_attribute_length = l;
    }

    public static Attribute_info new_Attribute_info(IConstantCollection iconstantcollection, UDataInputStream udatainputstream)
        throws IOException
    {
        int i = udatainputstream.readU2();
        long l = udatainputstream.readU4();
        String s = ((CONSTANT_Utf8_info)iconstantcollection.get(i)).m_value;
        if ("Code".equals(s))
        {
            return new CodeAttribute_info(iconstantcollection, i, l, udatainputstream);
        }
        if ("ConstantValue".equals(s))
        {
            return new ConstantValueAttribute_info(i, l, udatainputstream);
        }
        if ("Exceptions".equals(s))
        {
            return new ExceptionsAttribute_info(i, l, udatainputstream);
        }
        if ("InnerClasses".equals(s))
        {
            return new InnerClassesAttribute_info(i, l, udatainputstream);
        }
        if ("Synthetic".equals(s))
        {
            return new SyntheticAttribute_info(i, l);
        }
        if ("Bridge".equals(s))
        {
            return new BridgeAttribute_info(i, l);
        }
        if ("LineNumberTable".equals(s))
        {
            return new LineNumberTableAttribute_info(i, l, udatainputstream);
        }
        if ("SourceFile".equals(s))
        {
            return new SourceFileAttribute_info(i, l, udatainputstream);
        } else
        {
            return new GenericAttribute_info(i, l, udatainputstream);
        }
    }

    public abstract void accept(IAttributeVisitor iattributevisitor, Object obj);

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return obj;
    }

    public String getName(ClassDef classdef)
    {
        return ((CONSTANT_Utf8_info)classdef.getConstants().get(m_name_index)).m_value;
    }

    public abstract long length();

    public abstract String toString();

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_name_index);
        udataoutputstream.writeU4(length() - 6L);
    }
}
