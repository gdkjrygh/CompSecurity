// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.client.core.model.ShoppingCartTopLineCharge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ShoppingConfirmationTopLineChargesAdapter extends BaseAdapter
{

    private final LayoutInflater a;
    private final List b = new ArrayList();

    public ShoppingConfirmationTopLineChargesAdapter(Context context)
    {
        a = LayoutInflater.from(context);
    }

    private View a(ViewGroup viewgroup)
    {
        viewgroup = a.inflate(0x7f03017e, viewgroup, false);
        viewgroup.setTag(new ViewHolder(viewgroup));
        return viewgroup;
    }

    private ShoppingCartTopLineCharge a(int i)
    {
        if (i < b.size() && i >= 0)
        {
            return (ShoppingCartTopLineCharge)b.get(i);
        } else
        {
            return null;
        }
    }

    public final void a(int i, View view, boolean flag)
    {
        if (view != null)
        {
            ShoppingCartTopLineCharge shoppingcarttoplinecharge = a(i);
            ((ViewHolder)view.getTag()).a(shoppingcarttoplinecharge, flag);
        }
    }

    public final void a(Collection collection)
    {
        if (collection != null)
        {
            b.clear();
            b.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)a(i).getLabel().hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        return view1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    private class ViewHolder
    {

        TextView mTextView;

        final void a(ShoppingCartTopLineCharge shoppingcarttoplinecharge, boolean flag)
        {
            if (shoppingcarttoplinecharge != null)
            {
                TextView textview = mTextView;
                if (flag)
                {
                    shoppingcarttoplinecharge = shoppingcarttoplinecharge.getLabel();
                } else
                {
                    shoppingcarttoplinecharge = shoppingcarttoplinecharge.getValue();
                }
                textview.setText(shoppingcarttoplinecharge);
            }
        }

        ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
