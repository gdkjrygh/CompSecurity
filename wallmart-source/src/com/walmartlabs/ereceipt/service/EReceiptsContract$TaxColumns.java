// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.provider.BaseColumns;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptsContract

public static interface 
    extends BaseColumns
{

    public static final String AMOUNT = "amount";
    public static final String ERECEIPT_ID = "ereceiptId";
    public static final String LEVEL = "level";
    public static final String RATE_STR = "rateStr";
}
