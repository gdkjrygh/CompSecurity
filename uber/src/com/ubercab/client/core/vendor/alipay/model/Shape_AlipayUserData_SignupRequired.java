// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay.model;


public final class Shape_AlipayUserData_SignupRequired extends AlipayUserData.SignupRequired
{

    private AlipayUserData.Fields fields;

    Shape_AlipayUserData_SignupRequired()
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
            obj = (AlipayUserData.SignupRequired)obj;
            if (((AlipayUserData.SignupRequired) (obj)).getFields() == null ? getFields() != null : !((AlipayUserData.SignupRequired) (obj)).getFields().equals(getFields()))
            {
                return false;
            }
        }
        return true;
    }

    public final AlipayUserData.Fields getFields()
    {
        return fields;
    }

    public final int hashCode()
    {
        int i;
        if (fields == null)
        {
            i = 0;
        } else
        {
            i = fields.hashCode();
        }
        return i ^ 0xf4243;
    }

    final AlipayUserData.SignupRequired setFields(AlipayUserData.Fields fields1)
    {
        fields = fields1;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AlipayUserData.SignupRequired{fields=")).append(fields).append("}").toString();
    }
}
