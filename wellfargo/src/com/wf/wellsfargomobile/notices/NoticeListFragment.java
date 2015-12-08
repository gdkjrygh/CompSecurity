// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            e, f, b, c

public class NoticeListFragment extends ListFragment
{

    private static f c = new e();
    private f a;
    private int b;

    public NoticeListFragment()
    {
        a = c;
        b = -1;
    }

    private void a()
    {
        getListView().setOverscrollFooter(getResources().getDrawable(0x7f020142));
    }

    public void a(int i)
    {
        if (i == -1)
        {
            getListView().setItemChecked(b, false);
        } else
        {
            getListView().setItemChecked(i, true);
        }
        b = i;
    }

    public void a(boolean flag)
    {
        ListView listview = getListView();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        listview.setChoiceMode(i);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (!(activity instanceof f))
        {
            throw new IllegalStateException("Activity must implement fragment's callbacks.");
        } else
        {
            a = (f)activity;
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int i = 0x1090003;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            i = 0x1090016;
        }
        setListAdapter(new ArrayAdapter(getActivity(), i, 0x1020014, com.wf.wellsfargomobile.notices.b.b(getActivity())));
    }

    public void onDetach()
    {
        super.onDetach();
        a = c;
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        super.onListItemClick(listview, view, i, l);
        a.a(((c)com.wf.wellsfargomobile.notices.b.b(getActivity()).get(i)).a);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (b != -1)
        {
            bundle.putInt("activated_position", b);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey("activated_position"))
        {
            a(bundle.getInt("activated_position"));
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a();
        }
    }

}
