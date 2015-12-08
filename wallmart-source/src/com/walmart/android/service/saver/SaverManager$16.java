// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.utils.WLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider

class ultCallback extends AsyncTask
{

    final SaverManager this$0;
    final ultCallback val$callback;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Date doInBackground(Void avoid[])
    {
        String s = SaverManager.access$600(SaverManager.this).getOldestSaverReceipt();
        avoid = null;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                avoid = EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                WLog.e(SaverManager.access$1200(), "Could not parse date read from database", avoid);
                return null;
            }
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Date)obj);
    }

    protected void onPostExecute(Date date)
    {
        val$callback.onResult(date);
    }

    ultCallback()
    {
        this$0 = final_savermanager;
        val$callback = ultCallback.this;
        super();
    }
}
