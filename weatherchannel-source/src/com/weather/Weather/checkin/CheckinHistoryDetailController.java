// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import dagger.ObjectGraph;
import java.io.File;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinPhotoDisplayController, CheckinHistoryView, CheckinDisplayView, 
//            CheckinDisplayController

public class CheckinHistoryDetailController
    implements Controller
{
    public static class DisplayInjection
    {

        CheckinDisplayController provideDisplayController()
        {
        /* block-local class not found */
        class DisplayController {}

            return new DisplayController();
        }

        public DisplayInjection()
        {
        }
    }


    private static final int HISTORY_LOADER = 12;
    Activity activity;
    ObjectGraph baseObjectGraph;
    Context context;
    private Cursor currentCursor;
    private int currentPosition;
    private CheckinHistoryRecord currentRecord;
    CheckinHistoryManager historyManager;
    private android.app.LoaderManager.LoaderCallbacks loaderCallbacks;
    LoaderManager loaderManager;
    private CheckinHistoryView view;

    public CheckinHistoryDetailController(int i)
    {
        loaderCallbacks = new android.app.LoaderManager.LoaderCallbacks() {

            final CheckinHistoryDetailController this$0;

            public Loader onCreateLoader(int j, Bundle bundle)
            {
                switch (j)
                {
                default:
                    return null;

                case 12: // '\f'
                    bundle = new AsyncTaskLoader(activity) {

                        final _cls1 this$1;

                        public Cursor loadInBackground()
                        {
                            return historyManager.queryAllCheckins();
                        }

                        public volatile Object loadInBackground()
                        {
                            return loadInBackground();
                        }

            
            {
                this$1 = _cls1.this;
                super(context1);
            }
                    };
                    break;
                }
                bundle.forceLoad();
                return bundle;
            }

            public void onLoadFinished(Loader loader, Cursor cursor)
            {
                currentCursor = cursor;
                if (currentCursor != null)
                {
                    currentCursor.moveToPosition(currentPosition);
                }
                view.updateCursor(currentCursor);
            }

            public volatile void onLoadFinished(Loader loader, Object obj)
            {
                onLoadFinished(loader, (Cursor)obj);
            }

            public void onLoaderReset(Loader loader)
            {
                view.updateCursor(null);
            }

            
            {
                this$0 = CheckinHistoryDetailController.this;
                super();
            }
        };
        currentPosition = i;
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (currentRecord != null)
        {
            String s = currentRecord.getImagePath();
            if (s != null && (new File(s)).exists())
            {
                CheckinPhotoDisplayController.createPhotoShareMenu(menu, menuinflater, currentRecord, context, activity);
                return true;
            }
        }
        return false;
    }

    public void handleActivityResult(int i, int j, Intent intent)
    {
    }

    public boolean handleOptionsMenuSelection(int i)
    {
        return false;
    }

    public void onDetailViewVisible(CheckinHistoryRecord checkinhistoryrecord)
    {
        currentRecord = checkinhistoryrecord;
        activity.invalidateOptionsMenu();
    }

    public void onViewInvisible()
    {
        if (currentCursor != null)
        {
            currentPosition = currentCursor.getPosition();
            currentCursor = null;
        }
        view.updateCursor(null);
    }

    public void onViewVisible()
    {
        loaderManager.restartLoader(12, null, loaderCallbacks);
    }

    CheckinHistoryDetailController provideController()
    {
        return this;
    }

    public void setView(Object obj)
    {
        view = (CheckinHistoryView)Preconditions.checkNotNull(obj);
    }

    public void setupView(CheckinDisplayView checkindisplayview)
    {
        baseObjectGraph.plus(new Object[] {
            new DisplayInjection()
        }).inject(checkindisplayview);
        checkindisplayview.switchToHistoryDisplay();
    }



/*
    static Cursor access$002(CheckinHistoryDetailController checkinhistorydetailcontroller, Cursor cursor)
    {
        checkinhistorydetailcontroller.currentCursor = cursor;
        return cursor;
    }

*/


}
