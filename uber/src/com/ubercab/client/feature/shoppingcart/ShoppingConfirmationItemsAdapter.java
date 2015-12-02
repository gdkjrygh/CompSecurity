// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bjw;
import cgh;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.feature.shoppingcart.model.Item;
import dtw;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l;

public final class ShoppingConfirmationItemsAdapter extends BaseAdapter
{

    private final chp a;
    private final bjw b;
    private final cgh c;
    private final Context d;
    private final LayoutInflater e;
    private final List f = new ArrayList();
    private NumberFormat g;

    public ShoppingConfirmationItemsAdapter(Context context, chp chp1, cgh cgh, bjw bjw1)
    {
        d = context;
        a = chp1;
        c = cgh;
        e = LayoutInflater.from(context);
        b = bjw1;
    }

    static Context a(ShoppingConfirmationItemsAdapter shoppingconfirmationitemsadapter)
    {
        return shoppingconfirmationitemsadapter.d;
    }

    private View a(ViewGroup viewgroup)
    {
        viewgroup = e.inflate(0x7f03017d, viewgroup, false);
        viewgroup.setTag(new ViewHolder(viewgroup));
        return viewgroup;
    }

    private Item a(int i)
    {
        if (i < f.size() && i >= 0)
        {
            return (Item)f.get(i);
        } else
        {
            return null;
        }
    }

    static NumberFormat b(ShoppingConfirmationItemsAdapter shoppingconfirmationitemsadapter)
    {
        return shoppingconfirmationitemsadapter.g;
    }

    static cgh c(ShoppingConfirmationItemsAdapter shoppingconfirmationitemsadapter)
    {
        return shoppingconfirmationitemsadapter.c;
    }

    public final void a(Collection collection)
    {
        if (collection != null)
        {
            f.clear();
            f.addAll(collection);
            notifyDataSetChanged();
            HashMap hashmap = new HashMap();
            Item item;
            for (collection = collection.iterator(); collection.hasNext(); hashmap.put(item.getItemId(), item.getCount()))
            {
                item = (Item)collection.next();
            }

            a.a(AnalyticsEvent.create("impression").setName(l.av).setValue(b.a(hashmap)));
        }
    }

    public final void a(Currency currency)
    {
        g = dtw.a(currency);
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)a(i).getTitle().hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Item item = a(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        ((ViewHolder)view1.getTag()).a(i, item);
        return view1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    private class ViewHolder
    {

        String a;
        final ShoppingConfirmationItemsAdapter b;
        View mDivider;
        ImageView mIcon;
        TextView mQuantityText;
        TextView mTitleText;
        TextView mTotalText;

        private void a(String s)
        {
            ShoppingConfirmationItemsAdapter.c(b).a(s).a(mIcon);
        }

        final void a(int i, Item item)
        {
            if (item != null)
            {
                a = item.getItemId();
                a(item.getImageUrlOriginal());
                mTitleText.setText(item.getTitle());
                int j = item.getCount().intValue();
                mQuantityText.setText(String.format("%s%d", new Object[] {
                    ShoppingConfirmationItemsAdapter.a(b).getString(0x7f0707ac), Integer.valueOf(j)
                }));
                if (ShoppingConfirmationItemsAdapter.b(b) != null)
                {
                    mTotalText.setText(ShoppingConfirmationItemsAdapter.b(b).format(item.getPrice().doubleValue() * (double)j));
                }
                if (i == 0)
                {
                    mDivider.setVisibility(8);
                }
            }
        }

        ViewHolder(View view)
        {
            b = ShoppingConfirmationItemsAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
