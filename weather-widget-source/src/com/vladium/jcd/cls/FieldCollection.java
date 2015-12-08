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
//            IFieldCollection, IClassDefVisitor, Field_info, ClassDef

final class FieldCollection
    implements IFieldCollection
{

    private List m_fields;

    FieldCollection(int i)
    {
        ArrayList arraylist;
        if (i < 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = new ArrayList(i);
        }
        m_fields = arraylist;
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int add(Field_info field_info)
    {
        int i = m_fields.size();
        m_fields.add(field_info);
        return i;
    }

    public Object clone()
    {
        Object obj;
        int i;
        int j;
        try
        {
            obj = (FieldCollection)super.clone();
            j = m_fields.size();
            obj.m_fields = new ArrayList(j);
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
        ((FieldCollection) (obj)).m_fields.add(((Field_info)m_fields.get(i)).clone());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        return obj;
    }

    public Field_info get(int i)
    {
        return (Field_info)m_fields.get(i);
    }

    public int[] get(ClassDef classdef, String s)
    {
        if (classdef == null)
        {
            throw new IllegalArgumentException("null input: cls");
        }
        int j = m_fields.size();
        IntVector intvector = new IntVector(j);
        for (int i = 0; i < j; i++)
        {
            if (((Field_info)m_fields.get(i)).getName(classdef).equals(s))
            {
                intvector.add(i);
            }
        }

        return intvector.values();
    }

    public Field_info set(int i, Field_info field_info)
    {
        return (Field_info)m_fields.set(i, field_info);
    }

    public int size()
    {
        return m_fields.size();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        int j = m_fields.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            get(i).writeInClassFormat(udataoutputstream);
        }

    }
}
