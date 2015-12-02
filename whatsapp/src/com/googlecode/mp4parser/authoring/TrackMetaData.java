// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;

public class TrackMetaData
    implements Cloneable
{

    private Date creationTime;
    private int group;
    private double height;
    private String language;
    int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long timescale;
    private long trackId;
    private float volume;
    private double width;

    public TrackMetaData()
    {
        modificationTime = new Date();
        creationTime = new Date();
        matrix = Matrix.ROTATE_0;
        trackId = 1L;
        group = 0;
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return obj;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public int getGroup()
    {
        return group;
    }

    public double getHeight()
    {
        return height;
    }

    public String getLanguage()
    {
        return language;
    }

    public int getLayer()
    {
        return layer;
    }

    public Matrix getMatrix()
    {
        return matrix;
    }

    public Date getModificationTime()
    {
        return modificationTime;
    }

    public long getTimescale()
    {
        return timescale;
    }

    public long getTrackId()
    {
        return trackId;
    }

    public float getVolume()
    {
        return volume;
    }

    public double getWidth()
    {
        return width;
    }

    public void setCreationTime(Date date)
    {
        creationTime = date;
    }

    public void setGroup(int i)
    {
        group = i;
    }

    public void setHeight(double d)
    {
        height = d;
    }

    public void setLanguage(String s)
    {
        language = s;
    }

    public void setLayer(int i)
    {
        layer = i;
    }

    public void setMatrix(Matrix matrix1)
    {
        matrix = matrix1;
    }

    public void setModificationTime(Date date)
    {
        modificationTime = date;
    }

    public void setTimescale(long l)
    {
        timescale = l;
    }

    public void setTrackId(long l)
    {
        trackId = l;
    }

    public void setVolume(float f)
    {
        volume = f;
    }

    public void setWidth(double d)
    {
        width = d;
    }
}
