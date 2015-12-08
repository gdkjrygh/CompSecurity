// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk;


public class SsdkUnsupportedException extends Exception
{

    public static final int DEVICE_NOT_SUPPORTED = 1;
    public static final int LIBRARY_NOT_INSTALLED = 2;
    public static final int LIBRARY_UPDATE_IS_RECOMMENDED = 4;
    public static final int LIBRARY_UPDATE_IS_REQUIRED = 3;
    public static final int VENDOR_NOT_SUPPORTED = 0;
    private int mErrorType;

    public SsdkUnsupportedException(String s, int i)
    {
        super(s);
        mErrorType = 0;
        mErrorType = i;
    }

    public int getType()
    {
        return mErrorType;
    }
}
