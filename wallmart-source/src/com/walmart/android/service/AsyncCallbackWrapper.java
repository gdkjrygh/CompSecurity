// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.kangaroo.Callback;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.service:
//            AsyncCallback

public class AsyncCallbackWrapper
    implements Callback
{

    private final AsyncCallback mAsyncCallback;

    public AsyncCallbackWrapper(AsyncCallback asynccallback)
    {
        mAsyncCallback = asynccallback;
    }

    public static Integer translateError(Result result)
    {
        if (!result.hasError()) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$walmartlabs$kangaroo$Result$Error[];

            static 
            {
                $SwitchMap$com$walmartlabs$kangaroo$Result$Error = new int[com.walmartlabs.kangaroo.Result.Error.values().length];
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_CONNECT_UNCLASSIFIED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_NOT_CONNECTED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_TIMEOUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_CONNECT_OTHER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_OUT_OF_MEMORY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmartlabs$kangaroo$Result$Error[com.walmartlabs.kangaroo.Result.Error.ERROR_UNKNOWN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.walmartlabs.kangaroo.Result.Error[result.getError().ordinal()];
        JVM INSTR tableswitch 1 6: default 56
    //                   1 64
    //                   2 64
    //                   3 64
    //                   4 64
    //                   5 70
    //                   6 70;
           goto _L3 _L4 _L4 _L4 _L4 _L5 _L5
_L3:
        int i = 0x15f91;
_L7:
        return Integer.valueOf(i);
_L4:
        i = 0x15f92;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x15f93;
        continue; /* Loop/switch isn't completed */
_L2:
        i = result.getStatusCode();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onCancelled(Request request)
    {
        if (mAsyncCallback != null)
        {
            mAsyncCallback.onCancelled();
        }
    }

    public void onResult(Request request, Result result)
    {
label0:
        {
            if (mAsyncCallback != null)
            {
                if (!result.successful() || !result.hasData())
                {
                    break label0;
                }
                mAsyncCallback.onSuccess(result.getData());
            }
            return;
        }
        mAsyncCallback.onFailure(translateError(result), result.getData());
    }
}
