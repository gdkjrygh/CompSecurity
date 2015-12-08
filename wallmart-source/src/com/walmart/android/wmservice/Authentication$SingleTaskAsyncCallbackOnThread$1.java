// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;


// Referenced classes of package com.walmart.android.wmservice:
//            Authentication

class val.data
    implements Runnable
{

    final is._cls0 this$1;
    final Object val$data;
    final Object val$error;

    public void run()
    {
        FailureSameThread(val$error, val$data);
        Authentication.access$900(_fld0);
    }

    ()
    {
        this$1 = final_;
        val$error = obj;
        val$data = Object.this;
        super();
    }
}
