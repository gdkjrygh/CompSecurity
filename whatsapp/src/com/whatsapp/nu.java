// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            AccountInfoActivity

class nu
    implements android.view.View.OnLongClickListener
{

    final AccountInfoActivity a;

    nu(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public boolean onLongClick(View view)
    {
        AccountInfoActivity.p(a).onClick(view);
        return true;
    }
}
