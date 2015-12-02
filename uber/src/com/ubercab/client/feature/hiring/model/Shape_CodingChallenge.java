// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.hiring.model:
//            CodingChallenge

public final class Shape_CodingChallenge extends CodingChallenge
{

    private String id;
    private List questions;

    Shape_CodingChallenge()
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
            obj = (CodingChallenge)obj;
            if (((CodingChallenge) (obj)).getId() == null ? getId() != null : !((CodingChallenge) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((CodingChallenge) (obj)).getQuestions() == null ? getQuestions() != null : !((CodingChallenge) (obj)).getQuestions().equals(getQuestions()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return id;
    }

    public final List getQuestions()
    {
        return questions;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (questions != null)
        {
            j = questions.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    public final CodingChallenge setId(String s)
    {
        id = s;
        return this;
    }

    public final CodingChallenge setQuestions(List list)
    {
        questions = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("CodingChallenge{id=")).append(id).append(", questions=").append(questions).append("}").toString();
    }
}
