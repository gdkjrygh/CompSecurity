// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;


class Barcode
{

    private final int _angle;
    private final int _checkDigitLocation;
    private final double _cornerX[];
    private final double _cornerY[];
    private final String _data;
    private final int _dataType;
    private final int _type;

    public Barcode(int i, double ad[], double ad1[], int j, String s, int k, int l)
    {
        _type = i;
        _cornerX = ad;
        _cornerY = ad1;
        _angle = j;
        _data = s;
        _dataType = k;
        _checkDigitLocation = l;
    }

    int getAngle()
    {
        return _angle;
    }

    int getCheckDigitLocation()
    {
        return _checkDigitLocation;
    }

    double[] getCornerX()
    {
        return _cornerX;
    }

    double[] getCornerY()
    {
        return _cornerY;
    }

    String getData()
    {
        return _data;
    }

    int getDataType()
    {
        return _dataType;
    }

    int getType()
    {
        return _type;
    }
}
