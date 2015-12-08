// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


// Referenced classes of package com.walmart.android.service.saver:
//            SaverContract

public static final class mLabel extends Enum
{

    private static final Invalid $VALUES[];
    public static final Invalid CreditFound;
    public static final Invalid Invalid;
    public static final Invalid NoCreditFound;
    public static final Invalid Processing;
    public static final Invalid Unknown;
    private final String mLabel;
    private final int mState;

    public static mLabel find(int i)
    {
        mLabel amlabel[] = values();
        int k = amlabel.length;
        for (int j = 0; j < k; j++)
        {
            mLabel mlabel = amlabel[j];
            if (mlabel.mState == i)
            {
                return mlabel;
            }
        }

        return Unknown;
    }

    public static Unknown find(String s)
    {
        Unknown aunknown[] = values();
        int j = aunknown.length;
        for (int i = 0; i < j; i++)
        {
            Unknown unknown = aunknown[i];
            if (unknown.mLabel.equals(s))
            {
                return unknown;
            }
        }

        return Unknown;
    }

    public static boolean isProcessed(int i)
    {
        return i == CreditFound.getState() || i == NoCreditFound.getState();
    }

    public static getState valueOf(String s)
    {
        return (getState)Enum.valueOf(com/walmart/android/service/saver/SaverContract$SaverState, s);
    }

    public static getState[] values()
    {
        return (getState[])$VALUES.clone();
    }

    public int getState()
    {
        return mState;
    }

    static 
    {
        Unknown = new <init>("Unknown", 0, 0, "n/a");
        Processing = new <init>("Processing", 1, 1, "processing");
        CreditFound = new <init>("CreditFound", 2, 2, "credit_found");
        NoCreditFound = new <init>("NoCreditFound", 3, 3, "no_credit_found");
        Invalid = new <init>("Invalid", 4, 4, "invalid");
        $VALUES = (new .VALUES[] {
            Unknown, Processing, CreditFound, NoCreditFound, Invalid
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        mState = j;
        mLabel = s1;
    }
}
