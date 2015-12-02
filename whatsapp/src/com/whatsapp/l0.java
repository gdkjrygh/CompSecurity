// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            SystemStatusActivity

class l0
    implements android.view.View.OnClickListener
{

    final SystemStatusActivity a;

    l0(SystemStatusActivity systemstatusactivity)
    {
        a = systemstatusactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
