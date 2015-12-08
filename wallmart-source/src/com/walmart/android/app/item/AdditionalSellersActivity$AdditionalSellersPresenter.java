// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.item:
//            AdditionalSellersActivity

private static class mActivity extends Presenter
{

    private final AdditionalSellersActivity mActivity;
    private final mActivity mAdapter;
    private View mRootView;

    public View getView()
    {
        if (mRootView != null)
        {
            ListRecyclerView listrecyclerview = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f1001aa);
            listrecyclerview.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

                final AdditionalSellersActivity.AdditionalSellersPresenter this$0;

                public void onItemClick(BasicViewHolder basicviewholder, int i)
                {
                    basicviewholder = mAdapter.getItem(i);
                    mActivity.finishWithSellerId(((AdditionalSellersActivity.SellerInfo) (basicviewholder)).id);
                }

            
            {
                this$0 = AdditionalSellersActivity.AdditionalSellersPresenter.this;
                super();
            }
            });
            listrecyclerview.setAdapter(mAdapter);
        }
        return mRootView;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040078);
        }
    }



    public _cls1.this._cls0(Activity activity, ArrayList arraylist, String s)
    {
        mActivity = (AdditionalSellersActivity)activity;
        mAdapter = new mAdapter(mActivity, arraylist, s);
        setTitleText(mActivity.getString(0x7f09016b));
    }
}
