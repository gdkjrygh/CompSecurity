// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import com.weather.checkin.provider.CheckinHistoryManager;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinHistoryListController, CheckinHistoryView

class this._cls1 extends AsyncTaskLoader
{

    final loadInBackground this$1;

    public Cursor loadInBackground()
    {
        return historyManager.queryAllCheckins();
    }

    public volatile Object loadInBackground()
    {
        return loadInBackground();
    }

    is._cls0(Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }

    // Unreferenced inner class com/weather/Weather/checkin/CheckinHistoryListController$1

/* anonymous class */
    class CheckinHistoryListController._cls1
        implements android.app.LoaderManager.LoaderCallbacks
    {

        final CheckinHistoryListController this$0;

        public Loader onCreateLoader(int i, Bundle bundle)
        {
            switch (i)
            {
            default:
                return null;

            case 11: // '\013'
                bundle = new CheckinHistoryListController._cls1._cls1(context);
                break;
            }
            bundle.forceLoad();
            return bundle;
        }

        public void onLoadFinished(Loader loader, Cursor cursor)
        {
            CheckinHistoryListController.access$000(CheckinHistoryListController.this).updateCursor(cursor);
        }

        public volatile void onLoadFinished(Loader loader, Object obj)
        {
            onLoadFinished(loader, (Cursor)obj);
        }

        public void onLoaderReset(Loader loader)
        {
            CheckinHistoryListController.access$000(CheckinHistoryListController.this).updateCursor(null);
        }

            
            {
                this$0 = CheckinHistoryListController.this;
                super();
            }
    }

}
