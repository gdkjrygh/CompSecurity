// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import java.util.List;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

class val.saverReceipts extends AsyncCallbackOnThread
{

    private int size;
    final checkIfDone this$1;
    final List val$saverReceipts;

    private void checkIfDone()
    {
        int i = size - 1;
        size = i;
        if (i <= 0 && !Cancelled())
        {
            SaverManager.access$1100(_fld0, null);
        }
    }

    public void onFailureSameThread(Integer integer, Object obj)
    {
        checkIfDone();
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, obj1);
    }

    public void onSuccessSameThread(Object obj)
    {
        checkIfDone();
    }

    (List list)
    {
        this$1 = final_;
        val$saverReceipts = list;
        super(Handler.this);
        size = val$saverReceipts.size();
    }
}
