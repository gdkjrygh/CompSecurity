// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            e

class i extends ContentObserver
{

    final e a;

    public i(e e1, Handler handler)
    {
        a = e1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        e.i(a);
    }
}
