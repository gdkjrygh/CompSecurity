// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.LocalBackgroundNotificationSpec;
import com.contextlogic.wish.api.data.WishGoogleAppIndexingData;
import com.contextlogic.wish.api.data.WishInviteLinkSpec;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishPaymentProcessorData;
import com.contextlogic.wish.api.data.WishTopSearchSpec;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetUserStatusService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public GetUserStatusService()
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

    public void requestService(boolean flag, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        boolean flag1;
        if (!UserStatusManager.getInstance().isShippingDataFetched() || UserStatusManager.getInstance().getShippingLocations() == null || UserStatusManager.getInstance().getShippingLocations().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        apiRequest = WishApi.getInstance().getUserStatus(flag1, flag, new WishApiCallback() {

            final GetUserStatusService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
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
                Object obj;
                Object obj1;
                int i;
                int j;
                int k;
                int l;
                i = wishapiresponse.getData().getInt("unviewed_noti_count");
                j = wishapiresponse.getData().optInt("cart_items");
                k = wishapiresponse.getData().optInt("wallet_item_count");
                wishapirequest = new WishLocalizedCurrencyValue(wishapiresponse.getData().optDouble("remaining_credits", 0.0D), wishapiresponse.getData().optJSONObject("localized_remaining_credits"));
                l = wishapiresponse.getData().optInt("upcoming_birthday_count", 0);
                obj = wishapiresponse.getData().optJSONObject("mobile_experiments");
                obj1 = new HashMap();
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_191;
                }
                String s3;
                for (Iterator iterator1 = ((JSONObject) (obj)).keys(); iterator1.hasNext(); ((HashMap) (obj1)).put(s3, ((JSONObject) (obj)).getString(s3)))
                {
                    s3 = (String)iterator1.next();
                }

                break MISSING_BLOCK_LABEL_191;
                wishapirequest;
                if (failureCallback == null) goto _L4; else goto _L3
_L3:
                failureCallback.onServiceFailed();
                return;
                ApiDataChangeNotificationManager.getInstance().notifyListenersForupcomingBirthdayCount(l);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForNotificationCount(i);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForCartCount(j);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForExperiment(((HashMap) (obj1)));
                ApiDataChangeNotificationManager.getInstance().notifyListenersForRemainingCredit(wishapirequest);
                ApiDataChangeNotificationManager.getInstance().notifyListenersForWalletCount(k);
                if (wishapiresponse.getData().has("settings") && !wishapiresponse.getData().isNull("settings"))
                {
                    UserStatusManager.getInstance().setSettingsSpec(wishapiresponse.getData().getJSONArray("settings"));
                }
                if (!wishapiresponse.getData().has("local_background_notification_spec") || wishapiresponse.getData().isNull("local_background_notification_spec")) goto _L6; else goto _L5
_L5:
                wishapirequest = new LocalBackgroundNotificationSpec(wishapiresponse.getData().getJSONObject("local_background_notification_spec"));
                UserStatusManager.getInstance().setLocalBackgroundNotificationSpec(wishapirequest);
_L14:
                if (!wishapiresponse.getData().has("invite_link_spec") || wishapiresponse.getData().isNull("invite_link_spec")) goto _L8; else goto _L7
_L7:
                wishapirequest = new WishInviteLinkSpec(wishapiresponse.getData().getJSONObject("invite_link_spec"));
                UserStatusManager.getInstance().setInviteLinkSpec(wishapirequest);
_L16:
                if (!wishapiresponse.getData().has("payment_processor_data") || wishapiresponse.getData().isNull("payment_processor_data")) goto _L10; else goto _L9
_L9:
                wishapirequest = new WishPaymentProcessorData(wishapiresponse.getData().getJSONObject("payment_processor_data"));
                UserStatusManager.getInstance().setPaymentProcessorData(wishapirequest);
_L17:
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("google_appindexing_data"))
                {
                    break MISSING_BLOCK_LABEL_468;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("google_appindexing_data"))
                {
                    wishapirequest = new WishGoogleAppIndexingData(wishapiresponse.getData().getJSONObject("google_appindexing_data"));
                }
                UserStatusManager.getInstance().setGoogleAppIndexingData(wishapirequest);
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("gwallet_offer_text"))
                {
                    break MISSING_BLOCK_LABEL_515;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("gwallet_offer_text"))
                {
                    wishapirequest = wishapiresponse.getData().getString("gwallet_offer_text");
                }
                UserStatusManager.getInstance().setGoogleWalletOfferText(wishapirequest);
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("billing_security_title"))
                {
                    break MISSING_BLOCK_LABEL_562;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("billing_security_title"))
                {
                    wishapirequest = wishapiresponse.getData().getString("billing_security_title");
                }
                UserStatusManager.getInstance().setBillingSecurityTitle(wishapirequest);
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("billing_security_text"))
                {
                    break MISSING_BLOCK_LABEL_609;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("billing_security_text"))
                {
                    wishapirequest = wishapiresponse.getData().getString("billing_security_text");
                }
                UserStatusManager.getInstance().setBillingSecurityText(wishapirequest);
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("klarna_country_code"))
                {
                    break MISSING_BLOCK_LABEL_656;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("klarna_country_code"))
                {
                    wishapirequest = wishapiresponse.getData().getString("klarna_country_code");
                }
                UserStatusManager.getInstance().setKlarnaCountryCode(wishapirequest);
                wishapirequest = new ArrayList();
                if (!wishapiresponse.getData().has("top_searches") || wishapiresponse.getData().isNull("top_searches")) goto _L12; else goto _L11
_L11:
                obj = wishapiresponse.getData().getJSONArray("top_searches");
                i = 0;
_L13:
                if (i >= ((JSONArray) (obj)).length())
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapirequest.add(new WishTopSearchSpec(((JSONArray) (obj)).getJSONObject(i)));
                i++;
                if (true) goto _L13; else goto _L12
_L6:
                UserStatusManager.getInstance().setLocalBackgroundNotificationSpec(null);
                  goto _L14
                wishapirequest;
                if (failureCallback == null) goto _L4; else goto _L15
_L15:
                failureCallback.onServiceFailed();
                return;
_L8:
                UserStatusManager.getInstance().setInviteLinkSpec(null);
                  goto _L16
_L10:
                UserStatusManager.getInstance().setPaymentProcessorData(null);
                  goto _L17
_L12:
                UserStatusManager.getInstance().setTopSearchSpecs(wishapirequest);
                obj = null;
                obj1 = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("invite_message"))
                {
                    break MISSING_BLOCK_LABEL_845;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("invite_message"))
                {
                    wishapirequest = wishapiresponse.getData().getString("invite_message");
                }
                obj = obj1;
                if (!wishapiresponse.getData().has("invite_subject"))
                {
                    break MISSING_BLOCK_LABEL_888;
                }
                obj = obj1;
                if (!wishapiresponse.getData().isNull("invite_subject"))
                {
                    obj = wishapiresponse.getData().getString("invite_subject");
                }
                UserStatusManager.getInstance().setInviteText(((String) (obj)), wishapirequest);
                wishapirequest = new HashMap();
                if (wishapiresponse.getData().has("shipping_warning_messages") && !wishapiresponse.getData().isNull("shipping_warning_messages"))
                {
                    obj = wishapiresponse.getData().getJSONObject("shipping_warning_messages");
                    String s;
                    for (obj1 = ((JSONObject) (obj)).keys(); ((Iterator) (obj1)).hasNext(); wishapirequest.put(s, ((JSONObject) (obj)).getString(s)))
                    {
                        s = (String)((Iterator) (obj1)).next();
                    }

                }
                UserStatusManager.getInstance().setShippingWarningMessages(wishapirequest);
                if (!wishapiresponse.getData().has("shipping_location_data"))
                {
                    break MISSING_BLOCK_LABEL_1138;
                }
                wishapirequest = new HashMap();
                obj = wishapiresponse.getData().getJSONObject("shipping_location_data");
                obj1 = ((JSONObject) (obj)).keys();
_L21:
                String s1;
                JSONArray jsonarray;
                ArrayList arraylist;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_1124;
                }
                s1 = (String)((Iterator) (obj1)).next();
                jsonarray = ((JSONObject) (obj)).getJSONArray(s1);
                arraylist = new ArrayList();
                if (jsonarray == null) goto _L19; else goto _L18
_L18:
                i = 0;
_L20:
                if (i >= jsonarray.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                arraylist.add(jsonarray.get(i).toString());
                i++;
                if (true) goto _L20; else goto _L19
_L19:
                wishapirequest.put(s1, arraylist);
                  goto _L21
                UserStatusManager.getInstance().setShippingLocations(wishapirequest);
                UserStatusManager.getInstance().setShippingDataFetched(true);
                if (!wishapiresponse.getData().has("country_subdivision_names"))
                {
                    break MISSING_BLOCK_LABEL_1221;
                }
                wishapirequest = new HashMap();
                obj = wishapiresponse.getData().getJSONObject("country_subdivision_names");
                String s2;
                for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); wishapirequest.put(s2, ((JSONObject) (obj)).getString(s2)))
                {
                    s2 = (String)iterator.next();
                }

                UserStatusManager.getInstance().setCountrySubdivisionNames(wishapirequest);
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("lemmings_url"))
                {
                    break MISSING_BLOCK_LABEL_1264;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("lemmings_url"))
                {
                    wishapirequest = wishapiresponse.getData().getString("lemmings_url");
                }
                UserStatusManager.getInstance().setLemmingsUrl(wishapirequest);
                wishapirequest = new ArrayList();
                if (!wishapiresponse.getData().has("resized_product_image_paths") || wishapiresponse.getData().isNull("resized_product_image_paths")) goto _L23; else goto _L22
_L22:
                wishapiresponse = wishapiresponse.getData().getJSONArray("resized_product_image_paths");
                i = 0;
_L24:
                if (i >= wishapiresponse.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapirequest.add(wishapiresponse.getString(i));
                i++;
                if (true) goto _L24; else goto _L23
_L23:
                UserStatusManager.getInstance().setResizeUrls(wishapirequest);
                UserStatusManager.getInstance().serialize();
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded();
                    return;
                }
                  goto _L4
            }

            
            {
                this$0 = GetUserStatusService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetUserStatusService getuserstatusservice, WishApiRequest wishapirequest)
    {
        getuserstatusservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
