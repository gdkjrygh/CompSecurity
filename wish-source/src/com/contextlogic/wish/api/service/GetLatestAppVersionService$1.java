// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetLatestAppVersionService

class ccessCallback
    implements WishApiCallback
{

    final GetLatestAppVersionService this$0;
    final ServiceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetLatestAppVersionService.access$002(GetLatestAppVersionService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.ServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetLatestAppVersionService.access$002(GetLatestAppVersionService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.ServiceFailed();
        }
_L4:
        return;
_L2:
        wishapirequest = wishapiresponse.getData().getString("version");
        wishapiresponse = WishApplication.getAppInstance().getVersionNumber();
        boolean flag;
        boolean flag1 = false;
        flag = flag1;
        if (wishapiresponse == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (StringUtil.compareVersionStrings(wishapirequest, wishapiresponse) > 0)
        {
            flag = true;
        }
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishapirequest, flag);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.ServiceFailed();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_getlatestappversionservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
