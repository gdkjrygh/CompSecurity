// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetLoggedOutExperimentsService

class ccessCallback
    implements WishApiCallback
{

    final GetLoggedOutExperimentsService this$0;
    final iceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetLoggedOutExperimentsService.access$002(GetLoggedOutExperimentsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.iceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetLoggedOutExperimentsService.access$002(GetLoggedOutExperimentsService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.iceFailed();
        }
_L4:
        return;
_L2:
        boolean flag;
        wishapirequest = new HashMap();
        wishapiresponse = wishapiresponse.getData();
        if (!wishapiresponse.has("experiments"))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = wishapiresponse.isNull("experiments");
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        wishapiresponse = wishapiresponse.getJSONObject("experiments");
        String s;
        for (Iterator iterator = wishapiresponse.keys(); iterator.hasNext(); wishapirequest.put(s, wishapiresponse.getString(s)))
        {
            s = (String)iterator.next();
        }

        continue; /* Loop/switch isn't completed */
        wishapiresponse;
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.iceFailed();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_getloggedoutexperimentsservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
