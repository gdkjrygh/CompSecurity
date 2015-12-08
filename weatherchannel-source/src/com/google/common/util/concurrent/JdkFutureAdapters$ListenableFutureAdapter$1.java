// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            JdkFutureAdapters, Uninterruptibles, ExecutionList

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        try
        {
            Uninterruptibles.getUninterruptibly(cess._mth000(this._cls0.this));
        }
        catch (Error error)
        {
            throw error;
        }
        catch (Throwable throwable) { }
        cess._mth100(this._cls0.this).execute();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
