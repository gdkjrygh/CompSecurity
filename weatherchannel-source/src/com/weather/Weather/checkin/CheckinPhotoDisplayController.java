// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.common.base.Preconditions;
import com.weather.Weather.ui.CustomShareActionProvider;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.util.intent.MimeType;
import java.io.File;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinDisplayView

public class CheckinPhotoDisplayController
    implements Controller
{

    Activity activity;
    Context context;
    private final CheckinHistoryRecord record;
    private CheckinDisplayView view;

    public CheckinPhotoDisplayController(CheckinHistoryRecord checkinhistoryrecord)
    {
        record = (CheckinHistoryRecord)Preconditions.checkNotNull(checkinhistoryrecord);
        Preconditions.checkNotNull(checkinhistoryrecord.getImagePath());
    }

    public static void createPhotoShareMenu(Menu menu, MenuInflater menuinflater, CheckinHistoryRecord checkinhistoryrecord, Context context1, Activity activity1)
    {
        Preconditions.checkNotNull(menu);
        Preconditions.checkNotNull(menuinflater);
        Preconditions.checkNotNull(checkinhistoryrecord);
        Preconditions.checkNotNull(context1);
        menuinflater.inflate(0x7f100007, menu);
        menu = menu.findItem(0x7f0d0362);
        if (menu == null)
        {
            menu = null;
        } else
        {
            menu = (CustomShareActionProvider)menu.getActionProvider();
        }
        if (menu != null)
        {
            menu.setShareIntent(createShareIntent(checkinhistoryrecord, context1));
        }
    }

    private static Intent createShareIntent(CheckinHistoryRecord checkinhistoryrecord, Context context1)
    {
        Preconditions.checkNotNull(checkinhistoryrecord);
        String s = (String)Preconditions.checkNotNull(checkinhistoryrecord.getImagePath());
        checkinhistoryrecord = new Intent("android.intent.action.SEND");
        checkinhistoryrecord.addFlags(0x80000);
        checkinhistoryrecord.setType(MimeType.IMAGE.getMimeString());
        checkinhistoryrecord.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s)));
        context1 = context1.getResources();
        checkinhistoryrecord.putExtra("android.intent.extra.SUBJECT", context1.getString(0x7f0704f8));
        checkinhistoryrecord.putExtra("android.intent.extra.TEXT", context1.getString(0x7f0704f9));
        return checkinhistoryrecord;
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        createPhotoShareMenu(menu, menuinflater, record, context, activity);
        return true;
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
        view.initialize();
        view.displayReport(record);
    }

    public void setView(Object obj)
    {
        view = (CheckinDisplayView)Preconditions.checkNotNull(obj);
    }
}
