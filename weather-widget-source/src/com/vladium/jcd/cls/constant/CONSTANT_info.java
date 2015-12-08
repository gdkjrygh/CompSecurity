// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;

import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_Utf8_info, CONSTANT_Integer_info, CONSTANT_Float_info, CONSTANT_Long_info, 
//            CONSTANT_Double_info, CONSTANT_Class_info, CONSTANT_String_info, CONSTANT_Fieldref_info, 
//            CONSTANT_Methodref_info, CONSTANT_InterfaceMethodref_info, CONSTANT_NameAndType_info, ICONSTANTVisitor

public abstract class CONSTANT_info
    implements Cloneable, IClassFormatOutput
{

    protected CONSTANT_info()
    {
    }

    public static CONSTANT_info new_CONSTANT_info(UDataInputStream udatainputstream)
        throws IOException
    {
        byte byte0 = udatainputstream.readByte();
        switch (byte0)
        {
        case 2: // '\002'
        default:
            throw new IllegalStateException((new StringBuilder()).append("CONSTANT_info: invalid tag value [").append(byte0).append(']').toString());

        case 1: // '\001'
            return new CONSTANT_Utf8_info(udatainputstream);

        case 3: // '\003'
            return new CONSTANT_Integer_info(udatainputstream);

        case 4: // '\004'
            return new CONSTANT_Float_info(udatainputstream);

        case 5: // '\005'
            return new CONSTANT_Long_info(udatainputstream);

        case 6: // '\006'
            return new CONSTANT_Double_info(udatainputstream);

        case 7: // '\007'
            return new CONSTANT_Class_info(udatainputstream);

        case 8: // '\b'
            return new CONSTANT_String_info(udatainputstream);

        case 9: // '\t'
            return new CONSTANT_Fieldref_info(udatainputstream);

        case 10: // '\n'
            return new CONSTANT_Methodref_info(udatainputstream);

        case 11: // '\013'
            return new CONSTANT_InterfaceMethodref_info(udatainputstream);

        case 12: // '\f'
            return new CONSTANT_NameAndType_info(udatainputstream);
        }
    }

    public static String tagToString(CONSTANT_info constant_info)
    {
        switch (constant_info.tag())
        {
        case 2: // '\002'
        default:
            throw new IllegalStateException((new StringBuilder()).append("CONSTANT_info: invalid tag value [").append(constant_info.tag()).append(']').toString());

        case 1: // '\001'
            return "CONSTANT_Utf8";

        case 3: // '\003'
            return "CONSTANT_Integer";

        case 4: // '\004'
            return "CONSTANT_Float";

        case 5: // '\005'
            return "CONSTANT_Long";

        case 6: // '\006'
            return "CONSTANT_Double";

        case 7: // '\007'
            return "CONSTANT_Class";

        case 8: // '\b'
            return "CONSTANT_String";

        case 9: // '\t'
            return "CONSTANT_Fieldref";

        case 10: // '\n'
            return "CONSTANT_Methodref";

        case 11: // '\013'
            return "CONSTANT_InterfaceMethodref";

        case 12: // '\f'
            return "CONSTANT_NameAndType";
        }
    }

    public abstract Object accept(ICONSTANTVisitor iconstantvisitor, Object obj);

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

    public abstract byte tag();

    public abstract String toString();

    public int width()
    {
        return 1;
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeByte(tag());
    }
}
