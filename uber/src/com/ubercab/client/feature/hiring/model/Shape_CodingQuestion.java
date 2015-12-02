// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.hiring.model:
//            CodingQuestion

public final class Shape_CodingQuestion extends CodingQuestion
{

    private String code;
    private List correctAnswers;
    private String id;
    private CodingQuestion.Type type;

    Shape_CodingQuestion()
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
            obj = (CodingQuestion)obj;
            if (((CodingQuestion) (obj)).getId() == null ? getId() != null : !((CodingQuestion) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((CodingQuestion) (obj)).getCode() == null ? getCode() != null : !((CodingQuestion) (obj)).getCode().equals(getCode()))
            {
                return false;
            }
            if (((CodingQuestion) (obj)).getCorrectAnswers() == null ? getCorrectAnswers() != null : !((CodingQuestion) (obj)).getCorrectAnswers().equals(getCorrectAnswers()))
            {
                return false;
            }
            if (((CodingQuestion) (obj)).getType() == null ? getType() != null : !((CodingQuestion) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCode()
    {
        return code;
    }

    public final List getCorrectAnswers()
    {
        return correctAnswers;
    }

    public final String getId()
    {
        return id;
    }

    public final CodingQuestion.Type getType()
    {
        return type;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (code == null)
        {
            j = 0;
        } else
        {
            j = code.hashCode();
        }
        if (correctAnswers == null)
        {
            k = 0;
        } else
        {
            k = correctAnswers.hashCode();
        }
        if (type != null)
        {
            l = type.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    public final CodingQuestion setCode(String s)
    {
        code = s;
        return this;
    }

    public final CodingQuestion setCorrectAnswers(List list)
    {
        correctAnswers = list;
        return this;
    }

    public final CodingQuestion setId(String s)
    {
        id = s;
        return this;
    }

    public final CodingQuestion setType(CodingQuestion.Type type1)
    {
        type = type1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("CodingQuestion{id=")).append(id).append(", code=").append(code).append(", correctAnswers=").append(correctAnswers).append(", type=").append(type).append("}").toString();
    }
}
