// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CycleDetectingLockFactory
{
    private static interface CycleDetectingLock
    {

        public abstract LockGraphNode getLockGraphNode();

        public abstract boolean isAcquiredByCurrentThread();
    }

    final class CycleDetectingReentrantLock extends ReentrantLock
        implements CycleDetectingLock
    {

        private final LockGraphNode lockGraphNode;
        final CycleDetectingLockFactory this$0;

        public LockGraphNode getLockGraphNode()
        {
            return lockGraphNode;
        }

        public boolean isAcquiredByCurrentThread()
        {
            return isHeldByCurrentThread();
        }

        public void lock()
        {
            aboutToAcquire(this);
            super.lock();
            lockStateChanged(this);
            return;
            Exception exception;
            exception;
            lockStateChanged(this);
            throw exception;
        }

        public void lockInterruptibly()
            throws InterruptedException
        {
            aboutToAcquire(this);
            super.lockInterruptibly();
            lockStateChanged(this);
            return;
            Exception exception;
            exception;
            lockStateChanged(this);
            throw exception;
        }

        public boolean tryLock()
        {
            aboutToAcquire(this);
            boolean flag = super.tryLock();
            lockStateChanged(this);
            return flag;
            Exception exception;
            exception;
            lockStateChanged(this);
            throw exception;
        }

        public boolean tryLock(long l, TimeUnit timeunit)
            throws InterruptedException
        {
            aboutToAcquire(this);
            boolean flag = super.tryLock(l, timeunit);
            lockStateChanged(this);
            return flag;
            timeunit;
            lockStateChanged(this);
            throw timeunit;
        }

        public void unlock()
        {
            super.unlock();
            lockStateChanged(this);
            return;
            Exception exception;
            exception;
            lockStateChanged(this);
            throw exception;
        }

        private CycleDetectingReentrantLock(LockGraphNode lockgraphnode, boolean flag)
        {
            this$0 = CycleDetectingLockFactory.this;
            super(flag);
            lockGraphNode = (LockGraphNode)Preconditions.checkNotNull(lockgraphnode);
        }

    }

    private class CycleDetectingReentrantReadLock extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock
    {

        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final CycleDetectingLockFactory this$0;

        public void lock()
        {
            aboutToAcquire(readWriteLock);
            super.lock();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public void lockInterruptibly()
            throws InterruptedException
        {
            aboutToAcquire(readWriteLock);
            super.lockInterruptibly();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public boolean tryLock()
        {
            aboutToAcquire(readWriteLock);
            boolean flag = super.tryLock();
            lockStateChanged(readWriteLock);
            return flag;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public boolean tryLock(long l, TimeUnit timeunit)
            throws InterruptedException
        {
            aboutToAcquire(readWriteLock);
            boolean flag = super.tryLock(l, timeunit);
            lockStateChanged(readWriteLock);
            return flag;
            timeunit;
            lockStateChanged(readWriteLock);
            throw timeunit;
        }

        public void unlock()
        {
            super.unlock();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycledetectingreentrantreadwritelock)
        {
            this$0 = CycleDetectingLockFactory.this;
            super(cycledetectingreentrantreadwritelock);
            readWriteLock = cycledetectingreentrantreadwritelock;
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock
        implements CycleDetectingLock
    {

        private final LockGraphNode lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        final CycleDetectingLockFactory this$0;
        private final CycleDetectingReentrantWriteLock writeLock;

        public LockGraphNode getLockGraphNode()
        {
            return lockGraphNode;
        }

        public boolean isAcquiredByCurrentThread()
        {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        public volatile Lock readLock()
        {
            return readLock();
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock()
        {
            return readLock;
        }

        public volatile Lock writeLock()
        {
            return writeLock();
        }

        public java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock()
        {
            return writeLock;
        }

        private CycleDetectingReentrantReadWriteLock(LockGraphNode lockgraphnode, boolean flag)
        {
            this$0 = CycleDetectingLockFactory.this;
            super(flag);
            readLock = new CycleDetectingReentrantReadLock(this);
            writeLock = new CycleDetectingReentrantWriteLock(this);
            lockGraphNode = (LockGraphNode)Preconditions.checkNotNull(lockgraphnode);
        }

    }

    private class CycleDetectingReentrantWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock
    {

        final CycleDetectingReentrantReadWriteLock readWriteLock;
        final CycleDetectingLockFactory this$0;

        public void lock()
        {
            aboutToAcquire(readWriteLock);
            super.lock();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public void lockInterruptibly()
            throws InterruptedException
        {
            aboutToAcquire(readWriteLock);
            super.lockInterruptibly();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public boolean tryLock()
        {
            aboutToAcquire(readWriteLock);
            boolean flag = super.tryLock();
            lockStateChanged(readWriteLock);
            return flag;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        public boolean tryLock(long l, TimeUnit timeunit)
            throws InterruptedException
        {
            aboutToAcquire(readWriteLock);
            boolean flag = super.tryLock(l, timeunit);
            lockStateChanged(readWriteLock);
            return flag;
            timeunit;
            lockStateChanged(readWriteLock);
            throw timeunit;
        }

        public void unlock()
        {
            super.unlock();
            lockStateChanged(readWriteLock);
            return;
            Exception exception;
            exception;
            lockStateChanged(readWriteLock);
            throw exception;
        }

        CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycledetectingreentrantreadwritelock)
        {
            this$0 = CycleDetectingLockFactory.this;
            super(cycledetectingreentrantreadwritelock);
            readWriteLock = cycledetectingreentrantreadwritelock;
        }
    }

    private static class ExampleStackTrace extends IllegalStateException
    {

        static final StackTraceElement EMPTY_STACK_TRACE[] = new StackTraceElement[0];
        static Set EXCLUDED_CLASS_NAMES = ImmutableSet.of(com/google/common/util/concurrent/CycleDetectingLockFactory.getName(), com/google/common/util/concurrent/CycleDetectingLockFactory$ExampleStackTrace.getName(), com/google/common/util/concurrent/CycleDetectingLockFactory$LockGraphNode.getName());


        ExampleStackTrace(LockGraphNode lockgraphnode, LockGraphNode lockgraphnode1)
        {
            lockgraphnode = String.valueOf(String.valueOf(lockgraphnode.getLockName()));
            lockgraphnode1 = String.valueOf(String.valueOf(lockgraphnode1.getLockName()));
            super((new StringBuilder(lockgraphnode.length() + 4 + lockgraphnode1.length())).append(lockgraphnode).append(" -> ").append(lockgraphnode1).toString());
            lockgraphnode = getStackTrace();
            int i = 0;
            int j = lockgraphnode.length;
            do
            {
label0:
                {
                    if (i < j)
                    {
                        if (!com/google/common/util/concurrent/CycleDetectingLockFactory$WithExplicitOrdering.getName().equals(lockgraphnode[i].getClassName()))
                        {
                            break label0;
                        }
                        setStackTrace(EMPTY_STACK_TRACE);
                    }
                    return;
                }
                if (!EXCLUDED_CLASS_NAMES.contains(lockgraphnode[i].getClassName()))
                {
                    setStackTrace((StackTraceElement[])Arrays.copyOfRange(lockgraphnode, i, j));
                    return;
                }
                i++;
            } while (true);
        }
    }

    private static class LockGraphNode
    {

        final Map allowedPriorLocks = (new MapMaker()).weakKeys().makeMap();
        final Map disallowedPriorLocks = (new MapMaker()).weakKeys().makeMap();
        final String lockName;

        private ExampleStackTrace findPathTo(LockGraphNode lockgraphnode, Set set)
        {
            ExampleStackTrace examplestacktrace;
            if (!set.add(this))
            {
                examplestacktrace = null;
            } else
            {
                ExampleStackTrace examplestacktrace1 = (ExampleStackTrace)allowedPriorLocks.get(lockgraphnode);
                examplestacktrace = examplestacktrace1;
                if (examplestacktrace1 == null)
                {
                    for (Iterator iterator = allowedPriorLocks.entrySet().iterator(); iterator.hasNext();)
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                        LockGraphNode lockgraphnode1 = (LockGraphNode)entry.getKey();
                        ExampleStackTrace examplestacktrace2 = lockgraphnode1.findPathTo(lockgraphnode, set);
                        if (examplestacktrace2 != null)
                        {
                            lockgraphnode = new ExampleStackTrace(lockgraphnode1, this);
                            lockgraphnode.setStackTrace(((ExampleStackTrace)entry.getValue()).getStackTrace());
                            lockgraphnode.initCause(examplestacktrace2);
                            return lockgraphnode;
                        }
                    }

                    return null;
                }
            }
            return examplestacktrace;
        }

        void checkAcquiredLock(Policy policy1, LockGraphNode lockgraphnode)
        {
            Object obj;
            boolean flag;
            if (this != lockgraphnode)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = String.valueOf(lockgraphnode.getLockName());
            if (((String) (obj)).length() != 0)
            {
                obj = "Attempted to acquire multiple locks with the same rank ".concat(((String) (obj)));
            } else
            {
                obj = new String("Attempted to acquire multiple locks with the same rank ");
            }
            Preconditions.checkState(flag, obj);
            if (allowedPriorLocks.containsKey(lockgraphnode))
            {
                return;
            }
            obj = (PotentialDeadlockException)disallowedPriorLocks.get(lockgraphnode);
            if (obj != null)
            {
                policy1.handlePotentialDeadlock(new PotentialDeadlockException(lockgraphnode, this, ((PotentialDeadlockException) (obj)).getConflictingStackTrace()));
                return;
            }
            obj = lockgraphnode.findPathTo(this, Sets.newIdentityHashSet());
            if (obj == null)
            {
                allowedPriorLocks.put(lockgraphnode, new ExampleStackTrace(lockgraphnode, this));
                return;
            } else
            {
                obj = new PotentialDeadlockException(lockgraphnode, this, ((ExampleStackTrace) (obj)));
                disallowedPriorLocks.put(lockgraphnode, obj);
                policy1.handlePotentialDeadlock(((PotentialDeadlockException) (obj)));
                return;
            }
        }

        void checkAcquiredLocks(Policy policy1, List list)
        {
            int i = 0;
            for (int j = list.size(); i < j; i++)
            {
                checkAcquiredLock(policy1, (LockGraphNode)list.get(i));
            }

        }

        String getLockName()
        {
            return lockName;
        }

        LockGraphNode(String s)
        {
            lockName = (String)Preconditions.checkNotNull(s);
        }
    }

    public static abstract class Policies extends Enum
        implements Policy
    {

        private static final Policies $VALUES[];
        public static final Policies DISABLED;
        public static final Policies THROW;
        public static final Policies WARN;

        public static Policies valueOf(String s)
        {
            return (Policies)Enum.valueOf(com/google/common/util/concurrent/CycleDetectingLockFactory$Policies, s);
        }

        public static Policies[] values()
        {
            return (Policies[])$VALUES.clone();
        }

        static 
        {
            THROW = new Policies("THROW", 0) {

                public void handlePotentialDeadlock(PotentialDeadlockException potentialdeadlockexception)
                {
                    throw potentialdeadlockexception;
                }

            };
            WARN = new Policies("WARN", 1) {

                public void handlePotentialDeadlock(PotentialDeadlockException potentialdeadlockexception)
                {
                    CycleDetectingLockFactory.logger.log(Level.SEVERE, "Detected potential deadlock", potentialdeadlockexception);
                }

            };
            DISABLED = new Policies("DISABLED", 2) {

                public void handlePotentialDeadlock(PotentialDeadlockException potentialdeadlockexception)
                {
                }

            };
            $VALUES = (new Policies[] {
                THROW, WARN, DISABLED
            });
        }

        private Policies(String s, int i)
        {
            super(s, i);
        }

    }

    public static interface Policy
    {

        public abstract void handlePotentialDeadlock(PotentialDeadlockException potentialdeadlockexception);
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace
    {

        private final ExampleStackTrace conflictingStackTrace;

        public ExampleStackTrace getConflictingStackTrace()
        {
            return conflictingStackTrace;
        }

        public String getMessage()
        {
            StringBuilder stringbuilder = new StringBuilder(super.getMessage());
            for (Object obj = conflictingStackTrace; obj != null; obj = ((Throwable) (obj)).getCause())
            {
                stringbuilder.append(", ").append(((Throwable) (obj)).getMessage());
            }

            return stringbuilder.toString();
        }

        private PotentialDeadlockException(LockGraphNode lockgraphnode, LockGraphNode lockgraphnode1, ExampleStackTrace examplestacktrace)
        {
            super(lockgraphnode, lockgraphnode1);
            conflictingStackTrace = examplestacktrace;
            initCause(examplestacktrace);
        }

    }

    public static final class WithExplicitOrdering extends CycleDetectingLockFactory
    {

        private final Map lockGraphNodes;

        public ReentrantLock newReentrantLock(Enum enum)
        {
            return newReentrantLock(enum, false);
        }

        public ReentrantLock newReentrantLock(Enum enum, boolean flag)
        {
            if (policy == Policies.DISABLED)
            {
                return new ReentrantLock(flag);
            } else
            {
                return new CycleDetectingReentrantLock((LockGraphNode)lockGraphNodes.get(enum), flag);
            }
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(Enum enum)
        {
            return newReentrantReadWriteLock(enum, false);
        }

        public ReentrantReadWriteLock newReentrantReadWriteLock(Enum enum, boolean flag)
        {
            if (policy == Policies.DISABLED)
            {
                return new ReentrantReadWriteLock(flag);
            } else
            {
                return new CycleDetectingReentrantReadWriteLock((LockGraphNode)lockGraphNodes.get(enum), flag);
            }
        }

        WithExplicitOrdering(Policy policy1, Map map)
        {
            super(policy1, null);
            lockGraphNodes = map;
        }
    }


    private static final ThreadLocal acquiredLocks = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected ArrayList initialValue()
        {
            return Lists.newArrayListWithCapacity(3);
        }

    };
    private static final ConcurrentMap lockGraphNodesPerType = (new MapMaker()).weakKeys().makeMap();
    private static final Logger logger = Logger.getLogger(com/google/common/util/concurrent/CycleDetectingLockFactory.getName());
    final Policy policy;

    private CycleDetectingLockFactory(Policy policy1)
    {
        policy = (Policy)Preconditions.checkNotNull(policy1);
    }


    private void aboutToAcquire(CycleDetectingLock cycledetectinglock)
    {
        if (!cycledetectinglock.isAcquiredByCurrentThread())
        {
            ArrayList arraylist = (ArrayList)acquiredLocks.get();
            cycledetectinglock = cycledetectinglock.getLockGraphNode();
            cycledetectinglock.checkAcquiredLocks(policy, arraylist);
            arraylist.add(cycledetectinglock);
        }
    }

    static Map createNodes(Class class1)
    {
        EnumMap enummap = Maps.newEnumMap(class1);
        class1 = (Enum[])class1.getEnumConstants();
        int l = class1.length;
        ArrayList arraylist = Lists.newArrayListWithCapacity(l);
        int i1 = class1.length;
        for (int i = 0; i < i1; i++)
        {
            Enum enum = class1[i];
            LockGraphNode lockgraphnode = new LockGraphNode(getLockName(enum));
            arraylist.add(lockgraphnode);
            enummap.put(enum, lockgraphnode);
        }

        for (int j = 1; j < l; j++)
        {
            ((LockGraphNode)arraylist.get(j)).checkAcquiredLocks(Policies.THROW, arraylist.subList(0, j));
        }

        for (int k = 0; k < l - 1; k++)
        {
            ((LockGraphNode)arraylist.get(k)).checkAcquiredLocks(Policies.DISABLED, arraylist.subList(k + 1, l));
        }

        return Collections.unmodifiableMap(enummap);
    }

    private static String getLockName(Enum enum)
    {
        String s = String.valueOf(String.valueOf(enum.getDeclaringClass().getSimpleName()));
        enum = String.valueOf(String.valueOf(enum.name()));
        return (new StringBuilder(s.length() + 1 + enum.length())).append(s).append(".").append(enum).toString();
    }

    private static Map getOrCreateNodes(Class class1)
    {
        Map map = (Map)lockGraphNodesPerType.get(class1);
        if (map != null)
        {
            return map;
        } else
        {
            Map map1 = createNodes(class1);
            return (Map)MoreObjects.firstNonNull((Map)lockGraphNodesPerType.putIfAbsent(class1, map1), map1);
        }
    }

    private void lockStateChanged(CycleDetectingLock cycledetectinglock)
    {
        if (cycledetectinglock.isAcquiredByCurrentThread()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i;
        arraylist = (ArrayList)acquiredLocks.get();
        cycledetectinglock = cycledetectinglock.getLockGraphNode();
        i = arraylist.size() - 1;
_L7:
        if (i < 0) goto _L2; else goto _L3
_L3:
        if (arraylist.get(i) != cycledetectinglock) goto _L5; else goto _L4
_L4:
        arraylist.remove(i);
_L2:
        return;
_L5:
        i--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static CycleDetectingLockFactory newInstance(Policy policy1)
    {
        return new CycleDetectingLockFactory(policy1);
    }

    public static WithExplicitOrdering newInstanceWithExplicitOrdering(Class class1, Policy policy1)
    {
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(policy1);
        return new WithExplicitOrdering(policy1, getOrCreateNodes(class1));
    }

    public ReentrantLock newReentrantLock(String s)
    {
        return newReentrantLock(s, false);
    }

    public ReentrantLock newReentrantLock(String s, boolean flag)
    {
        if (policy == Policies.DISABLED)
        {
            return new ReentrantLock(flag);
        } else
        {
            return new CycleDetectingReentrantLock(new LockGraphNode(s), flag);
        }
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String s)
    {
        return newReentrantReadWriteLock(s, false);
    }

    public ReentrantReadWriteLock newReentrantReadWriteLock(String s, boolean flag)
    {
        if (policy == Policies.DISABLED)
        {
            return new ReentrantReadWriteLock(flag);
        } else
        {
            return new CycleDetectingReentrantReadWriteLock(new LockGraphNode(s), flag);
        }
    }




}
