// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class SoftValueMap
    implements Map
{
    static class IndexedSoftReference extends SoftReference
    {

        int m_bucketIndex;

        IndexedSoftReference(Object obj, ReferenceQueue referencequeue, int i)
        {
            super(obj, referencequeue);
            m_bucketIndex = i;
        }
    }

    static class SoftEntry
    {

        Object m_key;
        SoftEntry m_next;
        IndexedSoftReference m_softValue;

        SoftEntry(ReferenceQueue referencequeue, Object obj, Object obj1, SoftEntry softentry, int i)
        {
            m_key = obj;
            m_softValue = new IndexedSoftReference(obj1, referencequeue, i);
            m_next = softentry;
        }
    }


    private static final boolean DEBUG = false;
    private static final boolean ENQUEUE_FOUND_CLEARED_ENTRIES = true;
    private static final String EOL = System.getProperty("line.separator", "\n");
    private static final boolean IDENTITY_OPTIMIZATION = true;
    private SoftEntry m_buckets[];
    private final float m_loadFactor;
    private int m_readAccessCount;
    private final int m_readClearCheckFrequency;
    private int m_size;
    private int m_sizeThreshold;
    private final ReferenceQueue m_valueReferenceQueue;
    private int m_writeAccessCount;
    private final int m_writeClearCheckFrequency;

    public SoftValueMap()
    {
        this(1, 1);
    }

    public SoftValueMap(int i, float f, int j, int k)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("negative input: initialCapacity [").append(i).append("]").toString());
        }
        if ((double)f <= 0.0D || (double)f >= 1.0000009999999999D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("loadFactor not in (0.0, 1.0] range: ").append(f).toString());
        }
        if (j < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("readClearCheckFrequency not in [1, +inf) range: ").append(j).toString());
        }
        if (k < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("writeClearCheckFrequency not in [1, +inf) range: ").append(k).toString());
        }
        int l = i;
        if (i == 0)
        {
            l = 1;
        }
        m_valueReferenceQueue = new ReferenceQueue();
        m_loadFactor = f;
        m_sizeThreshold = (int)((float)l * f);
        m_readClearCheckFrequency = j;
        m_writeClearCheckFrequency = k;
        m_buckets = new SoftEntry[l];
    }

    public SoftValueMap(int i, int j)
    {
        this(11, 0.75F, i, j);
    }

    private void rehash()
    {
        SoftEntry asoftentry[] = m_buckets;
        int k = (m_buckets.length << 1) + 1;
        SoftEntry asoftentry1[] = new SoftEntry[k];
        int j = 0;
        int i = 0;
        for (int l = asoftentry.length; i < l; i++)
        {
            SoftEntry softentry = asoftentry[i];
            while (softentry != null) 
            {
                SoftEntry softentry1 = softentry.m_next;
                IndexedSoftReference indexedsoftreference = softentry.m_softValue;
                if (indexedsoftreference.get() != null)
                {
                    int i1 = (0x7fffffff & softentry.m_key.hashCode()) % k;
                    softentry.m_next = asoftentry1[i1];
                    asoftentry1[i1] = softentry;
                    indexedsoftreference.m_bucketIndex = i1;
                    j++;
                } else
                {
                    indexedsoftreference.m_bucketIndex = -1;
                }
                softentry = softentry1;
            }
        }

        m_size = j;
        m_sizeThreshold = (int)((float)k * m_loadFactor);
        m_buckets = asoftentry1;
    }

    private void removeClearedValues()
    {
label0:
        do
        {
            Reference reference = m_valueReferenceQueue.poll();
            if (reference != null)
            {
                int i = ((IndexedSoftReference)reference).m_bucketIndex;
                if (i < 0)
                {
                    continue;
                }
                Object obj = m_buckets[i];
                SoftEntry softentry = null;
                do
                {
                    if (obj == null)
                    {
                        break;
                    }
                    if (((SoftEntry) (obj)).m_softValue == reference)
                    {
                        if (softentry == null)
                        {
                            m_buckets[i] = ((SoftEntry) (obj)).m_next;
                        } else
                        {
                            softentry.m_next = ((SoftEntry) (obj)).m_next;
                        }
                        obj.m_softValue = null;
                        obj.m_key = null;
                        obj.m_next = null;
                        m_size = m_size - 1;
                        continue label0;
                    }
                    softentry = ((SoftEntry) (obj));
                    obj = ((SoftEntry) (obj)).m_next;
                } while (true);
                obj = new StringBuffer((new StringBuilder()).append("removeClearedValues(): soft reference [").append(reference).append("] did not match within bucket #").append(i).append(EOL).toString());
                debugDump(((StringBuffer) (obj)));
                throw new Error(((StringBuffer) (obj)).toString());
            }
            return;
        } while (true);
    }

    public void clear()
    {
        SoftEntry asoftentry[] = m_buckets;
        int i = 0;
        for (int j = asoftentry.length; i < j; i++)
        {
            SoftEntry softentry1;
            for (SoftEntry softentry = asoftentry[i]; softentry != null; softentry = softentry1)
            {
                softentry1 = softentry.m_next;
                softentry.m_softValue.m_bucketIndex = -1;
                softentry.m_softValue = null;
                softentry.m_next = null;
                softentry.m_key = null;
            }

            asoftentry[i] = null;
        }

        m_size = 0;
        m_readAccessCount = 0;
        m_writeAccessCount = 0;
    }

    public boolean containsKey(Object obj)
    {
        throw new UnsupportedOperationException("not implemented: containsKey");
    }

    public boolean containsValue(Object obj)
    {
        throw new UnsupportedOperationException("not implemented: containsValue");
    }

    void debugDump(StringBuffer stringbuffer)
    {
        if (stringbuffer != null)
        {
            stringbuffer.append(getClass().getName().concat("@").concat(Integer.toHexString(System.identityHashCode(this))));
            stringbuffer.append(EOL);
            stringbuffer.append((new StringBuilder()).append("size = ").append(m_size).append(", bucket table size = ").append(m_buckets.length).append(", load factor = ").append(m_loadFactor).append(EOL).toString());
            stringbuffer.append((new StringBuilder()).append("size threshold = ").append(m_sizeThreshold).append(", get clear frequency = ").append(m_readClearCheckFrequency).append(", put clear frequency = ").append(m_writeClearCheckFrequency).append(EOL).toString());
            stringbuffer.append((new StringBuilder()).append("get count: ").append(m_readAccessCount).append(", put count: ").append(m_writeAccessCount).append(EOL).toString());
        }
    }

    public Set entrySet()
    {
        throw new UnsupportedOperationException("not implemented: entrySet");
    }

    public boolean equals(Object obj)
    {
        throw new UnsupportedOperationException("not implemented: equals");
    }

    public Object get(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null input: key");
        }
        int i = m_readAccessCount + 1;
        m_readAccessCount = i;
        if (i % m_readClearCheckFrequency == 0)
        {
            removeClearedValues();
        }
        i = obj.hashCode();
        SoftEntry asoftentry[] = m_buckets;
        for (Object obj1 = asoftentry[(0x7fffffff & i) % asoftentry.length]; obj1 != null; obj1 = ((SoftEntry) (obj1)).m_next)
        {
            Object obj2 = ((SoftEntry) (obj1)).m_key;
            if (obj == obj2 || i == obj2.hashCode() && obj.equals(obj2))
            {
                obj = ((SoftEntry) (obj1)).m_softValue;
                obj1 = ((Reference) (obj)).get();
                if (obj1 == null)
                {
                    ((Reference) (obj)).enqueue();
                }
                return obj1;
            }
        }

        return null;
    }

    public int hashCode()
    {
        throw new UnsupportedOperationException("not implemented: hashCode");
    }

    public boolean isEmpty()
    {
        return m_size == 0;
    }

    public Set keySet()
    {
        throw new UnsupportedOperationException("not implemented: keySet");
    }

    public Object put(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null input: key");
        }
        if (obj1 == null)
        {
            throw new IllegalArgumentException("null input: value");
        }
        int i = m_writeAccessCount + 1;
        m_writeAccessCount = i;
        if (i % m_writeClearCheckFrequency == 0)
        {
            removeClearedValues();
        }
        Object obj4 = null;
        i = obj.hashCode();
        SoftEntry asoftentry[] = m_buckets;
        int j = (i & 0x7fffffff) % asoftentry.length;
        Object obj2 = asoftentry[j];
label0:
        do
        {
label1:
            {
                Object obj3 = obj4;
                if (obj2 != null)
                {
                    obj3 = ((SoftEntry) (obj2)).m_key;
                    if (obj != obj3 && (i != obj3.hashCode() || !obj.equals(obj3)))
                    {
                        break label1;
                    }
                    obj3 = obj2;
                }
                if (obj3 != null)
                {
                    obj = ((SoftEntry) (obj3)).m_softValue;
                    obj2 = ((IndexedSoftReference) (obj)).get();
                    if (obj2 == null)
                    {
                        obj.m_bucketIndex = -1;
                    }
                    obj3.m_softValue = new IndexedSoftReference(obj1, m_valueReferenceQueue, j);
                    return obj2;
                }
                break label0;
            }
            obj2 = ((SoftEntry) (obj2)).m_next;
        } while (true);
        if (m_size >= m_sizeThreshold)
        {
            rehash();
        }
        obj2 = m_buckets;
        i = (i & 0x7fffffff) % obj2.length;
        SoftEntry softentry = obj2[i];
        obj2[i] = new SoftEntry(m_valueReferenceQueue, obj, obj1, softentry, i);
        m_size = m_size + 1;
        return null;
    }

    public void putAll(Map map)
    {
        throw new UnsupportedOperationException("not implemented: putAll");
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null input: key");
        }
        int i = m_writeAccessCount + 1;
        m_writeAccessCount = i;
        if (i % m_writeClearCheckFrequency == 0)
        {
            removeClearedValues();
        }
        i = obj.hashCode();
        SoftEntry asoftentry[] = m_buckets;
        int j = (0x7fffffff & i) % asoftentry.length;
        Object obj2 = null;
        SoftEntry softentry = asoftentry[j];
        SoftEntry softentry1 = null;
        do
        {
label0:
            {
                Object obj1 = obj2;
                if (softentry != null)
                {
                    obj1 = softentry.m_key;
                    if (obj1 != obj && (i != obj1.hashCode() || !obj.equals(obj1)))
                    {
                        break label0;
                    }
                    if (softentry1 == null)
                    {
                        asoftentry[j] = softentry.m_next;
                    } else
                    {
                        softentry1.m_next = softentry.m_next;
                    }
                    obj = softentry.m_softValue;
                    obj1 = ((IndexedSoftReference) (obj)).get();
                    obj.m_bucketIndex = -1;
                    softentry.m_softValue = null;
                    softentry.m_key = null;
                    softentry.m_next = null;
                    m_size = m_size - 1;
                }
                return obj1;
            }
            softentry1 = softentry;
            softentry = softentry.m_next;
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

    public Collection values()
    {
        throw new UnsupportedOperationException("not implemented: values");
    }

}
