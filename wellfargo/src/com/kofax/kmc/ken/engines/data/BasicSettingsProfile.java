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
//            BoundingTetragon

public class BasicSettingsProfile
    implements Serializable, Cloneable
{

    private static final String TAG = "BasicSettingsProfile";
    private static final long serialVersionUID = 0x81aae4bc2271b298L;
    private transient CropType cropType;
    private transient BoundingTetragon croppingTetragon;
    private transient Boolean doDeskew;
    private transient Float inputDocLongEdge;
    private transient Float inputDocShortEdge;
    private transient OutputBitDepth outputBitDepth;
    private transient Integer outputDPI;
    private transient RotateType rotateType;

    public BasicSettingsProfile()
    {
        rotateType = RotateType.ROTATE_NONE;
        cropType = CropType.CROP_NONE;
        croppingTetragon = null;
        doDeskew = Boolean.valueOf(false);
        outputDPI = null;
        outputBitDepth = OutputBitDepth.COLOR;
        inputDocLongEdge = null;
        inputDocShortEdge = null;
    }

    private void checkParamAndThrow(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("'").append(s).append("'").append(" parameter is null").toString());
        }
        boolean flag;
        if (obj.getClass().getSimpleName().equals("Integer") && ((Integer)obj).intValue() < 0)
        {
            flag = true;
        } else
        if (obj.getClass().getSimpleName().equals("Float") && ((Float)obj).floatValue() < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            ((ErrorInfo) (obj)).setErrCause((new StringBuilder()).append("'").append(s).append("'").append(" parameter is negative").toString());
            throw new KmcRuntimeException(((ErrorInfo) (obj)));
        } else
        {
            return;
        }
    }

    private boolean isNonDefaultFloat(Float float1)
    {
        while (float1 == null || Math.abs(float1.floatValue()) < Float.valueOf(1E-06F).floatValue()) 
        {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/BasicSettingsProfile.getName().compareToIgnoreCase((String)objectinputstream.readObject()) == 0)
        {
            String s = (String)objectinputstream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), s).booleanValue())
            {
                rotateType = (RotateType)objectinputstream.readObject();
                cropType = (CropType)objectinputstream.readObject();
                croppingTetragon = (BoundingTetragon)objectinputstream.readObject();
                doDeskew = (Boolean)objectinputstream.readObject();
                outputDPI = (Integer)objectinputstream.readObject();
                outputBitDepth = (OutputBitDepth)objectinputstream.readObject();
                inputDocLongEdge = (Float)objectinputstream.readObject();
                inputDocShortEdge = (Float)objectinputstream.readObject();
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
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/BasicSettingsProfile.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(rotateType);
        objectoutputstream.writeObject(cropType);
        objectoutputstream.writeObject(croppingTetragon);
        objectoutputstream.writeObject(doDeskew);
        objectoutputstream.writeObject(outputDPI);
        objectoutputstream.writeObject(outputBitDepth);
        objectoutputstream.writeObject(inputDocLongEdge);
        objectoutputstream.writeObject(inputDocShortEdge);
    }

    public BasicSettingsProfile clone()
    {
        BasicSettingsProfile basicsettingsprofile;
        try
        {
            basicsettingsprofile = (BasicSettingsProfile)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            throw new InternalError("BasicSettingsProfile: unexpected clone not supported exception");
        }
        if (basicsettingsprofile.croppingTetragon != null)
        {
            basicsettingsprofile.croppingTetragon = basicsettingsprofile.croppingTetragon.clone();
        }
        return basicsettingsprofile;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public CropType getCropType()
    {
        return cropType;
    }

    public BoundingTetragon getCroppingTetragon()
    {
        BoundingTetragon boundingtetragon = null;
        if (croppingTetragon != null)
        {
            boundingtetragon = new BoundingTetragon(croppingTetragon.getTopLeft(), croppingTetragon.getTopRight(), croppingTetragon.getBottomLeft(), croppingTetragon.getBottomRight());
        }
        return boundingtetragon;
    }

    public boolean getDoDeskew()
    {
        return doDeskew.booleanValue();
    }

    public Float getInputDocLongEdge()
    {
        return inputDocLongEdge;
    }

    public Float getInputDocShortEdge()
    {
        return inputDocShortEdge;
    }

    public OutputBitDepth getOutputBitDepth()
    {
        return outputBitDepth;
    }

    public Integer getOutputDPI()
    {
        return outputDPI;
    }

    public RotateType getRotateType()
    {
        return rotateType;
    }

    public void setCropType(CropType croptype)
    {
        checkParamAndThrow(croptype, "cropType");
        cropType = croptype;
    }

    public void setCroppingTetragon(BoundingTetragon boundingtetragon)
    {
        if (boundingtetragon == null)
        {
            croppingTetragon = null;
            return;
        }
        if (croppingTetragon == null)
        {
            croppingTetragon = new BoundingTetragon();
        }
        croppingTetragon.setTopLeft(boundingtetragon.getTopLeft());
        croppingTetragon.setTopRight(boundingtetragon.getTopRight());
        croppingTetragon.setBottomLeft(boundingtetragon.getBottomLeft());
        croppingTetragon.setBottomRight(boundingtetragon.getBottomRight());
    }

    public void setDoDeskew(boolean flag)
    {
        checkParamAndThrow(Boolean.valueOf(flag), "doDeskew");
        doDeskew = Boolean.valueOf(flag);
    }

    public void setInputDocLongEdge(Float float1)
    {
        if (float1 != null)
        {
            checkParamAndThrow(float1, "inputDocLongEdge");
        }
        inputDocLongEdge = float1;
    }

    public void setInputDocShortEdge(Float float1)
    {
        if (float1 != null)
        {
            checkParamAndThrow(float1, "inputDocShortEdge");
        }
        inputDocShortEdge = float1;
    }

    public void setOutputBitDepth(OutputBitDepth outputbitdepth)
    {
        outputBitDepth = outputbitdepth;
    }

    public void setOutputDPI(Integer integer)
    {
        if (integer != null)
        {
            checkParamAndThrow(integer, "outputDPI");
        }
        outputDPI = integer;
    }

    public void setRotateType(RotateType rotatetype)
    {
        checkParamAndThrow(rotatetype, "rotateType");
        rotateType = rotatetype;
    }



/*
    static RotateType access$002(BasicSettingsProfile basicsettingsprofile, RotateType rotatetype)
    {
        basicsettingsprofile.rotateType = rotatetype;
        return rotatetype;
    }

*/




/*
    static BoundingTetragon access$202(BasicSettingsProfile basicsettingsprofile, BoundingTetragon boundingtetragon)
    {
        basicsettingsprofile.croppingTetragon = boundingtetragon;
        return boundingtetragon;
    }

*/







    private class RotateType extends Enum
    {

        private static final RotateType $VALUES[];
        public static final RotateType ROTATE_180;
        public static final RotateType ROTATE_270;
        public static final RotateType ROTATE_90;
        public static final RotateType ROTATE_AUTO;
        public static final RotateType ROTATE_NONE;

        public static RotateType valueOf(String s)
        {
            return (RotateType)Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$RotateType, s);
        }

        public static RotateType[] values()
        {
            return (RotateType[])$VALUES.clone();
        }

        static 
        {
            ROTATE_NONE = new RotateType("ROTATE_NONE", 0);
            ROTATE_90 = new RotateType("ROTATE_90", 1);
            ROTATE_180 = new RotateType("ROTATE_180", 2);
            ROTATE_270 = new RotateType("ROTATE_270", 3);
            ROTATE_AUTO = new RotateType("ROTATE_AUTO", 4);
            $VALUES = (new RotateType[] {
                ROTATE_NONE, ROTATE_90, ROTATE_180, ROTATE_270, ROTATE_AUTO
            });
        }

        private RotateType(String s, int i)
        {
            super(s, i);
        }
    }


    private class CropType extends Enum
    {

        private static final CropType $VALUES[];
        public static final CropType CROP_AUTO;
        public static final CropType CROP_NONE;
        public static final CropType CROP_QUICKANALYSIS;
        public static final CropType CROP_TETRAGON;

        public static CropType valueOf(String s)
        {
            return (CropType)Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$CropType, s);
        }

        public static CropType[] values()
        {
            return (CropType[])$VALUES.clone();
        }

        static 
        {
            CROP_NONE = new CropType("CROP_NONE", 0);
            CROP_AUTO = new CropType("CROP_AUTO", 1);
            CROP_TETRAGON = new CropType("CROP_TETRAGON", 2);
            CROP_QUICKANALYSIS = new CropType("CROP_QUICKANALYSIS", 3);
            $VALUES = (new CropType[] {
                CROP_NONE, CROP_AUTO, CROP_TETRAGON, CROP_QUICKANALYSIS
            });
        }

        private CropType(String s, int i)
        {
            super(s, i);
        }
    }


    private class OutputBitDepth extends Enum
    {

        private static final OutputBitDepth $VALUES[];
        public static final OutputBitDepth BITONAL;
        public static final OutputBitDepth COLOR;
        public static final OutputBitDepth GRAYSCALE;

        public static OutputBitDepth valueOf(String s)
        {
            return (OutputBitDepth)Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$OutputBitDepth, s);
        }

        public static OutputBitDepth[] values()
        {
            return (OutputBitDepth[])$VALUES.clone();
        }

        static 
        {
            BITONAL = new OutputBitDepth("BITONAL", 0);
            GRAYSCALE = new OutputBitDepth("GRAYSCALE", 1);
            COLOR = new OutputBitDepth("COLOR", 2);
            $VALUES = (new OutputBitDepth[] {
                BITONAL, GRAYSCALE, COLOR
            });
        }

        private OutputBitDepth(String s, int i)
        {
            super(s, i);
        }
    }

}
