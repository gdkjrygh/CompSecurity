// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import android.content.DialogInterface;
import android.content.Intent;
import cev;
import far;

// Referenced classes of package com.ubercab.client.feature.promo.v2:
//            PromoV2Activity

final class a
    implements android.content.ClickListener
{

    final String a;
    final PromoV2Activity b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        b.i.c(new far());
        b.setResult(-1, (new Intent()).putExtra("description", a));
        b.finish();
    }

    (PromoV2Activity promov2activity, String s)
    {
        b = promov2activity;
        a = s;
        super();
    }
}
