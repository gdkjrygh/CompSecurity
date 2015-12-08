// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, MapMaker

class ComputingConcurrentHashMap extends MapMakerInternalMap
{
    private static final class ComputationExceptionReference
        implements MapMakerInternalMap.ValueReference
    {

        final Throwable t;

        public void clear(MapMakerInternalMap.ValueReference valuereference)
        {
        }

        public MapMakerInternalMap.ValueReference copyFor(ReferenceQueue referencequeue, Object obj, MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public MapMakerInternalMap.ReferenceEntry getEntry()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public Object waitForValue()
            throws ExecutionException
        {
            throw new ExecutionException(t);
        }

        ComputationExceptionReference(Throwable throwable)
        {
            t = throwable;
        }
    }

    private static final class ComputedReference
        implements MapMakerInternalMap.ValueReference
    {

        final Object value;

        public void clear(MapMakerInternalMap.ValueReference valuereference)
        {
        }

        public MapMakerInternalMap.ValueReference copyFor(ReferenceQueue referencequeue, Object obj, MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return value;
        }

        public MapMakerInternalMap.ReferenceEntry getEntry()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public Object waitForValue()
        {
            return get();
        }

        ComputedReference(Object obj)
        {
            value = obj;
        }
    }

    static final class ComputingSegment extends MapMakerInternalMap.Segment
    {

        Object compute(Object obj, int i, MapMakerInternalMap.ReferenceEntry referenceentry, ComputingValueReference computingvaluereference)
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
            referenceentry;
            JVM INSTR monitorenter ;
            l = l1;
            obj1 = obj2;
            obj2 = computingvaluereference.compute(obj, i);
            l = l1;
            obj1 = obj2;
            l1 = System.nanoTime();
            l = l1;
            obj1 = obj2;
            referenceentry;
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
            enqueueNotification(obj, i, obj2, MapMaker.RemovalCause.REPLACED);
            if (l1 == 0L)
            {
                System.nanoTime();
            }
            if (obj2 == null)
            {
                clearValue(obj, i, computingvaluereference);
            }
            return obj2;
            Exception exception;
            exception;
            referenceentry;
            JVM INSTR monitorexit ;
            throw exception;
            referenceentry;
            if (l == 0L)
            {
                System.nanoTime();
            }
            if (obj1 == null)
            {
                clearValue(obj, i, computingvaluereference);
            }
            throw referenceentry;
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
            Object obj1 = getLiveValue(((MapMakerInternalMap.ReferenceEntry) (obj2)));
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_39;
            }
            recordRead(((MapMakerInternalMap.ReferenceEntry) (obj2)));
            postReadCleanup();
            return obj1;
            if (obj2 == null) goto _L2; else goto _L1
_L1:
            obj1 = obj2;
            if (((MapMakerInternalMap.ReferenceEntry) (obj2)).getValueReference().isComputingReference()) goto _L3; else goto _L2
_L2:
            Object obj3;
            boolean flag1;
            flag1 = true;
            obj3 = null;
            lock();
            MapMakerInternalMap.ReferenceEntry referenceentry;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            preWriteCleanup();
            k = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry = (MapMakerInternalMap.ReferenceEntry)atomicreferencearray.get(j);
            obj1 = referenceentry;
_L19:
            boolean flag = flag1;
            if (obj1 == null) goto _L5; else goto _L4
_L4:
            obj2 = ((MapMakerInternalMap.ReferenceEntry) (obj1)).getKey();
            if (((MapMakerInternalMap.ReferenceEntry) (obj1)).getHash() != i || obj2 == null) goto _L7; else goto _L6
_L6:
            if (!map.keyEquivalence.equivalent(obj, obj2)) goto _L7; else goto _L8
_L8:
            if (!((MapMakerInternalMap.ReferenceEntry) (obj1)).getValueReference().isComputingReference()) goto _L10; else goto _L9
_L9:
            flag = false;
_L5:
            obj2 = obj1;
            if (!flag) goto _L12; else goto _L11
_L11:
            obj2 = new ComputingValueReference(function);
            if (obj1 != null) goto _L14; else goto _L13
_L13:
            obj1 = newEntry(obj, i, referenceentry);
            ((MapMakerInternalMap.ReferenceEntry) (obj1)).setValueReference(((MapMakerInternalMap.ValueReference) (obj2)));
            atomicreferencearray.set(j, obj1);
            obj3 = obj2;
            obj2 = obj1;
_L12:
            unlock();
            postWriteCleanup();
            obj1 = obj2;
            if (!flag) goto _L3; else goto _L15
_L15:
            obj = compute(obj, i, ((MapMakerInternalMap.ReferenceEntry) (obj2)), ((ComputingValueReference) (obj3)));
            postReadCleanup();
            return obj;
_L10:
            Object obj4 = ((MapMakerInternalMap.ReferenceEntry) (obj1)).getValueReference().get();
            if (obj4 != null) goto _L17; else goto _L16
_L16:
            enqueueNotification(obj2, i, obj4, MapMaker.RemovalCause.COLLECTED);
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
                if (!map.expires() || !map.isExpired(((MapMakerInternalMap.ReferenceEntry) (obj1))))
                {
                    break label0;
                }
                enqueueNotification(obj2, i, obj4, MapMaker.RemovalCause.EXPIRED);
            }
              goto _L18
            recordLockedRead(((MapMakerInternalMap.ReferenceEntry) (obj1)));
            unlock();
            postWriteCleanup();
            postReadCleanup();
            return obj4;
_L7:
            obj1 = ((MapMakerInternalMap.ReferenceEntry) (obj1)).getNext();
              goto _L19
_L14:
            ((MapMakerInternalMap.ReferenceEntry) (obj1)).setValueReference(((MapMakerInternalMap.ValueReference) (obj2)));
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
            obj2 = ((MapMakerInternalMap.ReferenceEntry) (obj1)).getValueReference().waitForValue();
            if (obj2 == null) goto _L21; else goto _L20
_L20:
            recordRead(((MapMakerInternalMap.ReferenceEntry) (obj1)));
            postReadCleanup();
            return obj2;
            obj;
              goto _L22
        }

        ComputingSegment(MapMakerInternalMap mapmakerinternalmap, int i, int j)
        {
            super(mapmakerinternalmap, i, j);
        }
    }

    static final class ComputingSerializationProxy extends MapMakerInternalMap.AbstractSerializationProxy
    {

        private static final long serialVersionUID = 4L;
        final Function computingFunction;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            _flddelegate = readMapMaker(objectinputstream).makeComputingMap(computingFunction);
            readEntries(objectinputstream);
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            writeMapTo(objectoutputstream);
        }

        Object readResolve()
        {
            return _flddelegate;
        }

        ComputingSerializationProxy(MapMakerInternalMap.Strength strength, MapMakerInternalMap.Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, MapMaker.RemovalListener removallistener, ConcurrentMap concurrentmap, Function function)
        {
            super(strength, strength1, equivalence, equivalence1, l, l1, i, j, removallistener, concurrentmap);
            computingFunction = function;
        }
    }

    private static final class ComputingValueReference
        implements MapMakerInternalMap.ValueReference
    {

        volatile MapMakerInternalMap.ValueReference computedReference;
        final Function computingFunction;

        public void clear(MapMakerInternalMap.ValueReference valuereference)
        {
            setValueReference(valuereference);
        }

        Object compute(Object obj, int i)
            throws ExecutionException
        {
            try
            {
                obj = computingFunction.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                setValueReference(new ComputationExceptionReference(((Throwable) (obj))));
                throw new ExecutionException(((Throwable) (obj)));
            }
            setValueReference(new ComputedReference(obj));
            return obj;
        }

        public MapMakerInternalMap.ValueReference copyFor(ReferenceQueue referencequeue, Object obj, MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public MapMakerInternalMap.ReferenceEntry getEntry()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return true;
        }

        void setValueReference(MapMakerInternalMap.ValueReference valuereference)
        {
            this;
            JVM INSTR monitorenter ;
            if (computedReference == MapMakerInternalMap.UNSET)
            {
                computedReference = valuereference;
                notifyAll();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            valuereference;
            this;
            JVM INSTR monitorexit ;
            throw valuereference;
        }

        public Object waitForValue()
            throws ExecutionException
        {
            if (computedReference != MapMakerInternalMap.UNSET) goto _L2; else goto _L1
_L1:
            boolean flag = false;
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            flag = flag1;
_L5:
            MapMakerInternalMap.ValueReference valuereference;
            MapMakerInternalMap.ValueReference valuereference1;
            valuereference = computedReference;
            valuereference1 = MapMakerInternalMap.UNSET;
            if (valuereference != valuereference1) goto _L4; else goto _L3
_L3:
            Exception exception;
            try
            {
                wait();
            }
            catch (InterruptedException interruptedexception)
            {
                flag = true;
            }
            finally { }
            if (true) goto _L5; else goto _L4
_L4:
            this;
            JVM INSTR monitorexit ;
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
_L2:
            return computedReference.waitForValue();
            this;
            JVM INSTR monitorexit ;
            throw exception;
            exception;
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
            throw exception;
        }

        public ComputingValueReference(Function function)
        {
            computedReference = MapMakerInternalMap.unset();
            computingFunction = function;
        }
    }


    private static final long serialVersionUID = 4L;
    final Function computingFunction;

    ComputingConcurrentHashMap(MapMaker mapmaker, Function function)
    {
        super(mapmaker);
        computingFunction = (Function)Preconditions.checkNotNull(function);
    }

    MapMakerInternalMap.Segment createSegment(int i, int j)
    {
        return new ComputingSegment(this, i, j);
    }

    Object getOrCompute(Object obj)
        throws ExecutionException
    {
        int i = hash(Preconditions.checkNotNull(obj));
        return segmentFor(i).getOrCompute(obj, i, computingFunction);
    }

    ComputingSegment segmentFor(int i)
    {
        return (ComputingSegment)super.segmentFor(i);
    }

    volatile MapMakerInternalMap.Segment segmentFor(int i)
    {
        return segmentFor(i);
    }

    Object writeReplace()
    {
        return new ComputingSerializationProxy(keyStrength, valueStrength, keyEquivalence, valueEquivalence, expireAfterWriteNanos, expireAfterAccessNanos, maximumSize, concurrencyLevel, removalListener, this, computingFunction);
    }
}
