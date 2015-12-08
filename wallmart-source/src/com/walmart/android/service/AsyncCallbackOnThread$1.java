// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


// Referenced classes of package com.walmart.android.service:
//            AsyncCallbackOnThread

class val.data
    implements Runnable
{

    final AsyncCallbackOnThread this$0;
    final Object val$data;
    final Object val$error;

    public void run()
    {
        onFailureSameThread(val$error, val$data);
    }

    _cls9()
    {
        this$0 = final_asynccallbackonthread;
        val$error = obj;
        val$data = Object.this;
        super();
    }
}
