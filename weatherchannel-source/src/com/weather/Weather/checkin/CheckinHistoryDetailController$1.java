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
//            CheckinHistoryDetailController, CheckinHistoryView

class this._cls0
    implements android.app.ailController._cls1
{

    final CheckinHistoryDetailController this$0;

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        switch (i)
        {
        default:
            return null;

        case 12: // '\f'
            bundle = new AsyncTaskLoader(activity) {

                final CheckinHistoryDetailController._cls1 this$1;

                public Cursor loadInBackground()
                {
                    return historyManager.queryAllCheckins();
                }

                public volatile Object loadInBackground()
                {
                    return loadInBackground();
                }

            
            {
                this$1 = CheckinHistoryDetailController._cls1.this;
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
        CheckinHistoryDetailController.access$002(CheckinHistoryDetailController.this, cursor);
        if (CheckinHistoryDetailController.access$000(CheckinHistoryDetailController.this) != null)
        {
            CheckinHistoryDetailController.access$000(CheckinHistoryDetailController.this).moveToPosition(CheckinHistoryDetailController.access$100(CheckinHistoryDetailController.this));
        }
        CheckinHistoryDetailController.access$200(CheckinHistoryDetailController.this).updateCursor(CheckinHistoryDetailController.access$000(CheckinHistoryDetailController.this));
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        CheckinHistoryDetailController.access$200(CheckinHistoryDetailController.this).updateCursor(null);
    }

    _cls1.this._cls1()
    {
        this$0 = CheckinHistoryDetailController.this;
        super();
    }
}
