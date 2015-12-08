// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class ResultType extends Enum
{

    public static final ResultType Cancel;
    public static final ResultType Error;
    public static final ResultType Success;
    private static final ResultType a[];

    private ResultType(String s, int i)
    {
        super(s, i);
    }

    public static ResultType valueOf(String s)
    {
        return (ResultType)Enum.valueOf(com/paypal/android/sdk/onetouch/core/ResultType, s);
    }

    public static ResultType[] values()
    {
        return (ResultType[])a.clone();
    }

    static 
    {
        Cancel = new ResultType("Cancel", 0);
        Error = new ResultType("Error", 1);
        Success = new ResultType("Success", 2);
        a = (new ResultType[] {
            Cancel, Error, Success
        });
    }
}
