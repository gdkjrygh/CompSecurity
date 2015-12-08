// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.view.View;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            l

class n
    implements android.view.View.OnClickListener
{

    final l a;

    n(l l1)
    {
        a = l1;
        super();
    }

    public void onClick(View view)
    {
        a.closeDialogDontShow(WFApp.o());
    }
}
