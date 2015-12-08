// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.http.HttpRequestParams;
import com.contextlogic.wish.http.StringHttpResponseHandler;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.ui.components.text.standalonecreditcard.CreditCardContainer;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.CreditCardUtil;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class EbanxTokenService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s, String s1, String s2);
    }


    private Object requestTag;

    public EbanxTokenService()
    {
    }

    public void cancelAllRequests()
    {
        if (requestTag != null)
        {
            WishHttpClient.getInstance().cancelRequests(requestTag);
            requestTag = null;
        }
    }

    public boolean isPending()
    {
        return requestTag != null;
    }

    public void requestService(String s, int i, int j, String s1, com.contextlogic.wish.util.CreditCardUtil.CardType cardtype, WishShippingInfo wishshippinginfo, final SuccessCallback successCallback, 
            final FailureCallback failureCallback)
    {
        Object obj;
        final Object currentRequestTag;
        cancelAllRequests();
        currentRequestTag = new Object();
        requestTag = currentRequestTag;
        obj = null;
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[com.contextlogic.wish.util.CreditCardUtil.CardType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Visa.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.MasterCard.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Amex.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Discover.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.DinersClub.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.HiperCard.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Invalid.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 68
    //                   1 98
    //                   2 105
    //                   3 112
    //                   4 119
    //                   5 126
    //                   6 133;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        cardtype = obj;
_L13:
        if (cardtype != null) goto _L9; else goto _L8
_L8:
        if (failureCallback != null)
        {
            failureCallback.onServiceFailed(WishApplication.getAppInstance().getString(0x7f060247));
        }
_L11:
        return;
_L2:
        cardtype = "visa";
        continue; /* Loop/switch isn't completed */
_L3:
        cardtype = "mastercard";
        continue; /* Loop/switch isn't completed */
_L4:
        cardtype = "amex";
        continue; /* Loop/switch isn't completed */
_L5:
        cardtype = "discover";
        continue; /* Loop/switch isn't completed */
_L6:
        cardtype = "diners";
        continue; /* Loop/switch isn't completed */
_L7:
        cardtype = "hipercard";
        continue; /* Loop/switch isn't completed */
_L9:
        successCallback = new StringHttpResponseHandler() {

            final EbanxTokenService this$0;
            final Object val$currentRequestTag;
            final FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(Throwable throwable, String s2)
            {
                if (currentRequestTag == requestTag)
                {
                    requestTag = null;
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed(s2);
                    }
                }
            }

            public void onSuccess(String s2)
            {
                if (currentRequestTag != requestTag)
                {
                    break MISSING_BLOCK_LABEL_154;
                }
                requestTag = null;
                Object obj1;
                obj1 = new JSONObject(s2);
                if (((JSONObject) (obj1)).getString("status").equals("SUCCESS"))
                {
                    s2 = ((JSONObject) (obj1)).getString("token");
                    String s3 = ((JSONObject) (obj1)).getString("payment_type_code");
                    obj1 = ((JSONObject) (obj1)).getString("masked_card_number");
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded(s2, s3, ((String) (obj1)));
                        return;
                    }
                    break MISSING_BLOCK_LABEL_154;
                }
                try
                {
                    s2 = String.format("Error Code: %s. Error Message: %s.", new Object[] {
                        ((JSONObject) (obj1)).optString("status_code"), ((JSONObject) (obj1)).optString("status_message")
                    });
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed(s2);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s2)
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed(s2.getMessage());
                    }
                }
            }

            
            {
                this$0 = EbanxTokenService.this;
                currentRequestTag = obj;
                successCallback = successcallback;
                failureCallback = failurecallback;
                super();
            }
        };
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("public_integration_key", UserStatusManager.getInstance().getEbanxKey());
            jsonobject.put("payment_type_code", cardtype);
            cardtype = new JSONObject();
            cardtype.put("card_number", CreditCardUtil.sanitizeCreditCardNumber(s));
            cardtype.put("card_due_date", CreditCardContainer.getFormattedExpiryDate(i, j));
            cardtype.put("card_cvv", s1);
            if (wishshippinginfo.getName() != null)
            {
                cardtype.put("card_name", wishshippinginfo.getName());
            }
            jsonobject.put("creditcard", cardtype);
            s = new HttpRequestParams();
            s.put("request_body", jsonobject.toString());
            WishHttpClient.getInstance().post(com.contextlogic.wish.http.WishHttpClient.RequestPool.Api, requestTag, (new StringBuilder()).append(UserStatusManager.getInstance().getEbanxApiUrl()).append("token").toString(), s, successCallback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (failureCallback == null) goto _L11; else goto _L10
_L10:
        failureCallback.onServiceFailed(s.getMessage());
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }



/*
    static Object access$002(EbanxTokenService ebanxtokenservice, Object obj)
    {
        ebanxtokenservice.requestTag = obj;
        return obj;
    }

*/
}
