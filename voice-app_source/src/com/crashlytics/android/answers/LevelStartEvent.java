// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class LevelStartEvent extends PredefinedEvent
{

    static final String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final String TYPE = "levelStart";

    public LevelStartEvent()
    {
    }

    String getPredefinedType()
    {
        return "levelStart";
    }

    public LevelStartEvent putLevelName(String s)
    {
        predefinedAttributes.put("levelName", s);
        return this;
    }
}
