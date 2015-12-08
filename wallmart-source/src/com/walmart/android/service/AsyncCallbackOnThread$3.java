// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


// Referenced classes of package com.walmart.android.service:
//            AsyncCallbackOnThread

class this._cls0
    implements Runnable
{

    final AsyncCallbackOnThread this$0;

    public void run()
    {
        onCancelledSameThread();
    }

    _cls9()
    {
        this$0 = AsyncCallbackOnThread.this;
        super();
    }
}
