// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            IConstants

public final class IntVector
    implements Cloneable
{

    private static final int COPY_THRESHOLD = 10;
    private int m_size;
    private int m_values[];

    public IntVector()
    {
        this(5);
    }

    public IntVector(int i)
    {
        m_values = new int[i];
    }

    public void add(int i)
    {
        int l = m_values.length;
        if (l == m_size)
        {
            int ai[] = new int[(l << 1) + 1];
            if (l < 10)
            {
                for (int j = 0; j < l; j++)
                {
                    ai[j] = m_values[j];
                }

            } else
            {
                System.arraycopy(m_values, 0, ai, 0, l);
            }
            m_values = ai;
        }
        int ai1[] = m_values;
        int k = m_size;
        m_size = k + 1;
        ai1[k] = i;
    }

    public Object clone()
    {
        IntVector intvector;
        int ai[];
        intvector = (IntVector)super.clone();
        if (m_size >= 10)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        intvector.m_values = new int[m_values.length];
        ai = intvector.m_values;
        int i = 0;
        do
        {
            try
            {
                if (i >= m_size)
                {
                    break;
                }
                ai[i] = m_values[i];
            }
            catch (CloneNotSupportedException clonenotsupportedexception)
            {
                throw new InternalError(clonenotsupportedexception.toString());
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_76;
        intvector.m_values = (int[])(int[])m_values.clone();
        return intvector;
    }

    public int get(int i)
    {
        if (i > m_size - 1)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("get[").append(i).append("] on vector of size ").append(m_size).toString());
        } else
        {
            return m_values[i];
        }
    }

    public int set(int i, int j)
    {
        if (i > m_size - 1)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("get[").append(i).append("] on vector of size ").append(m_size).toString());
        } else
        {
            int k = m_values[i];
            m_values[i] = j;
            return k;
        }
    }

    public int size()
    {
        return m_size;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append(super.toString()).append(", size ").append(m_size).append(": ").toString());
        for (int i = 0; i < m_size; i++)
        {
            if (i > 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(m_values[i]);
        }

        return stringbuffer.toString();
    }

    public int[] values()
    {
        if (m_size != 0) goto _L2; else goto _L1
_L1:
        int ai[] = IConstants.EMPTY_INT_ARRAY;
_L4:
        return ai;
_L2:
        int ai1[];
        int j;
label0:
        {
            j = m_size;
            ai1 = new int[j];
            if (j >= 10)
            {
                break label0;
            }
            int i = 0;
            do
            {
                ai = ai1;
                if (i >= j)
                {
                    break;
                }
                ai1[i] = m_values[i];
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        System.arraycopy(m_values, 0, ai1, 0, j);
        return ai1;
    }
}
