// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.data.ManualShelfResult;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.utils.WLog;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public class ManualShelfItemLoader extends ItemLoader
{
    public class GetManualShelfCallback extends ItemLoader.LoaderRequest
    {

        final ManualShelfItemLoader this$0;

        public void onFailed(Integer integer, ManualShelfResult manualshelfresult)
        {
            WLog.w(ManualShelfItemLoader.TAG, (new StringBuilder()).append("Failed to load manual shelf items. ErrorCode: ").append(integer).toString());
            ManualShelfItemLoader manualshelfitemloader = ManualShelfItemLoader.this;
            if (integer.intValue() == 0x15f92)
            {
                manualshelfresult = ItemLoader.PageLoadError.NO_NETWORK;
            } else
            {
                manualshelfresult = ItemLoader.PageLoadError.OTHER;
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
                notifyError(ItemLoader.PageLoadError.NO_RESULTS);
                return;
            }
            List list = Arrays.asList(manualshelfresult.getItems());
            if (list.isEmpty())
            {
                notifyError(ItemLoader.PageLoadError.NO_RESULTS);
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

        public GetManualShelfCallback(Handler handler)
        {
            this$0 = ManualShelfItemLoader.this;
            super(ManualShelfItemLoader.this, handler);
        }
    }


    public static final String TAG = com/walmart/android/app/shop/itemloader/ManualShelfItemLoader.getSimpleName();
    private String mShelfId;

    public ManualShelfItemLoader(String s, int i)
    {
        super(i);
        mShelfId = s;
    }

    protected ItemLoader.LoaderRequest load(int i, int j)
    {
        GetManualShelfCallback getmanualshelfcallback = new GetManualShelfCallback(getHandler());
        Services.get().getWalmartService().getManualShelfExtended(mShelfId, j, getmanualshelfcallback);
        return getmanualshelfcallback;
    }

}
