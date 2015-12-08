// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;


// Referenced classes of package com.vladium.jcd.cls.attribute:
//            BridgeAttribute_info, CodeAttribute_info, ConstantValueAttribute_info, ExceptionsAttribute_info, 
//            GenericAttribute_info, InnerClassesAttribute_info, LineNumberTableAttribute_info, SourceFileAttribute_info, 
//            SyntheticAttribute_info

public interface IAttributeVisitor
{

    public abstract Object visit(BridgeAttribute_info bridgeattribute_info, Object obj);

    public abstract Object visit(CodeAttribute_info codeattribute_info, Object obj);

    public abstract Object visit(ConstantValueAttribute_info constantvalueattribute_info, Object obj);

    public abstract Object visit(ExceptionsAttribute_info exceptionsattribute_info, Object obj);

    public abstract Object visit(GenericAttribute_info genericattribute_info, Object obj);

    public abstract Object visit(InnerClassesAttribute_info innerclassesattribute_info, Object obj);

    public abstract Object visit(LineNumberTableAttribute_info linenumbertableattribute_info, Object obj);

    public abstract Object visit(SourceFileAttribute_info sourcefileattribute_info, Object obj);

    public abstract Object visit(SyntheticAttribute_info syntheticattribute_info, Object obj);
}
