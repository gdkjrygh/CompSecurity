// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.spatial4j.core.context.jts.JtsSpatialContext;
import com.spatial4j.core.context.jts.JtsSpatialContextFactory;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.io.BinaryCodec;
import com.spatial4j.core.shape.Shape;
import com.vividsolutions.jts.d.b;
import com.vividsolutions.jts.d.c;
import com.vividsolutions.jts.d.e;
import com.vividsolutions.jts.d.f;
import com.vividsolutions.jts.d.g;
import com.vividsolutions.jts.geom.u;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class JtsBinaryCodec extends BinaryCodec
{

    protected final boolean useFloat;

    public JtsBinaryCodec(JtsSpatialContext jtsspatialcontext, JtsSpatialContextFactory jtsspatialcontextfactory)
    {
        super(jtsspatialcontext, jtsspatialcontextfactory);
        boolean flag;
        if (jtsspatialcontextfactory.precisionModel.c() == u.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        useFloat = flag;
    }

    protected double readDim(DataInput datainput)
        throws IOException
    {
        if (useFloat)
        {
            return (double)datainput.readFloat();
        } else
        {
            return super.readDim(datainput);
        }
    }

    public Shape readJtsGeom(DataInput datainput)
        throws IOException
    {
        JtsSpatialContext jtsspatialcontext = (JtsSpatialContext)super.ctx;
        f f1 = new f(jtsspatialcontext.getGeometryFactory());
        try
        {
            datainput = jtsspatialcontext.makeShape(f1.a(new b(datainput) {

                private boolean a;
                private DataInput b;

                public final void a(byte abyte0[])
                    throws IOException
                {
                    if (a)
                    {
                        if (abyte0.length != 1)
                        {
                            throw new IllegalStateException((new StringBuilder("Expected initial read of one byte, not: ")).append(abyte0.length).toString());
                        } else
                        {
                            abyte0[0] = 0;
                            a = false;
                            return;
                        }
                    } else
                    {
                        b.readFully(abyte0);
                        return;
                    }
                }

            
            {
                b = datainput;
                super();
                a = true;
            }
            }), false, false);
        }
        // Misplaced declaration of an exception variable
        catch (DataInput datainput)
        {
            throw new InvalidShapeException("error reading WKT", datainput);
        }
        return datainput;
    }

    protected Shape readShapeByTypeIfSupported(DataInput datainput, byte byte0)
        throws IOException
    {
        if (byte0 != 5)
        {
            return super.readShapeByTypeIfSupported(datainput, byte0);
        } else
        {
            return readJtsGeom(datainput);
        }
    }

    protected byte typeForShape(Shape shape)
    {
        byte byte1 = super.typeForShape(shape);
        byte byte0 = byte1;
        if (byte1 == 0)
        {
            byte0 = 5;
        }
        return byte0;
    }

    protected void writeDim(DataOutput dataoutput, double d)
        throws IOException
    {
        if (useFloat)
        {
            dataoutput.writeFloat((float)d);
            return;
        } else
        {
            super.writeDim(dataoutput, d);
            return;
        }
    }

    public void writeJtsGeom(DataOutput dataoutput, Shape shape)
        throws IOException
    {
        shape = ((JtsSpatialContext)super.ctx).getGeometryFrom(shape);
        (new g()).a(shape, new c(dataoutput) {

            private boolean a;
            private DataOutput b;

            public final void a(byte abyte0[], int i)
                throws IOException
            {
                if (a)
                {
                    a = false;
                    if (i != 1 || abyte0[0] != 0)
                    {
                        throw new IllegalStateException("Unexpected WKB byte order mark");
                    }
                } else
                {
                    b.write(abyte0, 0, i);
                }
            }

            
            {
                b = dataoutput;
                super();
                a = true;
            }
        });
    }

    protected boolean writeShapeByTypeIfSupported(DataOutput dataoutput, Shape shape, byte byte0)
        throws IOException
    {
        if (byte0 != 5)
        {
            return super.writeShapeByTypeIfSupported(dataoutput, shape, byte0);
        } else
        {
            writeJtsGeom(dataoutput, shape);
            return true;
        }
    }
}
