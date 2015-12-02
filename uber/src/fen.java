// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.client.core.model.SafetyNetContact;
import java.util.ArrayList;
import java.util.List;

public final class fen extends BaseAdapter
{

    private final dac a;
    private final cgh b;
    private List c;

    public fen(Context context, cgh cgh)
    {
        c = new ArrayList();
        b = cgh;
        a = new dac(context);
    }

    private SafetyNetContact a(int i)
    {
        return (SafetyNetContact)c.get(i);
    }

    public final void a(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        c = ((List) (obj));
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
        if (view == null)
        {
            view = a.a(viewgroup);
            viewgroup = new feo(this, view, b);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (feo)view.getTag();
        }
        viewgroup.a(a(i));
        return view;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }
}
