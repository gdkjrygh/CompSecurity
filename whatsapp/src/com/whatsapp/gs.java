// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            App, MessageDetailsActivity

class gs
    implements android.widget.AbsListView.OnScrollListener
{

    final MessageDetailsActivity a;
    final boolean b;
    final int c;
    final ViewGroup d;
    final Drawable e;

    gs(MessageDetailsActivity messagedetailsactivity, Drawable drawable, boolean flag, ViewGroup viewgroup, int i)
    {
        a = messagedetailsactivity;
        e = drawable;
        b = flag;
        d = viewgroup;
        c = i;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
label0:
        {
            i = App.am;
            if (MessageDetailsActivity.e(a).getFirstVisiblePosition() > 0)
            {
                e.setAlpha(255);
                if (android.os.Build.VERSION.SDK_INT < 11 || b)
                {
                    break label0;
                }
                d.setTranslationY(0.0F);
                if (i == 0)
                {
                    break label0;
                }
            }
            abslistview = MessageDetailsActivity.e(a).getChildAt(0);
            if (abslistview == null)
            {
                e.setAlpha(0);
                if (android.os.Build.VERSION.SDK_INT < 11 || b)
                {
                    break label0;
                }
                d.setTranslationY(0.0F);
                if (i == 0)
                {
                    break label0;
                }
            }
            i = abslistview.getTop();
            j = Math.min(255, (-i * 255) / Math.min(c, abslistview.getHeight()));
            e.setAlpha(j);
            if (android.os.Build.VERSION.SDK_INT >= 11 && !b)
            {
                d.setTranslationY(-i / 2);
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
