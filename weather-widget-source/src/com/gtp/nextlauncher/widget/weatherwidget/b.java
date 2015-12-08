// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            CityNameView

class b extends Handler
{

    final CityNameView a;

    b(CityNameView citynameview)
    {
        a = citynameview;
        super();
    }

    public void handleMessage(Message message)
    {
        CityNameView.access$002(a, false);
    }
}
