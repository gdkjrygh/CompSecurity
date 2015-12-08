// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseFragmentActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.service.GetGoogleWalletOfferService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.api.service.manager.LoginServiceManager;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.http.WishHttpClient;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.base.BaseLoginContentFragment;
import com.contextlogic.wish.ui.fragment.developer.LoginDeveloperSettingsFragment;
import com.contextlogic.wish.ui.fragment.login.LoginGridAdapter;
import com.contextlogic.wish.ui.fragment.login.SignInFragment;
import com.contextlogic.wish.ui.fragment.login.SignupFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.TabletUtil;
import com.facebook.Session;
import java.util.Locale;

public class LoginActivity extends WishBaseFragmentActivity
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener
{
    private class ScrollRunnable
        implements Runnable
    {

        final LoginActivity this$0;

        private void scrollComplete()
        {
            runnableRunning = false;
            repostScrollWithDelay(30L);
        }

        public void run()
        {
            if (runnableRunning)
            {
                return;
            }
            runnableRunning = true;
            scrollGrid();
            if (!canScroll)
            {
                stopScroll();
                return;
            } else
            {
                scrollComplete();
                return;
            }
        }

        private ScrollRunnable()
        {
            this$0 = LoginActivity.this;
            super();
        }

    }

    public static final class WishSignupFlow extends Enum
    {

        private static final WishSignupFlow $VALUES[];
        public static final WishSignupFlow Categories;
        public static final WishSignupFlow FreeGifts;
        public static final WishSignupFlow GenderFreeGifts;
        public static final WishSignupFlow None;
        public static final WishSignupFlow Other;

        public static WishSignupFlow valueOf(String s)
        {
            return (WishSignupFlow)Enum.valueOf(com/contextlogic/wish/ui/activity/login/LoginActivity$WishSignupFlow, s);
        }

        public static WishSignupFlow[] values()
        {
            return (WishSignupFlow[])$VALUES.clone();
        }

        static 
        {
            Categories = new WishSignupFlow("Categories", 0);
            FreeGifts = new WishSignupFlow("FreeGifts", 1);
            GenderFreeGifts = new WishSignupFlow("GenderFreeGifts", 2);
            Other = new WishSignupFlow("Other", 3);
            None = new WishSignupFlow("None", 4);
            $VALUES = (new WishSignupFlow[] {
                Categories, FreeGifts, GenderFreeGifts, Other, None
            });
        }

        private WishSignupFlow(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ARG_SHOW_LOGOUT_ERROR = "ShowLogoutError";
    public static final String ARG_SKIP_AUTO_LOGIN = "SkipAutoLogin";
    private static int CACHED_TABLET_MODAL_WIDTH = 0;
    public static boolean FRAGMENT_ANIMATION_ENABLED = false;
    private static final String MODAL_CONTENT_FRAGMENT_TAG = "ModalContentFragment";
    private static final String MODAL_FRAGMENT_TAG = "ModalFragment";
    private static final long SCROLL_DELAY = 30L;
    private boolean canScroll;
    private int currentOrientation;
    private GetGoogleWalletOfferService getGoogleWalletOfferService;
    private boolean googleWalletOfferFetched;
    private TextView googleWalletOfferText;
    private View googleWalletOfferView;
    private Handler handler;
    private boolean inChangeUserMode;
    private View joinButton;
    private View loggedOutLayout;
    private boolean loggingIn;
    private LoginServiceManager loginServiceManager;
    private View loginSpinner;
    FrameLayout modalContainer;
    private TextView nameText;
    private StaggeredGridView productGridView;
    private BorderedImageView profileImage;
    private View reloginLayout;
    private boolean runnableRunning;
    private boolean safeToDestroy;
    private ScrollRunnable scrollRunnable;
    private boolean showLogoutError;
    private View signInButton;
    private boolean skipAutoLogin;
    private View tabletModalMask;
    private boolean userAgentSetup;

    public LoginActivity()
    {
    }

    public static int getTabletModalWidth(Activity activity)
    {
        if (CACHED_TABLET_MODAL_WIDTH <= 0)
        {
            activity = activity.getWindowManager().getDefaultDisplay();
            if (activity.getWidth() < activity.getHeight())
            {
                CACHED_TABLET_MODAL_WIDTH = (int)((double)activity.getWidth() * 0.69999999999999996D);
            } else
            {
                CACHED_TABLET_MODAL_WIDTH = (int)((double)activity.getHeight() * 0.69999999999999996D);
            }
        }
        return CACHED_TABLET_MODAL_WIDTH;
    }

    public static WishSignupFlow getWishSignupFlow(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -426390953: 86
    //                   788422838: 100
    //                   1296516636: 72;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_100;
_L5:
        switch (byte0)
        {
        default:
            return WishSignupFlow.None;

        case 0: // '\0'
            return WishSignupFlow.Categories;

        case 1: // '\001'
            return WishSignupFlow.FreeGifts;

        case 2: // '\002'
            return WishSignupFlow.GenderFreeGifts;
        }
_L4:
        if (s.equals("categories"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("freegifts"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("genderfreegifts"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private void handleChangeUser()
    {
        inChangeUserMode = true;
        showLoggedOutView();
    }

    private void handleGooglePlusCheckFailure()
    {
        loggingIn = false;
        showLoggedOutView();
        WishApplication.getAppInstance().resetUserData(true, false, true, true, true);
    }

    private void handleLoginError(boolean flag, boolean flag1)
    {
        handleLoginError(flag, flag1, null);
    }

    private void handleLoginError(boolean flag, boolean flag1, String s)
    {
        loggingIn = false;
        showLoggedOutView();
        WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
        String s1 = s;
        if (s == null)
        {
            s1 = getString(0x7f060035);
        }
        PopupAlertDialog.showError(this, getString(0x7f06030d), s1);
    }

    private void initializeUi()
    {
        getWindow().getDecorView().setBackgroundColor(-1);
        View view;
        if (TabletUtil.isTablet(this))
        {
            setContentView(0x7f030018);
        } else
        {
            setContentView(0x7f030017);
        }
        view = findViewById(0x7f0d006c);
        if (WishApplication.getAppInstance().isDeveloperBuild())
        {
            view.setVisibility(0);
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final LoginActivity this$0;

                public void onClick(View view1)
                {
                    view1 = new LoginDeveloperSettingsFragment();
                    setModalContentFragment(view1, true);
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            });
        } else
        {
            view.setVisibility(8);
        }
        productGridView = (StaggeredGridView)findViewById(0x7f0d0061);
        productGridView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final LoginActivity this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        productGridView.setAdapter(new LoginGridAdapter(this, productGridView));
        productGridView.forceAlternatingColumns();
        productGridView.reloadData();
        canScroll = true;
        ((TextView)findViewById(0x7f0d0063)).setText(getString(getResources().getIdentifier((new StringBuilder()).append("tagline_").append(WishApplication.getAppInstance().getAppType()).toString(), "string", getPackageName())));
        signInButton = findViewById(0x7f0d0065);
        WishTestingUtil.addContentDescription(signInButton, getClass().getSimpleName(), "signInButton");
        signInButton.setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_SPLASH_EMAIL_LOGIN);
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.EmailSignInSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                showLogin(false);
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        joinButton = findViewById(0x7f0d0064);
        joinButton.setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_SPLASH_EMAIL_SIGN_UP);
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.EmailJoinSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                showSignup();
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        profileImage = (BorderedImageView)findViewById(0x7f0d0068);
        if (TabletUtil.isTablet(this))
        {
            profileImage.getImageView().setRequestedImageHeight(100);
            profileImage.getImageView().setRequestedImageWidth(100);
        } else
        {
            profileImage.getImageView().setRequestedImageHeight(60);
            profileImage.getImageView().setRequestedImageWidth(60);
        }
        profileImage.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Gone);
        nameText = (TextView)findViewById(0x7f0d0069);
        findViewById(0x7f0d006a).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view1)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Relogin, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                handleReloginClick();
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        findViewById(0x7f0d006b).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view1)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.ChangeUser, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                handleChangeUser();
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        googleWalletOfferView = findViewById(0x7f0d006d);
        googleWalletOfferText = (TextView)findViewById(0x7f0d006e);
        reloginLayout = findViewById(0x7f0d0067);
        loggedOutLayout = findViewById(0x7f0d0062);
        loginSpinner = findViewById(0x7f0d0066);
        tabletModalMask = findViewById(0x7f0d0070);
        tabletModalMask.setOnClickListener(new android.view.View.OnClickListener() {

            final LoginActivity this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        });
        if (TabletUtil.isTablet(this))
        {
            tabletModalMask.setVisibility(8);
            findViewById(0x7f0d006f).setVisibility(8);
            modalContainer = (FrameLayout)findViewById(0x7f0d0072);
            tabletModalMask.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final LoginActivity this$0;

                public void onGlobalLayout()
                {
                    int i = tabletModalMask.getHeight();
                    if (i > 0)
                    {
                        resizeUi(i);
                    }
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            });
        } else
        {
            tabletModalMask.setVisibility(8);
            findViewById(0x7f0d0072).setVisibility(8);
            modalContainer = (FrameLayout)findViewById(0x7f0d006f);
        }
        resizeUi();
        showLoggedOutView();
    }

    private void repostScrollWithDelay(long l)
    {
        if (scrollRunnable != null && canScroll)
        {
            handler.postDelayed(scrollRunnable, l);
        }
    }

    private void resizeUi()
    {
        resizeUi(-1);
    }

    private void resizeUi(int i)
    {
        int i1 = getWindowManager().getDefaultDisplay().getWidth();
        if (TabletUtil.isTablet(this))
        {
            int j = getWindowManager().getDefaultDisplay().getHeight();
            int l = getTabletModalWidth(this);
            int j1 = (j - l) / 2;
            j = l;
            int k = j;
            if (i > 0)
            {
                k = j;
                if (j1 + j > i)
                {
                    k = i - j1;
                }
            }
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(l, k);
            layoutparams.gravity = 48;
            layoutparams.topMargin = j1;
            layoutparams.leftMargin = (i1 - l) / 2;
            modalContainer.setLayoutParams(layoutparams);
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(i1, -1);
            layoutparams1.gravity = 48;
            modalContainer.setLayoutParams(layoutparams1);
            return;
        }
    }

    private void scrollGrid()
    {
        int i = getWindowManager().getDefaultDisplay().getHeight();
        int j = getWindowManager().getDefaultDisplay().getWidth();
        if (productGridView != null)
        {
            boolean flag;
            if (productGridView.getScrollY() < productGridView.getContentHeight() - i * 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            canScroll = flag;
        }
        i = Math.max(1, (int)((double)Math.max(j, i) / 30D / 33.333333333333336D));
        if (productGridView != null && canScroll)
        {
            productGridView.scrollBy(0, i);
        }
    }

    private void setupLocale()
    {
        WishHttpClient.getInstance().setLocaleCookie(Locale.getDefault().toString(), WishApi.getInstance().getConfig().getApiBaseUrlString());
    }

    private void setupUserAgent()
    {
        if (Looper.myLooper() == null) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = (new WebView(WishApplication.getAppInstance())).getSettings().getUserAgentString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = System.getProperty("http.agent");
            obj = s;
            if (s == null)
            {
                obj = "Wish Application for Android";
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        WishHttpClient.getInstance().setUserAgent(((String) (obj)));
        UserPreferences.setUserAgent(((String) (obj)));
        return;
_L2:
        String s1 = System.getProperty("http.agent");
        obj = s1;
        if (s1 == null)
        {
            obj = "Wish Application for Android";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showGoogleWalletOffer(String s)
    {
        if (s != null && !s.trim().equals("") && !TabletUtil.isTablet(this))
        {
            googleWalletOfferView.setVisibility(0);
            googleWalletOfferText.setText(s);
        }
    }

    private void showLoggedOutView()
    {
        boolean flag;
        if (UserPreferences.getLoginMode() != null && UserPreferences.getLastLoggedInUserImage() != null && UserPreferences.getLastLoggedInUserName() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (inChangeUserMode || !flag)
        {
            loggedOutLayout.setVisibility(0);
            reloginLayout.setVisibility(8);
            loginSpinner.setVisibility(8);
            signInButton.setVisibility(0);
            joinButton.setVisibility(0);
            return;
        } else
        {
            loggedOutLayout.setVisibility(8);
            reloginLayout.setVisibility(0);
            signInButton.setVisibility(8);
            joinButton.setVisibility(8);
            loginSpinner.setVisibility(8);
            nameText.setText(UserPreferences.getLastLoggedInUserName());
            profileImage.getImageView().setImageUrl(UserPreferences.getLastLoggedInUserImage());
            return;
        }
    }

    private void showLoggingInView()
    {
        loggedOutLayout.setVisibility(0);
        reloginLayout.setVisibility(8);
        signInButton.setVisibility(8);
        joinButton.setVisibility(8);
        loginSpinner.setVisibility(0);
    }

    private void showLogin(boolean flag)
    {
        SignInFragment signinfragment = new SignInFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ArgEmailReloginMode", flag);
        signinfragment.setArguments(bundle);
        setModalContentFragment(signinfragment, true);
    }

    private void showSignup()
    {
        setModalContentFragment(new SignupFragment(), true);
    }

    private void startEmailLogin(String s, String s1)
    {
        loggingIn = true;
        showLoggingInView();
        loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

            final LoginActivity this$0;

            public void onFailure(boolean flag, boolean flag1, String s2)
            {
                handleLoginError(flag, flag1, s2);
            }

            public void onSuccess(boolean flag, WishSignupFlow wishsignupflow)
            {
                finishLogin(flag, wishsignupflow);
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        }, "LoginModeEmail", s, s1);
    }

    private void startWishLoginWithFb()
    {
        if (!FacebookManager.getInstance().isLoggedIn())
        {
            handleLoginError(true, false);
            return;
        } else
        {
            loggingIn = true;
            showLoggingInView();
            loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

                final LoginActivity this$0;

                public void onFailure(boolean flag, boolean flag1, String s)
                {
                    handleLoginError(flag, flag1, s);
                }

                public void onSuccess(boolean flag, WishSignupFlow wishsignupflow)
                {
                    if (LoggedInUser.getInstance().getCurrentUser() != null)
                    {
                        finishLogin(flag, wishsignupflow);
                    }
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            }, "LoginModeFB");
            return;
        }
    }

    private void startWishLoginWithGooglePlus()
    {
        if (!GooglePlusManager.getInstance().isLoggedIn())
        {
            handleLoginError(false, true);
            return;
        } else
        {
            loggingIn = true;
            showLoggingInView();
            loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

                final LoginActivity this$0;

                public void onFailure(boolean flag, boolean flag1, String s)
                {
                    handleLoginError(flag, flag1, s);
                }

                public void onSuccess(boolean flag, WishSignupFlow wishsignupflow)
                {
                    if (LoggedInUser.getInstance().getCurrentUser() != null)
                    {
                        finishLogin(flag, wishsignupflow);
                    }
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            }, "LoginModeGooglePlus");
            return;
        }
    }

    public void dismissModal()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginActivity this$0;

                public void run()
                {
                    try
                    {
                        getSupportFragmentManager().popBackStack("ModalFragment", 1);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        return;
                    }
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            });
        }
    }

    public void finishLogin(boolean flag, WishSignupFlow wishsignupflow)
    {
        if (LoggedInUser.getInstance().getCurrentUser() != null)
        {
            loggingIn = false;
            safeToDestroy = true;
            WishApplication.getAppInstance().login(this, flag, wishsignupflow);
        }
    }

    public void handleReloginClick()
    {
        if (UserPreferences.getLoginMode().equals("LoginModeFB"))
        {
            startFacebookLogin();
        } else
        {
            if (UserPreferences.getLoginMode().equals("LoginModeGooglePlus"))
            {
                startGooglePlusLogin(false);
                return;
            }
            if (UserPreferences.getLoginMode().equals("LoginModeEmail"))
            {
                if (UserPreferences.getLoginEmail() != null && UserPreferences.getLoginPassword() != null)
                {
                    startEmailLogin(UserPreferences.getLoginEmail(), UserPreferences.getLoginPassword());
                    return;
                } else
                {
                    showLogin(true);
                    return;
                }
            }
        }
    }

    public boolean hasModal()
    {
        return getSupportFragmentManager().findFragmentByTag("ModalFragment") != null;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        FacebookManager.getInstance().getFacebookSession().onActivityResult(this, i, j, intent);
        GooglePlusManager.getInstance().onActivityResult(this, i, j, intent);
    }

    public void onBackPressed()
    {
        if (hasModal())
        {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("ModalFragment");
            if (fragment != null && (fragment instanceof BaseLoginContentFragment) && ((BaseLoginContentFragment)fragment).onBackPressed())
            {
                return;
            }
        }
        try
        {
            super.onBackPressed();
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    public void onBackStackChanged()
    {
        android.support.v4.app.FragmentManager.BackStackEntry backstackentry;
        if (getSupportFragmentManager().getBackStackEntryCount() <= 0)
        {
            backstackentry = null;
        } else
        {
            backstackentry = getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount() - 1);
        }
        if (backstackentry != null && backstackentry.getName() != null && (backstackentry.getName().equals("ModalContentFragment") || backstackentry.getName().equals("ModalFragment")))
        {
            if (TabletUtil.isTablet(this))
            {
                tabletModalMask.setVisibility(0);
            }
        } else
        if (TabletUtil.isTablet(this))
        {
            tabletModalMask.setVisibility(8);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == currentOrientation || signInButton == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        resizeUi();
        if (loggingIn)
        {
            showLoggingInView();
        } else
        {
            showLoggedOutView();
        }
        if (productGridView != null)
        {
            productGridView.reloadData();
        }
        configuration = (InputMethodManager)getSystemService("input_method");
        if (configuration == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        configuration.hideSoftInputFromWindow(signInButton.getWindowToken(), 0);
        return;
        configuration;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (WishApplication.getAppInstance().isScreenshotBuild())
        {
            bundle = getIntent().getStringExtra("WishTestingServer");
            if (bundle != null)
            {
                WishApi.getInstance().getConfig().setApiBaseUrlString(bundle);
            }
            UserPreferences.setUseFbDevMode(false);
            UserPreferences.setTestingForcedCurrency(getIntent().getStringExtra("WishTestingCurrency"));
            UserPreferences.setLoginEmail(getIntent().getStringExtra("WishTestingEmail"));
        }
        if (getResources() != null && !TabletUtil.isTablet(this))
        {
            setRequestedOrientation(1);
        }
        if (!isTaskRoot() && getIntent().getAction() != null && getIntent().getAction().equals("android.intent.action.MAIN"))
        {
            finish();
        } else
        {
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            getSupportFragmentManager().addOnBackStackChangedListener(this);
            skipAutoLogin = getIntent().getBooleanExtra("SkipAutoLogin", false);
            showLogoutError = getIntent().getBooleanExtra("ShowLogoutError", false);
            getGoogleWalletOfferService = new GetGoogleWalletOfferService();
            loginServiceManager = new LoginServiceManager();
            setupLocale();
            initializeUi();
            if (UserPreferences.getAdminLoginCode() != null)
            {
                skipAutoLogin = false;
                return;
            }
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        safeToDestroy = false;
        if (!Analytics.getInstance().isStarted())
        {
            Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
        }
        if (!googleWalletOfferFetched)
        {
            googleWalletOfferFetched = true;
            getGoogleWalletOfferService.requestService(new com.contextlogic.wish.api.service.GetGoogleWalletOfferService.SuccessCallback() {

                final LoginActivity this$0;

                public void onServiceSucceeded(String s)
                {
                    showGoogleWalletOffer(s);
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            }, null);
        }
        if (!UserPreferences.getFirstLaunchImpressionSent())
        {
            if (UserPreferences.getLastLoggedInUserId() == null)
            {
                (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_FIRST_LAUNCH.getValue()), null, null, null);
            }
            UserPreferences.setFirstLaunchImpressionSent(true);
        }
        if (profileImage != null)
        {
            profileImage.getImageView().restoreImage();
        }
        if (productGridView != null)
        {
            productGridView.restoreImages();
        }
        startScroll();
        if (loggingIn || skipAutoLogin) goto _L2; else goto _L1
_L1:
        if (UserPreferences.getGooglePlusChecked()) goto _L4; else goto _L3
_L3:
        startGooglePlusLogin(true);
_L6:
        skipAutoLogin = true;
_L2:
        if (showLogoutError)
        {
            showLogoutError = false;
            getIntent().putExtra("ShowLogoutError", false);
            PopupAlertDialog.showError(this, getString(0x7f06030d), getString(0x7f06028a));
        }
        return;
_L4:
        if (UserPreferences.getLoginMode().equals("LoginModeFB"))
        {
            if (UserPreferences.getFbId() != null || FacebookManager.getInstance().isLoggedIn() || FacebookManager.getInstance().hasCachedToken())
            {
                startFacebookLogin();
            }
        } else
        if (UserPreferences.getLoginMode().equals("LoginModeGooglePlus"))
        {
            if (UserPreferences.getGooglePlusId() != null || GooglePlusManager.getInstance().isLoggedIn())
            {
                startGooglePlusLogin(false);
            }
        } else
        if (UserPreferences.getLoginMode().equals("LoginModeEmail") && UserPreferences.getLoginEmail() != null && UserPreferences.getLoginPassword() != null)
        {
            startEmailLogin(UserPreferences.getLoginEmail(), UserPreferences.getLoginPassword());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onStop()
    {
        super.onStop();
        stopScroll();
        if (safeToDestroy)
        {
            if (profileImage != null)
            {
                profileImage.getImageView().releaseImage();
            }
            if (productGridView != null)
            {
                productGridView.releaseImages();
            }
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (!userAgentSetup && signInButton != null)
        {
            userAgentSetup = true;
            signInButton.post(new Runnable() {

                final LoginActivity this$0;

                public void run()
                {
                    setupUserAgent();
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            });
        }
    }

    public void setModalContentFragment(BaseLoginContentFragment baselogincontentfragment, boolean flag)
    {
        setModalContentFragment(baselogincontentfragment, flag, false);
    }

    public void setModalContentFragment(BaseLoginContentFragment baselogincontentfragment, boolean flag, boolean flag1)
    {
        String s;
        FragmentTransaction fragmenttransaction;
        baselogincontentfragment.setRetainInstance(true);
        baselogincontentfragment.setIsModal(true);
        baselogincontentfragment.setIsRootFragment(flag);
        fragmenttransaction = getSupportFragmentManager().beginTransaction();
        s = "ModalContentFragment";
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        s = "ModalFragment";
        FRAGMENT_ANIMATION_ENABLED = false;
        getSupportFragmentManager().popBackStackImmediate("ModalFragment", 1);
        android.support.v4.app.Fragment fragment;
        Object obj;
        try
        {
            FRAGMENT_ANIMATION_ENABLED = true;
        }
        catch (Throwable throwable) { }
        if (flag1)
        {
            fragmenttransaction.setCustomAnimations(0, 0, 0x7f040009, 0x7f04000c);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f040009, 0x7f04000c, 0x7f040009, 0x7f04000c);
        }
_L1:
        fragment = getSupportFragmentManager().findFragmentByTag("ModalFragment");
        if (fragment != null)
        {
            fragmenttransaction.hide(fragment);
        }
        if (TabletUtil.isTablet(this))
        {
            fragmenttransaction.add(0x7f0d0072, baselogincontentfragment, "ModalFragment");
        } else
        {
            fragmenttransaction.add(0x7f0d006f, baselogincontentfragment, "ModalFragment");
        }
        fragmenttransaction.show(baselogincontentfragment);
        fragmenttransaction.addToBackStack(s);
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BaseLoginContentFragment baselogincontentfragment)
        {
            return;
        }
        obj;
        FRAGMENT_ANIMATION_ENABLED = true;
        break MISSING_BLOCK_LABEL_55;
        obj;
        FRAGMENT_ANIMATION_ENABLED = true;
        throw obj;
        if (flag1)
        {
            fragmenttransaction.setCustomAnimations(0, 0, 0x7f04000a, 0x7f04000e);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000b, 0x7f04000d, 0x7f04000a, 0x7f04000e);
        }
          goto _L1
    }

    public void startFacebookLogin()
    {
        if (loggingIn)
        {
            return;
        }
        loggingIn = true;
        showLoggingInView();
        if (!FacebookManager.getInstance().isLoggedIn())
        {
            FacebookManager.getInstance().startLogin(this, new com.contextlogic.wish.facebook.FacebookManager.LoginCallback() {

                final LoginActivity this$0;

                public void onFailure()
                {
                    handleLoginError(true, false);
                }

                public void onSuccess()
                {
                    startWishLoginWithFb();
                }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
            });
            return;
        } else
        {
            startWishLoginWithFb();
            return;
        }
    }

    public void startGooglePlusLogin(final boolean initialCheck)
    {
        if (loggingIn)
        {
            return;
        }
        UserPreferences.setGooglePlusChecked(true);
        loggingIn = true;
        showLoggingInView();
        if (!GooglePlusManager.getInstance().isLoggedIn())
        {
            GooglePlusManager.getInstance().startLogin(this, new com.contextlogic.wish.googleplus.GooglePlusManager.LoginCallback() {

                final LoginActivity this$0;
                final boolean val$initialCheck;

                public Activity getActivityForErrorResolution()
                {
                    if (initialCheck)
                    {
                        return null;
                    } else
                    {
                        return LoginActivity.this;
                    }
                }

                public void onFailure()
                {
                    if (initialCheck)
                    {
                        handleGooglePlusCheckFailure();
                        return;
                    } else
                    {
                        handleLoginError(false, true);
                        return;
                    }
                }

                public void onSilentFailure()
                {
                    loggingIn = false;
                    showLoggedOutView();
                }

                public void onSuccess()
                {
                    startWishLoginWithGooglePlus();
                }

            
            {
                this$0 = LoginActivity.this;
                initialCheck = flag;
                super();
            }
            });
            return;
        } else
        {
            startWishLoginWithGooglePlus();
            return;
        }
    }

    public void startScroll()
    {
        this;
        JVM INSTR monitorenter ;
        if (scrollRunnable == null && canScroll)
        {
            scrollRunnable = new ScrollRunnable();
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            if (handler != null)
            {
                handler.post(scrollRunnable);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stopScroll()
    {
        this;
        JVM INSTR monitorenter ;
        if (scrollRunnable != null)
        {
            if (handler == null && Looper.myLooper() != null)
            {
                handler = new Handler();
            }
            if (handler != null)
            {
                handler.removeCallbacks(scrollRunnable);
            }
            scrollRunnable = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void trackClick(WishAnalyticsEvent wishanalyticsevent)
    {
        trackClick(wishanalyticsevent, null);
    }

    public void trackClick(WishAnalyticsEvent wishanalyticsevent, String s)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), s, null, null);
    }

    static 
    {
        FRAGMENT_ANIMATION_ENABLED = true;
        CACHED_TABLET_MODAL_WIDTH = -1;
    }





/*
    static boolean access$1102(LoginActivity loginactivity, boolean flag)
    {
        loginactivity.loggingIn = flag;
        return flag;
    }

*/






/*
    static boolean access$1502(LoginActivity loginactivity, boolean flag)
    {
        loginactivity.runnableRunning = flag;
        return flag;
    }

*/










}
