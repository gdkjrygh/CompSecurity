// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            g

class l
{

    public View a;
    public ImageView b;
    public TextView c;
    public LinearLayout d;
    final g e;

    public l(g g, View view)
    {
        e = g;
        super();
        a = view;
        b = (ImageView)view.findViewById(0x7f0904a4);
        c = (TextView)view.findViewById(0x7f0900b5);
        d = (LinearLayout)view.findViewById(0x7f0904a5);
    }
}
