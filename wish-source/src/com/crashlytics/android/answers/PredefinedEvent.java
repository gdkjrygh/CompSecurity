// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEvent, AnswersAttributes

public abstract class PredefinedEvent extends AnswersEvent
{

    final AnswersAttributes predefinedAttributes;

    public PredefinedEvent()
    {
        predefinedAttributes = new AnswersAttributes(validator);
    }

    Map getPredefinedAttributes()
    {
        return predefinedAttributes.attributes;
    }

    abstract String getPredefinedType();

    public String toString()
    {
        return (new StringBuilder()).append("{type:\"").append(getPredefinedType()).append('"').append(", predefinedAttributes:").append(predefinedAttributes).append(", customAttributes:").append(customAttributes).append("}").toString();
    }
}
