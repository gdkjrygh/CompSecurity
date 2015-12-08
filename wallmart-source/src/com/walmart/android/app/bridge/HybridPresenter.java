// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.navigationbar.Button;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController, Page, DrawerUpdateEvent

public class HybridPresenter extends Presenter
{
    public static interface FragmentCallback
    {

        public abstract boolean isResumed();
    }

    public static interface Listener
    {

        public abstract void onRestart();
    }


    public static final String BUTTON_ID_CANCEL = "cancel";
    private static final int DIALOG_PROGRESS_LOADING = 1;
    private static final long DIALOG_TIMEOUT = 200L;
    private static final String TAG = com/walmart/android/app/bridge/HybridPresenter.getSimpleName();
    private Activity mActivity;
    private BridgeController mBridgeController;
    private FragmentCallback mCallback;
    private String mCancelId;
    private MenuItem mCartMenuItem;
    private final Runnable mDialogHideTimeoutRunnable = new Runnable() {

        final HybridPresenter this$0;

        public void run()
        {
            if (mDialogIsShowing && (!mIsLoading || !mIsVisible))
            {
                dismissDialog(1);
            }
        }

            
            {
                this$0 = HybridPresenter.this;
                super();
            }
    };
    private boolean mDialogIsShowing;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mInitialCartIconVisible;
    private String mInitialTitle;
    private boolean mIsLoading;
    private boolean mIsVisible;
    private AuthenticationStatusEvent mLastAuthEvent;
    private Listener mListener;
    private Menu mMenu;
    private SparseArray mMenuItemIds;
    private boolean mPendingRestart;
    private View mRootView;
    private String mUrl;

    public HybridPresenter(Activity activity)
    {
        mActivity = activity;
        mMenuItemIds = new SparseArray();
        mBridgeController = new BridgeController();
        mLastAuthEvent = Services.get().getAuthentication().getLastAuthChangedEvent();
    }

    private boolean setMenuItemVisibility(MenuItem menuitem, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (menuitem != null)
        {
            flag1 = flag2;
            if (menuitem.isVisible() != flag)
            {
                WLog.d(TAG, (new StringBuilder()).append("setMenuItemVisibility ").append(menuitem.getTitle()).append(" : ").append(flag).toString());
                menuitem.setVisible(flag);
                flag1 = true;
            }
        }
        return flag1 && flag;
    }

    private void setTitle(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("setTitle(): ").append(s).toString());
        setTitleText(s);
        ((AppCompatActivity)mActivity).getSupportActionBar().setTitle(s);
    }

    private void updateButtons(Page page)
    {
        WLog.d(TAG, "updateButtons()");
        mCancelId = null;
        if (mMenuItemIds != null)
        {
            for (int i = 0; i < mMenuItemIds.size(); i++)
            {
                mMenu.removeItem(mMenuItemIds.keyAt(i));
            }

            mMenuItemIds.clear();
        }
        int j = 1;
        page = page.getButtons();
        if (page != null)
        {
            page = page.iterator();
            do
            {
                if (!page.hasNext())
                {
                    break;
                }
                Object obj = (Button)page.next();
                if (obj != null)
                {
                    WLog.d(TAG, (new StringBuilder()).append("Add button: ").append(((Button) (obj)).title).toString());
                    if ("cancel".equalsIgnoreCase(((Button) (obj)).id))
                    {
                        mCancelId = ((Button) (obj)).id;
                    } else
                    {
                        mMenuItemIds.put(j, ((Button) (obj)).id);
                        obj = mMenu.add(j, j, j, ((Button) (obj)).title);
                        ((MenuItem) (obj)).setShowAsAction(2);
                        ((MenuItem) (obj)).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                            final HybridPresenter this$0;

                            public boolean onMenuItemClick(MenuItem menuitem)
                            {
                                WLog.d(HybridPresenter.TAG, (new StringBuilder()).append(menuitem.getTitle()).append(" button clicked.").toString());
                                int k = menuitem.getItemId();
                                menuitem = (String)mMenuItemIds.get(k);
                                return mBridgeController.onButtonClicked(menuitem);
                            }

            
            {
                this$0 = HybridPresenter.this;
                super();
            }
                        });
                    }
                    j++;
                }
            } while (true);
        }
    }

    private void updateHeader(Page page, boolean flag)
    {
        if (!mIsVisible || !mCallback.isResumed()) goto _L2; else goto _L1
_L1:
        WLog.d(TAG, (new StringBuilder()).append("updateHeader(): Title = ").append(page.getTitle()).append(", isRoot = ").append(flag).toString());
        setTitle(page.getTitle());
        if (!flag || page.isModal()) goto _L4; else goto _L3
_L3:
        MessageBus.getBus().post(new DrawerUpdateEvent(true, true));
        if (mCartMenuItem != null)
        {
            setMenuItemVisibility(mCartMenuItem, true);
        }
_L6:
        updateButtons(page);
_L2:
        return;
_L4:
        if (page.isModal())
        {
            MessageBus.getBus().post(new DrawerUpdateEvent(false, 0x7f020160));
        } else
        {
            MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
        }
        if (mCartMenuItem != null)
        {
            setMenuItemVisibility(mCartMenuItem, false);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateProgressDialog()
    {
        if (mRootView == null) goto _L2; else goto _L1
_L1:
        mHandler.removeCallbacks(mDialogHideTimeoutRunnable);
        if (!mIsVisible)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (!mIsLoading) goto _L4; else goto _L3
_L3:
        showDialog(1);
_L2:
        return;
_L4:
        if (!mDialogIsShowing) goto _L2; else goto _L5
_L5:
        mHandler.postDelayed(mDialogHideTimeoutRunnable, 200L);
        return;
        dismissDialog(1);
        return;
    }

    private void updateVisibility(boolean flag)
    {
        mIsVisible = flag;
        updateProgressDialog();
        mBridgeController.setVisibility(flag);
    }

    public void dismissDialog(int i)
    {
        mDialogIsShowing = false;
        super.dismissDialog(i);
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean interceptBack()
    {
        WLog.d(TAG, "interceptBack()");
        boolean flag = false;
        if (mCancelId != null)
        {
            flag = mBridgeController.onButtonClicked(mCancelId);
        }
        boolean flag1 = flag;
        if (!flag)
        {
            flag1 = mBridgeController.goBack(false);
        }
        return flag1;
    }

    public void loadPage()
    {
        mBridgeController.init(mActivity, mInitialTitle, mUrl, new BridgeController.PresenterCallback() {

            final HybridPresenter this$0;

            public boolean isVisible()
            {
                return mIsVisible;
            }

            public void pageError(int i, String s, String s1)
            {
                if (mIsVisible && mCallback.isResumed())
                {
                    DialogFactory.createAlertDialog(mActivity.getString(0x7f0900a8), mActivity).show();
                    if (i != 1)
                    {
                        mActivity.onBackPressed();
                    }
                }
                if (i == 1)
                {
                    reload();
                    return;
                } else
                {
                    mPendingRestart = true;
                    return;
                }
            }

            public void pushPresenter(Presenter presenter)
            {
                HybridPresenter.this.pushPresenter(presenter);
            }

            public void updateHeader(Page page, boolean flag)
            {
                HybridPresenter.this.updateHeader(page, flag);
            }

            public void updateLoadingView(boolean flag)
            {
                mIsLoading = flag;
                updateProgressDialog();
            }

            
            {
                this$0 = HybridPresenter.this;
                super();
            }
        });
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        WLog.i(TAG, "onAuthStatusChanged()");
        if (mLastAuthEvent == null || !mLastAuthEvent.loggedIn || authenticationstatusevent.loggedIn) goto _L2; else goto _L1
_L1:
        WLog.i(TAG, "User signed out. Resetting flow");
        if (mIsVisible && mCallback.isResumed())
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HOME, null, false));
        }
        mBridgeController.reload();
_L4:
        mLastAuthEvent = authenticationstatusevent;
        return;
_L2:
        if (mLastAuthEvent != null && !mLastAuthEvent.loggedIn && authenticationstatusevent.loggedIn)
        {
            mBridgeController.onSignIn();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        updateVisibility(true);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i == 1)
        {
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setCancelable(false);
            progressdialog.setIndeterminate(true);
            progressdialog.setMessage(mActivity.getString(0x7f0901ce));
            return progressdialog;
        } else
        {
            return super.onCreateDialog(i);
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateMenu(menu, menuinflater);
        WLog.d(TAG, "onCreateMenu()");
        mMenu = menu;
        boolean flag;
        if (mCartMenuItem != null)
        {
            flag = mCartMenuItem.isVisible();
        } else
        {
            flag = mInitialCartIconVisible;
        }
        mCartMenuItem = menu.findItem(0x7f100690);
        setMenuItemVisibility(mCartMenuItem, flag);
        if (mInitialTitle != null)
        {
            setTitle(mInitialTitle);
            mInitialTitle = null;
        }
        return false;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        WLog.d(TAG, "onCreateView()");
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(viewgroup.getContext(), 0x7f040021, viewgroup);
            mBridgeController.initUi(mRootView);
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        updateVisibility(false);
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        boolean flag = false;
        WLog.d(TAG, "onOptionsMenuItemSelected!");
        if (mCancelId != null)
        {
            flag = mBridgeController.onButtonClicked(mCancelId);
        }
        boolean flag1 = flag;
        if (!flag)
        {
            flag1 = mBridgeController.goBack(false, false, true);
        }
        return flag1;
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        mBridgeController.onPause();
    }

    public void onPop()
    {
        super.onPop();
        updateVisibility(false);
    }

    public void onPushed()
    {
        super.onPushed();
        updateVisibility(true);
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mBridgeController.onResume();
        if (mPendingRestart)
        {
            mPendingRestart = false;
            mListener.onRestart();
        }
        updateVisibility(true);
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        updateVisibility(false);
    }

    public void reload()
    {
        mBridgeController.reload();
    }

    public void setCallback(FragmentCallback fragmentcallback)
    {
        mCallback = fragmentcallback;
    }

    public void setInitialActionbarState(String s, boolean flag, boolean flag1)
    {
        mInitialTitle = s;
        mInitialCartIconVisible = flag1;
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

    public void setUrl(String s)
    {
        mUrl = s;
    }

    public void showDialog(int i)
    {
        mDialogIsShowing = true;
        super.showDialog(i);
    }






/*
    static boolean access$102(HybridPresenter hybridpresenter, boolean flag)
    {
        hybridpresenter.mIsLoading = flag;
        return flag;
    }

*/







/*
    static boolean access$602(HybridPresenter hybridpresenter, boolean flag)
    {
        hybridpresenter.mPendingRestart = flag;
        return flag;
    }

*/



}
