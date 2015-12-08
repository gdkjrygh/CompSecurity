// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishWalletItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetWalletItemsService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag);
    }


    private WishApiRequest apiRequest;

    public GetWalletItemsService()
    {
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null;
    }

    public void requestService(final com.contextlogic.wish.api.data.WishWalletItem.WalletItemType type, int i, int j, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        final String finalResponseFinishedParameter;
        final String finalResponseParameter;
        int k;
        cancelAllRequests();
        k = 0;
        finalResponseParameter = null;
        finalResponseFinishedParameter = null;
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType = new int[com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.GiftCard.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$data$WishWalletItem$WalletItemType[com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.ExpiredGiftCard.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.api.data.WishWalletItem.WalletItemType[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 76
    //                   2 90;
           goto _L1 _L2 _L3
_L1:
        apiRequest = WishApi.getInstance().getWalletItems(k, i, j, new WishApiCallback() {

            final GetWalletItemsService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final String val$finalResponseFinishedParameter;
            final String val$finalResponseParameter;
            final SuccessCallback val$successCallback;
            final com.contextlogic.wish.api.data.WishWalletItem.WalletItemType val$type;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
_L4:
                return;
_L2:
                ArrayList arraylist;
                wishapirequest = wishapiresponse.getData().getJSONArray(finalResponseParameter);
                arraylist = new ArrayList();
                int l = 0;
_L5:
                WishWalletItem wishwalletitem;
                if (l >= wishapirequest.length())
                {
                    break MISSING_BLOCK_LABEL_123;
                }
                wishwalletitem = new WishWalletItem(wishapirequest.getJSONObject(l), type);
                if (wishwalletitem.isExpired())
                {
                    break MISSING_BLOCK_LABEL_174;
                }
                arraylist.add(wishwalletitem);
                break MISSING_BLOCK_LABEL_174;
                wishapirequest;
                if (failureCallback == null) goto _L4; else goto _L3
_L3:
                failureCallback.onServiceFailed();
                return;
                boolean flag = wishapiresponse.getData().getBoolean(finalResponseFinishedParameter);
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(arraylist, flag);
                    return;
                }
                  goto _L4
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L4
                l++;
                  goto _L5
            }

            
            {
                this$0 = GetWalletItemsService.this;
                failureCallback = failurecallback;
                finalResponseParameter = s;
                type = walletitemtype;
                finalResponseFinishedParameter = s1;
                successCallback = successcallback;
                super();
            }
        });
        return;
_L2:
        k = 2;
        finalResponseParameter = "user_credit_rebates_json";
        finalResponseFinishedParameter = "user_credit_rebates_end";
        continue; /* Loop/switch isn't completed */
_L3:
        k = 3;
        finalResponseParameter = "expired_user_credit_rebates_json";
        finalResponseFinishedParameter = "expired_user_credit_rebates_end";
        if (true) goto _L1; else goto _L4
_L4:
    }


/*
    static WishApiRequest access$002(GetWalletItemsService getwalletitemsservice, WishApiRequest wishapirequest)
    {
        getwalletitemsservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
