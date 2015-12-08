// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ev

final class ez
    implements android.widget.TextView.OnEditorActionListener
{

    final ev a;

    ez(ev ev1)
    {
        a = ev1;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            return false;

        case 6: // '\006'
            ev.c(a);
            break;
        }
        return true;
    }
}
