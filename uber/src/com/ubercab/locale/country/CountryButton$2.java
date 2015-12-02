// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.content.DialogInterface;
import gop;

// Referenced classes of package com.ubercab.locale.country:
//            CountryButton

final class a
    implements android.content.OnClickListener
{

    final CountryButton a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(CountryButton.b(a).a(i));
    }

    ener(CountryButton countrybutton)
    {
        a = countrybutton;
        super();
    }
}
