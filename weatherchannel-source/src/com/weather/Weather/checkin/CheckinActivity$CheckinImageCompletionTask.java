// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinActivity, CheckinReportController

private class <init> extends AsyncTask
{

    private final Intent data;
    private final int requestCode;
    private final int resultCode;
    final CheckinActivity this$0;

    protected transient CheckinHistoryRecord doInBackground(Void avoid[])
    {
        Cursor cursor = (new <init>(CheckinActivity.this)).ckinHistoryManager().queryAllCheckins();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        avoid = CheckinHistoryManager.extractRecord(cursor);
        CheckinHistoryRecord checkinhistoryrecord;
        checkinhistoryrecord = avoid;
        if (cursor != null)
        {
            cursor.close();
            checkinhistoryrecord = avoid;
        }
_L5:
        return checkinhistoryrecord;
_L2:
        checkinhistoryrecord = null;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return null;
        avoid;
        if (cursor != null)
        {
            cursor.close();
        }
        throw avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(CheckinHistoryRecord checkinhistoryrecord)
    {
        super.onPostExecute(checkinhistoryrecord);
        if (checkinhistoryrecord == null)
        {
            return;
        } else
        {
            checkinhistoryrecord = new CheckinReportController(checkinhistoryrecord, new Handler());
            CheckinActivity.access$100(CheckinActivity.this).plus(new Object[] {
                checkinhistoryrecord
            }).inject(checkinhistoryrecord);
    /* block-local class not found */
    class _cls1 {}

            checkinhistoryrecord.setView(new _cls1());
            checkinhistoryrecord.setupForImageRecovery();
            checkinhistoryrecord.handleActivityResult(requestCode, resultCode, data);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((CheckinHistoryRecord)obj);
    }

    private _cls1(int i, int j, Intent intent)
    {
        this$0 = CheckinActivity.this;
        super();
        requestCode = i;
        resultCode = j;
        data = intent;
    }

    data(int i, int j, Intent intent, data data1)
    {
        this(i, j, intent);
    }
}
