// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.common.base.Preconditions;
import flow.Flow;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinMapController, CheckinTutorialView

public class CheckinTutorialController
    implements Controller
{

    Flow flow;
    private final CheckinMapController mapController;
    private CheckinTutorialView view;

    public CheckinTutorialController(CheckinMapController checkinmapcontroller)
    {
        mapController = (CheckinMapController)Preconditions.checkNotNull(checkinmapcontroller);
        checkinmapcontroller.onTutorialBegin();
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        return false;
    }

    public void dismiss()
    {
        flow.goBack();
        mapController.onTutorialEnd();
    }

    public void handleActivityResult(int i, int j, Intent intent)
    {
    }

    public boolean handleOptionsMenuSelection(int i)
    {
        return false;
    }

    public void onViewInvisible()
    {
    }

    public void onViewVisible()
    {
        view.displayDialog();
    }

    CheckinTutorialController provideController()
    {
        return this;
    }

    public void setView(Object obj)
    {
        view = (CheckinTutorialView)Preconditions.checkNotNull(obj);
    }
}
