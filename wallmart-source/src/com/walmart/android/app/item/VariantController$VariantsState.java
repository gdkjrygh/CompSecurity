// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.item:
//            VariantController

private static class <init>
{

    private HashMap mSelectedValues;

    public void deselectType(com.walmart.android.service.item.t> t>)
    {
        mSelectedValues.remove(t>.ectedValues());
    }

    public Collection getSelectedValues()
    {
        return Collections.unmodifiableCollection(mSelectedValues.values());
    }

    public int getSelectionCount()
    {
        return mSelectedValues.size();
    }

    public void select(com.walmart.android.service.item.ectedValues ectedvalues)
    {
        mSelectedValues.put(ectedvalues.ectedValues(), ectedvalues);
    }

    private ()
    {
        mSelectedValues = new HashMap();
    }

    mSelectedValues(mSelectedValues mselectedvalues)
    {
        this();
    }
}
