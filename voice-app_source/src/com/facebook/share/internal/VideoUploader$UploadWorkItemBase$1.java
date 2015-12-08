// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

class this._cls1
    implements Runnable
{

    final mpletedRetries this$1;

    public void run()
    {
        queueRetry(mpletedRetries + 1);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
