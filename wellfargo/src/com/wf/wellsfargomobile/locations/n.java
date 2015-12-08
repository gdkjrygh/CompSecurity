// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            c, d, o, LocationListActivity

public class n extends ListFragment
    implements c
{

    protected d a;
    private View b;
    private int c;

    public n()
    {
    }

    private void a(View view, int i)
    {
        b();
        view.setBackgroundColor(getResources().getColor(0x7f0e0036));
        TextView textview = (TextView)view.findViewById(0x7f0f00b9);
        TextView textview1 = (TextView)view.findViewById(0x7f0f00ba);
        TextView textview2 = (TextView)view.findViewById(0x7f0f00bb);
        TextView textview3 = (TextView)view.findViewById(0x7f0f00bc);
        textview.setTextColor(getResources().getColor(0x7f0e0038));
        textview1.setTextColor(getResources().getColor(0x7f0e0038));
        textview2.setTextColor(getResources().getColor(0x7f0e0038));
        textview3.setTextColor(getResources().getColor(0x7f0e0038));
        view.requestFocus();
        b = view;
        c = i;
    }

    static void a(n n1, View view, int i)
    {
        n1.a(view, i);
    }

    public void a()
    {
        if (a != null)
        {
            a.notifyDataSetChanged();
        }
    }

    public void a(int i)
    {
        ListView listview = getListView();
        listview.smoothScrollToPosition(i);
        (new Handler()).postDelayed(new o(this, listview, i), 500L);
    }

    public void b()
    {
        if (b != null)
        {
            TextView textview;
            TextView textview1;
            TextView textview2;
            TextView textview3;
            if (c % 2 == 0)
            {
                b.setBackgroundColor(getResources().getColor(0x7f0e0034));
            } else
            {
                b.setBackgroundColor(getResources().getColor(0x7f0e0035));
            }
            textview = (TextView)b.findViewById(0x7f0f00b9);
            textview1 = (TextView)b.findViewById(0x7f0f00ba);
            textview2 = (TextView)b.findViewById(0x7f0f00bb);
            textview3 = (TextView)b.findViewById(0x7f0f00bc);
            textview.setTextColor(getResources().getColor(0x7f0e0037));
            textview1.setTextColor(getResources().getColor(0x7f0e0037));
            textview2.setTextColor(getResources().getColor(0x7f0e0037));
            textview3.setTextColor(getResources().getColor(0x7f0e0037));
        }
        b = null;
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        a(view, i);
        ((LocationListActivity)getActivity()).a(i);
    }
}
