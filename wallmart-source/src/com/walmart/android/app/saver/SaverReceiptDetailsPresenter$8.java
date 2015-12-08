// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.Cursor;
import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter, SaverReceiptListAdapter

class this._cls0
    implements com.walmart.android.service.saver.._cls0
{

    final SaverReceiptDetailsPresenter this$0;

    public void onResult(Cursor cursor)
    {
label0:
        {
            if (!isPopped())
            {
                if (cursor == null || cursor.getCount() <= 0)
                {
                    break label0;
                }
                SaverReceiptDetailsPresenter.access$1300(SaverReceiptDetailsPresenter.this).changeCursor(cursor);
                SaverReceiptDetailsPresenter.access$1500(SaverReceiptDetailsPresenter.this).setAdapter(SaverReceiptDetailsPresenter.access$1400(SaverReceiptDetailsPresenter.this));
                SaverReceiptDetailsPresenter.access$1600(SaverReceiptDetailsPresenter.this).setVisibility(8);
                if (SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this) < 0)
                {
                    SaverReceiptDetailsPresenter.access$002(SaverReceiptDetailsPresenter.this, SaverReceiptDetailsPresenter.access$1300(SaverReceiptDetailsPresenter.this).findPosition(SaverReceiptDetailsPresenter.access$1700(SaverReceiptDetailsPresenter.this)));
                }
                if (SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this) < 0)
                {
                    SaverReceiptDetailsPresenter.access$502(SaverReceiptDetailsPresenter.this, true);
                    SaverReceiptDetailsPresenter.access$1800(SaverReceiptDetailsPresenter.this, 0);
                } else
                {
                    SaverReceiptDetailsPresenter.access$1500(SaverReceiptDetailsPresenter.this).setCurrentItem(SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this), false);
                    SaverReceiptDetailsPresenter.access$100(SaverReceiptDetailsPresenter.this, SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this));
                    SaverReceiptDetailsPresenter.access$200(SaverReceiptDetailsPresenter.this, SaverReceiptDetailsPresenter.access$000(SaverReceiptDetailsPresenter.this));
                    SaverReceiptDetailsPresenter.access$300(SaverReceiptDetailsPresenter.this);
                }
                SaverReceiptDetailsPresenter.access$1900(SaverReceiptDetailsPresenter.this);
            }
            return;
        }
        SaverReceiptDetailsPresenter.access$502(SaverReceiptDetailsPresenter.this, true);
        SaverReceiptDetailsPresenter.access$2000(SaverReceiptDetailsPresenter.this, 2);
    }

    public volatile void onResult(Object obj)
    {
        onResult((Cursor)obj);
    }

    ()
    {
        this$0 = SaverReceiptDetailsPresenter.this;
        super();
    }
}
