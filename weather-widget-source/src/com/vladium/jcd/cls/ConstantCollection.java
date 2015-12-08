// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.constant.CONSTANT_Utf8_info;
import com.vladium.jcd.cls.constant.CONSTANT_info;
import com.vladium.jcd.lib.UDataOutputStream;
import com.vladium.util.ObjectIntMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls:
//            IConstantCollection, IClassDefVisitor

final class ConstantCollection
    implements IConstantCollection
{
    private static final class ConstantIterator
        implements IConstantCollection.IConstantIterator
    {

        private List m_constants;
        private int m_index;
        private int m_next_index;
        private int m_prev_index;

        private void shift()
        {
            m_prev_index = m_index;
            m_index = m_next_index;
            if (m_index <= 0)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            CONSTANT_info constant_info = (CONSTANT_info)m_constants.get(m_index - 1);
            m_next_index = m_next_index + constant_info.width();
            if (m_next_index > m_constants.size())
            {
                m_next_index = -1;
            }
            return;
            IndexOutOfBoundsException indexoutofboundsexception;
            indexoutofboundsexception;
            m_next_index = -1;
            m_index = -1;
            return;
        }

        public CONSTANT_info nextConstant()
        {
            int i = nextIndex();
            if (i < 0)
            {
                return null;
            } else
            {
                return (CONSTANT_info)m_constants.get(i - 1);
            }
        }

        public int nextIndex()
        {
            int i = m_index;
            shift();
            return i;
        }

        public CONSTANT_info set(CONSTANT_info constant_info)
        {
            int i = m_prev_index - 1;
            CONSTANT_info constant_info1 = (CONSTANT_info)m_constants.get(i);
            if (constant_info1 == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("assertion failure: dereferencing an invalid constant pool slot ").append(m_prev_index).toString());
            }
            if (constant_info1.width() != constant_info.width())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("assertion failure: can't set entry of type [").append(constant_info1.getClass().getName()).append("] to an entry of type [").append(constant_info1.getClass().getName()).append("] at pool slot ").append(m_prev_index).toString());
            } else
            {
                m_constants.set(i, constant_info);
                return constant_info1;
            }
        }

        ConstantIterator(List list)
        {
            m_constants = list;
            m_next_index = 1;
            shift();
        }
    }


    private transient ObjectIntMap m_CONSTANT_Utf8_index;
    private List m_constants;
    private int m_size;

    ConstantCollection(int i)
    {
        ArrayList arraylist;
        if (i < 0)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = new ArrayList(i);
        }
        m_constants = arraylist;
    }

    private ObjectIntMap getCONSTANT_Utf8_index()
    {
        if (m_CONSTANT_Utf8_index == null)
        {
            ObjectIntMap objectintmap = new ObjectIntMap(m_size);
            for (int i = 0; i < m_constants.size(); i++)
            {
                CONSTANT_info constant_info = (CONSTANT_info)m_constants.get(i);
                if (constant_info != null && constant_info.tag() == 1)
                {
                    objectintmap.put(((CONSTANT_Utf8_info)constant_info).m_value, i);
                }
            }

            m_CONSTANT_Utf8_index = objectintmap;
        }
        return m_CONSTANT_Utf8_index;
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int add(CONSTANT_info constant_info)
    {
        m_constants.add(constant_info);
        m_size = m_size + 1;
        int j = m_constants.size();
        for (int i = 1; i < constant_info.width(); i++)
        {
            m_size = m_size + 1;
            m_constants.add(null);
        }

        if (m_CONSTANT_Utf8_index != null && (constant_info instanceof CONSTANT_Utf8_info))
        {
            m_CONSTANT_Utf8_index.put(((CONSTANT_Utf8_info)constant_info).m_value, j - 1);
        }
        return j;
    }

    public Object clone()
    {
        ConstantCollection constantcollection;
        Object obj;
        List list;
        int i;
        int j;
        try
        {
            constantcollection = (ConstantCollection)super.clone();
            j = m_constants.size();
            constantcollection.m_constants = new ArrayList(j);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = (CONSTANT_info)m_constants.get(i);
        list = constantcollection.m_constants;
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L5:
        list.add(obj);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((CONSTANT_info) (obj)).clone();
        if (true) goto _L5; else goto _L2
_L2:
        return constantcollection;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int find(int i, IConstantCollection.IConstantComparator iconstantcomparator)
    {
        if (iconstantcomparator == null)
        {
            throw new IllegalArgumentException("null input: comparator");
        }
        for (int j = 0; j < m_constants.size(); j++)
        {
            CONSTANT_info constant_info = (CONSTANT_info)m_constants.get(j);
            if (constant_info != null && constant_info.tag() == i && iconstantcomparator.equals(constant_info))
            {
                return j + 1;
            }
        }

        return -1;
    }

    public int findCONSTANT_Utf8(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: value");
        }
        ObjectIntMap objectintmap = getCONSTANT_Utf8_index();
        int ai[] = new int[1];
        if (objectintmap.get(s, ai))
        {
            return ai[0] + 1;
        } else
        {
            return -1;
        }
    }

    public CONSTANT_info get(int i)
    {
        Object obj = m_constants.get(i - 1);
        if (obj == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("assertion failure: dereferencing an invalid constant pool slot ").append(i).toString());
        } else
        {
            return (CONSTANT_info)obj;
        }
    }

    public IConstantCollection.IConstantIterator iterator()
    {
        return new ConstantIterator(m_constants);
    }

    public CONSTANT_info set(int i, CONSTANT_info constant_info)
    {
        int j = i - 1;
        CONSTANT_info constant_info1 = (CONSTANT_info)m_constants.get(j);
        if (constant_info1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("assertion failure: dereferencing an invalid constant pool slot ").append(i).toString());
        }
        if (constant_info1.width() != constant_info.width())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("assertion failure: can't set entry of type [").append(constant_info1.getClass().getName()).append("] to an entry of type [").append(constant_info1.getClass().getName()).append("] at pool slot ").append(i).toString());
        }
        m_constants.set(j, constant_info);
        if (m_CONSTANT_Utf8_index != null)
        {
            if (constant_info1 instanceof CONSTANT_Utf8_info)
            {
                String s = ((CONSTANT_Utf8_info)constant_info1).m_value;
                int ai[] = new int[1];
                if (m_CONSTANT_Utf8_index.get(s, ai) && ai[0] == j)
                {
                    m_CONSTANT_Utf8_index.remove(s);
                }
            }
            if (constant_info instanceof CONSTANT_Utf8_info)
            {
                m_CONSTANT_Utf8_index.put(((CONSTANT_Utf8_info)constant_info).m_value, j);
            }
        }
        return constant_info1;
    }

    public int size()
    {
        return m_size;
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        udataoutputstream.writeU2(m_constants.size() + 1);
        ConstantIterator constantiterator = new ConstantIterator(m_constants);
        do
        {
            CONSTANT_info constant_info = constantiterator.nextConstant();
            if (constant_info != null)
            {
                constant_info.writeInClassFormat(udataoutputstream);
            } else
            {
                return;
            }
        } while (true);
    }
}
