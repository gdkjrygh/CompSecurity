// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.b.d;
import android.support.v7.media.ad;
import android.support.v7.media.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//            q, t

final class s extends ArrayAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    final q a;
    private final LayoutInflater b;

    public s(q q1, Context context)
    {
        a = q1;
        super(context, 0);
        b = LayoutInflater.from(context);
    }

    public final void a()
    {
        clear();
        q.a(a);
        List list = u.a();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            ad ad1 = (ad)list.get(i);
            if (a.a(ad1))
            {
                add(ad1);
            }
        }

        sort(t.a);
        notifyDataSetChanged();
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(d.c, viewgroup, false);
        }
        view = (ad)getItem(i);
        Object obj = (TextView)view1.findViewById(0x1020014);
        viewgroup = (TextView)view1.findViewById(0x1020015);
        ((TextView) (obj)).setText(view.a());
        obj = view.b();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            viewgroup.setVisibility(8);
            viewgroup.setText("");
        } else
        {
            viewgroup.setVisibility(0);
            viewgroup.setText(((CharSequence) (obj)));
        }
        view1.setEnabled(view.c());
        return view1;
    }

    public final boolean isEnabled(int i)
    {
        return ((ad)getItem(i)).c();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ad)getItem(i);
        if (adapterview.c())
        {
            adapterview.n();
            a.dismiss();
        }
    }
}
