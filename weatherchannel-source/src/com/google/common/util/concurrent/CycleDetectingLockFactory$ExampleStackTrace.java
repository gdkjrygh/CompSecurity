// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

private static class setStackTrace extends IllegalStateException
{

    static final StackTraceElement EMPTY_STACK_TRACE[] = new StackTraceElement[0];
    static Set EXCLUDED_CLASS_NAMES = ImmutableSet.of(com/google/common/util/concurrent/CycleDetectingLockFactory.getName(), com/google/common/util/concurrent/CycleDetectingLockFactory$ExampleStackTrace.getName(), com/google/common/util/concurrent/CycleDetectingLockFactory$LockGraphNode.getName());


    ng(ng ng, ng ng1)
    {
        ng = String.valueOf(String.valueOf(ng.ockName()));
        ng1 = String.valueOf(String.valueOf(ng1.ockName()));
        super((new StringBuilder(ng.length() + 4 + ng1.length())).append(ng).append(" -> ").append(ng1).toString());
        ng = getStackTrace();
        int i = 0;
        int j = ng.length;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!com/google/common/util/concurrent/CycleDetectingLockFactory$WithExplicitOrdering.getName().equals(ng[i].getClassName()))
                    {
                        break label0;
                    }
                    setStackTrace(EMPTY_STACK_TRACE);
                }
                return;
            }
            if (!EXCLUDED_CLASS_NAMES.contains(ng[i].getClassName()))
            {
                setStackTrace((StackTraceElement[])Arrays.copyOfRange(ng, i, j));
                return;
            }
            i++;
        } while (true);
    }
}
