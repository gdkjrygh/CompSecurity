// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;


public class ErrorResponse
{

    public final boolean mClearOnError;
    public final int mEditTextId;
    public final int mErrorMessageId;
    public final int mLabelId;

    public ErrorResponse(int i, int j)
    {
        mLabelId = i;
        mErrorMessageId = j;
        mClearOnError = false;
        mEditTextId = -1;
    }

    public ErrorResponse(int i, int j, boolean flag, int k)
    {
        mLabelId = i;
        mErrorMessageId = j;
        mClearOnError = flag;
        mEditTextId = k;
    }
}
