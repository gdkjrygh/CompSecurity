// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ew, fg, ev

final class ex
    implements b
{

    final YouTubeTvScreen a;
    final ew b;

    ex(ew ew1, YouTubeTvScreen youtubetvscreen)
    {
        b = ew1;
        a = youtubetvscreen;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error selecting screen", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = b.d;
        obj1 = a;
        ((fg) (obj)).a();
        ev.a(b.f).setText(null);
        ev.a(b.f, null);
        ((InputMethodManager)b.c.getSystemService("input_method")).hideSoftInputFromWindow(ev.a(b.f).getWindowToken(), 0);
    }
}
