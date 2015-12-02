// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;


// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Shape_Answer

public abstract class Answer
{

    public Answer()
    {
    }

    static Answer create()
    {
        return new Shape_Answer();
    }

    public static Answer create(String s, String s1, String s2)
    {
        return create(s, s1, s2, 0);
    }

    public static Answer create(String s, String s1, String s2, int i)
    {
        Shape_Answer shape_answer = new Shape_Answer();
        shape_answer.setId(s);
        shape_answer.setIconResource(i);
        shape_answer.setNextQuestionId(s1);
        shape_answer.setText(s2);
        return shape_answer;
    }

    public abstract int getIconResource();

    public abstract String getId();

    public abstract String getNextQuestionId();

    public abstract String getText();

    abstract void setIconResource(int i);

    abstract void setId(String s);

    abstract void setNextQuestionId(String s);

    abstract void setText(String s);
}
