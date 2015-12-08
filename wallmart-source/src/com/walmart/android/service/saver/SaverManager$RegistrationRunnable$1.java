// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, StatusResponse

class val.customerEmail extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final String val$customerEmail;

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
        long l1 = cess._mth2500(this._cls1.this);
        long l = l1;
        if (l1 > 0L)
        {
            l = l1;
            if (l1 < 0x3a9800L)
            {
                l = l1 * 2L;
            }
        }
        l1 = l;
        if (l <= 0L)
        {
            l1 = 60000L;
        }
        WLog.d(SaverManager.access$1200(), (new StringBuilder()).append("Saver registration failed. Will try again in ").append(l1).append(" ms.").toString());
        cess._mth100(this._cls1.this, true);
        SaverManager.access$2600(_fld0, l1);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        SaverManager.access$2400(_fld0).getSharedPreferences("saver_pref", 0).edit()._mth0("registered_user", val$customerEmail).customerEmail();
        SaverManager.access$2702(_fld0, val$customerEmail);
        cess._mth100(this._cls1.this, true);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    (String s)
    {
        this$1 = final_;
        val$customerEmail = s;
        super(Handler.this);
    }
}
