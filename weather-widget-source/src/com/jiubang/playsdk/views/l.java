// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.view.View;

// Referenced classes of package com.jiubang.playsdk.views:
//            TitleBar, m

class l
    implements android.view.View.OnClickListener
{

    final TitleBar a;

    l(TitleBar titlebar)
    {
        a = titlebar;
        super();
    }

    public void onClick(View view)
    {
        if (TitleBar.b(a) != null)
        {
            TitleBar.b(a).a();
        }
    }
}
