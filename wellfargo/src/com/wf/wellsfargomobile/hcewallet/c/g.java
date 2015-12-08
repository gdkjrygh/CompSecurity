// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            d

class g
    implements android.view.View.OnClickListener
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void onClick(View view)
    {
        d.a(a);
        a.dismiss();
    }
}
