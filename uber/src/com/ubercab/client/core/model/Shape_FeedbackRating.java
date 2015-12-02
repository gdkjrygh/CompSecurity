// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            FeedbackRating, FeedbackSubject

public final class Shape_FeedbackRating extends FeedbackRating
{

    private String schema;
    private FeedbackSubject subject;
    private String uuid;
    private Object value;

    Shape_FeedbackRating()
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
            obj = (FeedbackRating)obj;
            if (((FeedbackRating) (obj)).getSchema() == null ? getSchema() != null : !((FeedbackRating) (obj)).getSchema().equals(getSchema()))
            {
                return false;
            }
            if (((FeedbackRating) (obj)).getUuid() == null ? getUuid() != null : !((FeedbackRating) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
            if (((FeedbackRating) (obj)).getValue() == null ? getValue() != null : !((FeedbackRating) (obj)).getValue().equals(getValue()))
            {
                return false;
            }
            if (((FeedbackRating) (obj)).getSubject() == null ? getSubject() != null : !((FeedbackRating) (obj)).getSubject().equals(getSubject()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getSchema()
    {
        return schema;
    }

    public final FeedbackSubject getSubject()
    {
        return subject;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final Object getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (schema == null)
        {
            i = 0;
        } else
        {
            i = schema.hashCode();
        }
        if (uuid == null)
        {
            j = 0;
        } else
        {
            j = uuid.hashCode();
        }
        if (value == null)
        {
            k = 0;
        } else
        {
            k = value.hashCode();
        }
        if (subject != null)
        {
            l = subject.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final FeedbackRating setSchema(String s)
    {
        schema = s;
        return this;
    }

    final FeedbackRating setSubject(FeedbackSubject feedbacksubject)
    {
        subject = feedbacksubject;
        return this;
    }

    final FeedbackRating setUuid(String s)
    {
        uuid = s;
        return this;
    }

    final FeedbackRating setValue(Object obj)
    {
        value = obj;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("FeedbackRating{schema=")).append(schema).append(", uuid=").append(uuid).append(", value=").append(value).append(", subject=").append(subject).append("}").toString();
    }
}
