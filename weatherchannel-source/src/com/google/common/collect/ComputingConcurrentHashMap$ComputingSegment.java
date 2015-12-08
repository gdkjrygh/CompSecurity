// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, MapMakerInternalMap

static final class erence extends erence
{

    Object compute(Object obj, int i, erence erence, erence erence1)
        throws ExecutionException
    {
        Object obj1;
        Object obj2;
        long l1;
        obj1 = null;
        obj2 = null;
        System.nanoTime();
        l1 = 0L;
        long l = l1;
        erence;
        JVM INSTR monitorenter ;
        l = l1;
        obj1 = obj2;
        obj2 = erence1.compute(obj, i);
        l = l1;
        obj1 = obj2;
        l1 = System.nanoTime();
        l = l1;
        obj1 = obj2;
        erence;
        JVM INSTR monitorexit ;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        l = l1;
        obj1 = obj2;
        if (put(obj, i, obj2, true) == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        l = l1;
        obj1 = obj2;
        enqueueNotification(obj, i, obj2, enqueueNotification);
        if (l1 == 0L)
        {
            System.nanoTime();
        }
        if (obj2 == null)
        {
            clearValue(obj, i, erence1);
        }
        return obj2;
        Exception exception;
        exception;
        erence;
        JVM INSTR monitorexit ;
        throw exception;
        erence;
        if (l == 0L)
        {
            System.nanoTime();
        }
        if (obj1 == null)
        {
            clearValue(obj, i, erence1);
        }
        throw erence;
    }

    Object getOrCompute(Object obj, int i, Function function)
        throws ExecutionException
    {
_L21:
        Object obj2 = getEntry(obj, i);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Object obj1 = getLiveValue(((getLiveValue) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        recordRead(((recordRead) (obj2)));
        postReadCleanup();
        return obj1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (((postReadCleanup) (obj2)).eference().ngReference()) goto _L3; else goto _L2
_L2:
        Object obj3;
        boolean flag1;
        flag1 = true;
        obj3 = null;
        lock();
        erence erence;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        preWriteCleanup();
        k = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        erence = (table)atomicreferencearray.get(j);
        obj1 = erence;
_L19:
        boolean flag = flag1;
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        obj2 = ((table) (obj1)).table();
        if (((table) (obj1)).table() != i || obj2 == null) goto _L7; else goto _L6
_L6:
        if (!map.keyEquivalence.equivalent(obj, obj2)) goto _L7; else goto _L8
_L8:
        if (!((map) (obj1)).eference().ngReference()) goto _L10; else goto _L9
_L9:
        flag = false;
_L5:
        obj2 = obj1;
        if (!flag) goto _L12; else goto _L11
_L11:
        obj2 = new erence(function);
        if (obj1 != null) goto _L14; else goto _L13
_L13:
        obj1 = newEntry(obj, i, erence);
        ((newEntry) (obj1)).eference(((eference) (obj2)));
        atomicreferencearray.set(j, obj1);
        obj3 = obj2;
        obj2 = obj1;
_L12:
        unlock();
        postWriteCleanup();
        obj1 = obj2;
        if (!flag) goto _L3; else goto _L15
_L15:
        obj = compute(obj, i, ((compute) (obj2)), ((erence) (obj3)));
        postReadCleanup();
        return obj;
_L10:
        Object obj4 = ((postReadCleanup) (obj1)).eference().eference();
        if (obj4 != null) goto _L17; else goto _L16
_L16:
        enqueueNotification(obj2, i, obj4, enqueueNotification);
_L18:
        evictionQueue.remove(obj1);
        expirationQueue.remove(obj1);
        count = k - 1;
        flag = flag1;
          goto _L5
        obj;
_L22:
        unlock();
        postWriteCleanup();
        throw obj;
        obj;
        postReadCleanup();
        throw obj;
_L17:
label0:
        {
            if (!map.expires() || !map.isExpired(((map) (obj1))))
            {
                break label0;
            }
            enqueueNotification(obj2, i, obj4, enqueueNotification);
        }
          goto _L18
        recordLockedRead(((recordLockedRead) (obj1)));
        unlock();
        postWriteCleanup();
        postReadCleanup();
        return obj4;
_L7:
        obj1 = ((postReadCleanup) (obj1)).postReadCleanup();
          goto _L19
_L14:
        ((postReadCleanup) (obj1)).eference(((eference) (obj2)));
        obj3 = obj2;
        obj2 = obj1;
          goto _L12
_L3:
        boolean flag2;
        if (!Thread.holdsLock(obj1))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Recursive computation");
        obj2 = ((eference) (obj1)).eference().lue();
        if (obj2 == null) goto _L21; else goto _L20
_L20:
        recordRead(((recordRead) (obj1)));
        postReadCleanup();
        return obj2;
        obj;
          goto _L22
    }

    erence(MapMakerInternalMap mapmakerinternalmap, int i, int j)
    {
        super(mapmakerinternalmap, i, j);
    }
}
