// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.PriceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SaverReceiptItemListAdapter extends BaseAdapter
{

    static final String TAG = com/walmart/android/app/saver/SaverReceiptItemListAdapter.getSimpleName();
    private final Context mContext;
    private final ArrayList mCoupons = new ArrayList();
    private int mEmptyTextId;
    private final ArrayList mItems = new ArrayList();
    private int mLowerPricesFound;
    private final SparseArray mSectionForStartPosition = new SparseArray();
    private boolean mShowSaverInfo;

    public SaverReceiptItemListAdapter(Context context)
    {
        mContext = context;
    }

    private void fixHeight(TextView textview, ViewGroup viewgroup)
    {
        int i = viewgroup.getHeight();
        int l = i;
        if (viewgroup instanceof ListView)
        {
            l = ((ListView)viewgroup).getHeaderViewsCount();
            for (int j = 0; j < l; j++)
            {
                i -= viewgroup.getChildAt(j).getHeight();
            }

            int i1 = ((ListView)viewgroup).getFooterViewsCount();
            int k = 1;
            do
            {
                l = i;
                if (k > i1)
                {
                    break;
                }
                i -= viewgroup.getChildAt(viewgroup.getChildCount() - k).getHeight();
                k++;
            } while (true);
        }
        textview.setMinimumHeight(l);
    }

    private int getSectionHeaderResource(com.walmart.android.service.saver.SaverReceipt.Item item)
    {
        if (item.competitor == null)
        {
            return 0x7f0904f4;
        }
        if (!item.hasCompetitorLowerPrice())
        {
            return 0x7f0904f3;
        } else
        {
            mLowerPricesFound = mLowerPricesFound + 1;
            return 0x7f0904f2;
        }
    }

    private void onDataSetChanged()
    {
        updateSections();
        notifyDataSetChanged();
    }

    private void populateFields(View view, int i, String s)
    {
        com.walmart.android.service.saver.SaverReceipt.Item item = (com.walmart.android.service.saver.SaverReceipt.Item)mItems.get(i);
        if (TextUtils.isEmpty(s))
        {
            ViewUtil.findViewById(view, 0x7f1004da).setVisibility(8);
        } else
        {
            ViewUtil.findViewById(view, 0x7f1004da).setVisibility(0);
            ViewUtil.setTextHideIfEmpty(0x7f1004db, view, s);
        }
        ViewUtil.setText(0x7f1000fd, view, item.getDisplayName());
        ViewUtil.setText(0x7f1004df, view, mContext.getString(0x7f0900fc, new Object[] {
            Float.valueOf(item.getPriceInDollar())
        }));
        s = (TextView)ViewUtil.findViewById(view, 0x7f1000fe);
        if (item.quantity > 1.0F && item.unitType == null)
        {
            s.setText(mContext.getString(0x7f0900fd, new Object[] {
                Integer.valueOf((int)item.quantity), Float.valueOf(item.getUnitPriceInDollar())
            }));
            s.setVisibility(0);
        } else
        if ("lb".equalsIgnoreCase(item.unitType))
        {
            s.setText(mContext.getString(0x7f0900fb, new Object[] {
                Float.valueOf(item.quantity), Integer.valueOf(item.unitQuantity), Float.valueOf(item.getUnitPriceInDollar())
            }));
            s.setVisibility(0);
        } else
        {
            s.setVisibility(8);
        }
        s = Picasso.with(mContext).load(item.productImageUrl).error(0x7f02021b);
        if (item.productImageUrl == null)
        {
            s.placeholder(0x7f02021b);
        }
        s.into((ImageView)view.findViewById(0x7f1000fa));
        if (mShowSaverInfo)
        {
            if (item.competitor != null)
            {
                ViewUtil.setText(0x7f1004e0, view, item.competitor.competitorName);
                ViewUtil.setText(0x7f1004e1, view, mContext.getString(0x7f0900fc, new Object[] {
                    Float.valueOf((float)item.getCompetitorPrice() * 0.01F)
                }));
                s = (TextView)ViewUtil.findViewById(view, 0x7f1004e2);
                TextView textview = (TextView)ViewUtil.findViewById(view, 0x7f1004e3);
                if (item.hasCompetitorLowerPrice())
                {
                    s.setVisibility(0);
                    textview.setVisibility(0);
                    s.setText(0x7f0904f5);
                    s.setTextColor(mContext.getResources().getColor(0x7f0f00e3));
                    textview.setText(mContext.getString(0x7f0900fc, new Object[] {
                        Float.valueOf((float)item.getCompetitorPriceDiff() * 0.01F)
                    }));
                    textview.setTextColor(mContext.getResources().getColor(0x7f0f00e3));
                } else
                if (item.getCompetitorPriceDiff() != 0)
                {
                    s.setVisibility(0);
                    textview.setVisibility(0);
                    s.setText(0x7f0904f0);
                    s.setTextColor(mContext.getResources().getColor(0x7f0f00db));
                    textview.setText(mContext.getString(0x7f0900fc, new Object[] {
                        Float.valueOf((float)(-item.getCompetitorPriceDiff()) * 0.01F)
                    }));
                    textview.setTextColor(mContext.getResources().getColor(0x7f0f00db));
                } else
                {
                    s.setVisibility(8);
                    textview.setVisibility(8);
                }
                view.findViewById(0x7f1004e0).setVisibility(0);
                view.findViewById(0x7f1004e1).setVisibility(0);
                view.findViewById(0x7f1004e4).setVisibility(8);
            } else
            {
                view.findViewById(0x7f1004e0).setVisibility(8);
                view.findViewById(0x7f1004e1).setVisibility(8);
                view.findViewById(0x7f1004e2).setVisibility(8);
                view.findViewById(0x7f1004e3).setVisibility(8);
                view.findViewById(0x7f1004e4).setVisibility(0);
            }
            view.findViewById(0x7f1004de).setVisibility(0);
            view.findViewById(0x7f100116).setVisibility(8);
            return;
        } else
        {
            view.findViewById(0x7f1004de).setVisibility(8);
            view.findViewById(0x7f1004e4).setVisibility(8);
            view = (PriceView)ViewUtil.findViewById(view, 0x7f100116);
            view.setPrice(mContext.getString(0x7f0900fc, new Object[] {
                Float.valueOf(item.getPriceInDollar())
            }));
            view.setVisibility(0);
            return;
        }
    }

    private void updateSections()
    {
        mSectionForStartPosition.clear();
        mLowerPricesFound = 0;
        if (mItems.size() != 0)
        {
            int j = getSectionHeaderResource((com.walmart.android.service.saver.SaverReceipt.Item)mItems.get(0));
            mSectionForStartPosition.put(0, Integer.valueOf(j));
            int i = 0 + 1;
            while (i < mItems.size()) 
            {
                int k = getSectionHeaderResource((com.walmart.android.service.saver.SaverReceipt.Item)mItems.get(i));
                if (k != j)
                {
                    mSectionForStartPosition.put(i, Integer.valueOf(k));
                }
                j = k;
                i++;
            }
        }
    }

    public void addItems(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            com.walmart.android.service.saver.SaverReceipt.Item item = (com.walmart.android.service.saver.SaverReceipt.Item)list.next();
            if (item != null)
            {
                if (item.coupon)
                {
                    mCoupons.add(item);
                } else
                {
                    mItems.add(item);
                }
            }
        } while (true);
        onDataSetChanged();
    }

    public void finish()
    {
        mItems.clear();
    }

    public int getCount()
    {
        if (mItems.size() == 0)
        {
            return mEmptyTextId <= 0 ? 0 : 1;
        } else
        {
            return mItems.size();
        }
    }

    public int getCouponSavings()
    {
        int i = 0;
        for (Iterator iterator = mCoupons.iterator(); iterator.hasNext();)
        {
            i += ((com.walmartlabs.ereceipt.service.EReceipt.Item)iterator.next()).getPrice();
        }

        return i;
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemSubtotal()
    {
        int i = 0;
        for (Iterator iterator = mItems.iterator(); iterator.hasNext();)
        {
            i += ((com.walmart.android.service.saver.SaverReceipt.Item)iterator.next()).getPrice();
        }

        return i;
    }

    public int getLowerPricesFound()
    {
        return mLowerPricesFound;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (mItems.isEmpty())
        {
            view = ViewUtil.inflate(mContext, 0x7f040166, viewgroup, false);
            if (mEmptyTextId > 0)
            {
                TextView textview = (TextView)ViewUtil.findViewById(view, 0x7f1004d8);
                textview.setText(mEmptyTextId);
                textview.setVisibility(0);
                fixHeight(textview, viewgroup);
            }
            return view;
        }
        View view1 = view;
        view = view1;
        if (view1 == null)
        {
            view = ViewUtil.inflate(mContext, 0x7f040168, viewgroup, false);
        }
        view1 = null;
        viewgroup = view1;
        if (mShowSaverInfo)
        {
            viewgroup = view1;
            if (mSectionForStartPosition.get(i) != null)
            {
                viewgroup = mContext.getString(((Integer)mSectionForStartPosition.get(i)).intValue());
            }
        }
        populateFields(view, i, viewgroup);
        return view;
    }

    public boolean isEnabled(int i)
    {
        return !mItems.isEmpty();
    }

    public void setEmptyText(int i)
    {
        if (i != mEmptyTextId)
        {
            notifyDataSetChanged();
        }
        mEmptyTextId = i;
    }

    public void setItems(List list)
    {
        mItems.clear();
        mCoupons.clear();
        addItems(list);
    }

    public void setShowSaverInfo(boolean flag)
    {
        if (flag != mShowSaverInfo)
        {
            notifyDataSetChanged();
        }
        mShowSaverInfo = flag;
    }

}
