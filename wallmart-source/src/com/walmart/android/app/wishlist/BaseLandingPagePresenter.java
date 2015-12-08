// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.CreateWishList;
import com.walmart.android.service.wishlist.ListTransferCompleteEvent;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            WishListUtils

public abstract class BaseLandingPagePresenter extends Presenter
{

    private static final int REQUEST_CODE_SIGN_IN = 0;
    private static final String TAG = com/walmart/android/app/wishlist/BaseLandingPagePresenter.getSimpleName();
    protected final AppCompatActivity mActivity;
    private FloatLabel mCreateListLabel;
    protected boolean mIsLoggedIn;
    protected TextView mListTitle;
    protected View mListsCard;
    private LinearLayout mListsContainer;
    private CancelableCallback mLoadListsCallback;
    protected View mLoadingListsView;
    protected EditText mNewListNameView;
    protected View mProgressView;
    protected View mRootView;
    protected TextView mSignInView;
    protected ArrayList mWishLists;

    public BaseLandingPagePresenter(AppCompatActivity appcompatactivity)
    {
        mWishLists = new ArrayList();
        mActivity = appcompatactivity;
        appcompatactivity = Services.get().getAuthentication().getLastAuthChangedEvent();
        boolean flag;
        if (((AuthenticationStatusEvent) (appcompatactivity)).loggedIn && ((AuthenticationStatusEvent) (appcompatactivity)).hasCredentials)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsLoggedIn = flag;
    }

    private void cancelLoadListsCallback()
    {
        if (mLoadListsCallback != null)
        {
            mLoadListsCallback.cancel();
            mLoadListsCallback = null;
        }
    }

    private void cleanupUserEntry()
    {
        mNewListNameView.setText("");
        mCreateListLabel.clearError();
    }

    private void fillListsContainer(List list)
    {
        setLoadingList(false);
        mListsContainer.removeAllViews();
        ViewGroup viewgroup;
        for (list = list.iterator(); list.hasNext(); mListsContainer.addView(viewgroup, new android.widget.LinearLayout.LayoutParams(-1, -2)))
        {
            WishList wishlist = (WishList)list.next();
            viewgroup = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f0401f4, mListsContainer);
            ViewUtil.setText(0x7f100686, viewgroup, wishlist.name);
            viewgroup.setOnClickListener(new OnSingleClickListener(wishlist) {

                final BaseLandingPagePresenter this$0;
                final WishList val$list;

                public void onSingleClick(View view)
                {
                    handleListSelectedAction(list.id);
                    view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("existingListTap")).putString("tapLocation", getPageName());
                    MessageBus.getBus().post(view);
                }

            
            {
                this$0 = BaseLandingPagePresenter.this;
                list = wishlist;
                super(final_presenter);
            }
            });
        }

    }

    private boolean listAlreadyExist(String s)
    {
        for (Iterator iterator = mWishLists.iterator(); iterator.hasNext();)
        {
            if (s.equals(((WishList)iterator.next()).name))
            {
                return true;
            }
        }

        return false;
    }

    private void onDataLoaded(List list)
    {
        WLog.d(TAG, (new StringBuilder()).append("onDataLoaded() list:").append(list).toString());
        if (list == null || list.size() <= 0)
        {
            mListsCard.setVisibility(8);
        } else
        {
            mListsCard.setVisibility(0);
        }
        fillListsContainer(list);
    }

    private void setLoadingList(boolean flag)
    {
        byte byte0 = 8;
        Object obj = mLoadingListsView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = mListsContainer;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        if (flag)
        {
            mListsCard.setVisibility(0);
        }
    }

    private void wireListeners()
    {
        ViewUtil.findViewById(mRootView, 0x7f10061b).setOnClickListener(new OnSingleClickListener(this) {

            final BaseLandingPagePresenter this$0;

            public void onSingleClick(View view)
            {
                view = mNewListNameView.getText().toString().trim();
                if (!TextUtils.isEmpty(view))
                {
                    if (!listAlreadyExist(view))
                    {
                        cleanupUserEntry();
                        ViewUtil.hideKeyboard(mRootView);
                        mProgressView.setVisibility(0);
                        handleCreateListAction(view);
                        view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("createNewListTap")).putString("tapLocation", getPageName());
                        MessageBus.getBus().post(view);
                        return;
                    } else
                    {
                        mCreateListLabel.setError(0x7f090673);
                        return;
                    }
                } else
                {
                    mCreateListLabel.setError(0x7f090655);
                    return;
                }
            }

            
            {
                this$0 = BaseLandingPagePresenter.this;
                super(presenter);
            }
        });
        mSignInView.setOnClickListener(new OnSingleClickListener(this) {

            final BaseLandingPagePresenter this$0;

            public void onSingleClick(View view)
            {
                WishListUtils.launchSignInActivity(mActivity, 0);
            }

            
            {
                this$0 = BaseLandingPagePresenter.this;
                super(presenter);
            }
        });
    }

    protected void createList(String s, CallbackSameThread callbacksamethread)
    {
        Authentication authentication = Services.get().getAuthentication();
        if (mIsLoggedIn && !TextUtils.isEmpty(authentication.getFirstName()) && !TextUtils.isEmpty(authentication.getLastName()))
        {
            s = new CreateWishList(s, "public");
            s.setRegistrant(authentication.getFirstName(), authentication.getLastName());
        } else
        {
            s = new CreateWishList(s, "private");
        }
        WishListManager.get().createList(s, callbacksamethread);
    }

    protected abstract String getPageName();

    public String getTitleText()
    {
        return mActivity.getString(0x7f090648);
    }

    public View getView()
    {
        return mRootView;
    }

    protected abstract void handleCreateListAction(String s);

    protected abstract void handleListSelectedAction(String s);

    public boolean interceptBack()
    {
        WLog.d(TAG, "interceptBack()");
        return super.interceptBack();
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        WLog.d(TAG, "onActivityResultAsTop()");
        if (i == 0)
        {
            if (j == 1)
            {
                reloadData();
            }
            return;
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    public void onAfterPop()
    {
        WLog.d(TAG, "onAfterPop()");
        super.onAfterPop();
        cancelLoadListsCallback();
        MessageBus.getBus().unregister(this);
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onAuthenticationStatusEvent() event: ").append(authenticationstatusevent).toString());
        byte byte0;
        boolean flag;
        if (authenticationstatusevent.loggedIn)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        mSignInView.setVisibility(byte0);
        if (authenticationstatusevent.loggedIn && authenticationstatusevent.hasCredentials)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mIsLoggedIn ^ flag)
        {
            mIsLoggedIn = flag;
            setLoadingList(true);
            if (!flag)
            {
                reloadData();
            }
        }
    }

    public void onBeforePoppedTo()
    {
        WLog.d(TAG, "onBeforePoppedTo()");
        super.onBeforePoppedTo();
    }

    public void onBeforePush()
    {
        WLog.d(TAG, "onBeforePush()");
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401e8);
            mListsCard = ViewUtil.findViewById(mRootView, 0x7f100643);
            mListTitle = (TextView)ViewUtil.findViewById(mRootView, 0x7f100644);
            mLoadingListsView = ViewUtil.findViewById(mRootView, 0x7f100683);
            mListsContainer = (LinearLayout)ViewUtil.findViewById(mRootView, 0x7f100645);
            mNewListNameView = (EditText)ViewUtil.findViewById(mRootView, 0x7f10061c);
            mNewListNameView.setFilters(WishListUtils.getWishListNameInputFilters());
            mCreateListLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10061a);
            mCreateListLabel.attach(mNewListNameView);
            mProgressView = ViewUtil.findViewById(mRootView, 0x7f100646);
            mSignInView = (TextView)ViewUtil.findViewById(mRootView, 0x7f100641);
            mSignInView.setText(Html.fromHtml(mActivity.getString(0x7f090670)));
            wireListeners();
        }
    }

    public void onListTransferCompleteEvent(ListTransferCompleteEvent listtransfercompleteevent)
    {
        WLog.d(TAG, "onListTransferCompleteEvent()");
        reloadData();
    }

    public void onNewTop()
    {
        WLog.d(TAG, "onNewTop()");
        super.onNewTop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", getPageName()).putString("section", "lists");
        MessageBus.getBus().post(builder);
    }

    public void onPauseAsTop()
    {
        WLog.d(TAG, "onPauseAsTop()");
        super.onPauseAsTop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public void onPop()
    {
        WLog.d(TAG, "onPop()");
        super.onPop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public void onPushed()
    {
        WLog.d(TAG, "onPushed()");
        super.onPushed();
    }

    public void onRestartAsTop()
    {
        WLog.d(TAG, "onRestartAsTop()");
        super.onRestartAsTop();
    }

    public void onResumeAsTop()
    {
        WLog.d(TAG, "onResumeAsTop()");
        super.onResumeAsTop();
        cleanupUserEntry();
        if (mLoadListsCallback == null)
        {
            reloadData();
        }
    }

    public void onStartAsTop()
    {
        WLog.d(TAG, "onStartAsTop()");
        super.onStartAsTop();
    }

    public void onStopAsTop()
    {
        WLog.d(TAG, "onStopAsTop()");
        super.onStopAsTop();
        cancelLoadListsCallback();
    }

    public void reloadData()
    {
        WLog.d(TAG, "reloadData()");
        cancelLoadListsCallback();
        mLoadListsCallback = new CancelableCallback(mActivity) {

            final BaseLandingPagePresenter this$0;

            public void onCancel()
            {
                mLoadListsCallback = null;
                mWishLists.clear();
                onDataLoaded(mWishLists);
            }

            public void onResult(Result result)
            {
                mLoadListsCallback = null;
                mWishLists.clear();
                if (result.successful() && result.hasData())
                {
                    if (((WishListResults)result.getData()).searchResults != null)
                    {
                        mWishLists.addAll(Arrays.asList(((WishListResults)result.getData()).searchResults));
                    }
                } else
                {
                    DialogFactory.showDialog(900, mActivity);
                }
                onDataLoaded(mWishLists);
            }

            
            {
                this$0 = BaseLandingPagePresenter.this;
                super(context);
            }
        };
        WishListManager.get().getListsForCurrentUser(mLoadListsCallback);
        setLoadingList(true);
    }






/*
    static CancelableCallback access$302(BaseLandingPagePresenter baselandingpagepresenter, CancelableCallback cancelablecallback)
    {
        baselandingpagepresenter.mLoadListsCallback = cancelablecallback;
        return cancelablecallback;
    }

*/

}
