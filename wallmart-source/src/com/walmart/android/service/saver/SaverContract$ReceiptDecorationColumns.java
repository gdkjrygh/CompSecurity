// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.provider.BaseColumns;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverContract

public static interface 
    extends BaseColumns
{

    public static final String DATE = "visitDate";
    public static final String ERECEIPT_DELETED = "eReceiptDeleted";
    public static final String ERECEIPT_MISSING = "eReceiptMissing";
    public static final String NOTIFICATION_SHOWN = "notificationShown";
    public static final String REJECTED_REASON = "rejected_reason";
    public static final String SEEN = "seen";
    public static final String SUBMIT_CONFIRMED = "submitConfirmed";
    public static final String TC_NBR = "tcNumber";
}
