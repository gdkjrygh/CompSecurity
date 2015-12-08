// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.e;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.e:
//            b

class c
    implements android.view.View.OnClickListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
    }
}
