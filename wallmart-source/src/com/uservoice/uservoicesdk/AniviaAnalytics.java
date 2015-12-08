// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;


public interface AniviaAnalytics
{
    public static interface Attribute
    {

        public static final String ARTICLE_HEADING = "articleHeading";
        public static final String EMAIL_PRESENT = "emailPresent";
        public static final String ISSUE_TYPE = "issueType";
        public static final String IS_SIGNED_IN = "isSignedIn";
        public static final String NAME = "name";
        public static final String NAME_PRESENT = "namePresent";
        public static final String SECTION = "section";
    }

    public static interface Event
    {

        public static final String PAGE_VIEW = "pageView";
        public static final String SUBMIT_FEEDBACK = "feedbackSubmit";
    }

    public static interface Page
    {

        public static final String ARTICLE = "related help content overlay";
        public static final String INVALID_EMAIL = "enter valid email overlay";
        public static final String REQUIRED_FIELD_MISSING = "complete required fields overlay";
    }

    public static interface Section
    {

        public static final String USER_FEEDBACK = "user feedback";
    }

    public static interface Value
    {

        public static final String NO = "no";
        public static final String YES = "yes";
    }

}
