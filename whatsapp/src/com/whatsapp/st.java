// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.TextView;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            a92, App, ad7, ProfileInfoActivity

class st
    implements a92
{

    final ad7 a;

    st(ad7 ad7_1)
    {
        a = ad7_1;
        super();
    }

    public void a(String s)
    {
        if (s.length() == 0)
        {
            return;
        } else
        {
            App.au.z(s);
            App.t(s);
            ProfileInfoActivity.d(a.a).setText(c.b(s, a.a));
            return;
        }
    }
}
