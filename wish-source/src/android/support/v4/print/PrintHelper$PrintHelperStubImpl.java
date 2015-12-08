// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;

// Referenced classes of package android.support.v4.print:
//            PrintHelper

private static final class <init>
    implements pl
{

    int mColorMode;
    int mOrientation;
    int mScaleMode;

    public int getColorMode()
    {
        return mColorMode;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public int getScaleMode()
    {
        return mScaleMode;
    }

    public void printBitmap(String s, Bitmap bitmap, k k)
    {
    }

    public void printBitmap(String s, Uri uri, k k)
    {
    }

    public void setColorMode(int i)
    {
        mColorMode = i;
    }

    public void setOrientation(int i)
    {
        mOrientation = i;
    }

    public void setScaleMode(int i)
    {
        mScaleMode = i;
    }

    private k()
    {
        mScaleMode = 2;
        mColorMode = 2;
        mOrientation = 1;
    }

    mOrientation(mOrientation morientation)
    {
        this();
    }
}
