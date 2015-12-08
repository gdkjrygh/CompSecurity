// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.review.ReviewSort;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.ScrollDirectionListener;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;

// Referenced classes of package com.walmart.android.app.item:
//            ShopSortManager, ItemReviewsAdapter, ItemReviewDetailsPresenter

public class ItemReviewsPresenter extends Presenter
{

    private static final int DIALOG_NETWORK_ERROR = 1;
    private static final int DIALOG_UNKNOWN_ERROR = 0;
    public static final String SORT_REVIEWS_NAME = "REVIEWS_SORT_ITEMS";
    public static final ReviewSort SORT_REVIEWS_PARAM_MAP[] = ReviewSort.values();
    private Activity mActivity;
    private ItemReviewsAdapter mAdapter;
    private final float mAverageOverallRating;
    private String mItemId;
    private ViewGroup mListContainer;
    private ListRecyclerView mListView;
    private ViewGroup mOptionsFooter;
    private String mProdType;
    private final String mProductName;
    private ShopSortManager mSortManager;
    private final int mTotalNoRatings;
    private ViewGroup mViewGroup;

    public ItemReviewsPresenter(Activity activity, String s, String s1, int i, float f, String s2)
    {
        mActivity = activity;
        mItemId = s;
        mProdType = s1;
        mTotalNoRatings = i;
        mProductName = s2;
        mAverageOverallRating = f;
        activity = (LayoutInflater)activity.getSystemService("layout_inflater");
        mViewGroup = (ViewGroup)activity.inflate(0x7f04018c, null);
        initView(activity);
        initSortManager();
    }

    private boolean hasScrollableContent()
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (mListView != null)
        {
            BasicAdapter basicadapter = mListView.getAdapter();
            int i;
            int j;
            if (basicadapter != null)
            {
                i = basicadapter.getItemCount();
            } else
            {
                i = 0;
            }
            j = mListView.getChildCount();
            if (i > j)
            {
                flag1 = true;
            } else
            {
                flag1 = flag2;
                if (i > 0)
                {
                    flag1 = flag2;
                    if (i == j)
                    {
                        boolean flag;
                        int k;
                        if (mListView.getChildAt(0).getTop() < 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        k = mListView.getChildAt(j - 1).getBottom();
                        if (mOptionsFooter != null)
                        {
                            j = mOptionsFooter.getHeight();
                        } else
                        {
                            j = 0;
                        }
                        if (k >= mListView.getHeight() - j)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        return flag || j != 0;
                    }
                }
            }
        }
        return flag1;
    }

    private void initSortManager()
    {
        mSortManager = new ShopSortManager(mActivity);
        mSortManager.addSortGroup(new ShopSortManager.SortGroup(SORT_REVIEWS_PARAM_MAP, "REVIEWS_SORT_ITEMS"));
        mSortManager.setActive("REVIEWS_SORT_ITEMS");
        mSortManager.reset();
        mSortManager.getActive().setOnSortChangedListener(new ShopSortManager.OnSortChangedListener() {

            final ItemReviewsPresenter this$0;

            public void onSortChanged(ReviewSort reviewsort)
            {
                mAdapter.applySort(reviewsort);
            }

            public volatile void onSortChanged(Object obj)
            {
                onSortChanged((ReviewSort)obj);
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
    }

    private void initView(LayoutInflater layoutinflater)
    {
        mAdapter = new ItemReviewsAdapter(mActivity, mItemId, mTotalNoRatings);
        mAdapter.initLoader();
        mAdapter.setItemReviewsListener(new ItemReviewsAdapter.ItemReviewsListener() {

            final ItemReviewsPresenter this$0;

            public void onFailedToLoad(com.walmartlabs.kangaroo.Result.Error error)
            {
                if (isPopped())
                {
                    return;
                }
                ItemReviewsPresenter itemreviewspresenter = ItemReviewsPresenter.this;
                int i;
                if (error != null && error.connectionError())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                itemreviewspresenter.showDialog(i);
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
        mListContainer = (ViewGroup)ViewUtil.findViewById(mViewGroup, 0x7f10055a);
        mListView = (ListRecyclerView)ViewUtil.findViewById(mViewGroup, 0x7f10055b);
        mOptionsFooter = (ViewGroup)ViewUtil.findViewById(mViewGroup, 0x7f1002dc);
        ViewGroup viewgroup = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04018e);
        Object obj = (TextView)ViewUtil.findViewById(viewgroup, 0x7f100562);
        if (mProductName != null)
        {
            layoutinflater = mProductName;
        } else
        {
            layoutinflater = "";
        }
        ((TextView) (obj)).setText(layoutinflater);
        layoutinflater = (TextView)ViewUtil.findViewById(viewgroup, 0x7f1001e7);
        obj = (StarsView)ViewUtil.findViewById(viewgroup, 0x7f100564);
        layoutinflater.setText(mActivity.getResources().getQuantityString(0x7f110005, mTotalNoRatings, new Object[] {
            Integer.valueOf(mTotalNoRatings)
        }));
        ((StarsView) (obj)).setValue(mAverageOverallRating);
        layoutinflater.setVisibility(0);
        ViewUtil.findViewById(mViewGroup, 0x7f10055d).setOnClickListener(new android.view.View.OnClickListener() {

            final ItemReviewsPresenter this$0;

            public void onClick(View view)
            {
                showSortReviewsDialog();
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
        mListView.setAdapter(mAdapter);
        if (viewgroup != null)
        {
            mListView.addHeaderView(viewgroup);
        }
        mListView.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final ItemReviewsPresenter this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                com.walmart.android.data.ReviewResult.Review review = (com.walmart.android.data.ReviewResult.Review)mAdapter.getItem(i);
                if (review != null)
                {
                    if (mProductName != null)
                    {
                        basicviewholder = mProductName;
                    } else
                    {
                        basicviewholder = "";
                    }
                    basicviewholder = new ItemReviewDetailsPresenter(mActivity, basicviewholder, mItemId, mProdType, review, mAdapter);
                    pushPresenter(basicviewholder);
                }
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
        setupFooterHideOnScroll();
    }

    private void setupFooterHideOnScroll()
    {
        int i = mOptionsFooter.getLayoutParams().height;
        mListView.addOnItemTouchListener(new ScrollDirectionListener(i) {

            final ItemReviewsPresenter this$0;
            final int val$offset;

            public void onScrollDirectionChanged(int j)
            {
                if (!hasScrollableContent())
                {
                    return;
                }
                float f1;
                switch (j)
                {
                default:
                    return;

                case 0: // '\0'
                    float f = mListContainer.getHeight();
                    mOptionsFooter.animate().y(f);
                    return;

                case 1: // '\001'
                    f1 = mListContainer.getHeight() - offset;
                    break;
                }
                mOptionsFooter.animate().y(f1);
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                offset = i;
                super(final_context);
            }
        });
    }

    private void showSortReviewsDialog()
    {
        if (mSortManager == null)
        {
            return;
        } else
        {
            com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
            builder.setTitle(0x7f0901ae).setSingleChoiceItems(0x7f0e000d, mSortManager.getSelectedOption(), new android.content.DialogInterface.OnClickListener() {

                final ItemReviewsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    mSortManager.setSelectedOption(i);
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
            }).setCancelable(true).setNegativeButton(0x7f0900a0, new android.content.DialogInterface.OnClickListener() {

                final ItemReviewsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    mActivity.removeDialog(3);
                }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
            });
            builder.show();
            return;
        }
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f090477);
    }

    public View getView()
    {
        return mViewGroup;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        ListRecyclerView listrecyclerview = (ListRecyclerView)ViewUtil.findViewById(mViewGroup, 0x7f10055b);
        if (listrecyclerview != null)
        {
            listrecyclerview.setAdapter(null);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
        builder.setCancelable(true);
        builder.setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final ItemReviewsPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                pop();
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final ItemReviewsPresenter this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                pop();
            }

            
            {
                this$0 = ItemReviewsPresenter.this;
                super();
            }
        });
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            builder.setMessage(0x7f090282);
            return builder.create();

        case 0: // '\0'
            builder.setMessage(0x7f090284);
            return builder.create();
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        GoogleAnalytics.trackPageView("Ratings & Reviews List");
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail:reviews").putString("section", "shop").putString("itemId", mItemId).putString("prodType", mProdType);
        MessageBus.getBus().post(builder);
    }















}
