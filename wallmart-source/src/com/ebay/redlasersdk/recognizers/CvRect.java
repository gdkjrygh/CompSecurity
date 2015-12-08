// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;


class CvRect
{

    public int height;
    public int width;
    public int x;
    public int y;

    CvRect()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }

    CvRect(int i, int j, int k, int l)
    {
        x = i;
        y = j;
        width = k;
        height = l;
    }
}
