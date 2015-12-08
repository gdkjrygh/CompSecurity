// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.lib.UDataOutputStream;
import com.vladium.util.IntVector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls:
//            IMethodCollection, IClassDefVisitor, Method_info, ClassDef

final class MethodCollection
    implements IMethodCollection
{

    private List m_methods;

    MethodCollection(int i)
    {
        ArrayList arraylist;
        if (i < 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = new ArrayList(i);
        }
        m_methods = arraylist;
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int add(Method_info method_info)
    {
        int i = m_methods.size();
        m_methods.add(method_info);
        return i;
    }

    public Object clone()
    {
        Object obj;
        int i;
        int j;
        try
        {
            obj = (MethodCollection)super.clone();
            j = m_methods.size();
            obj.m_methods = new ArrayList(j);
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
        ((MethodCollection) (obj)).m_methods.add(((Method_info)m_methods.get(i)).clone());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        return obj;
    }

    public Method_info get(int i)
    {
        return (Method_info)m_methods.get(i);
    }

    public int[] get(ClassDef classdef, String s)
    {
        if (classdef == null)
        {
            throw new IllegalArgumentException("null input: cls");
        }
        int j = m_methods.size();
        IntVector intvector = new IntVector(j);
        for (int i = 0; i < j; i++)
        {
            if (((Method_info)m_methods.get(i)).getName(classdef).equals(s))
            {
                intvector.add(i);
            }
        }

        return intvector.values();
    }

    public Method_info remove(int i)
    {
        return (Method_info)m_methods.remove(i);
    }

    public Method_info set(int i, Method_info method_info)
    {
        return (Method_info)m_methods.set(i, method_info);
    }

    public int size()
    {
        return m_methods.size();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        int j = m_methods.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            get(i).writeInClassFormat(udataoutputstream);
        }

    }
}
