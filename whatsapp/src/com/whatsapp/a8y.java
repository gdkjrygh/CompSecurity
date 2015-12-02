// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            a92, SetStatus

class a8y
    implements a92
{

    final SetStatus a;

    a8y(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void a(String s)
    {
        if (s.length() > 0 && !s.equals(a.p.getText().toString()))
        {
            SetStatus.a(a).setOnClickListener(null);
            a.e(s);
        }
    }
}
