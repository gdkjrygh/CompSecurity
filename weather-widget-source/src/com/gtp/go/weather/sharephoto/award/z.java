// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            MyAwardsActivity

class z
{

    public View a;
    public View b;
    public TextView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    final MyAwardsActivity g;

    public z(MyAwardsActivity myawardsactivity, View view)
    {
        g = myawardsactivity;
        super();
        b = view.findViewById(0x7f090415);
        a = view.findViewById(0x7f0903b3);
        c = (TextView)view.findViewById(0x7f090416);
        d = (ImageView)view.findViewById(0x7f090064);
        e = (ImageView)view.findViewById(0x7f090417);
        f = (ImageView)view.findViewById(0x7f090418);
    }
}
