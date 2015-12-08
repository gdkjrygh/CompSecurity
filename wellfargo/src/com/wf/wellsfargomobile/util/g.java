// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            e

class g
    implements android.view.View.OnClickListener
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
    }
}
