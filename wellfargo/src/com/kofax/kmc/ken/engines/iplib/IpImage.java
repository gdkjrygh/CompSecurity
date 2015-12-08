// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class IpImage
{

    int mBitDepth;
    int mChannels;
    public int mDoFakeCall;
    public int mDpiX;
    public int mDpiY;
    public ErrorInfo mErrorInfo;
    int mHeight;
    public int mJniImageHandle;
    int mWidth;

    public IpImage()
    {
        mChannels = 0;
        mBitDepth = 0;
        mDpiX = 0;
        mDpiY = 0;
        mWidth = 0;
        mHeight = 0;
        mJniImageHandle = -1;
        mDoFakeCall = 0;
    }

    public int getBitDepth()
    {
        return mBitDepth;
    }

    public int getChannels()
    {
        return mChannels;
    }

    public int getDpiX()
    {
        return mDpiX;
    }

    public int getDpiY()
    {
        return mDpiY;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public int getWidth()
    {
        return mWidth;
    }
}
