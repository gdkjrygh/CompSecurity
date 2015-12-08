// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import android.graphics.Rect;

public class CheckDetectionSettings
{

    private double _aspectRatio;
    private Point _centerPoint;
    private double _maxFillFraction;
    private double _maxSkewAngle;
    private double _minFillfraction;
    private double _padding;
    private Rect _targetFrame;
    private double _toleranceFraction;

    public CheckDetectionSettings()
    {
        _centerPoint = new Point(0, 0);
        _aspectRatio = 2.1818181818181817D;
        _padding = 5D;
        _minFillfraction = 0.75D;
        _maxFillFraction = 1.3D;
        _maxSkewAngle = 5D;
        _toleranceFraction = 0.050000000000000003D;
    }

    public CheckDetectionSettings(Point point, double d, double d1)
    {
        _centerPoint = new Point(0, 0);
        _aspectRatio = 2.1818181818181817D;
        _padding = 5D;
        _minFillfraction = 0.75D;
        _maxFillFraction = 1.3D;
        _maxSkewAngle = 5D;
        _toleranceFraction = 0.050000000000000003D;
        if (point != null)
        {
            _centerPoint = point;
        }
        if (d > 0.0D)
        {
            _aspectRatio = d;
        }
        if (d1 >= 0.0D)
        {
            _padding = d1;
        }
    }

    public Point getCenterPoint()
    {
        return _centerPoint;
    }

    public double getMaxFillFraction()
    {
        return _maxFillFraction;
    }

    public double getMaxSkewAngle()
    {
        return _maxSkewAngle;
    }

    public double getMinFillFraction()
    {
        return _minFillfraction;
    }

    public Rect getTargetFrame()
    {
        return _targetFrame;
    }

    public double getTargetFrameAspectRatio()
    {
        return _aspectRatio;
    }

    public double getTargetFramePaddingPercent()
    {
        return _padding;
    }

    public double getToleranceFraction()
    {
        return _toleranceFraction;
    }

    public void setCenterPoint(Point point)
    {
        _centerPoint = point;
    }

    public void setMaxFillFraction(double d)
    {
        if (d >= 0.0D)
        {
            _maxFillFraction = d;
        }
    }

    public void setMaxSkewAngle(double d)
    {
        if (d >= 0.0D)
        {
            _maxSkewAngle = d;
        }
    }

    public void setMinFillFraction(double d)
    {
        if (d >= 0.0D)
        {
            _minFillfraction = d;
        }
    }

    public void setTargetFrame(Rect rect)
    {
        _targetFrame = rect;
    }

    public void setTargetFrameAspectRatio(double d)
    {
        if (d < 0.0D)
        {
            _aspectRatio = 0.0D;
        }
        _aspectRatio = d;
    }

    public void setTargetFramePaddingPercent(double d)
    {
        if (d < 0.0D)
        {
            _padding = 0.0D;
            return;
        }
        if (d > 100D)
        {
            _padding = 100D;
            return;
        } else
        {
            _padding = d;
            return;
        }
    }

    public void setToleranceFraction(double d)
    {
        if (d >= 0.0D)
        {
            _toleranceFraction = d;
        }
    }
}
