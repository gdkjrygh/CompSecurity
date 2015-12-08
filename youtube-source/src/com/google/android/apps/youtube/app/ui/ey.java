// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ev

final class ey
    implements android.view.View.OnFocusChangeListener
{

    final ev a;

    ey(ev ev1)
    {
        a = ev1;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        ev.b(a).setSelected(flag);
    }
}
