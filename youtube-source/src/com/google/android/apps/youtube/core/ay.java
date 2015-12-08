// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core:
//            LicensesActivity

final class ay
    implements android.view.View.OnKeyListener
{

    final LicensesActivity a;

    ay(LicensesActivity licensesactivity)
    {
        a = licensesactivity;
        super();
    }

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 111)
        {
            a.finish();
            return true;
        } else
        {
            return false;
        }
    }
}
