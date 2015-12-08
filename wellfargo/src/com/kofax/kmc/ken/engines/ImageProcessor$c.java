// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageProcessor

class <init>
    implements Callable
{

    public BasicSettingsProfile a;
    public ImagePerfectionProfile b;
    public Image c;
    public boolean d;
    public ProcessPageOutRep e;
    public com.kofax.kmc.ken.engines.iplib.rogressClient f;
    final ImageProcessor g;

    public com.kofax.kmc.ken.engines.service.ncementResults a()
    {
        Object obj2;
        Object obj3;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        obj2 = null;
        obj3 = ErrorInfo.KMC_SUCCESS;
        e.imageID = c.getImageID();
        if (a != null || b != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = ErrorInfo.KMC_IP_NO_PROFILE;
        obj = null;
_L5:
        obj2 = obj;
        if (obj == null)
        {
            obj2 = new com.kofax.kmc.ken.engines.service.ncementResults(((ErrorInfo) (obj1)));
        }
        return ((com.kofax.kmc.ken.engines.service.ncementResults) (obj2));
_L2:
        if (!d) goto _L4; else goto _L3
_L3:
        obj = c.getImageBitmap();
        if (obj == null)
        {
            obj = ErrorInfo.KMC_ED_NOIMAGE;
            ((ErrorInfo) (obj)).setErrCause("imageBitmap field is null");
            obj1 = null;
        } else
        {
label0:
            {
                e.exifMetadataStr = ImageProcessor.a(g, c);
                flag = flag1;
                if (b != null)
                {
                    obj1 = b.getIpOperations();
                    flag = flag1;
                    if (obj1 != null)
                    {
                        flag = flag1;
                        if (!((String) (obj1)).isEmpty())
                        {
                            flag = flag1;
                            if (((String) (obj1)).contains("_DoRecognizeTextMP_"))
                            {
                                flag = true;
                            }
                        }
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                try
                {
                    obj = ImageService.enhanceImage(((android.graphics.Bitmap) (obj)), a, b, c, 0x19000, e, f);
                    break MISSING_BLOCK_LABEL_523;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = ((KmcException) (obj)).getErrorInfo();
                    obj1 = null;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = ((KmcRuntimeException) (obj)).getErrorInfo();
                    obj1 = null;
                }
            }
        }
_L11:
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
          goto _L5
        obj = ImageService.enhanceImage(((android.graphics.Bitmap) (obj)), a, b, c, 10240, e, f);
        break MISSING_BLOCK_LABEL_523;
_L4:
        obj = c.getImageFilePath();
        if (obj == null)
        {
            ErrorInfo.KMC_ED_FILEPATH.setErrCause("imageFilePath field is null");
        }
        if (!(new File(((String) (obj)))).exists())
        {
            obj = ErrorInfo.KMC_ED_NONEXISTENT_FILE;
        }
        obj3 = new Image(c.getImageFilePath(), c.getImageMimeType());
        obj1 = ((Image) (obj3)).imageReadFromFile();
        if (obj1 != ErrorInfo.KMC_SUCCESS && obj1 != ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        obj = ((Image) (obj3)).getImageBitmap();
        e.exifMetadataStr = ImageProcessor.a(g, ((Image) (obj3)));
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        String s = b.getIpOperations();
        if (s == null || s.isEmpty() || !s.contains("_DoRecognizeTextMP_"))
        {
            break MISSING_BLOCK_LABEL_512;
        }
_L10:
        if (!flag) goto _L7; else goto _L6
_L6:
        obj = ImageService.enhanceImage(((android.graphics.Bitmap) (obj)), a, b, c, 0x19000, e, f);
_L8:
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L9:
        ((Image) (obj3)).imageClearBitmap();
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
          goto _L5
_L7:
        obj = ImageService.enhanceImage(((android.graphics.Bitmap) (obj)), a, b, c, 10240, e, f);
          goto _L8
        obj;
        obj = ((KmcException) (obj)).getErrorInfo();
        obj1 = obj2;
          goto _L9
        obj;
        obj = ((KmcRuntimeException) (obj)).getErrorInfo();
        obj1 = obj2;
          goto _L9
        flag = false;
          goto _L10
        obj = null;
          goto _L5
        obj1 = obj;
        obj = obj3;
          goto _L11
    }

    public Object call()
    {
        return a();
    }

    private eException(ImageProcessor imageprocessor)
    {
        g = imageprocessor;
        super();
        a = null;
        b = null;
        c = null;
        d = false;
        f = null;
    }

    f(ImageProcessor imageprocessor, f f1)
    {
        this(imageprocessor);
    }
}
