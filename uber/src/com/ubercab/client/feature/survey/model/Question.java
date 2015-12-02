// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;

import java.util.ArrayList;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Shape_Question, Answer

public abstract class Question
{

    public Question()
    {
    }

    public static Question create()
    {
        Shape_Question shape_question = new Shape_Question();
        shape_question.setAnswers(new ArrayList());
        return shape_question;
    }

    public Question addAnswer(Answer answer)
    {
        getAnswers().add(answer);
        return this;
    }

    public abstract List getAnswers();

    public abstract String getDisclaimer();

    public abstract int getIconResource();

    public abstract String getId();

    public abstract l getImpressionEvent();

    public abstract String getSubtitle();

    public abstract n getTapEvent();

    public abstract String getTitle();

    public abstract TYPE getType();

    public abstract Question setAnswers(List list);

    public abstract Question setDisclaimer(String s);

    public abstract Question setIconResource(int i);

    public abstract Question setId(String s);

    public abstract Question setImpressionEvent(l l);

    public abstract Question setSubtitle(String s);

    public abstract Question setTapEvent(n n);

    public abstract Question setTitle(String s);

    public abstract Question setType(TYPE type);
}
