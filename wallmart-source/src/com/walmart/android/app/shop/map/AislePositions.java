// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.service.storesearch.AisleLocations;
import java.util.HashMap;
import java.util.Map;

public class AislePositions
{

    private final Map mAislePositions = new HashMap();
    private final float mAisleSource[] = new float[4];

    public AislePositions(AisleLocations aislelocations)
    {
        if (aislelocations.mapping != null)
        {
            float af[] = (float[])aislelocations.mapping.get("SrcOrigin");
            float af1[] = (float[])aislelocations.mapping.get("SrcMax");
            if (af != null && af.length == 2 && af1 != null && af1.length == 2)
            {
                mAisleSource[0] = af[0];
                mAisleSource[1] = af[1];
                mAisleSource[2] = af1[0];
                mAisleSource[3] = af1[1];
                mAislePositions.putAll(aislelocations.mapping);
                mAislePositions.remove("SrcOrigin");
                mAislePositions.remove("SrcMax");
            }
        }
    }

    public float[] getAislePosition(String s)
    {
        return (float[])mAislePositions.get(s);
    }

    public float[] getAisleSource()
    {
        return mAisleSource;
    }
}
