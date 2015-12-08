// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter, SaverReceiptListAdapter

class val.sendPendingTrackEvent
    implements com.walmart.android.service.saver.sendPendingTrackEvent
{

    final SaverReceiptListPresenter this$0;
    final boolean val$hideLoading;
    final boolean val$sendPendingTrackEvent;

    public void onResult(Cursor cursor)
    {
        if (!isPopped())
        {
            SaverReceiptListPresenter.access$200(SaverReceiptListPresenter.this).changeCursor(cursor);
            if (val$hideLoading)
            {
                SaverReceiptListPresenter.access$1500(SaverReceiptListPresenter.this);
            }
            if (val$sendPendingTrackEvent)
            {
                SaverReceiptListPresenter.access$1600(SaverReceiptListPresenter.this);
            }
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Cursor)obj);
    }

    ack()
    {
        this$0 = final_saverreceiptlistpresenter;
        val$hideLoading = flag;
        val$sendPendingTrackEvent = Z.this;
        super();
    }
}
