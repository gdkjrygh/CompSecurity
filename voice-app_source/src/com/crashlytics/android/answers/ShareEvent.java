// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class ShareEvent extends PredefinedEvent
{

    static final String CONTENT_ID_ATTRIBUTE = "contentId";
    static final String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final String METHOD_ATTRIBUTE = "method";
    static final String TYPE = "share";

    public ShareEvent()
    {
    }

    String getPredefinedType()
    {
        return "share";
    }

    public ShareEvent putContentId(String s)
    {
        predefinedAttributes.put("contentId", s);
        return this;
    }

    public ShareEvent putContentName(String s)
    {
        predefinedAttributes.put("contentName", s);
        return this;
    }

    public ShareEvent putContentType(String s)
    {
        predefinedAttributes.put("contentType", s);
        return this;
    }

    public ShareEvent putMethod(String s)
    {
        predefinedAttributes.put("method", s);
        return this;
    }
}
