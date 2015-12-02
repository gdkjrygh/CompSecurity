// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Survey

public final class Shape_Survey extends Survey
{

    private List questions;
    private long repeatTimeoutMs;
    private int surveyType;

    Shape_Survey()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Survey)obj;
            if (((Survey) (obj)).getQuestions() == null ? getQuestions() != null : !((Survey) (obj)).getQuestions().equals(getQuestions()))
            {
                return false;
            }
            if (((Survey) (obj)).getRepeatTimeoutMs() != getRepeatTimeoutMs())
            {
                return false;
            }
            if (((Survey) (obj)).getSurveyType() != getSurveyType())
            {
                return false;
            }
        }
        return true;
    }

    public final List getQuestions()
    {
        return questions;
    }

    public final long getRepeatTimeoutMs()
    {
        return repeatTimeoutMs;
    }

    public final int getSurveyType()
    {
        return surveyType;
    }

    public final int hashCode()
    {
        int i;
        if (questions == null)
        {
            i = 0;
        } else
        {
            i = questions.hashCode();
        }
        return (int)((long)((i ^ 0xf4243) * 0xf4243) ^ (repeatTimeoutMs >>> 32 ^ repeatTimeoutMs)) * 0xf4243 ^ surveyType;
    }

    public final Survey setQuestions(List list)
    {
        questions = list;
        return this;
    }

    public final Survey setRepeatTimeoutMs(long l)
    {
        repeatTimeoutMs = l;
        return this;
    }

    public final Survey setSurveyType(int i)
    {
        surveyType = i;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Survey{questions=")).append(questions).append(", repeatTimeoutMs=").append(repeatTimeoutMs).append(", surveyType=").append(surveyType).append("}").toString();
    }
}
