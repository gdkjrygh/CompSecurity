// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.user.LoggedInUser;
import com.facebook.AppEventsLogger;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class ProductWishService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed();
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private ConcurrentHashMap apiRequestMap;

    public ProductWishService()
    {
        apiRequestMap = new ConcurrentHashMap();
    }

    public void cancelAllRequests()
    {
        for (Iterator iterator = apiRequestMap.entrySet().iterator(); iterator.hasNext(); ((WishApiRequest)((java.util.Map.Entry)iterator.next()).getValue()).cancel()) { }
        apiRequestMap.clear();
    }

    public boolean isPending(String s)
    {
        return apiRequestMap.containsKey(s);
    }

    public void requestService(final WishProduct product, String s, boolean flag, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        final String productId = product.getProductId();
        product = WishApi.getInstance().wishForProduct(productId, s, flag, new WishApiCallback() {

            final ProductWishService this$0;
            final FailureCallback val$failureCallback;
            final WishProduct val$product;
            final String val$productId;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequestMap.remove(productId);
                if (wishapiresponse != null && wishapiresponse.getCode() == 10)
                {
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductWish(product);
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                    }
                } else
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequestMap.remove(productId);
                if (wishapiresponse.isErrorResponse() && wishapiresponse.getCode() != 10)
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForProductWish(product);
                    try
                    {
                        FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_add_to_wishlist");
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest) { }
                    LoggedInUser.getInstance().refreshProfile();
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                        return;
                    }
                }
            }

            
            {
                this$0 = ProductWishService.this;
                productId = s;
                failureCallback = failurecallback;
                product = wishproduct;
                successCallback = successcallback;
                super();
            }
        });
        apiRequestMap.put(productId, product);
    }

}
