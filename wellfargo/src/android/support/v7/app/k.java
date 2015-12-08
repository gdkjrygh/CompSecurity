// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            j

class k extends ArrayAdapter
{

    final ListView a;
    final j b;

    k(j j1, Context context, int i, int l, CharSequence acharsequence[], ListView listview)
    {
        b = j1;
        a = listview;
        super(context, i, l, acharsequence);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if (b.C != null && b.C[i])
        {
            a.setItemChecked(i, true);
        }
        return view;
    }
}
