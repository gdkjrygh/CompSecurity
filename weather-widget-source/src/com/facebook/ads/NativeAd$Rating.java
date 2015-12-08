// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import org.json.JSONObject;

public class scale
{

    private final double scale;
    private final double value;

    public static scale fromJSONObject(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            double d = jsonobject.optDouble("value", 0.0D);
            double d1 = jsonobject.optDouble("scale", 0.0D);
            if (d != 0.0D && d1 != 0.0D)
            {
                return new <init>(d, d1);
            }
        }
        return null;
    }

    public double getScale()
    {
        return scale;
    }

    public double getValue()
    {
        return value;
    }

    private (double d, double d1)
    {
        value = d;
        scale = d1;
    }
}
