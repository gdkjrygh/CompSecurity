// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

private class <init> extends BaseAdapter
{

    private final Context mContext;
    private List mModel;
    final ListCreatorPresenter this$0;

    public int getCount()
    {
        return mModel.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(mContext).inflate(0x7f0401ee, viewgroup, false);
        ViewUtil.setText(0x7f10004f, view, ((WishList)mModel.get(i)).name);
        return view;
    }

    public Object getItem(int i)
    {
        return mModel.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(mContext).inflate(0x7f0401ed, viewgroup, false);
        ViewUtil.setText(0x7f10004f, view, ((WishList)mModel.get(i)).name);
        return view;
    }

    public int indexOf(String s)
    {
        if (s != null)
        {
            int j = mModel.size();
            for (int i = 0; i < j; i++)
            {
                if (s.equals(((WishList)mModel.get(i)).id))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public void setModel(List list)
    {
        mModel.clear();
        if (list != null)
        {
            mModel.addAll(list);
        }
        notifyDataSetChanged();
    }

    void updateList(WishList wishlist)
    {
        int j = mModel.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (!wishlist.id.equals(((WishList)mModel.get(i)).id))
                    {
                        break label0;
                    }
                    mModel.set(i, wishlist);
                    notifyDataSetChanged();
                }
                return;
            }
            i++;
        } while (true);
    }

    private (Context context)
    {
        this$0 = ListCreatorPresenter.this;
        super();
        mModel = new ArrayList();
        mContext = context;
    }

    mContext(Context context, mContext mcontext)
    {
        this(context);
    }
}
