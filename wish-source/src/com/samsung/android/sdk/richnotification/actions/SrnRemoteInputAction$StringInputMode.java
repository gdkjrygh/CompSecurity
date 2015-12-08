// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;


// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

private static abstract class mCharLimit extends mCharLimit
{

    private Integer mCharLimit;

    protected int getCharLimit()
    {
        if (mCharLimit == null)
        {
            return 0x7fffffff;
        } else
        {
            return mCharLimit.intValue();
        }
    }

    public mCharLimit setCharacterLimit(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("character limit must be bigger than zero.");
        } else
        {
            mCharLimit = Integer.valueOf(i);
            return this;
        }
    }

    protected ype(ype ype)
    {
        super(ype);
    }

    protected ype(ype ype)
    {
        super(ype);
        mCharLimit = ype.mCharLimit;
    }
}
