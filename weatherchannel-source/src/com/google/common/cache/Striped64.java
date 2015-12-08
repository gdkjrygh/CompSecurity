// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64 extends Number
{
    static final class Cell
    {

        private static final Unsafe UNSAFE;
        private static final long valueOffset;
        volatile long p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;
        volatile long q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        final boolean cas(long l, long l1)
        {
            return UNSAFE.compareAndSwapLong(this, valueOffset, l, l1);
        }

        static 
        {
            try
            {
                UNSAFE = Striped64.getUnsafe();
                valueOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64$Cell.getDeclaredField("value"));
            }
            catch (Exception exception)
            {
                throw new Error(exception);
            }
        }

        Cell(long l)
        {
            value = l;
        }
    }


    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    static final Random rng = new Random();
    static final ThreadLocal threadHashCode = new ThreadLocal();
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell cells[];

    Striped64()
    {
    }

    private static Unsafe getUnsafe()
    {
        Unsafe unsafe;
        try
        {
            unsafe = Unsafe.getUnsafe();
        }
        catch (SecurityException securityexception)
        {
            Unsafe unsafe1;
            try
            {
                unsafe1 = (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {

                    public volatile Object run()
                        throws Exception
                    {
                        return run();
                    }

                    public Unsafe run()
                        throws Exception
                    {
                        Field afield[] = sun/misc/Unsafe.getDeclaredFields();
                        int j = afield.length;
                        for (int i = 0; i < j; i++)
                        {
                            Object obj = afield[i];
                            ((Field) (obj)).setAccessible(true);
                            obj = ((Field) (obj)).get(null);
                            if (sun/misc/Unsafe.isInstance(obj))
                            {
                                return (Unsafe)sun/misc/Unsafe.cast(obj);
                            }
                        }

                        throw new NoSuchFieldError("the Unsafe");
                    }

                });
            }
            catch (PrivilegedActionException privilegedactionexception)
            {
                throw new RuntimeException("Could not initialize intrinsics", privilegedactionexception.getCause());
            }
            return unsafe1;
        }
        return unsafe;
    }

    final boolean casBase(long l, long l1)
    {
        return UNSAFE.compareAndSwapLong(this, baseOffset, l, l1);
    }

    final boolean casBusy()
    {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    abstract long fn(long l, long l1);

    final void internalReset(long l)
    {
        Cell acell[] = cells;
        base = l;
        if (acell != null)
        {
            int j = acell.length;
            for (int i = 0; i < j; i++)
            {
                Cell cell = acell[i];
                if (cell != null)
                {
                    cell.value = l;
                }
            }

        }
    }

    final void retryUpdate(long l, int ai[], boolean flag)
    {
        Cell acell[];
        Object obj;
        int k;
        int i1;
        int j1;
        int i;
        int k1;
        if (ai == null)
        {
            ThreadLocal threadlocal = threadHashCode;
            ai = new int[1];
            threadlocal.set(ai);
            i = rng.nextInt();
            if (i == 0)
            {
                i = 1;
            }
            ai[0] = i;
        } else
        {
            i = ai[0];
        }
        k = 0;
        i1 = i;
_L9:
        acell = cells;
        if (acell == null) goto _L2; else goto _L1
_L1:
        j1 = acell.length;
        if (j1 <= 0) goto _L2; else goto _L3
_L3:
        obj = acell[j1 - 1 & i1];
        if (obj != null) goto _L5; else goto _L4
_L4:
        if (busy != 0) goto _L7; else goto _L6
_L6:
        acell = new Cell(l);
        if (busy != 0 || !casBusy()) goto _L7; else goto _L8
_L8:
        j1 = 0;
        obj = cells;
        i = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        k1 = obj.length;
        i = j1;
        if (k1 > 0)
        {
            k1 = k1 - 1 & i1;
            i = j1;
            if (obj[k1] == null)
            {
                obj[k1] = acell;
                i = 1;
            }
        }
        busy = 0;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
_L12:
        return;
        ai;
        busy = 0;
        throw ai;
_L7:
        int j;
        boolean flag1;
        j = 0;
        flag1 = flag;
_L10:
        k = i1 ^ i1 << 13;
        k ^= k >>> 17;
        i1 = k ^ k << 5;
        ai[0] = i1;
        k = j;
        flag = flag1;
          goto _L9
_L5:
label0:
        {
            if (flag)
            {
                break label0;
            }
            flag1 = true;
            j = k;
        }
          goto _L10
        long l1 = ((Cell) (obj)).value;
        if (((Cell) (obj)).cas(l1, fn(l1, l))) goto _L12; else goto _L11
_L11:
        if (j1 >= NCPU || cells != acell)
        {
            j = 0;
            flag1 = flag;
        } else
        {
label1:
            {
                if (k != 0)
                {
                    break label1;
                }
                j = 1;
                flag1 = flag;
            }
        }
          goto _L10
        j = k;
        flag1 = flag;
        if (busy != 0) goto _L10; else goto _L13
_L13:
        j = k;
        flag1 = flag;
        if (!casBusy()) goto _L10; else goto _L14
_L14:
        if (cells != acell) goto _L16; else goto _L15
_L15:
        Cell acell1[] = new Cell[j1 << 1];
        j = 0;
        break MISSING_BLOCK_LABEL_528;
_L18:
        cells = acell1;
_L16:
        busy = 0;
        k = 0;
          goto _L9
        ai;
        busy = 0;
        throw ai;
_L2:
        if (busy != 0 || cells != acell || !casBusy())
        {
            break MISSING_BLOCK_LABEL_505;
        }
        j = 0;
        if (cells != acell)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        acell = new Cell[2];
        acell[i1 & 1] = new Cell(l);
        cells = acell;
        j = 1;
        busy = 0;
        if (j == 0) goto _L9; else goto _L17
_L17:
        return;
        ai;
        busy = 0;
        throw ai;
        long l2 = base;
        if (casBase(l2, fn(l2, l)))
        {
            return;
        }
          goto _L9
        while (j < j1) 
        {
            acell1[j] = acell[j];
            j++;
        }
          goto _L18
    }

    static 
    {
        try
        {
            UNSAFE = getUnsafe();
            baseOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64.getDeclaredField("base"));
            busyOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64.getDeclaredField("busy"));
        }
        catch (Exception exception)
        {
            throw new Error(exception);
        }
    }

}
