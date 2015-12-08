// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            j, h

class n
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final h b;
    final j c;

    n(j j1, ListView listview, h h1)
    {
        c = j1;
        a = listview;
        b = h1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (c.C != null)
        {
            c.C[i] = a.isItemChecked(i);
        }
        c.G.onClick(h.g(b), i, a.isItemChecked(i));
    }
}
