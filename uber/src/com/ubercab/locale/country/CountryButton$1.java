// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.view.View;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.locale.country:
//            CountryButton

final class a
    implements android.view.ener
{

    final CountryButton a;

    public final void onClick(View view)
    {
        for (Iterator iterator = CountryButton.a(a).iterator(); iterator.hasNext(); ((android.view.ener)iterator.next()).onClick(view)) { }
    }

    (CountryButton countrybutton)
    {
        a = countrybutton;
        super();
    }
}
