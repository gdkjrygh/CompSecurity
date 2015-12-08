// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.ui.ImageViewExtended;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.util.List;

public class FastPickupAdapter extends BaseExpandableListAdapter
{
    private static class ViewHolder
    {

        public final ImageViewExtended image;
        public final TextView qty;
        public final TextView title;

        private ViewHolder(TextView textview, TextView textview1, ImageViewExtended imageviewextended)
        {
            title = textview;
            qty = textview1;
            image = imageviewextended;
        }

    }


    private static final String TAG = com/walmart/android/app/fastpickup/FastPickupAdapter.getSimpleName();
    private final Context mContext;
    private List mOrders;

    public FastPickupAdapter(Context context, FastPickupOrder fastpickuporder, String s)
    {
        mContext = context;
        mOrders = fastpickuporder.getOrdersForStore(s);
    }

    private boolean isSameOrder(FastPickupOrder fastpickuporder, FastPickupOrder fastpickuporder1)
    {
        if (fastpickuporder == null)
        {
            return fastpickuporder1 == null;
        } else
        {
            return fastpickuporder.equals(fastpickuporder1);
        }
    }

    private void setViewProperties(int i, int j, View view)
    {
        view = (ViewHolder)view.getTag();
        if (mOrders != null && !mOrders.isEmpty())
        {
            com.walmart.android.data.FastPickupOrder.Item item = (com.walmart.android.data.FastPickupOrder.Item)((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).items.get(j);
            ((ViewHolder) (view)).title.setText(item.productName);
            String s = mContext.getString(0x7f09011a, new Object[] {
                Integer.valueOf(item.quantity), item.price
            });
            ((ViewHolder) (view)).qty.setText(s);
            if (item.displayImage != null)
            {
                WLog.d(TAG, (new StringBuilder()).append("item image uri:").append(item.displayImage.normal).toString());
                Picasso.with(mContext).load(item.displayImage.normal).placeholder(0x7f0200ab).error(0x7f020342).into(((ViewHolder) (view)).image);
                return;
            } else
            {
                ((ViewHolder) (view)).image.setImageResource(0x7f020342);
                return;
            }
        } else
        {
            ((ViewHolder) (view)).title.setText("");
            ((ViewHolder) (view)).qty.setText("");
            ((ViewHolder) (view)).image.setImageResource(0x7f020342);
            return;
        }
    }

    public com.walmart.android.data.FastPickupOrder.Item getChild(int i, int j)
    {
        if (mOrders != null && !mOrders.isEmpty())
        {
            return (com.walmart.android.data.FastPickupOrder.Item)((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).items.get(j);
        } else
        {
            return null;
        }
    }

    public volatile Object getChild(int i, int j)
    {
        return getChild(i, j);
    }

    public long getChildId(int i, int j)
    {
        if (mOrders != null && !mOrders.isEmpty())
        {
            return (long)((com.walmart.android.data.FastPickupOrder.Item)((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).items.get(j)).hashCode();
        } else
        {
            return 0L;
        }
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            if (view != null)
            {
                view1 = view;
                if (view.getTag() instanceof ViewHolder)
                {
                    break label0;
                }
            }
            view1 = ViewUtil.inflate(mContext, 0x7f04005a, viewgroup);
            view1.setTag(new ViewHolder((TextView)view1.findViewById(0x7f10012b), (TextView)view1.findViewById(0x7f10012c), (ImageViewExtended)view1.findViewById(0x7f10012a)));
        }
        setViewProperties(i, j, view1);
        return view1;
    }

    public int getChildrenCount(int i)
    {
        if (mOrders != null && !mOrders.isEmpty())
        {
            return ((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).items.size();
        } else
        {
            return 0;
        }
    }

    public volatile Object getGroup(int i)
    {
        return getGroup(i);
    }

    public String getGroup(int i)
    {
        if (mOrders != null && !mOrders.isEmpty())
        {
            return ((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).id;
        } else
        {
            return null;
        }
    }

    public int getGroupCount()
    {
        return mOrders.size();
    }

    public long getGroupId(int i)
    {
        if (mOrders != null && !mOrders.isEmpty())
        {
            return (long)((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).hashCode();
        } else
        {
            return 0L;
        }
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            if (view != null)
            {
                view1 = view;
                if (view.getTag() instanceof Integer)
                {
                    break label0;
                }
            }
            view1 = ViewUtil.inflate(mContext, 0x7f04005b, viewgroup);
        }
        TextView textview = (TextView)view1.findViewById(0x7f10012d);
        Resources resources = mContext.getResources();
        String s = "";
        view = s;
        if (mOrders != null)
        {
            view = s;
            if (!mOrders.isEmpty())
            {
                view = String.format(resources.getString(0x7f090119), new Object[] {
                    ((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).id
                });
            }
        }
        textview.setText(view);
        view1.setTag(Integer.valueOf(((com.walmart.android.data.FastPickupOrder.Order)mOrders.get(i)).hashCode()));
        ((ExpandableListView)viewgroup).expandGroup(i);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return false;
    }

    public void setData(String s, FastPickupOrder fastpickuporder)
    {
        WLog.d(TAG, (new StringBuilder()).append("setData() storeid=").append(s).toString());
        mOrders = fastpickuporder.getOrdersForStore(s);
        notifyDataSetChanged();
    }

}
