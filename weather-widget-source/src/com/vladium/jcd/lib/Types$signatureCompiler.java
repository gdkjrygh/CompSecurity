// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;


// Referenced classes of package com.vladium.jcd.lib:
//            Types

private static final class <init>
{

    private StringBuffer m_desc;

    private void emit(char c)
    {
        m_desc.append(c);
    }

    private void emit(String s)
    {
        m_desc.append(s);
    }

    private void parameterType(Class class1)
    {
        if (class1 == null) goto _L2; else goto _L1
_L1:
        if (!class1.isPrimitive())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (Byte.TYPE != class1) goto _L4; else goto _L3
_L3:
        emit('B');
_L2:
        return;
_L4:
        if (Character.TYPE == class1)
        {
            emit('C');
            return;
        }
        if (Double.TYPE == class1)
        {
            emit('D');
            return;
        }
        if (Float.TYPE == class1)
        {
            emit('F');
            return;
        }
        if (Integer.TYPE == class1)
        {
            emit('I');
            return;
        }
        if (Long.TYPE == class1)
        {
            emit('J');
            return;
        }
        if (Short.TYPE == class1)
        {
            emit('S');
            return;
        }
        if (Boolean.TYPE != class1) goto _L2; else goto _L5
_L5:
        emit('Z');
        return;
        if (class1.isArray())
        {
            emit('[');
            parameterType(class1.getComponentType());
            return;
        } else
        {
            emit('L');
            emit(Types.javaNameToVMName(class1.getName()));
            emit(';');
            return;
        }
    }

    private void parameterTypes(Class aclass[])
    {
        if (aclass != null)
        {
            for (int i = 0; i < aclass.length; i++)
            {
                parameterType(aclass[i]);
            }

        }
    }

    private void returnType(Class class1)
    {
        if (class1 == null || class1 == Void.TYPE)
        {
            emit('V');
            return;
        } else
        {
            parameterType(class1);
            return;
        }
    }

    String signatureDescriptor(Class aclass[], Class class1)
    {
        emit('(');
        parameterTypes(aclass);
        emit(')');
        returnType(class1);
        return m_desc.toString();
    }

    String typeDescriptor(Class class1)
    {
        parameterType(class1);
        return m_desc.toString();
    }

    private ()
    {
        m_desc = new StringBuffer();
    }

    m_desc(m_desc m_desc1)
    {
        this();
    }
}
