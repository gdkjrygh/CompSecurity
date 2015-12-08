// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;

import android.app.Application;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.user.LoggedInUser;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Analytics
{
    public static final class EventType extends Enum
    {

        private static final EventType $VALUES[];
        public static final EventType ActivityOtherProfileSelect;
        public static final EventType ActivityProductSelect;
        public static final EventType ActivityProfileSelect;
        public static final EventType ActivitySelect;
        public static final EventType AddCommerceProduct;
        public static final EventType AddFriends;
        public static final EventType AddFriendsPhonebook;
        public static final EventType AddProduct;
        public static final EventType AddProductBarcodeScan;
        public static final EventType AddProductCamera;
        public static final EventType AddProductGallery;
        public static final EventType AddProductLink;
        public static final EventType AddProductPhoto;
        public static final EventType AddProductPhotoBarcodeScan;
        public static final EventType AddProductPhotoCamera;
        public static final EventType AddProductPhotoGallery;
        public static final EventType AddProductPhotoLink;
        public static final EventType AddProductShareImage;
        public static final EventType AddProductShareLink;
        public static final EventType AddToCart;
        public static final EventType AutoRefresh;
        public static final EventType Back;
        public static final EventType BrowseProductsSelect;
        public static final EventType BrowseSelect;
        public static final EventType BuyMore;
        public static final EventType BuySelect;
        public static final EventType Cancel;
        public static final EventType CaptureSelect;
        public static final EventType CartBannerSelect;
        public static final EventType CartHeaderSelect;
        public static final EventType CartSelect;
        public static final EventType CategorySelect;
        public static final EventType ChangePage;
        public static final EventType ChangePasswordSelect;
        public static final EventType ChangeSort;
        public static final EventType ChangeUser;
        public static final EventType Checkout;
        public static final EventType CommenterSelect;
        public static final EventType CommentsLogin;
        public static final EventType CommerceHomeCategoryScroll;
        public static final EventType CommerceHomeCategorySelect;
        public static final EventType Create;
        public static final EventType CreateAccountSelect;
        public static final EventType CurrencySettingsSelect;
        public static final EventType DailyPing;
        public static final EventType DataControlSelect;
        public static final EventType DeleteAccount;
        public static final EventType DeleteBucket;
        public static final EventType Dismiss;
        public static final EventType DoNotRecommend;
        public static final EventType Done;
        public static final EventType EditBillingInfo;
        public static final EventType EditProduct;
        public static final EventType EditShippingInfo;
        public static final EventType EmailJoinSelect;
        public static final EventType EmailLoginStepOne;
        public static final EventType EmailSignInSelect;
        public static final EventType EmailSignupStepOne;
        public static final EventType EmailsSelect;
        public static final EventType ExternalBrowserSelect;
        public static final EventType FacebookLogin;
        public static final EventType FacebookLoginCancel;
        public static final EventType FacebookLoginError;
        public static final EventType FacebookLoginFacebookError;
        public static final EventType FeedSearchBarSelect;
        public static final EventType FilterSelect;
        public static final EventType FlagProduct;
        public static final EventType FlashSelect;
        public static final EventType Follow;
        public static final EventType ForgotPassword;
        public static final EventType Forward;
        public static final EventType FriendDeselect;
        public static final EventType FriendSelect;
        public static final EventType GallerySelect;
        public static final EventType GetStarted;
        public static final EventType GiftIt;
        public static final EventType GoogleLogin;
        public static final EventType GooglePlusLoginPrestep;
        public static final EventType GooglePlusLoginStepOne;
        public static final EventType HelpSelect;
        public static final EventType HideProduct;
        public static final EventType HomeSelect;
        public static final EventType ImageSelected;
        public static final EventType KiipImpression;
        public static final EventType LaunchApp;
        public static final EventType LearnMoreSelect;
        public static final EventType LessSelect;
        public static final EventType ListEditingTourSelect;
        public static final EventType Load;
        public static final EventType LoggedOutBrowseSelect;
        public static final EventType Login;
        public static final EventType LoginStepFour;
        public static final EventType LoginStepOne;
        public static final EventType LoginStepThree;
        public static final EventType LoginStepTwo;
        public static final EventType Logout;
        public static final EventType LogoutRequired;
        public static final EventType MerchantRatingsSelect;
        public static final EventType MoreComments;
        public static final EventType MorePhotosSelect;
        public static final EventType MoreSelect;
        public static final EventType MoveToBucket;
        public static final EventType MyRewardsSelect;
        public static final EventType NewUserLoginStepFour;
        public static final EventType NewUserLoginStepThree;
        public static final EventType NewUserLoginStepTwo;
        public static final EventType NewWishUserFinishLogin;
        public static final EventType Next;
        public static final EventType NoItems;
        public static final EventType NotificationsSelect;
        public static final EventType OrderHistorySelect;
        public static final EventType PartiesSelect;
        public static final EventType PersistentCartSelect;
        public static final EventType PhonebookInvite;
        public static final EventType PhotoSelect;
        public static final EventType PostToWall;
        public static final EventType PrivacyPolicySelect;
        public static final EventType ProductCommentsSelect;
        public static final EventType ProductDescriptionSelect;
        public static final EventType ProductDetailSwipe;
        public static final EventType ProductPictureBuySelect;
        public static final EventType ProductSelected;
        public static final EventType ProductSubmitterSelect;
        public static final EventType ProductTagSelect;
        public static final EventType ProductWinnerSelect;
        public static final EventType ProductWisherSelect;
        public static final EventType ProfileBirthdaySelected;
        public static final EventType ProfileBucketSelect;
        public static final EventType ProfileFollowersSelect;
        public static final EventType ProfileFollowersSelected;
        public static final EventType ProfileFollowingSelect;
        public static final EventType ProfileFollowingSelected;
        public static final EventType ProfileSelect;
        public static final EventType ProfileUserBucketSelect;
        public static final EventType ProfileWishesSelected;
        public static final EventType PushNotificationSettingsSelect;
        public static final EventType RateAppSelect;
        public static final EventType RaterSelect;
        public static final EventType RecommendFeed;
        public static final EventType RecommendProduct;
        public static final EventType Redeem;
        public static final EventType Refresh;
        public static final EventType RelatedProductFeedSelect;
        public static final EventType RelatedProductSelect;
        public static final EventType Relogin;
        public static final EventType RemindMeLater;
        public static final EventType Remove;
        public static final EventType RemoveFromCart;
        public static final EventType RemoveFromSale;
        public static final EventType RenameBucket;
        public static final EventType Retry;
        public static final EventType ReturnPolicySelect;
        public static final EventType SalePartySelect;
        public static final EventType SalePartyTourSelect;
        public static final EventType ScanBarcodeResultSelect;
        public static final EventType ScanCreditCard;
        public static final EventType ScrollLoad;
        public static final EventType Search;
        public static final EventType SearchFriendTypeaheadSelect;
        public static final EventType SearchHistoryTypeaheadSelect;
        public static final EventType SearchPopularSelect;
        public static final EventType SearchProductTypeaheadSelect;
        public static final EventType SearchSelect;
        public static final EventType SellFaqSelect;
        public static final EventType SellSelect;
        public static final EventType SellTourSelect;
        public static final EventType Send;
        public static final EventType SendAll;
        public static final EventType SendFeedbackSelect;
        public static final EventType SettingsSelect;
        public static final EventType Share;
        public static final EventType ShareOnFacebook;
        public static final EventType ShopsSelect;
        public static final EventType SingleUserInvite;
        public static final EventType Skip;
        public static final EventType SkipPersonalize;
        public static final EventType SkipPersonalizeCancel;
        public static final EventType SkipPromptAddFriends;
        public static final EventType SkipPromptDontWantFriends;
        public static final EventType SortHeaderSelect;
        public static final EventType SplashImageLogin;
        public static final EventType SubmitComment;
        public static final EventType SwitchCameraSelect;
        public static final EventType TagAutocompleteSelect;
        public static final EventType TargetSelect;
        public static final EventType TermsOfServiceSelect;
        public static final EventType ToggleView;
        public static final EventType ToolbarBackSelect;
        public static final EventType ToolbarMenuSelect;
        public static final EventType TourSelect;
        public static final EventType TryAgain;
        public static final EventType TurnOffFacebookShare;
        public static final EventType TurnOnFacebookShare;
        public static final EventType Unfollow;
        public static final EventType UnwishFromFilterFeed;
        public static final EventType UnwishFromProductDetail;
        public static final EventType UnwishFromProductFeed;
        public static final EventType UpcomingBirthdaySelect;
        public static final EventType UpdateApp;
        public static final EventType UpdateCart;
        public static final EventType UserFriendsServiceManagerFetch;
        public static final EventType UserSelect;
        public static final EventType ViewActions;
        public static final EventType VisitSite;
        public static final EventType WatchVideo;
        public static final EventType Wish;
        public static final EventType WishesSelect;
        public static final EventType Withdraw;

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/contextlogic/wish/analytics/Analytics$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])$VALUES.clone();
        }

        static 
        {
            DailyPing = new EventType("DailyPing", 0);
            ProductWisherSelect = new EventType("ProductWisherSelect", 1);
            TurnOffFacebookShare = new EventType("TurnOffFacebookShare", 2);
            TurnOnFacebookShare = new EventType("TurnOnFacebookShare", 3);
            SortHeaderSelect = new EventType("SortHeaderSelect", 4);
            ChangeSort = new EventType("ChangeSort", 5);
            ScrollLoad = new EventType("ScrollLoad", 6);
            NotificationsSelect = new EventType("NotificationsSelect", 7);
            WishesSelect = new EventType("WishesSelect", 8);
            Search = new EventType("Search", 9);
            ToolbarBackSelect = new EventType("ToolbarBackSelect", 10);
            TryAgain = new EventType("TryAgain", 11);
            DoNotRecommend = new EventType("DoNotRecommend", 12);
            LaunchApp = new EventType("LaunchApp", 13);
            AutoRefresh = new EventType("AutoRefresh", 14);
            Refresh = new EventType("Refresh", 15);
            Cancel = new EventType("Cancel", 16);
            Next = new EventType("Next", 17);
            Dismiss = new EventType("Dismiss", 18);
            Back = new EventType("Back", 19);
            Forward = new EventType("Forward", 20);
            Done = new EventType("Done", 21);
            RemindMeLater = new EventType("RemindMeLater", 22);
            Skip = new EventType("Skip", 23);
            ExternalBrowserSelect = new EventType("ExternalBrowserSelect", 24);
            CategorySelect = new EventType("CategorySelect", 25);
            ActivityProfileSelect = new EventType("ActivityProfileSelect", 26);
            ActivityOtherProfileSelect = new EventType("ActivityOtherProfileSelect", 27);
            ActivityProductSelect = new EventType("ActivityProductSelect", 28);
            ProfileFollowersSelect = new EventType("ProfileFollowersSelect", 29);
            ProfileFollowingSelect = new EventType("ProfileFollowingSelect", 30);
            SettingsSelect = new EventType("SettingsSelect", 31);
            LearnMoreSelect = new EventType("LearnMoreSelect", 32);
            Follow = new EventType("Follow", 33);
            Unfollow = new EventType("Unfollow", 34);
            ProfileBucketSelect = new EventType("ProfileBucketSelect", 35);
            AddFriends = new EventType("AddFriends", 36);
            RecommendProduct = new EventType("RecommendProduct", 37);
            BuySelect = new EventType("BuySelect", 38);
            ProductPictureBuySelect = new EventType("ProductPictureBuySelect", 39);
            ProductWinnerSelect = new EventType("ProductWinnerSelect", 40);
            RelatedProductSelect = new EventType("RelatedProductSelect", 41);
            ProductCommentsSelect = new EventType("ProductCommentsSelect", 42);
            WatchVideo = new EventType("WatchVideo", 43);
            ProductTagSelect = new EventType("ProductTagSelect", 44);
            ProductSubmitterSelect = new EventType("ProductSubmitterSelect", 45);
            FlagProduct = new EventType("FlagProduct", 46);
            ShareOnFacebook = new EventType("ShareOnFacebook", 47);
            Share = new EventType("Share", 48);
            MorePhotosSelect = new EventType("MorePhotosSelect", 49);
            SingleUserInvite = new EventType("SingleUserInvite", 50);
            ToggleView = new EventType("ToggleView", 51);
            SearchProductTypeaheadSelect = new EventType("SearchProductTypeaheadSelect", 52);
            SearchFriendTypeaheadSelect = new EventType("SearchFriendTypeaheadSelect", 53);
            SearchHistoryTypeaheadSelect = new EventType("SearchHistoryTypeaheadSelect", 54);
            TagAutocompleteSelect = new EventType("TagAutocompleteSelect", 55);
            AddProductShareLink = new EventType("AddProductShareLink", 56);
            AddProductShareImage = new EventType("AddProductShareImage", 57);
            AddProduct = new EventType("AddProduct", 58);
            AddProductPhoto = new EventType("AddProductPhoto", 59);
            AddProductCamera = new EventType("AddProductCamera", 60);
            AddProductPhotoCamera = new EventType("AddProductPhotoCamera", 61);
            AddProductGallery = new EventType("AddProductGallery", 62);
            AddProductPhotoGallery = new EventType("AddProductPhotoGallery", 63);
            AddProductLink = new EventType("AddProductLink", 64);
            AddProductPhotoLink = new EventType("AddProductPhotoLink", 65);
            AddProductBarcodeScan = new EventType("AddProductBarcodeScan", 66);
            AddProductPhotoBarcodeScan = new EventType("AddProductPhotoBarcodeScan", 67);
            ProfileUserBucketSelect = new EventType("ProfileUserBucketSelect", 68);
            Login = new EventType("Login", 69);
            Logout = new EventType("Logout", 70);
            Wish = new EventType("Wish", 71);
            PhotoSelect = new EventType("PhotoSelect", 72);
            LoggedOutBrowseSelect = new EventType("LoggedOutBrowseSelect", 73);
            MyRewardsSelect = new EventType("MyRewardsSelect", 74);
            SendFeedbackSelect = new EventType("SendFeedbackSelect", 75);
            RateAppSelect = new EventType("RateAppSelect", 76);
            UpdateApp = new EventType("UpdateApp", 77);
            HelpSelect = new EventType("HelpSelect", 78);
            TermsOfServiceSelect = new EventType("TermsOfServiceSelect", 79);
            PrivacyPolicySelect = new EventType("PrivacyPolicySelect", 80);
            EmailsSelect = new EventType("EmailsSelect", 81);
            CommentsLogin = new EventType("CommentsLogin", 82);
            ScanBarcodeResultSelect = new EventType("ScanBarcodeResultSelect", 83);
            Retry = new EventType("Retry", 84);
            FriendSelect = new EventType("FriendSelect", 85);
            FriendDeselect = new EventType("FriendDeselect", 86);
            UserFriendsServiceManagerFetch = new EventType("UserFriendsServiceManagerFetch", 87);
            Load = new EventType("Load", 88);
            NoItems = new EventType("NoItems", 89);
            ProfileBirthdaySelected = new EventType("ProfileBirthdaySelected", 90);
            ProfileFollowingSelected = new EventType("ProfileFollowingSelected", 91);
            ProfileFollowersSelected = new EventType("ProfileFollowersSelected", 92);
            ProfileWishesSelected = new EventType("ProfileWishesSelected", 93);
            ViewActions = new EventType("ViewActions", 94);
            BrowseSelect = new EventType("BrowseSelect", 95);
            ActivitySelect = new EventType("ActivitySelect", 96);
            ProfileSelect = new EventType("ProfileSelect", 97);
            PushNotificationSettingsSelect = new EventType("PushNotificationSettingsSelect", 98);
            TourSelect = new EventType("TourSelect", 99);
            SendAll = new EventType("SendAll", 100);
            Send = new EventType("Send", 101);
            ImageSelected = new EventType("ImageSelected", 102);
            ProductSelected = new EventType("ProductSelected", 103);
            TargetSelect = new EventType("TargetSelect", 104);
            UserSelect = new EventType("UserSelect", 105);
            ChangePage = new EventType("ChangePage", 106);
            ToolbarMenuSelect = new EventType("ToolbarMenuSelect", 107);
            FacebookLogin = new EventType("FacebookLogin", 108);
            PostToWall = new EventType("PostToWall", 109);
            AddFriendsPhonebook = new EventType("AddFriendsPhonebook", 110);
            PhonebookInvite = new EventType("PhonebookInvite", 111);
            RenameBucket = new EventType("RenameBucket", 112);
            MoveToBucket = new EventType("MoveToBucket", 113);
            DeleteBucket = new EventType("DeleteBucket", 114);
            HideProduct = new EventType("HideProduct", 115);
            ListEditingTourSelect = new EventType("ListEditingTourSelect", 116);
            CartSelect = new EventType("CartSelect", 117);
            OrderHistorySelect = new EventType("OrderHistorySelect", 118);
            Checkout = new EventType("Checkout", 119);
            RemoveFromCart = new EventType("RemoveFromCart", 120);
            UpdateCart = new EventType("UpdateCart", 121);
            AddToCart = new EventType("AddToCart", 122);
            Redeem = new EventType("Redeem", 123);
            VisitSite = new EventType("VisitSite", 124);
            BrowseProductsSelect = new EventType("BrowseProductsSelect", 125);
            SplashImageLogin = new EventType("SplashImageLogin", 126);
            GetStarted = new EventType("GetStarted", 127);
            ShopsSelect = new EventType("ShopsSelect", 128);
            HomeSelect = new EventType("HomeSelect", 129);
            SkipPromptAddFriends = new EventType("SkipPromptAddFriends", 130);
            SkipPromptDontWantFriends = new EventType("SkipPromptDontWantFriends", 131);
            FacebookLoginFacebookError = new EventType("FacebookLoginFacebookError", 132);
            FacebookLoginError = new EventType("FacebookLoginError", 133);
            FacebookLoginCancel = new EventType("FacebookLoginCancel", 134);
            LoginStepFour = new EventType("LoginStepFour", 135);
            NewUserLoginStepFour = new EventType("NewUserLoginStepFour", 136);
            LoginStepThree = new EventType("LoginStepThree", 137);
            NewUserLoginStepThree = new EventType("NewUserLoginStepThree", 138);
            LoginStepTwo = new EventType("LoginStepTwo", 139);
            NewUserLoginStepTwo = new EventType("NewUserLoginStepTwo", 140);
            LoginStepOne = new EventType("LoginStepOne", 141);
            NewWishUserFinishLogin = new EventType("NewWishUserFinishLogin", 142);
            LogoutRequired = new EventType("LogoutRequired", 143);
            ProductDescriptionSelect = new EventType("ProductDescriptionSelect", 144);
            RelatedProductFeedSelect = new EventType("RelatedProductFeedSelect", 145);
            FeedSearchBarSelect = new EventType("FeedSearchBarSelect", 146);
            ReturnPolicySelect = new EventType("ReturnPolicySelect", 147);
            KiipImpression = new EventType("KiipImpression", 148);
            Create = new EventType("Create", 149);
            ProductDetailSwipe = new EventType("ProductDetailSwipe", 150);
            MoreSelect = new EventType("MoreSelect", 151);
            LessSelect = new EventType("LessSelect", 152);
            CartBannerSelect = new EventType("CartBannerSelect", 153);
            Withdraw = new EventType("Withdraw", 154);
            SellSelect = new EventType("SellSelect", 155);
            AddCommerceProduct = new EventType("AddCommerceProduct", 156);
            GallerySelect = new EventType("GallerySelect", 157);
            CaptureSelect = new EventType("CaptureSelect", 158);
            SwitchCameraSelect = new EventType("SwitchCameraSelect", 159);
            FlashSelect = new EventType("FlashSelect", 160);
            Remove = new EventType("Remove", 161);
            RemoveFromSale = new EventType("RemoveFromSale", 162);
            SellTourSelect = new EventType("SellTourSelect", 163);
            RecommendFeed = new EventType("RecommendFeed", 164);
            ScanCreditCard = new EventType("ScanCreditCard", 165);
            EditBillingInfo = new EventType("EditBillingInfo", 166);
            EditShippingInfo = new EventType("EditShippingInfo", 167);
            EditProduct = new EventType("EditProduct", 168);
            PartiesSelect = new EventType("PartiesSelect", 169);
            MerchantRatingsSelect = new EventType("MerchantRatingsSelect", 170);
            GiftIt = new EventType("GiftIt", 171);
            EmailLoginStepOne = new EventType("EmailLoginStepOne", 172);
            EmailSignupStepOne = new EventType("EmailSignupStepOne", 173);
            ChangePasswordSelect = new EventType("ChangePasswordSelect", 174);
            ForgotPassword = new EventType("ForgotPassword", 175);
            EmailJoinSelect = new EventType("EmailJoinSelect", 176);
            EmailSignInSelect = new EventType("EmailSignInSelect", 177);
            SkipPersonalize = new EventType("SkipPersonalize", 178);
            SkipPersonalizeCancel = new EventType("SkipPersonalizeCancel", 179);
            SubmitComment = new EventType("SubmitComment", 180);
            MoreComments = new EventType("MoreComments", 181);
            CommenterSelect = new EventType("CommenterSelect", 182);
            UpcomingBirthdaySelect = new EventType("UpcomingBirthdaySelect", 183);
            SalePartySelect = new EventType("SalePartySelect", 184);
            SalePartyTourSelect = new EventType("SalePartyTourSelect", 185);
            SellFaqSelect = new EventType("SellFaqSelect", 186);
            PersistentCartSelect = new EventType("PersistentCartSelect", 187);
            CreateAccountSelect = new EventType("CreateAccountSelect", 188);
            CartHeaderSelect = new EventType("CartHeaderSelect", 189);
            GooglePlusLoginPrestep = new EventType("GooglePlusLoginPrestep", 190);
            GooglePlusLoginStepOne = new EventType("GooglePlusLoginStepOne", 191);
            GoogleLogin = new EventType("GoogleLogin", 192);
            SearchSelect = new EventType("SearchSelect", 193);
            SearchPopularSelect = new EventType("SearchPopularSelect", 194);
            DeleteAccount = new EventType("DeleteAccount", 195);
            CurrencySettingsSelect = new EventType("CurrencySettingsSelect", 196);
            DataControlSelect = new EventType("DataControlSelect", 197);
            CommerceHomeCategorySelect = new EventType("CommerceHomeCategorySelect", 198);
            CommerceHomeCategoryScroll = new EventType("CommerceHomeCategoryScroll", 199);
            BuyMore = new EventType("BuyMore", 200);
            RaterSelect = new EventType("RaterSelect", 201);
            Relogin = new EventType("Relogin", 202);
            ChangeUser = new EventType("ChangeUser", 203);
            FilterSelect = new EventType("FilterSelect", 204);
            UnwishFromFilterFeed = new EventType("UnwishFromFilterFeed", 205);
            UnwishFromProductFeed = new EventType("UnwishFromProductFeed", 206);
            UnwishFromProductDetail = new EventType("UnwishFromProductDetail", 207);
            $VALUES = (new EventType[] {
                DailyPing, ProductWisherSelect, TurnOffFacebookShare, TurnOnFacebookShare, SortHeaderSelect, ChangeSort, ScrollLoad, NotificationsSelect, WishesSelect, Search, 
                ToolbarBackSelect, TryAgain, DoNotRecommend, LaunchApp, AutoRefresh, Refresh, Cancel, Next, Dismiss, Back, 
                Forward, Done, RemindMeLater, Skip, ExternalBrowserSelect, CategorySelect, ActivityProfileSelect, ActivityOtherProfileSelect, ActivityProductSelect, ProfileFollowersSelect, 
                ProfileFollowingSelect, SettingsSelect, LearnMoreSelect, Follow, Unfollow, ProfileBucketSelect, AddFriends, RecommendProduct, BuySelect, ProductPictureBuySelect, 
                ProductWinnerSelect, RelatedProductSelect, ProductCommentsSelect, WatchVideo, ProductTagSelect, ProductSubmitterSelect, FlagProduct, ShareOnFacebook, Share, MorePhotosSelect, 
                SingleUserInvite, ToggleView, SearchProductTypeaheadSelect, SearchFriendTypeaheadSelect, SearchHistoryTypeaheadSelect, TagAutocompleteSelect, AddProductShareLink, AddProductShareImage, AddProduct, AddProductPhoto, 
                AddProductCamera, AddProductPhotoCamera, AddProductGallery, AddProductPhotoGallery, AddProductLink, AddProductPhotoLink, AddProductBarcodeScan, AddProductPhotoBarcodeScan, ProfileUserBucketSelect, Login, 
                Logout, Wish, PhotoSelect, LoggedOutBrowseSelect, MyRewardsSelect, SendFeedbackSelect, RateAppSelect, UpdateApp, HelpSelect, TermsOfServiceSelect, 
                PrivacyPolicySelect, EmailsSelect, CommentsLogin, ScanBarcodeResultSelect, Retry, FriendSelect, FriendDeselect, UserFriendsServiceManagerFetch, Load, NoItems, 
                ProfileBirthdaySelected, ProfileFollowingSelected, ProfileFollowersSelected, ProfileWishesSelected, ViewActions, BrowseSelect, ActivitySelect, ProfileSelect, PushNotificationSettingsSelect, TourSelect, 
                SendAll, Send, ImageSelected, ProductSelected, TargetSelect, UserSelect, ChangePage, ToolbarMenuSelect, FacebookLogin, PostToWall, 
                AddFriendsPhonebook, PhonebookInvite, RenameBucket, MoveToBucket, DeleteBucket, HideProduct, ListEditingTourSelect, CartSelect, OrderHistorySelect, Checkout, 
                RemoveFromCart, UpdateCart, AddToCart, Redeem, VisitSite, BrowseProductsSelect, SplashImageLogin, GetStarted, ShopsSelect, HomeSelect, 
                SkipPromptAddFriends, SkipPromptDontWantFriends, FacebookLoginFacebookError, FacebookLoginError, FacebookLoginCancel, LoginStepFour, NewUserLoginStepFour, LoginStepThree, NewUserLoginStepThree, LoginStepTwo, 
                NewUserLoginStepTwo, LoginStepOne, NewWishUserFinishLogin, LogoutRequired, ProductDescriptionSelect, RelatedProductFeedSelect, FeedSearchBarSelect, ReturnPolicySelect, KiipImpression, Create, 
                ProductDetailSwipe, MoreSelect, LessSelect, CartBannerSelect, Withdraw, SellSelect, AddCommerceProduct, GallerySelect, CaptureSelect, SwitchCameraSelect, 
                FlashSelect, Remove, RemoveFromSale, SellTourSelect, RecommendFeed, ScanCreditCard, EditBillingInfo, EditShippingInfo, EditProduct, PartiesSelect, 
                MerchantRatingsSelect, GiftIt, EmailLoginStepOne, EmailSignupStepOne, ChangePasswordSelect, ForgotPassword, EmailJoinSelect, EmailSignInSelect, SkipPersonalize, SkipPersonalizeCancel, 
                SubmitComment, MoreComments, CommenterSelect, UpcomingBirthdaySelect, SalePartySelect, SalePartyTourSelect, SellFaqSelect, PersistentCartSelect, CreateAccountSelect, CartHeaderSelect, 
                GooglePlusLoginPrestep, GooglePlusLoginStepOne, GoogleLogin, SearchSelect, SearchPopularSelect, DeleteAccount, CurrencySettingsSelect, DataControlSelect, CommerceHomeCategorySelect, CommerceHomeCategoryScroll, 
                BuyMore, RaterSelect, Relogin, ChangeUser, FilterSelect, UnwishFromFilterFeed, UnwishFromProductFeed, UnwishFromProductDetail
            });
        }

        private EventType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LabelType extends Enum
    {

        private static final LabelType $VALUES[];
        public static final LabelType Click;
        public static final LabelType Failure;
        public static final LabelType None;
        public static final LabelType Scroll;
        public static final LabelType Success;

        public static LabelType valueOf(String s)
        {
            return (LabelType)Enum.valueOf(com/contextlogic/wish/analytics/Analytics$LabelType, s);
        }

        public static LabelType[] values()
        {
            return (LabelType[])$VALUES.clone();
        }

        static 
        {
            None = new LabelType("None", 0);
            Success = new LabelType("Success", 1);
            Failure = new LabelType("Failure", 2);
            Click = new LabelType("Click", 3);
            Scroll = new LabelType("Scroll", 4);
            $VALUES = (new LabelType[] {
                None, Success, Failure, Click, Scroll
            });
        }

        private LabelType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PageViewType extends Enum
    {

        private static final PageViewType $VALUES[];
        public static final PageViewType ActivityEveryone;
        public static final PageViewType ActivityFollowing;
        public static final PageViewType ActivityFollowingFeed;
        public static final PageViewType ActivityTabFrame;
        public static final PageViewType AddCommerceProductEditor;
        public static final PageViewType AddCommerceProductImageView;
        public static final PageViewType AddFrendsFacebookDialog;
        public static final PageViewType AddFriendsSplash;
        public static final PageViewType AddProductBarcodeScan;
        public static final PageViewType AddProductBarcodeScanResults;
        public static final PageViewType AddProductCamera;
        public static final PageViewType AddProductCustomCamera;
        public static final PageViewType AddProductCustomCameraConfirm;
        public static final PageViewType AddProductDialog;
        public static final PageViewType AddProductEditor;
        public static final PageViewType AddProductGallery;
        public static final PageViewType AddProductLink;
        public static final PageViewType AddProductMenu;
        public static final PageViewType AddProductPhotoBarcodeScan;
        public static final PageViewType AddProductPhotoCamera;
        public static final PageViewType AddProductPhotoDialog;
        public static final PageViewType AddProductPhotoEditor;
        public static final PageViewType AddProductPhotoGallery;
        public static final PageViewType AddProductPhotoLink;
        public static final PageViewType AddToCartModal;
        public static final PageViewType AllNotifications;
        public static final PageViewType Api;
        public static final PageViewType AppList;
        public static final PageViewType ApplyGiftCard;
        public static final PageViewType BillingInfo;
        public static final PageViewType BottomNavBar;
        public static final PageViewType BrandFeedGrid;
        public static final PageViewType BrowseCategoriesMyTags;
        public static final PageViewType BrowseCategoriesPopular;
        public static final PageViewType BrowseCategoriesTabFrame;
        public static final PageViewType Cart;
        public static final PageViewType CartReview;
        public static final PageViewType ChangePassword;
        public static final PageViewType Comments;
        public static final PageViewType CommerceHomeCategories;
        public static final PageViewType DataControlSettings;
        public static final PageViewType DeepLink;
        public static final PageViewType DeveloperSettings;
        public static final PageViewType EmailLogin;
        public static final PageViewType EmailSignup;
        public static final PageViewType EmbeddedBrowser;
        public static final PageViewType Experiments;
        public static final PageViewType Explore;
        public static final PageViewType External;
        public static final PageViewType FacebookDeepLink;
        public static final PageViewType FailedUpload;
        public static final PageViewType FeedBadgeOverlay;
        public static final PageViewType FeedEducationalOverlay;
        public static final PageViewType FeedFilter;
        public static final PageViewType FeedGrid;
        public static final PageViewType FeedList;
        public static final PageViewType FeedSideNavOverlay;
        public static final PageViewType FeedValuePropOverlay;
        public static final PageViewType FlagProduct;
        public static final PageViewType ForgotPassword;
        public static final PageViewType FriendPickerContainer;
        public static final PageViewType FriendPickerInvite;
        public static final PageViewType FriendPickerInviteContactsSignupNiagaraStepFour;
        public static final PageViewType FriendPickerInviteContactsSignupStepTwo;
        public static final PageViewType FriendPickerInviteSignupNiagaraStepFour;
        public static final PageViewType FriendPickerInviteSignupStepTwo;
        public static final PageViewType FriendPickerRecommend;
        public static final PageViewType FriendPickerRecommendFeed;
        public static final PageViewType FriendPickerSignupNiagaraStepFourContainer;
        public static final PageViewType FriendPickerWidgetContainer;
        public static final PageViewType GiftCart;
        public static final PageViewType GiftOrderComplete;
        public static final PageViewType GiftingDashboard;
        public static final PageViewType GiftingFeedGrid;
        public static final PageViewType HelpMenu;
        public static final PageViewType ImproveListingImage;
        public static final PageViewType ImproveListingTags;
        public static final PageViewType InviteFriendsByLink;
        public static final PageViewType InviteFriendsStartPage;
        public static final PageViewType LearnMore;
        public static final PageViewType ListEditingOverlay;
        public static final PageViewType ListEditingTour;
        public static final PageViewType LoggedOutLoginBar;
        public static final PageViewType LoginRequired;
        public static final PageViewType LoginSplash;
        public static final PageViewType LoginTooltip;
        public static final PageViewType Menu;
        public static final PageViewType MerchantFeedGrid;
        public static final PageViewType MerchantRatings;
        public static final PageViewType MoveToBucket;
        public static final PageViewType MoveToWishlistMenu;
        public static final PageViewType MyProfile;
        public static final PageViewType NavigationEducationalOverlay;
        public static final PageViewType NavigationTabFrame;
        public static final PageViewType NewUserInviteFriendsPrompt;
        public static final PageViewType Notifications;
        public static final PageViewType NotificationsValuePropOverlay;
        public static final PageViewType OtherProfile;
        public static final PageViewType OutOfWishes;
        public static final PageViewType PhonebookFriendPickerInvite;
        public static final PageViewType PhonebookFriendPickerRecommend;
        public static final PageViewType PhonebookFriendPickerRecommendFeed;
        public static final PageViewType PostToWallPrompt;
        public static final PageViewType ProductComments;
        public static final PageViewType ProductDescription;
        public static final PageViewType ProductDetails;
        public static final PageViewType ProductDetailsCategoriesTab;
        public static final PageViewType ProductDetailsDiscountValuePropOverlay;
        public static final PageViewType ProductDetailsEducationalOverlay;
        public static final PageViewType ProductDetailsMainTab;
        public static final PageViewType ProductDetailsRecommendWidget;
        public static final PageViewType ProductDetailsWishValuePropOverlay;
        public static final PageViewType ProductDetailsWishValuePropOverlayStepTwo;
        public static final PageViewType ProductFeedRecommendWidget;
        public static final PageViewType ProductMorePhotos;
        public static final PageViewType ProductRatings;
        public static final PageViewType ProfileBucketGrid;
        public static final PageViewType ProfileBucketList;
        public static final PageViewType ProfileEducationalOverlay;
        public static final PageViewType ProfileFollowers;
        public static final PageViewType ProfileFollowing;
        public static final PageViewType ProfileWishes;
        public static final PageViewType PushNotification;
        public static final PageViewType PushNotificationSettings;
        public static final PageViewType RateAppPrompt;
        public static final PageViewType RecommendProductFacebookDialog;
        public static final PageViewType RecommendRewardRibbon;
        public static final PageViewType RecommendRewardTooltip;
        public static final PageViewType RenameBucket;
        public static final PageViewType RequestGiftCard;
        public static final PageViewType RequestGiftCardConfirm;
        public static final PageViewType SaleParties;
        public static final PageViewType SalePartyTour;
        public static final PageViewType Search;
        public static final PageViewType SearchResultGrid;
        public static final PageViewType SearchResultList;
        public static final PageViewType SellTour;
        public static final PageViewType Settings;
        public static final PageViewType ShareDeepLink;
        public static final PageViewType ShareOnFacebook;
        public static final PageViewType ShippingInfo;
        public static final PageViewType Shops;
        public static final PageViewType SignupNiagaraStepThree;
        public static final PageViewType SignupNiagaraStepTwo;
        public static final PageViewType SignupOverlay;
        public static final PageViewType SignupStepOne;
        public static final PageViewType SignupStepThree;
        public static final PageViewType SignupUpdateProfile;
        public static final PageViewType Tour;
        public static final PageViewType UnreadNotifications;
        public static final PageViewType Unspecified;
        public static final PageViewType UpdateAppPrompt;
        public static final PageViewType Wallet;
        public static final PageViewType WalletFrame;
        public static final PageViewType WalletGiftCards;
        public static final PageViewType WalletRebates;
        public static final PageViewType WhatsNewPrompt;
        public static final PageViewType WishApp;
        public static final PageViewType WishesFeedGrid;
        public static final PageViewType WishlistMenu;

        public static PageViewType valueOf(String s)
        {
            return (PageViewType)Enum.valueOf(com/contextlogic/wish/analytics/Analytics$PageViewType, s);
        }

        public static PageViewType[] values()
        {
            return (PageViewType[])$VALUES.clone();
        }

        static 
        {
            WishApp = new PageViewType("WishApp", 0);
            External = new PageViewType("External", 1);
            FacebookDeepLink = new PageViewType("FacebookDeepLink", 2);
            LoginSplash = new PageViewType("LoginSplash", 3);
            NavigationTabFrame = new PageViewType("NavigationTabFrame", 4);
            BrowseCategoriesTabFrame = new PageViewType("BrowseCategoriesTabFrame", 5);
            BrowseCategoriesPopular = new PageViewType("BrowseCategoriesPopular", 6);
            BrowseCategoriesMyTags = new PageViewType("BrowseCategoriesMyTags", 7);
            ProductDetails = new PageViewType("ProductDetails", 8);
            FlagProduct = new PageViewType("FlagProduct", 9);
            ShareOnFacebook = new PageViewType("ShareOnFacebook", 10);
            ActivityTabFrame = new PageViewType("ActivityTabFrame", 11);
            ActivityEveryone = new PageViewType("ActivityEveryone", 12);
            ActivityFollowing = new PageViewType("ActivityFollowing", 13);
            MyProfile = new PageViewType("MyProfile", 14);
            OtherProfile = new PageViewType("OtherProfile", 15);
            FeedGrid = new PageViewType("FeedGrid", 16);
            FeedList = new PageViewType("FeedList", 17);
            Search = new PageViewType("Search", 18);
            SearchResultList = new PageViewType("SearchResultList", 19);
            SearchResultGrid = new PageViewType("SearchResultGrid", 20);
            ProfileBucketList = new PageViewType("ProfileBucketList", 21);
            ProfileBucketGrid = new PageViewType("ProfileBucketGrid", 22);
            AddProductDialog = new PageViewType("AddProductDialog", 23);
            AddProductPhotoDialog = new PageViewType("AddProductPhotoDialog", 24);
            AddProductCamera = new PageViewType("AddProductCamera", 25);
            AddProductPhotoCamera = new PageViewType("AddProductPhotoCamera", 26);
            AddProductGallery = new PageViewType("AddProductGallery", 27);
            AddProductPhotoGallery = new PageViewType("AddProductPhotoGallery", 28);
            AddProductLink = new PageViewType("AddProductLink", 29);
            AddProductPhotoBarcodeScan = new PageViewType("AddProductPhotoBarcodeScan", 30);
            AddProductBarcodeScan = new PageViewType("AddProductBarcodeScan", 31);
            AddProductBarcodeScanResults = new PageViewType("AddProductBarcodeScanResults", 32);
            AddProductPhotoLink = new PageViewType("AddProductPhotoLink", 33);
            AddProductEditor = new PageViewType("AddProductEditor", 34);
            AddProductPhotoEditor = new PageViewType("AddProductPhotoEditor", 35);
            Settings = new PageViewType("Settings", 36);
            AddFriendsSplash = new PageViewType("AddFriendsSplash", 37);
            AddFrendsFacebookDialog = new PageViewType("AddFrendsFacebookDialog", 38);
            RecommendProductFacebookDialog = new PageViewType("RecommendProductFacebookDialog", 39);
            EmbeddedBrowser = new PageViewType("EmbeddedBrowser", 40);
            ProductMorePhotos = new PageViewType("ProductMorePhotos", 41);
            Notifications = new PageViewType("Notifications", 42);
            ProfileFollowers = new PageViewType("ProfileFollowers", 43);
            ProfileFollowing = new PageViewType("ProfileFollowing", 44);
            OutOfWishes = new PageViewType("OutOfWishes", 45);
            LoginRequired = new PageViewType("LoginRequired", 46);
            LearnMore = new PageViewType("LearnMore", 47);
            RateAppPrompt = new PageViewType("RateAppPrompt", 48);
            NewUserInviteFriendsPrompt = new PageViewType("NewUserInviteFriendsPrompt", 49);
            UpdateAppPrompt = new PageViewType("UpdateAppPrompt", 50);
            LoggedOutLoginBar = new PageViewType("LoggedOutLoginBar", 51);
            DeveloperSettings = new PageViewType("DeveloperSettings", 52);
            ProfileEducationalOverlay = new PageViewType("ProfileEducationalOverlay", 53);
            NavigationEducationalOverlay = new PageViewType("NavigationEducationalOverlay", 54);
            FeedEducationalOverlay = new PageViewType("FeedEducationalOverlay", 55);
            ProductDetailsEducationalOverlay = new PageViewType("ProductDetailsEducationalOverlay", 56);
            ProductComments = new PageViewType("ProductComments", 57);
            FriendPickerRecommend = new PageViewType("FriendPickerRecommend", 58);
            FriendPickerInvite = new PageViewType("FriendPickerInvite", 59);
            WhatsNewPrompt = new PageViewType("WhatsNewPrompt", 60);
            RecommendRewardRibbon = new PageViewType("RecommendRewardRibbon", 61);
            RecommendRewardTooltip = new PageViewType("RecommendRewardTooltip", 62);
            LoginTooltip = new PageViewType("LoginTooltip", 63);
            PushNotification = new PageViewType("PushNotification", 64);
            AddProductMenu = new PageViewType("AddProductMenu", 65);
            HelpMenu = new PageViewType("HelpMenu", 66);
            Menu = new PageViewType("Menu", 67);
            ProductDetailsCategoriesTab = new PageViewType("ProductDetailsCategoriesTab", 68);
            ProductDetailsMainTab = new PageViewType("ProductDetailsMainTab", 69);
            ProfileWishes = new PageViewType("ProfileWishes", 70);
            PushNotificationSettings = new PageViewType("PushNotificationSettings", 71);
            FailedUpload = new PageViewType("FailedUpload", 72);
            ShareDeepLink = new PageViewType("ShareDeepLink", 73);
            Api = new PageViewType("Api", 74);
            Tour = new PageViewType("Tour", 75);
            FeedFilter = new PageViewType("FeedFilter", 76);
            PostToWallPrompt = new PageViewType("PostToWallPrompt", 77);
            InviteFriendsStartPage = new PageViewType("InviteFriendsStartPage", 78);
            PhonebookFriendPickerInvite = new PageViewType("PhonebookFriendPickerInvite", 79);
            RenameBucket = new PageViewType("RenameBucket", 80);
            MoveToBucket = new PageViewType("MoveToBucket", 81);
            ListEditingTour = new PageViewType("ListEditingTour", 82);
            ListEditingOverlay = new PageViewType("ListEditingOverlay", 83);
            FeedBadgeOverlay = new PageViewType("FeedBadgeOverlay", 84);
            Cart = new PageViewType("Cart", 85);
            DeepLink = new PageViewType("DeepLink", 86);
            FeedValuePropOverlay = new PageViewType("FeedValuePropOverlay", 87);
            ProductDetailsWishValuePropOverlay = new PageViewType("ProductDetailsWishValuePropOverlay", 88);
            NotificationsValuePropOverlay = new PageViewType("NotificationsValuePropOverlay", 89);
            ProductDetailsDiscountValuePropOverlay = new PageViewType("ProductDetailsDiscountValuePropOverlay", 90);
            ProductDetailsWishValuePropOverlayStepTwo = new PageViewType("ProductDetailsWishValuePropOverlayStepTwo", 91);
            Shops = new PageViewType("Shops", 92);
            AllNotifications = new PageViewType("AllNotifications", 93);
            UnreadNotifications = new PageViewType("UnreadNotifications", 94);
            Experiments = new PageViewType("Experiments", 95);
            AddToCartModal = new PageViewType("AddToCartModal", 96);
            Explore = new PageViewType("Explore", 97);
            FeedSideNavOverlay = new PageViewType("FeedSideNavOverlay", 98);
            SignupStepOne = new PageViewType("SignupStepOne", 99);
            FriendPickerInviteSignupStepTwo = new PageViewType("FriendPickerInviteSignupStepTwo", 100);
            SignupStepThree = new PageViewType("SignupStepThree", 101);
            WalletFrame = new PageViewType("WalletFrame", 102);
            Wallet = new PageViewType("Wallet", 103);
            WalletRebates = new PageViewType("WalletRebates", 104);
            WalletGiftCards = new PageViewType("WalletGiftCards", 105);
            ProductDescription = new PageViewType("ProductDescription", 106);
            FriendPickerContainer = new PageViewType("FriendPickerContainer", 107);
            FriendPickerInviteContactsSignupStepTwo = new PageViewType("FriendPickerInviteContactsSignupStepTwo", 108);
            FriendPickerWidgetContainer = new PageViewType("FriendPickerWidgetContainer", 109);
            FriendPickerRecommendFeed = new PageViewType("FriendPickerRecommendFeed", 110);
            PhonebookFriendPickerRecommendFeed = new PageViewType("PhonebookFriendPickerRecommendFeed", 111);
            ApplyGiftCard = new PageViewType("ApplyGiftCard", 112);
            ProductFeedRecommendWidget = new PageViewType("ProductFeedRecommendWidget", 113);
            ProductDetailsRecommendWidget = new PageViewType("ProductDetailsRecommendWidget", 114);
            WishlistMenu = new PageViewType("WishlistMenu", 115);
            MoveToWishlistMenu = new PageViewType("MoveToWishlistMenu", 116);
            ActivityFollowingFeed = new PageViewType("ActivityFollowingFeed", 117);
            PhonebookFriendPickerRecommend = new PageViewType("PhonebookFriendPickerRecommend", 118);
            SignupNiagaraStepTwo = new PageViewType("SignupNiagaraStepTwo", 119);
            FriendPickerInviteSignupNiagaraStepFour = new PageViewType("FriendPickerInviteSignupNiagaraStepFour", 120);
            FriendPickerInviteContactsSignupNiagaraStepFour = new PageViewType("FriendPickerInviteContactsSignupNiagaraStepFour", 121);
            FriendPickerSignupNiagaraStepFourContainer = new PageViewType("FriendPickerSignupNiagaraStepFourContainer", 122);
            SignupNiagaraStepThree = new PageViewType("SignupNiagaraStepThree", 123);
            SignupOverlay = new PageViewType("SignupOverlay", 124);
            BottomNavBar = new PageViewType("BottomNavBar", 125);
            MerchantFeedGrid = new PageViewType("MerchantFeedGrid", 126);
            BrandFeedGrid = new PageViewType("BrandFeedGrid", 127);
            WishesFeedGrid = new PageViewType("WishesFeedGrid", 128);
            AddProductCustomCamera = new PageViewType("AddProductCustomCamera", 129);
            AddProductCustomCameraConfirm = new PageViewType("AddProductCustomCameraConfirm", 130);
            AddCommerceProductImageView = new PageViewType("AddCommerceProductImageView", 131);
            AddCommerceProductEditor = new PageViewType("AddCommerceProductEditor", 132);
            SellTour = new PageViewType("SellTour", 133);
            BillingInfo = new PageViewType("BillingInfo", 134);
            ShippingInfo = new PageViewType("ShippingInfo", 135);
            ImproveListingImage = new PageViewType("ImproveListingImage", 136);
            ImproveListingTags = new PageViewType("ImproveListingTags", 137);
            SaleParties = new PageViewType("SaleParties", 138);
            RequestGiftCard = new PageViewType("RequestGiftCard", 139);
            RequestGiftCardConfirm = new PageViewType("RequestGiftCardConfirm", 140);
            EmailLogin = new PageViewType("EmailLogin", 141);
            ForgotPassword = new PageViewType("ForgotPassword", 142);
            EmailSignup = new PageViewType("EmailSignup", 143);
            ChangePassword = new PageViewType("ChangePassword", 144);
            SignupUpdateProfile = new PageViewType("SignupUpdateProfile", 145);
            Comments = new PageViewType("Comments", 146);
            SalePartyTour = new PageViewType("SalePartyTour", 147);
            CartReview = new PageViewType("CartReview", 148);
            DataControlSettings = new PageViewType("DataControlSettings", 149);
            CommerceHomeCategories = new PageViewType("CommerceHomeCategories", 150);
            GiftOrderComplete = new PageViewType("GiftOrderComplete", 151);
            GiftCart = new PageViewType("GiftCart", 152);
            GiftingDashboard = new PageViewType("GiftingDashboard", 153);
            GiftingFeedGrid = new PageViewType("GiftingFeedGrid", 154);
            MerchantRatings = new PageViewType("MerchantRatings", 155);
            ProductRatings = new PageViewType("ProductRatings", 156);
            InviteFriendsByLink = new PageViewType("InviteFriendsByLink", 157);
            AppList = new PageViewType("AppList", 158);
            Unspecified = new PageViewType("Unspecified", 159);
            $VALUES = (new PageViewType[] {
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

        private PageViewType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String CRASH_LOG_LAST_EVENT_KEY = "LastEvent";
    private static final String CRASH_LOG_LAST_PAGE_KEY = "LastPageView";
    private static final String CRASH_LOG_SEPARATOR = "-";
    private static final int DISPATCH_INTERVAL = 30;
    private static Analytics _instance;
    private boolean started;
    private Tracker tracker;
    private ExecutorService trackerThreadPool;

    private Analytics()
    {
        trackerThreadPool = Executors.newFixedThreadPool(1, new ThreadFactory() {

            final Analytics this$0;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = Analytics.this;
                super();
            }
        });
    }

    public static Analytics getInstance()
    {
        if (_instance == null)
        {
            _instance = new Analytics();
        }
        return _instance;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void startAnalytics(final Application application)
    {
        if (tracker != null)
        {
            return;
        } else
        {
            started = true;
            trackerThreadPool.execute(new Runnable() {

                final Analytics this$0;
                final Application val$application;

                public void run()
                {
                    try
                    {
                        Object obj = GoogleAnalytics.getInstance(application);
                        tracker = ((GoogleAnalytics) (obj)).newTracker(WishApplication.getAppInstance().getString(0x7f0604d0));
                        tracker.setSampleRate(1.0D);
                        if (WishApplication.getAppInstance().isDeveloperBuild())
                        {
                            ((GoogleAnalytics) (obj)).getLogger().setLogLevel(1);
                        }
                        ((GoogleAnalytics) (obj)).setLocalDispatchPeriod(30);
                        obj = new com.google.android.gms.analytics.HitBuilders.EventBuilder();
                        ((com.google.android.gms.analytics.HitBuilders.EventBuilder) (obj)).setCategory(PageViewType.WishApp.name());
                        ((com.google.android.gms.analytics.HitBuilders.EventBuilder) (obj)).setAction(EventType.LaunchApp.name());
                        ((com.google.android.gms.analytics.HitBuilders.EventBuilder) (obj)).setLabel(WishApplication.getAppInstance().getVersionNumber());
                        ((com.google.android.gms.analytics.HitBuilders.EventBuilder) (obj)).setNewSession();
                        tracker.send(((com.google.android.gms.analytics.HitBuilders.EventBuilder) (obj)).build());
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = Analytics.this;
                application = application1;
                super();
            }
            });
            return;
        }
    }

    public void stopAnalytics()
    {
    }

    public void trackEvent(EventType eventtype, PageViewType pageviewtype, LabelType labeltype)
    {
        trackEvent(eventtype, pageviewtype, labeltype, -1);
    }

    public void trackEvent(final EventType eventType, final PageViewType pageViewString, final LabelType labelType, final int value)
    {
        PageViewType pageviewtype = pageViewString;
        if (pageViewString == null)
        {
            pageviewtype = PageViewType.Unspecified;
        }
        if (!LoggedInUser.getInstance().isLoggedIn())
        {
            pageViewString = (new StringBuilder()).append("LoggedOut-").append(pageviewtype.name()).toString();
        } else
        {
            pageViewString = pageviewtype.name();
        }
        trackerThreadPool.execute(new Runnable() {

            final Analytics this$0;
            final EventType val$eventType;
            final LabelType val$labelType;
            final String val$pageViewString;
            final int val$value;

            public void run()
            {
                try
                {
                    Crashlytics.setString("LastEvent", (new StringBuilder()).append(pageViewString).append("-").append(eventType.name()).append("-").append(labelType.name()).toString());
                    if (tracker != null)
                    {
                        com.google.android.gms.analytics.HitBuilders.EventBuilder eventbuilder = new com.google.android.gms.analytics.HitBuilders.EventBuilder();
                        eventbuilder.setCategory(pageViewString);
                        eventbuilder.setAction(eventType.name());
                        if (value != -1)
                        {
                            eventbuilder.setValue(value);
                        }
                        eventbuilder.setLabel(labelType.name());
                        tracker.send(eventbuilder.build());
                    }
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }

            
            {
                this$0 = Analytics.this;
                pageViewString = s;
                eventType = eventtype;
                labelType = labeltype;
                value = i;
                super();
            }
        });
    }

    public void trackPageView(PageViewType pageviewtype)
    {
        PageViewType pageviewtype1 = pageviewtype;
        if (pageviewtype == null)
        {
            pageviewtype1 = PageViewType.Unspecified;
        }
        if (!LoggedInUser.getInstance().isLoggedIn())
        {
            pageviewtype = (new StringBuilder()).append("LoggedOut-").append(pageviewtype1.name()).toString();
        } else
        {
            pageviewtype = pageviewtype1.name();
        }
        trackPageView(((String) (pageviewtype)));
    }

    public void trackPageView(final String pageViewString)
    {
        trackerThreadPool.execute(new Runnable() {

            final Analytics this$0;
            final String val$pageViewString;

            public void run()
            {
                try
                {
                    Crashlytics.setString("LastPageView", pageViewString);
                    if (tracker != null)
                    {
                        com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
                        tracker.setScreenName(pageViewString);
                        tracker.send(screenviewbuilder.build());
                    }
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }

            
            {
                this$0 = Analytics.this;
                pageViewString = s;
                super();
            }
        });
    }

    public void trackRawEvent(String s, PageViewType pageviewtype, LabelType labeltype)
    {
        trackRawEvent(s, pageviewtype, labeltype.name());
    }

    public void trackRawEvent(final String event, final PageViewType pageViewString, final String label)
    {
        PageViewType pageviewtype = pageViewString;
        if (pageViewString == null)
        {
            pageviewtype = PageViewType.Unspecified;
        }
        if (!LoggedInUser.getInstance().isLoggedIn())
        {
            pageViewString = (new StringBuilder()).append("LoggedOut-").append(pageviewtype.name()).toString();
        } else
        {
            pageViewString = pageviewtype.name();
        }
        trackerThreadPool.execute(new Runnable() {

            final Analytics this$0;
            final String val$event;
            final String val$label;
            final String val$pageViewString;

            public void run()
            {
                try
                {
                    Crashlytics.setString("LastEvent", (new StringBuilder()).append(pageViewString).append("-").append(event).append("-").append(label).toString());
                    if (tracker != null)
                    {
                        com.google.android.gms.analytics.HitBuilders.EventBuilder eventbuilder = new com.google.android.gms.analytics.HitBuilders.EventBuilder();
                        eventbuilder.setCategory(pageViewString);
                        eventbuilder.setAction(event);
                        eventbuilder.setLabel(label);
                        tracker.send(eventbuilder.build());
                    }
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }

            
            {
                this$0 = Analytics.this;
                pageViewString = s;
                event = s1;
                label = s2;
                super();
            }
        });
    }



/*
    static Tracker access$002(Analytics analytics, Tracker tracker1)
    {
        analytics.tracker = tracker1;
        return tracker1;
    }

*/
}
