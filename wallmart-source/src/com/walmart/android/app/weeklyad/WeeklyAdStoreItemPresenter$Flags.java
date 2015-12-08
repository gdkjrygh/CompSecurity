// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdStoreItemPresenter

private static class _cls1.put
{

    private static final Map sPriceFlagToResourceIdMap = new HashMap() {

            
            {
                put("FREE SHIPPING", Integer.valueOf(0x7f0201bf));
                put("ROLLBACK", Integer.valueOf(0x7f0201bf));
                put("CLEARANCE", Integer.valueOf(0x7f0201bf));
                put("DARE TO COMPARE", Integer.valueOf(0x7f0201c0));
                put("SAME DAY DELIVERY", Integer.valueOf(0x7f0201bf));
                put("COMING SOON", Integer.valueOf(0x7f0201c1));
                put("WALMART EXCLUSIVE", Integer.valueOf(0x7f0201bf));
                put("PERSONALIZE IT", Integer.valueOf(0x7f0201c0));
                put("SPECIAL BUY", Integer.valueOf(0x7f0201c0));
                put("SAVE ON SHIPPING", Integer.valueOf(0x7f0201bf));
                put("REBATE AVAILABLE", Integer.valueOf(0x7f0201bf));
                put("AS ADVERTISED", Integer.valueOf(0x7f0201c1));
                put("AWARD WINNING", Integer.valueOf(0x7f0201c1));
                put("NEW", Integer.valueOf(0x7f0201c1));
                put("NEW ITEM", Integer.valueOf(0x7f0201c1));
                put("CERTIFIED ITEM", Integer.valueOf(0x7f0201c0));
                put("AS SEEN ON TV", Integer.valueOf(0x7f0201c0));
            }
    };

    public static int getResourceIdForFlag(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = (Integer)sPriceFlagToResourceIdMap.get(s.toUpperCase(Locale.US));
            if (s != null)
            {
                return s.intValue();
            }
        }
        return 0x7f0201bf;
    }


    private _cls1.put()
    {
    }
}
