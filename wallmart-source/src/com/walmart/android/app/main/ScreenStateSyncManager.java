// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.squareup.otto.Bus;
import com.walmart.android.events.ScreenStateEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            DrawerController

public class ScreenStateSyncManager
{

    private static final String TAG = com/walmart/android/app/main/ScreenStateSyncManager.getSimpleName();
    private DrawerController mDrawerController;
    private SearchActionController.ExpandHandler mExpandHandler;

    public ScreenStateSyncManager(DrawerController drawercontroller)
    {
        mDrawerController = drawercontroller;
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onScreenStateEvent(ScreenStateEvent screenstateevent)
    {
        screenstateevent.getType();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 66
    //                   1 57;
           goto _L1 _L2 _L3
_L1:
        WLog.w(TAG, (new StringBuilder()).append("Unknown event type: ").append(screenstateevent.getType()).toString());
_L5:
        return;
_L3:
        mDrawerController.closeDrawer();
        return;
_L2:
        if (mExpandHandler != null)
        {
            mExpandHandler.onClose();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setSearchExpandHandler(SearchActionController.ExpandHandler expandhandler)
    {
        mExpandHandler = expandhandler;
    }

}
