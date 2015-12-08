// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.text.Html;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.BarcodeActionController;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.ListTransferCompleteEvent;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmui.WalmartShareActionProvider;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            CreatorItemsAdapter, SortFilterDialogFragment, SettingsPresenter, ItemAdapterCallback, 
//            SwipeController, WishListUtils

public class ListCreatorPresenter extends Presenter
    implements SortFilterDialogFragment.OnSortFilterOptionsSelectedListener
{
    private class ListsAdapter extends BaseAdapter
    {

        private final Context mContext;
        private List mModel;
        final ListCreatorPresenter this$0;

        public int getCount()
        {
            return mModel.size();
        }

        public View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            view = LayoutInflater.from(mContext).inflate(0x7f0401ee, viewgroup, false);
            ViewUtil.setText(0x7f10004f, view, ((WishList)mModel.get(i)).name);
            return view;
        }

        public Object getItem(int i)
        {
            return mModel.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = LayoutInflater.from(mContext).inflate(0x7f0401ed, viewgroup, false);
            ViewUtil.setText(0x7f10004f, view, ((WishList)mModel.get(i)).name);
            return view;
        }

        public int indexOf(String s)
        {
            if (s != null)
            {
                int j = mModel.size();
                for (int i = 0; i < j; i++)
                {
                    if (s.equals(((WishList)mModel.get(i)).id))
                    {
                        return i;
                    }
                }

            }
            return -1;
        }

        public void setModel(List list)
        {
            mModel.clear();
            if (list != null)
            {
                mModel.addAll(list);
            }
            notifyDataSetChanged();
        }

        void updateList(WishList wishlist)
        {
            int j = mModel.size();
            int i = 0;
            do
            {
label0:
                {
                    if (i < j)
                    {
                        if (!wishlist.id.equals(((WishList)mModel.get(i)).id))
                        {
                            break label0;
                        }
                        mModel.set(i, wishlist);
                        notifyDataSetChanged();
                    }
                    return;
                }
                i++;
            } while (true);
        }

        private ListsAdapter(Context context)
        {
            this$0 = ListCreatorPresenter.this;
            super();
            mModel = new ArrayList();
            mContext = context;
        }

    }


    private static final int DIALOG_PROGRESS_LOADING_ITEMS = 1;
    private static final int REQUEST_CODE_SIGN_IN = 1;
    private static final int REQUEST_CODE_SIGN_IN_SETTINGS = 2;
    private static final String TAG = com/walmart/android/app/wishlist/ListCreatorPresenter.getSimpleName();
    private final AppCompatActivity mActivity;
    private final CreatorItemsAdapter mAdapter;
    private String mCurrentListId;
    private WishList mCurrentWishList;
    private List mDropdownWishLists;
    private TextView mEmptyInfoText;
    private TextView mEmptyInfoTitle;
    private View mEmptyView;
    private String mFilter;
    private boolean mHasReceivedDropDownSelection;
    private ListRecyclerView mListView;
    private View mListViewHeader;
    private View mListViewSignIn;
    private AppCompatSpinner mListsSpinner;
    private CancelableCallback mLoadCurrentListCallback;
    private CancelableCallback mLoadItemsCallback;
    private CancelableCallback mLoadListsCallback;
    private String mOrder;
    private View mRootView;
    private String mSort;
    private boolean mVisible;
    private ListsAdapter mWishlistsAdapter;

    public ListCreatorPresenter(AppCompatActivity appcompatactivity, String s, List list)
    {
        mCurrentWishList = new WishList();
        mOrder = "desc";
        mFilter = "all";
        mSort = "time";
        mActivity = appcompatactivity;
        mCurrentListId = s;
        mWishlistsAdapter = new ListsAdapter(mActivity);
        if (list != null)
        {
            mDropdownWishLists = list;
            mWishlistsAdapter.setModel(list);
        }
        mAdapter = new CreatorItemsAdapter(mActivity);
        mAdapter.registerAdapterDataObserver(new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

            final ListCreatorPresenter this$0;

            public void onChanged()
            {
                updateEmptyViewVisibility();
            }

            public void onItemRangeRemoved(int i, int j)
            {
                updateEmptyViewVisibility();
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super();
            }
        });
    }

    private void cancelActiveCallbacks()
    {
        cancelLoadCurrentList();
        cancelLoadLists();
        cancelLoadItems();
    }

    private void cancelLoadCurrentList()
    {
        if (mLoadCurrentListCallback != null)
        {
            mLoadCurrentListCallback.cancel();
            mLoadCurrentListCallback = null;
        }
    }

    private void cancelLoadItems()
    {
        if (mLoadItemsCallback != null)
        {
            mLoadItemsCallback.cancel();
            mLoadItemsCallback = null;
        }
    }

    private void cancelLoadLists()
    {
        if (mLoadListsCallback != null)
        {
            mLoadListsCallback.cancel();
            mLoadListsCallback = null;
        }
    }

    private void enableDropdownList(boolean flag)
    {
        boolean flag1 = true;
        if (flag)
        {
            getActionBar().setDisplayShowTitleEnabled(false);
            getActionBar().setDisplayShowCustomEnabled(true);
            getActionBar().setCustomView(mListsSpinner);
            int i = mWishlistsAdapter.indexOf(mCurrentListId);
            if (i > 0)
            {
                if (mListsSpinner.getSelectedItemPosition() == i)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                mHasReceivedDropDownSelection = flag;
                mListsSpinner.setSelection(i);
            }
            return;
        } else
        {
            getActionBar().setDisplayShowCustomEnabled(false);
            getActionBar().setDisplayShowTitleEnabled(true);
            return;
        }
    }

    private ActionBar getActionBar()
    {
        return mActivity.getSupportActionBar();
    }

    private CharSequence getString(int i)
    {
        return mActivity.getString(i);
    }

    private void gotoTaxonomy()
    {
        com.walmart.android.config.FragmentConfig.FragmentName fragmentname = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
        Bundle bundle = new Bundle();
        bundle.putString("start_mode", "root");
        MessageBus.getBus().post(new SwitchFragmentEvent(fragmentname, bundle));
    }

    private void invalidateOptionsMenu()
    {
        if (isVisible())
        {
            mActivity.supportInvalidateOptionsMenu();
        }
    }

    private boolean isFilterAllowAll(String s)
    {
        return s == null || "all".equals(s);
    }

    private boolean isLoggedIn()
    {
        return Services.get().getAuthentication().hasCredentials();
    }

    private boolean isVisible()
    {
        WLog.d(TAG, (new StringBuilder()).append("isVisible() : ").append(mVisible).append("activity.isFinishing(): ").append(mActivity.isFinishing()).toString());
        return mVisible && !mActivity.isFinishing();
    }

    private void postPageViewEvent(WishList wishlist)
    {
        Bus bus = MessageBus.getBus();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "list").putString("section", "lists");
        if (wishlist.isPublic())
        {
            wishlist = "public";
        } else
        {
            wishlist = "private";
        }
        bus.post(builder.putString("privacySetting", wishlist));
    }

    private void reloadAvailableLists()
    {
        WLog.d(TAG, "reloadAvailableLists()");
        cancelLoadLists();
        mLoadListsCallback = new CancelableCallback(mActivity) {

            final ListCreatorPresenter this$0;

            protected void onCancel()
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadAvailableLists().onCancel");
                mLoadListsCallback = null;
            }

            public void onResult(Result result)
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadAvailableLists().onResult");
                mLoadListsCallback = null;
                if (result.successful() && result.hasData() && ((WishListResults)result.getData()).searchResults != null)
                {
                    mDropdownWishLists = Arrays.asList(((WishListResults)result.getData()).searchResults);
                    mWishlistsAdapter.setModel(mDropdownWishLists);
                    if (isVisible())
                    {
                        enableDropdownList(true);
                    }
                }
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(context);
            }
        };
        WishListManager.get().getListsForCurrentUser(mLoadListsCallback);
    }

    private void reloadCurrentWishList()
    {
        WLog.d(TAG, "reloadCurrentWishList()");
        if (isVisible())
        {
            showDialog(1);
        }
        cancelLoadCurrentList();
        mLoadCurrentListCallback = new CancelableCallback(mActivity) {

            final ListCreatorPresenter this$0;

            protected void onCancel()
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadCurrentWishList().onCancel");
                mLoadCurrentListCallback = null;
                dismissDialog(1);
            }

            public void onResult(Result result)
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadCurrentWishList().onResult");
                mLoadCurrentListCallback = null;
                if (result.successful() && result.hasData() && mCurrentListId.equals(((WishList)result.getData()).id))
                {
                    mCurrentWishList = (WishList)result.getData();
                    postPageViewEvent(mCurrentWishList);
                    updateHeaders();
                    reloadItemsForCurrentList(mFilter, mSort, mOrder);
                    invalidateOptionsMenu();
                    return;
                }
                if (isVisible())
                {
                    result = DialogFactory.onCreateDialog(900, mActivity);
                    result.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                        final _cls8 this$1;

                        public void onDismiss(DialogInterface dialoginterface)
                        {
                            mActivity.finish();
                        }

            
            {
                this$1 = _cls8.this;
                super();
            }
                    });
                    result.show();
                }
                dismissDialog(1);
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(context);
            }
        };
        WishListManager.get().getWishList(mCurrentListId, mLoadCurrentListCallback);
    }

    private void reloadItemsForCurrentList(String s, String s1, String s2)
    {
        WLog.d(TAG, "reloadItemsForCurrentList()");
        if (isVisible())
        {
            showDialog(1);
        }
        cancelLoadItems();
        mLoadItemsCallback = new CancelableCallback(s2) {

            final ListCreatorPresenter this$0;
            final String val$filter;
            final String val$order;
            final String val$sort;

            protected void onCancel()
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadItemsForCurrentList().onCancel");
                mLoadItemsCallback = null;
                dismissDialog(1);
            }

            public void onResult(Result result)
            {
                WLog.d(ListCreatorPresenter.TAG, "reloadItemsForCurrentList().onResult");
                mLoadItemsCallback = null;
                dismissDialog(1);
                if (result.successful() && result.hasData())
                {
                    mFilter = filter;
                    mSort = sort;
                    mOrder = order;
                    result = (List)result.getData();
                    mAdapter.setItems(result);
                    updateHeaders();
                } else
                if (isVisible())
                {
                    DialogFactory.showDialog(900, mActivity);
                    return;
                }
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                filter = s;
                sort = s1;
                order = s2;
                super(final_context);
            }
        };
        WishListManager.get().getItems(mCurrentListId, s, s1, s2, mLoadItemsCallback);
    }

    private void setCurrentListId(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("setCurrentListId() id=").append(s).toString());
        if (mCurrentListId == null || !mCurrentListId.equals(s))
        {
            mFilter = "all";
            mCurrentListId = s;
            reloadCurrentWishList();
        }
    }

    private void setupEmptyView()
    {
        mEmptyView = ViewUtil.findViewById(mRootView, 0x7f100635);
        mEmptyInfoTitle = (TextView)ViewUtil.findViewById(mEmptyView, 0x7f100639);
        mEmptyInfoText = (TextView)ViewUtil.findViewById(mEmptyView, 0x7f10063a);
    }

    private void setupListView()
    {
        mListView = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f100636);
        mListViewHeader = ViewUtil.inflate(mActivity, 0x7f0401eb);
        mListView.addHeaderView(mListViewHeader);
        mListViewSignIn = ViewUtil.inflate(mActivity, 0x7f0401f7);
        mListView.addHeaderView(mListViewSignIn);
        mListView.setAdapter(mAdapter);
    }

    private void setupShareAction(Menu menu)
    {
        MenuItem menuitem = menu.findItem(0x7f100692);
        if (isLoggedIn())
        {
            menu = mActivity.getString(0x7f09066f, new Object[] {
                mCurrentWishList.id
            });
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", menu);
            Object obj;
            if (mCurrentWishList.hasRegistrant())
            {
                menu = mCurrentWishList.registrant.firstName;
                obj = mCurrentWishList.registrant.lastName;
            } else
            {
                obj = Services.get().getAuthentication();
                menu = ((Authentication) (obj)).getFirstName();
                obj = ((Authentication) (obj)).getLastName();
            }
            intent.putExtra("android.intent.extra.SUBJECT", mActivity.getString(0x7f09066e, new Object[] {
                menu, obj
            }));
            intent.putExtra("walmart_extra_share_flag", true);
            ((WalmartShareActionProvider)MenuItemCompat.getActionProvider(menuitem)).setShareIntent(intent);
            menuitem.setVisible(true);
            return;
        } else
        {
            menuitem.setVisible(false);
            return;
        }
    }

    private void setupToolBar()
    {
        getActionBar().setTitle(mActivity.getString(0x7f090648));
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        mListsSpinner = new AppCompatSpinner(new ContextThemeWrapper(mActivity, 0x7f0b01db));
        mListsSpinner.setAdapter(mWishlistsAdapter);
        mListsSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ListCreatorPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (WishList)mWishlistsAdapter.getItem(i);
                if (mHasReceivedDropDownSelection)
                {
                    setCurrentListId(((WishList) (adapterview)).id);
                }
                mHasReceivedDropDownSelection = true;
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super();
            }
        });
        enableDropdownList(true);
    }

    private void showFilterSortDialog()
    {
        SortFilterDialogFragment sortfilterdialogfragment = SortFilterDialogFragment.newInstance(mFilter, mSort, mOrder);
        sortfilterdialogfragment.setOnSortFilterOptionsSelectedListener(this);
        sortfilterdialogfragment.show(mActivity.getSupportFragmentManager(), "sortFilterDialog");
    }

    private void startEditListSettings()
    {
        pushPresenter(new SettingsPresenter(mActivity, mCurrentWishList, new SettingsPresenter.OnListUpdatedCallback() {

            final ListCreatorPresenter this$0;

            public void onListUpdated(WishList wishlist)
            {
                mCurrentWishList = wishlist;
                mWishlistsAdapter.updateList(wishlist);
                updateHeaders();
                invalidateOptionsMenu();
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super();
            }
        }), true);
    }

    private void startScanner()
    {
        (new BarcodeActionController(mActivity)).startScanner(false);
    }

    private void updateEmptyViewVisibility()
    {
        boolean flag = false;
        Object obj;
        int i;
        int j;
        if (mAdapter.getItemCount() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = mEmptyView;
        if (i != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj)).setVisibility(j);
        obj = mListView;
        if (i == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ListRecyclerView) (obj)).setVisibility(i);
        if (isFilterAllowAll(mFilter))
        {
            mEmptyInfoTitle.setText(0x7f09061b);
            mEmptyInfoText.setText(0x7f090610);
            return;
        } else
        {
            mEmptyInfoTitle.setText(0x7f09061d);
            mEmptyInfoText.setText(0x7f09061c);
            return;
        }
    }

    private void updateHeaders()
    {
        View view;
        Object obj;
        int i;
        if (mAdapter.getItemCount() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            view = ViewUtil.findViewById(mEmptyView, 0x7f10066f);
        } else
        {
            view = mListViewHeader;
        }
        if (i != 0)
        {
            obj = ViewUtil.findViewById(mEmptyView, 0x7f100108);
        } else
        {
            obj = mListViewSignIn;
        }
        ViewUtil.findViewById(((View) (obj)), 0x7f100108).setOnClickListener(new OnSingleClickListener(this) {

            final ListCreatorPresenter this$0;

            public void onSingleClick(View view1)
            {
                WishListUtils.launchSignInActivity(mActivity, 1);
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(presenter);
            }
        });
        if (isLoggedIn())
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        ViewUtil.setText(0x7f100108, ((View) (obj)), Html.fromHtml(mActivity.getString(0x7f090671)));
        ViewUtil.setText(0x7f100632, view, mCurrentWishList.name);
        obj = (TextView)ViewUtil.findViewById(view, 0x7f100631);
        if (TextUtils.isEmpty(mCurrentWishList.getListOwners(mActivity)) || !mCurrentWishList.isPublic())
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(Html.fromHtml(mActivity.getString(0x7f09063b, new Object[] {
                mCurrentWishList.getListOwners(mActivity)
            })));
        }
        obj = (TextView)ViewUtil.findViewById(view, 0x7f10066b);
        ((TextView) (obj)).setText(mCurrentWishList.access);
        if (mCurrentWishList.isPublic())
        {
            i = 0x7f02017c;
        } else
        {
            i = 0x7f02017b;
        }
        ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(mActivity.getResources().getDrawable(i), null, null, null);
        ViewUtil.findViewById(view, 0x7f100669).setOnClickListener(new OnSingleClickListener(this) {

            final ListCreatorPresenter this$0;

            public void onSingleClick(View view1)
            {
                if (isLoggedIn())
                {
                    startEditListSettings();
                } else
                {
                    WishListUtils.launchSignInActivity(mActivity, 2);
                }
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("editListTap"));
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(presenter);
            }
        });
    }

    private void wireListeners()
    {
        mAdapter.setCallback(new ItemAdapterCallback(mActivity, this, mAdapter));
        TextView textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f1002dd);
        textview.setText(0x7f090667);
        textview.setOnClickListener(new OnSingleClickListener(this) {

            final ListCreatorPresenter this$0;

            public void onSingleClick(View view)
            {
                startScanner();
                view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listScanBrowse")).putString("actionTapped", "scan");
                MessageBus.getBus().post(view);
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(presenter);
            }
        });
        textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f1002de);
        textview.setText(0x7f090611);
        textview.setOnClickListener(new OnSingleClickListener(this) {

            final ListCreatorPresenter this$0;

            public void onSingleClick(View view)
            {
                gotoTaxonomy();
                view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listScanBrowse")).putString("actionTapped", "browse");
                MessageBus.getBus().post(view);
            }

            
            {
                this$0 = ListCreatorPresenter.this;
                super(presenter);
            }
        });
    }

    public View getView()
    {
        return mRootView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
label0:
        {
label1:
            {
                WLog.d(TAG, "onActivityResultAsTop()");
                if (i != 1 && i != 2)
                {
                    break label0;
                }
                if (j == 1)
                {
                    if (i != 2)
                    {
                        break label1;
                    }
                    startEditListSettings();
                }
                return;
            }
            updateHeaders();
            return;
        }
        super.onActivityResultAsTop(i, j, intent);
    }

    public void onAfterPop()
    {
        WLog.d(TAG, "onAfterPop()");
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
        mAdapter.flushPendingDeletions();
    }

    public void onBeforePoppedTo()
    {
        WLog.d(TAG, "onBeforePoppedTo()");
        super.onBeforePoppedTo();
        mVisible = true;
        enableDropdownList(true);
    }

    public void onBeforePush()
    {
        WLog.d(TAG, "onBeforePush()");
        super.onBeforePush();
        MessageBus.getBus().register(this);
        mVisible = true;
        reloadCurrentWishList();
        if (mDropdownWishLists == null)
        {
            reloadAvailableLists();
        }
        enableDropdownList(true);
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i == 1)
        {
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setMessage(getString(0x7f09064d));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;
        } else
        {
            return super.onCreateDialog(i);
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        setupShareAction(menu);
        MenuItemCompat.setShowAsAction(menu.add(0, 0x7f100695, 0, 0x7f090062).setIcon(0x7f0202ee), 1);
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401f0);
            setupEmptyView();
            setupListView();
            setupToolBar();
            updateHeaders();
            wireListeners();
            updateEmptyViewVisibility();
            new SwipeController(mListView, mAdapter, 0x7f10064a);
        }
    }

    public void onListTransferCompleteEvent(ListTransferCompleteEvent listtransfercompleteevent)
    {
        WLog.d(TAG, "onListTransferCompleteEvent()");
        reloadCurrentWishList();
        reloadAvailableLists();
    }

    public void onNewTop()
    {
        WLog.d(TAG, "onNewTop()");
        super.onNewTop();
        mVisible = false;
        enableDropdownList(false);
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

    public void onPauseAsTop()
    {
        WLog.d(TAG, "onPauseAsTop()");
        super.onPauseAsTop();
    }

    public void onPop()
    {
        WLog.d(TAG, "onResumeAsTop()");
        super.onPop();
        cancelActiveCallbacks();
        mVisible = false;
    }

    public void onPushed()
    {
        WLog.d(TAG, "onPushed()");
        super.onPushed();
    }

    public void onResumeAsTop()
    {
        WLog.d(TAG, "onResumeAsTop()");
        super.onResumeAsTop();
        mVisible = true;
    }

    public void onSortFilterOptionsSelected(String s, String s1, String s2)
    {
        reloadItemsForCurrentList(s, s1, s2);
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
        mVisible = false;
    }





/*
    static WishList access$1002(ListCreatorPresenter listcreatorpresenter, WishList wishlist)
    {
        listcreatorpresenter.mCurrentWishList = wishlist;
        return wishlist;
    }

*/





/*
    static CancelableCallback access$1402(ListCreatorPresenter listcreatorpresenter, CancelableCallback cancelablecallback)
    {
        listcreatorpresenter.mLoadCurrentListCallback = cancelablecallback;
        return cancelablecallback;
    }

*/





/*
    static String access$1702(ListCreatorPresenter listcreatorpresenter, String s)
    {
        listcreatorpresenter.mFilter = s;
        return s;
    }

*/



/*
    static String access$1802(ListCreatorPresenter listcreatorpresenter, String s)
    {
        listcreatorpresenter.mSort = s;
        return s;
    }

*/



/*
    static String access$1902(ListCreatorPresenter listcreatorpresenter, String s)
    {
        listcreatorpresenter.mOrder = s;
        return s;
    }

*/







/*
    static CancelableCallback access$2402(ListCreatorPresenter listcreatorpresenter, CancelableCallback cancelablecallback)
    {
        listcreatorpresenter.mLoadItemsCallback = cancelablecallback;
        return cancelablecallback;
    }

*/





/*
    static CancelableCallback access$2802(ListCreatorPresenter listcreatorpresenter, CancelableCallback cancelablecallback)
    {
        listcreatorpresenter.mLoadListsCallback = cancelablecallback;
        return cancelablecallback;
    }

*/



/*
    static List access$2902(ListCreatorPresenter listcreatorpresenter, List list)
    {
        listcreatorpresenter.mDropdownWishLists = list;
        return list;
    }

*/







/*
    static boolean access$602(ListCreatorPresenter listcreatorpresenter, boolean flag)
    {
        listcreatorpresenter.mHasReceivedDropDownSelection = flag;
        return flag;
    }

*/



}
