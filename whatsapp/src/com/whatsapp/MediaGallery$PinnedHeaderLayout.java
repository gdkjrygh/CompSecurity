// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            MediaGallery, App

class t> extends LinearLayout
{

    View a;
    final MediaGallery b;

    public void a()
    {
label0:
        {
            int i = App.am;
            View view = b.B.getChildAt(1);
            int j = a.getHeight();
            if (view != null && view.getTag() == null)
            {
                if (view.getTop() < j)
                {
                    int k = view.getTop();
                    a.offsetTopAndBottom(k - j - a.getTop());
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                a.offsetTopAndBottom(-a.getTop());
                if (i == 0)
                {
                    break label0;
                }
            }
            a.offsetTopAndBottom(-a.getTop());
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        a();
    }

    (MediaGallery mediagallery)
    {
        b = mediagallery;
        super(mediagallery);
        a = mediagallery.getLayoutInflater().inflate(0x7f03007e, null, true);
        a.setClickable(false);
        addView(a, new android.widget.(-1, -2));
    }
}
