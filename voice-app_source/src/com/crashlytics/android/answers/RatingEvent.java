// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class RatingEvent extends PredefinedEvent
{

    static final String CONTENT_ID_ATTRIBUTE = "contentId";
    static final String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final String RATING_ATTRIBUTE = "rating";
    static final String TYPE = "rating";

    public RatingEvent()
    {
    }

    String getPredefinedType()
    {
        return "rating";
    }

    public RatingEvent putContentId(String s)
    {
        predefinedAttributes.put("contentId", s);
        return this;
    }

    public RatingEvent putContentName(String s)
    {
        predefinedAttributes.put("contentName", s);
        return this;
    }

    public RatingEvent putContentType(String s)
    {
        predefinedAttributes.put("contentType", s);
        return this;
    }

    public RatingEvent putRating(int i)
    {
        predefinedAttributes.put("rating", Integer.valueOf(i));
        return this;
    }
}
