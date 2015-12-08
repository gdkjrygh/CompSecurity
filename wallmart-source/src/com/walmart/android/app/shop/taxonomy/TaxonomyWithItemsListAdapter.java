// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.walmart.android.app.shop.ShelfItemCardView;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.browsepersonalization.BrowsePersonalizationService;
import com.walmart.android.service.browsepersonalization.LeafItems;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TaxonomyWithItemsListAdapter extends BaseAdapter
{
    public static interface OnItemClickedListener
    {

        public abstract void onItemClicked(com.walmart.android.data.StoreQueryResult.Item item);
    }


    private static final String CARD_VIEW_TAG = "CARD";
    private static final int MAX_ITEMS = 5;
    private static final int MIN_ITEMS = 2;
    public static final String TAG = com/walmart/android/app/shop/taxonomy/TaxonomyWithItemsListAdapter.getSimpleName();
    private Context mContext;
    private HashMap mData;
    private boolean mIsShutdown;
    private OnItemClickedListener mOnItemClickedListener;
    private HashSet mRequestsInFlight;
    private ArrayList mScrapViews;
    private ArrayList mTaxonomyItems;

    public TaxonomyWithItemsListAdapter(Context context)
    {
        mData = new HashMap();
        mRequestsInFlight = new HashSet();
        mScrapViews = new ArrayList();
        mContext = context;
        mTaxonomyItems = new ArrayList();
    }

    private void fetchItems(View view, TaxonomyItem taxonomyitem)
    {
        if (mRequestsInFlight.contains(taxonomyitem.id) || TextUtils.isEmpty(taxonomyitem.id))
        {
            return;
        } else
        {
            mRequestsInFlight.add(taxonomyitem.id);
            Services.get().getBrowsePersonalizationService().getLeafItems(taxonomyitem.id, "All", "RELEVANCE", 0, 5, new AsyncCallbackOnThread(view) {

                final TaxonomyWithItemsListAdapter this$0;
                final View val$listEntryView;
                final TaxonomyItem val$taxonomyItem;

                public void onFailureSameThread(Integer integer, LeafItems aleafitems[])
                {
                    mRequestsInFlight.remove(taxonomyItem.id);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (LeafItems[])obj1);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((LeafItems[])obj);
                }

                public void onSuccessSameThread(LeafItems aleafitems[])
                {
                    mRequestsInFlight.remove(taxonomyItem.id);
                    if (!mIsShutdown)
                    {
                        mData.put(taxonomyItem.id, aleafitems);
                        if (taxonomyItem.id.equals(listEntryView.getTag()))
                        {
                            listEntryView.findViewById(0x7f100096).setVisibility(8);
                            listEntryView.findViewById(0x7f1005cf).setVisibility(0);
                            populateItems(listEntryView, aleafitems, taxonomyItem);
                        }
                    }
                }

            
            {
                this$0 = TaxonomyWithItemsListAdapter.this;
                taxonomyItem = taxonomyitem;
                listEntryView = view;
                super(final_handler);
            }
            });
            return;
        }
    }

    private ViewGroup getCardView(ViewGroup viewgroup)
    {
        if (mScrapViews.isEmpty())
        {
            viewgroup = (ViewGroup)ViewUtil.inflate(mContext, 0x7f040191, viewgroup);
            viewgroup.setTag("CARD");
            return viewgroup;
        } else
        {
            return (ViewGroup)mScrapViews.remove(mScrapViews.size() - 1);
        }
    }

    private void populateFields(View view, int i, ViewGroup viewgroup)
    {
        TaxonomyItem taxonomyitem = (TaxonomyItem)mTaxonomyItems.get(i);
        ViewUtil.setText(0x7f1005ce, view, taxonomyitem.name);
        setupView(view, viewgroup);
        viewgroup = (LinearLayout)ViewUtil.findViewById(view, 0x7f1005cf);
        view.setTag(taxonomyitem.id);
        if (mData.containsKey(taxonomyitem.id))
        {
            view.findViewById(0x7f100096).setVisibility(8);
            populateItems(view, (LeafItems[])mData.get(taxonomyitem.id), taxonomyitem);
            viewgroup.setVisibility(0);
            return;
        } else
        {
            view.findViewById(0x7f100096).setVisibility(0);
            fetchItems(view, taxonomyitem);
            viewgroup.setVisibility(4);
            return;
        }
    }

    private void populateItems(View view, LeafItems aleafitems[], TaxonomyItem taxonomyitem)
    {
        view = (LinearLayout)ViewUtil.findViewById(view, 0x7f1005cf);
        int j = (view.getChildCount() + 1) / 2;
        aleafitems = new com.walmart.android.service.browsepersonalization.LeafItems.LeafItemIterator(aleafitems);
        int i;
        for (i = 0; aleafitems.hasNext() && i < j; i++)
        {
            taxonomyitem = (ViewGroup)view.getChildAt(i * 2);
            final com.walmart.android.data.StoreQueryResult.Item item = (com.walmart.android.data.StoreQueryResult.Item)aleafitems.next();
            ((ShelfItemCardView)taxonomyitem).setItem(item);
            taxonomyitem.setOnClickListener(new android.view.View.OnClickListener() {

                final TaxonomyWithItemsListAdapter this$0;
                final com.walmart.android.data.StoreQueryResult.Item val$item;

                public void onClick(View view1)
                {
                    if (mOnItemClickedListener != null)
                    {
                        mOnItemClickedListener.onItemClicked(item);
                    }
                }

            
            {
                this$0 = TaxonomyWithItemsListAdapter.this;
                item = item1;
                super();
            }
            });
            taxonomyitem.setVisibility(0);
        }

        for (i = Math.max(i * 2 - 1, 0); i < view.getChildCount(); i++)
        {
            aleafitems = view.getChildAt(i);
            if ("CARD".equals(aleafitems.getTag()))
            {
                aleafitems.setVisibility(4);
            }
        }

    }

    private void setupView(View view, ViewGroup viewgroup)
    {
        int i = mContext.getResources().getDimensionPixelSize(0x7f0a006d);
        int j = Math.min(5, Math.max(viewgroup.getWidth() / mContext.getResources().getDimensionPixelSize(0x7f0a006f), 2));
        view = (LinearLayout)ViewUtil.findViewById(view, 0x7f1005cf);
        for (j = j * 2 - 1; view.getChildCount() < j; view.addView(viewgroup))
        {
            if (view.getChildCount() > 0)
            {
                view.addView(new View(mContext), new android.widget.LinearLayout.LayoutParams(i, -1));
            }
            viewgroup = getCardView(view);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)viewgroup.getLayoutParams();
            layoutparams.width = 0;
            layoutparams.weight = 1.0F;
            viewgroup.setVisibility(4);
        }

        for (; view.getChildCount() > j; view.removeViewAt(view.getChildCount() - 1))
        {
            viewgroup = view.getChildAt(view.getChildCount() - 1);
            if ("CARD".equals(viewgroup.getTag()))
            {
                mScrapViews.add((ViewGroup)viewgroup);
            }
        }

    }

    public int getCount()
    {
        return mTaxonomyItems.size();
    }

    public Object getItem(int i)
    {
        return mTaxonomyItems.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ViewUtil.inflate(mContext, 0x7f0401b4, viewgroup);
        }
        populateFields(view, i, viewgroup);
        return view;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    public void setOnItemClickedListener(OnItemClickedListener onitemclickedlistener)
    {
        mOnItemClickedListener = onitemclickedlistener;
    }

    public void setTaxonomyItems(TaxonomyItem ataxonomyitem[])
    {
        mTaxonomyItems.clear();
        int j = ataxonomyitem.length;
        for (int i = 0; i < j; i++)
        {
            TaxonomyItem taxonomyitem = ataxonomyitem[i];
            mTaxonomyItems.add(taxonomyitem);
        }

        notifyDataSetChanged();
    }

    public void shutdown()
    {
        mIsShutdown = true;
    }






}
