// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            ItemDataConverter

private static class mIsBasePriceInvalid extends mIsBasePriceInvalid
{

    public ( )
    {
        mGroupType = ItemDataConverter.access$000(.mGroupType);
        mTitle = .mTitle;
        mMinRequired = .mMinRequired;
        ArrayList arraylist;
        int i;
        int j;
        if (.mMinRequired > 0)
        {
            i = .mMinRequired;
        } else
        {
            i = 0x7fffffff;
        }
        mMaxSelectionsAllowed = i;
        arraylist = new ArrayList();
         = .mMaxSelectionsAllowed;
        j = .length;
        for (i = 0; i < j; i++)
        {
             1 = [i];
            if (1.mMaxSelectionsAllowed != null && 1.mMaxSelectionsAllowed.mMaxSelectionsAllowed != null)
            {
                arraylist.add((new <init>(1)).build());
            }
        }

        mOptions = Collections.unmodifiableList(arraylist);
        mIsBasePriceInvalid = true;
    }
}
