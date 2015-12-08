// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.contextlogic.wish.api.core:
//            ApiDataChangeNotificationListener

public class ApiDataChangeNotificationManager
{
    public static final class NotificationType extends Enum
    {

        private static final NotificationType $VALUES[];
        public static final NotificationType BucketDelete;
        public static final NotificationType BucketEdit;
        public static final NotificationType BucketRename;
        public static final NotificationType CartCount;
        public static final NotificationType CartReloadRequired;
        public static final NotificationType CartReloadRequiredInBackground;
        public static final NotificationType Experiment;
        public static final NotificationType LogoutRequired;
        public static final NotificationType NotificationCount;
        public static final NotificationType OrientationChanged;
        public static final NotificationType ProductRecommendation;
        public static final NotificationType PurchaseComplete;
        public static final NotificationType RemainingCredit;
        public static final NotificationType Unwish;
        public static final NotificationType UnwishForCategory;
        public static final NotificationType UpcomingBirthdayCount;
        public static final NotificationType UserFollowed;
        public static final NotificationType UserUnfollowed;
        public static final NotificationType UserUpdated;
        public static final NotificationType WalletCount;
        public static final NotificationType Wish;
        public static final NotificationType WishForCategory;

        public static NotificationType valueOf(String s)
        {
            return (NotificationType)Enum.valueOf(com/contextlogic/wish/api/core/ApiDataChangeNotificationManager$NotificationType, s);
        }

        public static NotificationType[] values()
        {
            return (NotificationType[])$VALUES.clone();
        }

        static 
        {
            Wish = new NotificationType("Wish", 0);
            ProductRecommendation = new NotificationType("ProductRecommendation", 1);
            UserFollowed = new NotificationType("UserFollowed", 2);
            UserUnfollowed = new NotificationType("UserUnfollowed", 3);
            NotificationCount = new NotificationType("NotificationCount", 4);
            BucketRename = new NotificationType("BucketRename", 5);
            BucketDelete = new NotificationType("BucketDelete", 6);
            BucketEdit = new NotificationType("BucketEdit", 7);
            CartCount = new NotificationType("CartCount", 8);
            PurchaseComplete = new NotificationType("PurchaseComplete", 9);
            Experiment = new NotificationType("Experiment", 10);
            RemainingCredit = new NotificationType("RemainingCredit", 11);
            LogoutRequired = new NotificationType("LogoutRequired", 12);
            Unwish = new NotificationType("Unwish", 13);
            UserUpdated = new NotificationType("UserUpdated", 14);
            CartReloadRequired = new NotificationType("CartReloadRequired", 15);
            CartReloadRequiredInBackground = new NotificationType("CartReloadRequiredInBackground", 16);
            UpcomingBirthdayCount = new NotificationType("UpcomingBirthdayCount", 17);
            WalletCount = new NotificationType("WalletCount", 18);
            OrientationChanged = new NotificationType("OrientationChanged", 19);
            WishForCategory = new NotificationType("WishForCategory", 20);
            UnwishForCategory = new NotificationType("UnwishForCategory", 21);
            $VALUES = (new NotificationType[] {
                Wish, ProductRecommendation, UserFollowed, UserUnfollowed, NotificationCount, BucketRename, BucketDelete, BucketEdit, CartCount, PurchaseComplete, 
                Experiment, RemainingCredit, LogoutRequired, Unwish, UserUpdated, CartReloadRequired, CartReloadRequiredInBackground, UpcomingBirthdayCount, WalletCount, OrientationChanged, 
                WishForCategory, UnwishForCategory
            });
        }

        private NotificationType(String s, int i)
        {
            super(s, i);
        }
    }

    class WeakNotificationListener
        implements ApiDataChangeNotificationListener
    {

        private WeakReference listenerReference;
        final ApiDataChangeNotificationManager this$0;

        public void onNotificationReceived(NotificationType notificationtype, Bundle bundle)
        {
            ApiDataChangeNotificationListener apidatachangenotificationlistener = (ApiDataChangeNotificationListener)listenerReference.get();
            if (apidatachangenotificationlistener != null)
            {
                apidatachangenotificationlistener.onNotificationReceived(notificationtype, bundle);
                return;
            } else
            {
                ApiDataChangeNotificationManager.getInstance().removeWeakListener(this, null);
                return;
            }
        }

        public WeakNotificationListener(ApiDataChangeNotificationListener apidatachangenotificationlistener)
        {
            this$0 = ApiDataChangeNotificationManager.this;
            super();
            listenerReference = new WeakReference(apidatachangenotificationlistener);
        }
    }


    public static final String DATA_CHANGE_KEY_ACTIVITY_COUNT = "ActivityCount";
    public static final String DATA_CHANGE_KEY_BUCKET_ID = "BucketId";
    public static final String DATA_CHANGE_KEY_CART_COUNT = "CartCount";
    public static final String DATA_CHANGE_KEY_CATEGORY_ID = "CategoryId";
    public static final String DATA_CHANGE_KEY_COMMENTS = "Comments";
    public static final String DATA_CHANGE_KEY_COMMENT_COUNT = "CommentCount";
    public static final String DATA_CHANGE_KEY_CREDIT = "Credit";
    public static final String DATA_CHANGE_KEY_EXPERIMENT = "Experiment";
    public static final String DATA_CHANGE_KEY_NAME = "Name";
    public static final String DATA_CHANGE_KEY_NOTIFICATION_COUNT = "NotificationCount";
    public static final String DATA_CHANGE_KEY_PRODUCT = "Product";
    public static final String DATA_CHANGE_KEY_PRODUCT_ID = "ProductId";
    public static final String DATA_CHANGE_KEY_RECOMMENDED_FBIDS = "RecommendedFbIds";
    public static final String DATA_CHANGE_KEY_RECOMMENDED_GOOGLE_IDS = "RecommendedGoogleIds";
    public static final String DATA_CHANGE_KEY_REMAINING_CREDIT = "RemainingCredit";
    public static final String DATA_CHANGE_KEY_SALE_PARTY_COUNT = "SalePartyCount";
    public static final String DATA_CHANGE_KEY_UPCOMING_BIRTHDAY_COUNT = "UpcomingBirthdayCount";
    public static final String DATA_CHANGE_KEY_USER_ID = "UserId";
    public static final String DATA_CHANGE_KEY_WALLET_COUNT = "WalletCount";
    private static ApiDataChangeNotificationManager _instance = new ApiDataChangeNotificationManager();
    private Handler handler;
    private HashMap listenerReverseMapping;
    private HashMap listeners;
    private WeakHashMap objectWeakMapping;

    private ApiDataChangeNotificationManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        objectWeakMapping = new WeakHashMap();
        listeners = new HashMap();
        listenerReverseMapping = new HashMap();
    }

    public static ApiDataChangeNotificationManager getInstance()
    {
        return _instance;
    }

    private void removeWeakListener(WeakNotificationListener weaknotificationlistener, NotificationType notificationtype)
    {
        HashMap hashmap = listeners;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (ArrayList)listenerReverseMapping.get(weaknotificationlistener);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (notificationtype != null) goto _L4; else goto _L3
_L3:
        notificationtype = ((ArrayList) (obj)).iterator();
_L6:
        do
        {
            if (!notificationtype.hasNext())
            {
                break MISSING_BLOCK_LABEL_89;
            }
            obj = (String)notificationtype.next();
            obj = (ArrayList)listeners.get(obj);
        } while (obj == null);
        ((ArrayList) (obj)).remove(weaknotificationlistener);
        if (true) goto _L6; else goto _L5
_L5:
        weaknotificationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw weaknotificationlistener;
        listenerReverseMapping.remove(weaknotificationlistener);
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L4:
        ArrayList arraylist;
        notificationtype = notificationtype.toString();
        arraylist = (ArrayList)listeners.get(notificationtype);
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        arraylist.remove(weaknotificationlistener);
        ((ArrayList) (obj)).remove(notificationtype);
          goto _L2
    }

    public void addListener(NotificationType notificationtype, ApiDataChangeNotificationListener apidatachangenotificationlistener)
    {
        HashMap hashmap = listeners;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj = (WeakNotificationListener)objectWeakMapping.get(apidatachangenotificationlistener);
        WeakNotificationListener weaknotificationlistener;
        weaknotificationlistener = ((WeakNotificationListener) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        weaknotificationlistener = new WeakNotificationListener(apidatachangenotificationlistener);
        objectWeakMapping.put(apidatachangenotificationlistener, weaknotificationlistener);
        obj = (ArrayList)listenerReverseMapping.get(weaknotificationlistener);
        apidatachangenotificationlistener = ((ApiDataChangeNotificationListener) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        apidatachangenotificationlistener = new ArrayList();
        listenerReverseMapping.put(weaknotificationlistener, apidatachangenotificationlistener);
        obj = notificationtype.toString();
        if (apidatachangenotificationlistener.contains(obj))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        apidatachangenotificationlistener.add(obj);
        apidatachangenotificationlistener = (ArrayList)listeners.get(obj);
        notificationtype = apidatachangenotificationlistener;
        if (apidatachangenotificationlistener != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        notificationtype = new ArrayList();
        listeners.put(obj, notificationtype);
        notificationtype.add(weaknotificationlistener);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        notificationtype;
        hashmap;
        JVM INSTR monitorexit ;
        throw notificationtype;
    }

    public void notifyListeners(final NotificationType notificationType, final Bundle notificationData)
    {
        HashMap hashmap = listeners;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        obj = notificationType.toString();
        obj = (ArrayList)listeners.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj = ((ArrayList) (obj)).iterator();
_L1:
        final WeakNotificationListener finalListener;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            finalListener = (WeakNotificationListener)((Iterator) (obj)).next();
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            if (handler == null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            handler.post(new Runnable() {

                final ApiDataChangeNotificationManager this$0;
                final WeakNotificationListener val$finalListener;
                final Bundle val$notificationData;
                final NotificationType val$notificationType;

                public void run()
                {
                    finalListener.onNotificationReceived(notificationType, notificationData);
                }

            
            {
                this$0 = ApiDataChangeNotificationManager.this;
                finalListener = weaknotificationlistener;
                notificationType = notificationtype;
                notificationData = bundle;
                super();
            }
            });
        } while (true);
        notificationType;
        hashmap;
        JVM INSTR monitorexit ;
        throw notificationType;
        finalListener.onNotificationReceived(notificationType, notificationData);
          goto _L1
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void notifyListenersForBucketDelete(WishUserProductBucket wishuserproductbucket)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", wishuserproductbucket.getUserId());
        bundle.putString("BucketId", wishuserproductbucket.getBucketId());
        notifyListeners(NotificationType.BucketDelete, bundle);
    }

    public void notifyListenersForBucketEdit(WishUserProductBucket wishuserproductbucket, ArrayList arraylist)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", wishuserproductbucket.getUserId());
        bundle.putString("BucketId", wishuserproductbucket.getBucketId());
        bundle.putStringArrayList("ProductId", arraylist);
        notifyListeners(NotificationType.BucketEdit, bundle);
    }

    public void notifyListenersForBucketRename(WishUserProductBucket wishuserproductbucket, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", wishuserproductbucket.getUserId());
        bundle.putString("Name", s);
        bundle.putString("BucketId", wishuserproductbucket.getBucketId());
        notifyListeners(NotificationType.BucketRename, bundle);
    }

    public void notifyListenersForCartCount(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("CartCount", i);
        notifyListeners(NotificationType.CartCount, bundle);
    }

    public void notifyListenersForCartReloadRequired()
    {
        Bundle bundle = new Bundle();
        notifyListeners(NotificationType.CartReloadRequired, bundle);
    }

    public void notifyListenersForCartReloadRequiredInBackground()
    {
        Bundle bundle = new Bundle();
        notifyListeners(NotificationType.CartReloadRequiredInBackground, bundle);
    }

    public void notifyListenersForCategoryUnwish(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("CategoryId", s);
        notifyListeners(NotificationType.UnwishForCategory, bundle);
    }

    public void notifyListenersForCategoryWish(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("CategoryId", s);
        notifyListeners(NotificationType.WishForCategory, bundle);
    }

    public void notifyListenersForExperiment(HashMap hashmap)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Experiment", hashmap);
        notifyListeners(NotificationType.Experiment, bundle);
    }

    public void notifyListenersForLogoutRequired()
    {
        notifyListeners(NotificationType.LogoutRequired, null);
    }

    public void notifyListenersForNotificationCount(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("NotificationCount", i);
        notifyListeners(NotificationType.NotificationCount, bundle);
    }

    public void notifyListenersForOrientationChanged()
    {
        Bundle bundle = new Bundle();
        notifyListeners(NotificationType.OrientationChanged, bundle);
    }

    public void notifyListenersForProductRecommendation(String s, ArrayList arraylist, ArrayList arraylist1, WishCredit wishcredit, WishProduct wishproduct)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ProductId", s);
        if (arraylist != null)
        {
            bundle.putStringArrayList("RecommendedFbIds", arraylist);
        }
        if (arraylist1 != null)
        {
            bundle.putStringArrayList("RecommendedGoogleIds", arraylist1);
        }
        if (wishcredit != null)
        {
            bundle.putSerializable("Credit", wishcredit);
        }
        if (wishproduct != null)
        {
            bundle.putSerializable("Product", wishproduct);
        }
        notifyListeners(NotificationType.ProductRecommendation, bundle);
    }

    public void notifyListenersForProductUnwish(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ProductId", s);
        notifyListeners(NotificationType.Unwish, bundle);
    }

    public void notifyListenersForProductWish(WishProduct wishproduct)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ProductId", wishproduct.getProductId());
        bundle.putSerializable("Product", wishproduct);
        notifyListeners(NotificationType.Wish, bundle);
    }

    public void notifyListenersForPurchaseComplete()
    {
        Bundle bundle = new Bundle();
        notifyListeners(NotificationType.PurchaseComplete, bundle);
    }

    public void notifyListenersForRemainingCredit(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("RemainingCredit", wishlocalizedcurrencyvalue);
        notifyListeners(NotificationType.RemainingCredit, bundle);
    }

    public void notifyListenersForUserFollow(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", s);
        notifyListeners(NotificationType.UserFollowed, bundle);
    }

    public void notifyListenersForUserUnfollow(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", s);
        notifyListeners(NotificationType.UserUnfollowed, bundle);
    }

    public void notifyListenersForUserUpdated(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("UserId", s);
        notifyListeners(NotificationType.UserUpdated, bundle);
    }

    public void notifyListenersForWalletCount(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("WalletCount", i);
        notifyListeners(NotificationType.WalletCount, bundle);
    }

    public void notifyListenersForupcomingBirthdayCount(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("UpcomingBirthdayCount", i);
        notifyListeners(NotificationType.UpcomingBirthdayCount, bundle);
    }

    public void removeListener(Object obj)
    {
        removeListener(obj, null);
    }

    public void removeListener(Object obj, NotificationType notificationtype)
    {
        WeakNotificationListener weaknotificationlistener = (WeakNotificationListener)objectWeakMapping.get(obj);
        if (weaknotificationlistener != null)
        {
            objectWeakMapping.remove(obj);
            removeWeakListener(weaknotificationlistener, notificationtype);
        }
    }


}
