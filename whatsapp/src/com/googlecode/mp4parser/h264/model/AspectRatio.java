// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;


public class AspectRatio
{

    public static final AspectRatio Extended_SAR = new AspectRatio(255);
    private int value;

    private AspectRatio(int i)
    {
        value = i;
    }

    public static AspectRatio fromValue(int i)
    {
        if (i == Extended_SAR.value)
        {
            return Extended_SAR;
        } else
        {
            return new AspectRatio(i);
        }
    }

    public int getValue()
    {
        return value;
    }

}
