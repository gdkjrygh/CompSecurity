// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.client.feature.faresplit.master.FareSplitContactViewHolder;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.RecentFareSplitter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ebz extends BaseAdapter
{

    private final cgh a;
    private final dac b;
    private List c;
    private Collection d;
    private Collection e;

    public ebz(Context context, cgh cgh)
    {
        b = new dac(context);
        c = new ArrayList();
        e = new HashSet();
        d = new HashSet();
        a = cgh;
    }

    private RecentFareSplitter a(int i)
    {
        return (RecentFareSplitter)c.get(i);
    }

    public final void a(Client client, FareSplit faresplit)
    {
        client = client.getRecentFareSplitters();
        if (client != null)
        {
            c = new ArrayList(client);
        }
        if (faresplit != null)
        {
            e = dty.a(faresplit);
        }
        notifyDataSetChanged();
    }

    public final void a(Collection collection)
    {
        HashSet hashset = new HashSet();
        for (collection = collection.iterator(); collection.hasNext(); hashset.add(((com.ubercab.client.core.ui.ChipEditText.Chip)collection.next()).c())) { }
        d = hashset;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            boolean flag1 = false;
            String s;
            Object obj;
            boolean flag;
            if (view == null)
            {
                view = b.a(viewgroup);
                viewgroup = new FareSplitContactViewHolder(view, a, true);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (FareSplitContactViewHolder)view.getTag();
            }
            obj = a(i);
            s = ((RecentFareSplitter) (obj)).getMobileDigits();
            obj = ((RecentFareSplitter) (obj)).getMobileCountryIso2();
            flag = flag1;
            if (TextUtils.isEmpty(s))
            {
                break label0;
            }
            flag = flag1;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                break label0;
            }
            s = duj.c(s, ((String) (obj)));
            if (!e.contains(s))
            {
                flag = flag1;
                if (!d.contains(s))
                {
                    break label0;
                }
            }
            flag = true;
        }
        viewgroup.a(a(i), flag);
        return view;
    }

    public final boolean isEnabled(int i)
    {
        boolean flag1 = false;
        Object obj = a(i);
        String s = ((RecentFareSplitter) (obj)).getMobileDigits();
        obj = ((RecentFareSplitter) (obj)).getMobileCountryIso2();
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s = duj.c(s, ((String) (obj)));
                flag = flag1;
                if (!e.contains(s))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
