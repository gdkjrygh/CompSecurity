// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;


// Referenced classes of package com.contextlogic.wish.api.core:
//            ApiDataChangeNotificationManager

public static final class  extends Enum
{

    private static final UnwishForCategory $VALUES[];
    public static final UnwishForCategory BucketDelete;
    public static final UnwishForCategory BucketEdit;
    public static final UnwishForCategory BucketRename;
    public static final UnwishForCategory CartCount;
    public static final UnwishForCategory CartReloadRequired;
    public static final UnwishForCategory CartReloadRequiredInBackground;
    public static final UnwishForCategory Experiment;
    public static final UnwishForCategory LogoutRequired;
    public static final UnwishForCategory NotificationCount;
    public static final UnwishForCategory OrientationChanged;
    public static final UnwishForCategory ProductRecommendation;
    public static final UnwishForCategory PurchaseComplete;
    public static final UnwishForCategory RemainingCredit;
    public static final UnwishForCategory Unwish;
    public static final UnwishForCategory UnwishForCategory;
    public static final UnwishForCategory UpcomingBirthdayCount;
    public static final UnwishForCategory UserFollowed;
    public static final UnwishForCategory UserUnfollowed;
    public static final UnwishForCategory UserUpdated;
    public static final UnwishForCategory WalletCount;
    public static final UnwishForCategory Wish;
    public static final UnwishForCategory WishForCategory;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/core/ApiDataChangeNotificationManager$NotificationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Wish = new <init>("Wish", 0);
        ProductRecommendation = new <init>("ProductRecommendation", 1);
        UserFollowed = new <init>("UserFollowed", 2);
        UserUnfollowed = new <init>("UserUnfollowed", 3);
        NotificationCount = new <init>("NotificationCount", 4);
        BucketRename = new <init>("BucketRename", 5);
        BucketDelete = new <init>("BucketDelete", 6);
        BucketEdit = new <init>("BucketEdit", 7);
        CartCount = new <init>("CartCount", 8);
        PurchaseComplete = new <init>("PurchaseComplete", 9);
        Experiment = new <init>("Experiment", 10);
        RemainingCredit = new <init>("RemainingCredit", 11);
        LogoutRequired = new <init>("LogoutRequired", 12);
        Unwish = new <init>("Unwish", 13);
        UserUpdated = new <init>("UserUpdated", 14);
        CartReloadRequired = new <init>("CartReloadRequired", 15);
        CartReloadRequiredInBackground = new <init>("CartReloadRequiredInBackground", 16);
        UpcomingBirthdayCount = new <init>("UpcomingBirthdayCount", 17);
        WalletCount = new <init>("WalletCount", 18);
        OrientationChanged = new <init>("OrientationChanged", 19);
        WishForCategory = new <init>("WishForCategory", 20);
        UnwishForCategory = new <init>("UnwishForCategory", 21);
        $VALUES = (new .VALUES[] {
            Wish, ProductRecommendation, UserFollowed, UserUnfollowed, NotificationCount, BucketRename, BucketDelete, BucketEdit, CartCount, PurchaseComplete, 
            Experiment, RemainingCredit, LogoutRequired, Unwish, UserUpdated, CartReloadRequired, CartReloadRequiredInBackground, UpcomingBirthdayCount, WalletCount, OrientationChanged, 
            WishForCategory, UnwishForCategory
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
