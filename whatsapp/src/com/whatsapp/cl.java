// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.RadioButton;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class cl
    implements android.view.View.OnClickListener
{

    final View a;
    final View b;
    final AccountInfoActivity c;
    final View d;

    cl(AccountInfoActivity accountinfoactivity, View view, View view1, View view2)
    {
        c = accountinfoactivity;
        d = view;
        b = view1;
        a = view2;
        super();
    }

    public void onClick(View view)
    {
        if (view == d)
        {
            AccountInfoActivity.k(c).setChecked(true);
        }
        if (view == b)
        {
            AccountInfoActivity.m(c).setChecked(true);
        }
        if (view == a)
        {
            AccountInfoActivity.f(c).setChecked(true);
        }
    }
}
