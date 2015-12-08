// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;


// Referenced classes of package com.contextlogic.wish.analytics:
//            Analytics

public static final class  extends Enum
{

    private static final Unspecified $VALUES[];
    public static final Unspecified ActivityEveryone;
    public static final Unspecified ActivityFollowing;
    public static final Unspecified ActivityFollowingFeed;
    public static final Unspecified ActivityTabFrame;
    public static final Unspecified AddCommerceProductEditor;
    public static final Unspecified AddCommerceProductImageView;
    public static final Unspecified AddFrendsFacebookDialog;
    public static final Unspecified AddFriendsSplash;
    public static final Unspecified AddProductBarcodeScan;
    public static final Unspecified AddProductBarcodeScanResults;
    public static final Unspecified AddProductCamera;
    public static final Unspecified AddProductCustomCamera;
    public static final Unspecified AddProductCustomCameraConfirm;
    public static final Unspecified AddProductDialog;
    public static final Unspecified AddProductEditor;
    public static final Unspecified AddProductGallery;
    public static final Unspecified AddProductLink;
    public static final Unspecified AddProductMenu;
    public static final Unspecified AddProductPhotoBarcodeScan;
    public static final Unspecified AddProductPhotoCamera;
    public static final Unspecified AddProductPhotoDialog;
    public static final Unspecified AddProductPhotoEditor;
    public static final Unspecified AddProductPhotoGallery;
    public static final Unspecified AddProductPhotoLink;
    public static final Unspecified AddToCartModal;
    public static final Unspecified AllNotifications;
    public static final Unspecified Api;
    public static final Unspecified AppList;
    public static final Unspecified ApplyGiftCard;
    public static final Unspecified BillingInfo;
    public static final Unspecified BottomNavBar;
    public static final Unspecified BrandFeedGrid;
    public static final Unspecified BrowseCategoriesMyTags;
    public static final Unspecified BrowseCategoriesPopular;
    public static final Unspecified BrowseCategoriesTabFrame;
    public static final Unspecified Cart;
    public static final Unspecified CartReview;
    public static final Unspecified ChangePassword;
    public static final Unspecified Comments;
    public static final Unspecified CommerceHomeCategories;
    public static final Unspecified DataControlSettings;
    public static final Unspecified DeepLink;
    public static final Unspecified DeveloperSettings;
    public static final Unspecified EmailLogin;
    public static final Unspecified EmailSignup;
    public static final Unspecified EmbeddedBrowser;
    public static final Unspecified Experiments;
    public static final Unspecified Explore;
    public static final Unspecified External;
    public static final Unspecified FacebookDeepLink;
    public static final Unspecified FailedUpload;
    public static final Unspecified FeedBadgeOverlay;
    public static final Unspecified FeedEducationalOverlay;
    public static final Unspecified FeedFilter;
    public static final Unspecified FeedGrid;
    public static final Unspecified FeedList;
    public static final Unspecified FeedSideNavOverlay;
    public static final Unspecified FeedValuePropOverlay;
    public static final Unspecified FlagProduct;
    public static final Unspecified ForgotPassword;
    public static final Unspecified FriendPickerContainer;
    public static final Unspecified FriendPickerInvite;
    public static final Unspecified FriendPickerInviteContactsSignupNiagaraStepFour;
    public static final Unspecified FriendPickerInviteContactsSignupStepTwo;
    public static final Unspecified FriendPickerInviteSignupNiagaraStepFour;
    public static final Unspecified FriendPickerInviteSignupStepTwo;
    public static final Unspecified FriendPickerRecommend;
    public static final Unspecified FriendPickerRecommendFeed;
    public static final Unspecified FriendPickerSignupNiagaraStepFourContainer;
    public static final Unspecified FriendPickerWidgetContainer;
    public static final Unspecified GiftCart;
    public static final Unspecified GiftOrderComplete;
    public static final Unspecified GiftingDashboard;
    public static final Unspecified GiftingFeedGrid;
    public static final Unspecified HelpMenu;
    public static final Unspecified ImproveListingImage;
    public static final Unspecified ImproveListingTags;
    public static final Unspecified InviteFriendsByLink;
    public static final Unspecified InviteFriendsStartPage;
    public static final Unspecified LearnMore;
    public static final Unspecified ListEditingOverlay;
    public static final Unspecified ListEditingTour;
    public static final Unspecified LoggedOutLoginBar;
    public static final Unspecified LoginRequired;
    public static final Unspecified LoginSplash;
    public static final Unspecified LoginTooltip;
    public static final Unspecified Menu;
    public static final Unspecified MerchantFeedGrid;
    public static final Unspecified MerchantRatings;
    public static final Unspecified MoveToBucket;
    public static final Unspecified MoveToWishlistMenu;
    public static final Unspecified MyProfile;
    public static final Unspecified NavigationEducationalOverlay;
    public static final Unspecified NavigationTabFrame;
    public static final Unspecified NewUserInviteFriendsPrompt;
    public static final Unspecified Notifications;
    public static final Unspecified NotificationsValuePropOverlay;
    public static final Unspecified OtherProfile;
    public static final Unspecified OutOfWishes;
    public static final Unspecified PhonebookFriendPickerInvite;
    public static final Unspecified PhonebookFriendPickerRecommend;
    public static final Unspecified PhonebookFriendPickerRecommendFeed;
    public static final Unspecified PostToWallPrompt;
    public static final Unspecified ProductComments;
    public static final Unspecified ProductDescription;
    public static final Unspecified ProductDetails;
    public static final Unspecified ProductDetailsCategoriesTab;
    public static final Unspecified ProductDetailsDiscountValuePropOverlay;
    public static final Unspecified ProductDetailsEducationalOverlay;
    public static final Unspecified ProductDetailsMainTab;
    public static final Unspecified ProductDetailsRecommendWidget;
    public static final Unspecified ProductDetailsWishValuePropOverlay;
    public static final Unspecified ProductDetailsWishValuePropOverlayStepTwo;
    public static final Unspecified ProductFeedRecommendWidget;
    public static final Unspecified ProductMorePhotos;
    public static final Unspecified ProductRatings;
    public static final Unspecified ProfileBucketGrid;
    public static final Unspecified ProfileBucketList;
    public static final Unspecified ProfileEducationalOverlay;
    public static final Unspecified ProfileFollowers;
    public static final Unspecified ProfileFollowing;
    public static final Unspecified ProfileWishes;
    public static final Unspecified PushNotification;
    public static final Unspecified PushNotificationSettings;
    public static final Unspecified RateAppPrompt;
    public static final Unspecified RecommendProductFacebookDialog;
    public static final Unspecified RecommendRewardRibbon;
    public static final Unspecified RecommendRewardTooltip;
    public static final Unspecified RenameBucket;
    public static final Unspecified RequestGiftCard;
    public static final Unspecified RequestGiftCardConfirm;
    public static final Unspecified SaleParties;
    public static final Unspecified SalePartyTour;
    public static final Unspecified Search;
    public static final Unspecified SearchResultGrid;
    public static final Unspecified SearchResultList;
    public static final Unspecified SellTour;
    public static final Unspecified Settings;
    public static final Unspecified ShareDeepLink;
    public static final Unspecified ShareOnFacebook;
    public static final Unspecified ShippingInfo;
    public static final Unspecified Shops;
    public static final Unspecified SignupNiagaraStepThree;
    public static final Unspecified SignupNiagaraStepTwo;
    public static final Unspecified SignupOverlay;
    public static final Unspecified SignupStepOne;
    public static final Unspecified SignupStepThree;
    public static final Unspecified SignupUpdateProfile;
    public static final Unspecified Tour;
    public static final Unspecified UnreadNotifications;
    public static final Unspecified Unspecified;
    public static final Unspecified UpdateAppPrompt;
    public static final Unspecified Wallet;
    public static final Unspecified WalletFrame;
    public static final Unspecified WalletGiftCards;
    public static final Unspecified WalletRebates;
    public static final Unspecified WhatsNewPrompt;
    public static final Unspecified WishApp;
    public static final Unspecified WishesFeedGrid;
    public static final Unspecified WishlistMenu;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/analytics/Analytics$PageViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WishApp = new <init>("WishApp", 0);
        External = new <init>("External", 1);
        FacebookDeepLink = new <init>("FacebookDeepLink", 2);
        LoginSplash = new <init>("LoginSplash", 3);
        NavigationTabFrame = new <init>("NavigationTabFrame", 4);
        BrowseCategoriesTabFrame = new <init>("BrowseCategoriesTabFrame", 5);
        BrowseCategoriesPopular = new <init>("BrowseCategoriesPopular", 6);
        BrowseCategoriesMyTags = new <init>("BrowseCategoriesMyTags", 7);
        ProductDetails = new <init>("ProductDetails", 8);
        FlagProduct = new <init>("FlagProduct", 9);
        ShareOnFacebook = new <init>("ShareOnFacebook", 10);
        ActivityTabFrame = new <init>("ActivityTabFrame", 11);
        ActivityEveryone = new <init>("ActivityEveryone", 12);
        ActivityFollowing = new <init>("ActivityFollowing", 13);
        MyProfile = new <init>("MyProfile", 14);
        OtherProfile = new <init>("OtherProfile", 15);
        FeedGrid = new <init>("FeedGrid", 16);
        FeedList = new <init>("FeedList", 17);
        Search = new <init>("Search", 18);
        SearchResultList = new <init>("SearchResultList", 19);
        SearchResultGrid = new <init>("SearchResultGrid", 20);
        ProfileBucketList = new <init>("ProfileBucketList", 21);
        ProfileBucketGrid = new <init>("ProfileBucketGrid", 22);
        AddProductDialog = new <init>("AddProductDialog", 23);
        AddProductPhotoDialog = new <init>("AddProductPhotoDialog", 24);
        AddProductCamera = new <init>("AddProductCamera", 25);
        AddProductPhotoCamera = new <init>("AddProductPhotoCamera", 26);
        AddProductGallery = new <init>("AddProductGallery", 27);
        AddProductPhotoGallery = new <init>("AddProductPhotoGallery", 28);
        AddProductLink = new <init>("AddProductLink", 29);
        AddProductPhotoBarcodeScan = new <init>("AddProductPhotoBarcodeScan", 30);
        AddProductBarcodeScan = new <init>("AddProductBarcodeScan", 31);
        AddProductBarcodeScanResults = new <init>("AddProductBarcodeScanResults", 32);
        AddProductPhotoLink = new <init>("AddProductPhotoLink", 33);
        AddProductEditor = new <init>("AddProductEditor", 34);
        AddProductPhotoEditor = new <init>("AddProductPhotoEditor", 35);
        Settings = new <init>("Settings", 36);
        AddFriendsSplash = new <init>("AddFriendsSplash", 37);
        AddFrendsFacebookDialog = new <init>("AddFrendsFacebookDialog", 38);
        RecommendProductFacebookDialog = new <init>("RecommendProductFacebookDialog", 39);
        EmbeddedBrowser = new <init>("EmbeddedBrowser", 40);
        ProductMorePhotos = new <init>("ProductMorePhotos", 41);
        Notifications = new <init>("Notifications", 42);
        ProfileFollowers = new <init>("ProfileFollowers", 43);
        ProfileFollowing = new <init>("ProfileFollowing", 44);
        OutOfWishes = new <init>("OutOfWishes", 45);
        LoginRequired = new <init>("LoginRequired", 46);
        LearnMore = new <init>("LearnMore", 47);
        RateAppPrompt = new <init>("RateAppPrompt", 48);
        NewUserInviteFriendsPrompt = new <init>("NewUserInviteFriendsPrompt", 49);
        UpdateAppPrompt = new <init>("UpdateAppPrompt", 50);
        LoggedOutLoginBar = new <init>("LoggedOutLoginBar", 51);
        DeveloperSettings = new <init>("DeveloperSettings", 52);
        ProfileEducationalOverlay = new <init>("ProfileEducationalOverlay", 53);
        NavigationEducationalOverlay = new <init>("NavigationEducationalOverlay", 54);
        FeedEducationalOverlay = new <init>("FeedEducationalOverlay", 55);
        ProductDetailsEducationalOverlay = new <init>("ProductDetailsEducationalOverlay", 56);
        ProductComments = new <init>("ProductComments", 57);
        FriendPickerRecommend = new <init>("FriendPickerRecommend", 58);
        FriendPickerInvite = new <init>("FriendPickerInvite", 59);
        WhatsNewPrompt = new <init>("WhatsNewPrompt", 60);
        RecommendRewardRibbon = new <init>("RecommendRewardRibbon", 61);
        RecommendRewardTooltip = new <init>("RecommendRewardTooltip", 62);
        LoginTooltip = new <init>("LoginTooltip", 63);
        PushNotification = new <init>("PushNotification", 64);
        AddProductMenu = new <init>("AddProductMenu", 65);
        HelpMenu = new <init>("HelpMenu", 66);
        Menu = new <init>("Menu", 67);
        ProductDetailsCategoriesTab = new <init>("ProductDetailsCategoriesTab", 68);
        ProductDetailsMainTab = new <init>("ProductDetailsMainTab", 69);
        ProfileWishes = new <init>("ProfileWishes", 70);
        PushNotificationSettings = new <init>("PushNotificationSettings", 71);
        FailedUpload = new <init>("FailedUpload", 72);
        ShareDeepLink = new <init>("ShareDeepLink", 73);
        Api = new <init>("Api", 74);
        Tour = new <init>("Tour", 75);
        FeedFilter = new <init>("FeedFilter", 76);
        PostToWallPrompt = new <init>("PostToWallPrompt", 77);
        InviteFriendsStartPage = new <init>("InviteFriendsStartPage", 78);
        PhonebookFriendPickerInvite = new <init>("PhonebookFriendPickerInvite", 79);
        RenameBucket = new <init>("RenameBucket", 80);
        MoveToBucket = new <init>("MoveToBucket", 81);
        ListEditingTour = new <init>("ListEditingTour", 82);
        ListEditingOverlay = new <init>("ListEditingOverlay", 83);
        FeedBadgeOverlay = new <init>("FeedBadgeOverlay", 84);
        Cart = new <init>("Cart", 85);
        DeepLink = new <init>("DeepLink", 86);
        FeedValuePropOverlay = new <init>("FeedValuePropOverlay", 87);
        ProductDetailsWishValuePropOverlay = new <init>("ProductDetailsWishValuePropOverlay", 88);
        NotificationsValuePropOverlay = new <init>("NotificationsValuePropOverlay", 89);
        ProductDetailsDiscountValuePropOverlay = new <init>("ProductDetailsDiscountValuePropOverlay", 90);
        ProductDetailsWishValuePropOverlayStepTwo = new <init>("ProductDetailsWishValuePropOverlayStepTwo", 91);
        Shops = new <init>("Shops", 92);
        AllNotifications = new <init>("AllNotifications", 93);
        UnreadNotifications = new <init>("UnreadNotifications", 94);
        Experiments = new <init>("Experiments", 95);
        AddToCartModal = new <init>("AddToCartModal", 96);
        Explore = new <init>("Explore", 97);
        FeedSideNavOverlay = new <init>("FeedSideNavOverlay", 98);
        SignupStepOne = new <init>("SignupStepOne", 99);
        FriendPickerInviteSignupStepTwo = new <init>("FriendPickerInviteSignupStepTwo", 100);
        SignupStepThree = new <init>("SignupStepThree", 101);
        WalletFrame = new <init>("WalletFrame", 102);
        Wallet = new <init>("Wallet", 103);
        WalletRebates = new <init>("WalletRebates", 104);
        WalletGiftCards = new <init>("WalletGiftCards", 105);
        ProductDescription = new <init>("ProductDescription", 106);
        FriendPickerContainer = new <init>("FriendPickerContainer", 107);
        FriendPickerInviteContactsSignupStepTwo = new <init>("FriendPickerInviteContactsSignupStepTwo", 108);
        FriendPickerWidgetContainer = new <init>("FriendPickerWidgetContainer", 109);
        FriendPickerRecommendFeed = new <init>("FriendPickerRecommendFeed", 110);
        PhonebookFriendPickerRecommendFeed = new <init>("PhonebookFriendPickerRecommendFeed", 111);
        ApplyGiftCard = new <init>("ApplyGiftCard", 112);
        ProductFeedRecommendWidget = new <init>("ProductFeedRecommendWidget", 113);
        ProductDetailsRecommendWidget = new <init>("ProductDetailsRecommendWidget", 114);
        WishlistMenu = new <init>("WishlistMenu", 115);
        MoveToWishlistMenu = new <init>("MoveToWishlistMenu", 116);
        ActivityFollowingFeed = new <init>("ActivityFollowingFeed", 117);
        PhonebookFriendPickerRecommend = new <init>("PhonebookFriendPickerRecommend", 118);
        SignupNiagaraStepTwo = new <init>("SignupNiagaraStepTwo", 119);
        FriendPickerInviteSignupNiagaraStepFour = new <init>("FriendPickerInviteSignupNiagaraStepFour", 120);
        FriendPickerInviteContactsSignupNiagaraStepFour = new <init>("FriendPickerInviteContactsSignupNiagaraStepFour", 121);
        FriendPickerSignupNiagaraStepFourContainer = new <init>("FriendPickerSignupNiagaraStepFourContainer", 122);
        SignupNiagaraStepThree = new <init>("SignupNiagaraStepThree", 123);
        SignupOverlay = new <init>("SignupOverlay", 124);
        BottomNavBar = new <init>("BottomNavBar", 125);
        MerchantFeedGrid = new <init>("MerchantFeedGrid", 126);
        BrandFeedGrid = new <init>("BrandFeedGrid", 127);
        WishesFeedGrid = new <init>("WishesFeedGrid", 128);
        AddProductCustomCamera = new <init>("AddProductCustomCamera", 129);
        AddProductCustomCameraConfirm = new <init>("AddProductCustomCameraConfirm", 130);
        AddCommerceProductImageView = new <init>("AddCommerceProductImageView", 131);
        AddCommerceProductEditor = new <init>("AddCommerceProductEditor", 132);
        SellTour = new <init>("SellTour", 133);
        BillingInfo = new <init>("BillingInfo", 134);
        ShippingInfo = new <init>("ShippingInfo", 135);
        ImproveListingImage = new <init>("ImproveListingImage", 136);
        ImproveListingTags = new <init>("ImproveListingTags", 137);
        SaleParties = new <init>("SaleParties", 138);
        RequestGiftCard = new <init>("RequestGiftCard", 139);
        RequestGiftCardConfirm = new <init>("RequestGiftCardConfirm", 140);
        EmailLogin = new <init>("EmailLogin", 141);
        ForgotPassword = new <init>("ForgotPassword", 142);
        EmailSignup = new <init>("EmailSignup", 143);
        ChangePassword = new <init>("ChangePassword", 144);
        SignupUpdateProfile = new <init>("SignupUpdateProfile", 145);
        Comments = new <init>("Comments", 146);
        SalePartyTour = new <init>("SalePartyTour", 147);
        CartReview = new <init>("CartReview", 148);
        DataControlSettings = new <init>("DataControlSettings", 149);
        CommerceHomeCategories = new <init>("CommerceHomeCategories", 150);
        GiftOrderComplete = new <init>("GiftOrderComplete", 151);
        GiftCart = new <init>("GiftCart", 152);
        GiftingDashboard = new <init>("GiftingDashboard", 153);
        GiftingFeedGrid = new <init>("GiftingFeedGrid", 154);
        MerchantRatings = new <init>("MerchantRatings", 155);
        ProductRatings = new <init>("ProductRatings", 156);
        InviteFriendsByLink = new <init>("InviteFriendsByLink", 157);
        AppList = new <init>("AppList", 158);
        Unspecified = new <init>("Unspecified", 159);
        $VALUES = (new .VALUES[] {
            WishApp, External, FacebookDeepLink, LoginSplash, NavigationTabFrame, BrowseCategoriesTabFrame, BrowseCategoriesPopular, BrowseCategoriesMyTags, ProductDetails, FlagProduct, 
            ShareOnFacebook, ActivityTabFrame, ActivityEveryone, ActivityFollowing, MyProfile, OtherProfile, FeedGrid, FeedList, Search, SearchResultList, 
            SearchResultGrid, ProfileBucketList, ProfileBucketGrid, AddProductDialog, AddProductPhotoDialog, AddProductCamera, AddProductPhotoCamera, AddProductGallery, AddProductPhotoGallery, AddProductLink, 
            AddProductPhotoBarcodeScan, AddProductBarcodeScan, AddProductBarcodeScanResults, AddProductPhotoLink, AddProductEditor, AddProductPhotoEditor, Settings, AddFriendsSplash, AddFrendsFacebookDialog, RecommendProductFacebookDialog, 
            EmbeddedBrowser, ProductMorePhotos, Notifications, ProfileFollowers, ProfileFollowing, OutOfWishes, LoginRequired, LearnMore, RateAppPrompt, NewUserInviteFriendsPrompt, 
            UpdateAppPrompt, LoggedOutLoginBar, DeveloperSettings, ProfileEducationalOverlay, NavigationEducationalOverlay, FeedEducationalOverlay, ProductDetailsEducationalOverlay, ProductComments, FriendPickerRecommend, FriendPickerInvite, 
            WhatsNewPrompt, RecommendRewardRibbon, RecommendRewardTooltip, LoginTooltip, PushNotification, AddProductMenu, HelpMenu, Menu, ProductDetailsCategoriesTab, ProductDetailsMainTab, 
            ProfileWishes, PushNotificationSettings, FailedUpload, ShareDeepLink, Api, Tour, FeedFilter, PostToWallPrompt, InviteFriendsStartPage, PhonebookFriendPickerInvite, 
            RenameBucket, MoveToBucket, ListEditingTour, ListEditingOverlay, FeedBadgeOverlay, Cart, DeepLink, FeedValuePropOverlay, ProductDetailsWishValuePropOverlay, NotificationsValuePropOverlay, 
            ProductDetailsDiscountValuePropOverlay, ProductDetailsWishValuePropOverlayStepTwo, Shops, AllNotifications, UnreadNotifications, Experiments, AddToCartModal, Explore, FeedSideNavOverlay, SignupStepOne, 
            FriendPickerInviteSignupStepTwo, SignupStepThree, WalletFrame, Wallet, WalletRebates, WalletGiftCards, ProductDescription, FriendPickerContainer, FriendPickerInviteContactsSignupStepTwo, FriendPickerWidgetContainer, 
            FriendPickerRecommendFeed, PhonebookFriendPickerRecommendFeed, ApplyGiftCard, ProductFeedRecommendWidget, ProductDetailsRecommendWidget, WishlistMenu, MoveToWishlistMenu, ActivityFollowingFeed, PhonebookFriendPickerRecommend, SignupNiagaraStepTwo, 
            FriendPickerInviteSignupNiagaraStepFour, FriendPickerInviteContactsSignupNiagaraStepFour, FriendPickerSignupNiagaraStepFourContainer, SignupNiagaraStepThree, SignupOverlay, BottomNavBar, MerchantFeedGrid, BrandFeedGrid, WishesFeedGrid, AddProductCustomCamera, 
            AddProductCustomCameraConfirm, AddCommerceProductImageView, AddCommerceProductEditor, SellTour, BillingInfo, ShippingInfo, ImproveListingImage, ImproveListingTags, SaleParties, RequestGiftCard, 
            RequestGiftCardConfirm, EmailLogin, ForgotPassword, EmailSignup, ChangePassword, SignupUpdateProfile, Comments, SalePartyTour, CartReview, DataControlSettings, 
            CommerceHomeCategories, GiftOrderComplete, GiftCart, GiftingDashboard, GiftingFeedGrid, MerchantRatings, ProductRatings, InviteFriendsByLink, AppList, Unspecified
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
