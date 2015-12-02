// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_FeedbackTag

public abstract class FeedbackTag
    implements com.ubercab.rider.realtime.model.FeedbackTag
{

    public FeedbackTag()
    {
    }

    public static FeedbackTag create(String s, String s1)
    {
        return (new Shape_FeedbackTag()).setDescription(s).setUuid(s1);
    }

    public abstract String getDescription();

    public abstract String getUuid();

    abstract FeedbackTag setDescription(String s);

    abstract FeedbackTag setUuid(String s);
}
