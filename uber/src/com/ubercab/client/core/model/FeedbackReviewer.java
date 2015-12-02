// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FeedbackReviewer

public abstract class FeedbackReviewer
{

    public FeedbackReviewer()
    {
    }

    public static FeedbackReviewer create(String s)
    {
        return (new Shape_FeedbackReviewer()).setType(s);
    }

    public abstract String getType();

    abstract FeedbackReviewer setType(String s);
}
