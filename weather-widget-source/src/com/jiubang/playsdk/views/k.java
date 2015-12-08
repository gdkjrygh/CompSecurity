// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.view.View;

// Referenced classes of package com.jiubang.playsdk.views:
//            TitleBar, n

class k
    implements android.view.View.OnClickListener
{

    final TitleBar a;

    k(TitleBar titlebar)
    {
        a = titlebar;
        super();
    }

    public void onClick(View view)
    {
        if (TitleBar.a(a) != null)
        {
            TitleBar.a(a).r();
        }
    }
}
