// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;
import java.util.ArrayList;
import java.util.Iterator;

public class BreadcrumbTaxonomyListAdapter extends BaseAdapter
{

    public static final String TAG = com/walmart/android/app/shop/taxonomy/BreadcrumbTaxonomyListAdapter.getSimpleName();
    private final int mColorBlue;
    private final int mColorVisitedLight;
    private Context mContext;
    private ArrayList mTaxonomyItems;
    private ArrayList mVisitedItems;

    public BreadcrumbTaxonomyListAdapter(Context context)
    {
        mContext = context;
        mVisitedItems = new ArrayList();
        mTaxonomyItems = new ArrayList();
        mColorBlue = context.getResources().getColor(0x7f0f0109);
        mColorVisitedLight = context.getResources().getColor(0x7f0f0108);
    }

    public int getCount()
    {
        return mVisitedItems.size() + mTaxonomyItems.size();
    }

    public Object getItem(int i)
    {
        if (i < mVisitedItems.size())
        {
            return mVisitedItems.get(i);
        }
        i -= mVisitedItems.size();
        if (i < mTaxonomyItems.size())
        {
            return mTaxonomyItems.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public TaxonomyItem getLastVisitedItem()
    {
        return (TaxonomyItem)mVisitedItems.get(mVisitedItems.size() - 1);
    }

    public TaxonomyItem getTaxonomyItem(int i)
    {
        if (i < mVisitedItems.size())
        {
            return (TaxonomyItem)mVisitedItems.get(i);
        } else
        {
            return (TaxonomyItem)mTaxonomyItems.get(i - mVisitedItems.size());
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        TextView textview;
        view1 = view;
        if (view == null)
        {
            view1 = ViewUtil.inflate(mContext, 0x7f0401b2, viewgroup);
        }
        textview = (TextView)ViewUtil.findViewById(view1, 0x7f1005ce);
        if (i >= mVisitedItems.size() - 1) goto _L2; else goto _L1
_L1:
        int j;
        view = (TaxonomyItem)mVisitedItems.get(i);
        i = mColorBlue;
        viewgroup = com.walmart.android.wmui.Typefaces.Family.LIGHT;
        j = mColorVisitedLight;
_L4:
        textview.setTextColor(i);
        textview.setTypeface(Typefaces.create(mContext, viewgroup));
        textview.setText(((TaxonomyItem) (view)).name);
        view1.findViewById(0x7f1005cd).setBackgroundColor(j);
        return view1;
_L2:
        if (i < mVisitedItems.size())
        {
            view = (TaxonomyItem)mVisitedItems.get(i);
            i = mColorBlue;
            viewgroup = com.walmart.android.wmui.Typefaces.Family.MEDIUM;
            j = mColorBlue;
            continue; /* Loop/switch isn't completed */
        }
        view = (TaxonomyItem)mTaxonomyItems.get(i - mVisitedItems.size());
        if (((TaxonomyItem) (view)).clientStyling != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        i = mContext.getResources().getColor(0x7f0f0010);
_L5:
        viewgroup = com.walmart.android.wmui.Typefaces.Family.LIGHT;
        j = -1;
        if (true) goto _L4; else goto _L3
_L3:
        if (((TaxonomyItem) (view)).clientStyling == 1)
        {
            i = mContext.getResources().getColor(0x7f0f0124);
        } else
        {
            i = mContext.getResources().getColor(0x7f0f0011);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean isEnabled(int i)
    {
        return i != mVisitedItems.size() - 1;
    }

    public boolean isVisitedItem(int i)
    {
        return i < mVisitedItems.size();
    }

    public boolean isVisitedItem(TaxonomyItem taxonomyitem)
    {
        return mVisitedItems.contains(taxonomyitem);
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

    public void unvisitItem(TaxonomyItem taxonomyitem)
    {
        Iterator iterator = mVisitedItems.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (flag)
            {
                iterator.next();
                iterator.remove();
            } else
            if (taxonomyitem.id.equals(((TaxonomyItem)iterator.next()).id))
            {
                flag = true;
                iterator.remove();
            }
        } while (true);
    }

    public int visitItem(TaxonomyItem taxonomyitem)
    {
        mVisitedItems.add(taxonomyitem);
        mTaxonomyItems.remove(taxonomyitem);
        return mVisitedItems.size();
    }

}
