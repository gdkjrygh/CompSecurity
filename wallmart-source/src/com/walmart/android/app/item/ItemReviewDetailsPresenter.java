// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.data.ReviewFeedbackResult;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.review.FeedbackHelpfulness;
import com.walmart.android.service.review.ItemReviewService;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.StarsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewVoteManager, ItemReviewsAdapter

public class ItemReviewDetailsPresenter extends Presenter
{

    public static final String TAG = com/walmart/android/app/item/ItemReviewDetailsPresenter.getSimpleName();
    private final ItemReviewsAdapter mAdapter;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private final String mItemId;
    private final String mItemName;
    private final String mProdType;
    private final ArrayList mRequestsInFlight = new ArrayList();
    private final com.walmart.android.data.ReviewResult.Review mReview;
    private final ViewGroup mViewGroup;

    public ItemReviewDetailsPresenter(Context context, String s, String s1, String s2, com.walmart.android.data.ReviewResult.Review review, ItemReviewsAdapter itemreviewsadapter)
    {
        mContext = context;
        mItemName = s;
        mItemId = s1;
        mProdType = s2;
        mReview = review;
        mViewGroup = (ViewGroup)ViewUtil.inflate(context, 0x7f04018a);
        mAdapter = itemreviewsadapter;
        initView();
    }

    private void cancelRequestsInFlight()
    {
        for (Iterator iterator = mRequestsInFlight.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mRequestsInFlight.clear();
    }

    private View createRatingView(com.walmart.android.data.ReviewResult.SecondaryRating secondaryrating)
    {
        View view = ((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(0x7f04018b, null);
        ((TextView)view.findViewById(0x7f100558)).setText(secondaryrating.label);
        ((StarsView)view.findViewById(0x7f100559)).setValue(secondaryrating.value);
        return view;
    }

    private void flagAsInappropriate(TextView textview)
    {
        if (textview.isEnabled())
        {
            textview.setEnabled(false);
            textview.setTextColor(mContext.getResources().getColor(0x7f0f006c));
            textview = Services.get().getItemReviewService().submitInappropriateReview(getUserId(), mReview.id).addCallback(new CallbackSameThread(textview) {

                final ItemReviewDetailsPresenter this$0;
                final TextView val$inappropriate;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    mRequestsInFlight.remove(request);
                    if (result.successful() && result.hasData() && !((ReviewFeedbackResult)result.getData()).hasErrors)
                    {
                        ViewUtil.findViewById(mViewGroup, 0x7f100557).setVisibility(0);
                        return;
                    } else
                    {
                        inappropriate.setEnabled(true);
                        inappropriate.setTextColor(mContext.getResources().getColor(0x7f0f0063));
                        return;
                    }
                }

            
            {
                this$0 = ItemReviewDetailsPresenter.this;
                inappropriate = textview;
                super(final_context);
            }
            });
            mRequestsInFlight.add(textview);
        }
    }

    private String getUserId()
    {
        Authentication authentication = Services.get().getAuthentication();
        String s = null;
        if (authentication.hasCredentials())
        {
            s = authentication.getCustomerId();
        }
        return s;
    }

    private void initView()
    {
        Object obj;
        final TextView helpful;
        int i;
        if (TextUtils.isEmpty(mItemName))
        {
            ViewUtil.findViewById(mViewGroup, 0x7f100548).setVisibility(8);
            ViewUtil.findViewById(mViewGroup, 0x7f100549).setVisibility(8);
        } else
        {
            ViewUtil.setText(0x7f100548, mViewGroup, mItemName);
        }
        obj = (TextView)mViewGroup.findViewById(0x7f10054b);
        if (TextUtils.isEmpty(mReview.title))
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setText(mReview.title);
            ((TextView) (obj)).setVisibility(0);
        }
        ((TextView)mViewGroup.findViewById(0x7f10054d)).setText(com.walmart.android.util.TextUtils.formatDateString(mReview.submissionTime));
        ((StarsView)mViewGroup.findViewById(0x7f10054c)).setValue(mReview.rating);
        obj = new SpannableStringBuilder(mContext.getResources().getString(0x7f0901a8));
        i = ((SpannableStringBuilder) (obj)).length();
        ((SpannableStringBuilder) (obj)).append(" ");
        if (mReview.userNickname != null)
        {
            ((SpannableStringBuilder) (obj)).append(mReview.userNickname);
            ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(mContext.getResources().getColor(0x7f0f0063)), i, ((SpannableStringBuilder) (obj)).length(), 0);
        } else
        {
            ((SpannableStringBuilder) (obj)).append(mContext.getResources().getString(0x7f0901a7));
        }
        helpful = (TextView)ViewUtil.findViewById(mViewGroup, 0x7f10054f);
        helpful.setText(((CharSequence) (obj)));
        if (mReview.badges != null && mReview.badges.containsKey("VerifiedPurchaser"))
        {
            helpful.setCompoundDrawablesWithIntrinsicBounds(null, null, mContext.getResources().getDrawable(0x7f02019a), null);
        }
        obj = (TextView)ViewUtil.findViewById(mViewGroup, 0x7f100550);
        if (TextUtils.isEmpty(mReview.userLocation))
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setText(mReview.userLocation);
            ((TextView) (obj)).setVisibility(0);
        }
        obj = (ViewGroup)mViewGroup.findViewById(0x7f100551);
        helpful = mReview.secondaryRatings.values();
        if (helpful != null && !helpful.isEmpty())
        {
            for (helpful = helpful.iterator(); helpful.hasNext(); ((ViewGroup) (obj)).addView(createRatingView((com.walmart.android.data.ReviewResult.SecondaryRating)helpful.next()))) { }
        } else
        {
            ((ViewGroup) (obj)).setVisibility(8);
        }
        obj = (TextView)mViewGroup.findViewById(0x7f10054e);
        final TextView notHelpful;
        Object obj1;
        if (TextUtils.isEmpty(mReview.reviewText))
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setText(mReview.reviewText);
            ((TextView) (obj)).setVisibility(0);
        }
        obj = getUserId();
        helpful = (TextView)ViewUtil.findViewById(mViewGroup, 0x7f100553);
        helpful.setText(Integer.toString(mReview.totalPositiveFeedbackCount));
        notHelpful = (TextView)ViewUtil.findViewById(mViewGroup, 0x7f100554);
        notHelpful.setText(Integer.toString(mReview.totalNegativeFeedbackCount));
        obj1 = ItemReviewVoteManager.getInstance().getVote(mReview.id);
        if (obj1 != null)
        {
            helpful.setEnabled(false);
            notHelpful.setEnabled(false);
        }
        if (ItemReviewVoteManager.Vote.HELPFUL == obj1)
        {
            helpful.setSelected(true);
            notHelpful.setEnabled(false);
        } else
        if (ItemReviewVoteManager.Vote.NOT_HELPFUL == obj1)
        {
            notHelpful.setSelected(true);
            helpful.setEnabled(false);
        }
        obj1 = new android.view.View.OnClickListener() {

            final ItemReviewDetailsPresenter this$0;
            final TextView val$helpful;
            final TextView val$notHelpful;

            public void onClick(View view)
            {
                reviewFeedback(view, helpful, notHelpful);
            }

            
            {
                this$0 = ItemReviewDetailsPresenter.this;
                helpful = textview;
                notHelpful = textview1;
                super();
            }
        };
        helpful.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        notHelpful.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        helpful = (TextView)ViewUtil.findViewById(mViewGroup, 0x7f100556);
        if (obj != null)
        {
            helpful.setOnClickListener(new android.view.View.OnClickListener() {

                final ItemReviewDetailsPresenter this$0;
                final TextView val$inappropriate;

                public void onClick(View view)
                {
                    flagAsInappropriate(inappropriate);
                }

            
            {
                this$0 = ItemReviewDetailsPresenter.this;
                inappropriate = textview;
                super();
            }
            });
            return;
        } else
        {
            helpful.setVisibility(8);
            return;
        }
    }

    private void reviewFeedback(View view, TextView textview, TextView textview1)
    {
        if (view.isEnabled())
        {
            TextView textview2 = (TextView)view;
            boolean flag;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            if (textview != textview2)
            {
                textview1 = textview;
            }
            flag2 = textview1.isEnabled();
            flag3 = textview2.isSelected();
            flag4 = textview1.isSelected();
            if (flag3 || flag4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = FeedbackHelpfulness.UNDO;
            } else
            if (textview == textview2)
            {
                view = FeedbackHelpfulness.POSITIVE;
            } else
            {
                view = FeedbackHelpfulness.NEGATIVE;
            }
            textview2.setEnabled(false);
            textview1.setEnabled(false);
            if (flag4)
            {
                textview1.setSelected(false);
            } else
            {
                boolean flag1;
                if (!flag3)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                textview2.setSelected(flag1);
            }
            view = Services.get().getItemReviewService().submitReviewHelpfulnessVote(getUserId(), mReview.id, view).addCallback(new CallbackSameThread(flag3) {

                final ItemReviewDetailsPresenter this$0;
                final TextView val$clickedVoteView;
                final TextView val$helpful;
                final boolean val$isClickedSelected;
                final boolean val$isNotClickedEnabled;
                final boolean val$isNotClickedSelected;
                final boolean val$isUndo;
                final TextView val$notClickedVoteView;

                private void onFail()
                {
                    clickedVoteView.setEnabled(true);
                    notClickedVoteView.setEnabled(isNotClickedEnabled);
                    if (isNotClickedSelected)
                    {
                        notClickedVoteView.setSelected(true);
                        return;
                    } else
                    {
                        clickedVoteView.setSelected(isClickedSelected);
                        return;
                    }
                }

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    mRequestsInFlight.remove(request);
                    if (result.successful() && result.hasData() && !((ReviewFeedbackResult)result.getData()).hasErrors)
                    {
                        request = ItemReviewDetailsPresenter.this;
                        result = clickedVoteView;
                        TextView textview3 = notClickedVoteView;
                        boolean flag5;
                        if (helpful == clickedVoteView)
                        {
                            flag5 = true;
                        } else
                        {
                            flag5 = false;
                        }
                        request.updateVote(result, textview3, flag5, isUndo);
                        return;
                    } else
                    {
                        onFail();
                        return;
                    }
                }

            
            {
                this$0 = ItemReviewDetailsPresenter.this;
                clickedVoteView = textview;
                notClickedVoteView = textview1;
                helpful = textview2;
                isUndo = flag;
                isNotClickedEnabled = flag1;
                isNotClickedSelected = flag2;
                isClickedSelected = flag3;
                super(final_context);
            }
            });
            mRequestsInFlight.add(view);
        }
    }

    private void updateVote(TextView textview, TextView textview1, boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            if (flag)
            {
                ItemReviewVoteManager.getInstance().vote(mReview.id, ItemReviewVoteManager.Vote.HELPFUL);
                textview1 = mReview;
                int i = ((com.walmart.android.data.ReviewResult.Review) (textview1)).totalPositiveFeedbackCount + 1;
                textview1.totalPositiveFeedbackCount = i;
                textview.setText(Integer.toString(i));
            } else
            {
                ItemReviewVoteManager.getInstance().vote(mReview.id, ItemReviewVoteManager.Vote.NOT_HELPFUL);
                textview1 = mReview;
                int j = ((com.walmart.android.data.ReviewResult.Review) (textview1)).totalNegativeFeedbackCount + 1;
                textview1.totalNegativeFeedbackCount = j;
                textview.setText(Integer.toString(j));
            }
            textview = mReview;
            textview.totalFeedbackCount = ((com.walmart.android.data.ReviewResult.Review) (textview)).totalFeedbackCount + 1;
        } else
        {
            textview1.setEnabled(true);
            ItemReviewVoteManager.getInstance().undoVote(mReview.id);
            if (flag)
            {
                textview1 = mReview;
                int k = ((com.walmart.android.data.ReviewResult.Review) (textview1)).totalPositiveFeedbackCount - 1;
                textview1.totalPositiveFeedbackCount = k;
                textview.setText(Integer.toString(k));
            } else
            {
                textview1 = mReview;
                int l = ((com.walmart.android.data.ReviewResult.Review) (textview1)).totalNegativeFeedbackCount - 1;
                textview1.totalNegativeFeedbackCount = l;
                textview.setText(Integer.toString(l));
            }
            textview = mReview;
            textview.totalFeedbackCount = ((com.walmart.android.data.ReviewResult.Review) (textview)).totalFeedbackCount - 1;
        }
        if (mAdapter != null)
        {
            mAdapter.notifyDataSetChanged();
        }
    }

    public String getTitleText()
    {
        return "Review Details";
    }

    public View getView()
    {
        return mViewGroup;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        cancelRequestsInFlight();
    }

    protected void onPageView()
    {
        super.onPageView();
        GoogleAnalytics.trackPageView("Ratings & Review Details");
        GoogleAnalytics.trackPageView("Ratings & Review Details");
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "product detail:review details").putString("section", "shop").putString("itemId", mItemId).putString("prodType", mProdType);
        MessageBus.getBus().post(builder);
    }







}
