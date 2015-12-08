// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;


// Referenced classes of package com.contextlogic.wish:
//            ApplicationDeepLinkConfig

public static final class  extends Enum
{

    private static final SignupGift $VALUES[];
    public static final SignupGift AnotherApp;
    public static final SignupGift Brand;
    public static final SignupGift Cart;
    public static final SignupGift CategoryHome;
    public static final SignupGift ChangePassword;
    public static final SignupGift ChangeProfilePic;
    public static final SignupGift CollectionsFeed;
    public static final SignupGift CommerceSearch;
    public static final SignupGift DataControlSettings;
    public static final SignupGift EditListTutorial;
    public static final SignupGift Feed;
    public static final SignupGift Invite;
    public static final SignupGift Notifications;
    public static final SignupGift Product;
    public static final SignupGift Profile;
    public static final SignupGift PushNotificationsSettings;
    public static final SignupGift RateApp;
    public static final SignupGift Search;
    public static final SignupGift SignupGift;
    public static final SignupGift UpdateProfile;
    public static final SignupGift Wallet;
    public static final SignupGift Website;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ApplicationDeepLinkConfig$DeepLinkType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Product = new <init>("Product", 0);
        Notifications = new <init>("Notifications", 1);
        Website = new <init>("Website", 2);
        Profile = new <init>("Profile", 3);
        Feed = new <init>("Feed", 4);
        Brand = new <init>("Brand", 5);
        Invite = new <init>("Invite", 6);
        Cart = new <init>("Cart", 7);
        Search = new <init>("Search", 8);
        CommerceSearch = new <init>("CommerceSearch", 9);
        Wallet = new <init>("Wallet", 10);
        ChangePassword = new <init>("ChangePassword", 11);
        RateApp = new <init>("RateApp", 12);
        PushNotificationsSettings = new <init>("PushNotificationsSettings", 13);
        DataControlSettings = new <init>("DataControlSettings", 14);
        UpdateProfile = new <init>("UpdateProfile", 15);
        ChangeProfilePic = new <init>("ChangeProfilePic", 16);
        CategoryHome = new <init>("CategoryHome", 17);
        CollectionsFeed = new <init>("CollectionsFeed", 18);
        AnotherApp = new <init>("AnotherApp", 19);
        EditListTutorial = new <init>("EditListTutorial", 20);
        SignupGift = new <init>("SignupGift", 21);
        $VALUES = (new .VALUES[] {
            Product, Notifications, Website, Profile, Feed, Brand, Invite, Cart, Search, CommerceSearch, 
            Wallet, ChangePassword, RateApp, PushNotificationsSettings, DataControlSettings, UpdateProfile, ChangeProfilePic, CategoryHome, CollectionsFeed, AnotherApp, 
            EditListTutorial, SignupGift
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
