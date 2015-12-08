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

class this._cls0
    implements android.app.istController._cls1
{

    final CheckinHistoryListController this$0;

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 11: // '\013'
            bundle = new AsyncTaskLoader(context) {

                final CheckinHistoryListController._cls1 this$1;

                public Cursor loadInBackground()
                {
                    return historyManager.queryAllCheckins();
                }

                public volatile Object loadInBackground()
                {
                    return loadInBackground();
                }

            
            {
                this$1 = CheckinHistoryListController._cls1.this;
                super(context);
            }
            };
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

    _cls1.this._cls1()
    {
        this$0 = CheckinHistoryListController.this;
        super();
    }
}
