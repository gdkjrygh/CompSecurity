// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FeedbackRating, FeedbackSubject

public abstract class FeedbackRating
{

    public FeedbackRating()
    {
    }

    public static FeedbackRating create(String s, String s1, Object obj, FeedbackSubject feedbacksubject)
    {
        return (new Shape_FeedbackRating()).setSchema(s).setUuid(s1).setValue(obj).setSubject(feedbacksubject);
    }

    public abstract String getSchema();

    public abstract FeedbackSubject getSubject();

    public abstract String getUuid();

    public abstract Object getValue();

    abstract FeedbackRating setSchema(String s);

    abstract FeedbackRating setSubject(FeedbackSubject feedbacksubject);

    abstract FeedbackRating setUuid(String s);

    abstract FeedbackRating setValue(Object obj);
}
