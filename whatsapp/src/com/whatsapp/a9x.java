// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            HomeActivity

class a9x
    implements android.content.DialogInterface.OnClickListener
{

    final HomeActivity a;

    a9x(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        HomeActivity.e(a);
    }
}
