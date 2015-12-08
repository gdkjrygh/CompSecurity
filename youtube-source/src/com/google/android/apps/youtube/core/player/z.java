// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            aa, ab

public final class z
{

    private final Activity a;

    public z(Activity activity)
    {
        a = activity;
    }

    final Activity a()
    {
        return a;
    }

    final void a(String s, ab ab)
    {
        View view = LayoutInflater.from(a).inflate(l.A, null);
        ((TextView)view.findViewById(j.aL)).setText(s);
        s = new com.google.android.apps.youtube.core.player.aa(ab);
        (new aa(a)).setView(view).setPositiveButton(p.aw, s).setNegativeButton(p.K, s).setOnCancelListener(s).show();
    }
}
