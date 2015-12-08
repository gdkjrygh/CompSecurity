// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class SearchEvent extends PredefinedEvent
{

    static final String QUERY_ATTRIBUTE = "query";
    static final String TYPE = "search";

    public SearchEvent()
    {
    }

    String getPredefinedType()
    {
        return "search";
    }

    public SearchEvent putQuery(String s)
    {
        predefinedAttributes.put("query", s);
        return this;
    }
}
