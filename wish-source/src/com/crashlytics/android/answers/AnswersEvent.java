// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventValidator, AnswersAttributes

public abstract class AnswersEvent
{

    public static final int MAX_NUM_ATTRIBUTES = 20;
    public static final int MAX_STRING_LENGTH = 100;
    final AnswersAttributes customAttributes;
    final AnswersEventValidator validator = new AnswersEventValidator(20, 100, Fabric.isDebuggable());

    public AnswersEvent()
    {
        customAttributes = new AnswersAttributes(validator);
    }

    Map getCustomAttributes()
    {
        return customAttributes.attributes;
    }

    public AnswersEvent putCustomAttribute(String s, Number number)
    {
        customAttributes.put(s, number);
        return this;
    }

    public AnswersEvent putCustomAttribute(String s, String s1)
    {
        customAttributes.put(s, s1);
        return this;
    }
}
