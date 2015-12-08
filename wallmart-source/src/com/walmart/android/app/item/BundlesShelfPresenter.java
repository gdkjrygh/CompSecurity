// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.PriceView;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfAdapter, ItemDetailsPresenter, BundleDialogFactory

public class BundlesShelfPresenter extends Presenter
{

    private static final int DIALOG_HAS_OPTIONS = 1;
    private static final int DIALOG_MAKE_SELECTIONS = 2;
    private final Activity mActivity;
    private int mDialogConfig;
    private BundleConfiguration.BundleGroupConfiguration mGroupConfiguration;
    private boolean mIsOfOptionalGroupType;
    private final TextView mListHeader;
    private final ListView mListView;
    private String mPrice;
    private final BundleSummaryPresenter.BundlePriceCalculator mPriceCalculator;
    private boolean mPushedPresenter;
    private final BundlesShelfAdapter mShelfAdapter;
    private com.walmart.android.service.item.BundleModel.GroupOption mTempItem;
    private final View mView;

    public BundlesShelfPresenter(Activity activity, BundleConfiguration.BundleGroupConfiguration bundlegroupconfiguration, BundleSummaryPresenter.BundlePriceCalculator bundlepricecalculator)
    {
        mTempItem = null;
        mDialogConfig = 0;
        mPrice = "";
        mActivity = activity;
        mGroupConfiguration = bundlegroupconfiguration;
        mIsOfOptionalGroupType = com.walmart.android.service.item.BundleModel.GroupType.OPTIONAL.equals(mGroupConfiguration.getBundleGroup().getGroupType());
        mView = LayoutInflater.from(activity).inflate(0x7f04002b, null);
        mShelfAdapter = new BundlesShelfAdapter(activity, bundlegroupconfiguration);
        mListView = (ListView)ViewUtil.findViewById(mView, 0x7f100098);
        mListHeader = (TextView)LayoutInflater.from(activity).inflate(0x7f04002c, null);
        mPriceCalculator = bundlepricecalculator;
        ((Button)ViewUtil.findViewById(mView, 0x7f100094)).setOnClickListener(new android.view.View.OnClickListener() {

            final BundlesShelfPresenter this$0;

            public void onClick(View view)
            {
                int i = mGroupConfiguration.getSelectedOptions().size();
                int j = mGroupConfiguration.getBundleGroup().getMinimumSelectionsRequired();
                if (j == 0 || i == j)
                {
                    pop();
                    return;
                } else
                {
                    showDialog(2);
                    return;
                }
            }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
        });
        init();
    }

    private void init()
    {
        initList();
        onCheckedItemsChanged();
        setTitleText(mActivity.getString(0x7f090176));
    }

    private void initList()
    {
        updateListHeader();
        mShelfAdapter.setImageDownloadingEnabled(false);
        mListView.addHeaderView(mListHeader);
        if (mIsOfOptionalGroupType)
        {
            ViewUtil.findViewById(mView, 0x7f10007b).setVisibility(8);
        }
        mListView.setAdapter(mShelfAdapter);
        mListView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final BundlesShelfPresenter this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if (i == 0 || i == 1)
                {
                    mShelfAdapter.setImageDownloadingEnabled(true);
                } else
                if (i == 2)
                {
                    mShelfAdapter.setImageDownloadingEnabled(false);
                    return;
                }
            }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
        });
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final BundlesShelfPresenter this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i != 0)
                {
                    if ((adapterview = (com.walmart.android.service.item.BundleModel.GroupOption)mShelfAdapter.getItem(i - 1)) != null)
                    {
                        showItemDetailsPresenter(adapterview);
                        return;
                    }
                }
            }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
        });
        mShelfAdapter.setListener(new BundlesShelfAdapter.Listener() {

            final BundlesShelfPresenter this$0;

            public void onCheckItem(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
            {
                if (mGroupConfiguration.isSelected(groupoption))
                {
                    mGroupConfiguration.deselect(groupoption);
                } else
                if (groupoption.isVariant())
                {
                    mTempItem = groupoption;
                    showDialog(1);
                } else
                if (mGroupConfiguration.canMakeAdditionalSelections())
                {
                    mGroupConfiguration.select(groupoption);
                } else
                if (mGroupConfiguration.getBundleGroup().getMaximumSelectionsAllowed() > 1)
                {
                    showDialog(102);
                } else
                {
                    mTempItem = groupoption;
                    showDialog(101);
                }
                onCheckedItemsChanged();
            }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
        });
    }

    private void onCheckedItemsChanged()
    {
        mShelfAdapter.notifyDataSetChanged();
        updateHeader();
    }

    private void showItemDetailsPresenter(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        if (!mPushedPresenter)
        {
            mPushedPresenter = true;
            ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(mActivity, groupoption.getItemId());
            if (!mIsOfOptionalGroupType)
            {
                itemdetailspresenter.setBundleGroupConfiguration(mGroupConfiguration, groupoption);
            }
            pushPresenter(itemdetailspresenter);
        }
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Bundle Shelf");
    }

    private void updateHeader()
    {
        final String price = mPriceCalculator.getBundlePrice();
        if (!mPrice.equals(price))
        {
            final PriceView priceView = (PriceView)ViewUtil.findViewById(mView, 0x7f10009a);
            Animation animation = AnimationUtils.loadAnimation(mActivity, 0x7f050011);
            priceView.startAnimation(animation);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final BundlesShelfPresenter this$0;
                final String val$price;
                final PriceView val$priceView;

                public void onAnimationEnd(Animation animation1)
                {
                    priceView.setPrice(price);
                    mPrice = price;
                    priceView.startAnimation(AnimationUtils.loadAnimation(mActivity, 0x7f05000f));
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    priceView.setVisibility(0);
                }

            
            {
                this$0 = BundlesShelfPresenter.this;
                priceView = priceview;
                price = s;
                super();
            }
            });
        }
        updateListHeader();
    }

    private void updateListHeader()
    {
        int i = mGroupConfiguration.getSelectedOptions().size();
        int j = mGroupConfiguration.getBundleGroup().getMinimumSelectionsRequired();
        if (j == 0)
        {
            if (mIsOfOptionalGroupType)
            {
                mListHeader.setText(mActivity.getString(0x7f090172));
                return;
            }
            if (i > 0)
            {
                mListHeader.setText(String.format("%s (%d)", new Object[] {
                    mGroupConfiguration.getBundleGroup().getTitle(), Integer.valueOf(i)
                }));
                return;
            } else
            {
                mListHeader.setText(String.format("%s", new Object[] {
                    mGroupConfiguration.getBundleGroup().getTitle()
                }));
                return;
            }
        } else
        {
            mListHeader.setText(String.format("%s (%s/%d)", new Object[] {
                mGroupConfiguration.getBundleGroup().getTitle(), Integer.valueOf(i), Integer.valueOf(j)
            }));
            return;
        }
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mListView.setAdapter(null);
        mShelfAdapter.destroy();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
        mPushedPresenter = false;
        onCheckedItemsChanged();
        mShelfAdapter.start();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = null;
        if (i == 1)
        {
            obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f090099).setMessage(0x7f090098).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

                final BundlesShelfPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    showItemDetailsPresenter(mTempItem);
                }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
            }).setNegativeButton(0x1040009, null).setCancelable(true).create();
        } else
        {
            if (i == 2)
            {
                return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(0x7f09009b).setMessage(0x7f09009a).setPositiveButton(0x7f090292, null).setCancelable(true).create();
            }
            if (i == 101)
            {
                obj = new android.content.DialogInterface.OnClickListener() {

                    final BundlesShelfPresenter this$0;

                    public void onClick(DialogInterface dialoginterface, int j)
                    {
                        mGroupConfiguration.replace(mTempItem);
                        onCheckedItemsChanged();
                    }

            
            {
                this$0 = BundlesShelfPresenter.this;
                super();
            }
                };
            }
            Dialog dialog = BundleDialogFactory.createDialog(mActivity, i, ((android.content.DialogInterface.OnClickListener) (obj)));
            obj = dialog;
            if (dialog == null)
            {
                return super.onCreateDialog(i);
            }
        }
        return ((Dialog) (obj));
    }

    public void onNewTop()
    {
        super.onNewTop();
        mShelfAdapter.stop();
    }

    public void onPushed()
    {
        super.onPushed();
        mShelfAdapter.setImageDownloadingEnabled(true);
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
        mShelfAdapter.start();
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        mShelfAdapter.stop();
    }







/*
    static String access$302(BundlesShelfPresenter bundlesshelfpresenter, String s)
    {
        bundlesshelfpresenter.mPrice = s;
        return s;
    }

*/






/*
    static com.walmart.android.service.item.BundleModel.GroupOption access$702(BundlesShelfPresenter bundlesshelfpresenter, com.walmart.android.service.item.BundleModel.GroupOption groupoption)
    {
        bundlesshelfpresenter.mTempItem = groupoption;
        return groupoption;
    }

*/


}
