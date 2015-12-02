// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.ubercab.client.feature.shoppingcart.ShoppingMenuAdapter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class fis
    implements ListAdapter
{

    final ShoppingMenuAdapter a;
    private final List b;

    public fis(ShoppingMenuAdapter shoppingmenuadapter, long l, long l1, int i)
    {
        a = shoppingmenuadapter;
        super();
        b = a(l, l1, i);
    }

    private static List a(long l, long l1, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (Long long1 = Long.valueOf(l); long1.longValue() < l1; long1 = Long.valueOf(long1.longValue() + (long)i))
        {
            arraylist.add(long1);
        }

        return arraylist;
    }

    public final boolean areAllItemsEnabled()
    {
        return true;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return ((Long)b.get(i)).longValue();
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        long l;
        if (view == null)
        {
            view = (TextView)ShoppingMenuAdapter.j(a).inflate(0x7f03008b, viewgroup, false);
        } else
        {
            view = (TextView)view;
        }
        l = getItemId(i);
        view.setText(ShoppingMenuAdapter.m(a).format(new Date(l)));
        return view;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final boolean isEmpty()
    {
        return b.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
