// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishWalletItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetWalletItemsService

class ccessCallback
    implements WishApiCallback
{

    final GetWalletItemsService this$0;
    final ck val$failureCallback;
    final String val$finalResponseFinishedParameter;
    final String val$finalResponseParameter;
    final ccessCallback val$successCallback;
    final com.contextlogic.wish.api.data.mType val$type;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetWalletItemsService.access$002(GetWalletItemsService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetWalletItemsService.access$002(GetWalletItemsService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
_L4:
        return;
_L2:
        ArrayList arraylist;
        wishapirequest = wishapiresponse.getData().getJSONArray(val$finalResponseParameter);
        arraylist = new ArrayList();
        int i = 0;
_L5:
        WishWalletItem wishwalletitem;
        if (i >= wishapirequest.length())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        wishwalletitem = new WishWalletItem(wishapirequest.getJSONObject(i), val$type);
        if (wishwalletitem.isExpired())
        {
            break MISSING_BLOCK_LABEL_174;
        }
        arraylist.add(wishwalletitem);
        break MISSING_BLOCK_LABEL_174;
        wishapirequest;
        if (val$failureCallback == null) goto _L4; else goto _L3
_L3:
        val$failureCallback.onServiceFailed();
        return;
        boolean flag = wishapiresponse.getData().getBoolean(val$finalResponseFinishedParameter);
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded(arraylist, flag);
            return;
        }
          goto _L4
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
          goto _L4
        i++;
          goto _L5
    }

    ccessCallback()
    {
        this$0 = final_getwalletitemsservice;
        val$failureCallback = ck;
        val$finalResponseParameter = s;
        val$type = mtype;
        val$finalResponseFinishedParameter = s1;
        val$successCallback = ccessCallback.this;
        super();
    }
}
