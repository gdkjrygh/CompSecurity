// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.util.SparseArray;
import android.widget.AbsListView;
import android.widget.TextView;
import com.whatsapp.util.y;

// Referenced classes of package com.whatsapp:
//            App, MediaGallery, a9w, bt

class j8
    implements android.widget.AbsListView.OnScrollListener
{

    final MediaGallery a;
    private int b;
    private int c;
    private int d;

    j8(MediaGallery mediagallery)
    {
        a = mediagallery;
        super();
        d = -1;
        b = -1;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int j1;
        j1 = App.am;
        if (d != i && c != 0)
        {
            y.a(true);
        }
        if (i == d) goto _L2; else goto _L1
_L1:
        int l;
        l = a9w.a(MediaGallery.d(a)).size() - 1;
        j = -1;
_L7:
        k = j;
        if (l < 0) goto _L4; else goto _L3
_L3:
        int i1 = a9w.a(MediaGallery.d(a)).keyAt(l);
        k = j;
        if (i1 <= i)
        {
            k = j;
            if (i1 > j)
            {
                k = i1;
            }
        }
        if (j1 == 0) goto _L5; else goto _L4
_L4:
        if (b != k && k >= 0)
        {
            b = k;
            MediaGallery.h(a).setText(((bt)a9w.a(MediaGallery.d(a)).get(k)).toString());
            MediaGallery.h(a).requestLayout();
        }
_L2:
        MediaGallery.a(a).a();
        d = i;
        return;
_L5:
        l--;
        j = k;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        c = i;
        boolean flag;
        if (c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag);
    }
}
