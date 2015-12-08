// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import java.util.Comparator;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverReceipt

class this._cls0
    implements Comparator
{

    final SaverManager this$0;

    public int compare(SaverReceipt saverreceipt, SaverReceipt saverreceipt1)
    {
        return saverreceipt1.compareTo(saverreceipt);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((SaverReceipt)obj, (SaverReceipt)obj1);
    }

    ()
    {
        this$0 = SaverManager.this;
        super();
    }
}
