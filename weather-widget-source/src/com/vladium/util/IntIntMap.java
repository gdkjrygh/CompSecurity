// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


public final class IntIntMap
{
    private static final class Entry
    {

        int m_key;
        Entry m_next;
        int m_value;

        Entry(int i, int j, Entry entry)
        {
            m_key = i;
            m_value = j;
            m_next = entry;
        }
    }


    private static final String EOL = System.getProperty("line.separator", "\n");
    private Entry m_buckets[];
    private final float m_loadFactor;
    private int m_size;
    private int m_sizeThreshold;

    public IntIntMap()
    {
        this(11, 0.75F);
    }

    public IntIntMap(int i)
    {
        this(i, 0.75F);
    }

    public IntIntMap(int i, float f)
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
                int k = (entry.m_key & 0x7fffffff) % j;
                entry.m_next = aentry1[k];
                aentry1[k] = entry;
            }

        }

        m_sizeThreshold = (int)((float)j * m_loadFactor);
        m_buckets = aentry1;
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

    public boolean get(int i, int ai[])
    {
        boolean flag1 = false;
        Entry aentry[] = m_buckets;
        Entry entry = aentry[(0x7fffffff & i) % aentry.length];
        do
        {
label0:
            {
                boolean flag = flag1;
                if (entry != null)
                {
                    if (i != entry.m_key)
                    {
                        break label0;
                    }
                    ai[0] = entry.m_value;
                    flag = true;
                }
                return flag;
            }
            entry = entry.m_next;
        } while (true);
    }

    public boolean get(int i, int ai[], int j)
    {
        Entry aentry[] = m_buckets;
        for (Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.m_next)
        {
            if (i == entry.m_key)
            {
                ai[j] = entry.m_value;
                return true;
            }
        }

        return false;
    }

    public int[] keys()
    {
        int ai[] = new int[m_size];
        int i = 0;
        for (int j = 0; j < m_buckets.length; j++)
        {
            for (Entry entry = m_buckets[j]; entry != null;)
            {
                ai[i] = entry.m_key;
                entry = entry.m_next;
                i++;
            }

        }

        return ai;
    }

    public void put(int i, int j)
    {
        Object obj = null;
        int k = m_buckets.length;
        Entry entry = m_buckets[(i & 0x7fffffff) % k];
label0:
        do
        {
label1:
            {
                Entry entry1 = obj;
                if (entry != null)
                {
                    if (i != entry.m_key)
                    {
                        break label1;
                    }
                    entry1 = entry;
                }
                if (entry1 != null)
                {
                    entry1.m_value = j;
                    return;
                }
                break label0;
            }
            entry = entry.m_next;
        } while (true);
        if (m_size >= m_sizeThreshold)
        {
            rehash();
        }
        Entry aentry[] = m_buckets;
        k = (i & 0x7fffffff) % aentry.length;
        aentry[k] = new Entry(i, j, aentry[k]);
        m_size = m_size + 1;
    }

    public void remove(int i)
    {
        int j = (0x7fffffff & i) % m_buckets.length;
        Entry aentry[] = m_buckets;
        Entry entry = aentry[j];
        Entry entry1 = entry;
        do
        {
            Entry entry2;
label0:
            {
                if (entry != null)
                {
                    entry2 = entry.m_next;
                    if (i != entry.m_key)
                    {
                        break label0;
                    }
                    if (entry1 == entry)
                    {
                        aentry[j] = entry2;
                    } else
                    {
                        entry1.m_next = entry2;
                    }
                    m_size = m_size - 1;
                }
                return;
            }
            entry1 = entry;
            entry = entry2;
        } while (true);
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

}
