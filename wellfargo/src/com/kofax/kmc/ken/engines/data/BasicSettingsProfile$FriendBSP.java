// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BasicSettingsProfile, BoundingTetragon

public class _OPERATION
{

    private static final String DOC_DIM_LARGE = "_DocDimLarge_";
    private static final String DOC_DIM_SMALL = "_DocDimSmall_";
    private static final String DO_BINARIZATION = "_DoBinarization_";
    private static final String DO_CROP_CORRECTION = "_DoCropCorrection_";
    private static final String DO_ENHANCED_BINARIZATION = "_DoEnhancedBinarization_";
    private static final String DO_GRAY_OUTPUT = "_DoGrayOutput_";
    private static final String DO_ROTATE_180 = "_Do90DegreeRotation_2";
    private static final String DO_ROTATE_270 = "_Do90DegreeRotation_1";
    private static final String DO_ROTATE_90 = "_Do90DegreeRotation_3";
    private static final String DO_ROTATE_AUTO = "_Do90DegreeRotation_4";
    private static final String DO_ROTATE_NONE = "_Do90DegreeRotation_0";
    private static final String DO_SCALE_BW_IMAGE_TO_DPI = "_DoScaleBWImageToDPI_";
    private static final String DO_SCALE_CG_IMAGE_TO_DPI = "_DoScaleCGImageToDPI_";
    private static final String DO_SKEW_CORRECTION_PAGE = "_DoSkewCorrectionPage_";
    private static final String LOAD_SETTING = "_LoadSetting_";
    private static final int MIN_DPI_FOR_ENHANCED_BINARIZATION = 300;
    final BasicSettingsProfile this$0;

    public String toFinalOpString()
    {
        Object obj;
        Object obj1;
        int i;
        obj = "_DeviceType_2";
        if (BasicSettingsProfile.access$000(BasicSettingsProfile.this) != .ROTATE_NONE)
        {
            BasicSettingsProfile.access$002(BasicSettingsProfile.this, BasicSettingsProfile.access$000(BasicSettingsProfile.this));
            epth epth;
            boolean flag;
            if (BasicSettingsProfile.access$000(BasicSettingsProfile.this) == .ROTATE_90)
            {
                obj = (new StringBuilder()).append("_DeviceType_2").append("_Do90DegreeRotation_3").toString();
            } else
            if (BasicSettingsProfile.access$000(BasicSettingsProfile.this) == .ROTATE_180)
            {
                obj = (new StringBuilder()).append("_DeviceType_2").append("_Do90DegreeRotation_2").toString();
            } else
            if (BasicSettingsProfile.access$000(BasicSettingsProfile.this) == .ROTATE_270)
            {
                obj = (new StringBuilder()).append("_DeviceType_2").append("_Do90DegreeRotation_1").toString();
            } else
            if (BasicSettingsProfile.access$000(BasicSettingsProfile.this) == .ROTATE_AUTO)
            {
                obj = (new StringBuilder()).append("_DeviceType_2").append("_Do90DegreeRotation_4").toString();
            } else
            {
                throw new IllegalArgumentException("unable to recognize rotateType");
            }
        }
        if (BasicSettingsProfile.access$100(BasicSettingsProfile.this) != ROP_NONE)
        {
label0:
            {
                if (BasicSettingsProfile.access$100(BasicSettingsProfile.this) != ROP_AUTO)
                {
                    break label0;
                }
                obj = (new StringBuilder()).append(((String) (obj))).append("_DoCropCorrection_").toString();
            }
        }
_L3:
        obj1 = obj;
        if (BasicSettingsProfile.access$300(BasicSettingsProfile.this).booleanValue())
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append("_DoSkewCorrectionPage_").toString();
        }
        epth = BasicSettingsProfile.access$400(BasicSettingsProfile.this);
        obj = epth;
        if (epth == null)
        {
            obj = epth.COLOR;
        }
        Object obj2;
        epth epth1;
        if (obj != epth.COLOR)
        {
            if (obj != epth.GRAYSCALE)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (new StringBuilder()).append(((String) (obj1))).append("_DoGrayOutput_").toString();
        }
_L5:
        flag = false;
        i = ((flag) ? 1 : 0);
        if (BasicSettingsProfile.access$500(BasicSettingsProfile.this) != null)
        {
            i = ((flag) ? 1 : 0);
            if (BasicSettingsProfile.access$500(BasicSettingsProfile.this).intValue() != 0)
            {
                i = BasicSettingsProfile.access$500(BasicSettingsProfile.this).intValue();
            }
        }
        if (obj != epth.BITONAL)
        {
            obj = obj1;
            if (i > 0)
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append("_DoScaleCGImageToDPI_").append(i).toString();
            }
        } else
        if (i == 0)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("_DoBinarization_").toString();
        } else
        if (i < 300)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("_DoBinarization__DoScaleBWImageToDPI_").append(i).toString();
        } else
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("_DoEnhancedBinarization__DoScaleBWImageToDPI_").append(i).toString();
        }
        obj1 = obj;
        if (BasicSettingsProfile.access$700(BasicSettingsProfile.this, BasicSettingsProfile.access$600(BasicSettingsProfile.this)))
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append("_DocDimLarge_").append(String.valueOf(BasicSettingsProfile.access$600(BasicSettingsProfile.this))).toString();
        }
        obj = obj1;
        if (BasicSettingsProfile.access$700(BasicSettingsProfile.this, BasicSettingsProfile.access$800(BasicSettingsProfile.this)))
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("_DocDimSmall_").append(String.valueOf(BasicSettingsProfile.access$800(BasicSettingsProfile.this))).toString();
        }
        return ((String) (obj));
        if (BasicSettingsProfile.access$100(BasicSettingsProfile.this) != ROP_TETRAGON)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        BasicSettingsProfile.access$202(BasicSettingsProfile.this, BasicSettingsProfile.access$200(BasicSettingsProfile.this));
        if (BasicSettingsProfile.access$200(BasicSettingsProfile.this) == null)
        {
            obj1 = "CropType requires non-null tetragon";
        } else
        if (BasicSettingsProfile.access$200(BasicSettingsProfile.this).getTopLeft() == null || BasicSettingsProfile.access$200(BasicSettingsProfile.this).getTopRight() == null || BasicSettingsProfile.access$200(BasicSettingsProfile.this).getBottomLeft() == null || BasicSettingsProfile.access$200(BasicSettingsProfile.this).getBottomRight() == null)
        {
            obj1 = "CropType requires non-null points";
        } else
        {
            obj1 = null;
        }
        if (obj1 != null)
        {
            throw new IllegalArgumentException(((String) (obj1)));
        }
        obj2 = BasicSettingsProfile.access$200(BasicSettingsProfile.this);
        obj2.getClass();
        epth1 = new >(((BoundingTetragon) (obj2)), "com.kofax");
        obj2 = obj1;
        obj1 = epth1;
_L2:
        if (obj2 != null)
        {
            throw new IllegalArgumentException(((String) (obj2)));
        }
        break; /* Loop/switch isn't completed */
        obj1;
        ((KmcException) (obj1)).printStackTrace();
        obj2 = "Unable to convert croppingTetragon";
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (!(() (obj1)).id())
        {
            throw new IllegalArgumentException("Specified tetragon is unsorted");
        }
        obj = (new StringBuilder()).append(((String) (obj))).append("_DoCropCorrection_").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append(((id) (obj1)).CornersOpString("_LoadSetting_")).toString();
          goto _L3
        if (BasicSettingsProfile.access$100(BasicSettingsProfile.this) == ROP_QUICKANALYSIS)
        {
            obj = (new StringBuilder()).append(((String) (obj))).append("_DoCropCorrection_").toString();
        } else
        {
            throw new IllegalArgumentException("Unable to recognize crop type");
        }
          goto _L3
        if (obj == epth.BITONAL) goto _L5; else goto _L4
_L4:
        throw new IllegalArgumentException("unable to recognize outputBitDepth");
    }

    public epth(String s)
    {
        this$0 = BasicSettingsProfile.this;
        super();
        if (!b.c(s, "com.kofax"))
        {
            throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        } else
        {
            return;
        }
    }
}
