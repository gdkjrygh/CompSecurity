// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.ListView;
import com.squareup.otto.Bus;
import com.walmart.android.events.ScreenStateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.main:
//            DrawerController

class this._cls0
    implements android.support.v4.widget.Listener
{

    final DrawerController this$0;

    public void onDrawerClosed(View view)
    {
        DrawerController.access$2800(DrawerController.this).onDrawerClosed(view);
        DrawerController.access$500(DrawerController.this).setSelection(0);
    }

    public void onDrawerOpened(View view)
    {
        if (view != null)
        {
            ViewUtil.hideKeyboard(view);
        }
        DrawerController.access$2800(DrawerController.this).onDrawerOpened(view);
        MessageBus.getBus().post(DrawerController.access$2900(DrawerController.this));
        MessageBus.getBus().post(new ScreenStateEvent(0));
    }

    public void onDrawerSlide(View view, float f)
    {
        DrawerController.access$2800(DrawerController.this).onDrawerSlide(view, f);
    }

    public void onDrawerStateChanged(int i)
    {
        DrawerController.access$2800(DrawerController.this).onDrawerStateChanged(i);
    }

    tener()
    {
        this$0 = DrawerController.this;
        super();
    }
}
