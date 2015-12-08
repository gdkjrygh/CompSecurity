// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataOutputStream;
import com.vladium.util.IntVector;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            IDeclaredExceptionTable

final class DeclaredExceptionTable
    implements IDeclaredExceptionTable
{

    private IntVector m_exceptions;

    DeclaredExceptionTable(int i)
    {
        IntVector intvector;
        if (i < 0)
        {
            intvector = new IntVector();
        } else
        {
            intvector = new IntVector(i);
        }
        m_exceptions = intvector;
    }

    public int add(int i)
    {
        int j = m_exceptions.size();
        m_exceptions.add(i);
        return j;
    }

    public Object clone()
    {
        DeclaredExceptionTable declaredexceptiontable;
        try
        {
            declaredexceptiontable = (DeclaredExceptionTable)super.clone();
            declaredexceptiontable.m_exceptions = (IntVector)m_exceptions.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return declaredexceptiontable;
    }

    public int get(int i)
    {
        return m_exceptions.get(i);
    }

    public long length()
    {
        return (long)(m_exceptions.size() + 1 << 1);
    }

    public int set(int i, int j)
    {
        return m_exceptions.set(i, j);
    }

    public int size()
    {
        return m_exceptions.size();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        int j = m_exceptions.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            udataoutputstream.writeU2(get(i));
        }

    }
}
