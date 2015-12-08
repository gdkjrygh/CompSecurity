// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            ao, aq

class ap
    implements android.view.View.OnClickListener
{

    final ao a;

    ap(ao ao1)
    {
        a = ao1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        if (ao.a(a) != null)
        {
            ao.a(a).d();
        }
    }
}
