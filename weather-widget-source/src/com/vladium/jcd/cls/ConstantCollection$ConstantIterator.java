// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.constant.CONSTANT_info;
import java.util.List;

// Referenced classes of package com.vladium.jcd.cls:
//            ConstantCollection

private static final class shift
    implements r
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

    r(List list)
    {
        m_constants = list;
        m_next_index = 1;
        shift();
    }
}
