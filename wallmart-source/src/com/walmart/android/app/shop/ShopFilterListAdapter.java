// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterManager

public class ShopFilterListAdapter extends BaseAdapter
{

    public static final String TAG = com/walmart/android/app/shop/ShopFilterListAdapter.getSimpleName();
    public static final String TAG_ENTRY_SHOP_FILTER = "SHOP_FILTER_ENTRY";
    private Activity mActivity;
    private LayoutInflater mInflater;
    private View mLoadingEntry;
    private ArrayList mRefinementGroupItems;
    private ShopFilterManager mShopFilterManager;

    public ShopFilterListAdapter(Activity activity, ShopFilterManager shopfiltermanager)
    {
        mActivity = activity;
        mShopFilterManager = shopfiltermanager;
        mRefinementGroupItems = new ArrayList();
        mInflater = (LayoutInflater)mActivity.getSystemService("layout_inflater");
        mLoadingEntry = mInflater.inflate(0x7f0401ac, null);
        ((TextView)mLoadingEntry.findViewById(0x7f100574)).setVisibility(8);
    }

    private void populateFields(View view, com.walmart.android.data.StoreQueryResult.RefinementGroup refinementgroup)
    {
        ViewGroup viewgroup = (ViewGroup)view;
        ((TextView)viewgroup.findViewById(0x7f100575)).setText(Html.fromHtml(refinementgroup.getName()).toString());
        view = new StringBuilder();
        Iterator iterator = mShopFilterManager.getRefinements().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.walmart.android.data.StoreQueryResult.Refinement refinement = (com.walmart.android.data.StoreQueryResult.Refinement)iterator.next();
            if (refinementgroup.getName().equals(refinement.getParent()))
            {
                if (view.length() > 0)
                {
                    view.append(", ");
                }
                view.append(refinement.getName());
            }
        } while (true);
        refinementgroup = (TextView)ViewUtil.findViewById(viewgroup, 0x7f100576);
        if (view.length() > 0)
        {
            refinementgroup.setText(Html.fromHtml(view.toString()));
            refinementgroup.setVisibility(0);
            return;
        } else
        {
            refinementgroup.setVisibility(8);
            return;
        }
    }

    public void cleanUp()
    {
        mRefinementGroupItems.clear();
    }

    public void clear()
    {
        mRefinementGroupItems.clear();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return mRefinementGroupItems.size();
    }

    public Object getItem(int i)
    {
        com.walmart.android.data.StoreQueryResult.RefinementGroup refinementgroup = null;
        if (i < mRefinementGroupItems.size())
        {
            refinementgroup = (com.walmart.android.data.StoreQueryResult.RefinementGroup)mRefinementGroupItems.get(i);
        }
        return refinementgroup;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i < mRefinementGroupItems.size())
        {
            if (view == null || view.getTag() != "SHOP_FILTER_ENTRY")
            {
                view = mInflater.inflate(0x7f040196, viewgroup, false);
                view.setTag("SHOP_FILTER_ENTRY");
            }
            populateFields(view, (com.walmart.android.data.StoreQueryResult.RefinementGroup)mRefinementGroupItems.get(i));
            return view;
        } else
        {
            return mLoadingEntry;
        }
    }

    public void onStart()
    {
        notifyDataSetChanged();
    }

    public void onStop()
    {
        notifyDataSetChanged();
    }

    public void setRefinementGroups(com.walmart.android.data.StoreQueryResult.RefinementGroup arefinementgroup[])
    {
        mRefinementGroupItems.addAll(Arrays.asList(arefinementgroup));
    }

}
