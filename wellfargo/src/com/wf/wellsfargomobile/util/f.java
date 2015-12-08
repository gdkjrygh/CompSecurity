// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            e, h

class f
    implements android.view.View.OnClickListener
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        if (e.a(a) != null && e.b(a) != null)
        {
            e.a(a).d(e.b(a));
        }
    }
}
