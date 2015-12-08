// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            IConstants

public final class IntSet
{
    private static final class Entry
    {

        final int m_key;
        Entry m_next;

        Entry(int i, Entry entry)
        {
            m_key = i;
            m_next = entry;
        }
    }


    private static final String EOL = System.getProperty("line.separator", "\n");
    private Entry m_buckets[];
    private final float m_loadFactor;
    private int m_size;
    private int m_sizeThreshold;

    public IntSet()
    {
        this(11, 0.75F);
    }

    public IntSet(int i)
    {
        this(i, 0.75F);
    }

    public IntSet(int i, float f)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("negative input: initialCapacity [").append(i).append("]").toString());
        }
        if ((double)f <= 0.0D || (double)f >= 1.0000009999999999D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("loadFactor not in (0.0, 1.0] range: ").append(f).toString());
        }
        int j = i;
        if (i == 0)
        {
            j = 1;
        }
        float f1;
        if ((double)f > 1.0D)
        {
            f1 = 1.0F;
        } else
        {
            f1 = f;
        }
        m_loadFactor = f1;
        m_sizeThreshold = (int)((float)j * f);
        m_buckets = new Entry[j];
    }

    private void rehash()
    {
        Entry aentry[] = m_buckets;
        int j = (m_buckets.length << 1) + 1;
        Entry aentry1[] = new Entry[j];
        for (int i = 0; i < aentry.length; i++)
        {
            Entry entry1;
            for (Entry entry = aentry[i]; entry != null; entry = entry1)
            {
                entry1 = entry.m_next;
                int k = (0x7fffffff & entry.m_key) % j;
                entry.m_next = aentry1[k];
                aentry1[k] = entry;
            }

        }

        m_sizeThreshold = (int)((float)j * m_loadFactor);
        m_buckets = aentry1;
    }

    public boolean add(int i)
    {
        Object obj2 = null;
        int j = m_buckets.length;
        Object obj = m_buckets[(i & 0x7fffffff) % j];
        do
        {
label0:
            {
                Object obj1 = obj2;
                if (obj != null)
                {
                    if (i != ((Entry) (obj)).m_key)
                    {
                        break label0;
                    }
                    obj1 = obj;
                }
                if (obj1 == null)
                {
                    if (m_size >= m_sizeThreshold)
                    {
                        rehash();
                    }
                    obj = m_buckets;
                    int k = (i & 0x7fffffff) % obj.length;
                    obj[k] = new Entry(i, obj[k]);
                    m_size = m_size + 1;
                    return true;
                } else
                {
                    return false;
                }
            }
            obj = ((Entry) (obj)).m_next;
        } while (true);
    }

    public boolean contains(int i)
    {
        Entry aentry[] = m_buckets;
        for (Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.m_next)
        {
            if (i == entry.m_key)
            {
                return true;
            }
        }

        return false;
    }

    void debugDump(StringBuffer stringbuffer)
    {
        if (stringbuffer != null)
        {
            stringbuffer.append(super.toString());
            stringbuffer.append(EOL);
            stringbuffer.append((new StringBuilder()).append("size = ").append(m_size).append(", bucket table size = ").append(m_buckets.length).append(", load factor = ").append(m_loadFactor).append(EOL).toString());
            stringbuffer.append((new StringBuilder()).append("size threshold = ").append(m_sizeThreshold).append(EOL).toString());
        }
    }

    public int size()
    {
        return m_size;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        debugDump(stringbuffer);
        return stringbuffer.toString();
    }

    public void values(int ai[], int i)
    {
        if (m_size != 0)
        {
            for (int j = 0; j < m_buckets.length; j++)
            {
                for (Entry entry = m_buckets[j]; entry != null;)
                {
                    ai[i] = entry.m_key;
                    entry = entry.m_next;
                    i++;
                }

            }

        }
    }

    public int[] values()
    {
        if (m_size != 0) goto _L2; else goto _L1
_L1:
        int ai[] = IConstants.EMPTY_INT_ARRAY;
_L4:
        return ai;
_L2:
        int ai1[] = new int[m_size];
        int i = 0;
        int j = 0;
        do
        {
            ai = ai1;
            if (j >= m_buckets.length)
            {
                continue;
            }
            for (Entry entry = m_buckets[j]; entry != null;)
            {
                ai1[i] = entry.m_key;
                entry = entry.m_next;
                i++;
            }

            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
