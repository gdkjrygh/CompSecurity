// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            VideoInterruptManager

final class ax
    implements Runnable
{

    final VideoInterruptManager a;

    ax(VideoInterruptManager videointerruptmanager)
    {
        a = videointerruptmanager;
        super();
    }

    public final void run()
    {
        VideoInterruptManager.a(a);
    }
}
