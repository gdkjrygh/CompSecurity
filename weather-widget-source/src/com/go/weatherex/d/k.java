// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package com.go.weatherex.d:
//            a

class k
{

    RadioButton a;
    TextView b;
    View c;
    final a d;

    k(a a1)
    {
        d = a1;
        super();
        c = com.go.weatherex.d.a.n(a1).inflate(0x7f03004a, null);
        a = (RadioButton)c.findViewById(0x7f090223);
        b = (TextView)c.findViewById(0x7f090222);
    }
}
