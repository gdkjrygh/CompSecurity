// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.view.KeyEvent;
import android.widget.TextView;
import chp;
import com.ubercab.client.feature.search.LocationSearchEditText;
import cwz;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicSearchFragment

final class a
    implements android.widget.nListener
{

    final MusicSearchFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag;
        if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 3 || flag)
        {
            cwz.b(a.mEditTextSearch.getContext(), textview);
            MusicSearchFragment.a(a, MusicSearchFragment.a(a), true);
            a.c.a(n.bA);
            flag1 = true;
        }
        return flag1;
    }

    t(MusicSearchFragment musicsearchfragment)
    {
        a = musicsearchfragment;
        super();
    }
}
