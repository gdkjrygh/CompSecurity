// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;


// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Answer

public final class Shape_Answer extends Answer
{

    private int iconResource;
    private String id;
    private String nextQuestionId;
    private String text;

    Shape_Answer()
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
            obj = (Answer)obj;
            if (((Answer) (obj)).getIconResource() != getIconResource())
            {
                return false;
            }
            if (((Answer) (obj)).getId() == null ? getId() != null : !((Answer) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((Answer) (obj)).getNextQuestionId() == null ? getNextQuestionId() != null : !((Answer) (obj)).getNextQuestionId().equals(getNextQuestionId()))
            {
                return false;
            }
            if (((Answer) (obj)).getText() == null ? getText() != null : !((Answer) (obj)).getText().equals(getText()))
            {
                return false;
            }
        }
        return true;
    }

    public final int getIconResource()
    {
        return iconResource;
    }

    public final String getId()
    {
        return id;
    }

    public final String getNextQuestionId()
    {
        return nextQuestionId;
    }

    public final String getText()
    {
        return text;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = iconResource;
        int i;
        int j;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        if (nextQuestionId == null)
        {
            j = 0;
        } else
        {
            j = nextQuestionId.hashCode();
        }
        if (text != null)
        {
            k = text.hashCode();
        }
        return (j ^ (i ^ (l ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final void setIconResource(int i)
    {
        iconResource = i;
    }

    final void setId(String s)
    {
        id = s;
    }

    final void setNextQuestionId(String s)
    {
        nextQuestionId = s;
    }

    final void setText(String s)
    {
        text = s;
    }

    public final String toString()
    {
        return (new StringBuilder("Answer{iconResource=")).append(iconResource).append(", id=").append(id).append(", nextQuestionId=").append(nextQuestionId).append(", text=").append(text).append("}").toString();
    }
}
