// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.PowerManager;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.PushNotificationLinkActivity;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import com.contextlogic.wish.api.service.GetBrandFeedService;
import com.contextlogic.wish.api.service.GetCartService;
import com.contextlogic.wish.api.service.GetFeedService;
import com.contextlogic.wish.api.service.GetFilteredFeedService;
import com.contextlogic.wish.api.service.GetProductService;
import com.contextlogic.wish.api.service.GetProfileService;
import com.contextlogic.wish.api.service.ProductSearchService;
import com.contextlogic.wish.http.ImageHttpResponseHandler;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.PreferencesUtil;
import com.samsung.android.sdk.richnotification.SrnAction;
import com.samsung.android.sdk.richnotification.SrnImageAsset;
import com.samsung.android.sdk.richnotification.SrnRichNotification;
import com.samsung.android.sdk.richnotification.SrnRichNotificationManager;
import com.samsung.android.sdk.richnotification.actions.SrnHostAction;
import com.samsung.android.sdk.richnotification.templates.SrnStandardTemplate;
import java.util.ArrayList;
import java.util.Random;

public class PushNotificationService extends IntentService
{

    private static final Object LOCK = com/contextlogic/wish/push/PushNotificationService;
    public static final String PUSH_NOTIFICATION_ID_PREF_KEY = "push-notification-ids";
    private static android.os.PowerManager.WakeLock WAKE_LOCK;

    public PushNotificationService()
    {
        super("com.contextlogic.wish.push.PushNotificationService");
    }

    public PushNotificationService(String s)
    {
        super(s);
    }

    private PendingIntent createSecondaryActionIntent(Intent intent, String s, int i)
    {
        Intent intent1 = new Intent(getBaseContext(), com/contextlogic/wish/activity/link/PushNotificationLinkActivity);
        intent1.putExtras(intent);
        intent1.putExtra("cancel_notification", i);
        intent1.putExtra("url", s);
        i = (new Random()).nextInt(0x186a0);
        intent1.setAction((new StringBuilder()).append("notification").append(i).toString());
        intent1.addFlags(0x10000000);
        return PendingIntent.getActivity(getBaseContext(), i, intent1, 0);
    }

    private static SrnAction createSrnAction(Context context, String s, String s1, int i, Intent intent)
    {
        s = new SrnHostAction(s);
        Bitmap bitmap = BitmapUtil.safeDecodeImageResource(context, i);
        s.setIcon(new SrnImageAsset(context, (new StringBuilder()).append("action_icon").append(i).toString(), bitmap));
        s.setToast(s1);
        s.setCallbackIntent(com.samsung.android.sdk.richnotification.SrnAction.CallbackIntent.getActivityCallback(intent));
        return s;
    }

    private static SrnAction createSrnCartAction(Context context, Intent intent)
    {
        return createSrnAction(context, context.getString(0x7f0603d8), context.getString(0x7f06040a), 0x7f020128, intent);
    }

    private static SrnAction createSrnDefaultAction(Context context, Intent intent)
    {
        return createSrnAction(context, context.getString(0x7f06046b), context.getString(0x7f06040c), 0x7f020129, intent);
    }

    private static SrnAction createSrnProductAction(Context context, Intent intent)
    {
        return createSrnAction(context, context.getString(0x7f06046b), context.getString(0x7f06040d), 0x7f020129, intent);
    }

    private static SrnAction createSrnProfileAction(Context context, Intent intent)
    {
        return createSrnAction(context, context.getString(0x7f06046b), context.getString(0x7f06040e), 0x7f020127, intent);
    }

    private static SrnAction createSrnShopAction(Context context, Intent intent)
    {
        return createSrnAction(context, context.getString(0x7f0603d8), context.getString(0x7f06040b), 0x7f020128, intent);
    }

    private void handleMessage(final Intent intent)
    {
        final String alert = intent.getStringExtra("alert");
        String s = intent.getStringExtra("i");
        if (s != null)
        {
            intent = new ImageHttpResponseHandler() {

                final PushNotificationService this$0;
                final String val$alert;
                final Intent val$intent;

                public void onFailure(Throwable throwable, Bitmap bitmap)
                {
                    showNotification(intent, alert, null);
                }

                public void onSuccess(Bitmap bitmap)
                {
                    showNotification(intent, alert, bitmap);
                }

            
            {
                this$0 = PushNotificationService.this;
                intent = intent1;
                alert = s;
                super();
            }
            };
            intent.setCacheExpiry(0x240c8400L);
            intent.setCanUseCachedResponse(true);
            intent.setShouldCacheResponse(true);
            WishHttpClient.getInstance().get(com.contextlogic.wish.http.WishHttpClient.RequestPool.Image, new Object(), s, null, intent);
            return;
        } else
        {
            showNotification(intent, alert, null);
            return;
        }
    }

    private static void postSrnNotification(Context context, Notification notification, int i, Intent intent, String s, Bitmap bitmap, SrnAction srnaction)
    {
        SrnRichNotificationManager srnrichnotificationmanager = WishApplication.getAppInstance().getSamsungNotificationManager();
        if (srnrichnotificationmanager == null || !srnrichnotificationmanager.isConnected())
        {
            return;
        }
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        double d;
        Bitmap bitmap1;
        int j;
        try
        {
            intent = new SrnStandardTemplate(com.samsung.android.sdk.richnotification.templates.SrnStandardTemplate.HeaderSizeType.MEDIUM);
            d = (double)bitmap.getHeight() / (double)bitmap.getWidth();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        notification = bitmap;
        if (d <= 0.65000000000000002D) goto _L2; else goto _L1
_L1:
        if (d <= 1.0D) goto _L4; else goto _L3
_L3:
        j = (int)((double)bitmap.getWidth() * 0.65000000000000002D * d);
_L6:
        bitmap1 = BitmapUtil.cropBitmap(bitmap, bitmap.getWidth(), j, true);
        notification = bitmap;
        if (bitmap1 == null) goto _L2; else goto _L5
_L5:
        bitmap.recycle();
        notification = bitmap1;
_L2:
        notification = new SrnImageAsset(context, (new StringBuilder()).append("notification_background_").append(notification.hashCode()).toString(), notification);
        intent.setBody(s);
        intent.setBackgroundColor(context.getResources().getColor(0x7f0c00dc));
        intent.setBackgroundImage(notification);
        notification = intent;
_L7:
        intent = new SrnImageAsset(context, "app_icon", BitmapUtil.safeDecodeImageResource(context, 0x7f02010a));
        context = new SrnRichNotification(context);
        context.setIcon(intent);
        context.setTitle(WishApplication.getAppInstance().getAppName());
        context.setSecondaryTemplate(null);
        context.setReadout(WishApplication.getAppInstance().getAppName(), s);
        context.setPrimaryTemplate(notification);
        context.setAssociatedAndroidNotification(i);
        if (srnaction == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        context.addAction(srnaction);
        srnrichnotificationmanager.notify(context);
        return;
_L4:
        j = (int)((double)bitmap.getWidth() * 0.65000000000000002D);
          goto _L6
        notification = new SrnStandardTemplate(com.samsung.android.sdk.richnotification.templates.SrnStandardTemplate.HeaderSizeType.MEDIUM);
        intent = new SrnImageAsset(context, "notification_background_default", BitmapUtil.safeDecodeImageResource(context, 0x7f02019c));
        notification.setBody(s);
        notification.setBackgroundColor(context.getResources().getColor(0x7f0c00dc));
        notification.setBackgroundImage(intent);
          goto _L7
    }

    private static void postSrnNotification(Context context, Notification notification, int i, Intent intent, String s, Bitmap bitmap, String s1, SrnAction srnaction)
    {
        if (bitmap != null || s1 == null)
        {
            try
            {
                postSrnNotification(context, notification, i, intent, s, bitmap, srnaction);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        context = new ImageHttpResponseHandler(context, notification, i, intent, s, srnaction, bitmap) {

            final SrnAction val$action;
            final String val$alert;
            final Context val$context;
            final Notification val$notification;
            final int val$notificationId;
            final Intent val$notificationIntent;
            final Bitmap val$originalImage;

            public void onFailure(Throwable throwable, Bitmap bitmap1)
            {
                PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, originalImage, action);
            }

            public void onSuccess(Bitmap bitmap1)
            {
                PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, bitmap1, action);
            }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                action = srnaction;
                originalImage = bitmap;
                super();
            }
        };
        context.setCacheExpiry(0x240c8400L);
        context.setCanUseCachedResponse(true);
        context.setShouldCacheResponse(true);
        WishHttpClient.getInstance().get(com.contextlogic.wish.http.WishHttpClient.RequestPool.Image, new Object(), s1, null, context);
        return;
    }

    static void runIntentInService(Context context, Intent intent)
    {
        synchronized (LOCK)
        {
            if (WAKE_LOCK == null)
            {
                WAKE_LOCK = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "my_wakelock");
            }
        }
        WAKE_LOCK.acquire();
        intent.setClassName(context, com/contextlogic/wish/push/PushNotificationService.getName());
        context.startService(intent);
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void sendSrnNotification(Context context, Notification notification, int i, String s, Intent intent, String s1, Bitmap bitmap)
    {
        SrnRichNotificationManager srnrichnotificationmanager = WishApplication.getAppInstance().getSamsungNotificationManager();
        if (srnrichnotificationmanager == null || !srnrichnotificationmanager.isConnected())
        {
            return;
        }
        if (s == null)
        {
            s = new ApplicationDeepLinkConfig(com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Notifications, Uri.parse((new StringBuilder()).append(WishApplication.getAppInstance().getString(0x7f0604c7)).append("://notifications").toString()));
        } else
        {
            s = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(s));
        }
        if (!LoggedInUser.getInstance().isLoggedIn())
        {
            LoggedInUser.getInstance().deserializeSession(null, null, null);
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Profile)
        {
            String s2 = s.getStringData();
            s = s2;
            if (s2 == null)
            {
                s = UserPreferences.getLastLoggedInUserId();
            }
            if (s != null && bitmap == null)
            {
                (new GetProfileService()).requestService(s, false, new com.contextlogic.wish.api.service.GetProfileService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(WishUser wishuser)
                    {
                        if (wishuser.getProfileImage() != null)
                        {
                            wishuser = wishuser.getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Large);
                        } else
                        {
                            wishuser = null;
                        }
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, wishuser, PushNotificationService.createSrnProfileAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnProfileAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnProfileAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Product)
        {
            s = s.getStringData();
            if (s != null && bitmap == null)
            {
                (new GetProductService()).requestService(s, null, 0, new com.contextlogic.wish.api.service.GetProductService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(WishProduct wishproduct)
                    {
                        if (wishproduct.getImage() != null)
                        {
                            wishproduct = wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large);
                        } else
                        {
                            wishproduct = null;
                        }
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, wishproduct, PushNotificationService.createSrnProductAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnProductAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnProductAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Brand)
        {
            s = (WishBrandFilter)s.getSerializableData();
            if (s != null && bitmap == null)
            {
                (new GetBrandFeedService()).requestService(s, 0, 1, new com.contextlogic.wish.api.service.GetBrandFeedService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(ArrayList arraylist, boolean flag, int j, WishCredit wishcredit, String s3, String s4, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
                            String s5)
                    {
                        if (arraylist.size() > 0)
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, ((WishProduct)arraylist.get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        } else
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        }
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnShopAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CategoryHome || s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Feed && s.getStringData() == null)
        {
            s = s.getStringData();
            if (bitmap == null)
            {
                (new GetFilteredFeedService()).requestService(0, 1, false, s, null, false, new com.contextlogic.wish.api.service.GetFilteredFeedService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(ArrayList arraylist, ArrayList arraylist1, int j, boolean flag, DealDashInfo dealdashinfo, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
                            ArrayList arraylist2)
                    {
                        if (arraylist.size() > 0)
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, ((WishProduct)arraylist.get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        } else
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        }
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnShopAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Feed)
        {
            s = s.getStringData();
            if (bitmap == null)
            {
                (new GetFeedService()).requestService(0, 1, false, false, null, s, "recommended", new com.contextlogic.wish.api.service.GetFeedService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(ArrayList arraylist, String s3, boolean flag, WishFeedPromotionItem wishfeedpromotionitem, int j, int k, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
                            String s4)
                    {
                        if (arraylist.size() > 0)
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, ((WishProduct)arraylist.get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        } else
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        }
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnShopAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Cart)
        {
            if (bitmap == null)
            {
                (new GetCartService()).requestService(null, null, new com.contextlogic.wish.api.service.GetCartService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
                    {
                        if (wishcart != null && wishcart.getItems().size() > 0)
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, ((WishCartItem)wishcart.getItems().get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), PushNotificationService.createSrnCartAction(context, notificationIntent));
                            return;
                        } else
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnCartAction(context, notificationIntent));
                            return;
                        }
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnCartAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnCartAction(context, intent));
                return;
            }
        }
        if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CommerceSearch || s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Search)
        {
            s = s.getStringData();
            if (s != null && bitmap == null)
            {
                (new ProductSearchService()).requestService(s, 0, 1, true, new com.contextlogic.wish.api.service.ProductSearchService.SuccessCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceSucceeded(ArrayList arraylist, int j, int k, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s3)
                    {
                        if (arraylist.size() > 0)
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, ((WishProduct)arraylist.get(0)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        } else
                        {
                            PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                            return;
                        }
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback(context, notification, i, intent, s1, bitmap) {

                    final String val$alert;
                    final Context val$context;
                    final Bitmap val$image;
                    final Notification val$notification;
                    final int val$notificationId;
                    final Intent val$notificationIntent;

                    public void onServiceFailed()
                    {
                        PushNotificationService.postSrnNotification(context, notification, notificationId, notificationIntent, alert, image, PushNotificationService.createSrnShopAction(context, notificationIntent));
                    }

            
            {
                context = context1;
                notification = notification1;
                notificationId = i;
                notificationIntent = intent;
                alert = s;
                image = bitmap;
                super();
            }
                });
                return;
            } else
            {
                postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnShopAction(context, intent));
                return;
            }
        } else
        {
            postSrnNotification(context, notification, i, intent, s1, bitmap, createSrnDefaultAction(context, intent));
            return;
        }
    }

    private void showNotification(Intent intent, String s, Bitmap bitmap)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        Intent intent1;
        Object obj;
        Object obj1;
        String s1;
        int i;
        try
        {
            intent1 = new Intent(getBaseContext(), com/contextlogic/wish/activity/link/PushNotificationLinkActivity);
            intent1.putExtras(intent);
            i = (new Random()).nextInt(0x186a0);
            intent1.setAction((new StringBuilder()).append("notification").append(i).toString());
            intent1.addFlags(0x10000000);
            obj1 = PendingIntent.getActivity(getBaseContext(), i, intent1, 0);
            long l = System.currentTimeMillis();
            s1 = WishApplication.getAppInstance().getAppName();
            obj = new android.support.v4.app.NotificationCompat.Builder(getBaseContext());
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setSmallIcon(0x7f020118);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentTitle(s1);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentText(s);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setTicker(s);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setWhen(l);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setAutoCancel(true);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setDefaults(7);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentIntent(((PendingIntent) (obj1)));
            obj1 = intent.getStringExtra("at1");
            s1 = intent.getStringExtra("av1");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        if (obj1 == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(0, ((CharSequence) (obj1)), createSecondaryActionIntent(intent, s1, i));
        obj1 = intent.getStringExtra("at2");
        s1 = intent.getStringExtra("av2");
        if (obj1 == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(0, ((CharSequence) (obj1)), createSecondaryActionIntent(intent, s1, i));
        obj1 = intent.getStringExtra("at3");
        s1 = intent.getStringExtra("av3");
        if (obj1 == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(0, ((CharSequence) (obj1)), createSecondaryActionIntent(intent, s1, i));
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle((new android.support.v4.app.NotificationCompat.BigPictureStyle()).bigPicture(bitmap).setSummaryText(s));
        obj1 = (NotificationManager)getBaseContext().getSystemService("notification");
        obj = ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
        try
        {
            intent = intent.getStringExtra("url");
            sendSrnNotification(getBaseContext(), ((Notification) (obj)), i, intent, intent1, s, bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        ((NotificationManager) (obj1)).notify(i, ((Notification) (obj)));
        intent = UserPreferences.getPreferences();
        s = PreferencesUtil.getIntegerArray(intent, "push-notification-ids");
        s.add(Integer.valueOf(i));
        PreferencesUtil.setIntegerArray(intent, "push-notification-ids", s);
    }

    public final void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        String s = intent.getAction();
        if (s.equals("com.amazon.device.messaging.intent.RECEIVE") || s.equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            handleMessage(intent);
        }
        synchronized (LOCK)
        {
            try
            {
                if (WAKE_LOCK != null && WAKE_LOCK.isHeld())
                {
                    WAKE_LOCK.release();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1) { }
        }
        return;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj;
        synchronized (LOCK)
        {
            try
            {
                if (WAKE_LOCK != null && WAKE_LOCK.isHeld())
                {
                    WAKE_LOCK.release();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
        }
        throw obj;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        Throwable throwable;
        throw exception1;
    }








}
