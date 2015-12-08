// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.data.ReviewResult;
import com.walmart.android.service.review.ItemReviewService;
import com.walmart.android.service.review.ReviewSort;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.PagingAdapter;
import com.walmartlabs.utils.WLog;
import java.util.List;

class ItemReviewsAdapter extends PagingAdapter
{
    public static interface ItemReviewsListener
    {

        public abstract void onFailedToLoad(com.walmartlabs.kangaroo.Result.Error error);
    }

    public static class ReviewViewHolder extends BasicViewHolder
    {

        public TextView date;
        public TextView description;
        public TextView helpful;
        public StarsView starsView;
        public TextView title;

        public ReviewViewHolder(View view)
        {
            super(view);
            title = (TextView)ViewUtil.findViewById(view, 0x7f10055e);
            date = (TextView)ViewUtil.findViewById(view, 0x7f10054d);
            starsView = (StarsView)ViewUtil.findViewById(view, 0x7f10055f);
            description = (TextView)ViewUtil.findViewById(view, 0x7f100560);
            helpful = (TextView)ViewUtil.findViewById(view, 0x7f100561);
        }
    }


    private static final String TAG = com/walmart/android/app/item/ItemReviewsAdapter.getSimpleName();
    private final Context mContext;
    private final String mItemId;
    private ItemReviewsListener mListener;
    private Request mRequestInFlight;
    private ReviewSort mSortBy;
    private final int mTotalReviews;

    public ItemReviewsAdapter(Context context, String s, int i)
    {
        mSortBy = ReviewSort.HELPFULNESS_HIGHEST_FIRST;
        mContext = context;
        mItemId = s;
        mTotalReviews = i;
    }

    private void populate(ReviewViewHolder reviewviewholder, com.walmart.android.data.ReviewResult.Review review)
    {
        TextView textview = reviewviewholder.title;
        if (TextUtils.isEmpty(review.title))
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(review.title);
            textview.setVisibility(0);
        }
        reviewviewholder.date.setText(com.walmart.android.util.TextUtils.formatDateString(review.submissionTime));
        reviewviewholder.starsView.setValue(review.rating);
        textview = reviewviewholder.description;
        if (TextUtils.isEmpty(review.reviewText))
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(review.reviewText);
            textview.setVisibility(0);
        }
        reviewviewholder.helpful.setText(String.format(mContext.getResources().getString(0x7f0901a9), new Object[] {
            Integer.valueOf(review.totalPositiveFeedbackCount), Integer.valueOf(review.totalFeedbackCount)
        }));
    }

    public void applySort(ReviewSort reviewsort)
    {
        mSortBy = reviewsort;
        reload();
    }

    public void initLoader()
    {
        setAndStartLoader(new com.walmartlabs.ui.recycler.PagingAdapter.DefaultLoader() {

            final ItemReviewsAdapter this$0;

            public void loadMore(int i)
            {
                int j = Math.min(mTotalReviews - i, 50);
                WLog.d(ItemReviewsAdapter.TAG, (new StringBuilder()).append("requesting ").append(j).append(" reviews from offset ").append(i).toString());
                mRequestInFlight = Services.get().getItemReviewService().getReviewsForItem(mItemId, mSortBy, i, j).addCallback(new CallbackSameThread(mContext) {

                    final _cls1 this$1;

                    private List validateAndGetReviews(Result result)
                    {
                        if (result.successful() && result.hasData())
                        {
                            return ((ReviewResult)result.getData()).results;
                        } else
                        {
                            return null;
                        }
                    }

                    public void onResultSameThread(Request request, Result result)
                    {
                        boolean flag = true;
                        super.onResultSameThread(request, result);
                        mRequestInFlight = null;
                        request = validateAndGetReviews(result);
                        if (request != null)
                        {
                            WLog.d(ItemReviewsAdapter.TAG, (new StringBuilder()).append("Got ").append(request.size()).append(" more reviews").toString());
                            result = _cls1.this;
                            if (request.size() == 0 || getDataItemCount() + request.size() >= mTotalReviews)
                            {
                                flag = false;
                            }
                            result.notifyBatchLoaded(request, flag);
                            return;
                        }
                        if (mListener != null)
                        {
                            mListener.onFailedToLoad(result.getError());
                        }
                        _cls1 _lcls1 = _cls1.this;
                        StringBuilder stringbuilder = (new StringBuilder()).append("Error: ");
                        if (result.hasError())
                        {
                            request = result.getError();
                        } else
                        {
                            request = "unknown";
                        }
                        _lcls1.notifyLoadFailed(stringbuilder.append(request).toString(), true);
                    }

            
            {
                this$1 = _cls1.this;
                super(context);
            }
                });
            }

            public void reset()
            {
                super.reset();
                if (mRequestInFlight != null)
                {
                    mRequestInFlight.cancel();
                    mRequestInFlight = null;
                }
            }



            
            {
                this$0 = ItemReviewsAdapter.this;
                super();
            }
        });
    }

    public void onBindItemViewHolder(ReviewViewHolder reviewviewholder, com.walmart.android.data.ReviewResult.Review review, int i)
    {
        populate(reviewviewholder, review);
    }

    public volatile void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i)
    {
        onBindItemViewHolder((ReviewViewHolder)basicviewholder, (com.walmart.android.data.ReviewResult.Review)obj, i);
    }

    public ReviewViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return new ReviewViewHolder(ViewUtil.inflate(mContext, 0x7f04018d, viewgroup));
    }

    public volatile BasicViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateItemViewHolder(viewgroup, i);
    }

    public void setItemReviewsListener(ItemReviewsListener itemreviewslistener)
    {
        mListener = itemreviewslistener;
    }






/*
    static Request access$202(ItemReviewsAdapter itemreviewsadapter, Request request)
    {
        itemreviewsadapter.mRequestInFlight = request;
        return request;
    }

*/




}
