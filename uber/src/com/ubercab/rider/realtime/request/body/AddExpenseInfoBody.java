// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_AddExpenseInfoBody

public abstract class AddExpenseInfoBody
{

    public AddExpenseInfoBody()
    {
    }

    public static AddExpenseInfoBody create()
    {
        return new Shape_AddExpenseInfoBody();
    }

    public abstract String getCode();

    public abstract String getMemo();

    public abstract Boolean isExpenseTrip();

    public abstract AddExpenseInfoBody setCode(String s);

    public abstract AddExpenseInfoBody setExpenseTrip(Boolean boolean1);

    public abstract AddExpenseInfoBody setMemo(String s);
}
