// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.widget.AbsListView;
import android.widget.ListAdapter;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            UserPhotosActivity

class z
    implements android.widget.AbsListView.OnScrollListener
{

    final UserPhotosActivity a;
    private int b;

    z(UserPhotosActivity userphotosactivity)
    {
        a = userphotosactivity;
        super();
        b = 0;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        b = (i + j) - 1;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        for (int j = ((ListAdapter)abslistview.getAdapter()).getCount(); j == 0 || i != 0 || j - 1 != b || UserPhotosActivity.a(a);)
        {
            return;
        }

        UserPhotosActivity.a(a, true);
        UserPhotosActivity.b(a);
    }
}
