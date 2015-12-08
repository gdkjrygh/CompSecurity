// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.review;


public final class ReviewSort extends Enum
{

    private static final ReviewSort $VALUES[];
    public static final ReviewSort HELPFULNESS_HIGHEST_FIRST;
    public static final ReviewSort RATING_HIGHEST_FIRST;
    public static final ReviewSort RATING_LOWEST_FIRST;
    public static final ReviewSort SUBMISSIONTIME_NEWEST_FIRST;
    public static final ReviewSort SUBMISSIONTIME_OLDEST_FIRST;
    private final String mValue;

    private ReviewSort(String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }

    public static ReviewSort valueOf(String s)
    {
        return (ReviewSort)Enum.valueOf(com/walmart/android/service/review/ReviewSort, s);
    }

    public static ReviewSort[] values()
    {
        return (ReviewSort[])$VALUES.clone();
    }

    String value()
    {
        return mValue;
    }

    static 
    {
        HELPFULNESS_HIGHEST_FIRST = new ReviewSort("HELPFULNESS_HIGHEST_FIRST", 0, "Helpfulness:desc");
        SUBMISSIONTIME_NEWEST_FIRST = new ReviewSort("SUBMISSIONTIME_NEWEST_FIRST", 1, "SubmissionTime:desc");
        SUBMISSIONTIME_OLDEST_FIRST = new ReviewSort("SUBMISSIONTIME_OLDEST_FIRST", 2, "SubmissionTime:asc");
        RATING_HIGHEST_FIRST = new ReviewSort("RATING_HIGHEST_FIRST", 3, "Rating:desc");
        RATING_LOWEST_FIRST = new ReviewSort("RATING_LOWEST_FIRST", 4, "Rating:asc");
        $VALUES = (new ReviewSort[] {
            HELPFULNESS_HIGHEST_FIRST, SUBMISSIONTIME_NEWEST_FIRST, SUBMISSIONTIME_OLDEST_FIRST, RATING_HIGHEST_FIRST, RATING_LOWEST_FIRST
        });
    }
}
