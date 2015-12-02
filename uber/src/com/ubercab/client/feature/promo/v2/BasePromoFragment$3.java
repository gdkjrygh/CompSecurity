// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v2;

import android.content.DialogInterface;

// Referenced classes of package com.ubercab.client.feature.promo.v2:
//            BasePromoFragment

final class a
    implements android.content.ickListener
{

    final BasePromoFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    (BasePromoFragment basepromofragment)
    {
        a = basepromofragment;
        super();
    }
}
