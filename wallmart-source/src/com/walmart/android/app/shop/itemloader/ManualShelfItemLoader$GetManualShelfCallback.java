// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.data.ManualShelfResult;
import com.walmartlabs.utils.WLog;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ManualShelfItemLoader

public class this._cls0 extends this._cls0
{

    final ManualShelfItemLoader this$0;

    public void onFailed(Integer integer, ManualShelfResult manualshelfresult)
    {
        WLog.w(ManualShelfItemLoader.TAG, (new StringBuilder()).append("Failed to load manual shelf items. ErrorCode: ").append(integer).toString());
        ManualShelfItemLoader manualshelfitemloader = ManualShelfItemLoader.this;
        if (integer.intValue() == 0x15f92)
        {
            manualshelfresult = this._fld0;
        } else
        {
            manualshelfresult = this._fld0;
        }
        manualshelfitemloader.notifyError(manualshelfresult, integer.intValue());
    }

    public volatile void onFailed(Integer integer, Object obj)
    {
        onFailed(integer, (ManualShelfResult)obj);
    }

    public void onResponse(ManualShelfResult manualshelfresult)
    {
        setAllItemsLoaded();
        if (manualshelfresult.getTotalCount() == 0)
        {
            notifyError(onFailed);
            return;
        }
        List list = Arrays.asList(manualshelfresult.getItems());
        if (list.isEmpty())
        {
            notifyError(onFailed);
        } else
        {
            notifyFirstPageLoaded(list, manualshelfresult.getTotalCount());
        }
        WLog.i(ManualShelfItemLoader.TAG, String.format(Locale.US, "loaded %d items", new Object[] {
            Integer.valueOf(list.size())
        }));
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((ManualShelfResult)obj);
    }

    public (Handler handler)
    {
        this$0 = ManualShelfItemLoader.this;
        super(ManualShelfItemLoader.this, handler);
    }
}
