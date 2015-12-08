// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.review;


public final class FeedbackHelpfulness extends Enum
{

    private static final FeedbackHelpfulness $VALUES[];
    public static final FeedbackHelpfulness NEGATIVE;
    public static final FeedbackHelpfulness POSITIVE;
    public static final FeedbackHelpfulness UNDO;
    private final String mValue;

    private FeedbackHelpfulness(String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }

    public static FeedbackHelpfulness valueOf(String s)
    {
        return (FeedbackHelpfulness)Enum.valueOf(com/walmart/android/service/review/FeedbackHelpfulness, s);
    }

    public static FeedbackHelpfulness[] values()
    {
        return (FeedbackHelpfulness[])$VALUES.clone();
    }

    String value()
    {
        return mValue;
    }

    static 
    {
        POSITIVE = new FeedbackHelpfulness("POSITIVE", 0, "Positive");
        NEGATIVE = new FeedbackHelpfulness("NEGATIVE", 1, "Negative");
        UNDO = new FeedbackHelpfulness("UNDO", 2, "UNDO");
        $VALUES = (new FeedbackHelpfulness[] {
            POSITIVE, NEGATIVE, UNDO
        });
    }
}
