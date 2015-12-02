// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import gjx;
import java.util.Map;

public final class SignupRequired
{

    public Map fields;

    public SignupRequired()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (SignupRequired)obj;
            return gjx.a(fields, ((SignupRequired) (obj)).fields);
        }
    }

    final Map getFields()
    {
        return fields;
    }

    public final int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (fields != null)
        {
            i = fields.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
