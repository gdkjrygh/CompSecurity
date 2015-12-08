// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;

import android.graphics.Bitmap;
import android.os.Environment;
import android.util.Log;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.appstats.OCRResults;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsOCRType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.ken.engines.ocr:
//            OcrRegion, OcrWord, OcrResultData, OcrEventListener, 
//            OcrFailureData, OcrParameters

public class OcrEngine
{

    private static ArrayList d = new ArrayList();
    private static boolean j;
    ImagePerfectionProfile a;
    private ArrayList b;
    private String c;
    private Image e;
    private OcrResultData f;
    private OcrFailureData g;
    private ImageProcessor h;
    private AppStatsOCRType i;
    protected OCRResults ocrResults;

    public OcrEngine()
    {
        b = new ArrayList();
        c = "OcrEngine";
        a = new ImagePerfectionProfile();
        f = null;
        g = null;
        a();
    }

    private Image a(OcrRegion ocrregion, OcrRegion.RegionType regiontype)
    {
        int j1 = ocrregion.d;
        int i1 = ocrregion.c;
        int k1 = ocrregion.b;
        int l1 = ocrregion.a;
        ocrregion = null;
        Image image = e();
        if (image != null)
        {
            ocrregion = b(image);
        }
        int l = i1;
        int k = j1;
        if (regiontype == OcrRegion.RegionType.REGION_PERCENT)
        {
            k = (int)((double)ocrregion.getHeight() * ((double)j1 / 100D));
            l = (int)((double)ocrregion.getWidth() * ((double)i1 / 100D));
        }
        regiontype = new Image(Bitmap.createBitmap(ocrregion, k1, l1, l, k));
        image.imageClearBitmap();
        ocrregion.recycle();
        return regiontype;
    }

    static String a(OcrEngine ocrengine)
    {
        return ocrengine.c;
    }

    static String a(OcrEngine ocrengine, String s)
    {
        return ocrengine.a(s);
    }

    private String a(String s)
    {
        StringBuilder stringbuilder;
        d.clear();
        stringbuilder = new StringBuilder();
        s = (new JSONObject(s)).getJSONObject("Front Side").getJSONObject("Text Lines").getJSONArray("Lines");
        int k = 0;
_L15:
        if (k >= s.length()) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = s.getJSONObject(k).getJSONArray("Words");
        int l = 0;
_L13:
        OcrWord ocrword;
        JSONObject jsonobject;
        Iterator iterator;
        if (l >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        ocrword = new OcrWord();
        jsonobject = jsonarray.getJSONObject(l);
        iterator = jsonobject.keys();
_L8:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s1 = (String)iterator.next();
        if (!s1.equalsIgnoreCase("Word")) goto _L6; else goto _L5
_L5:
        s1 = jsonobject.getString(s1);
        if (s1 == null) goto _L8; else goto _L7
_L7:
        ocrword.setText(s1);
          goto _L8
        s;
        s.printStackTrace();
_L2:
        return stringbuilder.toString();
_L6:
label0:
        {
            if (!s1.equalsIgnoreCase("TLx"))
            {
                break label0;
            }
            ocrword.setX(jsonobject.getInt("TLx"));
        }
          goto _L8
label1:
        {
            if (!s1.equalsIgnoreCase("TLy"))
            {
                break label1;
            }
            ocrword.setY(jsonobject.getInt("TLy"));
        }
          goto _L8
label2:
        {
            if (!s1.equalsIgnoreCase("BRy"))
            {
                break label2;
            }
            ocrword.setBRy(jsonobject.getInt("BRy"));
        }
          goto _L8
label3:
        {
            if (!s1.equalsIgnoreCase("TRy"))
            {
                break label3;
            }
            ocrword.setTRy(jsonobject.getInt("TRy"));
        }
          goto _L8
        if (!s1.equalsIgnoreCase("TRx")) goto _L10; else goto _L9
_L9:
        ocrword.setTRx(jsonobject.getInt("TRx"));
          goto _L8
_L10:
        if (!s1.equalsIgnoreCase("TLx")) goto _L8; else goto _L11
_L11:
        ocrword.setTRx(jsonobject.getInt("TLx"));
          goto _L8
_L4:
        d.add(ocrword);
        l++;
        if (true) goto _L13; else goto _L12
_L12:
        k++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private void a()
    {
label0:
        {
            if (!j)
            {
                if (!IpLibUtil.isIpLicensed())
                {
                    break label0;
                }
                j = true;
            }
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
    }

    private void a(Bitmap bitmap)
    {
        try
        {
            Object obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Archana/").toString();
            obj = new FileOutputStream((new StringBuilder()).append(((String) (obj))).append("abcd.jpg").toString());
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (obj)));
            ((FileOutputStream) (obj)).flush();
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("Could not save", bitmap.toString());
        }
    }

    static void a(OcrEngine ocrengine, ErrorInfo errorinfo)
    {
        ocrengine.a(errorinfo);
    }

    private void a(OcrRegion ocrregion)
    {
        if (ocrregion == null)
        {
            i = AppStatsOCRType.OCR_FULLPAGE;
        }
        if (ocrregion != null)
        {
            if (ocrregion.getRegionType() != null)
            {
                h.processImage(a(ocrregion, ocrregion.getRegionType()));
                i = AppStatsOCRType.OCR_ZONAL;
                return;
            } else
            {
                throw new KmcException(ErrorInfo.KMC_ED_NONEXISTENT_OCR_REGION_TYPE);
            }
        }
        if (!a(e))
        {
            h.processImage(e);
            return;
        } else
        {
            ocrregion = new OcrRegion();
            ocrregion.setRegionType(OcrRegion.RegionType.REGION_PERCENT);
            ocrregion.setRegionHeight(100);
            ocrregion.setRegionWidth(100);
            h.processImage(a(ocrregion, ocrregion.getRegionType()));
            return;
        }
    }

    private void a(ErrorInfo errorinfo)
    {
        if (errorinfo == ErrorInfo.KMC_SUCCESS)
        {
            g = null;
            f = new OcrResultData();
            f.b = ErrorInfo.KMC_SUCCESS;
            f.a = e.getImageID();
            f.getWords();
            for (errorinfo = b.iterator(); errorinfo.hasNext(); ((OcrEventListener)errorinfo.next()).ocrSucceeded(f)) { }
        } else
        {
            f = null;
            g = new OcrFailureData();
            g.b = errorinfo;
            g.a = e.getImageID();
            for (errorinfo = b.iterator(); errorinfo.hasNext(); ((OcrEventListener)errorinfo.next()).ocrFailed(g)) { }
        }
    }

    private void a(Object obj, String s)
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

    private boolean a(Image image)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
        {
            flag = flag1;
            if (image.getImageFileRep() == com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED)
            {
                flag = true;
            }
        }
        return flag;
    }

    private Bitmap b(Image image)
    {
        if (image.getImageRepresentation() != com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE) goto _L2; else goto _L1
_L1:
        if (image.getImageFileRep() != com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_STORED) goto _L4; else goto _L3
_L3:
        if (image.imageReadFromFile() != ErrorInfo.KMC_SUCCESS)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        image = image.getImageBitmap();
        return image;
        image;
        image.printStackTrace();
_L5:
        return null;
        image;
        image.printStackTrace();
        continue; /* Loop/switch isn't completed */
_L4:
        if (image.getImageFileRep() != com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (image.imageReadFromFileBuffer() != ErrorInfo.KMC_SUCCESS)
        {
            continue; /* Loop/switch isn't completed */
        }
        image = image.getImageBitmap();
        return image;
        image;
        image.printStackTrace();
        continue; /* Loop/switch isn't completed */
        image;
        image.printStackTrace();
        if (true) goto _L5; else goto _L2
_L2:
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP || image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH)
        {
            return image.getImageBitmap();
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    static AppStatsOCRType b(OcrEngine ocrengine)
    {
        return ocrengine.i;
    }

    private void b()
    {
    }

    private void c()
    {
        a.setIpOperations("_DeviceType_2_DoNoPageDetection__DoRecognizeTextMP__LoadInlineSetting_[CBinarize.Contrast_Slider_Pos.Int=4]__LoadInlineSetting_[CBinarize.Cleanup_Slider_Pos.Int=4]");
        h.setImagePerfectionProfile(a);
    }

    private boolean d()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d != null)
        {
            flag = flag1;
            if (d.size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private Image e()
    {
        return e;
    }

    protected static ArrayList ocrWords()
    {
        return d;
    }

    public void addOcrListener(OcrEventListener ocreventlistener)
    {
        if (ocreventlistener == null)
        {
            throw new NullPointerException("addOcrListener: listener parameter is null");
        }
        if (!b.contains(ocreventlistener))
        {
            b.add(ocreventlistener);
        }
    }

    public void performOCR(Image image, OcrParameters ocrparameters)
    {
        a(image, "sourceImage");
        a(ocrparameters, "parameters");
        a(ocrparameters.getFont(), "OcrParameters font");
        e = image;
        h = new ImageProcessor();
        h.setProcessedImageRepresentation(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_NONE);
        _cls2.a[ocrparameters.getFont().ordinal()];
        JVM INSTR tableswitch 1 4: default 96
    //                   1 96
    //                   2 120
    //                   3 127
    //                   4 134;
           goto _L1 _L1 _L2 _L3 _L4
_L1:
        a(ocrparameters.getRegion());
        h.addImageOutEventListener(new _cls1());
        return;
_L2:
        c();
        continue; /* Loop/switch isn't completed */
_L3:
        c();
        continue; /* Loop/switch isn't completed */
_L4:
        b();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void removeListener(OcrEventListener ocreventlistener)
    {
        b.remove(ocreventlistener);
    }


    private class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[OcrParameters.Font.values().length];
            try
            {
                a[OcrParameters.Font.E13B_MICR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[OcrParameters.Font.DEFAULT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[OcrParameters.Font.GENERIC_MACHINE_PRINT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[OcrParameters.Font.FARRINGTON_CREDIT_CARD.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements com.kofax.kmc.ken.engines.ImageProcessor.ImageOutListener
    {

        final OcrEngine a;

        public void imageOut(com.kofax.kmc.ken.engines.ImageProcessor.ImageOutEvent imageoutevent)
        {
            Object obj = imageoutevent.getStatus();
            if (ErrorInfo.KMC_SUCCESS == obj)
            {
                String s = imageoutevent.getImage().getImageMetaData();
                s = OcrEngine.a(a, s);
                Log.i(OcrEngine.a(a), (new StringBuilder()).append("Parsed Data = ").append(s).toString());
            }
            OcrEngine.a(a, ((ErrorInfo) (obj)));
            obj = new OCRResults();
            ((OCRResults) (obj)).setResultCode(imageoutevent.getStatus().getErr());
            ((OCRResults) (obj)).setOCREventType(OcrEngine.b(a));
        }

        _cls1()
        {
            a = OcrEngine.this;
            super();
        }
    }

}
