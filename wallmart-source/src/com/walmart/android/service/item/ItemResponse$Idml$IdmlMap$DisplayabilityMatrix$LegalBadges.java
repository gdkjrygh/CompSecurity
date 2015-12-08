// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class legalContentList
{

    public List legalContentList;

    public boolean isEmpty()
    {
        return legalContentList == null || legalContentList.isEmpty();
    }

    public a()
    {
        legalContentList = Collections.emptyList();
    }
}
