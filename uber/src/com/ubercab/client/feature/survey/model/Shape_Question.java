// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.survey.model;

import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.survey.model:
//            Question

public final class Shape_Question extends Question
{

    private List answers;
    private String disclaimer;
    private int iconResource;
    private String id;
    private l impressionEvent;
    private String subtitle;
    private n tapEvent;
    private String title;
    private Question.TYPE type;

    Shape_Question()
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
            obj = (Question)obj;
            if (((Question) (obj)).getAnswers() == null ? getAnswers() != null : !((Question) (obj)).getAnswers().equals(getAnswers()))
            {
                return false;
            }
            if (((Question) (obj)).getDisclaimer() == null ? getDisclaimer() != null : !((Question) (obj)).getDisclaimer().equals(getDisclaimer()))
            {
                return false;
            }
            if (((Question) (obj)).getIconResource() != getIconResource())
            {
                return false;
            }
            if (((Question) (obj)).getId() == null ? getId() != null : !((Question) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((Question) (obj)).getImpressionEvent() == null ? getImpressionEvent() != null : !((Question) (obj)).getImpressionEvent().equals(getImpressionEvent()))
            {
                return false;
            }
            if (((Question) (obj)).getSubtitle() == null ? getSubtitle() != null : !((Question) (obj)).getSubtitle().equals(getSubtitle()))
            {
                return false;
            }
            if (((Question) (obj)).getTapEvent() == null ? getTapEvent() != null : !((Question) (obj)).getTapEvent().equals(getTapEvent()))
            {
                return false;
            }
            if (((Question) (obj)).getTitle() == null ? getTitle() != null : !((Question) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
            if (((Question) (obj)).getType() == null ? getType() != null : !((Question) (obj)).getType().equals(getType()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getAnswers()
    {
        return answers;
    }

    public final String getDisclaimer()
    {
        return disclaimer;
    }

    public final int getIconResource()
    {
        return iconResource;
    }

    public final String getId()
    {
        return id;
    }

    public final l getImpressionEvent()
    {
        return impressionEvent;
    }

    public final String getSubtitle()
    {
        return subtitle;
    }

    public final n getTapEvent()
    {
        return tapEvent;
    }

    public final String getTitle()
    {
        return title;
    }

    public final Question.TYPE getType()
    {
        return type;
    }

    public final int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        if (answers == null)
        {
            i = 0;
        } else
        {
            i = answers.hashCode();
        }
        if (disclaimer == null)
        {
            j = 0;
        } else
        {
            j = disclaimer.hashCode();
        }
        j2 = iconResource;
        if (id == null)
        {
            k = 0;
        } else
        {
            k = id.hashCode();
        }
        if (impressionEvent == null)
        {
            i1 = 0;
        } else
        {
            i1 = impressionEvent.hashCode();
        }
        if (subtitle == null)
        {
            j1 = 0;
        } else
        {
            j1 = subtitle.hashCode();
        }
        if (tapEvent == null)
        {
            k1 = 0;
        } else
        {
            k1 = tapEvent.hashCode();
        }
        if (title == null)
        {
            l1 = 0;
        } else
        {
            l1 = title.hashCode();
        }
        if (type != null)
        {
            i2 = type.hashCode();
        }
        return (l1 ^ (k1 ^ (j1 ^ (i1 ^ (k ^ ((j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ j2) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i2;
    }

    public final Question setAnswers(List list)
    {
        answers = list;
        return this;
    }

    public final Question setDisclaimer(String s)
    {
        disclaimer = s;
        return this;
    }

    public final Question setIconResource(int i)
    {
        iconResource = i;
        return this;
    }

    public final Question setId(String s)
    {
        id = s;
        return this;
    }

    public final Question setImpressionEvent(l l1)
    {
        impressionEvent = l1;
        return this;
    }

    public final Question setSubtitle(String s)
    {
        subtitle = s;
        return this;
    }

    public final Question setTapEvent(n n1)
    {
        tapEvent = n1;
        return this;
    }

    public final Question setTitle(String s)
    {
        title = s;
        return this;
    }

    public final Question setType(Question.TYPE type1)
    {
        type = type1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("Question{answers=")).append(answers).append(", disclaimer=").append(disclaimer).append(", iconResource=").append(iconResource).append(", id=").append(id).append(", impressionEvent=").append(impressionEvent).append(", subtitle=").append(subtitle).append(", tapEvent=").append(tapEvent).append(", title=").append(title).append(", type=").append(type).append("}").toString();
    }
}
