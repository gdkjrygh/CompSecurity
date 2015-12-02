// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingCartTopLineCharge

public final class Shape_ShoppingCartTopLineCharge extends ShoppingCartTopLineCharge
{

    private String label;
    private String type;
    private String value;

    Shape_ShoppingCartTopLineCharge()
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
            obj = (ShoppingCartTopLineCharge)obj;
            if (((ShoppingCartTopLineCharge) (obj)).getLabel() == null ? getLabel() != null : !((ShoppingCartTopLineCharge) (obj)).getLabel().equals(getLabel()))
            {
                return false;
            }
            if (((ShoppingCartTopLineCharge) (obj)).getType() == null ? getType() != null : !((ShoppingCartTopLineCharge) (obj)).getType().equals(getType()))
            {
                return false;
            }
            if (((ShoppingCartTopLineCharge) (obj)).getValue() == null ? getValue() != null : !((ShoppingCartTopLineCharge) (obj)).getValue().equals(getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getLabel()
    {
        return label;
    }

    public final String getType()
    {
        return type;
    }

    public final String getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (label == null)
        {
            i = 0;
        } else
        {
            i = label.hashCode();
        }
        if (type == null)
        {
            j = 0;
        } else
        {
            j = type.hashCode();
        }
        if (value != null)
        {
            k = value.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final ShoppingCartTopLineCharge setLabel(String s)
    {
        label = s;
        return this;
    }

    final ShoppingCartTopLineCharge setType(String s)
    {
        type = s;
        return this;
    }

    final ShoppingCartTopLineCharge setValue(String s)
    {
        value = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartTopLineCharge{label=")).append(label).append(", type=").append(type).append(", value=").append(value).append("}").toString();
    }
}
