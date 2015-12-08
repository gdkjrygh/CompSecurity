// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.context.SpatialContextFactory;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.ShapeCollection;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;

public class BinaryCodec
{

    protected static final byte TYPE_CIRCLE = 3;
    protected static final byte TYPE_COLL = 4;
    protected static final byte TYPE_GEOM = 5;
    protected static final byte TYPE_POINT = 1;
    protected static final byte TYPE_RECT = 2;
    protected final SpatialContext ctx;

    public BinaryCodec(SpatialContext spatialcontext, SpatialContextFactory spatialcontextfactory)
    {
        ctx = spatialcontext;
    }

    public Circle readCircle(DataInput datainput)
        throws IOException
    {
        return ctx.makeCircle(readPoint(datainput), readDim(datainput));
    }

    public ShapeCollection readCollection(DataInput datainput)
        throws IOException
    {
        byte byte0 = datainput.readByte();
        int j = datainput.readInt();
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            if (byte0 == 0)
            {
                arraylist.add(readShape(datainput));
            } else
            {
                Shape shape = readShapeByTypeIfSupported(datainput, byte0);
                if (shape == null)
                {
                    throw new InvalidShapeException((new StringBuilder("Unsupported shape byte ")).append(byte0).toString());
                }
                arraylist.add(shape);
            }
            i++;
        }
        return ctx.makeCollection(arraylist);
    }

    protected double readDim(DataInput datainput)
        throws IOException
    {
        return datainput.readDouble();
    }

    public Point readPoint(DataInput datainput)
        throws IOException
    {
        return ctx.makePoint(readDim(datainput), readDim(datainput));
    }

    public Rectangle readRect(DataInput datainput)
        throws IOException
    {
        return ctx.makeRectangle(readDim(datainput), readDim(datainput), readDim(datainput), readDim(datainput));
    }

    public Shape readShape(DataInput datainput)
        throws IOException
    {
        byte byte0 = datainput.readByte();
        datainput = readShapeByTypeIfSupported(datainput, byte0);
        if (datainput == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported shape byte ")).append(byte0).toString());
        } else
        {
            return datainput;
        }
    }

    protected Shape readShapeByTypeIfSupported(DataInput datainput, byte byte0)
        throws IOException
    {
        switch (byte0)
        {
        default:
            return null;

        case 1: // '\001'
            return readPoint(datainput);

        case 2: // '\002'
            return readRect(datainput);

        case 3: // '\003'
            return readCircle(datainput);

        case 4: // '\004'
            return readCollection(datainput);
        }
    }

    protected byte typeForShape(Shape shape)
    {
        if (shape instanceof Point)
        {
            return 1;
        }
        if (shape instanceof Rectangle)
        {
            return 2;
        }
        if (shape instanceof Circle)
        {
            return 3;
        }
        return ((byte)(!(shape instanceof ShapeCollection) ? 0 : 4));
    }

    public void writeCircle(DataOutput dataoutput, Circle circle)
        throws IOException
    {
        writePoint(dataoutput, circle.getCenter());
        writeDim(dataoutput, circle.getRadius());
    }

    public void writeCollection(DataOutput dataoutput, ShapeCollection shapecollection)
        throws IOException
    {
        int i = 0;
        dataoutput.writeByte(0);
        dataoutput.writeInt(shapecollection.size());
        for (; i < shapecollection.size(); i++)
        {
            writeShape(dataoutput, shapecollection.get(i));
        }

    }

    protected void writeDim(DataOutput dataoutput, double d)
        throws IOException
    {
        dataoutput.writeDouble(d);
    }

    public void writePoint(DataOutput dataoutput, Point point)
        throws IOException
    {
        writeDim(dataoutput, point.getX());
        writeDim(dataoutput, point.getY());
    }

    public void writeRect(DataOutput dataoutput, Rectangle rectangle)
        throws IOException
    {
        writeDim(dataoutput, rectangle.getMinX());
        writeDim(dataoutput, rectangle.getMaxX());
        writeDim(dataoutput, rectangle.getMinY());
        writeDim(dataoutput, rectangle.getMaxY());
    }

    public void writeShape(DataOutput dataoutput, Shape shape)
        throws IOException
    {
        if (!writeShapeByTypeIfSupported(dataoutput, shape))
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported shape ")).append(shape.getClass()).toString());
        } else
        {
            return;
        }
    }

    protected boolean writeShapeByTypeIfSupported(DataOutput dataoutput, Shape shape)
        throws IOException
    {
        byte byte0 = typeForShape(shape);
        dataoutput.writeByte(byte0);
        return writeShapeByTypeIfSupported(dataoutput, shape, byte0);
    }

    protected boolean writeShapeByTypeIfSupported(DataOutput dataoutput, Shape shape, byte byte0)
        throws IOException
    {
        byte0;
        JVM INSTR tableswitch 1 4: default 32
    //                   1 34
    //                   2 45
    //                   3 57
    //                   4 69;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        writePoint(dataoutput, (Point)shape);
_L7:
        return true;
_L3:
        writeRect(dataoutput, (Rectangle)shape);
        continue; /* Loop/switch isn't completed */
_L4:
        writeCircle(dataoutput, (Circle)shape);
        continue; /* Loop/switch isn't completed */
_L5:
        writeCollection(dataoutput, (ShapeCollection)shape);
        if (true) goto _L7; else goto _L6
_L6:
    }
}
