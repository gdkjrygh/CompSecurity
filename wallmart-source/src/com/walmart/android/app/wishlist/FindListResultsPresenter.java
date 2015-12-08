// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SearchListParams, FindListLoader, FindListResultsAdapter, GiverItemListPresenter

public class FindListResultsPresenter extends Presenter
{

    private final AppCompatActivity mActivity;
    private FindListResultsAdapter mAdapter;
    private View mLoadingView;
    private TextView mNoResultsQuery;
    private View mNoResultsView;
    private View mResultListHeader;
    private TextView mResultListHeaderText;
    private ListRecyclerView mResultListView;
    private View mRootView;
    private final SearchListParams mSearchParams;
    private View mTryAgainButton;

    public FindListResultsPresenter(AppCompatActivity appcompatactivity, SearchListParams searchlistparams)
    {
        mActivity = appcompatactivity;
        mSearchParams = searchlistparams;
    }

    private String getFormattedSearchCriteria()
    {
        StringBuilder stringbuilder = new StringBuilder("\"");
        if (!TextUtils.isEmpty(mSearchParams.mFirstName))
        {
            stringbuilder.append(mSearchParams.mFirstName).append(" ");
        }
        stringbuilder.append(mSearchParams.mLastName).append("\"");
        if (!TextUtils.isEmpty(mSearchParams.mState))
        {
            stringbuilder.append(mActivity.getString(0x7f09064c)).append(mSearchParams.mState);
        }
        return stringbuilder.toString();
    }

    private void postPageViewEvent(int i)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "find list results").putString("section", "lists").putInt("resultNumber", i);
        MessageBus.getBus().post(builder);
    }

    private void showNoResultsFound()
    {
        mLoadingView.setVisibility(8);
        mResultListView.setVisibility(8);
        mNoResultsView.setVisibility(0);
        mNoResultsQuery.setText(getFormattedSearchCriteria());
    }

    private void showResults(int i)
    {
        mLoadingView.setVisibility(8);
        mResultListView.setVisibility(0);
        mNoResultsView.setVisibility(8);
        mResultListHeaderText.setText(mActivity.getResources().getQuantityString(0x7f110014, i, new Object[] {
            Integer.valueOf(i), getFormattedSearchCriteria()
        }));
    }

    private void wireListeners()
    {
        mTryAgainButton.setOnClickListener(new OnSingleClickListener(this) {

            final FindListResultsPresenter this$0;

            public void onSingleClick(View view)
            {
                pop();
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listSearchAgainTap"));
            }

            
            {
                this$0 = FindListResultsPresenter.this;
                super(presenter);
            }
        });
        mResultListView.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final FindListResultsPresenter this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                basicviewholder = (WishList)mAdapter.getItem(i);
                pushPresenter(new GiverItemListPresenter(mActivity, basicviewholder));
            }

            
            {
                this$0 = FindListResultsPresenter.this;
                super();
            }
        });
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09062d);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePush()
    {
        FindListLoader findlistloader = new FindListLoader(mActivity, mSearchParams);
        findlistloader.setCallback(new FindListLoader.Callback() {

            final FindListResultsPresenter this$0;

            public void onError(int i, boolean flag)
            {
                DialogFactory.showErrorDialog(mActivity, i);
                if (flag)
                {
                    pop();
                }
            }

            public void onFirstResultBatch(int i)
            {
                if (i > 0)
                {
                    showResults(i);
                } else
                {
                    showNoResultsFound();
                }
                postPageViewEvent(i);
            }

            
            {
                this$0 = FindListResultsPresenter.this;
                super();
            }
        });
        mAdapter.setAndStartLoader(findlistloader);
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
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401f6);
            mResultListHeader = ViewUtil.inflate(mActivity, 0x7f0401e3);
            mResultListHeaderText = (TextView)ViewUtil.findViewById(mResultListHeader, 0x7f100634);
            mResultListView = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f100636);
            mResultListView.addHeaderView(mResultListHeader);
            mAdapter = new FindListResultsAdapter(mActivity);
            mResultListView.setAdapter(mAdapter);
            mLoadingView = ViewUtil.findViewById(mRootView, 0x7f10068a);
            mNoResultsView = ViewUtil.findViewById(mRootView, 0x7f100689);
            mNoResultsQuery = (TextView)ViewUtil.findViewById(mRootView, 0x7f100687);
            mTryAgainButton = ViewUtil.findViewById(mRootView, 0x7f100688);
            wireListeners();
        }
    }








}
