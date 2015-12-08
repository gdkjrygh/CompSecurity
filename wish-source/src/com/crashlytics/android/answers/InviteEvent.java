// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class InviteEvent extends PredefinedEvent
{

    static final String METHOD_ATTRIBUTE = "method";
    static final String TYPE = "invite";

    public InviteEvent()
    {
    }

    String getPredefinedType()
    {
        return "invite";
    }

    public InviteEvent putMethod(String s)
    {
        predefinedAttributes.put("method", s);
        return this;
    }
}
