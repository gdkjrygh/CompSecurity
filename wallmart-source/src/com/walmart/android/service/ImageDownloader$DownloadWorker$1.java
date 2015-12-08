// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.os.Handler;

// Referenced classes of package com.walmart.android.service:
//            ImageDownloader

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        cess._mth900(this._cls1.this);
        ImageDownloader.access$1100(_fld0).post(ImageDownloader.access$1000(_fld0));
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
