// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Ticker;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static class expirationQueue extends ReentrantLock
{

    volatile int count;
    final Queue evictionQueue;
    final Queue expirationQueue;
    final ReferenceQueue keyReferenceQueue;
    final MapMakerInternalMap map;
    final int maxSegmentSize;
    int modCount;
    final AtomicInteger readCount = new AtomicInteger();
    final Queue recencyQueue;
    volatile AtomicReferenceArray table;
    int threshold;
    final ReferenceQueue valueReferenceQueue;

    void clear()
    {
        if (count == 0) goto _L2; else goto _L1
_L1:
        lock();
        AtomicReferenceArray atomicreferencearray;
        atomicreferencearray = table;
        if (map.removalNotificationQueue == MapMakerInternalMap.DISCARDING_QUEUE)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        int i = 0;
_L7:
        eEntry eentry;
        if (i >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        eentry = (eEntry)atomicreferencearray.get(i);
_L4:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!eentry.getValueReference().isComputingReference())
        {
            enqueueNotification(eentry, IT);
        }
        eentry = eentry.getNext();
        if (true) goto _L4; else goto _L3
_L5:
        Exception exception;
        for (; i >= atomicreferencearray.length(); i = 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }

        atomicreferencearray.set(i, null);
        i++;
          goto _L5
        clearReferenceQueues();
        evictionQueue.clear();
        expirationQueue.clear();
        readCount.set(0);
        modCount = modCount + 1;
        count = 0;
        unlock();
        postWriteCleanup();
_L2:
        return;
        exception;
        unlock();
        postWriteCleanup();
        throw exception;
_L3:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void clearKeyReferenceQueue()
    {
        while (keyReferenceQueue.poll() != null) ;
    }

    void clearReferenceQueues()
    {
        if (map.usesKeyReferences())
        {
            clearKeyReferenceQueue();
        }
        if (map.usesValueReferences())
        {
            clearValueReferenceQueue();
        }
    }

    boolean clearValue(Object obj, int i, erence erence)
    {
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (!map.keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (eentry.getValueReference() != erence)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        atomicreferencearray.set(j, removeFromChain(eentry1, eentry));
        unlock();
        postWriteCleanup();
        return true;
        unlock();
        postWriteCleanup();
        return false;
        eentry = eentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        postWriteCleanup();
        return false;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    void clearValueReferenceQueue()
    {
        while (valueReferenceQueue.poll() != null) ;
    }

    boolean containsKey(Object obj, int i)
    {
        boolean flag = false;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = getLiveEntry(obj, i);
        if (obj == null)
        {
            postReadCleanup();
            return false;
        }
        obj = ((eEntry) (obj)).getValueReference().get();
        if (obj != null)
        {
            flag = true;
        }
        postReadCleanup();
        return flag;
        postReadCleanup();
        return false;
        obj;
        postReadCleanup();
        throw obj;
    }

    boolean containsValue(Object obj)
    {
        if (count == 0) goto _L2; else goto _L1
_L1:
        AtomicReferenceArray atomicreferencearray;
        int j;
        atomicreferencearray = table;
        j = atomicreferencearray.length();
        int i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        eEntry eentry = (eEntry)atomicreferencearray.get(i);
_L4:
        if (eentry == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        Object obj1 = getLiveValue(eentry);
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        eentry = eentry.getNext();
        boolean flag;
        if (true) goto _L4; else goto _L3
_L3:
        if (!(flag = map.valueEquivalence.equivalent(obj, obj1))) goto _L6; else goto _L5
_L5:
        postReadCleanup();
        return true;
        i++;
        if (true) goto _L7; else goto _L2
_L2:
        postReadCleanup();
        return false;
        obj;
        postReadCleanup();
        throw obj;
    }

    eEntry copyEntry(eEntry eentry, eEntry eentry1)
    {
        if (eentry.getKey() != null)
        {
            erence erence = eentry.getValueReference();
            Object obj = erence.get();
            if (obj != null || erence.isComputingReference())
            {
                eentry = map.entryFactory.copyEntry(this, eentry, eentry1);
                eentry.setValueReference(erence.copyFor(valueReferenceQueue, obj, eentry));
                return eentry;
            }
        }
        return null;
    }

    void drainKeyReferenceQueue()
    {
        int i = 0;
        int j;
        do
        {
            Object obj = keyReferenceQueue.poll();
            if (obj == null)
            {
                break;
            }
            obj = (eEntry)obj;
            map.reclaimKey(((eEntry) (obj)));
            j = i + 1;
            i = j;
        } while (j != 16);
    }

    void drainRecencyQueue()
    {
        do
        {
            eEntry eentry = (eEntry)recencyQueue.poll();
            if (eentry == null)
            {
                break;
            }
            if (evictionQueue.contains(eentry))
            {
                evictionQueue.add(eentry);
            }
            if (map.expiresAfterAccess() && expirationQueue.contains(eentry))
            {
                expirationQueue.add(eentry);
            }
        } while (true);
    }

    void drainReferenceQueues()
    {
        if (map.usesKeyReferences())
        {
            drainKeyReferenceQueue();
        }
        if (map.usesValueReferences())
        {
            drainValueReferenceQueue();
        }
    }

    void drainValueReferenceQueue()
    {
        int i = 0;
        int j;
        do
        {
            Object obj = valueReferenceQueue.poll();
            if (obj == null)
            {
                break;
            }
            obj = (erence)obj;
            map.reclaimValue(((erence) (obj)));
            j = i + 1;
            i = j;
        } while (j != 16);
    }

    void enqueueNotification(eEntry eentry, eEntry eentry1)
    {
        enqueueNotification(eentry.getKey(), eentry.getHash(), eentry.getValueReference().get(), eentry1);
    }

    void enqueueNotification(Object obj, int i, Object obj1, erence.get get1)
    {
        if (map.removalNotificationQueue != MapMakerInternalMap.DISCARDING_QUEUE)
        {
            obj = new (obj, obj1, get1);
            map.removalNotificationQueue.offer(obj);
        }
    }

    boolean evictEntries()
    {
        if (map.evictsBySize() && count >= maxSegmentSize)
        {
            drainRecencyQueue();
            eEntry eentry = (eEntry)evictionQueue.remove();
            if (!removeEntry(eentry, eentry.getHash(), eEntry.getHash))
            {
                throw new AssertionError();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    void expand()
    {
        AtomicReferenceArray atomicreferencearray;
        AtomicReferenceArray atomicreferencearray1;
        int i;
        int j;
        int k1;
        int l1;
        atomicreferencearray = table;
        k1 = atomicreferencearray.length();
        if (k1 >= 0x40000000)
        {
            return;
        }
        i = count;
        atomicreferencearray1 = newEntryArray(k1 << 1);
        threshold = (atomicreferencearray1.length() * 3) / 4;
        l1 = atomicreferencearray1.length() - 1;
        j = 0;
_L2:
        eEntry eentry;
        eEntry eentry1;
        int k;
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        eentry1 = (eEntry)atomicreferencearray.get(j);
        k = i;
        if (eentry1 != null)
        {
            eentry = eentry1.getNext();
            k = eentry1.getHash() & l1;
            if (eentry != null)
            {
                break; /* Loop/switch isn't completed */
            }
            atomicreferencearray1.set(k, eentry1);
            k = i;
        }
_L4:
        j++;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        eEntry eentry3;
        eentry3 = eentry1;
        while (eentry != null) 
        {
            int j1 = eentry.getHash() & l1;
            int i1 = k;
            if (j1 != k)
            {
                i1 = j1;
                eentry3 = eentry;
            }
            eentry = eentry.getNext();
            k = i1;
        }
        atomicreferencearray1.set(k, eentry3);
        eentry = eentry1;
_L5:
        k = i;
        if (eentry == eentry3) goto _L4; else goto _L3
_L3:
        int l = eentry.getHash() & l1;
        eEntry eentry2 = copyEntry(eentry, (eEntry)atomicreferencearray1.get(l));
        if (eentry2 != null)
        {
            atomicreferencearray1.set(l, eentry2);
        } else
        {
            removeCollectedEntry(eentry);
            i--;
        }
        eentry = eentry.getNext();
          goto _L5
          goto _L4
        table = atomicreferencearray1;
        count = i;
        return;
    }

    void expireEntries()
    {
        drainRecencyQueue();
        if (!expirationQueue.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l = map.ticker.read();
        do
        {
            eEntry eentry = (eEntry)expirationQueue.peek();
            if (eentry == null || !map.isExpired(eentry, l))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!removeEntry(eentry, eentry.getHash(), D))
            {
                throw new AssertionError();
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    Object get(Object obj, int i)
    {
        obj = getLiveEntry(obj, i);
        if (obj == null)
        {
            postReadCleanup();
            return null;
        }
        Object obj1 = ((eEntry) (obj)).getValueReference().get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        recordRead(((eEntry) (obj)));
_L4:
        postReadCleanup();
        return obj1;
_L2:
        tryDrainReferenceQueues();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        postReadCleanup();
        throw obj;
    }

    eEntry getEntry(Object obj, int i)
    {
        eEntry eentry;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        eentry = getFirst(i);
_L1:
        Object obj1;
        if (eentry == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (eentry.getHash() == i)
        {
            obj1 = eentry.getKey();
            if (obj1 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            tryDrainReferenceQueues();
        }
_L3:
        eentry = eentry.getNext();
          goto _L1
        if (!map.keyEquivalence.equivalent(obj, obj1)) goto _L3; else goto _L2
_L2:
        return eentry;
        return null;
    }

    eEntry getFirst(int i)
    {
        AtomicReferenceArray atomicreferencearray = table;
        return (eEntry)atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
    }

    eEntry getLiveEntry(Object obj, int i)
    {
        eEntry eentry = getEntry(obj, i);
        if (eentry == null)
        {
            obj = null;
        } else
        {
            obj = eentry;
            if (map.expires())
            {
                obj = eentry;
                if (map.isExpired(eentry))
                {
                    tryExpireEntries();
                    return null;
                }
            }
        }
        return ((eEntry) (obj));
    }

    Object getLiveValue(eEntry eentry)
    {
        Object obj;
        if (eentry.getKey() == null)
        {
            tryDrainReferenceQueues();
            obj = null;
        } else
        {
            Object obj1 = eentry.getValueReference().get();
            if (obj1 == null)
            {
                tryDrainReferenceQueues();
                return null;
            }
            obj = obj1;
            if (map.expires())
            {
                obj = obj1;
                if (map.isExpired(eentry))
                {
                    tryExpireEntries();
                    return null;
                }
            }
        }
        return obj;
    }

    void initTable(AtomicReferenceArray atomicreferencearray)
    {
        threshold = (atomicreferencearray.length() * 3) / 4;
        if (threshold == maxSegmentSize)
        {
            threshold = threshold + 1;
        }
        table = atomicreferencearray;
    }

    boolean isCollected(erence erence)
    {
        while (erence.isComputingReference() || erence.get() != null) 
        {
            return false;
        }
        return true;
    }

    eEntry newEntry(Object obj, int i, eEntry eentry)
    {
        return map.entryFactory.newEntry(this, obj, i, eentry);
    }

    AtomicReferenceArray newEntryArray(int i)
    {
        return new AtomicReferenceArray(i);
    }

    void postReadCleanup()
    {
        if ((readCount.incrementAndGet() & 0x3f) == 0)
        {
            runCleanup();
        }
    }

    void postWriteCleanup()
    {
        runUnlockedCleanup();
    }

    void preWriteCleanup()
    {
        runLockedCleanup();
    }

    Object put(Object obj, int i, Object obj1, boolean flag)
    {
        lock();
        int k;
        preWriteCleanup();
        k = count + 1;
        int j = k;
        Object obj3;
        Object obj4;
        if (k > threshold)
        {
            expand();
            j = count + 1;
        }
        obj4 = table;
        k = i & ((AtomicReferenceArray) (obj4)).length() - 1;
        obj3 = (eEntry)((AtomicReferenceArray) (obj4)).get(k);
        Object obj2 = obj3;
_L5:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        Object obj5 = ((eEntry) (obj2)).getKey();
        if (((eEntry) (obj2)).getHash() != i || obj5 == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (!map.keyEquivalence.equivalent(obj, obj5))
        {
            break MISSING_BLOCK_LABEL_282;
        }
        obj3 = ((eEntry) (obj2)).getValueReference();
        obj4 = ((erence) (obj3)).get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        modCount = modCount + 1;
        setValue(((eEntry) (obj2)), obj1);
        if (((erence) (obj3)).isComputingReference()) goto _L2; else goto _L1
_L1:
        enqueueNotification(obj, i, obj4, TED);
        j = count;
_L4:
        count = j;
        unlock();
        postWriteCleanup();
        return null;
_L2:
        if (!evictEntries()) goto _L4; else goto _L3
_L3:
        j = count + 1;
          goto _L4
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        recordLockedRead(((eEntry) (obj2)));
        unlock();
        postWriteCleanup();
        return obj4;
        modCount = modCount + 1;
        enqueueNotification(obj, i, obj4, ED);
        setValue(((eEntry) (obj2)), obj1);
        unlock();
        postWriteCleanup();
        return obj4;
        obj2 = ((eEntry) (obj2)).getNext();
          goto _L5
        modCount = modCount + 1;
        obj = newEntry(obj, i, ((eEntry) (obj3)));
        setValue(((eEntry) (obj)), obj1);
        ((AtomicReferenceArray) (obj4)).set(k, obj);
        if (evictEntries())
        {
            j = count + 1;
        }
        count = j;
        unlock();
        postWriteCleanup();
        return null;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    boolean reclaimKey(eEntry eentry, int i)
    {
        lock();
        eEntry eentry2;
        AtomicReferenceArray atomicreferencearray;
        int j;
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry2 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry1 = eentry2;
_L2:
        if (eentry1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (eentry1 != eentry)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        modCount = modCount + 1;
        enqueueNotification(eentry1.getKey(), i, eentry1.getValueReference().get(), TED);
        eentry = removeFromChain(eentry2, eentry1);
        i = count;
        atomicreferencearray.set(j, eentry);
        count = i - 1;
        unlock();
        postWriteCleanup();
        return true;
        eentry1 = eentry1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        postWriteCleanup();
        return false;
        eentry;
        unlock();
        postWriteCleanup();
        throw eentry;
    }

    boolean reclaimValue(Object obj, int i, erence erence)
    {
        boolean flag;
        flag = false;
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L12:
        if (eentry == null) goto _L2; else goto _L1
_L1:
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null) goto _L4; else goto _L3
_L3:
        if (!map.keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L5
_L5:
        if (eentry.getValueReference() != erence) goto _L7; else goto _L6
_L6:
        modCount = modCount + 1;
        enqueueNotification(obj, i, erence.get(), TED);
        obj = removeFromChain(eentry1, eentry);
        i = count;
        atomicreferencearray.set(j, obj);
        count = i - 1;
        boolean flag1 = true;
        unlock();
        flag = flag1;
        if (!isHeldByCurrentThread())
        {
            postWriteCleanup();
            flag = flag1;
        }
_L9:
        return flag;
_L7:
        unlock();
        if (isHeldByCurrentThread()) goto _L9; else goto _L8
_L8:
        postWriteCleanup();
        return false;
_L4:
        eentry = eentry.getNext();
        continue; /* Loop/switch isn't completed */
_L2:
        unlock();
        if (isHeldByCurrentThread()) goto _L9; else goto _L10
_L10:
        postWriteCleanup();
        return false;
        obj;
        unlock();
        if (!isHeldByCurrentThread())
        {
            postWriteCleanup();
        }
        throw obj;
        if (true) goto _L12; else goto _L11
_L11:
    }

    void recordExpirationTime(eEntry eentry, long l)
    {
        eentry.setExpirationTime(map.ticker.read() + l);
    }

    void recordLockedRead(eEntry eentry)
    {
        evictionQueue.add(eentry);
        if (map.expiresAfterAccess())
        {
            recordExpirationTime(eentry, map.expireAfterAccessNanos);
            expirationQueue.add(eentry);
        }
    }

    void recordRead(eEntry eentry)
    {
        if (map.expiresAfterAccess())
        {
            recordExpirationTime(eentry, map.expireAfterAccessNanos);
        }
        recencyQueue.add(eentry);
    }

    void recordWrite(eEntry eentry)
    {
        drainRecencyQueue();
        evictionQueue.add(eentry);
        if (map.expires())
        {
            long l;
            if (map.expiresAfterAccess())
            {
                l = map.expireAfterAccessNanos;
            } else
            {
                l = map.expireAfterWriteNanos;
            }
            recordExpirationTime(eentry, l);
            expirationQueue.add(eentry);
        }
    }

    Object remove(Object obj, int i)
    {
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L3:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        Object obj2;
        if (!map.keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = eentry.getValueReference();
        obj2 = ((erence) (obj)).get();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = IT;
_L1:
        modCount = modCount + 1;
        enqueueNotification(obj1, i, obj2, ((enqueueNotification) (obj)));
        obj = removeFromChain(eentry1, eentry);
        i = count;
        atomicreferencearray.set(j, obj);
        count = i - 1;
        unlock();
        postWriteCleanup();
        return obj2;
label0:
        {
            if (!isCollected(((erence) (obj))))
            {
                break label0;
            }
            obj = TED;
        }
          goto _L1
        unlock();
        postWriteCleanup();
        return null;
        eentry = eentry.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        postWriteCleanup();
        return null;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    boolean remove(Object obj, int i, Object obj1)
    {
        boolean flag;
        flag = false;
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L3:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = eentry.getKey();
        if (eentry.getHash() != i || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        Object obj3;
        if (!map.keyEquivalence.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj = eentry.getValueReference();
        obj3 = ((erence) (obj)).get();
        if (!map.valueEquivalence.equivalent(obj1, obj3))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = IT;
_L1:
        modCount = modCount + 1;
        enqueueNotification(obj2, i, obj3, ((enqueueNotification) (obj)));
        obj1 = removeFromChain(eentry1, eentry);
        i = count;
        atomicreferencearray.set(j, obj1);
        count = i - 1;
        obj1 = IT;
        if (obj == obj1)
        {
            flag = true;
        }
        unlock();
        postWriteCleanup();
        return flag;
label0:
        {
            if (!isCollected(((erence) (obj))))
            {
                break label0;
            }
            obj = TED;
        }
          goto _L1
        unlock();
        postWriteCleanup();
        return false;
        eentry = eentry.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        postWriteCleanup();
        return false;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    void removeCollectedEntry(eEntry eentry)
    {
        enqueueNotification(eentry, TED);
        evictionQueue.remove(eentry);
        expirationQueue.remove(eentry);
    }

    boolean removeEntry(eEntry eentry, int i, eEntry eentry1)
    {
        int j = count;
        AtomicReferenceArray atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eEntry eentry3 = (eEntry)atomicreferencearray.get(j);
        for (eEntry eentry2 = eentry3; eentry2 != null; eentry2 = eentry2.getNext())
        {
            if (eentry2 == eentry)
            {
                modCount = modCount + 1;
                enqueueNotification(eentry2.getKey(), i, eentry2.getValueReference().get(), eentry1);
                eentry = removeFromChain(eentry3, eentry2);
                i = count;
                atomicreferencearray.set(j, eentry);
                count = i - 1;
                return true;
            }
        }

        return false;
    }

    eEntry removeFromChain(eEntry eentry, eEntry eentry1)
    {
        evictionQueue.remove(eentry1);
        expirationQueue.remove(eentry1);
        int i = count;
        eEntry eentry2 = eentry1.getNext();
        while (eentry != eentry1) 
        {
            eEntry eentry3 = copyEntry(eentry, eentry2);
            if (eentry3 != null)
            {
                eentry2 = eentry3;
            } else
            {
                removeCollectedEntry(eentry);
                i--;
            }
            eentry = eentry.getNext();
        }
        count = i;
        return eentry2;
    }

    Object replace(Object obj, int i, Object obj1)
    {
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = eentry.getKey();
        if (eentry.getHash() != i || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        erence erence;
        Object obj3;
        if (!map.keyEquivalence.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        erence = eentry.getValueReference();
        obj3 = erence.get();
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (isCollected(erence))
        {
            int k = count;
            modCount = modCount + 1;
            enqueueNotification(obj2, i, obj3, TED);
            obj = removeFromChain(eentry1, eentry);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
        }
        unlock();
        postWriteCleanup();
        return null;
        modCount = modCount + 1;
        enqueueNotification(obj, i, obj3, ED);
        setValue(eentry, obj1);
        unlock();
        postWriteCleanup();
        return obj3;
        eentry = eentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        postWriteCleanup();
        return null;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    boolean replace(Object obj, int i, Object obj1, Object obj2)
    {
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = eentry.getKey();
        if (eentry.getHash() != i || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        erence erence;
        Object obj4;
        if (!map.keyEquivalence.equivalent(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        erence = eentry.getValueReference();
        obj4 = erence.get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (isCollected(erence))
        {
            int k = count;
            modCount = modCount + 1;
            enqueueNotification(obj3, i, obj4, TED);
            obj = removeFromChain(eentry1, eentry);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
        }
        unlock();
        postWriteCleanup();
        return false;
        if (!map.valueEquivalence.equivalent(obj1, obj4))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        modCount = modCount + 1;
        enqueueNotification(obj, i, obj4, ED);
        setValue(eentry, obj2);
        unlock();
        postWriteCleanup();
        return true;
        recordLockedRead(eentry);
        unlock();
        postWriteCleanup();
        return false;
        eentry = eentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        postWriteCleanup();
        return false;
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
    }

    void runCleanup()
    {
        runLockedCleanup();
        runUnlockedCleanup();
    }

    void runLockedCleanup()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        drainReferenceQueues();
        expireEntries();
        readCount.set(0);
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    void runUnlockedCleanup()
    {
        if (!isHeldByCurrentThread())
        {
            map.processPendingNotifications();
        }
    }

    void setValue(eEntry eentry, Object obj)
    {
        eentry.setValueReference(map.valueStrength.referenceValue(this, eentry, obj));
        recordWrite(eentry);
    }

    void tryDrainReferenceQueues()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        drainReferenceQueues();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    void tryExpireEntries()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        expireEntries();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    Queue(MapMakerInternalMap mapmakerinternalmap, int i, int j)
    {
        Object obj1 = null;
        super();
        map = mapmakerinternalmap;
        maxSegmentSize = j;
        initTable(newEntryArray(i));
        Object obj;
        if (mapmakerinternalmap.usesKeyReferences())
        {
            obj = new ReferenceQueue();
        } else
        {
            obj = null;
        }
        keyReferenceQueue = ((ReferenceQueue) (obj));
        obj = obj1;
        if (mapmakerinternalmap.usesValueReferences())
        {
            obj = new ReferenceQueue();
        }
        valueReferenceQueue = ((ReferenceQueue) (obj));
        if (mapmakerinternalmap.evictsBySize() || mapmakerinternalmap.expiresAfterAccess())
        {
            obj = new ConcurrentLinkedQueue();
        } else
        {
            obj = MapMakerInternalMap.discardingQueue();
        }
        recencyQueue = ((Queue) (obj));
        if (mapmakerinternalmap.evictsBySize())
        {
            obj = new Queue();
        } else
        {
            obj = MapMakerInternalMap.discardingQueue();
        }
        evictionQueue = ((Queue) (obj));
        if (mapmakerinternalmap.expires())
        {
            mapmakerinternalmap = new onQueue();
        } else
        {
            mapmakerinternalmap = MapMakerInternalMap.discardingQueue();
        }
        expirationQueue = mapmakerinternalmap;
    }
}
