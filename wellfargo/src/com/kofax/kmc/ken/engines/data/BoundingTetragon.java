// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BoundingTetragon
    implements Serializable, Cloneable
{

    private static final String TAG = "BoundingTetragon";
    private static final long serialVersionUID = 0x54cfbcab15395b32L;
    private transient Point bottomLeft;
    private transient Point bottomRight;
    private transient Point topLeft;
    private transient Point topRight;

    public BoundingTetragon()
    {
        topLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        bottomLeft = new Point(0, 0);
        bottomRight = new Point(0, 0);
    }

    public BoundingTetragon(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        topLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        bottomLeft = new Point(0, 0);
        bottomRight = new Point(0, 0);
        topLeft.set(i, j);
        topRight.set(k, l);
        bottomLeft.set(i1, j1);
        bottomRight.set(k1, l1);
    }

    public BoundingTetragon(Point point, Point point1, Point point2, Point point3)
    {
        topLeft = new Point(0, 0);
        topRight = new Point(0, 0);
        bottomLeft = new Point(0, 0);
        bottomRight = new Point(0, 0);
        topLeft.set(point.x, point.y);
        topRight.set(point1.x, point1.y);
        bottomLeft.set(point2.x, point2.y);
        bottomRight.set(point3.x, point3.y);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/BoundingTetragon.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                topLeft = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                topRight = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                bottomLeft = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                bottomRight = new Point(((Integer)objectinputstream.readObject()).intValue(), ((Integer)objectinputstream.readObject()).intValue());
                return;
            } else
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
            }
        } else
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/BoundingTetragon.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(Integer.valueOf(topLeft.x));
        objectoutputstream.writeObject(Integer.valueOf(topLeft.y));
        objectoutputstream.writeObject(Integer.valueOf(topRight.x));
        objectoutputstream.writeObject(Integer.valueOf(topRight.y));
        objectoutputstream.writeObject(Integer.valueOf(bottomLeft.x));
        objectoutputstream.writeObject(Integer.valueOf(bottomLeft.y));
        objectoutputstream.writeObject(Integer.valueOf(bottomRight.x));
        objectoutputstream.writeObject(Integer.valueOf(bottomRight.y));
    }

    public BoundingTetragon clone()
    {
        BoundingTetragon boundingtetragon;
        try
        {
            boundingtetragon = (BoundingTetragon)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            throw new InternalError("BoundingTetragon: unexpected clone not supported exception");
        }
        if (boundingtetragon.topLeft != null)
        {
            boundingtetragon.topLeft = new Point(boundingtetragon.topLeft);
        }
        if (boundingtetragon.topRight != null)
        {
            boundingtetragon.topRight = new Point(boundingtetragon.topRight);
        }
        if (boundingtetragon.bottomLeft != null)
        {
            boundingtetragon.bottomLeft = new Point(boundingtetragon.bottomLeft);
        }
        if (boundingtetragon.bottomRight != null)
        {
            boundingtetragon.bottomRight = new Point(boundingtetragon.bottomRight);
        }
        return boundingtetragon;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public Point getBottomLeft()
    {
        return new Point(bottomLeft);
    }

    public Point getBottomRight()
    {
        return new Point(bottomRight);
    }

    public Point getTopLeft()
    {
        return new Point(topLeft);
    }

    public Point getTopRight()
    {
        return new Point(topRight);
    }

    public void rotate(int i, int j, Rotation rotation)
    {
        if (rotation == null)
        {
            throw new IllegalArgumentException("rotation cannot be null");
        }
        int k = Math.max(topLeft.x, Math.max(Math.max(topRight.x, bottomLeft.x), bottomRight.x));
        int l = Math.max(topLeft.y, Math.max(Math.max(topRight.y, bottomLeft.y), bottomRight.y));
        if (i < k)
        {
            throw new IllegalArgumentException("width must be larger than the largest x point");
        }
        if (j < l)
        {
            throw new IllegalArgumentException("height must be larger than the largest y point");
        }
        _cls1..SwitchMap.com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation[rotation.ordinal()];
        JVM INSTR tableswitch 1 3: default 160
    //                   1 161
    //                   2 300
    //                   3 426;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        Point point;
        Point point1;
        Point point2;
        topLeft.set(topLeft.y, i - topLeft.x);
        topRight.set(topRight.y, i - topRight.x);
        bottomLeft.set(bottomLeft.y, i - bottomLeft.x);
        bottomRight.set(bottomRight.y, i - bottomRight.x);
        point = topLeft;
        point2 = topRight;
        rotation = bottomLeft;
        point1 = bottomRight;
_L6:
        topLeft = point2;
        topRight = point1;
        bottomLeft = point;
        bottomRight = rotation;
        return;
_L3:
        topLeft.set(i - topLeft.x, j - topLeft.y);
        topRight.set(i - topRight.x, j - topRight.y);
        bottomLeft.set(i - bottomLeft.x, j - bottomLeft.y);
        bottomRight.set(i - bottomRight.x, j - bottomRight.y);
        rotation = topLeft;
        point = topRight;
        point1 = bottomLeft;
        point2 = bottomRight;
        continue; /* Loop/switch isn't completed */
_L4:
        topLeft.set(j - topLeft.y, topLeft.x);
        topRight.set(j - topRight.y, topRight.x);
        bottomLeft.set(j - bottomLeft.y, bottomLeft.x);
        bottomRight.set(j - bottomRight.y, bottomRight.x);
        point1 = topLeft;
        rotation = topRight;
        point2 = bottomLeft;
        point = bottomRight;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setBottomLeft(Point point)
    {
        if (point == null)
        {
            bottomLeft = null;
            return;
        } else
        {
            bottomLeft.set(point.x, point.y);
            return;
        }
    }

    public void setBottomRight(Point point)
    {
        if (point == null)
        {
            bottomRight = null;
            return;
        } else
        {
            bottomRight.set(point.x, point.y);
            return;
        }
    }

    public void setTopLeft(Point point)
    {
        if (point == null)
        {
            topLeft = null;
            return;
        } else
        {
            topLeft.set(point.x, point.y);
            return;
        }
    }

    public void setTopRight(Point point)
    {
        if (point == null)
        {
            topRight = null;
            return;
        } else
        {
            topRight.set(point.x, point.y);
            return;
        }
    }





    private class _cls1
    {

        static final int $SwitchMap$com$kofax$kmc$ken$engines$data$BoundingTetragon$Rotation[];

        static 
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$BoundingTetragon$Rotation = new int[Rotation.values().length];
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$BoundingTetragon$Rotation[Rotation.LEFT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$BoundingTetragon$Rotation[Rotation.FLIP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$BoundingTetragon$Rotation[Rotation.RIGHT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class Rotation extends Enum
    {

        private static final Rotation $VALUES[];
        public static final Rotation FLIP;
        public static final Rotation LEFT;
        public static final Rotation RIGHT;

        public static Rotation valueOf(String s)
        {
            return (Rotation)Enum.valueOf(com/kofax/kmc/ken/engines/data/BoundingTetragon$Rotation, s);
        }

        public static Rotation[] values()
        {
            return (Rotation[])$VALUES.clone();
        }

        static 
        {
            LEFT = new Rotation("LEFT", 0);
            RIGHT = new Rotation("RIGHT", 1);
            FLIP = new Rotation("FLIP", 2);
            $VALUES = (new Rotation[] {
                LEFT, RIGHT, FLIP
            });
        }

        private Rotation(String s, int i)
        {
            super(s, i);
        }
    }

}
