// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.SearchResultsEvent;
import com.walmart.android.app.shop.itemloader.PagingLoader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ui.recycler.BasicRecyclerView;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter, ShelfAdapter, ShopFilterManager, BarcodeShelfHeaderView

protected class this._cls0
    implements com.walmart.android.app.shop.itemloader.
{

    private final String TAG = com/walmart/android/app/shop/ShelfPresenter$ItemLoaderListener.getSimpleName();
    final ShelfPresenter this$0;

    public void onBatchLoaded()
    {
        WLog.d(TAG, "onBatchLoaded()");
    }

    public void onFirstBatchLoaded(int i)
    {
        WLog.d(TAG, (new StringBuilder()).append("onFirstBatchLoaded(").append(i).append(")").toString());
        if (!isPopped())
        {
            if (mMode == 3)
            {
                mLoader.setDone();
            }
            if (mMode == 1)
            {
                checkPharmacyHeader();
            }
            if (mIsPushed)
            {
                mItemsView.setVisibility(0);
                mLoadingView.setVisibility(8);
            }
            if (mMode == 1)
            {
                ArrayList arraylist = new ArrayList();
                List list = Collections.singletonList(ShelfPresenter.access$200(ShelfPresenter.this));
                ArrayList arraylist1 = new ArrayList();
                ArrayList arraylist2 = new ArrayList();
                ArrayList arraylist3 = new ArrayList();
                int j = 0;
                while (j < mAdapter.getDataItemCount()) 
                {
                    com.walmart.android.data.ner ner = (com.walmart.android.data.ner.this._cls0)mAdapter.getItem(j);
                    if (!ner.m())
                    {
                        String s;
                        if (!TextUtils.isEmpty(ner.m()))
                        {
                            s = ner.m();
                        } else
                        {
                            s = "null";
                        }
                        arraylist.add(s);
                        if (!TextUtils.isEmpty(ner.ability()))
                        {
                            s = ner.ability();
                        } else
                        {
                            s = "null";
                        }
                        arraylist1.add(s);
                        if (!TextUtils.isEmpty(ner.ability()))
                        {
                            s = ner.ability().substring(ner.ability().indexOf("$") + 1, ner.ability().length());
                        } else
                        {
                            s = "null";
                        }
                        arraylist2.add(s);
                        if (!TextUtils.isEmpty(ner.e()))
                        {
                            s = ner.e();
                        } else
                        {
                            s = "null";
                        }
                        arraylist3.add(s);
                    }
                    j++;
                }
                MessageBus.getBus().post(new SearchResultsEvent(mSearchQuery, i, StringUtils.join(mFilterManager.getRefinementIds(), ","), StringUtils.join(arraylist.toArray(), ","), StringUtils.join(list.toArray(), ","), StringUtils.join(arraylist1.toArray(), ","), StringUtils.join(arraylist2.toArray(), ","), StringUtils.join(arraylist3.toArray(), ",")));
            }
        }
    }

    public void onLoadFailed(com.walmart.android.app.shop.itemloader. , int i)
    {
        WLog.d(TAG, "onLoadFailed()");
        if (!isPopped())
        {
            if (com.walmart.android.app.shop.itemloader.S.S())
            {
                if (mMode == 1)
                {
                    i = getInterceptSearchType();
                    if (i != 0)
                    {
                        handleInterceptType(i);
                    } else
                    {
                         = mActivity.getResources().getString(0x7f09056f, new Object[] {
                            mSearchQuery
                        });
                        showMessageText();
                    }
                } else
                if (mMode == 3 && getBarcodeHeader() != null)
                {
                    getBarcodeHeader().setNoProductsFound(true);
                } else
                {
                    DialogFactory.showDialog(901, mActivity);
                    ShelfPresenter.access$300(ShelfPresenter.this);
                }
            } else
            if (mMode == 1 && getInterceptSearchType() != 0)
            {
                handleInterceptType(getInterceptSearchType());
            } else
            {
                DialogFactory.showErrorDialog(mActivity, i);
            }
            mLoadingView.setVisibility(8);
        }
    }

    protected r()
    {
        this$0 = ShelfPresenter.this;
        super();
    }
}
