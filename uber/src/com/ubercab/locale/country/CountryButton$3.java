// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.view.View;
import gop;

// Referenced classes of package com.ubercab.locale.country:
//            CountryButton

final class a
    implements android.view.ener
{

    final android.content.OnClickListener a;
    final CountryButton b;

    public final void onClick(View view)
    {
        if (CountryButton.c(b) != null)
        {
            CountryButton.c(b).onClick(view);
        }
        if (CountryButton.b(b) == null)
        {
            CountryButton.a(b, new gop(b.getContext(), CountryButton.d(b)));
        }
        CountryButton.a(b, (new android.app.der(b.getContext())).setAdapter(CountryButton.b(b), a).setNegativeButton(0x1040000, null).show());
    }

    ener(CountryButton countrybutton, android.content.OnClickListener onclicklistener)
    {
        b = countrybutton;
        a = onclicklistener;
        super();
    }
}
