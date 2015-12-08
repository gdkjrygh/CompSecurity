// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

public static abstract class <init> extends Enum
    implements <init>
{

    private static final DISABLED $VALUES[];
    public static final DISABLED DISABLED;
    public static final DISABLED THROW;
    public static final DISABLED WARN;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/util/concurrent/CycleDetectingLockFactory$Policies, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        THROW = new CycleDetectingLockFactory.Policies("THROW", 0) {

            public void handlePotentialDeadlock(CycleDetectingLockFactory.PotentialDeadlockException potentialdeadlockexception)
            {
                throw potentialdeadlockexception;
            }

        };
        WARN = new CycleDetectingLockFactory.Policies("WARN", 1) {

            public void handlePotentialDeadlock(CycleDetectingLockFactory.PotentialDeadlockException potentialdeadlockexception)
            {
                CycleDetectingLockFactory.access$100().log(Level.SEVERE, "Detected potential deadlock", potentialdeadlockexception);
            }

        };
        DISABLED = new CycleDetectingLockFactory.Policies("DISABLED", 2) {

            public void handlePotentialDeadlock(CycleDetectingLockFactory.PotentialDeadlockException potentialdeadlockexception)
            {
            }

        };
        $VALUES = (new .VALUES[] {
            THROW, WARN, DISABLED
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
