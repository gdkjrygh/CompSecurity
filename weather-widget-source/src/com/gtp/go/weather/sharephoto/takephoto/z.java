// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            x, PublishPhotoActivity

class z
{

    View a;
    RadioButton b;
    TextView c;
    final x d;

    z(x x1)
    {
        d = x1;
        super();
        a = x1.a.getLayoutInflater().inflate(0x7f030109, null);
        b = (RadioButton)a.findViewById(0x7f090510);
        c = (TextView)a.findViewById(0x7f09041d);
    }
}
