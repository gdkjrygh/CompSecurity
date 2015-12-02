// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FeedbackRequest, FeedbackReviewer

public abstract class FeedbackRequest
{

    public FeedbackRequest()
    {
    }

    public static FeedbackRequest create(String s, FeedbackReviewer feedbackreviewer, List list)
    {
        return (new Shape_FeedbackRequest()).setJobUuid(s).setReviewer(feedbackreviewer).setRatings(list);
    }

    public abstract String getJobUuid();

    public abstract List getRatings();

    public abstract FeedbackReviewer getReviewer();

    abstract FeedbackRequest setJobUuid(String s);

    abstract FeedbackRequest setRatings(List list);

    abstract FeedbackRequest setReviewer(FeedbackReviewer feedbackreviewer);
}
