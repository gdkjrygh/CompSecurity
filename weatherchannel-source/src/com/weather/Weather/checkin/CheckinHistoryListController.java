// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.LoaderManager;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.common.base.Preconditions;
import com.weather.beacons.analytics.Analytics;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import flow.Flow;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinHistoryView, CheckinHistoryDetailController

public class CheckinHistoryListController
    implements Controller
{

    private static final int HISTORY_LOADER = 11;
    Context context;
    Flow flow;
    CheckinHistoryManager historyManager;
    private android.app.LoaderManager.LoaderCallbacks loaderCallbacks;
    LoaderManager loaderManager;
    private CheckinHistoryView view;

    public CheckinHistoryListController()
    {
        loaderCallbacks = new android.app.LoaderManager.LoaderCallbacks() {

            final CheckinHistoryListController this$0;

            public Loader onCreateLoader(int i, Bundle bundle)
            {
                switch (i)
                {
                default:
                    return null;

                case 11: // '\013'
                    bundle = new AsyncTaskLoader(context) {

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
                view.updateCursor(cursor);
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
                this$0 = CheckinHistoryListController.this;
                super();
            }
        };
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f100000, menu);
        return false;
    }

    public void deleteCheckin(CheckinHistoryRecord checkinhistoryrecord)
    {
        historyManager.deleteCheckin(checkinhistoryrecord.getId(), checkinhistoryrecord.getImagePath());
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
        view.updateCursor(null);
    }

    public void onViewVisible()
    {
        Analytics.trackState(context.getResources().getString(0x7f07049b), null);
        view.updateTitle();
        loaderManager.restartLoader(11, null, loaderCallbacks);
    }

    public void setView(Object obj)
    {
        view = (CheckinHistoryView)Preconditions.checkNotNull(obj);
    }

    public void viewCheckin(int i)
    {
        flow.goTo(new CheckinHistoryDetailController(i));
    }

}
