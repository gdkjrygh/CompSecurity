// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            MainActivity

class ad
    implements android.view.View.OnClickListener
{

    final MainActivity a;

    ad(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public void onClick(View view)
    {
        MainActivity.c(a);
    }
}
