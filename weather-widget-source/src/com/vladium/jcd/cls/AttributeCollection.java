// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.attribute.Attribute_info;
import com.vladium.jcd.cls.attribute.BridgeAttribute_info;
import com.vladium.jcd.cls.attribute.InnerClassesAttribute_info;
import com.vladium.jcd.cls.attribute.SyntheticAttribute_info;
import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls:
//            IAttributeCollection, IClassDefVisitor

final class AttributeCollection
    implements IAttributeCollection
{

    private static final boolean DISALLOW_MULTIPLE_SYNTHETIC_ATTRIBUTES = false;
    private List m_attributes;
    private transient int m_bridgeRefCount;
    private transient int m_innerClassesAttributeOffset;
    private transient int m_syntheticRefCount;

    AttributeCollection(int i)
    {
        ArrayList arraylist;
        if (i < 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = new ArrayList(i);
        }
        m_attributes = arraylist;
        m_innerClassesAttributeOffset = -1;
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int add(Attribute_info attribute_info)
    {
        List list = m_attributes;
        int i = list.size();
        list.add(attribute_info);
        if (attribute_info instanceof SyntheticAttribute_info)
        {
            m_syntheticRefCount = m_syntheticRefCount + 1;
        } else
        {
            if (attribute_info instanceof InnerClassesAttribute_info)
            {
                if (m_innerClassesAttributeOffset >= 0)
                {
                    throw new IllegalArgumentException("this attribute collection already has an InnerClasses attribute");
                } else
                {
                    m_innerClassesAttributeOffset = i;
                    return i;
                }
            }
            if (attribute_info instanceof BridgeAttribute_info)
            {
                m_bridgeRefCount = m_bridgeRefCount + 1;
                return i;
            }
        }
        return i;
    }

    public Object clone()
    {
        Object obj;
        int i;
        int j;
        try
        {
            obj = (AttributeCollection)super.clone();
            j = m_attributes.size();
            obj.m_attributes = new ArrayList(j);
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
        ((AttributeCollection) (obj)).m_attributes.add(((Attribute_info)m_attributes.get(i)).clone());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        return obj;
    }

    public final Attribute_info get(int i)
    {
        return (Attribute_info)m_attributes.get(i);
    }

    public final InnerClassesAttribute_info getInnerClassesAttribute()
    {
        int i = m_innerClassesAttributeOffset;
        if (i < 0)
        {
            return null;
        } else
        {
            return (InnerClassesAttribute_info)get(i);
        }
    }

    public final boolean hasBridge()
    {
        return m_bridgeRefCount > 0;
    }

    public final boolean hasSynthetic()
    {
        return m_syntheticRefCount > 0;
    }

    public final long length()
    {
        long l = 2L;
        int j = m_attributes.size();
        for (int i = 0; i < j; i++)
        {
            l += get(i).length();
        }

        return l;
    }

    public Attribute_info remove(int i)
    {
        Attribute_info attribute_info = (Attribute_info)m_attributes.remove(i);
        if (attribute_info instanceof SyntheticAttribute_info)
        {
            m_syntheticRefCount = m_syntheticRefCount - 1;
        } else
        {
            if (attribute_info instanceof InnerClassesAttribute_info)
            {
                m_innerClassesAttributeOffset = -1;
                return attribute_info;
            }
            if (attribute_info instanceof BridgeAttribute_info)
            {
                m_bridgeRefCount = m_bridgeRefCount - 1;
                return attribute_info;
            }
        }
        return attribute_info;
    }

    public Attribute_info set(int i, Attribute_info attribute_info)
    {
        Attribute_info attribute_info1 = (Attribute_info)m_attributes.set(i, attribute_info);
        if (!(attribute_info1 instanceof SyntheticAttribute_info)) goto _L2; else goto _L1
_L1:
        m_syntheticRefCount = m_syntheticRefCount - 1;
_L8:
        if (!(attribute_info instanceof SyntheticAttribute_info)) goto _L4; else goto _L3
_L3:
        m_syntheticRefCount = m_syntheticRefCount + 1;
_L6:
        return attribute_info1;
_L2:
        if (attribute_info1 instanceof InnerClassesAttribute_info)
        {
            m_innerClassesAttributeOffset = -1;
        } else
        if (attribute_info1 instanceof BridgeAttribute_info)
        {
            m_bridgeRefCount = m_bridgeRefCount - 1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (attribute_info instanceof InnerClassesAttribute_info)
        {
            m_innerClassesAttributeOffset = i;
            return attribute_info1;
        }
        if (!(attribute_info instanceof BridgeAttribute_info)) goto _L6; else goto _L5
_L5:
        m_bridgeRefCount = m_bridgeRefCount + 1;
        return attribute_info1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int size()
    {
        return m_attributes.size();
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        int j = size();
        udataoutputstream.writeU2(j);
        for (int i = 0; i < j; i++)
        {
            get(i).writeInClassFormat(udataoutputstream);
        }

    }
}
