// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.Serializable;

// Referenced classes of package com.vladium.util:
//            IConstants

public final class IntObjectMap
    implements Serializable
{
    private static final class Entry
        implements Serializable
    {

        final int m_key;
        Entry m_next;
        Object m_value;

        Entry(int i, Object obj, Entry entry)
        {
            m_key = i;
            m_value = obj;
            m_next = entry;
        }
    }


    private static final String EOL = System.getProperty("line.separator", "\n");
    private Entry m_buckets[];
    private final float m_loadFactor;
    private int m_size;
    private int m_sizeThreshold;

    public IntObjectMap()
    {
        this(11, 0.75F);
    }

    public IntObjectMap(int i)
    {
        this(i, 0.75F);
    }

    public IntObjectMap(int i, float f)
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

    public Object get(int i)
    {
        Entry aentry[] = m_buckets;
        for (Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.m_next)
        {
            if (i == entry.m_key)
            {
                return entry.m_value;
            }
        }

        return null;
    }

    public int[] keys()
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

    public Object put(int i, Object obj)
    {
        Object obj3 = null;
        int j = m_buckets.length;
        Object obj1 = m_buckets[(i & 0x7fffffff) % j];
label0:
        do
        {
label1:
            {
                Object obj2 = obj3;
                if (obj1 != null)
                {
                    if (i != ((Entry) (obj1)).m_key)
                    {
                        break label1;
                    }
                    obj2 = obj1;
                }
                if (obj2 != null)
                {
                    obj1 = ((Entry) (obj2)).m_value;
                    obj2.m_value = obj;
                    return obj1;
                }
                break label0;
            }
            obj1 = ((Entry) (obj1)).m_next;
        } while (true);
        if (m_size >= m_sizeThreshold)
        {
            rehash();
        }
        Entry aentry[] = m_buckets;
        j = (i & 0x7fffffff) % aentry.length;
        aentry[j] = new Entry(i, obj, aentry[j]);
        m_size = m_size + 1;
        return null;
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
