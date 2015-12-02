// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

// Referenced classes of package com.googlecode.mp4parser.h264.model:
//            ScalingList

public class ScalingMatrix
{

    public ScalingList ScalingList4x4[];
    public ScalingList ScalingList8x8[];

    public ScalingMatrix()
    {
    }

    public String toString()
    {
        Object obj = null;
        StringBuilder stringbuilder = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        java.util.List list;
        if (ScalingList4x4 == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(ScalingList4x4);
        }
        stringbuilder = stringbuilder.append(list).append("\n").append(", ScalingList8x8=");
        if (ScalingList8x8 == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(ScalingList8x8);
        }
        return stringbuilder.append(list).append("\n").append('}').toString();
    }
}
