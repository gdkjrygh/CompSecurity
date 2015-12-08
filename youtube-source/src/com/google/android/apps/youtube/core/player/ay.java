// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            VideoInterruptManager, ba

final class ay
    implements Runnable
{

    final ba a;
    final VideoInterruptManager b;

    ay(VideoInterruptManager videointerruptmanager, ba ba)
    {
        b = videointerruptmanager;
        a = ba;
        super();
    }

    public final void run()
    {
        VideoInterruptManager.a(b, a);
    }
}
