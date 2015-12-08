// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//            ANRWatchDog

class this._cls0
    implements Runnable
{

    final ANRWatchDog this$0;

    public void run()
    {
        ANRWatchDog.access$002(ANRWatchDog.this, (ANRWatchDog.access$000(ANRWatchDog.this) + 1) % 10);
    }

    ()
    {
        this$0 = ANRWatchDog.this;
        super();
    }
}
