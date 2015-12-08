// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


// Referenced classes of package com.walmart.android.service.saver:
//            SaverContract

public static final class mReason extends Enum
{

    private static final ALREADY_SUBMITTED $VALUES[];
    public static final ALREADY_SUBMITTED ALREADY_SUBMITTED;
    public static final ALREADY_SUBMITTED LIMIT_REACHED;
    public static final ALREADY_SUBMITTED NONE;
    public static final ALREADY_SUBMITTED PRE_PROGRAM;
    public static final ALREADY_SUBMITTED TOO_OLD;
    public static final ALREADY_SUBMITTED UNKNOWN;
    private final int mReason;

    public static mReason find(int i)
    {
        mReason amreason[] = values();
        int k = amreason.length;
        for (int j = 0; j < k; j++)
        {
            mReason mreason = amreason[j];
            if (mreason.mReason == i)
            {
                return mreason;
            }
        }

        return UNKNOWN;
    }

    public static boolean isPermanentRejectReason(int i)
    {
        return i == PRE_PROGRAM.getReason() || i == TOO_OLD.getReason() || i == ALREADY_SUBMITTED.getReason();
    }

    public static getReason valueOf(String s)
    {
        return (getReason)Enum.valueOf(com/walmart/android/service/saver/SaverContract$SaverRejectedReasons, s);
    }

    public static getReason[] values()
    {
        return (getReason[])$VALUES.clone();
    }

    public int getReason()
    {
        return mReason;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, 0);
        PRE_PROGRAM = new <init>("PRE_PROGRAM", 1, 1);
        TOO_OLD = new <init>("TOO_OLD", 2, 2);
        LIMIT_REACHED = new <init>("LIMIT_REACHED", 3, 3);
        NONE = new <init>("NONE", 4, 4);
        ALREADY_SUBMITTED = new <init>("ALREADY_SUBMITTED", 5, 5);
        $VALUES = (new .VALUES[] {
            UNKNOWN, PRE_PROGRAM, TOO_OLD, LIMIT_REACHED, NONE, ALREADY_SUBMITTED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mReason = j;
    }
}
