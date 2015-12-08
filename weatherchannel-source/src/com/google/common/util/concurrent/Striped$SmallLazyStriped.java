// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

static class supplier extends 
{
    private static final class ArrayReference extends WeakReference
    {

        final int index;

        ArrayReference(Object obj, int i, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            index = i;
        }
    }


    final AtomicReferenceArray locks;
    final ReferenceQueue queue = new ReferenceQueue();
    final int size;
    final Supplier supplier;

    private void drainQueue()
    {
        do
        {
            Object obj = queue.poll();
            if (obj != null)
            {
                obj = (ArrayReference)obj;
                locks.compareAndSet(((ArrayReference) (obj)).index, obj, null);
            } else
            {
                return;
            }
        } while (true);
    }

    public Object getAt(int i)
    {
        if (size != 0x7fffffff)
        {
            Preconditions.checkElementIndex(i, size());
        }
        ArrayReference arrayreference = (ArrayReference)locks.get(i);
        Object obj;
        if (arrayreference == null)
        {
            obj = null;
        } else
        {
            obj = arrayreference.get();
        }
        if (obj != null)
        {
            return obj;
        }
        Object obj2 = supplier.get();
        for (ArrayReference arrayreference1 = new ArrayReference(obj2, i, queue); !locks.compareAndSet(i, arrayreference, arrayreference1);)
        {
            arrayreference = (ArrayReference)locks.get(i);
            Object obj1;
            if (arrayreference == null)
            {
                obj1 = null;
            } else
            {
                obj1 = arrayreference.get();
            }
            if (obj1 != null)
            {
                return obj1;
            }
        }

        drainQueue();
        return obj2;
    }

    public int size()
    {
        return size;
    }

    ArrayReference.index(int i, Supplier supplier1)
    {
        super(i);
        if (mask == -1)
        {
            i = 0x7fffffff;
        } else
        {
            i = mask + 1;
        }
        size = i;
        locks = new AtomicReferenceArray(size);
        supplier = supplier1;
    }
}
