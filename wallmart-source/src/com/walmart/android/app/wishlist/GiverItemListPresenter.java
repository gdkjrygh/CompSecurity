// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.app.saver.SaverScannerActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            GiverItemsAdapter, SortFilterDialogFragment, WelcomeScreenDialogFragment, ItemAdapterCallback, 
//            ReceiptMatchPresenter

public class GiverItemListPresenter extends Presenter
    implements SortFilterDialogFragment.OnSortFilterOptionsSelectedListener
{

    private static final int REQUEST_SCANNER = 1;
    private final AppCompatActivity mActivity;
    private final GiverItemsAdapter mAdapter;
    private ProgressDialog mCurrentProgressDialog;
    private View mEmptyView;
    private String mFilter;
    private boolean mIntroHasBeenShown;
    private boolean mIsReloadingItems;
    private View mListHeaderView;
    private ListRecyclerView mListView;
    private String mOrder;
    private Request mRequestInFlight;
    private View mRootView;
    private String mSort;
    private final WishList mWishList;

    public GiverItemListPresenter(AppCompatActivity appcompatactivity, WishList wishlist)
    {
        mFilter = "all";
        mSort = "time";
        mOrder = "desc";
        mActivity = appcompatactivity;
        mWishList = wishlist;
        mAdapter = new GiverItemsAdapter(appcompatactivity);
        mIntroHasBeenShown = SharedPreferencesUtil.getWishListIntroShown(mActivity.getApplicationContext());
    }

    private CharSequence getString(int i)
    {
        return mActivity.getString(i);
    }

    private boolean isEmpty()
    {
        return mAdapter.getItemCount() == 0;
    }

    private boolean isFilterAllowAll(String s)
    {
        return s == null || "all".equals(s);
    }

    private void onError(Result result)
    {
        char c;
        if (result.hasError() && result.getError().connectionError())
        {
            c = '\001';
        } else
        {
            c = '\0';
        }
        result = mActivity;
        if (c != 0)
        {
            c = '\u0258';
        } else
        {
            c = '\u0384';
        }
        DialogFactory.showErrorDialog(result, c);
    }

    private void reloadItems()
    {
        reloadItems(mFilter, mSort, mOrder);
    }

    private void reloadItems(String s, String s1, String s2)
    {
        if (mRequestInFlight != null)
        {
            mRequestInFlight.cancel();
            mRequestInFlight = null;
        }
        setProgressVisible(true);
        mIsReloadingItems = true;
        mRequestInFlight = WishListManager.get().getItems(mWishList.id, s, s1, s2).addCallback(new CallbackSameThread(s2) {

            final GiverItemListPresenter this$0;
            final String val$filter;
            final String val$order;
            final String val$sort;

            public void onResultSameThread(Request request, Result result)
            {
                mRequestInFlight = null;
                mIsReloadingItems = false;
                setProgressVisible(false);
                if (result.successful() && result.hasData())
                {
                    mFilter = filter;
                    mSort = sort;
                    mOrder = order;
                    mAdapter.setItems((List)result.getData());
                    updateEmptyViewVisibility();
                    setupHeaders();
                    return;
                } else
                {
                    onError(result);
                    return;
                }
            }

            
            {
                this$0 = GiverItemListPresenter.this;
                filter = s;
                sort = s1;
                order = s2;
                super(final_context);
            }
        });
    }

    private void setProgressVisible(boolean flag)
    {
        if (flag && mCurrentProgressDialog == null)
        {
            mCurrentProgressDialog = CustomProgressDialog.create(mActivity);
            mCurrentProgressDialog.setMessage(getString(0x7f09064d));
            mCurrentProgressDialog.setIndeterminate(true);
            mCurrentProgressDialog.setCancelable(false);
            mCurrentProgressDialog.show();
        } else
        if (mCurrentProgressDialog != null)
        {
            mCurrentProgressDialog.dismiss();
            mCurrentProgressDialog = null;
            return;
        }
    }

    private void setupEmptyView()
    {
        mEmptyView = ViewUtil.findViewById(mRootView, 0x7f100635);
        ViewUtil.setVisibility(mEmptyView, 8, new int[] {
            0x7f100641
        });
    }

    private void setupHeaders()
    {
        View view;
        if (isEmpty())
        {
            view = mEmptyView.findViewById(0x7f10066f);
        } else
        {
            view = mListHeaderView;
        }
        ViewUtil.setVisibility(view, 8, new int[] {
            0x7f100669, 0x7f10066a
        });
        view.findViewById(0x7f10066a).setBackgroundResource(0x7f020347);
        ViewUtil.setText(0x7f100632, view, mWishList.name);
        ViewUtil.setTextHideIfEmpty(0x7f100631, view, Html.fromHtml(mActivity.getString(0x7f09063b, new Object[] {
            mWishList.getListOwners(mActivity)
        })));
    }

    private void setupListView()
    {
        mListView = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f100636);
        mListHeaderView = ViewUtil.inflate(mActivity, 0x7f0401eb);
        View view = ViewUtil.inflate(mActivity, 0x7f0401ec);
        ViewUtil.findViewById(view, 0x7f10066c).setOnClickListener(new OnSingleClickListener(this) {

            final GiverItemListPresenter this$0;

            public void onSingleClick(View view1)
            {
                startReceiptScanner();
            }

            
            {
                this$0 = GiverItemListPresenter.this;
                super(presenter);
            }
        });
        mListView.addHeaderView(mListHeaderView);
        mListView.addHeaderView(view);
        mListView.setAdapter(mAdapter);
    }

    private void showFilterSortDialog()
    {
        SortFilterDialogFragment sortfilterdialogfragment = SortFilterDialogFragment.newInstance(mFilter, mSort, mOrder);
        sortfilterdialogfragment.setOnSortFilterOptionsSelectedListener(this);
        sortfilterdialogfragment.show(mActivity.getSupportFragmentManager(), "sortFilterDialog");
    }

    private void showIntroScreenDialog()
    {
        WelcomeScreenDialogFragment.newInstance().show(mActivity.getSupportFragmentManager(), "IntroScreenDialog");
        mIntroHasBeenShown = true;
    }

    private void startReceiptScanner()
    {
        Intent intent = new Intent(mActivity, com/walmart/android/app/saver/SaverScannerActivity);
        intent.putExtra("mode", 1);
        intent.putExtra("EXTRA_ACTIVITY_RESULT_MODE", true);
        intent.putExtra("origin", "origin_list");
        mActivity.startActivityForResult(intent, 1);
    }

    private void updateEmptyViewVisibility()
    {
        boolean flag = false;
        boolean flag1 = isEmpty();
        Object obj = mEmptyView;
        int i;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = mListView;
        if (!flag1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ListRecyclerView) (obj)).setVisibility(i);
        if (isFilterAllowAll(mFilter))
        {
            ViewUtil.setText(0x7f100639, mEmptyView, 0x7f090674);
            ViewUtil.setText(0x7f10063a, mEmptyView, 0x7f090613);
            return;
        } else
        {
            ViewUtil.setText(0x7f100639, mEmptyView, 0x7f09061d);
            ViewUtil.setText(0x7f10063a, mEmptyView, 0x7f09061c);
            return;
        }
    }

    private void wireListeners()
    {
        mAdapter.setCallback(new ItemAdapterCallback(mActivity, this, mAdapter));
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09063c);
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean interceptBack()
    {
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
        return super.interceptBack();
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i == 1 && j == -1 && intent != null)
        {
            String s = intent.getStringExtra("receipt_id");
            String s1 = intent.getStringExtra("EXTRA_TC_NUMBER");
            intent = intent.getStringExtra("EXTRA_DATE");
            ReceiptMatchPresenter.UpdateListener updatelistener = new ReceiptMatchPresenter.UpdateListener() {

                final GiverItemListPresenter this$0;

                public void afterUpdate(boolean flag)
                {
                    if (!isPopped())
                    {
                        if (flag)
                        {
                            reloadItems();
                        } else
                        if (!mIsReloadingItems)
                        {
                            setProgressVisible(false);
                            return;
                        }
                    }
                }

                public void beforeUpdate()
                {
                    if (!isPopped())
                    {
                        setProgressVisible(true);
                    }
                }

                public void startReceiptScanner()
                {
                    GiverItemListPresenter.this.startReceiptScanner();
                }

            
            {
                this$0 = GiverItemListPresenter.this;
                super();
            }
            };
            pushPresenter(new ReceiptMatchPresenter(mActivity, mWishList, updatelistener, s1, intent, s));
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mRequestInFlight != null)
        {
            mRequestInFlight.cancel();
            mRequestInFlight = null;
        }
        mAdapter.setCallback(null);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        reloadItems();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        MenuItemCompat.setShowAsAction(menu.add(0, 0x7f100695, 0, 0x7f090062).setIcon(0x7f0202ee), 1);
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401e4);
            setupEmptyView();
            setupListView();
            setupHeaders();
            updateEmptyViewVisibility();
            wireListeners();
        }
    }

    public void onNewTop()
    {
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (menuitem.getItemId() == 0x7f100695)
        {
            showFilterSortDialog();
            return true;
        } else
        {
            return super.onOptionsMenuItemSelected(menuitem, activity);
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "gift giver").putString("section", "lists");
        MessageBus.getBus().post(builder);
    }

    public void onPushed()
    {
        super.onPushed();
        if (!mIntroHasBeenShown)
        {
            showIntroScreenDialog();
        }
    }

    public void onSortFilterOptionsSelected(String s, String s1, String s2)
    {
        reloadItems(s, s1, s2);
    }




/*
    static Request access$102(GiverItemListPresenter giveritemlistpresenter, Request request)
    {
        giveritemlistpresenter.mRequestInFlight = request;
        return request;
    }

*/




/*
    static boolean access$202(GiverItemListPresenter giveritemlistpresenter, boolean flag)
    {
        giveritemlistpresenter.mIsReloadingItems = flag;
        return flag;
    }

*/



/*
    static String access$402(GiverItemListPresenter giveritemlistpresenter, String s)
    {
        giveritemlistpresenter.mFilter = s;
        return s;
    }

*/


/*
    static String access$502(GiverItemListPresenter giveritemlistpresenter, String s)
    {
        giveritemlistpresenter.mSort = s;
        return s;
    }

*/


/*
    static String access$602(GiverItemListPresenter giveritemlistpresenter, String s)
    {
        giveritemlistpresenter.mOrder = s;
        return s;
    }

*/



}
