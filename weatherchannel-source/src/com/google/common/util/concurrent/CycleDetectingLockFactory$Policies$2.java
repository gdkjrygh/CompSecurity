// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

static final class nit> extends nit>
{

    public void handlePotentialDeadlock(adlockException adlockexception)
    {
        CycleDetectingLockFactory.access$100().log(Level.SEVERE, "Detected potential deadlock", adlockexception);
    }

    adlockException(String s, int i)
    {
        super(s, i, null);
    }
}
