// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BarCodeType, BarCodeDirection, BarCodeDataFormat, BoundingTetragon

public class BarCodeResult
    implements Serializable
{

    private static final long serialVersionUID = 0x5f8f3274a542d469L;
    private transient BoundingTetragon boundingBox;
    private transient BarCodeDirection direction;
    private transient BarCodeDataFormat format;
    private transient BarCodeType type;
    private transient String value;

    public BarCodeResult()
    {
        type = BarCodeType.UNKNOWN;
        direction = BarCodeDirection.UNKNOWN;
        format = BarCodeDataFormat.UNKNOWN;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/BarCodeResult.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                type = (BarCodeType)objectinputstream.readObject();
                boundingBox = (BoundingTetragon)objectinputstream.readObject();
                value = (String)objectinputstream.readObject();
                direction = (BarCodeDirection)objectinputstream.readObject();
                format = (BarCodeDataFormat)objectinputstream.readObject();
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
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/BarCodeResult.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(type);
        objectoutputstream.writeObject(boundingBox);
        objectoutputstream.writeObject(value);
        objectoutputstream.writeObject(direction);
        objectoutputstream.writeObject(format);
    }

    public BoundingTetragon getBoundingBox()
    {
        return boundingBox;
    }

    public BarCodeDataFormat getDataFormat()
    {
        return format;
    }

    public BarCodeDirection getDirection()
    {
        return direction;
    }

    public BarCodeType getType()
    {
        return type;
    }

    public String getValue()
    {
        return value;
    }

    public void setBoundingBox(BoundingTetragon boundingtetragon)
    {
        boundingBox = boundingtetragon;
    }

    public void setDataFormat(BarCodeDataFormat barcodedataformat)
    {
        format = barcodedataformat;
    }

    public void setDirection(BarCodeDirection barcodedirection)
    {
        direction = barcodedirection;
    }

    public void setType(BarCodeType barcodetype)
    {
        type = barcodetype;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
