// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.app.NotificationManager;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.utils.WLog;
import java.util.Set;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupService

private class mAniviaType extends mAniviaType
{

    public static final String EXTRAS_STORE_ID = "STORE_ID";
    public static final String EXTRAS_TEXT = "TEXT";
    public static final String EXTRAS_TITLE = "TITLE";
    public static final String EXTRAS_TYPE = "ANIVIA";
    private final String mAniviaType;
    private final String mStoreId;
    private final String mText;
    private final String mTitle;
    final FastPickupService this$0;

    public void onSuccessSameThread(FastPickupOrder fastpickuporder)
    {
        WLog.d(FastPickupService.access$100(), "PushNotification.onSuccessSameThread()");
        if (SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(FastPickupService.this) && fastpickuporder != null && fastpickuporder.getCount(mStoreId) > 0)
        {
            int i = FastPickupUtil.getNextPushRequestCode(FastPickupService.this);
            Object obj = fastpickuporder.getOrderIds(mStoreId);
            obj = FastPickupUtil.createNotification(FastPickupService.this, mStoreId, mTitle, mText, mAniviaType, i, (String[])((Set) (obj)).toArray(new String[((Set) (obj)).size()]));
            ((NotificationManager)getSystemService("notification")).notify("FastPickupPushNotification", i, ((android.app.Notification) (obj)));
        }
        super.sSameThread(fastpickuporder);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((FastPickupOrder)obj);
    }

    public Q(int i, String s, String s1, String s2, String s3)
    {
        this$0 = FastPickupService.this;
        super(FastPickupService.this, i);
        mStoreId = s;
        mTitle = s1;
        mText = s2;
        mAniviaType = s3;
    }
}
