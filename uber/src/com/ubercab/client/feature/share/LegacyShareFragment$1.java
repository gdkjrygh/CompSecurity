// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import chp;
import n;

// Referenced classes of package com.ubercab.client.feature.share:
//            LegacyShareFragment

final class a
    implements android.content.maryClipChangedListener
{

    final LegacyShareFragment a;

    public final void onPrimaryClipChanged()
    {
        a.c.a(n.ff);
    }

    stener(LegacyShareFragment legacysharefragment)
    {
        a = legacysharefragment;
        super();
    }
}
