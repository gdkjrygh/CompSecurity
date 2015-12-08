// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            MediaItem, MediaAnalytics

class this._cls0
    implements Runnable
{

    final nitorMediaItem this$0;

    public void run()
    {
        nitorMediaItem.mediaAnalytics.monitor(nitorMediaItem.name, -1D);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
