// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            PriorityFutureTask, PriorityAsyncTask, Dependency

class this._cls0 extends PriorityFutureTask
{

    final this._cls0 this$0;

    public Dependency getDelegate()
    {
        return cess._mth000(this._cls0.this);
    }

    (Runnable runnable, Object obj)
    {
        this$0 = this._cls0.this;
        super(runnable, obj);
    }
}
