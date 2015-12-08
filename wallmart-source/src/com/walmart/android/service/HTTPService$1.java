// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


// Referenced classes of package com.walmart.android.service:
//            CancellableRunnable, HTTPService, DataCache, Utils

class this._cls0
    implements CancellableRunnable
{

    private boolean once;
    final HTTPService this$0;

    public boolean cancel()
    {
        return false;
    }

    public void run()
    {
        if (!once)
        {
            HTTPService.access$000(HTTPService.this).cleanup();
            once = true;
        } else
        {
            HTTPService.access$000(HTTPService.this).cleanupIfLargerThan(0x500000L);
        }
        if (Utils.isInForeground(HTTPService.access$100(HTTPService.this)))
        {
            HTTPService.access$200(HTTPService.this);
        }
    }

    nable()
    {
        this$0 = HTTPService.this;
        super();
    }
}
