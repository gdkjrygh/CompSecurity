// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class a
    implements android.widget.ViewSwitcher.ViewFactory
{

    final PhotoDetailActivity a;

    a(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public View makeView()
    {
        TextView textview = new TextView(a);
        textview.setTextAppearance(a, 0x7f07001e);
        return textview;
    }
}
