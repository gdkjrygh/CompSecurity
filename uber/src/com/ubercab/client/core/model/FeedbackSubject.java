// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FeedbackSubject

public abstract class FeedbackSubject
{

    public FeedbackSubject()
    {
    }

    public static FeedbackSubject create(String s, String s1)
    {
        return (new Shape_FeedbackSubject()).setType(s).setUuid(s1);
    }

    public abstract String getType();

    public abstract String getUuid();

    abstract FeedbackSubject setType(String s);

    abstract FeedbackSubject setUuid(String s);
}
