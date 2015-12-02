// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ubercab.client.feature.geojson.model.NamedFeature;
import com.ubercab.client.feature.geojson.model.NamedFeatureProperties;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class exe extends BaseAdapter
{

    List a;
    private final Context b;
    private final int c;
    private boolean d;
    private int e;

    public exe(Context context, int i)
    {
        a = new ArrayList();
        b = context;
        c = i;
    }

    private void a(TextView textview, int i)
    {
        NamedFeature namedfeature = a(i);
        if (namedfeature != null)
        {
            textview.setText(namedfeature.getProperties().getName());
            textview.setTextColor(b.getResources().getColor(0x7f0d0074));
            return;
        } else
        {
            textview.setText(c);
            textview.setTextColor(b.getResources().getColor(0x7f0d0070));
            return;
        }
    }

    public final int a(NamedFeature namedfeature)
    {
        if (namedfeature == null)
        {
            return !d ? -1 : 0;
        } else
        {
            return a.indexOf(namedfeature) + e;
        }
    }

    public final NamedFeature a(int i)
    {
        if (!d || i != 0)
        {
            if ((i -= e) >= 0 && i < a.size())
            {
                return (NamedFeature)a.get(i);
            }
        }
        return null;
    }

    public final void a(Collection collection, boolean flag)
    {
        a.clear();
        if (collection != null)
        {
            a.addAll(collection);
        }
        a(flag);
    }

    public final void a(boolean flag)
    {
        d = flag;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        e = i;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size() + e;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(0x1090009, viewgroup, false);
        }
        a((TextView)view1.findViewById(0x1020014), i);
        return view1;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        NamedFeature namedfeature = a(i);
        if (namedfeature == null)
        {
            return 0L;
        } else
        {
            return (long)namedfeature.getProperties().getName().hashCode();
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(0x1090008, viewgroup, false);
            view1.setPadding(0, 0, 0, 0);
        }
        a((TextView)view1.findViewById(0x1020014), i);
        return view1;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final boolean isEnabled(int i)
    {
        return !d || i != 0;
    }
}
