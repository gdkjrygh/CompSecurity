// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.DialogInterface;

// Referenced classes of package com.go.weatherex.setting:
//            ad

class ae
    implements android.content.DialogInterface.OnCancelListener
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ad.a(a, false);
    }
}
