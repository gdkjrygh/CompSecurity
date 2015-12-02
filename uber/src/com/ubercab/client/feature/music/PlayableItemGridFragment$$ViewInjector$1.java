// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlayableItemGridFragment

final class a
    implements android.widget.t..ViewInjector._cls1
{

    final PlayableItemGridFragment a;
    final a b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onGridItemClick(i);
    }

    ( , PlayableItemGridFragment playableitemgridfragment)
    {
        b = ;
        a = playableitemgridfragment;
        super();
    }
}
