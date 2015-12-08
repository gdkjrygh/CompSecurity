// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            l

class o
    implements android.content.DialogInterface.OnKeyListener
{

    final l a;

    o(l l)
    {
        a = l;
        super();
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        return i == 4 && keyevent.getRepeatCount() == 0;
    }
}
