// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Field;
import org.aspectj.lang.reflect.FieldSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            MemberSignatureImpl, SignatureImpl, StringMaker

public class FieldSignatureImpl extends MemberSignatureImpl
    implements FieldSignature
{

    private Field field;
    Class fieldType;

    FieldSignatureImpl(int i, String s, Class class1, Class class2)
    {
        super(i, s, class1);
        fieldType = class2;
    }

    FieldSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(stringmaker.makeModifiersString(getModifiers()));
        if (stringmaker.includeArgs)
        {
            stringbuffer.append(stringmaker.makeTypeName(getFieldType()));
        }
        if (stringmaker.includeArgs)
        {
            stringbuffer.append(" ");
        }
        stringbuffer.append(stringmaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringbuffer.append(".");
        stringbuffer.append(getName());
        return stringbuffer.toString();
    }

    public Field getField()
    {
        if (field == null)
        {
            try
            {
                field = getDeclaringType().getDeclaredField(getName());
            }
            catch (Exception exception) { }
        }
        return field;
    }

    public Class getFieldType()
    {
        if (fieldType == null)
        {
            fieldType = extractType(3);
        }
        return fieldType;
    }
}
