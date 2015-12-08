// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.kofax.kmc.ken.engines.appstats.AppStatsImageData;
import com.kofax.kmc.ken.engines.appstats.ImageAppStatsClient;
import com.kofax.kmc.ken.engines.iplib.IpFileBuffer;
import com.kofax.kmc.ken.engines.iplib.IpImageMetadata;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.IllegalThreadStateException;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.a.a.a.a.a;
import org.a.a.a.a.b;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            ImagePerfectionProfile, BasicSettingsProfile, QuickAnalysisFeedback

public class Image
    implements Serializable
{

    private static final int DEFAULT_DPI_VALUE = 72;
    public static final int DEFAULT_JPEG_QUALITY = 90;
    public static final int MAX_JPEG_QUALITY = 100;
    public static final float MAX_SCALING_FACTOR = 1F;
    private static final int MIN_BITMAP_SIZE = 10;
    private static final int MIN_DPI_VALUE = 25;
    public static final int MIN_JPEG_QUALITY = 1;
    public static final float MIN_SCALING_FACTOR = 0.1F;
    private static final String TAG = "Image";
    private static final long serialVersionUID = 0x17a885d8c1d1f6eeL;
    private transient BasicSettingsProfile basicSettingsProfileUsed;
    private transient long creationTime;
    private transient FileIOEngine fileIOEngine;
    private transient ImageAppStatsClient imageAppStatsClient;
    private transient List imageBarCodes;
    private transient Bitmap imgBitmap;
    private transient Integer imgBitmapHeight;
    private transient Float imgBitmapScaling;
    private transient Integer imgBitmapWidth;
    private transient List imgClassifyResults;
    private transient String imgCreateDateTime;
    private transient Integer imgDPI;
    private transient File imgFile;
    private transient IpFileBuffer imgFileBuffer;
    private transient Integer imgFileHeight;
    private transient ImageFileRep imgFileRep;
    private transient Integer imgFileWidth;
    private transient String imgID;
    private transient Integer imgJpegQuality;
    private transient Float imgLatitude;
    private transient Float imgLongitude;
    private transient String imgMetaData;
    private transient String imgMicrData;
    private transient ImageMimeType imgMimeType;
    private transient OutputColor imgOutputColor;
    private transient ImagePerfectionProfile imgPerfectProfileUsed;
    private transient Float imgPitch;
    private transient QuickAnalysisFeedback imgQckAnalysisFeedBck;
    private transient ImageRep imgRep;
    private transient Float imgRoll;
    private transient String imgSrcID;
    private transient String imgTag;

    public Image()
    {
        imgFile = null;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        imgBitmap = null;
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgBitmapWidth = null;
        imgBitmapHeight = null;
        imgBitmapScaling = Float.valueOf(1.0F);
        imgFileWidth = null;
        imgFileHeight = null;
        imgTag = new String();
        imgID = new String();
        imgSrcID = new String();
        imgMetaData = new String();
        imgPerfectProfileUsed = null;
        basicSettingsProfileUsed = null;
        imgQckAnalysisFeedBck = null;
        imgLatitude = null;
        imgLongitude = null;
        imageBarCodes = new ArrayList();
        imgClassifyResults = new ArrayList();
        imgPitch = null;
        imgRoll = null;
        imgCreateDateTime = new String();
        imgDPI = null;
        imgJpegQuality = Integer.valueOf(90);
        imgOutputColor = OutputColor.BITDEPTH_COLOR;
        fileIOEngine = FileIOEngine.FILE_ENG_KFIL;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgFileBuffer = null;
        imgMicrData = new String();
        creationTime = 0L;
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        imgCreateDateTime = a.b.a(new Date());
        imgID = UUID.randomUUID().toString();
        Log.i("Image", (new StringBuilder()).append("imgCreateDateTime: ").append(imgCreateDateTime).toString());
        logAppStats(0, false, 0L);
    }

    public Image(Bitmap bitmap)
    {
        imgFile = null;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        imgBitmap = null;
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgBitmapWidth = null;
        imgBitmapHeight = null;
        imgBitmapScaling = Float.valueOf(1.0F);
        imgFileWidth = null;
        imgFileHeight = null;
        imgTag = new String();
        imgID = new String();
        imgSrcID = new String();
        imgMetaData = new String();
        imgPerfectProfileUsed = null;
        basicSettingsProfileUsed = null;
        imgQckAnalysisFeedBck = null;
        imgLatitude = null;
        imgLongitude = null;
        imageBarCodes = new ArrayList();
        imgClassifyResults = new ArrayList();
        imgPitch = null;
        imgRoll = null;
        imgCreateDateTime = new String();
        imgDPI = null;
        imgJpegQuality = Integer.valueOf(90);
        imgOutputColor = OutputColor.BITDEPTH_COLOR;
        fileIOEngine = FileIOEngine.FILE_ENG_KFIL;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgFileBuffer = null;
        imgMicrData = new String();
        creationTime = 0L;
        if (bitmap == null)
        {
            throw new NullPointerException("bitmap parameter is null");
        } else
        {
            imgBitmap = bitmap;
            imgRep = ImageRep.IMAGE_REP_BITMAP;
            imgFileRep = ImageFileRep.FILE_NONE;
            imgCreateDateTime = a.b.a(new Date());
            imgDPI = Integer.valueOf(72);
            imgID = UUID.randomUUID().toString();
            imgBitmapWidth = Integer.valueOf(imgBitmap.getWidth());
            imgBitmapHeight = Integer.valueOf(imgBitmap.getHeight());
            logAppStats(0, false, 0L);
            return;
        }
    }

    public Image(File file, ImageMimeType imagemimetype)
    {
        imgFile = null;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        imgBitmap = null;
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgBitmapWidth = null;
        imgBitmapHeight = null;
        imgBitmapScaling = Float.valueOf(1.0F);
        imgFileWidth = null;
        imgFileHeight = null;
        imgTag = new String();
        imgID = new String();
        imgSrcID = new String();
        imgMetaData = new String();
        imgPerfectProfileUsed = null;
        basicSettingsProfileUsed = null;
        imgQckAnalysisFeedBck = null;
        imgLatitude = null;
        imgLongitude = null;
        imageBarCodes = new ArrayList();
        imgClassifyResults = new ArrayList();
        imgPitch = null;
        imgRoll = null;
        imgCreateDateTime = new String();
        imgDPI = null;
        imgJpegQuality = Integer.valueOf(90);
        imgOutputColor = OutputColor.BITDEPTH_COLOR;
        fileIOEngine = FileIOEngine.FILE_ENG_KFIL;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgFileBuffer = null;
        imgMicrData = new String();
        creationTime = 0L;
        checkFileParamsAndThrow(file, imagemimetype, true);
        imgFile = new File(file.getAbsolutePath());
        imgRep = ImageRep.IMAGE_REP_FILE;
        imgFileRep = ImageFileRep.FILE_STORED;
        imgMimeType = imagemimetype;
        imgCreateDateTime = a.b.a(new Date());
        imgID = UUID.randomUUID().toString();
        updateImageFileDimensions(imgFile.getAbsolutePath());
        logAppStats(0, false, file.length());
    }

    public Image(String s, ImageMimeType imagemimetype)
    {
        imgFile = null;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        imgBitmap = null;
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgBitmapWidth = null;
        imgBitmapHeight = null;
        imgBitmapScaling = Float.valueOf(1.0F);
        imgFileWidth = null;
        imgFileHeight = null;
        imgTag = new String();
        imgID = new String();
        imgSrcID = new String();
        imgMetaData = new String();
        imgPerfectProfileUsed = null;
        basicSettingsProfileUsed = null;
        imgQckAnalysisFeedBck = null;
        imgLatitude = null;
        imgLongitude = null;
        imageBarCodes = new ArrayList();
        imgClassifyResults = new ArrayList();
        imgPitch = null;
        imgRoll = null;
        imgCreateDateTime = new String();
        imgDPI = null;
        imgJpegQuality = Integer.valueOf(90);
        imgOutputColor = OutputColor.BITDEPTH_COLOR;
        fileIOEngine = FileIOEngine.FILE_ENG_KFIL;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgFileBuffer = null;
        imgMicrData = new String();
        creationTime = 0L;
        s = new File(s);
        checkFileParamsAndThrow(s, imagemimetype, true);
        imgFile = s;
        imgRep = ImageRep.IMAGE_REP_FILE;
        imgFileRep = ImageFileRep.FILE_STORED;
        imgMimeType = imagemimetype;
        imgCreateDateTime = a.b.a(new Date());
        imgID = UUID.randomUUID().toString();
        updateImageFileDimensions(imgFile.getAbsolutePath());
        if (s != null)
        {
            logAppStats(0, false, s.length());
        }
    }

    private void DeserializeBitmap(ObjectInputStream objectinputstream)
    {
        imgBitmap = BitmapFactory.decodeStream(new ByteArrayInputStream(((BitmapDataObject)objectinputstream.readObject()).imageByteArray));
    }

    private void ResetFileBuffer()
    {
        imgFileBuffer = new IpFileBuffer(imgMimeType, imgOutputColor.getBitsPerPixel(), imgJpegQuality.intValue(), imgMetaData);
    }

    private void SerializeBitmap(ObjectOutputStream objectoutputstream, Boolean boolean1)
    {
        BitmapDataObject bitmapdataobject = new BitmapDataObject();
        if (boolean1.booleanValue())
        {
            bitmapdataobject.imageByteArray = getImageFileBuffer().array();
        } else
        {
            boolean1 = new ByteArrayOutputStream();
            imgBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, boolean1);
            bitmapdataobject.imageByteArray = boolean1.toByteArray();
            boolean1.close();
        }
        objectoutputstream.writeObject(bitmapdataobject);
    }

    private void checkBitmapParamsAndThrow(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("imgBitmap parameter is null");
        }
        if (bitmap.isRecycled())
        {
            throw new IllegalArgumentException("imgBitmap is invalid because it's been recycled");
        }
        if (bitmap.getWidth() < 10 || bitmap.getHeight() < 10)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("imgBitmap is invalid because it's smaller than ").append(10).append(" x ").append(10).toString());
        } else
        {
            return;
        }
    }

    private void checkFileParamsAndThrow(File file, ImageMimeType imagemimetype, boolean flag)
    {
        if (file == null)
        {
            throw new NullPointerException("file parameter is null");
        }
        if (imagemimetype == ImageMimeType.MIMETYPE_UNKNOWN)
        {
            throw new IllegalArgumentException("imgMimeType cannot be set to UNKNOWN");
        }
        if (flag && !file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("file: ").append(file.getName()).append(" does not exist").toString());
        }
        if (!getMimeTypeFromFile(file).equals(imagemimetype))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("imgMimeType: ").append(imagemimetype.toString()).append(" does not match MIME type of file").toString());
        } else
        {
            return;
        }
    }

    private void checkFileParamsAndThrow(String s, ImageMimeType imagemimetype, boolean flag, boolean flag1)
    {
        if (s == null)
        {
            throw new NullPointerException("filePath parameter is null");
        }
        if (!flag1)
        {
            checkFileParamsAndThrow(new File(s), imagemimetype, flag);
        }
    }

    private void checkImageRepresentationStateAndThrow()
    {
        boolean flag;
        if (imgBitmap != null && !isImgRepBitmap() && !isImgRepBoth() || imgFile != null && imgFile.exists() && !isImgRepFile() && !isImgRepBoth())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            throw new IllegalThreadStateException("internal bitmap/file state is inconsistent with imageRepresentation property");
        } else
        {
            return;
        }
    }

    private void checkParamAndThrow(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append(s).append(" parameter is null").toString());
        }
        if (obj.getClass().getSimpleName().equals("Integer") && ((Integer)obj).intValue() < 0)
        {
            obj = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            ((ErrorInfo) (obj)).setErrCause((new StringBuilder()).append("'").append(s).append("'").append(" parameter is negative").toString());
            throw new KmcRuntimeException(((ErrorInfo) (obj)));
        } else
        {
            return;
        }
    }

    private String[] extractGPSValues(String s)
    {
        s = s.split(":");
        if (s.length == 2)
        {
            s = s[1].split(",");
            if (s.length == 3)
            {
                return s;
            }
        }
        return null;
    }

    private FileIOEngine getEngineCompatibleWithMimeType(FileIOEngine fileioengine, FileIODirection fileiodirection)
    {
        if (fileioengine == FileIOEngine.FILE_ENG_ANDROID)
        {
            if (imgMimeType == ImageMimeType.MIMETYPE_JPEG || imgMimeType == ImageMimeType.MIMETYPE_PNG)
            {
                return FileIOEngine.FILE_ENG_ANDROID;
            } else
            {
                return FileIOEngine.FILE_ENG_KFIL;
            }
        }
        if (fileioengine == FileIOEngine.FILE_ENG_KFIL && fileiodirection == FileIODirection.FILE_IO_READ)
        {
            if (imgMimeType == ImageMimeType.MIMETYPE_JPEG || imgMimeType == ImageMimeType.MIMETYPE_TIFF)
            {
                return FileIOEngine.FILE_ENG_KFIL;
            } else
            {
                return FileIOEngine.FILE_ENG_ANDROID;
            }
        } else
        {
            return FileIOEngine.FILE_ENG_KFIL;
        }
    }

    private Float getGPSValue(String s)
    {
        float f;
        s = s.split("/");
        if (s.length != 2)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        f = (float)Integer.parseInt(s[0].trim()) / (float)Integer.parseInt(s[1].trim());
        return Float.valueOf(f);
        s;
        Log.i("Image", (new StringBuilder()).append("getGPSValue: NumberFormatException = ").append(s.toString()).toString());
        return Float.valueOf(0.0F);
    }

    private ImageMimeType getMimeTypeFromFile(File file)
    {
        ImageMimeType imagemimetype;
        Object obj;
        imagemimetype = ImageMimeType.MIMETYPE_UNKNOWN;
        obj = imagemimetype;
        if (file == null) goto _L2; else goto _L1
_L1:
        String s;
        obj = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString());
        s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (obj)).toLowerCase());
        if (s != null) goto _L4; else goto _L3
_L3:
label0:
        {
            if (!org.a.a.a.b.a(((CharSequence) (obj)), "tif"))
            {
                file = imagemimetype;
                if (!org.a.a.a.b.a(((CharSequence) (obj)), "tiff"))
                {
                    break label0;
                }
            }
            file = ImageMimeType.MIMETYPE_TIFF;
        }
_L6:
        Log.i("Image", (new StringBuilder()).append("getMimeTypeFromFile: fileExtension=").append(((String) (obj))).toString());
        obj = file;
_L2:
        Log.i("Image", (new StringBuilder()).append("getMimeTypeFromFile: imgMimeType=").append(((ImageMimeType) (obj)).toString()).toString());
        return ((ImageMimeType) (obj));
_L4:
        if (s.equals("image/tiff"))
        {
            file = ImageMimeType.MIMETYPE_TIFF;
        } else
        if (s.equals("image/jpeg"))
        {
            file = ImageMimeType.MIMETYPE_JPEG;
        } else
        {
            file = imagemimetype;
            if (s.equals("image/png"))
            {
                file = ImageMimeType.MIMETYPE_PNG;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void initializeInternalState()
    {
        imgFile = null;
        imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
        if (imgBitmap != null)
        {
            imgBitmap.recycle();
            imgBitmap = null;
        }
        imgRep = ImageRep.IMAGE_REP_NONE;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgTag = new String();
        imgID = new String();
        imgSrcID = new String();
        imgMetaData = new String();
        imgPerfectProfileUsed = null;
        basicSettingsProfileUsed = null;
        imgQckAnalysisFeedBck = null;
        imgLatitude = null;
        imgLongitude = null;
        imageBarCodes = null;
        imgClassifyResults = null;
        imgPitch = null;
        imgRoll = null;
        imgCreateDateTime = new String();
        imgDPI = null;
        fileIOEngine = FileIOEngine.FILE_ENG_KFIL;
        imgOutputColor = OutputColor.BITDEPTH_COLOR;
    }

    private boolean isAndroidFileIOUsable()
    {
        return imgOutputColor == OutputColor.BITDEPTH_COLOR && imgMimeType != ImageMimeType.MIMETYPE_TIFF;
    }

    private boolean isCheckedException(ErrorInfo errorinfo)
    {
        switch (_cls1..SwitchMap.com.kofax.kmc.kut.utilities.error.ErrorInfo[errorinfo.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    private boolean isImgFileRepBuffered()
    {
        return imgFileRep == ImageFileRep.FILE_BUFFERED;
    }

    private boolean isImgFileRepStored()
    {
        return imgFileRep == ImageFileRep.FILE_STORED;
    }

    private boolean isImgFileRepUnknown()
    {
        return imgFileRep == ImageFileRep.FILE_NONE;
    }

    private boolean isImgRepBitmap()
    {
        return imgRep == ImageRep.IMAGE_REP_BITMAP;
    }

    private boolean isImgRepBoth()
    {
        return imgRep == ImageRep.IMAGE_REP_BOTH;
    }

    private boolean isImgRepFile()
    {
        return imgRep == ImageRep.IMAGE_REP_FILE;
    }

    private boolean isImgRepUnknown()
    {
        return imgRep == ImageRep.IMAGE_REP_NONE;
    }

    private void logAppStats(int i, boolean flag, long l)
    {
        imageAppStatsClient = new ImageAppStatsClient();
        AppStatsImageData appstatsimagedata = new AppStatsImageData();
        appstatsimagedata.setImageID(imgID);
        appstatsimagedata.setFileSize((int)l);
        appstatsimagedata.setSource(i);
        appstatsimagedata.setCreationTime(System.currentTimeMillis());
        creationTime = System.currentTimeMillis();
        if (i == 0 && !flag)
        {
            imageAppStatsClient.logAppStats(AppStatsEventIDType.APP_STATS_IMAGE_CREATED, appstatsimagedata);
            return;
        } else
        {
            imageAppStatsClient.logAppStats(AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT, appstatsimagedata);
            return;
        }
    }

    private void parseGPSData()
    {
        String as[] = imgMetaData.split("[\\r\\n]+");
        int l = as.length;
        Float float4 = null;
        Float float3 = null;
        Float float2 = null;
        Float float1 = null;
        Boolean boolean2 = Boolean.valueOf(false);
        Boolean boolean1 = Boolean.valueOf(false);
        int k = 0;
        int j = 0;
        while (j < l) 
        {
            Object obj = as[j];
            Float float5;
            Float float6;
            Float float7;
            Float float8;
            Boolean boolean3;
            Boolean boolean4;
            int i;
            if (((String) (obj)).startsWith("GPS Latitude Reference:"))
            {
                boolean3 = Boolean.valueOf(((String) (obj)).contains(": N"));
                i = k | 1;
                boolean4 = boolean1;
                float8 = float1;
                float7 = float2;
                float6 = float3;
                float5 = float4;
            } else
            if (((String) (obj)).startsWith("GPS Latitude:"))
            {
                obj = extractGPSValues(((String) (obj)).trim());
                float5 = float4;
                float6 = float3;
                float7 = float2;
                float8 = float1;
                boolean3 = boolean2;
                boolean4 = boolean1;
                i = k;
                if (obj != null)
                {
                    float8 = getGPSValue(obj[0].trim());
                    float7 = Float.valueOf(getGPSValue(obj[1].trim()).floatValue() / 60F);
                    i = k | 2;
                    float5 = float4;
                    float6 = float3;
                    boolean3 = boolean2;
                    boolean4 = boolean1;
                }
            } else
            if (((String) (obj)).startsWith("GPS Longitude Reference:"))
            {
                boolean4 = Boolean.valueOf(((String) (obj)).contains(": W"));
                i = k | 4;
                float5 = float4;
                float6 = float3;
                float7 = float2;
                float8 = float1;
                boolean3 = boolean2;
            } else
            {
                float5 = float4;
                float6 = float3;
                float7 = float2;
                float8 = float1;
                boolean3 = boolean2;
                boolean4 = boolean1;
                i = k;
                if (((String) (obj)).startsWith("GPS Longitude:"))
                {
                    String as1[] = extractGPSValues(((String) (obj)));
                    float5 = float4;
                    float6 = float3;
                    float7 = float2;
                    float8 = float1;
                    boolean3 = boolean2;
                    boolean4 = boolean1;
                    i = k;
                    if (as1 != null)
                    {
                        float6 = getGPSValue(as1[0].trim());
                        float5 = Float.valueOf(getGPSValue(as1[1].trim()).floatValue() / 60F);
                        i = k | 8;
                        float7 = float2;
                        float8 = float1;
                        boolean3 = boolean2;
                        boolean4 = boolean1;
                    }
                }
            }
            j++;
            float4 = float5;
            float3 = float6;
            float2 = float7;
            float1 = float8;
            boolean2 = boolean3;
            boolean1 = boolean4;
            k = i;
        }
        if (k == 15)
        {
            float f;
            if (boolean2.booleanValue())
            {
                f = float1.floatValue();
                f = float2.floatValue() + f;
            } else
            {
                f = float1.floatValue();
                f = 0.0F - (float2.floatValue() + f);
            }
            imgLatitude = Float.valueOf(f);
            if (boolean1.booleanValue())
            {
                f = float3.floatValue();
                f = 0.0F - (float4.floatValue() + f);
            } else
            {
                f = float3.floatValue();
                f = float4.floatValue() + f;
            }
            imgLongitude = Float.valueOf(f);
        }
    }

    private String parseMicrData()
    {
        JSONArray jsonarray = (new JSONObject(imgMetaData)).getJSONObject("Front Side").getJSONObject("Text Lines").getJSONArray("Lines");
        String s = new String();
        int i = 0;
        do
        {
            String s1;
label0:
            {
                s1 = s;
                if (i < jsonarray.length())
                {
                    s1 = s;
                    if (!"MICR".equals(jsonarray.getJSONObject(i).getString("Label")))
                    {
                        break label0;
                    }
                    s = jsonarray.getJSONObject(i).getString("OCR Data");
                    int j = jsonarray.getJSONObject(i).getInt("TLy");
                    s1 = s;
                    if (jsonarray.getJSONObject(i).getInt("BLy") - j < 8)
                    {
                        break label0;
                    }
                    s1 = s;
                    if (!s.matches(".*C\\d{9}C.*"))
                    {
                        break label0;
                    }
                    s1 = s;
                }
                return s1;
            }
            i++;
            s = s1;
        } while (true);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        if (com/kofax/kmc/ken/engines/data/Image.getName().compareToIgnoreCase((String)objectinputstream.readObject()) != 0) goto _L2; else goto _L1
_L1:
        Object obj = (String)objectinputstream.readObject();
        if (!SdkVersion.versionCompatible(KenVersion.getPackageVersion(), ((String) (obj))).booleanValue()) goto _L4; else goto _L3
_L3:
        BitmapSerialization bitmapserialization;
        setImageFilePath((String)objectinputstream.readObject());
        imgMimeType = (ImageMimeType)objectinputstream.readObject();
        imgRep = (ImageRep)objectinputstream.readObject();
        imgBitmapWidth = (Integer)objectinputstream.readObject();
        imgBitmapHeight = (Integer)objectinputstream.readObject();
        imgBitmapScaling = (Float)objectinputstream.readObject();
        imgFileWidth = (Integer)objectinputstream.readObject();
        imgFileHeight = (Integer)objectinputstream.readObject();
        imgTag = (String)objectinputstream.readObject();
        imgID = (String)objectinputstream.readObject();
        imgSrcID = (String)objectinputstream.readObject();
        imgMetaData = (String)objectinputstream.readObject();
        imgPerfectProfileUsed = (ImagePerfectionProfile)objectinputstream.readObject();
        basicSettingsProfileUsed = (BasicSettingsProfile)objectinputstream.readObject();
        imgQckAnalysisFeedBck = (QuickAnalysisFeedback)objectinputstream.readObject();
        imgLatitude = (Float)objectinputstream.readObject();
        imgLongitude = (Float)objectinputstream.readObject();
        imageBarCodes = (ArrayList)objectinputstream.readObject();
        imgClassifyResults = (ArrayList)objectinputstream.readObject();
        imgPitch = (Float)objectinputstream.readObject();
        imgRoll = (Float)objectinputstream.readObject();
        imgCreateDateTime = (String)objectinputstream.readObject();
        imgDPI = (Integer)objectinputstream.readObject();
        imgJpegQuality = (Integer)objectinputstream.readObject();
        imgOutputColor = (OutputColor)objectinputstream.readObject();
        fileIOEngine = (FileIOEngine)objectinputstream.readObject();
        imgFileRep = (ImageFileRep)objectinputstream.readObject();
        bitmapserialization = (BitmapSerialization)objectinputstream.readObject();
        obj = Boolean.valueOf(false);
        _cls1..SwitchMap.com.kofax.kmc.ken.engines.data.Image.BitmapSerialization[bitmapserialization.ordinal()];
        JVM INSTR tableswitch 1 4: default 392
    //                   1 417
    //                   2 457
    //                   3 457
    //                   4 467;
           goto _L5 _L6 _L7 _L7 _L8
_L5:
        imgBitmap = null;
        imgFileBuffer = null;
        objectinputstream = ((ObjectInputStream) (obj));
_L12:
        if (!objectinputstream.booleanValue()) goto _L10; else goto _L9
_L9:
        imageClearFileBuffer();
_L10:
        return;
_L6:
        try
        {
            DeserializeBitmap(objectinputstream);
            imgFileRep = ImageFileRep.FILE_NONE;
            imageWriteToFileBuffer();
            imageClearBitmap();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            objectinputstream.printStackTrace();
            objectinputstream = Boolean.valueOf(true);
            continue; /* Loop/switch isn't completed */
        }
        objectinputstream = ((ObjectInputStream) (obj));
        continue; /* Loop/switch isn't completed */
_L7:
        DeserializeBitmap(objectinputstream);
        objectinputstream = ((ObjectInputStream) (obj));
        continue; /* Loop/switch isn't completed */
_L8:
        DeserializeBitmap(objectinputstream);
        imgFileRep = ImageFileRep.FILE_NONE;
        imageWriteToFileBuffer();
        objectinputstream = ((ObjectInputStream) (obj));
        continue; /* Loop/switch isn't completed */
        objectinputstream;
        objectinputstream.printStackTrace();
        objectinputstream = Boolean.valueOf(true);
        if (true) goto _L12; else goto _L11
_L11:
        objectinputstream;
        objectinputstream.printStackTrace();
        return;
_L4:
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
_L2:
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    private void setImageMetaData(String s)
    {
        imgMetaData = s;
    }

    private void updateImageFileDimensions(IpFileBuffer ipfilebuffer)
    {
        imgFileWidth = Integer.valueOf(ipfilebuffer.mWidth);
        imgFileHeight = Integer.valueOf(ipfilebuffer.mHeight);
    }

    private void updateImageFileDimensions(String s)
    {
        try
        {
            s = ImageService.getImageDimension(s);
            imgFileWidth = Integer.valueOf(s.getWidth());
            imgFileHeight = Integer.valueOf(s.getHeight());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        ErrorInfo.KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR.setErrCause(s.getMessage());
        throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(com/kofax/kmc/ken/engines/data/Image.getName());
        objectoutputstream.writeObject(KenVersion.getPackageVersion());
        objectoutputstream.writeObject(getImageFilePath());
        objectoutputstream.writeObject(imgMimeType);
        objectoutputstream.writeObject(imgRep);
        objectoutputstream.writeObject(imgBitmapWidth);
        objectoutputstream.writeObject(imgBitmapHeight);
        objectoutputstream.writeObject(imgBitmapScaling);
        objectoutputstream.writeObject(imgFileWidth);
        objectoutputstream.writeObject(imgFileHeight);
        objectoutputstream.writeObject(imgTag);
        objectoutputstream.writeObject(imgID);
        objectoutputstream.writeObject(imgSrcID);
        objectoutputstream.writeObject(imgMetaData);
        objectoutputstream.writeObject(imgPerfectProfileUsed);
        objectoutputstream.writeObject(basicSettingsProfileUsed);
        objectoutputstream.writeObject(imgQckAnalysisFeedBck);
        objectoutputstream.writeObject(imgLatitude);
        objectoutputstream.writeObject(imgLongitude);
        objectoutputstream.writeObject(imageBarCodes);
        objectoutputstream.writeObject(imgClassifyResults);
        objectoutputstream.writeObject(imgPitch);
        objectoutputstream.writeObject(imgRoll);
        objectoutputstream.writeObject(imgCreateDateTime);
        objectoutputstream.writeObject(imgDPI);
        objectoutputstream.writeObject(imgJpegQuality);
        objectoutputstream.writeObject(imgOutputColor);
        objectoutputstream.writeObject(fileIOEngine);
        objectoutputstream.writeObject(imgFileRep);
        if (isImgRepUnknown() && isImgFileRepUnknown())
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_NONE_NONE);
            return;
        }
        if (isImgRepFile() && isImgFileRepStored())
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_FILE_STORED);
            return;
        }
        if (!isImgRepFile() || !isImgFileRepBuffered())
        {
            break MISSING_BLOCK_LABEL_371;
        }
        try
        {
            if (imgMimeType == ImageMimeType.MIMETYPE_PNG)
            {
                objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_FILE_BUFFERED);
                SerializeBitmap(objectoutputstream, Boolean.valueOf(true));
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_NONE_NONE);
            return;
        }
        imageReadFromFileBuffer();
        imageClearFileBuffer();
        objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_FILE_BUFFERED);
        SerializeBitmap(objectoutputstream, Boolean.valueOf(false));
        imageWriteToFileBuffer();
        imageClearBitmap();
        return;
        if (isImgRepBitmap() && isImgFileRepUnknown())
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_BITMAP_NONE);
            SerializeBitmap(objectoutputstream, Boolean.valueOf(false));
            return;
        }
        if (isImgRepBoth() && isImgFileRepStored())
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_BOTH_STORED);
            SerializeBitmap(objectoutputstream, Boolean.valueOf(false));
            return;
        }
        if (isImgRepBoth() && isImgFileRepBuffered())
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_BOTH_BUFFERED);
            SerializeBitmap(objectoutputstream, Boolean.valueOf(false));
            return;
        } else
        {
            objectoutputstream.writeObject(BitmapSerialization.IMAGE_REP_NONE_NONE);
            return;
        }
    }

    public Bitmap createScaledBitmap()
    {
        if (imgBitmap == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_NO_BITMAP);
        }
        KenBitmap kenbitmap = ImageService.createScaledBitmapFromBitmapWithMatrix(imgBitmap, imgBitmapScaling.floatValue());
        if (kenbitmap.errInfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcException(kenbitmap.errInfo);
        } else
        {
            return kenbitmap.bitmap;
        }
    }

    public BasicSettingsProfile getBasicSettingsProfileUsed()
    {
        if (basicSettingsProfileUsed != null)
        {
            return basicSettingsProfileUsed.clone();
        } else
        {
            return null;
        }
    }

    public FileIOEngine getFileIOEngine()
    {
        return fileIOEngine;
    }

    public List getImageBarCodes()
    {
        return imageBarCodes;
    }

    public Bitmap getImageBitmap()
    {
        return imgBitmap;
    }

    public Integer getImageBitmapHeight()
    {
        return imgBitmapHeight;
    }

    public Float getImageBitmapScaling()
    {
        return imgBitmapScaling;
    }

    public Integer getImageBitmapWidth()
    {
        return imgBitmapWidth;
    }

    public List getImageClassifyResults()
    {
        return imgClassifyResults;
    }

    public String getImageCreateDateTime()
    {
        return imgCreateDateTime;
    }

    public Integer getImageDPI()
    {
        return imgDPI;
    }

    public ByteBuffer getImageFileBuffer()
    {
        if (!isImgFileRepBuffered())
        {
            return ByteBuffer.allocate(0);
        }
        if (imgFileBuffer == null)
        {
            throw new InternalError("Image.fileBuffer is null");
        } else
        {
            return imgFileBuffer.mByteBuffer.asReadOnlyBuffer();
        }
    }

    public Integer getImageFileHeight()
    {
        return imgFileHeight;
    }

    public String getImageFilePath()
    {
        if (imgFile == null)
        {
            return "";
        } else
        {
            return imgFile.getAbsolutePath();
        }
    }

    public ImageFileRep getImageFileRep()
    {
        return imgFileRep;
    }

    public Integer getImageFileWidth()
    {
        return imgFileWidth;
    }

    public String getImageID()
    {
        return imgID;
    }

    public Integer getImageJpegQuality()
    {
        return imgJpegQuality;
    }

    public Float getImageLatitude()
    {
        return imgLatitude;
    }

    public Float getImageLongitude()
    {
        return imgLongitude;
    }

    public String getImageMetaData()
    {
        return imgMetaData;
    }

    public ImageMimeType getImageMimeType()
    {
        return imgMimeType;
    }

    public OutputColor getImageOutputColor()
    {
        return imgOutputColor;
    }

    public ImagePerfectionProfile getImagePerfectProfileUsed()
    {
        if (imgPerfectProfileUsed != null)
        {
            return imgPerfectProfileUsed.clone();
        } else
        {
            return null;
        }
    }

    public Float getImagePitch()
    {
        return imgPitch;
    }

    public QuickAnalysisFeedback getImageQuickAnalysisFeedBack()
    {
        return imgQckAnalysisFeedBck;
    }

    public ImageRep getImageRepresentation()
    {
        return imgRep;
    }

    public Float getImageRoll()
    {
        return imgRoll;
    }

    public long getImageSize()
    {
        ImageRep imagerep = getImageRepresentation();
        if (getImageFileRep() == ImageFileRep.FILE_BUFFERED)
        {
            return (long)imgFileBuffer.mFileBufferLength;
        }
        if (imagerep == ImageRep.IMAGE_REP_FILE)
        {
            return imgFile.length();
        }
        if (imagerep == ImageRep.IMAGE_REP_BITMAP || imagerep == ImageRep.IMAGE_REP_BOTH)
        {
            return (long)(imgBitmapHeight.intValue() * imgBitmapWidth.intValue());
        } else
        {
            return 0L;
        }
    }

    public String getImageSrcID()
    {
        return imgSrcID;
    }

    public String getImageTag()
    {
        return imgTag;
    }

    public String getMicrData()
    {
        if (imgMicrData.isEmpty())
        {
            imgMicrData = parseMicrData();
        }
        return imgMicrData;
    }

    public ErrorInfo imageClearBitmap()
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        checkImageRepresentationStateAndThrow();
        if (imgBitmap != null)
        {
            imgBitmap.recycle();
            imgBitmap = null;
            ImageRep imagerep;
            if (isImgRepBitmap())
            {
                imagerep = ImageRep.IMAGE_REP_NONE;
            } else
            {
                imagerep = ImageRep.IMAGE_REP_FILE;
            }
            imgRep = imagerep;
            if (ImageRep.IMAGE_REP_NONE == imgRep)
            {
                imgDPI = null;
            }
            imgBitmapWidth = null;
            imgBitmapHeight = null;
            return errorinfo;
        } else
        {
            return ErrorInfo.KMC_ED_ALREADY_CLEAR;
        }
    }

    public ErrorInfo imageClearFileBuffer()
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        if (isImgFileRepBuffered())
        {
            ErrorInfo errorinfo1 = ImageService.clearFileBufferUsingIp(imgFileBuffer);
            imgFileBuffer = null;
            ImageRep imagerep;
            if (isImgRepBoth())
            {
                imagerep = ImageRep.IMAGE_REP_BITMAP;
            } else
            {
                imagerep = ImageRep.IMAGE_REP_NONE;
            }
            imgRep = imagerep;
            imgFileRep = ImageFileRep.FILE_NONE;
            return errorinfo1;
        } else
        {
            return ErrorInfo.KMC_ED_BUFFER_ALREADY_CLEARED;
        }
    }

    public ErrorInfo imageDeleteFile()
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        if (imgFile == null)
        {
            errorinfo = ErrorInfo.KMC_ED_FILEPATH;
            errorinfo.setErrCause("imgFile field is null");
        } else
        if (!imgFile.exists())
        {
            errorinfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
        } else
        if (isImgFileRepBuffered())
        {
            errorinfo = ErrorInfo.KMC_ED_DELETE_BUFFERED_FILE;
        } else
        {
            errorinfo = ImageService.deleteImage(imgFile);
        }
        if (errorinfo == ErrorInfo.KMC_SUCCESS || errorinfo == ErrorInfo.KMC_GN_FILE_NOT_FOUND)
        {
            imgFile = null;
            ImageRep imagerep;
            if (imgBitmap != null)
            {
                imagerep = ImageRep.IMAGE_REP_BITMAP;
            } else
            {
                imagerep = ImageRep.IMAGE_REP_NONE;
            }
            imgRep = imagerep;
            imgMimeType = ImageMimeType.MIMETYPE_UNKNOWN;
            imgFileWidth = null;
            imgFileHeight = null;
            imgFileRep = ImageFileRep.FILE_NONE;
            return errorinfo;
        }
        if (isCheckedException(errorinfo))
        {
            throw new KmcException(errorinfo);
        } else
        {
            throw new KmcRuntimeException(errorinfo);
        }
    }

    public ErrorInfo imageReadFromFile()
    {
        return imageReadFromFile(fileIOEngine, true);
    }

    public ErrorInfo imageReadFromFile(FileIOEngine fileioengine, boolean flag)
    {
        Object obj2 = null;
        Object obj = ErrorInfo.KMC_SUCCESS;
        Object obj1;
        FileIOEngine fileioengine1;
        if (imgFile == null)
        {
            obj = ErrorInfo.KMC_ED_FILEPATH;
            ((ErrorInfo) (obj)).setErrCause("imgFile field is null");
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (!imgFile.exists())
        {
            obj = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (imgBitmap != null)
        {
            obj = ErrorInfo.KMC_ED_IMAGELEAK;
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (isImgFileRepBuffered())
        {
            obj = ErrorInfo.KMC_ED_ALREADY_BUFFERED;
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (getEngineCompatibleWithMimeType(fileioengine, FileIODirection.FILE_IO_READ) == FileIOEngine.FILE_ENG_ANDROID)
        {
            fileioengine1 = FileIOEngine.FILE_ENG_ANDROID;
            obj = ImageService.loadBitmapFromFile(imgFile.getAbsolutePath(), 1, flag);
            Log.i("Image", (new StringBuilder()).append("kenBitmap: width=").append(((KenBitmap) (obj)).bitmap.getWidth()).toString());
            Log.i("Image", (new StringBuilder()).append("kenBitmap: height=").append(((KenBitmap) (obj)).bitmap.getHeight()).toString());
            if (imgBitmapScaling.floatValue() < 1.0F && !flag)
            {
                obj1 = ImageService.createScaledBitmapFromBitmapWithMatrix(((KenBitmap) (obj)).bitmap, imgBitmapScaling.floatValue());
                Log.i("Image", (new StringBuilder()).append("kenBitmapScaled: width=").append(((KenBitmap) (obj1)).bitmap.getWidth()).toString());
                Log.i("Image", (new StringBuilder()).append("kenBitmapScaled: height=").append(((KenBitmap) (obj1)).bitmap.getHeight()).toString());
                ((KenBitmap) (obj)).bitmap.recycle();
                obj.bitmap = null;
                obj = obj1;
            }
            ErrorInfo errorinfo = ((KenBitmap) (obj)).errInfo;
            obj1 = null;
            obj2 = obj;
            obj = errorinfo;
        } else
        {
            fileioengine1 = FileIOEngine.FILE_ENG_KFIL;
            obj1 = new IpImageMetadata();
            obj2 = ImageService.readBitmapFromFileUsingIp(imgFile.getAbsolutePath(), imgBitmapScaling.floatValue(), ((IpImageMetadata) (obj1)));
            obj = ((KenBitmap) (obj2)).errInfo;
        }
        if (((KenBitmap) (obj2)).bitmap != null)
        {
            imgRep = ImageRep.IMAGE_REP_BOTH;
            imgBitmap = ((KenBitmap) (obj2)).bitmap;
            imgDPI = ((KenBitmap) (obj2)).mDpiX;
            imgBitmapWidth = Integer.valueOf(imgBitmap.getWidth());
            imgBitmapHeight = Integer.valueOf(imgBitmap.getHeight());
            if (obj1 != null && ((IpImageMetadata) (obj1)).metadataStr != null)
            {
                imgMetaData = ((IpImageMetadata) (obj1)).metadataStr;
                parseGPSData();
            }
        }
        if (obj != ErrorInfo.KMC_SUCCESS && obj != ErrorInfo.KMC_ED_IMAGE_IS_SCALED)
        {
            if (isCheckedException(((ErrorInfo) (obj))))
            {
                throw new KmcException(((ErrorInfo) (obj)));
            } else
            {
                throw new KmcRuntimeException(((ErrorInfo) (obj)));
            }
        }
        obj1 = obj;
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            obj1 = obj;
            if (fileioengine1 != fileioengine)
            {
                obj1 = ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE;
            }
        }
        return ((ErrorInfo) (obj1));
    }

    public ErrorInfo imageReadFromFileBuffer()
    {
        return imageReadFromFileBuffer(FileIOEngine.FILE_ENG_KFIL);
    }

    public ErrorInfo imageReadFromFileBuffer(FileIOEngine fileioengine)
    {
        Object obj2 = null;
        Object obj = ErrorInfo.KMC_SUCCESS;
        Object obj1;
        FileIOEngine fileioengine1;
        if (imgBitmap != null)
        {
            obj = ErrorInfo.KMC_ED_IMAGELEAK;
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (!isImgFileRepBuffered())
        {
            obj = ErrorInfo.KMC_ED_NO_BUFFERED_IMAGE;
            fileioengine1 = fileioengine;
            obj1 = null;
        } else
        if (getEngineCompatibleWithMimeType(fileioengine, FileIODirection.FILE_IO_READ) == FileIOEngine.FILE_ENG_ANDROID)
        {
            fileioengine1 = FileIOEngine.FILE_ENG_ANDROID;
            obj = ImageService.loadBitmapFromFileBuffer(imgFileBuffer);
            Log.i("Image", (new StringBuilder()).append("kenBitmap: width=").append(((KenBitmap) (obj)).bitmap.getWidth()).toString());
            Log.i("Image", (new StringBuilder()).append("kenBitmap: height=").append(((KenBitmap) (obj)).bitmap.getHeight()).toString());
            if (imgBitmapScaling.floatValue() < 1.0F)
            {
                obj1 = ImageService.createScaledBitmapFromBitmapWithMatrix(((KenBitmap) (obj)).bitmap, imgBitmapScaling.floatValue());
                Log.i("Image", (new StringBuilder()).append("kenBitmapScaled: width=").append(((KenBitmap) (obj1)).bitmap.getWidth()).toString());
                Log.i("Image", (new StringBuilder()).append("kenBitmapScaled: height=").append(((KenBitmap) (obj1)).bitmap.getHeight()).toString());
                ((KenBitmap) (obj)).bitmap.recycle();
                obj.bitmap = null;
                obj = obj1;
            }
            ErrorInfo errorinfo = ((KenBitmap) (obj)).errInfo;
            obj1 = null;
            obj2 = obj;
            obj = errorinfo;
        } else
        {
            fileioengine1 = FileIOEngine.FILE_ENG_KFIL;
            obj1 = new IpImageMetadata();
            obj2 = ImageService.readBitmapFromFileBufferUsingIp(imgFileBuffer, imgBitmapScaling.floatValue());
            obj = ((KenBitmap) (obj2)).errInfo;
        }
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            if (((KenBitmap) (obj2)).bitmap == null)
            {
                throw new InternalError("imageReadFromFileBuffer: kenBitmap.bitmap == null");
            }
            imgRep = ImageRep.IMAGE_REP_BOTH;
            imgBitmap = ((KenBitmap) (obj2)).bitmap;
            imgDPI = ((KenBitmap) (obj2)).mDpiX;
            imgBitmapWidth = Integer.valueOf(imgBitmap.getWidth());
            imgBitmapHeight = Integer.valueOf(imgBitmap.getHeight());
            if (obj1 != null && ((IpImageMetadata) (obj1)).metadataStr != null)
            {
                imgMetaData = ((IpImageMetadata) (obj1)).metadataStr;
                parseGPSData();
            }
        }
        if (obj != ErrorInfo.KMC_SUCCESS && obj != ErrorInfo.KMC_ED_IMAGE_IS_SCALED)
        {
            if (isCheckedException(((ErrorInfo) (obj))))
            {
                throw new KmcException(((ErrorInfo) (obj)));
            } else
            {
                throw new KmcRuntimeException(((ErrorInfo) (obj)));
            }
        }
        obj1 = obj;
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            obj1 = obj;
            if (fileioengine1 != fileioengine)
            {
                obj1 = ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE;
            }
        }
        return ((ErrorInfo) (obj1));
    }

    public ErrorInfo imageWriteToFile()
    {
        return imageWriteToFile(fileIOEngine);
    }

    public ErrorInfo imageWriteToFile(FileIOEngine fileioengine)
    {
        ErrorInfo errorinfo;
        FileIOEngine fileioengine1;
        ErrorInfo errorinfo1;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        if (imgFile == null)
        {
            errorinfo = ErrorInfo.KMC_ED_FILEPATH;
            errorinfo.setErrCause("imgFile field is null");
            fileioengine1 = fileioengine;
        } else
        if (!imgFile.getParentFile().exists())
        {
            errorinfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
            errorinfo.setErrCause((new StringBuilder()).append("imgFile directory").append(imgFile.getParent()).append(" does not exist").toString());
            fileioengine1 = fileioengine;
        } else
        if (imgFile.exists())
        {
            errorinfo = ErrorInfo.KMC_ED_FILE_EXISTS;
            errorinfo.setErrCause((new StringBuilder()).append("imgFile ").append(imgFile.getAbsolutePath()).append(" already exists").toString());
            fileioengine1 = fileioengine;
        } else
        if (imgBitmap == null)
        {
            errorinfo = ErrorInfo.KMC_ED_NOIMAGE;
            errorinfo.setErrCause("imgBitmap field is null");
            fileioengine1 = fileioengine;
        } else
        if (imgMimeType == ImageMimeType.MIMETYPE_UNKNOWN)
        {
            errorinfo = ErrorInfo.KMC_ED_MIMETYPE;
            errorinfo.setErrCause("imgMimeType set to MIMETYPE_UNKNOWN");
            fileioengine1 = fileioengine;
        } else
        if (isImgFileRepBuffered())
        {
            errorinfo = ErrorInfo.KMC_ED_BUFFER_EXISTS;
            errorinfo.setErrCause("imgFileRep set to FILE_BUFFERED");
            fileioengine1 = fileioengine;
        } else
        if (!getMimeTypeFromFile(imgFile).equals(imgMimeType))
        {
            errorinfo = ErrorInfo.KMC_ED_MIMETYPE_MISMATCH;
            errorinfo.setErrCause((new StringBuilder()).append("imgMimeType: ").append(imgMimeType.toString()).append(" does not match MIME type of file").toString());
            fileioengine1 = fileioengine;
        } else
        if (imgMimeType == ImageMimeType.MIMETYPE_JPEG && imgOutputColor == OutputColor.BITDEPTH_BITONAL)
        {
            errorinfo = ErrorInfo.KMC_ED_JPEG_BITDEPTH;
            errorinfo.setErrCause("OutputColor cannot be BITDEPTH_BITONAL when MIME type is MIMETYPE_JPEG");
            fileioengine1 = fileioengine;
        } else
        if (fileioengine == FileIOEngine.FILE_ENG_ANDROID && isAndroidFileIOUsable())
        {
            fileioengine1 = FileIOEngine.FILE_ENG_ANDROID;
            errorinfo = ImageService.saveBitmap(imgBitmap, imgFile.getAbsolutePath(), imgMimeType, imgJpegQuality.intValue());
        } else
        {
            fileioengine1 = FileIOEngine.FILE_ENG_KFIL;
            int i;
            if (imgDPI != null)
            {
                i = imgDPI.intValue();
            } else
            {
                i = 72;
            }
            if (imgMetaData.isEmpty() && imgLatitude != null && imgLongitude != null)
            {
                imgMetaData = ImageService.createGPSMetadata(this);
            }
            errorinfo = ImageService.saveIpBitmap(imgBitmap, imgFile.getAbsolutePath(), imgMimeType, imgOutputColor.getBitsPerPixel(), i, imgJpegQuality.intValue(), imgMetaData);
        }
        errorinfo1 = errorinfo;
        if (errorinfo == ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL) goto _L2; else goto _L1
_L1:
        if (errorinfo != ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY) goto _L4; else goto _L3
_L3:
        errorinfo1 = errorinfo;
_L2:
        imgRep = ImageRep.IMAGE_REP_BOTH;
        imgFileRep = ImageFileRep.FILE_STORED;
        updateImageFileDimensions(imgFile.getAbsolutePath());
        logAppStats(0, true, imgFile.length());
        return errorinfo1;
_L4:
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            if (isCheckedException(errorinfo))
            {
                throw new KmcException(errorinfo);
            } else
            {
                throw new KmcRuntimeException(errorinfo);
            }
        }
        errorinfo1 = errorinfo;
        if (fileioengine1 != fileioengine)
        {
            errorinfo1 = ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public ErrorInfo imageWriteToFileBuffer()
    {
        return imageWriteToFileBuffer(FileIOEngine.FILE_ENG_KFIL);
    }

    public ErrorInfo imageWriteToFileBuffer(FileIOEngine fileioengine)
    {
        ErrorInfo errorinfo;
        FileIOEngine fileioengine1;
        ErrorInfo errorinfo1;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        if (imgBitmap == null)
        {
            errorinfo = ErrorInfo.KMC_ED_OBJECT_REP_NO_BITMAP;
            errorinfo.setErrCause("imgBitmap field is null");
            fileioengine1 = fileioengine;
        } else
        if (imgMimeType == ImageMimeType.MIMETYPE_UNKNOWN)
        {
            errorinfo = ErrorInfo.KMC_ED_MIMETYPE;
            errorinfo.setErrCause("imgMimeType set to MIMETYPE_UNKNOWN");
            fileioengine1 = fileioengine;
        } else
        if (isImgFileRepBuffered())
        {
            errorinfo = ErrorInfo.KMC_ED_ALREADY_BUFFERED;
            errorinfo.setErrCause("imgFileRep set to FILE_BUFFERED");
            fileioengine1 = fileioengine;
        } else
        if (isImgFileRepStored())
        {
            errorinfo = ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH;
            errorinfo.setErrCause("imgFileRep set to FILE_BUFFERED or FILE_STORED");
            fileioengine1 = fileioengine;
        } else
        if (imgMimeType == ImageMimeType.MIMETYPE_JPEG && imgOutputColor == OutputColor.BITDEPTH_BITONAL)
        {
            errorinfo = ErrorInfo.KMC_ED_JPEG_BITDEPTH;
            errorinfo.setErrCause("OutputColor cannot be BITDEPTH_BITONAL when MIME type is MIMETYPE_JPEG");
            fileioengine1 = fileioengine;
        } else
        {
            fileioengine1 = FileIOEngine.FILE_ENG_KFIL;
            int i;
            if (imgDPI != null)
            {
                i = imgDPI.intValue();
            } else
            {
                i = 72;
            }
            if (imgMetaData.isEmpty() && imgLatitude != null && imgLongitude != null)
            {
                imgMetaData = ImageService.createGPSMetadata(this);
            }
            ResetFileBuffer();
            errorinfo = ImageService.saveIpBitmap(imgBitmap, i, imgFileBuffer);
        }
        errorinfo1 = errorinfo;
        if (errorinfo == ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL) goto _L2; else goto _L1
_L1:
        if (errorinfo != ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY) goto _L4; else goto _L3
_L3:
        errorinfo1 = errorinfo;
_L2:
        imgRep = ImageRep.IMAGE_REP_BOTH;
        imgFileRep = ImageFileRep.FILE_BUFFERED;
        updateImageFileDimensions(imgFileBuffer);
        return errorinfo1;
_L4:
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            if (isCheckedException(errorinfo))
            {
                throw new KmcException(errorinfo);
            } else
            {
                throw new KmcRuntimeException(errorinfo);
            }
        }
        errorinfo1 = errorinfo;
        if (fileioengine1 != fileioengine)
        {
            errorinfo1 = ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void setFileIOEngine(FileIOEngine fileioengine)
    {
        fileIOEngine = fileioengine;
    }

    public void setImageBarCodes(List list)
    {
        checkParamAndThrow(list, "imageBarCodes");
        imageBarCodes = list;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        checkBitmapParamsAndThrow(bitmap);
        checkImageRepresentationStateAndThrow();
        if (isImgRepBoth() || isImgRepFile())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH);
        }
        if (imgBitmap != null)
        {
            imgBitmap.recycle();
            imgBitmap = null;
        }
        imgBitmap = bitmap;
        imgRep = ImageRep.IMAGE_REP_BITMAP;
        imgFileRep = ImageFileRep.FILE_NONE;
        imgDPI = Integer.valueOf(72);
        imgBitmapWidth = Integer.valueOf(imgBitmap.getWidth());
        imgBitmapHeight = Integer.valueOf(imgBitmap.getHeight());
    }

    public void setImageBitmapScaling(float f)
    {
        if (f < 0.1F || f > 1.0F)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_INVALID_SCALING_FACTOR);
        } else
        {
            imgBitmapScaling = Float.valueOf(f);
            return;
        }
    }

    public void setImageClassifyResults(List list)
    {
        checkParamAndThrow(list, "imgClassifyResults");
        imgClassifyResults = list;
    }

    public void setImageCreateDateTime(String s)
    {
        checkParamAndThrow(s, "imgCreateDateTime");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        try
        {
            simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_ISO_DATE_TIME_FORMAT);
        }
        imgCreateDateTime = s;
    }

    public void setImageDPI(int i)
    {
        checkParamAndThrow(Integer.valueOf(i), "imgDPI");
        if (i < 25)
        {
            throw new IllegalArgumentException("imgDPI is invalid because it's < 25");
        } else
        {
            imgDPI = Integer.valueOf(i);
            return;
        }
    }

    public void setImageFilePath(String s)
    {
        ImageMimeType imagemimetype;
        File file;
        if (s != null)
        {
            file = new File(s);
            imagemimetype = getMimeTypeFromFile(file);
        } else
        {
            imagemimetype = null;
            file = null;
        }
        if (imagemimetype == ImageMimeType.MIMETYPE_UNKNOWN && !s.isEmpty())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_UNRECOGNIZED_MIME_TYPE);
        }
        checkFileParamsAndThrow(s, imagemimetype, false, true);
        if (!file.exists())
        {
            ImageRep imagerep;
            if (isImgRepBitmap() || isImgRepBoth())
            {
                imagerep = ImageRep.IMAGE_REP_BITMAP;
            } else
            {
                imagerep = ImageRep.IMAGE_REP_NONE;
            }
            imgRep = imagerep;
            imgFileRep = ImageFileRep.FILE_NONE;
            imgFileWidth = null;
            imgFileHeight = null;
        } else
        {
            if (isImgRepBitmap() || isImgRepBoth())
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_ED_OBJECT_REP_FILE_MISMATCH);
            }
            imgRep = ImageRep.IMAGE_REP_FILE;
            imgFileRep = ImageFileRep.FILE_STORED;
            updateImageFileDimensions(s);
        }
        if (s.isEmpty())
        {
            imgFile = null;
        } else
        {
            imgFile = file;
            imgMimeType = imagemimetype;
        }
        logAppStats(0, true, file.length());
    }

    public void setImageJpegQuality(int i)
    {
        if (i < 1 || i > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_JPEG_QUALITY_VALUE);
        } else
        {
            imgJpegQuality = Integer.valueOf(i);
            return;
        }
    }

    public void setImageMimeType(ImageMimeType imagemimetype)
    {
        imgMimeType = imagemimetype;
    }

    public void setImageOutputColor(OutputColor outputcolor)
    {
        imgOutputColor = outputcolor;
    }

    void setImagePitch(float f)
    {
        imgPitch = Float.valueOf(f);
    }

    void setImageRoll(float f)
    {
        imgRoll = Float.valueOf(f);
    }

    public void setImageTag(String s)
    {
        imgTag = s;
    }

    public void setMicrData(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("micrData parameter is null");
        } else
        {
            imgMicrData = s;
            return;
        }
    }




/*
    static Float access$1002(Image image, Float float1)
    {
        image.imgLatitude = float1;
        return float1;
    }

*/


/*
    static Float access$1102(Image image, Float float1)
    {
        image.imgLongitude = float1;
        return float1;
    }

*/


/*
    static Float access$1202(Image image, Float float1)
    {
        image.imgPitch = float1;
        return float1;
    }

*/


/*
    static Float access$1302(Image image, Float float1)
    {
        image.imgRoll = float1;
        return float1;
    }

*/


/*
    static QuickAnalysisFeedback access$1402(Image image, QuickAnalysisFeedback quickanalysisfeedback)
    {
        image.imgQckAnalysisFeedBck = quickanalysisfeedback;
        return quickanalysisfeedback;
    }

*/






/*
    static Bitmap access$1802(Image image, Bitmap bitmap)
    {
        image.imgBitmap = bitmap;
        return bitmap;
    }

*/



/*
    static ImageRep access$2002(Image image, ImageRep imagerep)
    {
        image.imgRep = imagerep;
        return imagerep;
    }

*/


/*
    static Integer access$202(Image image, Integer integer)
    {
        image.imgFileWidth = integer;
        return integer;
    }

*/


/*
    static Integer access$2102(Image image, Integer integer)
    {
        image.imgDPI = integer;
        return integer;
    }

*/


/*
    static Integer access$2202(Image image, Integer integer)
    {
        image.imgBitmapWidth = integer;
        return integer;
    }

*/


/*
    static Integer access$2302(Image image, Integer integer)
    {
        image.imgBitmapHeight = integer;
        return integer;
    }

*/



/*
    static Integer access$302(Image image, Integer integer)
    {
        image.imgFileHeight = integer;
        return integer;
    }

*/



/*
    static String access$502(Image image, String s)
    {
        image.imgID = s;
        return s;
    }

*/


/*
    static String access$602(Image image, String s)
    {
        image.imgSrcID = s;
        return s;
    }

*/


/*
    static String access$702(Image image, String s)
    {
        image.imgMetaData = s;
        return s;
    }

*/


/*
    static ImagePerfectionProfile access$802(Image image, ImagePerfectionProfile imageperfectionprofile)
    {
        image.imgPerfectProfileUsed = imageperfectionprofile;
        return imageperfectionprofile;
    }

*/


/*
    static BasicSettingsProfile access$902(Image image, BasicSettingsProfile basicsettingsprofile)
    {
        image.basicSettingsProfileUsed = basicsettingsprofile;
        return basicsettingsprofile;
    }

*/

    private class ImageMimeType extends Enum
    {

        private static final ImageMimeType $VALUES[];
        public static final ImageMimeType MIMETYPE_JPEG;
        public static final ImageMimeType MIMETYPE_PNG;
        public static final ImageMimeType MIMETYPE_TIFF;
        public static final ImageMimeType MIMETYPE_UNKNOWN;

        public static ImageMimeType valueOf(String s)
        {
            return (ImageMimeType)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageMimeType, s);
        }

        public static ImageMimeType[] values()
        {
            return (ImageMimeType[])$VALUES.clone();
        }

        static 
        {
            MIMETYPE_JPEG = new ImageMimeType("MIMETYPE_JPEG", 0);
            MIMETYPE_PNG = new ImageMimeType("MIMETYPE_PNG", 1);
            MIMETYPE_TIFF = new ImageMimeType("MIMETYPE_TIFF", 2);
            MIMETYPE_UNKNOWN = new ImageMimeType("MIMETYPE_UNKNOWN", 3);
            $VALUES = (new ImageMimeType[] {
                MIMETYPE_JPEG, MIMETYPE_PNG, MIMETYPE_TIFF, MIMETYPE_UNKNOWN
            });
        }

        private ImageMimeType(String s, int i)
        {
            super(s, i);
        }
    }


    private class ImageRep extends Enum
    {

        private static final ImageRep $VALUES[];
        public static final ImageRep IMAGE_REP_BITMAP;
        public static final ImageRep IMAGE_REP_BOTH;
        public static final ImageRep IMAGE_REP_FILE;
        public static final ImageRep IMAGE_REP_NONE;

        public static ImageRep valueOf(String s)
        {
            return (ImageRep)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageRep, s);
        }

        public static ImageRep[] values()
        {
            return (ImageRep[])$VALUES.clone();
        }

        static 
        {
            IMAGE_REP_NONE = new ImageRep("IMAGE_REP_NONE", 0);
            IMAGE_REP_BITMAP = new ImageRep("IMAGE_REP_BITMAP", 1);
            IMAGE_REP_FILE = new ImageRep("IMAGE_REP_FILE", 2);
            IMAGE_REP_BOTH = new ImageRep("IMAGE_REP_BOTH", 3);
            $VALUES = (new ImageRep[] {
                IMAGE_REP_NONE, IMAGE_REP_BITMAP, IMAGE_REP_FILE, IMAGE_REP_BOTH
            });
        }

        private ImageRep(String s, int i)
        {
            super(s, i);
        }
    }


    private class OutputColor extends Enum
    {

        private static final OutputColor $VALUES[];
        public static final OutputColor BITDEPTH_BITONAL;
        public static final OutputColor BITDEPTH_COLOR;
        public static final OutputColor BITDEPTH_GRAYSCALE;
        private int bitsPerChannel;
        private int bitsPerPixel;
        private int channels;

        public static OutputColor valueOf(String s)
        {
            return (OutputColor)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$OutputColor, s);
        }

        public static OutputColor[] values()
        {
            return (OutputColor[])$VALUES.clone();
        }

        public int getBitsPerChannel()
        {
            return bitsPerChannel;
        }

        public int getBitsPerPixel()
        {
            return bitsPerPixel;
        }

        public int getChannels()
        {
            return channels;
        }

        static 
        {
            BITDEPTH_BITONAL = new OutputColor("BITDEPTH_BITONAL", 0, 1, 1);
            BITDEPTH_GRAYSCALE = new OutputColor("BITDEPTH_GRAYSCALE", 1, 1, 8);
            BITDEPTH_COLOR = new OutputColor("BITDEPTH_COLOR", 2, 3, 8);
            $VALUES = (new OutputColor[] {
                BITDEPTH_BITONAL, BITDEPTH_GRAYSCALE, BITDEPTH_COLOR
            });
        }

        private OutputColor(String s, int i, int j, int k)
        {
            super(s, i);
            channels = j;
            bitsPerChannel = k;
            bitsPerPixel = channels * bitsPerChannel;
        }
    }


    private class FileIOEngine extends Enum
    {

        private static final FileIOEngine $VALUES[];
        public static final FileIOEngine FILE_ENG_ANDROID;
        public static final FileIOEngine FILE_ENG_KFIL;

        public static FileIOEngine valueOf(String s)
        {
            return (FileIOEngine)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$FileIOEngine, s);
        }

        public static FileIOEngine[] values()
        {
            return (FileIOEngine[])$VALUES.clone();
        }

        static 
        {
            FILE_ENG_KFIL = new FileIOEngine("FILE_ENG_KFIL", 0);
            FILE_ENG_ANDROID = new FileIOEngine("FILE_ENG_ANDROID", 1);
            $VALUES = (new FileIOEngine[] {
                FILE_ENG_KFIL, FILE_ENG_ANDROID
            });
        }

        private FileIOEngine(String s, int i)
        {
            super(s, i);
        }
    }


    private class ImageFileRep extends Enum
    {

        private static final ImageFileRep $VALUES[];
        public static final ImageFileRep FILE_BUFFERED;
        public static final ImageFileRep FILE_NONE;
        public static final ImageFileRep FILE_STORED;

        public static ImageFileRep valueOf(String s)
        {
            return (ImageFileRep)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$ImageFileRep, s);
        }

        public static ImageFileRep[] values()
        {
            return (ImageFileRep[])$VALUES.clone();
        }

        static 
        {
            FILE_NONE = new ImageFileRep("FILE_NONE", 0);
            FILE_STORED = new ImageFileRep("FILE_STORED", 1);
            FILE_BUFFERED = new ImageFileRep("FILE_BUFFERED", 2);
            $VALUES = (new ImageFileRep[] {
                FILE_NONE, FILE_STORED, FILE_BUFFERED
            });
        }

        private ImageFileRep(String s, int i)
        {
            super(s, i);
        }
    }


    private class BitmapDataObject
        implements Serializable
    {

        private static final long serialVersionUID = 0x23a8016e1ce622c4L;
        public byte imageByteArray[];
        final Image this$0;

        protected BitmapDataObject()
        {
            this$0 = Image.this;
            super();
        }
    }


    private class FileIODirection extends Enum
    {

        private static final FileIODirection $VALUES[];
        public static final FileIODirection FILE_IO_READ;
        public static final FileIODirection FILE_IO_WRITE;

        public static FileIODirection valueOf(String s)
        {
            return (FileIODirection)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$FileIODirection, s);
        }

        public static FileIODirection[] values()
        {
            return (FileIODirection[])$VALUES.clone();
        }

        static 
        {
            FILE_IO_READ = new FileIODirection("FILE_IO_READ", 0);
            FILE_IO_WRITE = new FileIODirection("FILE_IO_WRITE", 1);
            $VALUES = (new FileIODirection[] {
                FILE_IO_READ, FILE_IO_WRITE
            });
        }

        private FileIODirection(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[];
        static final int $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[];

        static 
        {
            $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization = new int[BitmapSerialization.values().length];
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_FILE_BUFFERED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_BITMAP_NONE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_BOTH_STORED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_BOTH_BUFFERED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_NONE_NONE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$kofax$kmc$ken$engines$data$Image$BitmapSerialization[BitmapSerialization.IMAGE_REP_FILE_STORED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo = new int[ErrorInfo.values().length];
            try
            {
                $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_GN_FILE_NOT_FOUND.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_GN_OUT_OF_MEMORY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_FILE_STILL_REMAINS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_FILE_EXISTS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$kofax$kmc$kut$utilities$error$ErrorInfo[ErrorInfo.KMC_ED_IMAGELEAK.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class BitmapSerialization extends Enum
    {

        private static final BitmapSerialization $VALUES[];
        public static final BitmapSerialization IMAGE_REP_BITMAP_NONE;
        public static final BitmapSerialization IMAGE_REP_BOTH_BUFFERED;
        public static final BitmapSerialization IMAGE_REP_BOTH_STORED;
        public static final BitmapSerialization IMAGE_REP_FILE_BUFFERED;
        public static final BitmapSerialization IMAGE_REP_FILE_STORED;
        public static final BitmapSerialization IMAGE_REP_NONE_NONE;

        public static BitmapSerialization valueOf(String s)
        {
            return (BitmapSerialization)Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$BitmapSerialization, s);
        }

        public static BitmapSerialization[] values()
        {
            return (BitmapSerialization[])$VALUES.clone();
        }

        static 
        {
            IMAGE_REP_NONE_NONE = new BitmapSerialization("IMAGE_REP_NONE_NONE", 0);
            IMAGE_REP_FILE_STORED = new BitmapSerialization("IMAGE_REP_FILE_STORED", 1);
            IMAGE_REP_FILE_BUFFERED = new BitmapSerialization("IMAGE_REP_FILE_BUFFERED", 2);
            IMAGE_REP_BITMAP_NONE = new BitmapSerialization("IMAGE_REP_BITMAP_NONE", 3);
            IMAGE_REP_BOTH_STORED = new BitmapSerialization("IMAGE_REP_BOTH_STORED", 4);
            IMAGE_REP_BOTH_BUFFERED = new BitmapSerialization("IMAGE_REP_BOTH_BUFFERED", 5);
            $VALUES = (new BitmapSerialization[] {
                IMAGE_REP_NONE_NONE, IMAGE_REP_FILE_STORED, IMAGE_REP_FILE_BUFFERED, IMAGE_REP_BITMAP_NONE, IMAGE_REP_BOTH_STORED, IMAGE_REP_BOTH_BUFFERED
            });
        }

        private BitmapSerialization(String s, int i)
        {
            super(s, i);
        }
    }


    private class KenBitmap
    {

        public Bitmap bitmap;
        public ErrorInfo errInfo;
        public Integer mDpiX;
        public Integer mDpiY;
        public int scaleFactor;

        public KenBitmap()
        {
            bitmap = null;
            mDpiX = null;
            mDpiY = null;
            scaleFactor = 1;
            errInfo = ErrorInfo.KMC_SUCCESS;
        }

        public KenBitmap(Bitmap bitmap1)
        {
            bitmap = null;
            mDpiX = null;
            mDpiY = null;
            scaleFactor = 1;
            errInfo = ErrorInfo.KMC_SUCCESS;
            bitmap = bitmap1;
        }
    }

}
