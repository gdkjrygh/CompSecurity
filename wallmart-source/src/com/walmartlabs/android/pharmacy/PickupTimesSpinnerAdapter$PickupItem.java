// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PickupTimesSpinnerAdapter

public class mTime
{

    String mDate;
    String mDateFormatted;
    String mTime;
    final PickupTimesSpinnerAdapter this$0;

    public String getDate()
    {
        return mDateFormatted;
    }

    public String getTime()
    {
        return mTime;
    }

    public String toString()
    {
        return PickupTimesSpinnerAdapter.access$000(PickupTimesSpinnerAdapter.this, mDateFormatted, mTime);
    }

    public (String s, String s1, String s2)
    {
        this$0 = PickupTimesSpinnerAdapter.this;
        super();
        mDate = s;
        mDateFormatted = s1;
        mTime = s2;
    }
}
