// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.constant;


// Referenced classes of package com.vladium.jcd.cls.constant:
//            CONSTANT_Class_info, CONSTANT_Double_info, CONSTANT_Fieldref_info, CONSTANT_Float_info, 
//            CONSTANT_Integer_info, CONSTANT_InterfaceMethodref_info, CONSTANT_Long_info, CONSTANT_Methodref_info, 
//            CONSTANT_NameAndType_info, CONSTANT_String_info, CONSTANT_Utf8_info

public interface ICONSTANTVisitor
{

    public abstract Object visit(CONSTANT_Class_info constant_class_info, Object obj);

    public abstract Object visit(CONSTANT_Double_info constant_double_info, Object obj);

    public abstract Object visit(CONSTANT_Fieldref_info constant_fieldref_info, Object obj);

    public abstract Object visit(CONSTANT_Float_info constant_float_info, Object obj);

    public abstract Object visit(CONSTANT_Integer_info constant_integer_info, Object obj);

    public abstract Object visit(CONSTANT_InterfaceMethodref_info constant_interfacemethodref_info, Object obj);

    public abstract Object visit(CONSTANT_Long_info constant_long_info, Object obj);

    public abstract Object visit(CONSTANT_Methodref_info constant_methodref_info, Object obj);

    public abstract Object visit(CONSTANT_NameAndType_info constant_nameandtype_info, Object obj);

    public abstract Object visit(CONSTANT_String_info constant_string_info, Object obj);

    public abstract Object visit(CONSTANT_Utf8_info constant_utf8_info, Object obj);
}
