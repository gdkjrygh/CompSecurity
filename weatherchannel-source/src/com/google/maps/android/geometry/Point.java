// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.geometry;


public class Point
{

    public final double x;
    public final double y;

    public Point(double d, double d1)
    {
        x = d;
        y = d1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Point{x=").append(x).append(", y=").append(y).append('}').toString();
    }
}
