// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//            ANRWatchDog, ANRError

static final class RListener
    implements RListener
{

    public void onAppNotResponding(ANRError anrerror)
    {
        throw anrerror;
    }

    RListener()
    {
    }
}
