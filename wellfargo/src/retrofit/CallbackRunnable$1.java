// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            CallbackRunnable, ResponseWrapper, Callback

class val.wrapper
    implements Runnable
{

    final CallbackRunnable this$0;
    final ResponseWrapper val$wrapper;

    public void run()
    {
        CallbackRunnable.access$000(CallbackRunnable.this).success(val$wrapper.responseBody, val$wrapper.response);
    }

    ()
    {
        this$0 = final_callbackrunnable;
        val$wrapper = ResponseWrapper.this;
        super();
    }
}
