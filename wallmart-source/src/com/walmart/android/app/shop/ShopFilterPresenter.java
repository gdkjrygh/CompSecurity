// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.data.StoreQueryResult;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.browse.BrowseSearchService;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StorePickerListener;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterListAdapter, ShopFilterManager, RefinementsHelper

public class ShopFilterPresenter extends Presenter
{
    public static interface OnFilterAppliedListener
    {

        public abstract void onFilterApplied();
    }


    private static final int DIALOG_NO_ITEMS_FINISH = 2;
    private static final int DIALOG_NO_ITEMS_RESET_FILTERS = 1;
    private static final String TAG = com/walmart/android/app/shop/ShopFilterPresenter.getSimpleName();
    private final Activity mActivity;
    private OnFilterAppliedListener mFilterAppliedListener;
    private Handler mHandler;
    private View mHeaderView;
    private CheckBox mInStoreCheckBox;
    private boolean mInStoreSearchEnabled;
    private ShopFilterListAdapter mListAdapter;
    private ViewGroup mListContainer;
    private ListView mListView;
    private View mLoadingView;
    private Button mResetButton;
    private final ShopFilterManager mShopFilterManager;
    private StoreFinderController mStoreFinderController;
    private StoreInfo mStoreInfo;

    public ShopFilterPresenter(Activity activity, ShopFilterManager shopfiltermanager)
    {
        mActivity = activity;
        mShopFilterManager = shopfiltermanager;
        init();
    }

    private AsyncCallback createAsyncCallBack()
    {
        return new AsyncCallbackOnThread(mHandler) {

            final ShopFilterPresenter this$0;

            public void onFailureSameThread(Integer integer, StoreQueryResult storequeryresult)
            {
                mLoadingView.setVisibility(8);
                Log.w(ShopFilterPresenter.TAG, (new StringBuilder()).append("Failed to load filter refinement items. ErrorCode: ").append(integer).toString());
                if (isPopped())
                {
                    return;
                }
                pop();
                if (integer.intValue() == 0x15f92)
                {
                    DialogFactory.showDialog(600, mActivity);
                    return;
                } else
                {
                    DialogFactory.showDialog(900, mActivity);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StoreQueryResult)obj1);
            }

            public void onSuccessSameThread(StoreQueryResult storequeryresult)
            {
                if (isPopped())
                {
                    return;
                }
                com.walmart.android.data.StoreQueryResult.RefinementGroup arefinementgroup[] = storequeryresult.getRefinementGroups();
                if (arefinementgroup == null || arefinementgroup.length == 0)
                {
                    Log.w(ShopFilterPresenter.TAG, "Failed to load filter refinement items.  No data returned.");
                    storequeryresult = mShopFilterManager.getRefinements();
                    if (storequeryresult != null && storequeryresult.size() > 0)
                    {
                        showDialog(1);
                        resetSelectedRefinements();
                        setInStoreActive(false);
                        reloadData();
                        return;
                    } else
                    {
                        showDialog(2);
                        return;
                    }
                } else
                {
                    initListView(storequeryresult);
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StoreQueryResult)obj);
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super(handler);
            }
        };
    }

    private String getAddressForStore(StoreInfo storeinfo)
    {
        String as[] = storeinfo.addressLine2.split(",");
        if (as.length == 2)
        {
            String as1[] = as[1].trim().split(" ");
            if (as1.length == 2)
            {
                return (new StringBuilder()).append(as[0]).append(", ").append(as1[1]).toString();
            }
        }
        return storeinfo.addressLine2;
    }

    private void init()
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null)
        {
            boolean flag;
            if (!appconfig.inStoreSearchOn)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            mInStoreSearchEnabled = flag;
        }
        mListContainer = (ViewGroup)mActivity.getLayoutInflater().inflate(0x7f040198, null);
        mListView = (ListView)mListContainer.findViewById(0x7f10057c);
        setupInStoreHeader();
        mResetButton = (Button)mListContainer.findViewById(0x7f1002de);
        mResetButton.setText(0x7f090475);
        ViewUtil.setText(0x7f1002dd, mListContainer, 0x7f09007a);
        mLoadingView = mListContainer.findViewById(0x7f10057b);
        mHandler = new Handler();
        setTitleText("Refine");
        wireListeners();
    }

    private void initListView(StoreQueryResult storequeryresult)
    {
        mListAdapter = new ShopFilterListAdapter(mActivity, mShopFilterManager);
        storequeryresult = storequeryresult.getPrunedRefinementGroups(mShopFilterManager.getShelfDepartmentTitle());
        mListAdapter.setRefinementGroups(storequeryresult);
        mListView.setAdapter(mListAdapter);
        mListView.setVisibility(0);
        mResetButton.setEnabled(true);
        mLoadingView.setVisibility(8);
    }

    private void initStorePicker()
    {
        if (mStoreFinderController == null)
        {
            mStoreFinderController = new StoreFinderController(mActivity, getPresenterStack(), new WalmartStoreConfigurator(mActivity));
            mStoreFinderController.initPickerMode();
            mStoreFinderController.setStorePickerListener(new StorePickerListener() {

                final ShopFilterPresenter this$0;

                public void onCancelled()
                {
                    pop();
                }

                public void onStoreClicked(WalmartStore walmartstore)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("makeMyStore")).putString("storeId", walmartstore.getId()));
                    SharedPreferencesUtil.saveLocalAdStore(mActivity, walmartstore);
                    pop();
                }

                public volatile void onStoreClicked(StoreData storedata)
                {
                    onStoreClicked((WalmartStore)storedata);
                }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
            });
        }
        mStoreFinderController.setStorePickerTitle(mActivity.getString(0x7f09059e));
        mStoreFinderController.show(true);
        mStoreFinderController.initLocation();
    }

    private void loadRefinementTypes()
    {
        String s = mShopFilterManager.getSearchQuery();
        String s1 = mShopFilterManager.getStoreID();
        prepareAsyncList();
        AsyncCallback asynccallback = createAsyncCallBack();
        String as1[] = mShopFilterManager.generateSingleRefinementToken(1, 0);
        String as[] = as1;
        if (as1 == null)
        {
            as = new String[0];
        }
        if (s1 != null && s1.length() > 0)
        {
            if (s != null)
            {
                Services.get().getBrowseSearchService().searchItemsWithStore(s, mShopFilterManager.getDepartment(), "Store", "RELEVANCE", 0, 1, s1, as, asynccallback);
                return;
            } else
            {
                Services.get().getBrowseSearchService().browseItemsWithStore(mShopFilterManager.getBrowseToken(), "Store", "RELEVANCE", 0, 1, s1, as, asynccallback);
                return;
            }
        }
        if (s != null)
        {
            Services.get().getBrowseSearchService().searchItems(s, mShopFilterManager.getDepartment(), "All", "RELEVANCE", 0, 1, as, asynccallback);
            return;
        } else
        {
            Services.get().getBrowseSearchService().browseItems(mShopFilterManager.getBrowseToken(), "All", "RELEVANCE", 0, 1, as, asynccallback);
            return;
        }
    }

    private void prepareAsyncList()
    {
        mListView.setVisibility(8);
        mResetButton.setEnabled(false);
        mLoadingView.setVisibility(0);
        if (mListAdapter != null)
        {
            mListAdapter.cleanUp();
            mListAdapter = null;
            mListView.setAdapter(null);
        }
    }

    private com.walmart.android.data.StoreQueryResult.RefinementGroup[] removeRefinementsWithNoCounts(StoreQueryResult storequeryresult)
    {
        Object obj = null;
        com.walmart.android.data.StoreQueryResult.RefinementGroup arefinementgroup[] = storequeryresult.getRefinementGroups();
        ArrayList arraylist = new ArrayList();
        storequeryresult = obj;
        if (arefinementgroup != null)
        {
            int i = 0;
            while (i < arefinementgroup.length) 
            {
                Object obj1 = arefinementgroup[i];
                if (obj1 != null && ((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getTotalCount() > 0)
                {
                    String s = ((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getName();
                    if (s == null || !s.equalsIgnoreCase(mShopFilterManager.getShelfDepartmentTitle()))
                    {
                        storequeryresult = new com.walmart.android.data.StoreQueryResult.RefinementGroup();
                        storequeryresult.setBrowseToken(((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getBrowseToken());
                        storequeryresult.setName(((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getName());
                        storequeryresult.setTotalCount(((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getTotalCount());
                        storequeryresult.setIsDepartment(((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).isDepartment());
                        com.walmart.android.data.StoreQueryResult.Refinement arefinement1[] = ((com.walmart.android.data.StoreQueryResult.RefinementGroup) (obj1)).getRefinements();
                        obj1 = new ArrayList();
                        if (arefinement1 != null)
                        {
                            int k = arefinement1.length;
                            int j = 0;
                            while (j < k) 
                            {
                                com.walmart.android.data.StoreQueryResult.Refinement refinement = arefinement1[j];
                                String s1 = refinement.getStats();
                                if (s1 == null || !"".equals(s1) && !"0".equals(s1))
                                {
                                    refinement.setParent(s);
                                    ((ArrayList) (obj1)).add(refinement);
                                }
                                j++;
                            }
                        }
                        com.walmart.android.data.StoreQueryResult.Refinement arefinement[] = new com.walmart.android.data.StoreQueryResult.Refinement[((ArrayList) (obj1)).size()];
                        ((ArrayList) (obj1)).toArray(arefinement);
                        storequeryresult.setRefinements(arefinement);
                        arraylist.add(storequeryresult);
                    }
                }
                i++;
            }
            storequeryresult = new com.walmart.android.data.StoreQueryResult.RefinementGroup[arraylist.size()];
            arraylist.toArray(storequeryresult);
        }
        return storequeryresult;
    }

    private void resetSelectedRefinements()
    {
        mShopFilterManager.clearRefinements();
    }

    private void setupInStoreHeader()
    {
        if (mInStoreSearchEnabled)
        {
            return;
        }
        mHeaderView = LayoutInflater.from(mActivity).inflate(0x7f040197, mListView, false);
        mListView.addHeaderView(mHeaderView, null, false);
        mInStoreCheckBox = (CheckBox)mHeaderView.findViewById(0x7f100578);
        if (mShopFilterManager.getStoreID() != null)
        {
            setInStoreActive(true);
        } else
        {
            setInStoreActive(false);
        }
        mInStoreCheckBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ShopFilterPresenter this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (flag)
                {
                    if (mStoreInfo == null)
                    {
                        initStorePicker();
                    } else
                    {
                        setInStoreActive(true);
                    }
                } else
                {
                    setInStoreActive(false);
                }
                resetSelectedRefinements();
                reloadData();
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
    }

    private void wireListeners()
    {
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ShopFilterPresenter this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (com.walmart.android.data.StoreQueryResult.RefinementGroup)mListAdapter.getItem(i - mListView.getHeaderViewsCount());
                RefinementsHelper.showRefinementGroupDialog(mActivity, mShopFilterManager, adapterview);
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
        mResetButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ShopFilterPresenter this$0;

            public void onClick(View view)
            {
                resetSelectedRefinements();
                setInStoreActive(false);
                reloadData();
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
        mListContainer.findViewById(0x7f1002dd).setOnClickListener(new android.view.View.OnClickListener() {

            final ShopFilterPresenter this$0;

            public void onClick(View view)
            {
                if (mFilterAppliedListener != null)
                {
                    mFilterAppliedListener.onFilterApplied();
                }
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
        mShopFilterManager.addOnFilterChangedListener(new ShopFilterManager.OnFilterChangedListener() {

            final ShopFilterPresenter this$0;

            public void onFilterChanged()
            {
                reloadData();
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
    }

    public View getView()
    {
        return mListContainer;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mListAdapter != null)
        {
            mListAdapter.cleanUp();
        }
    }

    public void onBeforePoppedTo()
    {
        if (SharedPreferencesUtil.getSavedLocalAdStore(mActivity) != null)
        {
            setInStoreActive(true);
        } else
        {
            setInStoreActive(false);
        }
        reloadData();
    }

    public void onBeforePush()
    {
        loadRefinementTypes();
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog alertdialog;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090287).setPositiveButton(0x7f090292, null).create();

        case 2: // '\002'
            alertdialog = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090286).setPositiveButton(0x7f090292, null).create();
            break;
        }
        alertdialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ShopFilterPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                mActivity.setResult(0);
                mActivity.finish();
            }

            
            {
                this$0 = ShopFilterPresenter.this;
                super();
            }
        });
        return alertdialog;
    }

    public void onNewTop()
    {
        super.onNewTop();
        if (mListAdapter != null)
        {
            mListAdapter.onStop();
        }
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        if (mListAdapter != null)
        {
            mListAdapter.onStart();
        }
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        if (mListAdapter != null)
        {
            mListAdapter.onStop();
        }
    }

    public void reloadData()
    {
        loadRefinementTypes();
        if (mListAdapter != null)
        {
            mListAdapter.onStart();
        }
    }

    public void setInStoreActive(boolean flag)
    {
        if (mInStoreSearchEnabled)
        {
            return;
        }
        TextView textview = (TextView)mHeaderView.findViewById(0x7f100579);
        mStoreInfo = SharedPreferencesUtil.getSavedLocalAdStore(mActivity);
        if (mStoreInfo != null)
        {
            textview.setText(getAddressForStore(mStoreInfo));
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        if (flag && mStoreInfo != null)
        {
            mShopFilterManager.setStoreID(mStoreInfo.storeID);
            mInStoreCheckBox.setChecked(true);
            return;
        } else
        {
            mShopFilterManager.setStoreID(null);
            mInStoreCheckBox.setChecked(false);
            return;
        }
    }

    public void setOnFilterAppliedListener(OnFilterAppliedListener onfilterappliedlistener)
    {
        mFilterAppliedListener = onfilterappliedlistener;
    }

















}
