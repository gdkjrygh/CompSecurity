// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class title extends Enum
{

    private static final APP_PROMOTION_COMPANION_CARD $VALUES[];
    public static final APP_PROMOTION_COMPANION_CARD APP_PROMOTION_COMPANION_CARD;
    public static final APP_PROMOTION_COMPANION_CARD BRAND_SURVEY;
    public static final APP_PROMOTION_COMPANION_CARD BRAND_SURVEY_NON_SKIPPABLE;
    public static final APP_PROMOTION_COMPANION_CARD SKIPPABLE_INSTREAM;
    public static final APP_PROMOTION_COMPANION_CARD SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION;
    public final String title;

    public static title valueOf(String s)
    {
        return (title)Enum.valueOf(com/google/android/apps/youtube/core/client/DebugOnlyVmapAdRequester$ForceAdType, s);
    }

    public static title[] values()
    {
        return (title[])$VALUES.clone();
    }

    public final String toString()
    {
        return title;
    }

    static 
    {
        SKIPPABLE_INSTREAM = new <init>("SKIPPABLE_INSTREAM", 0, "Skippable instream");
        SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION = new <init>("SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION", 1, "CTA annotation in ad");
        BRAND_SURVEY = new <init>("BRAND_SURVEY", 2, "Brand ad survey");
        BRAND_SURVEY_NON_SKIPPABLE = new <init>("BRAND_SURVEY_NON_SKIPPABLE", 3, "Unskippable ad survey");
        APP_PROMOTION_COMPANION_CARD = new <init>("APP_PROMOTION_COMPANION_CARD", 4, "App promotion");
        $VALUES = (new .VALUES[] {
            SKIPPABLE_INSTREAM, SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION, BRAND_SURVEY, BRAND_SURVEY_NON_SKIPPABLE, APP_PROMOTION_COMPANION_CARD
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        title = s1;
    }
}
