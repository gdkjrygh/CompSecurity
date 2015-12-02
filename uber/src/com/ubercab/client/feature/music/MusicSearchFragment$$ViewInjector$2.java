// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicSearchFragment

final class a
    implements android.widget.t..ViewInjector._cls2
{

    final MusicSearchFragment a;
    final a b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onListItemClick(i);
    }

    ( , MusicSearchFragment musicsearchfragment)
    {
        b = ;
        a = musicsearchfragment;
        super();
    }
}
