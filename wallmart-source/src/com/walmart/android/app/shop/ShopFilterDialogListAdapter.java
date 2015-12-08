// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;

public class ShopFilterDialogListAdapter extends BaseAdapter
{

    public static final String TAG = com/walmart/android/app/shop/ShopFilterDialogListAdapter.getSimpleName();
    public static final String TAG_ENTRY_SHOP_DIALOG_FILTER = "SHOP_DIALOG_FILTER_ENTRY";
    private LayoutInflater mInflater;
    private com.walmart.android.data.StoreQueryResult.RefinementGroup mRefinementGroup;
    private ArrayList mSelectedRefinements;

    public ShopFilterDialogListAdapter(Context context, ArrayList arraylist)
    {
        mSelectedRefinements = arraylist;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    private void populateFields(View view, final com.walmart.android.data.StoreQueryResult.Refinement refinement, int i)
    {
        view = (CheckedTextView)ViewUtil.findViewById(view, 0x7f100088);
        String s = Html.fromHtml(refinement.getName()).toString();
        String s1 = refinement.getStats();
        if (!TextUtils.isEmpty(s1))
        {
            view.setText((new StringBuilder()).append(s).append(" (").append(s1).append(")").toString());
        } else
        {
            view.setText(s);
        }
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ShopFilterDialogListAdapter this$0;
            final com.walmart.android.data.StoreQueryResult.Refinement val$refinement;

            public void onClick(View view1)
            {
                if (((CheckBox)view1).isChecked())
                {
                    mSelectedRefinements.add(refinement);
                    return;
                } else
                {
                    mSelectedRefinements.remove(refinement);
                    return;
                }
            }

            
            {
                this$0 = ShopFilterDialogListAdapter.this;
                refinement = refinement1;
                super();
            }
        });
        view.setChecked(mSelectedRefinements.contains(refinement));
    }

    public void cleanUp()
    {
        mRefinementGroup = null;
    }

    public void clear()
    {
        mRefinementGroup = null;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        int i = 0;
        com.walmart.android.data.StoreQueryResult.Refinement arefinement[] = mRefinementGroup.getRefinements();
        if (arefinement != null)
        {
            i = arefinement.length;
        }
        return i;
    }

    public Object getItem(int i)
    {
        com.walmart.android.data.StoreQueryResult.Refinement refinement = null;
        com.walmart.android.data.StoreQueryResult.Refinement arefinement[] = mRefinementGroup.getRefinements();
        if (i < arefinement.length)
        {
            refinement = arefinement[i];
        }
        return refinement;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, final ViewGroup item)
    {
        if (view == null || view.getTag() != "SHOP_DIALOG_FILTER_ENTRY")
        {
            view = mInflater.inflate(0x7f04003f, item, false);
            view.setTag("SHOP_DIALOG_FILTER_ENTRY");
        }
        item = mRefinementGroup.getRefinements()[i];
        populateFields(view, item, i);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final ShopFilterDialogListAdapter this$0;
            final com.walmart.android.data.StoreQueryResult.Refinement val$item;

            public void onClick(View view1)
            {
                view1 = (CheckedTextView)ViewUtil.findViewById(view1, 0x7f100088);
                boolean flag;
                if (!view1.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view1.setChecked(flag);
                if (view1.isChecked())
                {
                    mSelectedRefinements.add(item);
                    return;
                } else
                {
                    mSelectedRefinements.remove(item);
                    return;
                }
            }

            
            {
                this$0 = ShopFilterDialogListAdapter.this;
                item = refinement;
                super();
            }
        });
        return view;
    }

    public void onStart()
    {
        notifyDataSetChanged();
    }

    public void onStop()
    {
        notifyDataSetChanged();
    }

    public void setRefinementGroup(com.walmart.android.data.StoreQueryResult.RefinementGroup refinementgroup)
    {
        mRefinementGroup = refinementgroup;
    }


}
