// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.FullWallet;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class InitiateGoogleWalletStripePaymentService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s);
    }


    private WishApiRequest apiRequest;

    public InitiateGoogleWalletStripePaymentService()
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

    public void requestService(String s, String s1, FullWallet fullwallet, String s2, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        String s3 = fullwallet.getShippingAddress().getName();
        String s4 = fullwallet.getShippingAddress().getAddress1();
        String s5 = fullwallet.getShippingAddress().getAddress2();
        String s6 = fullwallet.getShippingAddress().getCity();
        String s7 = fullwallet.getShippingAddress().getState();
        String s8 = fullwallet.getShippingAddress().getPostalCode();
        String s9 = fullwallet.getShippingAddress().getCountryCode();
        String s10 = fullwallet.getShippingAddress().getPhoneNumber();
        String s11 = fullwallet.getBillingAddress().getPostalCode();
        String s12 = fullwallet.getEmail();
        fullwallet = new ArrayList(Arrays.asList(fullwallet.getPaymentDescriptions()));
        apiRequest = WishApi.getInstance().initiateGoogleWalletStripePayment(s3, s4, s5, s6, s7, s8, s9, s10, s, s1, s11, s12, fullwallet, s2, new WishApiCallback() {

            final InitiateGoogleWalletStripePaymentService this$0;
            final FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                Object obj = null;
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    wishapirequest = obj;
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                wishapirequest = null;
                apiRequest = null;
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        if (wishapiresponse != null)
                        {
                            wishapirequest = wishapiresponse.getMessage();
                        }
                        failureCallback.onServiceFailed(wishapirequest);
                    }
                } else
                {
                    try
                    {
                        wishapirequest = wishapiresponse.getData().getString("transaction_id");
                        if (successCallback != null)
                        {
                            successCallback.onServiceSucceeded(wishapirequest);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed(null);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed(null);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = InitiateGoogleWalletStripePaymentService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(InitiateGoogleWalletStripePaymentService initiategooglewalletstripepaymentservice, WishApiRequest wishapirequest)
    {
        initiategooglewalletstripepaymentservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
