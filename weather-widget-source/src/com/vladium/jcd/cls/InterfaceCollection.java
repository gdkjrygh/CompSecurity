// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.lib.UDataOutputStream;
import com.vladium.util.IntVector;
import java.io.IOException;

// Referenced classes of package com.vladium.jcd.cls:
//            IInterfaceCollection, IClassDefVisitor

final class InterfaceCollection
    implements IInterfaceCollection
{

    private IntVector m_interfaces;

    InterfaceCollection(int i)
    {
        IntVector intvector;
        if (i < 0)
        {
            intvector = new IntVector();
        } else
        {
            intvector = new IntVector(i);
        }
        m_interfaces = intvector;
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int add(int i)
    {
        int j = m_interfaces.size();
        m_interfaces.add(i);
        return j;
    }

    public Object clone()
    {
        InterfaceCollection interfacecollection;
        try
        {
            interfacecollection = (InterfaceCollection)super.clone();
            interfacecollection.m_interfaces = (IntVector)m_interfaces.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return interfacecollection;
    }

    public int get(int i)
    {
        return m_interfaces.get(i);
    }

    public int set(int i, int j)
    {
        return m_interfaces.set(i, j);
    }

    public int size()
    {
        return m_interfaces.size();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        int j = m_interfaces.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            udataoutputstream.writeU2(get(i));
        }

    }
}
