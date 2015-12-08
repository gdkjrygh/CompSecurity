// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

public class ApplicationDeepLinkConfig
{
    public static final class DeepLinkType extends Enum
    {

        private static final DeepLinkType $VALUES[];
        public static final DeepLinkType AnotherApp;
        public static final DeepLinkType Brand;
        public static final DeepLinkType Cart;
        public static final DeepLinkType CategoryHome;
        public static final DeepLinkType ChangePassword;
        public static final DeepLinkType ChangeProfilePic;
        public static final DeepLinkType CollectionsFeed;
        public static final DeepLinkType CommerceSearch;
        public static final DeepLinkType DataControlSettings;
        public static final DeepLinkType EditListTutorial;
        public static final DeepLinkType Feed;
        public static final DeepLinkType Invite;
        public static final DeepLinkType Notifications;
        public static final DeepLinkType Product;
        public static final DeepLinkType Profile;
        public static final DeepLinkType PushNotificationsSettings;
        public static final DeepLinkType RateApp;
        public static final DeepLinkType Search;
        public static final DeepLinkType SignupGift;
        public static final DeepLinkType UpdateProfile;
        public static final DeepLinkType Wallet;
        public static final DeepLinkType Website;

        public static DeepLinkType valueOf(String s)
        {
            return (DeepLinkType)Enum.valueOf(com/contextlogic/wish/ApplicationDeepLinkConfig$DeepLinkType, s);
        }

        public static DeepLinkType[] values()
        {
            return (DeepLinkType[])$VALUES.clone();
        }

        static 
        {
            Product = new DeepLinkType("Product", 0);
            Notifications = new DeepLinkType("Notifications", 1);
            Website = new DeepLinkType("Website", 2);
            Profile = new DeepLinkType("Profile", 3);
            Feed = new DeepLinkType("Feed", 4);
            Brand = new DeepLinkType("Brand", 5);
            Invite = new DeepLinkType("Invite", 6);
            Cart = new DeepLinkType("Cart", 7);
            Search = new DeepLinkType("Search", 8);
            CommerceSearch = new DeepLinkType("CommerceSearch", 9);
            Wallet = new DeepLinkType("Wallet", 10);
            ChangePassword = new DeepLinkType("ChangePassword", 11);
            RateApp = new DeepLinkType("RateApp", 12);
            PushNotificationsSettings = new DeepLinkType("PushNotificationsSettings", 13);
            DataControlSettings = new DeepLinkType("DataControlSettings", 14);
            UpdateProfile = new DeepLinkType("UpdateProfile", 15);
            ChangeProfilePic = new DeepLinkType("ChangeProfilePic", 16);
            CategoryHome = new DeepLinkType("CategoryHome", 17);
            CollectionsFeed = new DeepLinkType("CollectionsFeed", 18);
            AnotherApp = new DeepLinkType("AnotherApp", 19);
            EditListTutorial = new DeepLinkType("EditListTutorial", 20);
            SignupGift = new DeepLinkType("SignupGift", 21);
            $VALUES = (new DeepLinkType[] {
                Product, Notifications, Website, Profile, Feed, Brand, Invite, Cart, Search, CommerceSearch, 
                Wallet, ChangePassword, RateApp, PushNotificationsSettings, DataControlSettings, UpdateProfile, ChangeProfilePic, CategoryHome, CollectionsFeed, AnotherApp, 
                EditListTutorial, SignupGift
            });
        }

        private DeepLinkType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String BUCKET_ID_KEY = "bucket-id-key";
    private static final String CREDIT_ID_KEY = "credit-id-key";
    private static final String DATA_KEY = "data-key";
    private static final String NOTIFICATION_ID_KEY = "notification-id-key";
    private static final String PRODUCT_ID_KEY = "product-id-key";
    private static final String RECOMMENDED_BY_ID_KEY = "recommended-by-id-key";
    private static final String SET_ID_KEY = "set-id-key";
    private static final String VARIATION_ID_KEY = "variation-id-key";
    private Bundle data;
    private DeepLinkType type;
    private Uri uri;

    public ApplicationDeepLinkConfig(DeepLinkType deeplinktype, Uri uri1)
    {
        type = deeplinktype;
        data = new Bundle();
        uri = uri1;
    }

    public ApplicationDeepLinkConfig(DeepLinkType deeplinktype, Uri uri1, Parcelable parcelable)
    {
        type = deeplinktype;
        data = new Bundle();
        uri = uri1;
        if (parcelable != null)
        {
            data.putParcelable("data-key", parcelable);
        }
    }

    public ApplicationDeepLinkConfig(DeepLinkType deeplinktype, Uri uri1, Serializable serializable)
    {
        type = deeplinktype;
        data = new Bundle();
        uri = uri1;
        if (serializable != null)
        {
            data.putSerializable("data-key", serializable);
        }
    }

    public int getBucketId()
    {
        if (data.containsKey("bucket-id-key"))
        {
            return data.getInt("bucket-id-key");
        } else
        {
            return -1;
        }
    }

    public String getCreditInfo()
    {
        return data.getString("credit-id-key");
    }

    public int getIntData()
    {
        return data.getInt("data-key");
    }

    public int getNotificationId()
    {
        if (data.containsKey("notification-id-key"))
        {
            return data.getInt("notification-id-key");
        } else
        {
            return -1;
        }
    }

    public String getProductId()
    {
        return data.getString("product-id-key");
    }

    public String getRecommendedBy()
    {
        return data.getString("recommended-by-id-key");
    }

    public Serializable getSerializableData()
    {
        return data.getSerializable("data-key");
    }

    public String getSetId()
    {
        return data.getString("set-id-key");
    }

    public String getStringData()
    {
        return data.getString("data-key");
    }

    public DeepLinkType getType()
    {
        return type;
    }

    public Uri getUri()
    {
        return uri;
    }

    public Uri getUriData()
    {
        return (Uri)data.getParcelable("data-key");
    }

    public String getVariationId()
    {
        return data.getString("variation-id-key");
    }

    public void setCartInfo(String s, String s1)
    {
        data.putString("product-id-key", s);
        data.putString("variation-id-key", s1);
    }

    public void setCreditInfo(String s)
    {
        data.putString("credit-id-key", s);
    }

    public void setNotificationInfo(int i, int j)
    {
        data.putInt("notification-id-key", i);
        data.putInt("bucket-id-key", j);
    }

    public void setRecommendedByInfo(String s)
    {
        data.putString("recommended-by-id-key", s);
    }

    public void setSetId(String s)
    {
        data.putString("set-id-key", s);
    }
}
