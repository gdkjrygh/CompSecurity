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

public class ImagePerfectionProfile
    implements Serializable, Cloneable
{

    private static final long serialVersionUID = 0xf6d1008486e7effL;
    private transient String ipOperations;
    private transient String ipOperationsFilePath;
    private transient String name;

    public ImagePerfectionProfile()
    {
        name = "";
        ipOperations = "";
        ipOperationsFilePath = "";
    }

    private void checkParamAndThrow(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append(s).append(" parameter is null").toString());
        } else
        {
            return;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/ImagePerfectionProfile.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                name = (String)objectinputstream.readObject();
                ipOperations = (String)objectinputstream.readObject();
                ipOperationsFilePath = (String)objectinputstream.readObject();
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
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/ImagePerfectionProfile.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(name);
        objectoutputstream.writeObject(ipOperations);
        objectoutputstream.writeObject(ipOperationsFilePath);
    }

    public ImagePerfectionProfile clone()
    {
        ImagePerfectionProfile imageperfectionprofile;
        try
        {
            imageperfectionprofile = (ImagePerfectionProfile)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            throw new InternalError("ImagePerfectionProfile: unexpected clone not supported exception");
        }
        return imageperfectionprofile;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public String getIpOperations()
    {
        return ipOperations;
    }

    public String getIpOperationsFilePath()
    {
        return ipOperationsFilePath;
    }

    public String getName()
    {
        return name;
    }

    public void setIpOperations(String s)
    {
        checkParamAndThrow(s, "ipOperations");
        ipOperations = s;
    }

    public void setIpOperationsFilePath(String s)
    {
        checkParamAndThrow(s, "ipOperationsFilePath");
        ipOperationsFilePath = s;
    }

    public void setName(String s)
    {
        checkParamAndThrow(s, "name");
        name = s;
    }


}
