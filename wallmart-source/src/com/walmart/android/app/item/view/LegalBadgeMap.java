// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import com.walmartlabs.utils.WLog;
import java.util.HashMap;

public class LegalBadgeMap
{

    private static final String TAG = com/walmart/android/app/item/view/LegalBadgeMap.getSimpleName();
    public static final int UNMAPPED = 0x7f02017d;
    private static final HashMap sMap;

    public LegalBadgeMap()
    {
    }

    public static int getBadge(String s)
    {
        int i;
        if (sMap.containsKey(s))
        {
            i = ((Integer)sMap.get(s)).intValue();
        } else
        {
            i = 0x7f02017d;
        }
        if (i == 0x7f02017d)
        {
            WLog.d(TAG, (new StringBuilder()).append("Legal badge unknown: ").append(s).toString());
        }
        return i;
    }

    static 
    {
        sMap = new HashMap();
        sMap.put("R", Integer.valueOf(0x7f020153));
        sMap.put("G", Integer.valueOf(0x7f02014f));
        sMap.put("PG", Integer.valueOf(0x7f020151));
        sMap.put("PG-13", Integer.valueOf(0x7f020152));
        sMap.put("Not Rated", Integer.valueOf(0x7f020150));
        sMap.put("EarlyChildhood", Integer.valueOf(0x7f02014b));
        sMap.put("Over10", Integer.valueOf(0x7f02014a));
        sMap.put("Teen", Integer.valueOf(0x7f02014e));
        sMap.put("Everyone", Integer.valueOf(0x7f020149));
        sMap.put("Mature", Integer.valueOf(0x7f02014c));
        sMap.put("Pending", Integer.valueOf(0x7f02014d));
        sMap.put("TV-Y", Integer.valueOf(0x7f020159));
        sMap.put("TV-Y7", Integer.valueOf(0x7f02015a));
        sMap.put("TV-G", Integer.valueOf(0x7f020156));
        sMap.put("TV-PG", Integer.valueOf(0x7f020158));
        sMap.put("TV-14", Integer.valueOf(0x7f020155));
        sMap.put("TV-MA", Integer.valueOf(0x7f020157));
        sMap.put("TV-Y7-FV", Integer.valueOf(0x7f02015b));
        sMap.put("NC-17", Integer.valueOf(0x7f020154));
        sMap.put("choking-hazard.png", Integer.valueOf(0x7f020147));
        sMap.put("legal_info_icon.png", Integer.valueOf(0x7f02015c));
    }
}
