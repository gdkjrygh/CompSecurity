// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.text.Editable;
import hpb;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicSearchFragment

final class a extends hpb
{

    final MusicSearchFragment a;

    public final void afterTextChanged(Editable editable)
    {
        if (editable != null && editable.toString().trim().length() >= 3)
        {
            MusicSearchFragment.a(a, editable.toString().trim(), false);
        }
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null)
        {
            a.a(charsequence.length());
        }
    }

    (MusicSearchFragment musicsearchfragment)
    {
        a = musicsearchfragment;
        super();
    }
}
