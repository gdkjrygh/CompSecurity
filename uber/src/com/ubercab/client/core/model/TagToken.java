// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class TagToken
{

    String tag;
    String validator;

    public TagToken()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TagToken)obj;
            if (tag == null ? ((TagToken) (obj)).tag != null : !tag.equals(((TagToken) (obj)).tag))
            {
                return false;
            }
            if (validator == null ? ((TagToken) (obj)).validator != null : !validator.equals(((TagToken) (obj)).validator))
            {
                return false;
            }
        }
        return true;
    }

    public String getTag()
    {
        if (tag != null)
        {
            return tag;
        } else
        {
            return "";
        }
    }

    public String getValidator()
    {
        if (validator != null)
        {
            return validator;
        } else
        {
            return "";
        }
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (validator != null)
        {
            i = validator.hashCode();
        } else
        {
            i = 0;
        }
        if (tag != null)
        {
            j = tag.hashCode();
        }
        return i * 31 + j;
    }
}
