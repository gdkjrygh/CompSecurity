// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//            PredefinedEvent, AnswersAttributes

public class LevelEndEvent extends PredefinedEvent
{

    static final String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final String SCORE_ATTRIBUTE = "score";
    static final String SUCCESS_ATTRIBUTE = "success";
    static final String TYPE = "levelEnd";

    public LevelEndEvent()
    {
    }

    String getPredefinedType()
    {
        return "levelEnd";
    }

    public LevelEndEvent putLevelName(String s)
    {
        predefinedAttributes.put("levelName", s);
        return this;
    }

    public LevelEndEvent putScore(Number number)
    {
        predefinedAttributes.put("score", number);
        return this;
    }

    public LevelEndEvent putSuccess(boolean flag)
    {
        AnswersAttributes answersattributes = predefinedAttributes;
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        answersattributes.put("success", s);
        return this;
    }
}
