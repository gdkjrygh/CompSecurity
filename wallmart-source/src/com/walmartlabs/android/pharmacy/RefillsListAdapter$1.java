// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            RefillsListAdapter

class this._cls0
    implements Comparator
{

    final RefillsListAdapter this$0;

    private int compareDate(com.walmartlabs.android.pharmacy.service.ption ption, com.walmartlabs.android.pharmacy.service.ption ption1)
    {
        int i;
        try
        {
            ption = RefillsListAdapter.access$000().parse(ption.lastRefillDate);
            i = RefillsListAdapter.access$000().parse(ption1.lastRefillDate).compareTo(ption);
        }
        // Misplaced declaration of an exception variable
        catch (com.walmartlabs.android.pharmacy.service.ption ption)
        {
            Log.w(RefillsListAdapter.access$100(), "Date format error in prescription.");
            return 0;
        }
        return i;
    }

    public int compare(com.walmartlabs.android.pharmacy.service.ption ption, com.walmartlabs.android.pharmacy.service.ption ption1)
    {
        if (ption.canBeRefilled())
        {
            if (ption1.canBeRefilled())
            {
                return compareDate(ption, ption1);
            } else
            {
                return -1;
            }
        }
        if (ption1.canBeRefilled())
        {
            return 1;
        } else
        {
            return compareDate(ption, ption1);
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((com.walmartlabs.android.pharmacy.service.ption)obj, (com.walmartlabs.android.pharmacy.service.ption)obj1);
    }

    .Prescription()
    {
        this$0 = RefillsListAdapter.this;
        super();
    }
}
