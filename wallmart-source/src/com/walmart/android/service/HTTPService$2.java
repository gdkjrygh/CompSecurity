// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


// Referenced classes of package com.walmart.android.service:
//            HTTPService, JobRunner

class this._cls0
    implements Runnable
{

    final HTTPService this$0;

    public void run()
    {
        HTTPService.access$400(HTTPService.this).addJob(HTTPService.access$300(HTTPService.this));
    }

    ()
    {
        this$0 = HTTPService.this;
        super();
    }
}
