// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Bitmap;

public class  extends 
{

    Bitmap mBigLargeIcon;
    boolean mBigLargeIconSet;
    Bitmap mPicture;

    public  bigPicture(Bitmap bitmap)
    {
        mPicture = bitmap;
        return this;
    }

    public mPicture setSummaryText(CharSequence charsequence)
    {
        mSummaryText = rSequenceLength(charsequence);
        mSummaryTextSet = true;
        return this;
    }

    public ()
    {
    }
}
