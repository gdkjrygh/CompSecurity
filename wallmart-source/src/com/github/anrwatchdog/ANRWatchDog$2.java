// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;

import android.util.Log;

// Referenced classes of package com.github.anrwatchdog:
//            ANRWatchDog

static final class terruptionListener
    implements terruptionListener
{

    public void onInterrupted(InterruptedException interruptedexception)
    {
        Log.w("ANRWatchdog", (new StringBuilder()).append("Interrupted: ").append(interruptedexception.getMessage()).toString());
    }

    terruptionListener()
    {
    }
}
