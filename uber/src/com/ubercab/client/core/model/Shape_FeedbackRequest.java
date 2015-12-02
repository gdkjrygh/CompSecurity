// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            FeedbackRequest, FeedbackReviewer

public final class Shape_FeedbackRequest extends FeedbackRequest
{

    private String jobUuid;
    private List ratings;
    private FeedbackReviewer reviewer;

    Shape_FeedbackRequest()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FeedbackRequest)obj;
            if (((FeedbackRequest) (obj)).getJobUuid() == null ? getJobUuid() != null : !((FeedbackRequest) (obj)).getJobUuid().equals(getJobUuid()))
            {
                return false;
            }
            if (((FeedbackRequest) (obj)).getReviewer() == null ? getReviewer() != null : !((FeedbackRequest) (obj)).getReviewer().equals(getReviewer()))
            {
                return false;
            }
            if (((FeedbackRequest) (obj)).getRatings() == null ? getRatings() != null : !((FeedbackRequest) (obj)).getRatings().equals(getRatings()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getJobUuid()
    {
        return jobUuid;
    }

    public final List getRatings()
    {
        return ratings;
    }

    public final FeedbackReviewer getReviewer()
    {
        return reviewer;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (jobUuid == null)
        {
            i = 0;
        } else
        {
            i = jobUuid.hashCode();
        }
        if (reviewer == null)
        {
            j = 0;
        } else
        {
            j = reviewer.hashCode();
        }
        if (ratings != null)
        {
            k = ratings.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final FeedbackRequest setJobUuid(String s)
    {
        jobUuid = s;
        return this;
    }

    final FeedbackRequest setRatings(List list)
    {
        ratings = list;
        return this;
    }

    final FeedbackRequest setReviewer(FeedbackReviewer feedbackreviewer)
    {
        reviewer = feedbackreviewer;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("FeedbackRequest{jobUuid=")).append(jobUuid).append(", reviewer=").append(reviewer).append(", ratings=").append(ratings).append("}").toString();
    }
}
