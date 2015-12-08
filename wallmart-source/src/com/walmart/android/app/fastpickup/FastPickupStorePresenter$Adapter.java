// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupStorePresenter

private static class <init> extends BaseAdapter
{
    private static class ViewHolder
    {

        public TextView addrLine1;
        public TextView addrLine2;
        public TextView title;

        public ViewHolder(TextView textview, TextView textview1, TextView textview2)
        {
            title = textview;
            addrLine1 = textview1;
            addrLine2 = textview2;
        }
    }


    private final Context mContext;
    private List mData;

    private void setViewProperties(int i, View view)
    {
        view = (ViewHolder)view.getTag();
        if (mData != null)
        {
            com.walmart.android.data.r.Adapter adapter = (com.walmart.android.data.r.Adapter.mData)mData.get(i);
            if (adapter != null)
            {
                String as[] = adapter.ines();
                ((ViewHolder) (view)).title.setText(as[0]);
                ((ViewHolder) (view)).addrLine1.setText(as[1]);
                ((ViewHolder) (view)).addrLine2.setText(as[2]);
            }
        }
    }

    public int getCount()
    {
        return mData.size();
    }

    public Object getItem(int i)
    {
        return mData.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ViewUtil.inflate(mContext, 0x7f04005e, viewgroup);
            view1.setTag(new ViewHolder((TextView)view1.findViewById(0x7f100131), (TextView)view1.findViewById(0x7f100132), (TextView)view1.findViewById(0x7f100133)));
        }
        setViewProperties(i, view1);
        return view1;
    }

    public void setData(List list)
    {
        WLog.d(FastPickupStorePresenter.access$100(), (new StringBuilder()).append("setData() new data: ").append(list).toString());
        mData = list;
        notifyDataSetChanged();
    }

    private ViewHolder.addrLine2(Context context)
    {
        mData = new ArrayList();
        mContext = context;
    }

    mContext(Context context, mContext mcontext)
    {
        this(context);
    }
}
