// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            IExceptionHandlerTable, Exception_info

final class ExceptionHandlerTable
    implements IExceptionHandlerTable
{

    private List m_exceptions;

    ExceptionHandlerTable(int i)
    {
        ArrayList arraylist;
        if (i < 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = new ArrayList(i);
        }
        m_exceptions = arraylist;
    }

    public int add(Exception_info exception_info)
    {
        int i = m_exceptions.size();
        m_exceptions.add(exception_info);
        return i;
    }

    public Object clone()
    {
        Object obj;
        int i;
        int j;
        try
        {
            obj = (ExceptionHandlerTable)super.clone();
            j = m_exceptions.size();
            obj.m_exceptions = new ArrayList(j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new InternalError(((CloneNotSupportedException) (obj)).toString());
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ExceptionHandlerTable) (obj)).m_exceptions.add(((Exception_info)m_exceptions.get(i)).clone());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        return obj;
    }

    public Exception_info get(int i)
    {
        return (Exception_info)m_exceptions.get(i);
    }

    public long length()
    {
        return (long)((m_exceptions.size() << 3) + 2);
    }

    public Exception_info set(int i, Exception_info exception_info)
    {
        return (Exception_info)m_exceptions.set(i, exception_info);
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
            get(i).writeInClassFormat(udataoutputstream);
        }

    }
}
