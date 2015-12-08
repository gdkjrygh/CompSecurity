// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class LoginEvent extends PredefinedEvent
{

    static final String METHOD_ATTRIBUTE = "method";
    static final String SUCCESS_ATTRIBUTE = "success";
    static final String TYPE = "login";

    public LoginEvent()
    {
    }

    String getPredefinedType()
    {
        return "login";
    }

    public LoginEvent putMethod(String s)
    {
        predefinedAttributes.put("method", s);
        return this;
    }

    public LoginEvent putSuccess(boolean flag)
    {
        predefinedAttributes.put("success", Boolean.toString(flag));
        return this;
    }
}
