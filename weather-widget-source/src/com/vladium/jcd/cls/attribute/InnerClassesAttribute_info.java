// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls.attribute:
//            Attribute_info, InnerClass_info, IAttributeVisitor

public final class InnerClassesAttribute_info extends Attribute_info
{

    private List m_classes;

    InnerClassesAttribute_info(int i, long l, UDataInputStream udatainputstream)
        throws IOException
    {
        super(i, l);
        int j = udatainputstream.readU2();
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            arraylist.add(new InnerClass_info(udatainputstream));
        }

        m_classes = arraylist;
    }

    public void accept(IAttributeVisitor iattributevisitor, Object obj)
    {
        iattributevisitor.visit(this, obj);
    }

    public Object clone()
    {
        InnerClassesAttribute_info innerclassesattribute_info = (InnerClassesAttribute_info)super.clone();
        List list = m_classes;
        int j = list.size();
        innerclassesattribute_info.m_classes = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            innerclassesattribute_info.m_classes.add(((InnerClass_info)list.get(i)).clone());
        }

        return innerclassesattribute_info;
    }

    public final InnerClass_info get(int i)
    {
        return (InnerClass_info)m_classes.get(i);
    }

    public final long length()
    {
        return (long)((m_classes.size() << 3) + 8);
    }

    public boolean makesClassNested(int i, int ai[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        j = 0;
        k = size();
_L7:
        flag = flag1;
        if (j >= k) goto _L2; else goto _L3
_L3:
        InnerClass_info innerclass_info = get(j);
        if (innerclass_info.m_inner_class_index != i) goto _L5; else goto _L4
_L4:
        ai[0] = innerclass_info.m_inner_access_flags;
        flag = true;
_L2:
        return flag;
_L5:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int size()
    {
        return m_classes.size();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append("InnerClassesAttribute_info: [attribute_name_index = ").append(m_name_index).append(", attribute_length = ").append(length()).append("]\n").toString());
        for (int i = 0; i < size(); i++)
        {
            stringbuffer.append((new StringBuilder()).append("            ").append(get(i)).toString());
            stringbuffer.append("\n");
        }

        return stringbuffer.toString();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        super.writeInClassFormat(udataoutputstream);
        List list = m_classes;
        int j = list.size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            ((InnerClass_info)list.get(i)).writeInClassFormat(udataoutputstream);
        }

    }
}
