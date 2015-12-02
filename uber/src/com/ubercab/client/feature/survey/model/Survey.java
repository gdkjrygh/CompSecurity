// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;

import gjz;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Shape_Survey, Question

public abstract class Survey
{

    public static final int EVALUATED_NOT_SHOWN = 2;
    public static final int EVALUATED_SHOWN = 1;
    public static final int NOT_EVALUATED = 0;
    public static final int TYPE_DROP_OFF_SURVEY = 5;
    public static final int TYPE_IN_CAR_SURVEY = 4;
    public static final int TYPE_POOL_CANCELLATION_SURVEY = 7;
    public static final int TYPE_POOL_NO_WALKING_PICKUP_SURVEY = 2;
    public static final int TYPE_POOL_WALKING_PICKUP_SURVEY = 3;
    public static final int TYPE_SOLO_CANCELLATION_SURVEY = 0;
    public static final int TYPE_SOLO_PICKUP_SURVEY = 1;
    public static final int TYPE_VALUE_PROP_SURVEY = 6;

    public Survey()
    {
    }

    public static Survey create()
    {
        Shape_Survey shape_survey = new Shape_Survey();
        shape_survey.setQuestions(new ArrayList());
        return shape_survey;
    }

    public Survey addQuestion(Question question)
    {
        getQuestions().add(gjz.a(question));
        return this;
    }

    public abstract List getQuestions();

    public abstract long getRepeatTimeoutMs();

    public abstract int getSurveyType();

    public abstract Survey setQuestions(List list);

    public abstract Survey setRepeatTimeoutMs(long l);

    public abstract Survey setSurveyType(int i);
}
