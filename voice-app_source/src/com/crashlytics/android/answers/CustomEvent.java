// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEvent, AnswersEventValidator

public class CustomEvent extends AnswersEvent
{

    private final String eventName;

    public CustomEvent(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("eventName must not be null");
        } else
        {
            eventName = validator.limitStringLength(s);
            return;
        }
    }

    String getCustomType()
    {
        return eventName;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{eventName:\"").append(eventName).append('"').append(", customAttributes:").append(customAttributes).append("}").toString();
    }
}
