// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

// Referenced classes of package com.whatsapp.appwidget:
//            c

public class WidgetService extends RemoteViewsService
{

    public WidgetService()
    {
    }

    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent)
    {
        return new c(getApplicationContext());
    }
}
