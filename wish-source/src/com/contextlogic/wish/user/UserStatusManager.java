// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.user;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.LocalBackgroundNotificationSpec;
import com.contextlogic.wish.api.data.WishGoogleAppIndexingData;
import com.contextlogic.wish.api.data.WishInviteLinkSpec;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishPaymentProcessorData;
import com.contextlogic.wish.api.data.WishSettingsSpec;
import com.contextlogic.wish.api.data.WishTopSearchSpec;
import com.contextlogic.wish.api.service.GetUserStatusService;
import com.contextlogic.wish.util.StateSerializer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.user:
//            UserPreferences, LoggedInUser

public class UserStatusManager
    implements ApiDataChangeNotificationListener
{
    class RefreshRunnable
        implements Runnable
    {

        final UserStatusManager this$0;

        private void requestComplete()
        {
            runnableRunning = false;
            repostRunnableWithDelay(30000L);
        }

        public void run()
        {
            if (runnableRunning)
            {
                return;
            }
            if (!LoggedInUser.getInstance().isLoggedIn() || !WishApplication.getAppInstance().inForeground())
            {
                stopStatusRefresh();
                return;
            } else
            {
                runnableRunning = true;
                refreshStatus();
                requestComplete();
                return;
            }
        }

        RefreshRunnable()
        {
            this$0 = UserStatusManager.this;
            super();
        }
    }


    public static final String EXPERIMENT_BUCKET_CONTROL = "control";
    public static final String EXPERIMENT_BUCKET_HIDE = "hide";
    public static final String EXPERIMENT_BUCKET_IGNORE = "ignore";
    public static final String EXPERIMENT_BUCKET_NEW = "new";
    public static final String EXPERIMENT_BUCKET_SHOW = "show";
    public static final String EXPERIMENT_BUCKET_SHOW_V2 = "show-v2";
    public static final String EXPERIMENT_NAME_BOLETO_CHECKOUT = "mobile_boleto_checkout";
    public static final String EXPERIMENT_NAME_FUTURE_PAYPAL_CHECKOUT = "mobile_future_paypal_checkout";
    public static final String EXPERIMENT_NAME_GOOGLE_CHECKOUT = "mobile_google_checkout";
    public static final String EXPERIMENT_NAME_GOOGLE_WALLET_DEFAULT = "mobile_default_google_wallet";
    public static final String EXPERIMENT_NAME_HIDE_CC_CHECKOUT = "mobile_hide_cc_checkout";
    public static final String EXPERIMENT_NAME_HIDE_PAYPAL = "mobile_hide_paypal";
    public static final String EXPERIMENT_NAME_KLARNA_BANNER_DETAILS = "mobile_klarna_banner_details";
    public static final String EXPERIMENT_NAME_KLARNA_CHECKOUT = "mobile_klarna_checkout";
    public static final String EXPERIMENT_NAME_KLARNA_GB_IMPROVEMENT = "mobile_klarna_checkout_GB_improvement";
    public static final String EXPERIMENT_NAME_LOCALIZED_CURRENCY = "mobile_localized_currency";
    public static final String EXPERIMENT_NAME_NATIVE_PAYPAL = "mobile_native_paypal";
    public static final String EXPERIMENT_NAME_OXXO_CHECKOUT = "mobile_oxxo_checkout";
    public static final String EXPERIMENT_NAME_PSUEDO_LOCALIZED_CURRENCY = "mobile_psuedo_localized_currency";
    public static final String EXPERIMENT_NAME_SIMPLE_FEED_TILE = "mobile_simple_feed_tile";
    public static final String EXPERIMENT_NAME_WISHLIST_V2 = "mobile_wishlist_v2";
    private static final int REFRESH_DELAY = 30000;
    private static UserStatusManager _instance = new UserStatusManager();
    private String billingSecurityText;
    private String billingSecurityTitle;
    private int cartCount;
    private HashMap countrySubdivisionNames;
    private HashMap experiments;
    private GetUserStatusService getUserStatusService;
    private WishGoogleAppIndexingData googleAppIndexingData;
    private String googleWalletOfferText;
    private Handler handler;
    private WishInviteLinkSpec inviteLinkSpec;
    private String inviteMessage;
    private String inviteSubject;
    private String klarnaCountryCode;
    private String lemmingsUrl;
    private LocalBackgroundNotificationSpec localBackgroundNotificationSpec;
    private WishPaymentProcessorData paymentProcessorData;
    private RefreshRunnable refreshRunnable;
    private WishLocalizedCurrencyValue remainingCredit;
    private ArrayList resizeUrls;
    private boolean runnableRunning;
    private ArrayList settings;
    private boolean shippingDataFetched;
    private HashMap shippingLocations;
    private HashMap shippingWarningMessages;
    private ArrayList topSearchSpecs;
    private int unviewedNotificationCount;
    private int upcomingBirthdayCount;
    private int walletCount;

    private UserStatusManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        runnableRunning = false;
        getUserStatusService = new GetUserStatusService();
        experiments = new HashMap();
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.NotificationCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.CartCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Experiment, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.RemainingCredit, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UpcomingBirthdayCount, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.WalletCount, this);
    }

    public static UserStatusManager getInstance()
    {
        return _instance;
    }

    private void loadDefaultSettingsSpec()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new WishSettingsSpec("Rate App", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://rate-app").toString()));
        arraylist.add(new WishSettingsSpec("Emails", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://m/settings").toString()));
        arraylist.add(new WishSettingsSpec("Push Notifications", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://push-notifications").toString()));
        arraylist.add(new WishSettingsSpec("Data Control", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://data-control").toString()));
        arraylist.add(new WishSettingsSpec("Terms of Services", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://m/terms").toString()));
        arraylist.add(new WishSettingsSpec("Privacy Policy", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://m/privacy_policy").toString()));
        arraylist.add(new WishSettingsSpec("Return Policy", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://m/return_policy").toString()));
        arraylist.add(new WishSettingsSpec("Update Profile", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://update-profile").toString()));
        arraylist.add(new WishSettingsSpec("Change Password", (new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://change-password").toString()));
        settings = arraylist;
    }

    private void repostRunnableWithDelay(long l)
    {
        if (refreshRunnable != null)
        {
            handler.postDelayed(refreshRunnable, l);
        }
    }

    public void decrementUnviewedNotifications()
    {
        unviewedNotificationCount = Math.max(0, unviewedNotificationCount - 1);
        ApiDataChangeNotificationManager.getInstance().notifyListenersForNotificationCount(unviewedNotificationCount);
    }

    public boolean deserialize()
    {
        if (!UserPreferences.getForceRelogin()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        obj4 = null;
        Object obj = WishApplication.getAppInstance().openFileInput("serialized_status");
        obj1 = obj;
        obj2 = obj;
        ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj1 = new JSONObject((String)objectinputstream.readObject());
        obj2 = ((JSONObject) (obj1)).getJSONObject("experiments");
        obj3 = new HashMap();
        String s;
        for (obj4 = ((JSONObject) (obj2)).keys(); ((Iterator) (obj4)).hasNext(); ((HashMap) (obj3)).put(s, ((JSONObject) (obj2)).getString(s)))
        {
            s = (String)((Iterator) (obj4)).next();
        }

          goto _L3
        obj1;
        obj1 = objectinputstream;
_L18:
        int i;
        if (obj1 != null)
        {
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null) goto _L1; else goto _L4
_L4:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
_L3:
        experiments = ((HashMap) (obj3));
        unviewedNotificationCount = ((JSONObject) (obj1)).optInt("unviewedNotificationCount");
        walletCount = ((JSONObject) (obj1)).optInt("walletCount");
        cartCount = ((JSONObject) (obj1)).optInt("cartCount");
        remainingCredit = new WishLocalizedCurrencyValue(((JSONObject) (obj1)).getDouble("remainingCredit"), ((JSONObject) (obj1)).optDouble("localizedRemainingCredit", 4.9406564584124654E-324D), ((JSONObject) (obj1)).optString("remainingCreditCurrencyCode"));
        upcomingBirthdayCount = ((JSONObject) (obj1)).getInt("upcomingBirthdayCount");
        if (((JSONObject) (obj1)).has("settings"))
        {
            setSettingsSpec(((JSONObject) (obj1)).getJSONArray("settings"));
        }
        if (((JSONObject) (obj1)).has("googleWalletOfferText"))
        {
            googleWalletOfferText = ((JSONObject) (obj1)).getString("googleWalletOfferText");
        }
        if (((JSONObject) (obj1)).has("inviteSubject"))
        {
            inviteSubject = ((JSONObject) (obj1)).getString("inviteSubject");
        }
        if (((JSONObject) (obj1)).has("inviteMessage"))
        {
            inviteMessage = ((JSONObject) (obj1)).getString("inviteMessage");
        }
        if (((JSONObject) (obj1)).has("billingSecurityTitle"))
        {
            billingSecurityTitle = ((JSONObject) (obj1)).getString("billingSecurityTitle");
        }
        if (((JSONObject) (obj1)).has("billingSecurityText"))
        {
            billingSecurityText = ((JSONObject) (obj1)).getString("billingSecurityText");
        }
        if (((JSONObject) (obj1)).has("local_background_notification_spec"))
        {
            localBackgroundNotificationSpec = new LocalBackgroundNotificationSpec(((JSONObject) (obj1)).getJSONObject("local_background_notification_spec"));
        }
        if (((JSONObject) (obj1)).has("invite_link_spec"))
        {
            inviteLinkSpec = new WishInviteLinkSpec(((JSONObject) (obj1)).getJSONObject("invite_link_spec"));
        }
        if (((JSONObject) (obj1)).has("payment_processor_data"))
        {
            paymentProcessorData = new WishPaymentProcessorData(((JSONObject) (obj1)).getJSONObject("payment_processor_data"));
        }
        if (((JSONObject) (obj1)).has("klarnaCountryCode"))
        {
            klarnaCountryCode = ((JSONObject) (obj1)).getString("klarnaCountryCode");
        }
        if (((JSONObject) (obj1)).has("lemmingsUrl"))
        {
            lemmingsUrl = ((JSONObject) (obj1)).getString("lemmingsUrl");
        }
        obj2 = new ArrayList();
        if (!((JSONObject) (obj1)).has("resizeUrls")) goto _L6; else goto _L5
_L5:
        obj3 = ((JSONObject) (obj1)).getJSONArray("resizeUrls");
        i = 0;
_L7:
        if (i >= ((JSONArray) (obj3)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj2)).add(((JSONArray) (obj3)).getString(i));
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        resizeUrls = ((ArrayList) (obj2));
        obj2 = new ArrayList();
        if (!((JSONObject) (obj1)).has("topSearchSpecs")) goto _L9; else goto _L8
_L8:
        obj3 = ((JSONObject) (obj1)).getJSONArray("top_searches");
        i = 0;
_L10:
        if (i >= ((JSONArray) (obj3)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj2)).add(new WishTopSearchSpec(((JSONArray) (obj3)).getJSONObject(i)));
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        topSearchSpecs = ((ArrayList) (obj2));
        obj2 = new HashMap();
        if (((JSONObject) (obj1)).has("shippingWarningMessages"))
        {
            obj3 = ((JSONObject) (obj1)).getJSONObject("shippingWarningMessages");
            String s1;
            for (obj4 = ((JSONObject) (obj3)).keys(); ((Iterator) (obj4)).hasNext(); ((HashMap) (obj2)).put(s1, ((JSONObject) (obj3)).getString(s1)))
            {
                s1 = (String)((Iterator) (obj4)).next();
            }

        }
          goto _L11
        obj3;
        obj2 = objectinputstream;
        obj1 = obj;
        obj = obj3;
_L17:
        String s2;
        JSONArray jsonarray;
        ArrayList arraylist;
        int j;
        if (obj2 != null)
        {
            try
            {
                ((ObjectInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
_L11:
        shippingWarningMessages = ((HashMap) (obj2));
        obj2 = new HashMap();
        if (!((JSONObject) (obj1)).has("shippingLocations"))
        {
            break MISSING_BLOCK_LABEL_856;
        }
        obj3 = ((JSONObject) (obj1)).getJSONObject("shippingLocations");
        obj4 = ((JSONObject) (obj3)).keys();
_L15:
        if (!((Iterator) (obj4)).hasNext())
        {
            break MISSING_BLOCK_LABEL_856;
        }
        s2 = (String)((Iterator) (obj4)).next();
        jsonarray = ((JSONObject) (obj3)).getJSONArray(s2);
        arraylist = new ArrayList();
        if (jsonarray == null) goto _L13; else goto _L12
_L12:
        j = 0;
_L14:
        if (j >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jsonarray.get(j).toString());
        j++;
        if (true) goto _L14; else goto _L13
_L13:
        ((HashMap) (obj2)).put(s2, arraylist);
          goto _L15
        shippingLocations = ((HashMap) (obj2));
        obj2 = new HashMap();
        if (((JSONObject) (obj1)).has("countrySubdivNames"))
        {
            obj1 = ((JSONObject) (obj1)).getJSONObject("countrySubdivNames");
            for (obj3 = ((JSONObject) (obj1)).keys(); ((Iterator) (obj3)).hasNext(); ((HashMap) (obj2)).put(obj4, ((JSONObject) (obj1)).getString(((String) (obj4)))))
            {
                obj4 = (String)((Iterator) (obj3)).next();
            }

        }
        countrySubdivisionNames = ((HashMap) (obj2));
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        Throwable throwable;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return true;
            }
            return true;
        } else
        {
            return true;
        }
        obj;
        obj2 = obj3;
        if (true) goto _L17; else goto _L16
_L16:
        throwable;
        throwable = ((Throwable) (obj2));
        obj1 = obj4;
          goto _L18
    }

    public String getAdyenKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getAdyenKey();
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604b8);
        }
    }

    public String getBillingSecurityText()
    {
        return billingSecurityText;
    }

    public String getBillingSecurityTitle()
    {
        return billingSecurityTitle;
    }

    public String getBraintreeCollectorMerchantId()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getBraintreeCollectorMerchantId();
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604bc);
        }
    }

    public String getBraintreeCollectorUrl()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getBraintreeCollectorUrl();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f0604bb);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604bd);
        }
    }

    public String getBraintreeKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getBraintreeKey();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f0604be);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604bf);
        }
    }

    public String getBucketForExperiment(String s)
    {
        String s1 = (String)experiments.get(s);
        String s2 = UserPreferences.getExperimentOverride(s);
        s = s1;
        if (s2 != null)
        {
            s = s2;
        }
        if (s != null)
        {
            return s;
        } else
        {
            return "control";
        }
    }

    public int getCartCount()
    {
        return cartCount;
    }

    public HashMap getCountrySubdivisionNames()
    {
        return countrySubdivisionNames;
    }

    public String getEbanxApiUrl()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getEbanxApiUrl();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f0604c9);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604cb);
        }
    }

    public String getEbanxKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getEbanxKey();
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604ca);
        }
    }

    public HashMap getExperiments()
    {
        return experiments;
    }

    public String getGoogleAppIndexingBaseAppUri()
    {
        if (googleAppIndexingData != null)
        {
            return googleAppIndexingData.getAppUri();
        } else
        {
            return "";
        }
    }

    public String getGoogleAppIndexingBaseWebUrl()
    {
        if (googleAppIndexingData != null)
        {
            return googleAppIndexingData.getWebURL();
        } else
        {
            return "";
        }
    }

    public String getGoogleWalletOfferText()
    {
        return googleWalletOfferText;
    }

    public WishInviteLinkSpec getInviteLinkSpec()
    {
        return inviteLinkSpec;
    }

    public String getInviteMessage()
    {
        return inviteMessage;
    }

    public String getInviteSubject()
    {
        return inviteSubject;
    }

    public String getKlarnaCountryCode()
    {
        return klarnaCountryCode;
    }

    public String getLemmingsUrl()
    {
        return lemmingsUrl;
    }

    public LocalBackgroundNotificationSpec getLocalBackgroundNotificationSpec()
    {
        return localBackgroundNotificationSpec;
    }

    public String getPayPalKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getPaypalKey();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f0604d7);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f0604d8);
        }
    }

    public WishLocalizedCurrencyValue getRemainingCredit()
    {
        return remainingCredit;
    }

    public ArrayList getSettings()
    {
        if (settings == null)
        {
            loadDefaultSettingsSpec();
        }
        return settings;
    }

    public HashMap getShippingLocations()
    {
        return shippingLocations;
    }

    public HashMap getShippingWarningMessages()
    {
        return shippingWarningMessages;
    }

    public String getStripeKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getStripeKey();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f060503);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f060504);
        }
    }

    public ArrayList getTopSearchSpecs()
    {
        return topSearchSpecs;
    }

    public int getUnviewedNotificationCount()
    {
        return unviewedNotificationCount;
    }

    public boolean getUsePaymentTestMode()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.useTestMode();
        }
        if (WishApplication.getAppInstance().isVisaBuild())
        {
            return true;
        } else
        {
            return UserPreferences.getUseFbDevMode();
        }
    }

    public String getVisaKey()
    {
        if (paymentProcessorData != null)
        {
            return paymentProcessorData.getVisaKey();
        }
        if (getUsePaymentTestMode())
        {
            return WishApplication.getAppInstance().getString(0x7f060506);
        } else
        {
            return WishApplication.getAppInstance().getString(0x7f060507);
        }
    }

    public int getWalletCount()
    {
        return walletCount;
    }

    public int getupcomingBirthdayCount()
    {
        return upcomingBirthdayCount;
    }

    public void handleCartCountUpdated(Bundle bundle)
    {
        cartCount = bundle.getInt("CartCount");
    }

    public void handleExperimentUpdated(Bundle bundle)
    {
        experiments = (HashMap)bundle.getSerializable("Experiment");
    }

    public void handleNotificationCountUpdated(Bundle bundle)
    {
        unviewedNotificationCount = bundle.getInt("NotificationCount");
    }

    public void handleRemainingCreditUpdated(Bundle bundle)
    {
        remainingCredit = (WishLocalizedCurrencyValue)bundle.getSerializable("RemainingCredit");
    }

    public void handleUpcomingBirthdayCountChanged(Bundle bundle)
    {
        upcomingBirthdayCount = bundle.getInt("UpcomingBirthdayCount");
    }

    public void handleWalletCount(Bundle bundle)
    {
        walletCount = bundle.getInt("WalletCount");
    }

    public boolean inResizeUrls(String s)
    {
label0:
        {
            Object obj = resizeUrls;
            if (s == null || obj == null || ((ArrayList) (obj)).size() <= 0)
            {
                break label0;
            }
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!s.contains((String)((Iterator) (obj)).next()));
            return true;
        }
        return false;
    }

    public boolean isShippingDataFetched()
    {
        return shippingDataFetched;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType = new int[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.NotificationCount.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.CartCount.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Experiment.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.RemainingCredit.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UpcomingBirthdayCount.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$core$ApiDataChangeNotificationManager$NotificationType[com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.WalletCount.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType[notificationtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 53
    //                   2 61
    //                   3 69
    //                   4 77
    //                   5 85
    //                   6 93;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        serialize();
        return;
_L2:
        handleNotificationCountUpdated(bundle);
        continue; /* Loop/switch isn't completed */
_L3:
        handleCartCountUpdated(bundle);
        continue; /* Loop/switch isn't completed */
_L4:
        handleExperimentUpdated(bundle);
        continue; /* Loop/switch isn't completed */
_L5:
        handleRemainingCreditUpdated(bundle);
        continue; /* Loop/switch isn't completed */
_L6:
        handleUpcomingBirthdayCountChanged(bundle);
        continue; /* Loop/switch isn't completed */
_L7:
        handleWalletCount(bundle);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void refreshStatus()
    {
        if (!getUserStatusService.isPending())
        {
            getUserStatusService.requestService(true, null, null);
        }
    }

    public void resetCartCount()
    {
        cartCount = 0;
        ApiDataChangeNotificationManager.getInstance().notifyListenersForCartCount(cartCount);
        serialize();
    }

    public void resetCounts(boolean flag)
    {
        unviewedNotificationCount = 0;
        remainingCredit = new WishLocalizedCurrencyValue(0.0D);
        cartCount = 0;
        upcomingBirthdayCount = 0;
        walletCount = 0;
        googleWalletOfferText = null;
        if (flag)
        {
            serialize();
        }
    }

    public void serialize()
    {
        final JSONObject statusObject = new JSONObject();
        Object obj;
        Iterator iterator1;
        Object obj1;
        Object obj2;
        try
        {
            statusObject.put("unviewedNotificationCount", unviewedNotificationCount);
            statusObject.put("cartCount", cartCount);
            statusObject.put("walletCount", walletCount);
            statusObject.put("remainingCredit", remainingCredit.getUsdValue());
            if (remainingCredit.isLocalized())
            {
                statusObject.put("localizedRemainingCredit", remainingCredit.getLocalizedValue());
                statusObject.put("remainingCreditCurrencyCode", remainingCredit.getLocalizedCurrencyCode());
            }
            statusObject.put("upcomingBirthdayCount", upcomingBirthdayCount);
            obj = new JSONObject();
            String s;
            for (Iterator iterator = experiments.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj)).put(s, experiments.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        catch (Throwable throwable)
        {
            return;
        }
        statusObject.put("experiments", obj);
        obj = new JSONArray();
        for (iterator1 = settings.iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put(obj2))
        {
            obj1 = (WishSettingsSpec)iterator1.next();
            obj2 = new JSONObject();
            ((JSONObject) (obj2)).put("name", ((WishSettingsSpec) (obj1)).getName());
            ((JSONObject) (obj2)).put("action", ((WishSettingsSpec) (obj1)).action());
        }

        statusObject.put("settings", obj);
        if (localBackgroundNotificationSpec == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        obj = localBackgroundNotificationSpec.getJSONObject();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        statusObject.put("local_background_notification_spec", obj);
        if (inviteLinkSpec == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj = inviteLinkSpec.getJSONObject();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        statusObject.put("invite_link_spec", obj);
        if (paymentProcessorData == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj = paymentProcessorData.getJSONObject();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        statusObject.put("payment_processor_data", obj);
        if (topSearchSpecs == null)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        obj = new JSONArray();
        for (iterator1 = topSearchSpecs.iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put(((WishTopSearchSpec)iterator1.next()).getJSONObject())) { }
        statusObject.put("topSearchSpecs", obj);
        if (shippingWarningMessages != null)
        {
            statusObject.put("shippingWarningMessages", new JSONObject(shippingWarningMessages));
        }
        if (shippingLocations == null)
        {
            break MISSING_BLOCK_LABEL_543;
        }
        obj = new JSONObject(shippingLocations);
        for (iterator1 = shippingLocations.entrySet().iterator(); iterator1.hasNext(); ((JSONObject) (obj)).put((String)((java.util.Map.Entry) (obj1)).getKey(), obj2))
        {
            obj1 = (java.util.Map.Entry)iterator1.next();
            obj2 = new JSONArray((Collection)((java.util.Map.Entry) (obj1)).getValue());
        }

        statusObject.put("shippingLocations", obj);
        if (countrySubdivisionNames != null)
        {
            statusObject.put("countrySubdivNames", new JSONObject(countrySubdivisionNames));
        }
        if (googleWalletOfferText != null)
        {
            statusObject.put("googleWalletOfferText", googleWalletOfferText);
        }
        if (inviteMessage != null)
        {
            statusObject.put("inviteMessage", inviteMessage);
        }
        if (inviteSubject != null)
        {
            statusObject.put("inviteSubject", inviteSubject);
        }
        if (billingSecurityTitle != null)
        {
            statusObject.put("billingSecurityTitle", billingSecurityTitle);
        }
        if (billingSecurityText != null)
        {
            statusObject.put("billingSecurityText", billingSecurityText);
        }
        if (klarnaCountryCode != null)
        {
            statusObject.put("klarnaCountryCode", klarnaCountryCode);
        }
        if (lemmingsUrl != null)
        {
            statusObject.put("lemmingsUrl", lemmingsUrl);
        }
        if (resizeUrls == null)
        {
            break MISSING_BLOCK_LABEL_760;
        }
        obj = new JSONArray();
        for (iterator1 = resizeUrls.iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put((String)iterator1.next())) { }
        statusObject.put("resizeUrls", obj);
        StateSerializer.getInstance().getThreadPool(com.contextlogic.wish.util.StateSerializer.SerializationType.Status).execute(new Runnable() {

            final UserStatusManager this$0;
            final JSONObject val$statusObject;

            public void run()
            {
                Object obj4;
                Object obj5;
                Object obj6;
                Object obj7;
                obj5 = null;
                obj4 = null;
                obj6 = null;
                obj7 = null;
                Object obj3 = WishApplication.getAppInstance().openFileOutput("serialized_status", 0);
                obj4 = obj3;
                obj5 = obj3;
                ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj3)));
                objectoutputstream.writeObject(statusObject.toString());
                if (objectoutputstream != null)
                {
                    try
                    {
                        objectoutputstream.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj4) { }
                }
                if (obj3 == null)
                {
                    break MISSING_BLOCK_LABEL_150;
                }
                ((FileOutputStream) (obj3)).close();
_L2:
                return;
                obj3;
                return;
                obj3;
                obj5 = obj7;
                obj3 = obj4;
_L5:
                if (obj5 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj5)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj4) { }
                }
                if (obj3 == null) goto _L2; else goto _L1
_L1:
                try
                {
                    ((FileOutputStream) (obj3)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj3)
                {
                    return;
                }
                obj3;
                obj4 = obj6;
_L4:
                if (obj4 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj4)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj4) { }
                }
                if (obj5 != null)
                {
                    try
                    {
                        ((FileOutputStream) (obj5)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj4) { }
                }
                throw obj3;
                Exception exception;
                exception;
                obj4 = objectoutputstream;
                obj5 = obj3;
                obj3 = exception;
                if (true) goto _L4; else goto _L3
_L3:
                Throwable throwable1;
                throwable1;
                obj5 = objectoutputstream;
                  goto _L5
            }

            
            {
                this$0 = UserStatusManager.this;
                statusObject = jsonobject;
                super();
            }
        });
        return;
    }

    public void setBillingSecurityText(String s)
    {
        billingSecurityText = s;
    }

    public void setBillingSecurityTitle(String s)
    {
        billingSecurityTitle = s;
    }

    public void setCountrySubdivisionNames(HashMap hashmap)
    {
        countrySubdivisionNames = hashmap;
    }

    public void setGoogleAppIndexingData(WishGoogleAppIndexingData wishgoogleappindexingdata)
    {
        googleAppIndexingData = wishgoogleappindexingdata;
    }

    public void setGoogleWalletOfferText(String s)
    {
        googleWalletOfferText = s;
    }

    public void setInviteLinkSpec(WishInviteLinkSpec wishinvitelinkspec)
    {
        inviteLinkSpec = wishinvitelinkspec;
    }

    public void setInviteText(String s, String s1)
    {
        inviteSubject = s;
        inviteMessage = s1;
    }

    public void setKlarnaCountryCode(String s)
    {
        klarnaCountryCode = s;
    }

    public void setLemmingsUrl(String s)
    {
        lemmingsUrl = s;
    }

    public void setLocalBackgroundNotificationSpec(LocalBackgroundNotificationSpec localbackgroundnotificationspec)
    {
        localBackgroundNotificationSpec = localbackgroundnotificationspec;
    }

    public void setPaymentProcessorData(WishPaymentProcessorData wishpaymentprocessordata)
    {
        paymentProcessorData = wishpaymentprocessordata;
    }

    public void setResizeUrls(ArrayList arraylist)
    {
        resizeUrls = arraylist;
    }

    public void setSettingsSpec(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(new WishSettingsSpec(jsonarray.getJSONObject(i)));
        }

        settings = arraylist;
    }

    public void setShippingDataFetched(boolean flag)
    {
        shippingDataFetched = flag;
    }

    public void setShippingLocations(HashMap hashmap)
    {
        shippingLocations = hashmap;
    }

    public void setShippingWarningMessages(HashMap hashmap)
    {
        shippingWarningMessages = hashmap;
    }

    public void setTopSearchSpecs(ArrayList arraylist)
    {
        topSearchSpecs = arraylist;
    }

    public void startStatusRefresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (refreshRunnable == null)
        {
            refreshRunnable = new RefreshRunnable();
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            if (handler != null)
            {
                handler.post(refreshRunnable);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stopStatusRefresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (refreshRunnable != null)
        {
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            if (handler != null)
            {
                handler.removeCallbacks(refreshRunnable);
            }
            refreshRunnable = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }




/*
    static boolean access$002(UserStatusManager userstatusmanager, boolean flag)
    {
        userstatusmanager.runnableRunning = flag;
        return flag;
    }

*/

}
