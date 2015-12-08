// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.http.HttpRequestParams;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.FileUtil;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.contextlogic.wish.api.core:
//            WishApiConfig, WishApiRequest, WishApiCallback

public class WishApi
{

    private static final String ANDROID_APP_ADM_PUSH = "5";
    private static final String ANDROID_APP_GCM_PUSH = "3";
    private static final int CAPABILITY_ADD_TO_CART_OFFER = 6;
    private static final int CAPABILITY_ADYEN_CREDIT_CARD_PAYMENT = 3;
    private static final int CAPABILITY_BALANCED_CREDIT_CARD_PAYMENT = 5;
    private static final int CAPABILITY_CART_ABANDON_OFFER = 12;
    private static final int CAPABILITY_CART_EDUCATION_MODAL = 16;
    private static final int CAPABILITY_CHECKOUT_DISCOUNT = 11;
    private static final int CAPABILITY_COLLECTIONS = 20;
    private static final int CAPABILITY_DEAL_DASH = 15;
    private static final int CAPABILITY_EBANX_CREDIT_CARD_PAYMENT = 4;
    private static final int CAPABILITY_EBANX_OXXO_PAYMENT = 13;
    private static final int CAPABILITY_HOURLY_DEAL = 8;
    private static final int CAPABILITY_LINK_TO_ANOTHER_APP = 7;
    private static final int CAPABILITY_PAYPAL_FUTURE_PAYMENTS = 9;
    private static final int CAPABILITY_PROMOTION_BANNER = 19;
    private static final int CAPABILITY_SERVER_SIDE_PAYMENT_PROCESSOR = 2;
    private static final int CAPABILITY_SERVER_SIDE_RECOMMEND_REWARD = 1;
    private static final int CAPABILITY_WISHLOOK = 17;
    private static final int CAPABILITY_WISH_TO_CART_OFFER = 10;
    private static WishApi _instance = new WishApi();
    private String advertisingId;
    private ArrayList capabilities;
    private WishApiConfig config;
    private boolean deviceIdWritten;

    private WishApi()
    {
        config = new WishApiConfig();
        deviceIdWritten = false;
        capabilities = new ArrayList();
        capabilities.add(Integer.toString(1));
        capabilities.add(Integer.toString(2));
        capabilities.add(Integer.toString(3));
        capabilities.add(Integer.toString(4));
        capabilities.add(Integer.toString(5));
        capabilities.add(Integer.toString(6));
        capabilities.add(Integer.toString(7));
        capabilities.add(Integer.toString(8));
        capabilities.add(Integer.toString(9));
        capabilities.add(Integer.toString(10));
        capabilities.add(Integer.toString(11));
        capabilities.add(Integer.toString(12));
        capabilities.add(Integer.toString(13));
        capabilities.add(Integer.toString(15));
        capabilities.add(Integer.toString(16));
        capabilities.add(Integer.toString(17));
        capabilities.add(Integer.toString(19));
        capabilities.add(Integer.toString(20));
        (new Thread(new Runnable() {

            final WishApi this$0;

            public void run()
            {
                try
                {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(WishApplication.getAppInstance());
                    String s = info.getId();
                    if (!info.isLimitAdTrackingEnabled())
                    {
                        advertisingId = s;
                    }
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }

            
            {
                this$0 = WishApi.this;
                super();
            }
        })).start();
    }

    private WishApiRequest apiRequest(String s, HttpRequestParams httprequestparams, WishApiCallback wishapicallback)
    {
        return apiRequest(s, httprequestparams, false, wishapicallback);
    }

    private WishApiRequest apiRequest(String s, HttpRequestParams httprequestparams, boolean flag, WishApiCallback wishapicallback)
    {
        httprequestparams.put("app_device_id", getDeviceId());
        if (WishApplication.getAppInstance().isAmazonBuild())
        {
            httprequestparams.put("_build_type", "amazon");
        }
        httprequestparams.put("_xsrf", "1");
        httprequestparams.put("_client", WishApplication.getAppInstance().getClient());
        httprequestparams.put("_app_type", WishApplication.getAppInstance().getAppType());
        Object obj = WishApplication.getAppInstance().getVersionNumber();
        if (obj != null)
        {
            httprequestparams.put("_version", ((String) (obj)));
        }
        httprequestparams.putArray("_capabilities[]", capabilities);
        if (advertisingId != null && !httprequestparams.hasValue("advertiser_id"))
        {
            httprequestparams.put("advertiser_id", advertisingId);
        }
        if (WishApplication.getAppInstance().isDeveloperBuild())
        {
            obj = new StringBuilder();
            StringBuilder stringbuilder = new StringBuilder();
            Object obj1 = UserStatusManager.getInstance().getExperiments();
            if (obj1 != null)
            {
                obj1 = ((HashMap) (obj1)).keySet().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    String s1 = (String)((Iterator) (obj1)).next();
                    String s2 = UserPreferences.getExperimentOverride(s1);
                    if (s2 != null)
                    {
                        ((StringBuilder) (obj)).append(s1);
                        ((StringBuilder) (obj)).append(",");
                        stringbuilder.append(s2);
                        stringbuilder.append(",");
                    }
                } while (true);
                obj1 = getInstance().getConfig().getApiCountryCode();
                if (obj1 != null)
                {
                    httprequestparams.put("_force_country", ((String) (obj1)));
                }
            }
            if (((StringBuilder) (obj)).length() > 0)
            {
                httprequestparams.put("_experiments", ((StringBuilder) (obj)).substring(0, ((StringBuilder) (obj)).length() - 1));
                httprequestparams.put("_buckets", stringbuilder.substring(0, stringbuilder.length() - 1));
            }
        }
        if (WishApplication.getAppInstance().isScreenshotBuild())
        {
            obj = UserPreferences.getTestingForcedCurrency();
            if (obj != null)
            {
                httprequestparams.put("_force_currency_code", ((String) (obj)));
            }
        }
        obj = String.format("https://%s/api/%s", new Object[] {
            getConfig().getApiBaseUrlString(), s
        });
        wishapicallback = new WishApiRequest(wishapicallback);
        if (flag)
        {
            s = com.contextlogic.wish.http.WishHttpClient.RequestPool.BackgroundApi;
        } else
        {
            s = com.contextlogic.wish.http.WishHttpClient.RequestPool.Api;
        }
        WishHttpClient.getInstance().post(s, wishapicallback.getRequestTag(), ((String) (obj)), httprequestparams, wishapicallback);
        return wishapicallback;
    }

    private File getExternalDocumentsDirectory()
    {
        File file;
        try
        {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        }
        catch (Throwable throwable)
        {
            File file1;
            try
            {
                file1 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/Documents").toString());
            }
            catch (Throwable throwable1)
            {
                return Environment.getExternalStorageDirectory();
            }
            return file1;
        }
        return file;
    }

    public static WishApi getInstance()
    {
        return _instance;
    }

    private String getPushNotificationType()
    {
        if (WishApplication.isPlayServicesAvailable())
        {
            return "3";
        } else
        {
            return "5";
        }
    }

    public WishApiRequest associateFacebookAccount(String s, String s1, long l, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("fb_uid", s);
        httprequestparams.put("fb_access_token", s1);
        httprequestparams.put("expires", Long.toString(l));
        return apiRequest("account/associate-fb", httprequestparams, wishapicallback);
    }

    public WishApiRequest associateGooglePlusAccount(String s, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("google_plus_id", s);
        httprequestparams.put("google_plus_token", s1);
        httprequestparams.put("email", s2);
        return apiRequest("account/associate-google-plus", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest changePassword(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        if (s != null)
        {
            httprequestparams.put("old_password", s);
        }
        httprequestparams.put("new_password", s1);
        return apiRequest("account/password/change", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest changeSetting(int i, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("setting_id", Integer.toString(i));
        if (flag)
        {
            httprequestparams.put("setting_value", "true");
        } else
        {
            httprequestparams.put("setting_value", "false");
        }
        return apiRequest("settings/set", httprequestparams, wishapicallback);
    }

    public WishApiRequest claimCartAbandonOffer(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offer_id", s);
        return apiRequest("cart-abandonment/claim", httprequestparams, wishapicallback);
    }

    public WishApiRequest claimSignupGift(String s, String s1, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("product_id", s);
        httprequestparams.put("variation_id", s1);
        if (flag)
        {
            httprequestparams.put("remove_from_cart", "true");
        }
        return apiRequest("mobile/claim-signup-gift", httprequestparams, wishapicallback);
    }

    public WishApiRequest clickNotification(int i, int j, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket_num", Integer.toString(j));
        httprequestparams.put("notification_num", Integer.toString(i));
        if (flag)
        {
            httprequestparams.put("from_push", "true");
        }
        return apiRequest("notification/clicked", httprequestparams, wishapicallback);
    }

    public WishApiRequest createBucket(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket_name", s);
        return apiRequest("user/profile/bucket/create", httprequestparams, wishapicallback);
    }

    public WishApiRequest deleteAccount(WishApiCallback wishapicallback)
    {
        return apiRequest("account/delete", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest deleteBucket(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket_id", s);
        return apiRequest("user/profile/bucket/delete", httprequestparams, wishapicallback);
    }

    public WishApiRequest dislikeProduct(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("cid", s);
        return apiRequest("user/dislike/contest", httprequestparams, wishapicallback);
    }

    public WishApiRequest dismissCartAbandonOffer(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offer_id", s);
        return apiRequest("cart-abandonment/dismiss", httprequestparams, wishapicallback);
    }

    public WishApiRequest emailLogin(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("email", s);
        httprequestparams.put("password", s1);
        if (UserPreferences.getAdminLoginCode() != null)
        {
            httprequestparams.put("admin_login_code", UserPreferences.getAdminLoginCode());
            UserPreferences.setAdminLoginCode(null);
        }
        if (!UserPreferences.getReferrerLoginSent())
        {
            s = UserPreferences.getAppReferrer();
            if (s != null)
            {
                httprequestparams.put("app_referrer", s);
            }
        }
        s = WishApplication.getAppInstance().getDeepLinkConfig();
        if (s != null && s.getUri() != null)
        {
            s = s.getUri().toString();
            if (s != null)
            {
                httprequestparams.put("from_deeplink", s);
            }
        }
        return apiRequest("email-login", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest emailSignup(String s, String s1, String s2, String s3, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("first_name", s);
        httprequestparams.put("last_name", s1);
        httprequestparams.put("email", s2);
        httprequestparams.put("password", s3);
        if (!UserPreferences.getReferrerLoginSent())
        {
            s = UserPreferences.getAppReferrer();
            if (s != null)
            {
                httprequestparams.put("app_referrer", s);
            }
        }
        s = WishApplication.getAppInstance().getDeepLinkConfig();
        if (s != null && s.getUri() != null)
        {
            s = s.getUri().toString();
            if (s != null)
            {
                httprequestparams.put("from_deeplink", s);
            }
        }
        return apiRequest("email-signup", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest facebookLogin(String s, String s1, long l, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("fb_uid", s);
        httprequestparams.put("fb_access_token", s1);
        httprequestparams.put("expires", Long.toString(l));
        if (UserPreferences.getAdminLoginCode() != null)
        {
            httprequestparams.put("admin_login_code", UserPreferences.getAdminLoginCode());
            UserPreferences.setAdminLoginCode(null);
        }
        if (!UserPreferences.getReferrerLoginSent())
        {
            s = UserPreferences.getAppReferrer();
            if (s != null)
            {
                httprequestparams.put("app_referrer", s);
            }
        }
        s = WishApplication.getAppInstance().getDeepLinkConfig();
        if (s != null && s.getUri() != null)
        {
            s = s.getUri().toString();
            if (s != null)
            {
                httprequestparams.put("from_deeplink", s);
            }
        }
        return apiRequest("fb-login", httprequestparams, wishapicallback);
    }

    public WishApiRequest facebookShareProduct(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("contest-id", s);
        httprequestparams.put("fb-message", s1);
        return apiRequest("user/share/fb", httprequestparams, wishapicallback);
    }

    public WishApiRequest flagProduct(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("contest_id", s);
        httprequestparams.put("content", s1);
        return apiRequest("user/flag-contest", httprequestparams, wishapicallback);
    }

    public WishApiRequest followUser(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("followee_id", s);
        return apiRequest("user/follow", httprequestparams, wishapicallback);
    }

    public WishApiRequest getAppLatestVersion(boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("type", "androidapp");
        return apiRequest("mobile/app/version", httprequestparams, flag, wishapicallback);
    }

    public WishApiRequest getAppList(WishApiCallback wishapicallback)
    {
        return apiRequest("mobile/app-list", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getBraintreeClientToken(WishApiCallback wishapicallback)
    {
        return apiRequest("braintree/client-token", new HttpRequestParams(), true, wishapicallback);
    }

    public WishApiRequest getBrandFeed(int i, int j, String s, String s1, String s2, String s3, boolean flag, 
            String s4, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("query", s);
        httprequestparams.put("start", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        if (s2 != null)
        {
            s = s2.split(",");
            s2 = new ArrayList();
            j = s.length;
            for (i = 0; i < j; i++)
            {
                s2.add(s[i]);
            }

            httprequestparams.putArray("tag_ids[]", s2);
        }
        if (s3 != null)
        {
            s = s3.split(",");
            s2 = new ArrayList();
            j = s.length;
            for (i = 0; i < j; i++)
            {
                s2.add(s[i]);
            }

            httprequestparams.putArray("cids[]", s2);
        }
        if (s1 != null)
        {
            httprequestparams.put("price", s1);
        }
        if (s4 != null)
        {
            httprequestparams.put("credit", s4);
        }
        if (flag)
        {
            httprequestparams.put("is_commerce", "1");
        }
        return apiRequest("brand", httprequestparams, wishapicallback);
    }

    public WishApiRequest getCart(String s, String s1, WishApiCallback wishapicallback)
    {
        return apiRequest("cart/get", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getCommerceHome(WishApiCallback wishapicallback)
    {
        return apiRequest("commerce-home/get", new HttpRequestParams(), wishapicallback);
    }

    public WishApiConfig getConfig()
    {
        return config;
    }

    public String getDeviceId()
    {
        Object obj;
        final Object writeableDeviceId;
        obj = UserPreferences.getDeviceUuid();
        writeableDeviceId = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        try
        {
            writeableDeviceId = new String(FileUtil.getFileBytes(new File(getExternalDocumentsDirectory(), "/Wish/device_data"), new byte[1024]), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (final Object writeableDeviceId)
        {
            continue; /* Loop/switch isn't completed */
        }
        UserPreferences.setDeviceUuid(((String) (writeableDeviceId)));
        obj = writeableDeviceId;
_L4:
        writeableDeviceId = obj;
        if (obj == null)
        {
            writeableDeviceId = UUID.randomUUID().toString();
            UserPreferences.setDeviceUuid(((String) (writeableDeviceId)));
        }
_L2:
        if (writeableDeviceId != null && !deviceIdWritten)
        {
            deviceIdWritten = true;
            (new Thread(new Runnable() {

                final WishApi this$0;
                final String val$writeableDeviceId;

                public void run()
                {
label0:
                    {
                        Object obj1;
                        Throwable throwable1;
                        try
                        {
                            obj1 = new File(getExternalDocumentsDirectory(), "/Wish");
                            if (!((File) (obj1)).exists())
                            {
                                ((File) (obj1)).mkdirs();
                            }
                            obj1 = new File(getExternalDocumentsDirectory(), "/Wish/device_data");
                        }
                        catch (Throwable throwable2)
                        {
                            break label0;
                        }
                        try
                        {
                            if (((File) (obj1)).exists())
                            {
                                break label0;
                            }
                            ((File) (obj1)).createNewFile();
                            obj1 = new FileOutputStream(((File) (obj1)), false);
                        }
                        catch (Throwable throwable3)
                        {
                            break label0;
                        }
                        try
                        {
                            obj1 = new OutputStreamWriter(((java.io.OutputStream) (obj1)));
                        }
                        catch (Throwable throwable4)
                        {
                            break label0;
                        }
                        try
                        {
                            ((OutputStreamWriter) (obj1)).write(writeableDeviceId);
                            ((OutputStreamWriter) (obj1)).flush();
                        }
                        catch (Throwable throwable5) { }
                    }
                    try
                    {
                        obj1 = new File(getExternalDocumentsDirectory(), "/Wish/.nomedia");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Throwable throwable1)
                    {
                        return;
                    }
                    try
                    {
                        if (!((File) (obj1)).exists())
                        {
                            ((File) (obj1)).createNewFile();
                        }
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Throwable throwable1)
                    {
                        return;
                    }
                }

            
            {
                this$0 = WishApi.this;
                writeableDeviceId = s;
                super();
            }
            })).start();
        }
        return ((String) (writeableDeviceId));
        Throwable throwable;
        throwable;
        throwable = ((Throwable) (writeableDeviceId));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public WishApiRequest getFeed(int i, int j, boolean flag, boolean flag1, ArrayList arraylist, String s, String s1, 
            WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        if (flag)
        {
            httprequestparams.put("request_promotion_banner", "true");
        }
        if (flag1)
        {
            httprequestparams.put("request_promotion_tiles", "true");
        }
        if (arraylist != null)
        {
            httprequestparams.putArray("first_cids[]", arraylist);
        }
        httprequestparams.put("filter", s);
        httprequestparams.put("sort", s1);
        return apiRequest("feed/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getFilteredFeed(String s, ArrayList arraylist, boolean flag, int i, int j, boolean flag1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        if (flag)
        {
            httprequestparams.put("request_categories", "true");
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            httprequestparams.putArray("filters[]", arraylist);
        }
        httprequestparams.put("request_id", s);
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        if (flag1)
        {
            httprequestparams.put("featured_product_collection_click", "true");
        }
        return apiRequest("feed/get-filtered-feed", httprequestparams, wishapicallback);
    }

    public WishApiRequest getFirstLaunchExperiments(WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("type", "androidapp");
        return apiRequest("mobile/app/logged-out-experiments", httprequestparams, wishapicallback);
    }

    public WishApiRequest getGoogleWalletOffer(WishApiCallback wishapicallback)
    {
        return apiRequest("mobile/get-google-offer", new HttpRequestParams(), false, wishapicallback);
    }

    public WishApiRequest getLandingPage(int i, String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("shown_landing_pages", Integer.toString(i));
        if (s != null)
        {
            httprequestparams.put("last_landing_page", s);
        }
        return apiRequest("mobile/get-landing-page", httprequestparams, wishapicallback);
    }

    public WishApiRequest getMerchantFeed(int i, int j, String s, String s1, String s2, ArrayList arraylist, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("query", s);
        httprequestparams.put("start", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        if (s1 != null)
        {
            s = s1.split(",");
            s1 = new ArrayList();
            j = s.length;
            for (i = 0; i < j; i++)
            {
                s1.add(s[i]);
            }

            httprequestparams.putArray("tag_ids[]", s1);
        }
        if (s2 != null)
        {
            s = s2.split(",");
            s1 = new ArrayList();
            j = s.length;
            for (i = 0; i < j; i++)
            {
                s1.add(s[i]);
            }

            httprequestparams.putArray("cids[]", s1);
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            httprequestparams.putArray("last_cids[]", arraylist);
        }
        return apiRequest("merchant", httprequestparams, wishapicallback);
    }

    public WishApiRequest getMerchantRatings(String s, int i, int j, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("merchant_id", s);
        httprequestparams.put("start", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        return apiRequest("ratings/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getNotifications(int i, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket", Integer.toString(i));
        return apiRequest("notifications/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getProductInfo(String s, String s1, int i, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("cid", s);
        httprequestparams.put("related_contest_count", "9");
        if (s1 != null)
        {
            httprequestparams.put("credit_id", s1);
        }
        if (i > 0)
        {
            httprequestparams.put("comment_preview_length", Integer.toString(i));
        }
        return apiRequest("product/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getProductPhotoDetails(String s, int i, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("contest_id", s);
        httprequestparams.put("sequence_id", Integer.toString(i));
        return apiRequest("contest/get-picture-data", httprequestparams, wishapicallback);
    }

    public WishApiRequest getProductRatings(String s, int i, int j, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("product_id", s);
        httprequestparams.put("start", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        return apiRequest("product-ratings/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getProductSet(String s, int i, int j, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        httprequestparams.put("set_id", s);
        httprequestparams.put("include_follow_data", "true");
        return apiRequest("profile/products/scroll", httprequestparams, wishapicallback);
    }

    public WishApiRequest getProfile(String s, boolean flag, int i, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("uid", s);
        httprequestparams.put("show_friend_js_link", "true");
        httprequestparams.put("image_size", "medium");
        httprequestparams.put("preview_size", Integer.toString(i));
        httprequestparams.put("supports_bucket_management", "true");
        return apiRequest("profile/get", httprequestparams, flag, wishapicallback);
    }

    public WishApiRequest getPushPreferences(WishApiCallback wishapicallback)
    {
        return apiRequest("mobile/push-preferences", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getRatingPendingTransactions(WishApiCallback wishapicallback)
    {
        return apiRequest("ratings/rating-pending-transactions", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getRelatedProductFeed(String s, String s1, int i, int j, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        httprequestparams.put("feed_mode", s);
        httprequestparams.put("contest_id", s1);
        if (s2 != null)
        {
            httprequestparams.put("tag", s2);
        }
        return apiRequest("related-feed/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getSignupFeed(WishApiCallback wishapicallback)
    {
        return apiRequest("signup-feed/get", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getSignupFeedCategories(WishApiCallback wishapicallback)
    {
        return apiRequest("mobile/get-signup-categories", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getSignupGifts(WishApiCallback wishapicallback)
    {
        return apiRequest("mobile/get-signup-gifts", new HttpRequestParams(), wishapicallback);
    }

    public WishApiRequest getUserFollowees(boolean flag, WishApiCallback wishapicallback)
    {
        return apiRequest("user/followees/get", new HttpRequestParams(), flag, wishapicallback);
    }

    public WishApiRequest getUserSet(String s, int i, int j, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        httprequestparams.put("set_id", s);
        httprequestparams.put("include_follow_data", "true");
        return apiRequest("profile/users/scroll", httprequestparams, wishapicallback);
    }

    public WishApiRequest getUserStatus(boolean flag, boolean flag1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("supports_mobile_action_dict", "true");
        if (flag)
        {
            httprequestparams.put("shipping_location_data", "true");
        }
        return apiRequest("user/status", httprequestparams, flag1, wishapicallback);
    }

    public WishApiRequest getWalletItems(int i, int j, int k, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("state", Integer.toString(i));
        httprequestparams.put("offset", Integer.toString(j));
        httprequestparams.put("count", Integer.toString(k));
        httprequestparams.put("supports_mobile_action_dict", "true");
        return apiRequest("rebates/get", httprequestparams, wishapicallback);
    }

    public WishApiRequest getWishlistFeed(int i, int j, String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("offset", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        httprequestparams.put("source", s);
        return apiRequest("feed/get-wished", httprequestparams, wishapicallback);
    }

    public WishApiRequest googlePlusLogin(String s, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("google_plus_id", s);
        httprequestparams.put("google_plus_token", s1);
        httprequestparams.put("email", s2);
        if (UserPreferences.getAdminLoginCode() != null)
        {
            httprequestparams.put("admin_login_code", UserPreferences.getAdminLoginCode());
            UserPreferences.setAdminLoginCode(null);
        }
        if (!UserPreferences.getReferrerLoginSent())
        {
            s = UserPreferences.getAppReferrer();
            if (s != null)
            {
                httprequestparams.put("app_referrer", s);
            }
        }
        s = WishApplication.getAppInstance().getDeepLinkConfig();
        if (s != null && s.getUri() != null)
        {
            s = s.getUri().toString();
            if (s != null)
            {
                httprequestparams.put("from_deeplink", s);
            }
        }
        return apiRequest("google-plus-login", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest hideProduct(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("cid", s);
        return apiRequest("user/profile/hide/contest", httprequestparams, wishapicallback);
    }

    public WishApiRequest initiateAdyenPayment(String s, String s1, String s2, String s3, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s2 != null && s3 != null)
        {
            httprequestparams.put("variation_id", s3);
            httprequestparams.put("product_id", s2);
        }
        if (s1 != null)
        {
            httprequestparams.put("checkout_offer_id", s1);
        }
        return apiRequest("payment/adyen/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateBoletoPayment(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s1 != null)
        {
            httprequestparams.put("checkout_offer_id", s1);
        }
        return apiRequest("payment/boleto/initiate", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateBraintreePayment(String s, String s1, WishShippingInfo wishshippinginfo, String s2, String s3, String s4, String s5, 
            WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s3 != null && s4 != null)
        {
            httprequestparams.put("variation_id", s4);
            httprequestparams.put("product_id", s3);
        }
        if (s1 != null && wishshippinginfo != null)
        {
            httprequestparams.put("card-nonce", s1);
            if (wishshippinginfo.getName() != null)
            {
                httprequestparams.put("full_name", wishshippinginfo.getName());
                httprequestparams.put("cardholder_name", wishshippinginfo.getName());
            }
            if (wishshippinginfo.getStreetAddressLineOne() != null)
            {
                httprequestparams.put("street_address1", wishshippinginfo.getStreetAddressLineOne());
            }
            if (wishshippinginfo.getStreetAddressLineTwo() != null)
            {
                httprequestparams.put("street_address2", wishshippinginfo.getStreetAddressLineTwo());
            }
            if (wishshippinginfo.getCity() != null)
            {
                httprequestparams.put("city", wishshippinginfo.getCity());
            }
            if (wishshippinginfo.getState() != null)
            {
                httprequestparams.put("state", wishshippinginfo.getState());
            }
            if (wishshippinginfo.getZipCode() != null)
            {
                httprequestparams.put("zipcode", wishshippinginfo.getZipCode());
            }
            if (wishshippinginfo.getCountryCode() != null)
            {
                httprequestparams.put("country", wishshippinginfo.getCountryCode());
            }
            if (wishshippinginfo.getPhoneNumber() != null)
            {
                httprequestparams.put("phone_number", wishshippinginfo.getPhoneNumber());
            }
        }
        if (s2 != null)
        {
            httprequestparams.put("checkout_offer_id", s2);
        }
        if (s5 != null)
        {
            httprequestparams.put("device_session_id", s5);
        }
        return apiRequest("payment/braintree/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateEbanxPayment(String s, String s1, String s2, String s3, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s2 != null && s3 != null)
        {
            httprequestparams.put("variation_id", s3);
            httprequestparams.put("product_id", s2);
        }
        if (s1 != null)
        {
            httprequestparams.put("checkout_offer_id", s1);
        }
        return apiRequest("payment/ebanx/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateGoogleWalletBraintreePayment(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, ArrayList arraylist, String s12, 
            String s13, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        if (s13 != null)
        {
            httprequestparams.put("device_session_id", s13);
        }
        if (flag)
        {
            httprequestparams.put("is_android_pay_tokenized", "true");
        }
        if (s12 != null)
        {
            httprequestparams.put("checkout_offer_id", s12);
        }
        if (s11 != null)
        {
            httprequestparams.put("google_wallet_email", s11);
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            httprequestparams.putArray("google_wallet_funding_sources[]", arraylist);
        }
        if (s != null)
        {
            httprequestparams.put("full_name", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("street_address1", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("street_address2", s2);
        }
        if (s3 != null)
        {
            httprequestparams.put("city", s3);
        }
        if (s4 != null)
        {
            httprequestparams.put("state", s4);
        }
        if (s5 != null)
        {
            httprequestparams.put("zipcode", s5);
        }
        if (s6 != null)
        {
            httprequestparams.put("country", s6);
        }
        if (s7 != null)
        {
            httprequestparams.put("phone_number", s7);
        }
        httprequestparams.put("billing_zipcode", s10);
        httprequestparams.put("currency", s8);
        httprequestparams.put("card-nonce", s9);
        return apiRequest("payment/google-wallet/braintree/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateGoogleWalletStripePayment(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10, String s11, ArrayList arraylist, String s12, 
            WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("stripe_token", s9);
        httprequestparams.put("from_native", "true");
        if (s12 != null)
        {
            httprequestparams.put("checkout_offer_id", s12);
        }
        if (s11 != null)
        {
            httprequestparams.put("google_wallet_email", s11);
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            httprequestparams.putArray("google_wallet_funding_sources[]", arraylist);
        }
        if (s != null)
        {
            httprequestparams.put("full_name", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("street_address1", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("street_address2", s2);
        }
        if (s3 != null)
        {
            httprequestparams.put("city", s3);
        }
        if (s4 != null)
        {
            httprequestparams.put("state", s4);
        }
        if (s5 != null)
        {
            httprequestparams.put("zipcode", s5);
        }
        if (s6 != null)
        {
            httprequestparams.put("country", s6);
        }
        if (s7 != null)
        {
            httprequestparams.put("phone_number", s7);
        }
        httprequestparams.put("billing_zipcode", s10);
        httprequestparams.put("currency", s8);
        return apiRequest("payment/google-wallet/stripe/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateOxxoPayment(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s1 != null)
        {
            httprequestparams.put("checkout_offer_id", s1);
        }
        return apiRequest("payment/oxxo/initiate", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiatePayPalBraintreePayment(String s, String s1, String s2, String s3, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        if (s3 != null)
        {
            httprequestparams.put("checkout_offer_id", s3);
        }
        if (s != null)
        {
            httprequestparams.put("payment_method_nonce", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("device_session_id", s1);
        }
        httprequestparams.put("currency", s2);
        return apiRequest("payment/paypal/braintree/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiatePayPalPayment(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        if (s9 != null)
        {
            httprequestparams.put("checkout_offer_id", s9);
        }
        if (s != null)
        {
            httprequestparams.put("full_name", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("street_address1", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("street_address2", s2);
        }
        if (s3 != null)
        {
            httprequestparams.put("city", s3);
        }
        if (s4 != null)
        {
            httprequestparams.put("state", s4);
        }
        if (s5 != null)
        {
            httprequestparams.put("zipcode", s5);
        }
        if (s6 != null)
        {
            httprequestparams.put("country", s6);
        }
        if (s7 != null)
        {
            httprequestparams.put("phone_number", s7);
        }
        httprequestparams.put("supports_address", "true");
        httprequestparams.put("currency", s8);
        return apiRequest("payment/paypal/initiate", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest initiateStripePayment(String s, String s1, String s2, String s3, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("client", "androidapp");
        httprequestparams.put("from_native", "true");
        httprequestparams.put("currency", s);
        if (s2 != null && s3 != null)
        {
            httprequestparams.put("variation_id", s3);
            httprequestparams.put("product_id", s2);
        }
        if (s1 != null)
        {
            httprequestparams.put("checkout_offer_id", s1);
        }
        return apiRequest("payment/stripe/complete", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest inviteUsers(List list, List list1, String s, int i, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        if (list != null)
        {
            httprequestparams.putArray("fbids[]", list);
            httprequestparams.put("request-id", s);
        }
        if (list1 != null)
        {
            httprequestparams.putArray("google_plus_ids[]", list1);
        }
        httprequestparams.put("src", Integer.toString(i));
        return apiRequest("user/invite-to-site", httprequestparams, wishapicallback);
    }

    public WishApiRequest logCommerceAction(boolean flag, int i, int j, String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("is_success", Boolean.toString(flag));
        httprequestparams.put("action", Integer.toString(i));
        httprequestparams.put("result", Integer.toString(j));
        if (s != null)
        {
            httprequestparams.put("extra_info", s);
        }
        return apiRequest("commerce/log", httprequestparams, true, wishapicallback);
    }

    public WishApiRequest logCrossPromo(String s, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("promo_id", s);
        if (s2 != null)
        {
            httprequestparams.put("source", s2);
        }
        if (s1 != null)
        {
            httprequestparams.put("product_id", s1);
        }
        return apiRequest("cross_promo/log", httprequestparams, true, wishapicallback);
    }

    public WishApiRequest logFeedCampaign(int i, String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("action", Integer.toString(i));
        httprequestparams.put("campaign_id", s);
        return apiRequest("feed/mobile-campaign/log", httprequestparams, wishapicallback);
    }

    public WishApiRequest logImpression(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("event_id", s);
        if (s1 != null)
        {
            httprequestparams.put("contest_id", s1);
        }
        return apiRequest("mobile/log", httprequestparams, true, wishapicallback);
    }

    public WishApiRequest logInboundRequest(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("target_url", s);
        return apiRequest("mobile/app-req-logger", httprequestparams, wishapicallback);
    }

    public WishApiRequest logLocalNotificationEvent(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("notification_id", s);
        httprequestparams.put("action", s1);
        return apiRequest("mobile/log-local-notification", httprequestparams, wishapicallback);
    }

    public WishApiRequest logSignupDeepLinkUrl(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("url", s);
        return apiRequest("mobile/signup-deeplink-log", httprequestparams, wishapicallback);
    }

    public WishApiRequest moveToBucket(String s, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("contest_id", s);
        if (s1 != null)
        {
            httprequestparams.put("target_bucket_name", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("target_bucket_id", s2);
        }
        return apiRequest("user/profile/contest/change-bucket", httprequestparams, wishapicallback);
    }

    public WishApiRequest pingServer(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("type", "androidapp");
        if (s != null)
        {
            httprequestparams.put("referrer", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("advertiser_id", s1);
        }
        httprequestparams.put("device_id", getDeviceId());
        return apiRequest("mobile/app/ping", httprequestparams, wishapicallback);
    }

    public WishApiRequest preVerifyPayPalPayment(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        if (s != null)
        {
            httprequestparams.put("full_name", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("street_address1", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("street_address2", s2);
        }
        if (s3 != null)
        {
            httprequestparams.put("city", s3);
        }
        if (s4 != null)
        {
            httprequestparams.put("state", s4);
        }
        if (s5 != null)
        {
            httprequestparams.put("zipcode", s5);
        }
        if (s6 != null)
        {
            httprequestparams.put("country", s6);
        }
        if (s7 != null)
        {
            httprequestparams.put("phone_number", s7);
        }
        httprequestparams.put("supports_address", "true");
        httprequestparams.put("currency", s8);
        return apiRequest("payment/paypal/preverify", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest productSearch(String s, int i, int j, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("query", s);
        httprequestparams.put("start", Integer.toString(i));
        httprequestparams.put("count", Integer.toString(j));
        httprequestparams.put("transform", "true");
        if (flag)
        {
            httprequestparams.put("is_commerce", Integer.toString(1));
        }
        return apiRequest("search", httprequestparams, wishapicallback);
    }

    public WishApiRequest recommendFeed(String s, List list, List list1, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("feed_tag", s);
        if (list != null)
        {
            httprequestparams.putArray("recommended_to_fbuids[]", list);
        }
        if (list1 != null)
        {
            httprequestparams.putArray("recommended_to_google_plus_ids[]", list1);
        }
        if (s1 != null)
        {
            httprequestparams.put("app_request_id", s1);
        }
        return apiRequest("user/recommend-feed", httprequestparams, wishapicallback);
    }

    public WishApiRequest recommendProduct(String s, List list, List list1, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("redirect_uri", s2);
        httprequestparams.put("contest_id", s);
        httprequestparams.put("is_app_req", "true");
        if (list != null)
        {
            httprequestparams.put("request_id", s1);
            httprequestparams.putArray("recommended_to_fbuids[]", list);
            httprequestparams.put("reciever_fbid", (String)list.get(0));
        }
        if (list1 != null)
        {
            httprequestparams.putArray("recommended_to_google_plus_ids[]", list1);
        }
        return apiRequest("user/recommend/finish-fb-msg", httprequestparams, wishapicallback);
    }

    public WishApiRequest registerForPushNotifications(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("token", s);
        httprequestparams.put("type", getPushNotificationType());
        return apiRequest("mobile/push/register", httprequestparams, wishapicallback);
    }

    public WishApiRequest renameBucket(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket_id", s);
        httprequestparams.put("name", s1);
        return apiRequest("user/profile/bucket/rename", httprequestparams, wishapicallback);
    }

    public WishApiRequest resetPassword(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("email", s);
        return apiRequest("account/password/reset", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest searchForTag(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("q", s);
        return apiRequest("tags/search", httprequestparams, wishapicallback);
    }

    public WishApiRequest startDealDash(WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("user_start", String.valueOf(true));
        return apiRequest("mobile/start-deal-dash", httprequestparams, wishapicallback);
    }

    public WishApiRequest unfollowUser(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("followee_id", s);
        return apiRequest("user/unfollow", httprequestparams, wishapicallback);
    }

    public WishApiRequest unregisterForPushNotifications(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("token", s1);
        httprequestparams.put("type", getPushNotificationType());
        if (s != null)
        {
            httprequestparams.put("user_id", s);
        }
        return apiRequest("mobile/push/unregister", httprequestparams, wishapicallback);
    }

    public WishApiRequest unwishForCategory(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("category_id", s);
        return apiRequest("mobile/signup-unwish-category", httprequestparams, wishapicallback);
    }

    public WishApiRequest updateAdyenBillingInfo(String s, String s1, String s2, WishShippingInfo wishshippinginfo, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("encrypted_card", s);
        httprequestparams.put("last_four", s1);
        httprequestparams.put("card_type", s2);
        if (wishshippinginfo.getName() != null)
        {
            httprequestparams.put("full_name", wishshippinginfo.getName());
            httprequestparams.put("cardholder_name", wishshippinginfo.getName());
        }
        if (wishshippinginfo.getStreetAddressLineOne() != null)
        {
            httprequestparams.put("street_address1", wishshippinginfo.getStreetAddressLineOne());
        }
        if (wishshippinginfo.getStreetAddressLineTwo() != null)
        {
            httprequestparams.put("street_address2", wishshippinginfo.getStreetAddressLineTwo());
        }
        if (wishshippinginfo.getCity() != null)
        {
            httprequestparams.put("city", wishshippinginfo.getCity());
        }
        if (wishshippinginfo.getState() != null)
        {
            httprequestparams.put("state", wishshippinginfo.getState());
        }
        if (wishshippinginfo.getZipCode() != null)
        {
            httprequestparams.put("zipcode", wishshippinginfo.getZipCode());
        }
        if (wishshippinginfo.getCountryCode() != null)
        {
            httprequestparams.put("country", wishshippinginfo.getCountryCode());
        }
        if (wishshippinginfo.getPhoneNumber() != null)
        {
            httprequestparams.put("phone_number", wishshippinginfo.getPhoneNumber());
        }
        httprequestparams.put("from_native", "true");
        return apiRequest("billing-info/adyen/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateBoletoBillingInfo(String s, String s1, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("name", s);
        httprequestparams.put("identity_number", s1);
        httprequestparams.put("email", s2);
        return apiRequest("billing-info/boleto/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateBraintreeBillingInfo(String s, WishShippingInfo wishshippinginfo, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("card-nonce", s);
        if (wishshippinginfo.getName() != null)
        {
            httprequestparams.put("full_name", wishshippinginfo.getName());
            httprequestparams.put("cardholder_name", wishshippinginfo.getName());
        }
        if (wishshippinginfo.getStreetAddressLineOne() != null)
        {
            httprequestparams.put("street_address1", wishshippinginfo.getStreetAddressLineOne());
        }
        if (wishshippinginfo.getStreetAddressLineTwo() != null)
        {
            httprequestparams.put("street_address2", wishshippinginfo.getStreetAddressLineTwo());
        }
        if (wishshippinginfo.getCity() != null)
        {
            httprequestparams.put("city", wishshippinginfo.getCity());
        }
        if (wishshippinginfo.getState() != null)
        {
            httprequestparams.put("state", wishshippinginfo.getState());
        }
        if (wishshippinginfo.getZipCode() != null)
        {
            httprequestparams.put("zipcode", wishshippinginfo.getZipCode());
        }
        if (wishshippinginfo.getCountryCode() != null)
        {
            httprequestparams.put("country", wishshippinginfo.getCountryCode());
        }
        if (wishshippinginfo.getPhoneNumber() != null)
        {
            httprequestparams.put("phone_number", wishshippinginfo.getPhoneNumber());
        }
        httprequestparams.put("from_native", "true");
        return apiRequest("billing-info/braintree/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateCart(String s, String s1, int i, boolean flag, String s2, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("product_id", s);
        httprequestparams.put("variation_id", s1);
        httprequestparams.put("quantity", Integer.toString(i));
        if (flag)
        {
            httprequestparams.put("add_to_cart", "true");
        }
        if (s2 != null)
        {
            httprequestparams.put("add_to_cart_offer_id", s2);
        }
        return apiRequest("cart/update", httprequestparams, wishapicallback);
    }

    public WishApiRequest updateEbanxBillingInfo(String s, String s1, String s2, String s3, String s4, WishShippingInfo wishshippinginfo, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("ebanx_token", s);
        httprequestparams.put("cpf", s3);
        httprequestparams.put("email", s4);
        httprequestparams.put("payment_type_code", s1);
        httprequestparams.put("masked_card_number", s2);
        if (wishshippinginfo.getName() != null)
        {
            httprequestparams.put("full_name", wishshippinginfo.getName());
            httprequestparams.put("cardholder_name", wishshippinginfo.getName());
        }
        if (wishshippinginfo.getStreetAddressLineOne() != null)
        {
            httprequestparams.put("street_address1", wishshippinginfo.getStreetAddressLineOne());
        }
        if (wishshippinginfo.getStreetAddressLineTwo() != null)
        {
            httprequestparams.put("street_address2", wishshippinginfo.getStreetAddressLineTwo());
        }
        if (wishshippinginfo.getCity() != null)
        {
            httprequestparams.put("city", wishshippinginfo.getCity());
        }
        if (wishshippinginfo.getState() != null)
        {
            httprequestparams.put("state", wishshippinginfo.getState());
        }
        if (wishshippinginfo.getZipCode() != null)
        {
            httprequestparams.put("zipcode", wishshippinginfo.getZipCode());
        }
        if (wishshippinginfo.getCountryCode() != null)
        {
            httprequestparams.put("country", wishshippinginfo.getCountryCode());
        }
        if (wishshippinginfo.getPhoneNumber() != null)
        {
            httprequestparams.put("phone_number", wishshippinginfo.getPhoneNumber());
        }
        httprequestparams.put("from_native", "true");
        return apiRequest("billing-info/ebanx/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateOxxoBillingInfo(String s, String s1, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("name", s);
        httprequestparams.put("email", s1);
        return apiRequest("billing-info/oxxo/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updatePayPalBraintreeBillingInfo(String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        httprequestparams.put("payment_method_nonce", s);
        return apiRequest("billing-info/paypal/braintree/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateShippingInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("from_native", "true");
        if (s8 != null && s9 != null)
        {
            httprequestparams.put("variation_id", s9);
            httprequestparams.put("product_id", s8);
        }
        if (s != null)
        {
            httprequestparams.put("full-name", s);
        }
        if (s1 != null)
        {
            httprequestparams.put("street-address1", s1);
        }
        if (s2 != null)
        {
            httprequestparams.put("street-address2", s2);
        }
        if (s3 != null)
        {
            httprequestparams.put("city", s3);
        }
        if (s4 != null)
        {
            httprequestparams.put("state", s4);
        }
        if (s5 != null)
        {
            httprequestparams.put("zipcode", s5);
        }
        if (s6 != null)
        {
            httprequestparams.put("country", s6);
        }
        if (s7 != null)
        {
            httprequestparams.put("phone-number", s7);
        }
        return apiRequest("shipping-address/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateStripeBillingInfo(String s, WishShippingInfo wishshippinginfo, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("stripe_token", s);
        if (wishshippinginfo.getName() != null)
        {
            httprequestparams.put("full_name", wishshippinginfo.getName());
            httprequestparams.put("cardholder_name", wishshippinginfo.getName());
        }
        if (wishshippinginfo.getStreetAddressLineOne() != null)
        {
            httprequestparams.put("street_address1", wishshippinginfo.getStreetAddressLineOne());
        }
        if (wishshippinginfo.getStreetAddressLineTwo() != null)
        {
            httprequestparams.put("street_address2", wishshippinginfo.getStreetAddressLineTwo());
        }
        if (wishshippinginfo.getCity() != null)
        {
            httprequestparams.put("city", wishshippinginfo.getCity());
        }
        if (wishshippinginfo.getState() != null)
        {
            httprequestparams.put("state", wishshippinginfo.getState());
        }
        if (wishshippinginfo.getZipCode() != null)
        {
            httprequestparams.put("zipcode", wishshippinginfo.getZipCode());
        }
        if (wishshippinginfo.getCountryCode() != null)
        {
            httprequestparams.put("country", wishshippinginfo.getCountryCode());
        }
        if (wishshippinginfo.getPhoneNumber() != null)
        {
            httprequestparams.put("phone_number", wishshippinginfo.getPhoneNumber());
        }
        httprequestparams.put("from_native", "true");
        return apiRequest("billing-info/stripe/add-or-update", httprequestparams, false, wishapicallback);
    }

    public WishApiRequest updateUserProfile(int i, int j, int k, String s, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("dob_day", Integer.toString(i));
        httprequestparams.put("dob_month", Integer.toString(j));
        httprequestparams.put("dob_year", Integer.toString(k));
        httprequestparams.put("gender", s);
        if (flag)
        {
            httprequestparams.put("birthday_inferred", "true");
        }
        return apiRequest("profile/update", httprequestparams, wishapicallback);
    }

    public WishApiRequest uploadImage(Bitmap bitmap, String s, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
        httprequestparams.put("image_data", Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0));
        httprequestparams.put("bucket", s);
        httprequestparams.put("upload_src", "6");
        return apiRequest("mobile/upload-image", httprequestparams, wishapicallback);
    }

    public WishApiRequest uploadProfileImage(Bitmap bitmap, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, bytearrayoutputstream);
        httprequestparams.put("image_data", Base64.encodeToString(bytearrayoutputstream.toByteArray(), 0));
        httprequestparams.put("upload_src", "6");
        return apiRequest("mobile/upload-profile-image", httprequestparams, wishapicallback);
    }

    public WishApiRequest viewNotification(int i, int j, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("bucket_num", Integer.toString(j));
        httprequestparams.put("notification_num", Integer.toString(i));
        return apiRequest("notification/viewed", httprequestparams, wishapicallback);
    }

    public WishApiRequest wishForCategory(String s, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("category_id", s);
        if (flag)
        {
            httprequestparams.put("from_signup_flow", "true");
        }
        return apiRequest("mobile/signup-wish-category", httprequestparams, wishapicallback);
    }

    public WishApiRequest wishForProduct(String s, String s1, boolean flag, WishApiCallback wishapicallback)
    {
        HttpRequestParams httprequestparams = new HttpRequestParams();
        httprequestparams.put("contest_id", s);
        if (s1 != null)
        {
            httprequestparams.put("recommended_by", s1);
        }
        if (flag)
        {
            httprequestparams.put("from_signup_flow", "true");
        }
        return apiRequest("contest/enter", httprequestparams, wishapicallback);
    }



/*
    static String access$002(WishApi wishapi, String s)
    {
        wishapi.advertisingId = s;
        return s;
    }

*/

}
