// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity

class l5
    implements android.view.View.OnClickListener
{

    final ViewSharedContactActivity a;

    l5(ViewSharedContactActivity viewsharedcontactactivity)
    {
        a = viewsharedcontactactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
