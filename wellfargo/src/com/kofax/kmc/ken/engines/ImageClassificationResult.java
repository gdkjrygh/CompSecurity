// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ImageClassificationResult
    implements Serializable
{

    private static final long serialVersionUID = 0xacff25143d9ef7feL;
    private transient String a;
    private transient Integer b;
    private transient Float c;

    public ImageClassificationResult()
    {
        a = null;
        b = Integer.valueOf(-1);
        c = Float.valueOf(-5000F);
    }

    public ImageClassificationResult(String s, float f, int i)
    {
        a = null;
        b = Integer.valueOf(-1);
        c = Float.valueOf(-5000F);
        a = s;
        b = Integer.valueOf(i);
        c = Float.valueOf(f);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/ImageClassificationResult.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                a = (String)objectinputstream.readObject();
                b = (Integer)objectinputstream.readObject();
                c = (Float)objectinputstream.readObject();
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
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/ImageClassificationResult.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(a);
        objectoutputstream.writeObject(b);
        objectoutputstream.writeObject(c);
    }

    public String getClassId()
    {
        return a;
    }

    public float getConfidence()
    {
        return c.floatValue();
    }

    public int getOrientation()
    {
        return b.intValue();
    }
}
