// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import org.apache.http.client.methods.HttpPut;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoEntityUpload

class this._cls0 extends Thread
{

    final PhotoEntityUpload this$0;

    public void run()
    {
        PhotoEntityUpload.access$200(PhotoEntityUpload.this).abort();
    }

    ()
    {
        this$0 = PhotoEntityUpload.this;
        super();
    }
}
