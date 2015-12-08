// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ParseException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.WishBaseActionBarActivity;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import com.contextlogic.wish.api.service.ClickNotificationService;
import com.contextlogic.wish.api.service.GetLandingPageService;
import com.contextlogic.wish.api.service.GetRatingPendingTransactionsService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.api.service.LogSignupDeepLinkService;
import com.contextlogic.wish.api.service.UploadProfileImageService;
import com.contextlogic.wish.api.service.ViewNotificationService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.paypal.PayPalManager;
import com.contextlogic.wish.prompt.PromptManager;
import com.contextlogic.wish.prompt.RateAppPrompt;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.ui.components.drawer.TabletDrawerLayout;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.components.text.RedBadgeTextView;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CheckoutCartManager;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;
import com.contextlogic.wish.ui.fragment.filterfeed.FilterFeedFragment;
import com.contextlogic.wish.ui.fragment.invite.InviteFriendsByLinkFragment;
import com.contextlogic.wish.ui.fragment.login.email.EmailChangePasswordFragment;
import com.contextlogic.wish.ui.fragment.menu.MenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlist.WishlistMenuFragment;
import com.contextlogic.wish.ui.fragment.menu.wishlistv2.WishlistV2MenuFragment;
import com.contextlogic.wish.ui.fragment.notifications.NotificationsFragment;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.TabbedProductDetailsFragment;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.ui.fragment.settings.data.DataControlSettingsFragment;
import com.contextlogic.wish.ui.fragment.settings.push.PushNotificationSettingsFragment;
import com.contextlogic.wish.ui.fragment.signup.CheckoutSignupCartManager;
import com.contextlogic.wish.ui.fragment.signup.SignupUpdateProfileFragment;
import com.contextlogic.wish.ui.fragment.tour.listediting.ListEditingTourFragment;
import com.contextlogic.wish.ui.fragment.wallet.WalletFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.CompatibilityUtil;
import com.contextlogic.wish.util.FileUtil;
import com.contextlogic.wish.util.StateSerializer;
import com.contextlogic.wish.util.TabletUtil;
import com.crashlytics.android.Crashlytics;
import com.devicecollector.DeviceCollector;
import com.devicecollector.collectors.CollectorEnum;
import com.facebook.AppLinkData;
import com.google.android.gms.appindexing.AndroidAppUri;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivityContainerLayout, RootActivitySearchManager, RootActivityUpdateAppPrompt, ProfileImageUploadCallback

public class RootActivity extends WishBaseActionBarActivity
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener, ApiDataChangeNotificationListener
{

    public static final String ACTION_NEW_APP_USER = "NewAppUser";
    public static final String ARG_NEW_WISH_USER = "NewWishUser";
    public static final String ARG_SIGNUP_FLOW = "ArgSignupFlow";
    private static int CACHED_CONTENT_PANE_WIDTH = 0;
    private static int CACHED_TABLET_MODAL_WIDTH = 0;
    private static final String CONTENT_FRAGMENT_TAG = "ContentFragment";
    private static final String CRASH_LOG_STACK_SIZE_KEY = "StackSize";
    public static boolean DISABLE_PROMPTS = false;
    public static boolean FRAGMENT_ANIMATION_ENABLED = false;
    public static final int IMAGECHOOSER_RESULTCODE = 1;
    private static final String LEFT_MENU_FRAGMENT_TAG = "LeftMenuFragment";
    private static final String MODAL_CONTENT_FRAGMENT_TAG = "ModalContentFragment";
    private static final String MODAL_FRAGMENT_TAG = "ModalFragment";
    private static final String RIGHT_MENU_FRAGMENT_TAG = "RightMenuFragment";
    private static String wishlistExperimentBucket = UserStatusManager.getInstance().getBucketForExperiment("mobile_wishlist_v2");
    private Toolbar actionBar;
    private NavigationBarWrapper activeBar;
    private RedBadgeTextView badgeTextView;
    private FrameLayout cartContainer;
    private CartManager cartManager;
    private int constrainedHeight;
    private RootActivityContainerLayout contentContainer;
    private int currentBadgeCount;
    private int currentMenuOrientation;
    private int currentOrientation;
    private Button deepLinkButton;
    private EditText deepLinkEditText;
    private DeviceCollector deviceCollector;
    private String deviceCollectorSessionId;
    private int displayWidth;
    private TabletDrawerLayout drawerLayout;
    public ActionBarDrawerToggle drawerToggle;
    private boolean googleAppIndexingTracked;
    private Handler handler;
    private boolean handlingActivityResult;
    private boolean isActionLocked;
    protected boolean isNewAppUser;
    private boolean isNewWishUser;
    private boolean isSearching;
    private boolean isShowingModal;
    private View leftMenuContainer;
    private View leftShadow;
    private ProgressDialog loadingSpinner;
    private int maxMenuWidth;
    private FrameLayout modalContainer;
    private Uri outputFileUri;
    private TextView outputText;
    private FrameLayout overlayContainer;
    private View overlayMask;
    private View rightMenuContainer;
    private Fragment rightMenuFragment;
    private View rightShadow;
    private RootActivitySearchManager searchManager;
    private boolean shouldDisableActions;
    private boolean shouldHideActions;
    private CheckoutSignupCartManager signupCartManager;
    private View tabletModalMask;
    private int thinRightMenuWidth;
    private boolean trackedPageView;
    private RootActivityUpdateAppPrompt updateAppPrompt;
    private ValueCallback uploadMessage;
    private UploadProfileImageService uploadProfileImageService;
    private com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow useSignupFlow;

    public RootActivity()
    {
    }

    private void deleteImageUri()
    {
        if (outputFileUri != null)
        {
            File file = new File(outputFileUri.getPath());
            if (file.exists())
            {
                file.delete();
            }
            outputFileUri = null;
        }
    }

    private String generateDeviceCollectorSession()
    {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static int getContentPaneWidth(Activity activity)
    {
        if (CACHED_CONTENT_PANE_WIDTH <= 0)
        {
            activity = activity.getWindowManager().getDefaultDisplay();
            if (activity.getWidth() < activity.getHeight())
            {
                CACHED_CONTENT_PANE_WIDTH = (int)((double)activity.getWidth() * 0.80000000000000004D);
            } else
            {
                CACHED_CONTENT_PANE_WIDTH = (int)((double)activity.getHeight() * 0.80000000000000004D);
            }
        }
        return CACHED_CONTENT_PANE_WIDTH;
    }

    public static BaseContentFragment getProductDetailFragment(WishProduct wishproduct, String s, String s1, WishUserProductBucket wishuserproductbucket)
    {
        s1 = new TabbedProductDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ArgProduct", wishproduct);
        if (s != null)
        {
            bundle.putString("ArgCredit", s);
        }
        if (wishuserproductbucket != null)
        {
            bundle.putSerializable("ArgBucket", wishuserproductbucket);
        }
        s1.setArguments(bundle);
        return s1;
    }

    private Uri getReferrerCompatible()
    {
        Object obj = getIntent();
        Uri uri = (Uri)((Intent) (obj)).getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null)
        {
            return uri;
        }
        obj = ((Intent) (obj)).getStringExtra("android.intent.extra.REFERRER_NAME");
        if (obj != null)
        {
            try
            {
                obj = Uri.parse(((String) (obj)));
            }
            catch (ParseException parseexception)
            {
                return null;
            }
            return ((Uri) (obj));
        } else
        {
            return null;
        }
    }

    public static BaseContentFragment getTabbedFeedFragment(boolean flag, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ArgPlaceholderMode", flag);
        if (s != null)
        {
            bundle.putString("ArgInitialCategory", s);
        }
        s = new FilterFeedFragment();
        s.setArguments(bundle);
        return s;
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

    private Fragment getTopFragment()
    {
        if (isShowingModal)
        {
            return getSupportFragmentManager().findFragmentByTag("ModalFragment");
        } else
        {
            return getSupportFragmentManager().findFragmentByTag("ContentFragment");
        }
    }

    private void hideLeftMenuContent()
    {
        if (currentOrientation == 2)
        {
            return;
        } else
        {
            drawerLayout.closeDrawer(0x800003);
            return;
        }
    }

    private void hideRightMenuContent()
    {
        while (!hasRightMenu() || currentOrientation == 2) 
        {
            return;
        }
        drawerLayout.closeDrawer(0x800005);
    }

    private void processDeepLink()
    {
        ApplicationDeepLinkConfig applicationdeeplinkconfig = WishApplication.getAppInstance().getDeepLinkConfig();
        if (applicationdeeplinkconfig != null)
        {
            WishApplication.getAppInstance().setDeepLinkConfig(null);
            processDeepLink(applicationdeeplinkconfig, true);
        }
    }

    private void processDeferredDeepLink(final boolean isNewUser)
    {
        AppLinkData.fetchDeferredAppLinkData(this, FacebookManager.getInstance().getActiveAppId(), new com.facebook.AppLinkData.CompletionHandler() {

            final RootActivity this$0;
            final boolean val$isNewUser;

            public void onDeferredAppLinkDataFetched(AppLinkData applinkdata)
            {
                if (applinkdata != null && applinkdata.getTargetUri() != null)
                {
                    if (isNewUser)
                    {
                        (new LogSignupDeepLinkService()).requestService(applinkdata.getTargetUri().toString(), null, null);
                    } else
                    {
                        ApplicationDeepLinkConfig applicationdeeplinkconfig = WishDeepLinkActivity.getDeepLinkTarget(applinkdata.getTargetUri());
                        Uri uri = applinkdata.getTargetUri();
                        if ((uri.getScheme() != null && uri.getScheme().contains(WishDeepLinkActivity.getDeepLinkProtocol()) || uri.getHost() != null && uri.getHost().contains("wish.com")) && applicationdeeplinkconfig != null)
                        {
                            RootActivity rootactivity = RootActivity.this;
                            if (rootactivity != null && !rootactivity.hasModal())
                            {
                                rootactivity.processDeepLink(applicationdeeplinkconfig, false);
                                return;
                            } else
                            {
                                (new LogSignupDeepLinkService()).requestService(applinkdata.getTargetUri().toString(), null, null);
                                return;
                            }
                        }
                    }
                }
            }

            
            {
                this$0 = RootActivity.this;
                isNewUser = flag;
                super();
            }
        });
    }

    private void processLandingPage()
    {
        Object obj1;
        boolean flag1;
        long l;
        flag1 = false;
        obj1 = UserPreferences.getNextLandingPage();
        l = UserPreferences.getNextLandingPageExpiry();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag;
        flag = true;
        obj = obj1;
_L4:
        long l1;
label0:
        {
            l1 = UserPreferences.getLastForegroundTime();
            long l2 = UserPreferences.getLastLandingPageTime();
            if (l1 != 0L)
            {
                l = l2;
                if (l2 != 0L)
                {
                    break label0;
                }
            }
            l1 = System.currentTimeMillis();
            l = l1;
            UserPreferences.setLastLandingPageTime(l);
        }
        long l3 = System.currentTimeMillis();
        boolean flag2;
        if (l3 - l1 >= 0x36ee80L && l3 - l >= 0x4ef6d80L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj1 = WishApplication.getAppInstance().getDeepLinkConfig();
        flag2 = flag;
        if (!handlingActivityResult)
        {
            flag2 = flag;
            if (!isShowingModal)
            {
                flag2 = flag;
                if (!DISABLE_PROMPTS)
                {
                    flag2 = flag;
                    if (obj1 == null)
                    {
                        flag2 = flag;
                        if (obj != null)
                        {
                            flag2 = flag;
                            if (flag1)
                            {
                                obj1 = Uri.parse(((String) (obj)));
                                if (obj1 != null)
                                {
                                    obj1 = WishDeepLinkActivity.getDeepLinkTarget(((Uri) (obj1)));
                                    if (obj1 != null)
                                    {
                                        WishApplication.getAppInstance().setDeepLinkConfig(((ApplicationDeepLinkConfig) (obj1)));
                                    }
                                }
                                UserPreferences.setLandingPageCount(UserPreferences.getLandingPageCount() + 1);
                                UserPreferences.setLastLandingPage(((String) (obj)));
                                UserPreferences.setNextLandingPage(null);
                                UserPreferences.setNextLandingPageExpiry(0L);
                                UserPreferences.setLastLandingPageTime(l3);
                                flag2 = true;
                            }
                        }
                    }
                }
            }
        }
        if (flag2)
        {
            (new GetLandingPageService()).requestService(UserPreferences.getLandingPageCount(), UserPreferences.getLastLandingPage(), null, null);
        }
        UserPreferences.setLastForegroundTime(System.currentTimeMillis());
        return;
_L2:
        flag = flag1;
        obj = obj1;
        if (l > 0L)
        {
            flag = flag1;
            obj = obj1;
            if (System.currentTimeMillis() > l)
            {
                obj = null;
                UserPreferences.setNextLandingPage(null);
                UserPreferences.setNextLandingPageExpiry(0L);
                flag = true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void refreshBadgeCount(int i)
    {
        if ((getSupportActionBar().getDisplayOptions() & 4) != 4)
        {
            i = 0;
        }
        if (currentBadgeCount == i)
        {
            return;
        }
        currentBadgeCount = i;
        if (i <= 0)
        {
            badgeTextView.setVisibility(8);
            return;
        } else
        {
            badgeTextView.setVisibility(0);
            badgeTextView.setText(Integer.toString(i));
            return;
        }
    }

    private void setContentContainerLeftOffset(int i)
    {
        contentContainer.clearAnimation();
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)contentContainer.getLayoutParams();
        layoutparams.leftMargin = i;
        layoutparams.gravity = 48;
        contentContainer.setLayoutParams(layoutparams);
        contentContainer.invalidate();
    }

    private void setLeftMenuWidth(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = leftMenuContainer.getLayoutParams();
        layoutparams.width = i;
        leftMenuContainer.setLayoutParams(layoutparams);
    }

    private void setRightMenuWidth(int i)
    {
        if (!hasRightMenu())
        {
            return;
        } else
        {
            android.view.ViewGroup.LayoutParams layoutparams = rightMenuContainer.getLayoutParams();
            layoutparams.width = i;
            rightMenuContainer.setLayoutParams(layoutparams);
            return;
        }
    }

    private void showLeftMenuContent()
    {
        if (currentOrientation == 2)
        {
            return;
        } else
        {
            drawerLayout.openDrawer(0x800003);
            return;
        }
    }

    private void showNoImageError()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getString(0x7f0602df));
        builder.setMessage(getString(0x7f0602de, new Object[] {
            WishApplication.getAppInstance().getAppName()
        }));
        builder.setPositiveButton(getString(0x7f060305), new android.content.DialogInterface.OnClickListener() {

            final RootActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
        builder.show();
    }

    private void showRightMenuContent()
    {
        while (!hasRightMenu() || currentOrientation == 2) 
        {
            return;
        }
        drawerLayout.openDrawer(0x800005);
    }

    private void showUrlInModal(String s)
    {
        EmbeddedBrowserFragment embeddedbrowserfragment = new EmbeddedBrowserFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgInitialUrl", s);
        embeddedbrowserfragment.setArguments(bundle);
        setModalContentFragment(embeddedbrowserfragment, true);
        closeMenus();
    }

    private void startSearch()
    {
        if (isSearching)
        {
            return;
        } else
        {
            closeMenus();
            isSearching = true;
            SearchView searchview = searchManager.initializeSearchView();
            android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(-1, -1, 3);
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setCustomView(searchview, layoutparams);
            supportInvalidateOptionsMenu();
            searchview.requestFocus();
            drawerToggle.setDrawerIndicatorEnabled(false);
            return;
        }
    }

    private void trackGoogleAppIndexing()
    {
        Uri uri = CompatibilityUtil.getReferrer(this);
        Object obj = uri;
        if (uri == null)
        {
            obj = getReferrerCompatible();
        }
        if (obj != null)
        {
            if (((Uri) (obj)).getScheme().equals("http") || ((Uri) (obj)).getScheme().equals("https"))
            {
                if (((Uri) (obj)).getHost().equals("www.google.com"))
                {
                    trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_GOOGLE_APPINDEXING_WEB_GOOGLE);
                } else
                {
                    trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_GOOGLE_APPINDEXING_WEB_OTHER);
                }
                googleAppIndexingTracked = true;
            } else
            if (((Uri) (obj)).getScheme().equals("android-app"))
            {
                obj = AndroidAppUri.newAndroidAppUri(((Uri) (obj)));
                String s = ((AndroidAppUri) (obj)).getPackageName();
                if ("com.google.android.googlequicksearchbox".equals(s))
                {
                    if (((AndroidAppUri) (obj)).getDeepLinkUri().getHost().equals("www.google.com"))
                    {
                        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_GOOGLE_APPINDEXING_APP_GOOGLE);
                    } else
                    {
                        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_GOOGLE_APPINDEXING_APP_OTHER);
                    }
                    googleAppIndexingTracked = true;
                    return;
                }
                if ("com.google.appcrawler".equals(s))
                {
                    trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_GOOGLE_APPINDEXING_CRAWLER);
                    return;
                }
            }
        }
    }

    private boolean willShowSignupFlow()
    {
        return isNewWishUser && !UserPreferences.getSignupFlowSeen() && useSignupFlow != null && useSignupFlow != com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.None;
    }

    public void clearCartManager()
    {
        cartContainer.removeAllViews();
        cartManager = null;
        signupCartManager = null;
    }

    public void clearOverlay()
    {
        overlayContainer.removeAllViews();
        overlayContainer.setVisibility(8);
        overlayMask.setVisibility(8);
        if (drawerLayout != null)
        {
            drawerLayout.setDrawerLockMode(0);
            shouldDisableActions = false;
            supportInvalidateOptionsMenu();
        }
    }

    public void closeMenus()
    {
        hideLeftMenuContent();
        hideRightMenuContent();
    }

    public void closeScreensWithCount(int i)
    {
        int j = i;
        if (i > getSupportFragmentManager().getBackStackEntryCount() - 1)
        {
            j = getSupportFragmentManager().getBackStackEntryCount() - 1;
        }
        if (getSupportFragmentManager().getBackStackEntryCount() >= j)
        {
            i = 0;
            while (i < j) 
            {
                try
                {
                    getSupportFragmentManager().popBackStackImmediate();
                }
                catch (Throwable throwable) { }
                i++;
            }
        }
    }

    public void dismissModal()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final RootActivity this$0;

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
                this$0 = RootActivity.this;
                super();
            }
            });
        }
    }

    public void endSearch()
    {
        boolean flag = true;
        Object obj = searchManager.getSearchView();
        if (obj != null)
        {
            ((SearchView) (obj)).clearFocus();
            searchManager.destroySearchView();
        }
        isSearching = false;
        BaseContentFragment basecontentfragment = (BaseContentFragment)getTopFragment();
        MenuFragment menufragment = (MenuFragment)getSupportFragmentManager().findFragmentById(0x7f0d007e);
        if (basecontentfragment != null)
        {
            obj = basecontentfragment.getTopLevelMenuItem();
        } else
        {
            obj = null;
        }
        if (menufragment != null && basecontentfragment != null && !hasModal())
        {
            if (obj != null || getSupportFragmentManager().getBackStackEntryCount() <= 1)
            {
                drawerToggle.setDrawerIndicatorEnabled(true);
            } else
            {
                drawerToggle.setDrawerIndicatorEnabled(false);
            }
            menufragment.setSelectedItem(((com.contextlogic.wish.ui.fragment.menu.MainMenuItem) (obj)));
        } else
        {
            ActionBarDrawerToggle actionbardrawertoggle = drawerToggle;
            if (getSupportFragmentManager().getBackStackEntryCount() > 1)
            {
                flag = false;
            }
            actionbardrawertoggle.setDrawerIndicatorEnabled(flag);
        }
        if (activeBar != null)
        {
            activeBar.apply();
        }
    }

    public void fragmentClick(View view)
    {
    }

    public NavigationBarWrapper getActiveBar()
    {
        if (isSearching)
        {
            return null;
        } else
        {
            return activeBar;
        }
    }

    public long getContentAnimationTimeRemaining()
    {
        if (contentContainer.getAnimation() != null)
        {
            return contentContainer.getAnimation().getDuration();
        } else
        {
            return 0L;
        }
    }

    public NavigationBarWrapper getContentNavigationBar()
    {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("ContentFragment");
        if (fragment instanceof BaseContentFragment)
        {
            return ((BaseContentFragment)fragment).getNavigationBar();
        } else
        {
            return null;
        }
    }

    public int getCurrentLeftMenuWidth()
    {
        return Math.min((int)((double)getWindowManager().getDefaultDisplay().getWidth() * 0.80000000000000004D), maxMenuWidth);
    }

    public int getCurrentRightMenuWidth()
    {
        if (TabletUtil.isLargeTablet(this))
        {
            return Math.min((int)((double)getWindowManager().getDefaultDisplay().getWidth() * 0.80000000000000004D), maxMenuWidth);
        } else
        {
            return thinRightMenuWidth;
        }
    }

    public String getDeviceCollectorSessionId()
    {
        return deviceCollectorSessionId;
    }

    public BaseContentFragment getFirstFeedFragment(boolean flag)
    {
        return getTabbedFeedFragment(flag, null);
    }

    public int getTabletContentContainerWidth()
    {
        if (currentOrientation == 2)
        {
            if (hasRightMenu())
            {
                return displayWidth - getCurrentLeftMenuWidth() - getCurrentRightMenuWidth();
            } else
            {
                return displayWidth - getCurrentLeftMenuWidth();
            }
        } else
        {
            return displayWidth;
        }
    }

    public ValueCallback getUploadMessage()
    {
        return uploadMessage;
    }

    public String getWishlistExperimentBucket()
    {
        return wishlistExperimentBucket;
    }

    public boolean hasModal()
    {
        return getSupportFragmentManager().findFragmentByTag("ModalFragment") != null;
    }

    public boolean hasRightMenu()
    {
        return true;
    }

    public void hideKeyboard()
    {
        InputMethodManager inputmethodmanager;
        inputmethodmanager = (InputMethodManager)getSystemService("input_method");
        if (inputmethodmanager == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        inputmethodmanager.hideSoftInputFromWindow(drawerLayout.getWindowToken(), 0);
        return;
        Throwable throwable;
        throwable;
    }

    public void hideLoadingSpinner()
    {
        if (loadingSpinner != null)
        {
            try
            {
                loadingSpinner.dismiss();
            }
            catch (Throwable throwable) { }
            loadingSpinner = null;
        }
    }

    public void hideNonModalContent()
    {
        if (!TabletUtil.isTablet(this))
        {
            contentContainer.setVisibility(8);
        }
    }

    public void initializeDeviceCollector()
    {
        if (deviceCollector != null)
        {
            deviceCollector.stopNow();
            deviceCollector = null;
        }
        deviceCollector = new DeviceCollector(this);
        EnumSet enumset = EnumSet.of(CollectorEnum.GEO_LOCATION, CollectorEnum.MAC_ADDRESS);
        deviceCollector.skipCollectors(enumset);
        deviceCollector.setMerchantId(UserStatusManager.getInstance().getBraintreeCollectorMerchantId());
        deviceCollector.setCollectorUrl(UserStatusManager.getInstance().getBraintreeCollectorUrl());
    }

    protected void initializeFragments()
    {
        setLeftMenuFragment(new MenuFragment());
        BaseContentFragment basecontentfragment;
        boolean flag;
        if (hasRightMenu())
        {
            if (wishlistExperimentBucket.equals("show"))
            {
                setRightMenuFragment(new WishlistV2MenuFragment());
            } else
            {
                setRightMenuFragment(new WishlistMenuFragment());
            }
        }
        flag = willShowSignupFlow();
        basecontentfragment = getFirstFeedFragment(flag);
        basecontentfragment.getArguments().putBoolean("ArgPlaceholderMode", flag);
        setContentFragment(basecontentfragment, true);
    }

    protected void initializeUi()
    {
        setContentView(0x7f030019);
        badgeTextView = (RedBadgeTextView)findViewById(0x7f0d0075);
        badgeTextView.useNavigationBarMode(true);
        actionBar = (Toolbar)findViewById(0x7f0d0074);
        actionBar.setTitleTextAppearance(this, 0x7f0b00fe);
        actionBar.setSubtitleTextAppearance(this, 0x7f0b00fe);
        setSupportActionBar(actionBar);
        contentContainer = (RootActivityContainerLayout)findViewById(0x7f0d0078);
        rightMenuContainer = findViewById(0x7f0d0080);
        leftMenuContainer = findViewById(0x7f0d007d);
        rightShadow = findViewById(0x7f0d0082);
        leftShadow = findViewById(0x7f0d007f);
        tabletModalMask = findViewById(0x7f0d007b);
        tabletModalMask.setOnClickListener(new android.view.View.OnClickListener() {

            final RootActivity this$0;

            public void onClick(View view2)
            {
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
        overlayContainer = (FrameLayout)findViewById(0x7f0d0086);
        overlayMask = findViewById(0x7f0d0085);
        overlayMask.setOnClickListener(new android.view.View.OnClickListener() {

            final RootActivity this$0;

            public void onClick(View view2)
            {
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
        clearOverlay();
        cartContainer = (FrameLayout)findViewById(0x7f0d0083);
        ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView();
        View view = findViewById(0x7f0d0084);
        ((ViewGroup)view.getParent()).removeView(view);
        viewgroup.addView(view);
        if (WishApplication.getAppInstance().isTestingBuild())
        {
            LinearLayout linearlayout = new LinearLayout(getBaseContext());
            int i = (int)TypedValue.applyDimension(1, 30F, getBaseContext().getResources().getDisplayMetrics());
            int j = (int)TypedValue.applyDimension(1, 120F, getBaseContext().getResources().getDisplayMetrics());
            deepLinkButton = new Button(getBaseContext());
            WishTestingUtil.addContentDescription(deepLinkButton, getClass().getSimpleName(), "deepLinkButton");
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams((int)TypedValue.applyDimension(1, 10F, getBaseContext().getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10F, getBaseContext().getResources().getDisplayMetrics()));
            layoutparams.leftMargin = j;
            layoutparams.topMargin = i;
            deepLinkButton.setLayoutParams(layoutparams);
            deepLinkButton.setBackgroundColor(0);
            deepLinkEditText = new EditText(getBaseContext());
            WishTestingUtil.addContentDescription(deepLinkEditText, getClass().getSimpleName(), "deepLinkEditText");
            layoutparams = new android.widget.LinearLayout.LayoutParams((int)TypedValue.applyDimension(1, 50F, getBaseContext().getResources().getDisplayMetrics()), -2);
            layoutparams.topMargin = i;
            deepLinkEditText.setLayoutParams(layoutparams);
            deepLinkEditText.setMaxLines(1);
            deepLinkEditText.setVisibility(8);
            deepLinkEditText.setInputType(1);
            outputText = new TextView(getBaseContext());
            WishTestingUtil.addContentDescription(outputText, getClass().getSimpleName(), "outputText");
            layoutparams = new android.widget.LinearLayout.LayoutParams((int)TypedValue.applyDimension(1, 50F, getBaseContext().getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 30F, getBaseContext().getResources().getDisplayMetrics()));
            layoutparams.topMargin = i;
            outputText.setLayoutParams(layoutparams);
            outputText.setText("");
            outputText.setTextColor(getResources().getColor(0x7f0c0071));
            linearlayout.addView(deepLinkButton);
            linearlayout.addView(deepLinkEditText);
            linearlayout.addView(outputText);
            viewgroup.addView(linearlayout);
            deepLinkButton.setOnClickListener(new android.view.View.OnClickListener() {

                final RootActivity this$0;

                public void onClick(View view2)
                {
                    if (deepLinkEditText.getVisibility() == 8)
                    {
                        deepLinkEditText.setVisibility(0);
                        return;
                    }
                    view2 = Uri.parse(deepLinkEditText.getText().toString());
                    if (!view2.getHost().equals("testing")) goto _L2; else goto _L1
_L1:
                    Object obj;
                    view2 = WishDeepLinkActivity.parseParams(view2.getFragment());
                    obj = view2.getString("a");
                    if (!((String) (obj)).equals("e") && !((String) (obj)).equals("getText")) goto _L4; else goto _L3
_L3:
                    obj = getSupportFragmentManager().findFragmentByTag("ContentFragment");
                    if (obj instanceof EmbeddedBrowserFragment)
                    {
                        ((EmbeddedBrowserFragment)obj).getWebElmentText(view2.getString("v"));
                    }
_L5:
                    deepLinkEditText.setText("");
                    deepLinkEditText.setVisibility(8);
                    return;
_L4:
                    if (((String) (obj)).equals("c") || ((String) (obj)).equals("clear"))
                    {
                        outputText.setText("");
                        outputText.invalidate();
                    } else
                    if (((String) (obj)).equals("b") || ((String) (obj)).equals("click"))
                    {
                        obj = getSupportFragmentManager().findFragmentByTag("ContentFragment");
                        if (obj instanceof EmbeddedBrowserFragment)
                        {
                            ((EmbeddedBrowserFragment)obj).clickWebElement(view2.getString("v"));
                        }
                    } else
                    if (((String) (obj)).equals("ch") || ((String) (obj)).equals("check"))
                    {
                        Fragment fragment = getSupportFragmentManager().findFragmentByTag("ContentFragment");
                        if (fragment instanceof EmbeddedBrowserFragment)
                        {
                            ((EmbeddedBrowserFragment)fragment).checkWebElment(view2.getString("v"));
                        }
                    }
                    if (true) goto _L5; else goto _L2
_L2:
                    view2 = WishDeepLinkActivity.getDeepLinkTarget(view2);
                    processDeepLink(view2, true);
                    deepLinkEditText.setText("");
                    deepLinkEditText.setVisibility(8);
                    return;
                }

            
            {
                this$0 = RootActivity.this;
                super();
            }
            });
        }
        drawerLayout = (TabletDrawerLayout)findViewById(0x7f0d0076);
        drawerLayout.setDrawerShadow(0x7f020038, 0x800003);
        if (hasRightMenu())
        {
            drawerLayout.setDrawerShadow(0x7f020039, 0x800005);
        } else
        {
            drawerLayout.removeView(rightMenuContainer);
        }
        if (TabletUtil.isTablet(this))
        {
            findViewById(0x7f0d0079).setVisibility(8);
            modalContainer = (FrameLayout)findViewById(0x7f0d007c);
            tabletModalMask.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final RootActivity this$0;

                public void onGlobalLayout()
                {
                    int k = tabletModalMask.getHeight();
                    if (k > 0 && k != constrainedHeight)
                    {
                        constrainedHeight = k;
                        resizeUi(k, false);
                    }
                }

            
            {
                this$0 = RootActivity.this;
                super();
            }
            });
            drawerLayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                private int lastWidth;
                final RootActivity this$0;

                public void onGlobalLayout()
                {
                    int k = drawerLayout.getWidth();
                    if (k > 0 && k != lastWidth)
                    {
                        lastWidth = k;
                        k = tabletModalMask.getHeight();
                        resizeUi(k, true);
                    }
                }

            
            {
                this$0 = RootActivity.this;
                super();
                lastWidth = -1;
            }
            });
            ViewGroup viewgroup1 = (ViewGroup)getWindow().getDecorView();
            View view1 = findViewById(0x7f0d007a);
            ((ViewGroup)view1.getParent()).removeView(view1);
            viewgroup1.addView(view1);
        } else
        {
            tabletModalMask.setVisibility(8);
            findViewById(0x7f0d007a).setVisibility(8);
            modalContainer = (FrameLayout)findViewById(0x7f0d0079);
        }
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, 0x7f06030e, 0x7f0600e8) {

            final RootActivity this$0;

            public void onDrawerClosed(View view2)
            {
                super.onDrawerClosed(view2);
                shouldHideActions = false;
                if (!hasRightMenu() || rightMenuFragment == null) goto _L2; else goto _L1
_L1:
                if (!RootActivity.wishlistExperimentBucket.equals("show") || (rightMenuFragment instanceof WishlistV2MenuFragment)) goto _L4; else goto _L3
_L3:
                view2 = new WishlistV2MenuFragment();
                setRightMenuFragment(view2);
_L2:
                supportInvalidateOptionsMenu();
                return;
_L4:
                if (!RootActivity.wishlistExperimentBucket.equals("show") && !(rightMenuFragment instanceof WishlistMenuFragment))
                {
                    view2 = new WishlistMenuFragment();
                    setRightMenuFragment(view2);
                }
                if (true) goto _L2; else goto _L5
_L5:
            }

            public void onDrawerOpened(View view2)
            {
                super.onDrawerOpened(view2);
                if (!TabletUtil.isTablet(RootActivity.this) || currentOrientation != 2)
                {
                    shouldHideActions = true;
                }
                if (hasRightMenu() && rightMenuFragment != null && (rightMenuFragment instanceof WishlistV2MenuFragment))
                {
                    ((WishlistV2MenuFragment)rightMenuFragment).refreshIfNeeded(false);
                }
                supportInvalidateOptionsMenu();
            }

            
            {
                this$0 = RootActivity.this;
                super(activity, drawerlayout, i, j);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        refreshBadgeCount();
    }

    public void lockActions(boolean flag)
    {
        isActionLocked = flag;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        handlingActivityResult = true;
        FacebookManager.getInstance().onActivityResult(this, i, j, intent);
        GooglePlusManager.getInstance().onActivityResult(this, i, j, intent);
        PayPalManager.getInstance().onActivityResult(this, i, j, intent);
        if (i == 1 && j == -1 && uploadMessage != null)
        {
            Object obj;
            boolean flag;
            if (intent == null)
            {
                flag = true;
            } else
            {
                String s = intent.getAction();
                if (s == null)
                {
                    flag = false;
                } else
                {
                    flag = s.equals("android.media.action.IMAGE_CAPTURE");
                }
            }
            if (flag)
            {
                intent = outputFileUri;
            } else
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = intent.getData();
            }
            obj = intent;
            if (!flag)
            {
                obj = intent;
                if (intent == null)
                {
                    obj = outputFileUri;
                }
            }
            if (obj != null)
            {
                uploadMessage.onReceiveValue(obj);
            }
            uploadMessage = null;
        }
    }

    public void onBackPressed()
    {
        onBackPressed(false);
    }

    public void onBackPressed(boolean flag)
    {
        if (!isActionLocked) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (isSearching)
        {
            endSearch();
            return;
        }
        if (!TabletUtil.isTablet(this) && drawerLayout != null && drawerLayout.isDrawerOpen())
        {
            drawerLayout.closeDrawers();
            return;
        }
        if (overlayContainer.getChildCount() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = true;
        flag = flag1;
        if (overlayContainer.getTag() != null)
        {
            flag = flag1;
            if (overlayContainer.getTag() instanceof Boolean)
            {
                flag = ((Boolean)overlayContainer.getTag()).booleanValue();
            }
        }
        if (flag)
        {
            clearOverlay();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (signupCartManager != null)
        {
            signupCartManager.onBackPressed();
            return;
        }
        if (cartManager != null)
        {
            cartManager.onBackPressed();
            return;
        }
        if (getSupportFragmentManager().getBackStackEntryCount() > 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            moveTaskToBack(true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        Fragment fragment = getTopFragment();
        if (fragment == null || !(fragment instanceof BaseContentFragment) || !((BaseContentFragment)fragment).onBackPressed())
        {
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
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onBackStackChanged()
    {
        Crashlytics.setInt("StackSize", getSupportFragmentManager().getBackStackEntryCount());
        boolean flag1 = false;
        boolean flag4 = false;
        Object obj = null;
        boolean flag3 = flag4;
        boolean flag = flag1;
        if (getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            Object obj1 = getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount() - 1);
            flag3 = flag4;
            obj = obj1;
            flag = flag1;
            if (!isSearching)
            {
                flag = true;
                MenuFragment menufragment;
                boolean flag2;
                boolean flag5;
                if (getSupportFragmentManager().getBackStackEntryCount() <= 1)
                {
                    flag3 = true;
                    obj = obj1;
                } else
                {
                    flag3 = false;
                    obj = obj1;
                }
            }
        }
        if (obj != null && ((android.support.v4.app.FragmentManager.BackStackEntry) (obj)).getName() != null && (((android.support.v4.app.FragmentManager.BackStackEntry) (obj)).getName().equals("ModalContentFragment") || ((android.support.v4.app.FragmentManager.BackStackEntry) (obj)).getName().equals("ModalFragment")))
        {
            isShowingModal = true;
            if (TabletUtil.isTablet(this))
            {
                tabletModalMask.setVisibility(0);
            } else
            {
                drawerLayout.setDrawerLockMode(1);
            }
        } else
        {
            if (!getSupportActionBar().isShowing())
            {
                getSupportActionBar().show();
            }
            isShowingModal = false;
            if (TabletUtil.isTablet(this))
            {
                tabletModalMask.setVisibility(8);
            } else
            {
                drawerLayout.setDrawerLockMode(0);
                contentContainer.setVisibility(0);
            }
        }
        obj1 = (BaseContentFragment)getTopFragment();
        menufragment = (MenuFragment)getSupportFragmentManager().findFragmentById(0x7f0d007e);
        if (obj1 != null)
        {
            obj = ((BaseContentFragment) (obj1)).getTopLevelMenuItem();
        } else
        {
            obj = null;
        }
        flag5 = flag3;
        flag2 = flag;
        if (menufragment != null)
        {
            flag5 = flag3;
            flag2 = flag;
            if (obj1 != null)
            {
                flag5 = flag3;
                flag2 = flag;
                if (!hasModal())
                {
                    if (obj != null)
                    {
                        flag = true;
                        flag3 = true;
                    }
                    menufragment.setSelectedItem(((com.contextlogic.wish.ui.fragment.menu.MainMenuItem) (obj)));
                    flag2 = flag;
                    flag5 = flag3;
                }
            }
        }
        if (!TabletUtil.isTablet(this))
        {
            if (((BaseContentFragment) (obj1)).getNavigationBar().isUseWishNavigationBar())
            {
                getSupportActionBar().hide();
            } else
            {
                getSupportActionBar().show();
            }
        }
        activeBar = ((BaseContentFragment) (obj1)).getNavigationBar();
        if (activeBar.isBackButtonEnabled())
        {
            activeBar.apply();
        }
        if (flag2)
        {
            drawerToggle.setDrawerIndicatorEnabled(flag5);
        }
        if (!activeBar.isBackButtonEnabled())
        {
            activeBar.apply();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != currentOrientation && contentContainer != null)
        {
            resizeUi();
            InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
            if (inputmethodmanager != null)
            {
                try
                {
                    inputmethodmanager.hideSoftInputFromWindow(contentContainer.getWindowToken(), 0);
                }
                catch (Throwable throwable) { }
            }
            closeMenus();
            if (TabletUtil.isTablet(this))
            {
                clearOverlay();
            }
            ApiDataChangeNotificationManager.getInstance().notifyListenersForOrientationChanged();
        }
        if (drawerLayout != null)
        {
            drawerToggle.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = true;
        if (getResources() != null && !TabletUtil.isTablet(this))
        {
            setRequestedOrientation(1);
        }
        if (!LoggedInUser.getInstance().isLoggedIn() || !WishApplication.getAppInstance().isWishSessionValid())
        {
            super.onCreate(null);
            WishApplication.getAppInstance().logout(this, true, false, false);
            finish();
            return;
        }
        super.onCreate(bundle);
        if (handler == null && Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        currentOrientation = -1;
        constrainedHeight = -1;
        currentMenuOrientation = -1;
        currentBadgeCount = -1;
        searchManager = new RootActivitySearchManager(this);
        maxMenuWidth = (int)TypedValue.applyDimension(1, 260F, getResources().getDisplayMetrics());
        thinRightMenuWidth = (int)TypedValue.applyDimension(1, 140F, getResources().getDisplayMetrics());
        updateAppPrompt = new RootActivityUpdateAppPrompt();
        isActionLocked = false;
        isNewWishUser = getIntent().getBooleanExtra("NewWishUser", false);
        if (getIntent().getAction() == null || !getIntent().getAction().equals("NewAppUser"))
        {
            flag = false;
        }
        isNewAppUser = flag;
        isShowingModal = false;
        useSignupFlow = (com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow)getIntent().getSerializableExtra("ArgSignupFlow");
        googleAppIndexingTracked = false;
        initializeUi();
        getSupportFragmentManager().addOnBackStackChangedListener(this);
        initializeFragments();
        resizeUi();
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.LogoutRequired, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.NotificationCount, this);
        GooglePlusManager.getInstance().resetWalletClient();
        initializeDeviceCollector();
    }

    public void onDestroy()
    {
        super.onDestroy();
        ApiDataChangeNotificationManager.getInstance().removeListener(this);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (isActionLocked)
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (!LoggedInUser.getInstance().isLoggedIn() || !WishApplication.getAppInstance().isWishSessionValid())
        {
            WishApplication.getAppInstance().logout(this, true, false, false);
        }
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.LogoutRequired && handler != null)
        {
            handler.post(new Runnable() {

                final RootActivity this$0;

                public void run()
                {
                    StateSerializer.getInstance().deleteSerializedSessionState();
                    WishApplication.getAppInstance().logout(RootActivity.this, true, true, false);
                }

            
            {
                this$0 = RootActivity.this;
                super();
            }
            });
        }
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.NotificationCount)
        {
            refreshBadgeCount(bundle.getInt("NotificationCount"));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (shouldDisableActions)
        {
            return true;
        }
        if ((!TabletUtil.isTablet(this) || currentOrientation != 2) && drawerToggle.onOptionsItemSelected(menuitem))
        {
            hideRightMenuContent();
            return true;
        }
        switch (menuitem.getItemId())
        {
        default:
            if (getTopFragment() != null)
            {
                NavigationBarWrapper navigationbarwrapper = ((BaseContentFragment)getTopFragment()).getNavigationBar();
                if (navigationbarwrapper != null && navigationbarwrapper.onMenuItemClicked(menuitem.getItemId()))
                {
                    return true;
                }
            }
            break;

        case 16908332: 
            hideKeyboard();
            onBackPressed(true);
            return true;
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        if (updateAppPrompt != null)
        {
            updateAppPrompt.cancelAllRequests();
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        drawerToggle.syncState();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.clear();
        if (isSearching)
        {
            return super.onPrepareOptionsMenu(menu);
        }
        if (getTopFragment() != null)
        {
            NavigationBarWrapper navigationbarwrapper = ((BaseContentFragment)getTopFragment()).getNavigationBar();
            if (navigationbarwrapper != null && !shouldHideActions)
            {
                navigationbarwrapper.setupMenu(menu);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (!googleAppIndexingTracked)
        {
            trackGoogleAppIndexing();
        }
        if (handler == null && Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        if (LoggedInUser.getInstance().isLoggedIn() && WishApplication.getAppInstance().isWishSessionValid()) goto _L2; else goto _L1
_L1:
        WishApplication.getAppInstance().logout(this, true, false, false);
_L6:
        return;
_L2:
        GooglePlusManager.getInstance().getWalletClient(null, this, null);
        if (!UserPreferences.getLoginMode().equals("LoginModeEmail") && !UserPreferences.getLoginMode().equals("LoginModeGooglePlus")) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (!FacebookManager.getInstance().isLoggedIn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!(flag & FacebookManager.getInstance().hasCachedToken())) goto _L4; else goto _L5
_L5:
        FacebookManager.getInstance().startLogin(this, new com.contextlogic.wish.facebook.FacebookManager.LoginCallback() {

            final RootActivity this$0;

            public void onFailure()
            {
            }

            public void onSuccess()
            {
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
_L7:
        if (!isShowingModal && !DISABLE_PROMPTS)
        {
            if (isNewWishUser && !UserPreferences.getSignupFlowSeen())
            {
                UserPreferences.setSignupFlowSeen(true);
                if (useSignupFlow != null && useSignupFlow.equals(com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.FreeGifts))
                {
                    showFreeGiftSignupFlow(useSignupFlow);
                } else
                if (useSignupFlow != null && (useSignupFlow.equals(com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.Categories) || useSignupFlow.equals(com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.GenderFreeGifts) || TabletUtil.isTablet(this) && useSignupFlow.equals(com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.FreeGifts)))
                {
                    final SignupUpdateProfileFragment fragment = new SignupUpdateProfileFragment();
                    Bundle bundle = new Bundle();
                    if (useSignupFlow != null)
                    {
                        bundle.putSerializable("ArgSignupFlow", useSignupFlow);
                    }
                    fragment.setArguments(bundle);
                    handler.post(new Runnable() {

                        final RootActivity this$0;
                        final BaseContentFragment val$fragment;

                        public void run()
                        {
                            setModalContentFragment(fragment, true);
                        }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
                    });
                }
            } else
            {
                PromptManager.getInstance().loggedInAppForegrounded();
                handler.post(new Runnable() {

                    final RootActivity this$0;

                    public void run()
                    {
                        if (PromptManager.getInstance().showAvailablePrompts(RootActivity.this))
                        {
                            return;
                        } else
                        {
                            (new GetRatingPendingTransactionsService()).requestService(new com.contextlogic.wish.api.service.GetRatingPendingTransactionsService.SuccessCallback() {

                                final _cls3 this$1;

                                public void onServiceSucceeded(String s, String s1)
                                {
                                    s = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(s1));
                                    if (s.getType() == com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website)
                                    {
                                        s = s.getStringData();
                                        showUrlInModal(s);
                                    } else
                                    {
                                        processDeepLink(s, false);
                                    }
                                    (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_RATE_TRANSACTION_PROMPT.getValue()), null, null, null);
                                }

            
            {
                this$1 = _cls3.this;
                super();
            }
                            }, null);
                            return;
                        }
                    }

            
            {
                this$0 = RootActivity.this;
                super();
            }
                });
            }
        }
        if (!Analytics.getInstance().isStarted())
        {
            Analytics.getInstance().startAnalytics(WishApplication.getAppInstance());
        }
        if (!trackedPageView)
        {
            trackedPageView = true;
        }
        if (updateAppPrompt != null)
        {
            updateAppPrompt.onForegrounded(this);
        }
        processDeferredDeepLink(isNewWishUser);
        processLandingPage();
        handlingActivityResult = false;
        if (handler != null)
        {
            handler.post(new Runnable() {

                final RootActivity this$0;

                public void run()
                {
                    processDeepLink();
                }

            
            {
                this$0 = RootActivity.this;
                super();
            }
            });
            return;
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (UserPreferences.getLoginMode().equals("LoginModeEmail") || UserPreferences.getLoginMode().equals("LoginModeFB"))
        {
            GooglePlusManager.getInstance().preConnect();
        }
          goto _L7
    }

    public boolean onSearchRequested()
    {
        if (isActionLocked)
        {
            return false;
        } else
        {
            return onSearchRequested(false);
        }
    }

    public boolean onSearchRequested(boolean flag)
    {
        boolean flag1;
        if (!hasModal() && (!drawerLayout.isDrawerOpen() || TabletUtil.isTablet(this) && currentOrientation == 2))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag | flag1)
        {
            startSearch();
        }
        return false;
    }

    public void onStop()
    {
        super.onStop();
        PayPalManager.getInstance().onStop();
    }

    public void openImageIntent()
    {
        outputFileUri = Uri.fromFile(new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("tmp_image_").append(String.valueOf(System.currentTimeMillis())).append(".jpg").toString()));
        ArrayList arraylist = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Intent intent1;
        for (Iterator iterator = getPackageManager().queryIntentActivities(intent, 0).iterator(); iterator.hasNext(); arraylist.add(intent1))
        {
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            String s = resolveinfo.activityInfo.packageName;
            intent1 = new Intent(intent);
            intent1.putExtra("return-data", true);
            intent1.setComponent(new ComponentName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name));
            intent1.setPackage(s);
            intent1.putExtra("output", outputFileUri);
        }

        intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent = Intent.createChooser(intent, getString(0x7f0600dd));
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])arraylist.toArray(new Parcelable[0]));
        startActivityForResult(intent, 1);
    }

    public void populateCartContainer(View view)
    {
        cartContainer.removeAllViews();
        cartContainer.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void post(Runnable runnable)
    {
        if (handler != null)
        {
            handler.post(runnable);
        }
    }

    public void processDeepLink(ApplicationDeepLinkConfig applicationdeeplinkconfig, final boolean fromAppLink)
    {
        if (applicationdeeplinkconfig == null) goto _L2; else goto _L1
_L1:
        static class _cls36
        {

            static final int $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType = new int[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Notifications.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Wallet.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.ChangePassword.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Invite.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Cart.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Product.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Profile.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.AnotherApp.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Feed.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CategoryHome.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Search.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.CommerceSearch.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Brand.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.DataControlSettings.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.PushNotificationsSettings.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.RateApp.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.UpdateProfile.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.EditListTutorial.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.ChangeProfilePic.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ApplicationDeepLinkConfig$DeepLinkType[com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.SignupGift.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls36..SwitchMap.com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType[applicationdeeplinkconfig.getType().ordinal()];
        JVM INSTR tableswitch 1 21: default 112
    //                   1 174
    //                   2 234
    //                   3 262
    //                   4 290
    //                   5 318
    //                   6 403
    //                   7 436
    //                   8 480
    //                   9 626
    //                   10 784
    //                   11 872
    //                   12 902
    //                   13 983
    //                   14 1073
    //                   15 1154
    //                   16 1197
    //                   17 1240
    //                   18 1268
    //                   19 1320
    //                   20 1348
    //                   21 1363;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L3:
        if (applicationdeeplinkconfig.getBucketId() >= 0 && applicationdeeplinkconfig.getNotificationId() >= 0)
        {
            (new ViewNotificationService()).requestService(applicationdeeplinkconfig.getNotificationId(), applicationdeeplinkconfig.getBucketId(), null, null);
            UserStatusManager.getInstance().decrementUnviewedNotifications();
            (new ClickNotificationService()).requestService(applicationdeeplinkconfig.getNotificationId(), applicationdeeplinkconfig.getBucketId(), true, null, null);
        }
_L2:
        return;
_L4:
        String s = applicationdeeplinkconfig.getStringData();
        final EmbeddedBrowserFragment fragment = new EmbeddedBrowserFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putString("ArgInitialUrl", s);
        fragment.setArguments(bundle4);
        handler.post(new Runnable() {

            final RootActivity this$0;
            final EmbeddedBrowserFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
                closeMenus();
            }

            
            {
                this$0 = RootActivity.this;
                fragment = embeddedbrowserfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L5:
        final NotificationsFragment fragment = new NotificationsFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final NotificationsFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = notificationsfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L6:
        final WalletFragment fragment = new WalletFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final WalletFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = walletfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L7:
        final EmailChangePasswordFragment fragment = new EmailChangePasswordFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final EmailChangePasswordFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
                closeMenus();
            }

            
            {
                this$0 = RootActivity.this;
                fragment = emailchangepasswordfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L8:
        com.contextlogic.wish.api.data.WishInviteLinkSpec wishinvitelinkspec = UserStatusManager.getInstance().getInviteLinkSpec();
        if (wishinvitelinkspec != null)
        {
            final InviteFriendsByLinkFragment fragment = new InviteFriendsByLinkFragment();
            Bundle bundle5 = new Bundle();
            bundle5.putSerializable("ArgInviteLinkSpec", wishinvitelinkspec);
            fragment.setArguments(bundle5);
            handler.post(new Runnable() {

                final RootActivity this$0;
                final BaseContentFragment val$fragment;

                public void run()
                {
                    setModalContentFragment(fragment, true);
                }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
            });
        } else
        {
            showShareDialog(UserStatusManager.getInstance().getInviteSubject(), UserStatusManager.getInstance().getInviteMessage());
        }
        continue; /* Loop/switch isn't completed */
_L9:
        final String productId = applicationdeeplinkconfig.getProductId();
        final String variationId = applicationdeeplinkconfig.getVariationId();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final String val$productId;
            final String val$variationId;

            public void run()
            {
                showCart(productId, variationId, null);
            }

            
            {
                this$0 = RootActivity.this;
                productId = s;
                variationId = s1;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L10:
        final BaseContentFragment fragment = getProductDetailFragment(new WishProduct(applicationdeeplinkconfig.getStringData()), applicationdeeplinkconfig.getCreditInfo(), applicationdeeplinkconfig.getRecommendedBy(), null);
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L11:
        String s1 = applicationdeeplinkconfig.getStringData();
        String s3 = applicationdeeplinkconfig.getSetId();
        final ProfileFragment fragment;
        if (s1 != null)
        {
            fragment = new ProfileFragment();
            Bundle bundle8 = new Bundle();
            bundle8.putString("ArgUser", RuntimeStateStore.getInstance().storeState(new WishUser(s1), null));
            if (s3 != null)
            {
                bundle8.putString("ArgSetId", s3);
            }
            fragment.setArguments(bundle8);
        } else
        {
            fragment = new ProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(LoggedInUser.getInstance().getCurrentUser(), null));
            fragment.setArguments(bundle);
        }
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L12:
        Object obj = Uri.parse(applicationdeeplinkconfig.getStringData());
        Intent intent = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        try
        {
            startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            obj = ((Uri) (obj)).getScheme().toLowerCase();
            int i = getResources().getIdentifier((new StringBuilder()).append("package_name_").append(((String) (obj))).toString(), "string", getPackageName());
            if (i != 0)
            {
                obj = getString(i);
            } else
            {
                obj = (new StringBuilder()).append("com.contextlogic.").append(((String) (obj))).toString();
            }
            obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(((String) (obj))).toString()));
            try
            {
                startActivity(((Intent) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        continue; /* Loop/switch isn't completed */
_L13:
        String s2 = applicationdeeplinkconfig.getStringData();
        final Object fragment;
        if (s2 == null)
        {
            fragment = getTabbedFeedFragment(false, null);
        } else
        {
            fragment = new ProductFeedFragment();
            Bundle bundle6 = new Bundle();
            bundle6.putString("ArgDataValue", s2);
            bundle6.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Tag.ordinal());
            ((BaseContentFragment) (fragment)).setArguments(bundle6);
        }
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;
            final boolean val$fromAppLink;

            public void run()
            {
                setContentFragment(fragment, fromAppLink);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                fromAppLink = flag;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L14:
        final BaseContentFragment fragment = getTabbedFeedFragment(false, applicationdeeplinkconfig.getStringData());
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;
            final boolean val$fromAppLink;

            public void run()
            {
                setContentFragment(fragment, fromAppLink);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                fromAppLink = flag;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L15:
        final ProductFeedFragment fragment = new ProductFeedFragment();
        Bundle bundle1 = new Bundle();
        bundle1.putString("ArgDataValue", applicationdeeplinkconfig.getStringData());
        bundle1.putString("ArgDataTitle", applicationdeeplinkconfig.getStringData());
        bundle1.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Search.ordinal());
        fragment.setArguments(bundle1);
        handler.post(new Runnable() {

            final RootActivity this$0;
            final ProductFeedFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = productfeedfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L16:
        final ProductFeedFragment fragment = new ProductFeedFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("ArgDataValue", applicationdeeplinkconfig.getStringData());
        bundle2.putString("ArgDataTitle", applicationdeeplinkconfig.getStringData());
        bundle2.putBoolean("ArgCommerceOnly", true);
        bundle2.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Search.ordinal());
        fragment.setArguments(bundle2);
        handler.post(new Runnable() {

            final RootActivity this$0;
            final ProductFeedFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = productfeedfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L17:
        WishBrandFilter wishbrandfilter = (WishBrandFilter)applicationdeeplinkconfig.getSerializableData();
        if (wishbrandfilter != null)
        {
            final ProductFeedFragment fragment = new ProductFeedFragment();
            Bundle bundle7 = new Bundle();
            bundle7.putSerializable("ArgDataValue", wishbrandfilter);
            bundle7.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Brand.ordinal());
            fragment.setArguments(bundle7);
            handler.post(new Runnable() {

                final RootActivity this$0;
                final BaseContentFragment val$fragment;

                public void run()
                {
                    setContentFragment(fragment, false);
                }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
            });
        }
        continue; /* Loop/switch isn't completed */
_L18:
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.DataControlSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.Settings, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        final DataControlSettingsFragment fragment = new DataControlSettingsFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final DataControlSettingsFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
                closeMenus();
            }

            
            {
                this$0 = RootActivity.this;
                fragment = datacontrolsettingsfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L19:
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.PushNotificationSettingsSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.Settings, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        final PushNotificationSettingsFragment fragment = new PushNotificationSettingsFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final PushNotificationSettingsFragment val$fragment;

            public void run()
            {
                setContentFragment(fragment, false);
                closeMenus();
            }

            
            {
                this$0 = RootActivity.this;
                fragment = pushnotificationsettingsfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L20:
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RateAppSelect, com.contextlogic.wish.analytics.Analytics.PageViewType.Settings, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
        RateAppPrompt.markPromptShown();
        WishApplication.getAppInstance().goToMarketListing(this);
        continue; /* Loop/switch isn't completed */
_L21:
        final SignupUpdateProfileFragment fragment = new SignupUpdateProfileFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean(SignupUpdateProfileFragment.ARG_UPDATE_PROFILE_IS_SETTING, true);
        fragment.setArguments(bundle3);
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;

            public void run()
            {
                setModalContentFragment(fragment, true);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L22:
        final ListEditingTourFragment fragment = new ListEditingTourFragment();
        handler.post(new Runnable() {

            final RootActivity this$0;
            final BaseContentFragment val$fragment;

            public void run()
            {
                setModalContentFragment(fragment, true);
            }

            
            {
                this$0 = RootActivity.this;
                fragment = basecontentfragment;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L23:
        startUploadProfilePictureFlow(new ProfileImageUploadCallback() {

            final RootActivity this$0;

            public void onFailure(boolean flag)
            {
                if (!flag)
                {
                    showNoImageError();
                }
            }

            public void onSuccess(WishUser wishuser)
            {
                ProfileFragment profilefragment = new ProfileFragment();
                profilefragment.setForceRefresh(true);
                Bundle bundle9 = new Bundle();
                LoggedInUser.getInstance().refreshProfile();
                bundle9.putString("ArgUser", RuntimeStateStore.getInstance().storeState(wishuser, null));
                profilefragment.setArguments(bundle9);
                handler.post(profilefragment. new Runnable() {

                    final _cls24 this$1;
                    final ProfileFragment val$fragment;

                    public void run()
                    {
                        setContentFragment(fragment, true);
                        closeMenus();
                    }

            
            {
                this$1 = final__pcls24;
                fragment = ProfileFragment.this;
                super();
            }
                });
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L24:
        showFreeGiftSignupFlow(null);
        if (true) goto _L3; else goto _L25
_L25:
    }

    public Bitmap readImageUri(Uri uri, int i, int j)
    {
        uri = FileUtil.getPath(this, uri);
        if (uri == null)
        {
            return null;
        }
        try
        {
            uri = BitmapUtil.decodeBitmapFile(uri, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public void refreshBadgeCount()
    {
        refreshBadgeCount(UserStatusManager.getInstance().getUnviewedNotificationCount());
    }

    public void resetDeviceCollectorSession()
    {
        deviceCollectorSessionId = null;
        initializeDeviceCollector();
    }

    protected void resizeUi()
    {
        resizeUi(-1, false);
    }

    protected void resizeUi(int i, boolean flag)
    {
        constrainedHeight = i;
        currentOrientation = getResources().getConfiguration().orientation;
        displayWidth = getWindowManager().getDefaultDisplay().getWidth();
        (new android.widget.FrameLayout.LayoutParams(displayWidth, -2)).gravity = 80;
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(displayWidth, -1);
        layoutparams.gravity = 48;
        contentContainer.setLayoutParams(layoutparams);
        setLeftMenuWidth(getCurrentLeftMenuWidth());
        if (hasRightMenu())
        {
            setRightMenuWidth(getCurrentRightMenuWidth());
        }
        if (TabletUtil.isTablet(this))
        {
            int j = getWindowManager().getDefaultDisplay().getHeight();
            int l = getTabletModalWidth(this);
            int i1 = (j - l) / 2;
            j = l;
            int k = j;
            if (i > 0)
            {
                k = j;
                if (i1 + j > i)
                {
                    k = i - i1;
                }
            }
            android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(l, k);
            layoutparams1.gravity = 48;
            layoutparams1.topMargin = i1;
            layoutparams1.leftMargin = (displayWidth - l) / 2;
            modalContainer.setLayoutParams(layoutparams1);
            if (currentOrientation == 2)
            {
                android.widget.FrameLayout.LayoutParams layoutparams2 = (android.widget.FrameLayout.LayoutParams)contentContainer.getLayoutParams();
                if (layoutparams2 != null)
                {
                    if (hasRightMenu())
                    {
                        i = getWindowManager().getDefaultDisplay().getWidth() - getCurrentLeftMenuWidth() - getCurrentRightMenuWidth();
                    } else
                    {
                        i = getWindowManager().getDefaultDisplay().getWidth() - getCurrentLeftMenuWidth();
                    }
                    layoutparams2.width = i;
                    contentContainer.setLayoutParams(layoutparams2);
                }
                setContentContainerLeftOffset(getCurrentLeftMenuWidth());
            } else
            {
                android.widget.FrameLayout.LayoutParams layoutparams3 = (android.widget.FrameLayout.LayoutParams)contentContainer.getLayoutParams();
                if (layoutparams3 != null)
                {
                    layoutparams3.width = getWindowManager().getDefaultDisplay().getWidth();
                    contentContainer.setLayoutParams(layoutparams3);
                }
                setContentContainerLeftOffset(0);
            }
            if (flag)
            {
                if (currentMenuOrientation != currentOrientation)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                currentMenuOrientation = currentOrientation;
                if (i != 0)
                {
                    if (currentOrientation == 2)
                    {
                        rightShadow.setVisibility(0);
                        leftShadow.setVisibility(0);
                        drawerLayout.setDrawerLockMode(2);
                        drawerLayout.setScrimColor(getResources().getColor(0x7f0c00e4));
                        drawerLayout.setDrawerShadow(null, 0x800003);
                        drawerLayout.setDrawerShadow(null, 0x800005);
                        drawerLayout.lockTouches();
                    } else
                    {
                        rightShadow.setVisibility(8);
                        leftShadow.setVisibility(8);
                        drawerLayout.setDrawerLockMode(0);
                        drawerLayout.closeDrawers();
                        drawerLayout.setScrimColor(getResources().getColor(0x7f0c0089));
                        drawerLayout.setDrawerShadow(0x7f020038, 0x800003);
                        drawerLayout.setDrawerShadow(0x7f020039, 0x800005);
                        drawerLayout.unlockTouches();
                    }
                }
            }
        } else
        {
            rightShadow.setVisibility(8);
            leftShadow.setVisibility(8);
            currentMenuOrientation = currentOrientation;
            android.widget.FrameLayout.LayoutParams layoutparams4 = new android.widget.FrameLayout.LayoutParams(displayWidth, -1);
            layoutparams4.gravity = 48;
            modalContainer.setLayoutParams(layoutparams4);
        }
        drawerToggle.syncState();
    }

    public void setContentFragment(BaseContentFragment basecontentfragment, boolean flag)
    {
        endSearch();
        Object obj;
        Fragment fragment;
        try
        {
            getSupportFragmentManager().popBackStackImmediate("ModalFragment", 1);
        }
        catch (Throwable throwable) { }
        basecontentfragment.setRetainInstance(true);
        basecontentfragment.setIsRootFragment(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        FRAGMENT_ANIMATION_ENABLED = false;
        getSupportFragmentManager().popBackStackImmediate(null, 1);
        FRAGMENT_ANIMATION_ENABLED = true;
_L1:
        obj = getSupportFragmentManager().beginTransaction();
        if (!flag)
        {
            if (!drawerLayout.isDrawerOpen() || TabletUtil.isTablet(this) && currentOrientation == 2)
            {
                ((FragmentTransaction) (obj)).setCustomAnimations(0x7f04000b, 0x7f04000d, 0x7f04000a, 0x7f04000e);
            } else
            {
                ((FragmentTransaction) (obj)).setCustomAnimations(0, 0, 0x7f04000a, 0x7f04000e);
            }
        }
        fragment = getSupportFragmentManager().findFragmentByTag("ContentFragment");
        if (fragment != null)
        {
            ((FragmentTransaction) (obj)).hide(fragment);
        }
        ((FragmentTransaction) (obj)).add(0x7f0d0078, basecontentfragment, "ContentFragment");
        ((FragmentTransaction) (obj)).show(basecontentfragment);
        ((FragmentTransaction) (obj)).addToBackStack(null);
        try
        {
            ((FragmentTransaction) (obj)).commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BaseContentFragment basecontentfragment)
        {
            return;
        }
        obj;
        FRAGMENT_ANIMATION_ENABLED = true;
          goto _L1
        basecontentfragment;
        FRAGMENT_ANIMATION_ENABLED = true;
        throw basecontentfragment;
    }

    public void setLeftMenuFragment(Fragment fragment)
    {
        fragment.setRetainInstance(true);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(0x7f0d007e, fragment, "LeftMenuFragment");
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            return;
        }
    }

    public void setModalContentFragment(BaseContentFragment basecontentfragment, boolean flag)
    {
        setModalContentFragment(basecontentfragment, flag, false);
    }

    public void setModalContentFragment(BaseContentFragment basecontentfragment, boolean flag, boolean flag1)
    {
        String s;
        FragmentTransaction fragmenttransaction;
        basecontentfragment.setRetainInstance(true);
        basecontentfragment.setIsModal(true);
        basecontentfragment.setIsRootFragment(flag);
        endSearch();
        hideLeftMenuContent();
        hideRightMenuContent();
        fragmenttransaction = getSupportFragmentManager().beginTransaction();
        s = "ModalContentFragment";
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        s = "ModalFragment";
        FRAGMENT_ANIMATION_ENABLED = false;
        getSupportFragmentManager().popBackStackImmediate("ModalFragment", 1);
        Fragment fragment;
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
            fragmenttransaction.add(0x7f0d007c, basecontentfragment, "ModalFragment");
        } else
        {
            fragmenttransaction.add(0x7f0d0079, basecontentfragment, "ModalFragment");
        }
        fragmenttransaction.show(basecontentfragment);
        fragmenttransaction.addToBackStack(s);
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BaseContentFragment basecontentfragment)
        {
            return;
        }
        obj;
        FRAGMENT_ANIMATION_ENABLED = true;
        break MISSING_BLOCK_LABEL_67;
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

    public void setRightMenuFragment(Fragment fragment)
    {
        if (!hasRightMenu())
        {
            return;
        }
        rightMenuFragment = fragment;
        fragment.setRetainInstance(true);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(0x7f0d0081, fragment, "RightMenuFragment");
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            return;
        }
    }

    public void setTestingOutput(String s)
    {
        outputText.setText(s);
        outputText.invalidate();
    }

    public void setUploadMessage(ValueCallback valuecallback)
    {
        uploadMessage = valuecallback;
    }

    public void showCart(String s, String s1, String s2)
    {
        showCart(s, s1, s2, 0);
    }

    public void showCart(String s, String s1, String s2, int i)
    {
        if (cartManager != null)
        {
            cartManager.close();
        }
        cartManager = new CheckoutCartManager(this);
        if (s != null && s1 != null && i > 0)
        {
            cartManager.addToCart(s, s1, s2, i);
            return;
        } else
        {
            cartManager.showCart();
            return;
        }
    }

    public void showFreeGiftSignupFlow(com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
    {
        if (signupCartManager != null)
        {
            signupCartManager.close();
        }
        signupCartManager = new CheckoutSignupCartManager(this, wishsignupflow);
        handler.post(new Runnable() {

            final RootActivity this$0;

            public void run()
            {
                signupCartManager.showFreeGiftsView();
            }

            
            {
                this$0 = RootActivity.this;
                super();
            }
        });
    }

    public void showLeftMenu()
    {
        hideRightMenuContent();
        showLeftMenuContent();
    }

    public void showLoadingSpinner()
    {
        if (loadingSpinner != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        loadingSpinner = new ProgressDialog(this) {

            final RootActivity this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = RootActivity.this;
                super(context);
            }
        };
        loadingSpinner.requestWindowFeature(1);
        loadingSpinner.setMessage(getString(0x7f060285));
        loadingSpinner.setCancelable(false);
        loadingSpinner.show();
        return;
        Throwable throwable;
        throwable;
    }

    public void showOverlay(View view, boolean flag)
    {
        showOverlay(view, flag, true);
    }

    public void showOverlay(View view, boolean flag, boolean flag1)
    {
        clearOverlay();
        endSearch();
        if (TabletUtil.isTablet(this) && flag)
        {
            overlayMask.setBackgroundColor(getResources().getColor(0x7f0c006e));
            int i = getWindowManager().getDefaultDisplay().getHeight();
            int k = getTabletModalWidth(this);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k, k);
            layoutparams.gravity = 48;
            layoutparams.topMargin = (i - k) / 2;
            layoutparams.leftMargin = (displayWidth - k) / 2;
            overlayContainer.setLayoutParams(layoutparams);
        } else
        {
            overlayMask.setBackgroundColor(getResources().getColor(0x7f0c00e4));
            int j = 0;
            int l = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (l > 0)
            {
                j = getResources().getDimensionPixelSize(l);
            }
            android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutparams1.gravity = 48;
            layoutparams1.topMargin = j;
            overlayContainer.setLayoutParams(layoutparams1);
        }
        overlayContainer.addView(view);
        overlayContainer.setTag(Boolean.valueOf(flag1));
        overlayContainer.setVisibility(0);
        overlayMask.setVisibility(0);
        if (drawerLayout != null)
        {
            shouldDisableActions = true;
            supportInvalidateOptionsMenu();
        }
    }

    public void showRightMenu()
    {
        hideLeftMenuContent();
        showRightMenuContent();
    }

    public void showShareDialog(String s, String s1)
    {
        Intent intent;
        try
        {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        intent.putExtra("android.intent.extra.SUBJECT", s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        intent.putExtra("android.intent.extra.TEXT", s1);
        startActivity(Intent.createChooser(intent, getString(0x7f0603d0)));
        return;
    }

    public void startDeviceCollector()
    {
        if (deviceCollectorSessionId == null)
        {
            deviceCollectorSessionId = generateDeviceCollectorSession();
            if (deviceCollector != null)
            {
                deviceCollector.collect(deviceCollectorSessionId);
            }
        }
    }

    public void startUploadProfilePictureFlow(final ProfileImageUploadCallback callback)
    {
        setUploadMessage(new ValueCallback() {

            final RootActivity this$0;
            final ProfileImageUploadCallback val$callback;

            public void onReceiveValue(Uri uri)
            {
                uri = readImageUri(uri, 300, 300);
                if (uri == null)
                {
                    callback.onFailure(true);
                    return;
                }
                if (uploadProfileImageService == null)
                {
                    uploadProfileImageService = new UploadProfileImageService();
                }
                showLoadingSpinner();
                uploadProfileImageService.requestService(uri, new com.contextlogic.wish.api.service.UploadProfileImageService.SuccessCallback() {

                    final _cls34 this$1;

                    public void onServiceSucceeded(WishUser wishuser)
                    {
                        hideLoadingSpinner();
                        callback.onSuccess(wishuser);
                        deleteImageUri();
                    }

            
            {
                this$1 = _cls34.this;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                    final _cls34 this$1;

                    public void onServiceFailed()
                    {
                        hideLoadingSpinner();
                        callback.onFailure(false);
                        deleteImageUri();
                    }

            
            {
                this$1 = _cls34.this;
                super();
            }
                });
            }

            public volatile void onReceiveValue(Object obj)
            {
                onReceiveValue((Uri)obj);
            }

            
            {
                this$0 = RootActivity.this;
                callback = profileimageuploadcallback;
                super();
            }
        });
        openImageIntent();
    }

    public void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }

    static 
    {
        FRAGMENT_ANIMATION_ENABLED = true;
        DISABLE_PROMPTS = false;
        CACHED_CONTENT_PANE_WIDTH = -1;
        CACHED_TABLET_MODAL_WIDTH = -1;
    }




/*
    static boolean access$1002(RootActivity rootactivity, boolean flag)
    {
        rootactivity.shouldHideActions = flag;
        return flag;
    }

*/






/*
    static UploadProfileImageService access$1402(RootActivity rootactivity, UploadProfileImageService uploadprofileimageservice)
    {
        rootactivity.uploadProfileImageService = uploadprofileimageservice;
        return uploadprofileimageservice;
    }

*/










/*
    static int access$802(RootActivity rootactivity, int i)
    {
        rootactivity.constrainedHeight = i;
        return i;
    }

*/

}
