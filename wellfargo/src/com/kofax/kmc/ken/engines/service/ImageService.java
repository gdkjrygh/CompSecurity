// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Debug;
import android.os.Environment;
import android.util.Log;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.iplib.IpFileBuffer;
import com.kofax.kmc.ken.engines.iplib.IpImage;
import com.kofax.kmc.ken.engines.iplib.IpImageMetadata;
import com.kofax.kmc.ken.engines.iplib.IpLib;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.ken.engines.iplib.ProcessPageResults;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.a.a.a.b;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.ken.engines.service:
//            FileService

public class ImageService
{

    static final int a = 0;
    static final int b = 2;
    static final int c = 3;
    static final int d = 5;
    private static final String e = "ImageService";
    private static final int f = 1;
    private static final int g = 1;
    private static final int h = 200;
    private static final int i = 200;
    private static final int j = 24;
    private static final int k = 3;
    private static final int l = 72;
    private static final int m = 72;
    private static final int n = 5;
    private static UseableImageMemoryLimit o;
    private static InterimImageFileFormat p;
    public static boolean passBarcodes = false;

    public ImageService()
    {
    }

    private static int a(Context context, Uri uri, int i1, int j1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        float f1;
        float f2;
        int k1;
        try
        {
            uri = context.getContentResolver().openInputStream(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            throw new com.kofax.kmc.kut.utilities.error.FileNotFoundException(context);
        }
        context = BitmapFactory.decodeStream(uri, null, options);
        k1 = options.outHeight;
        f1 = i1 / options.outWidth;
        f2 = j1 / k1;
        try
        {
            uri.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("ImageService", "Error closing input stream", uri);
        }
        if (context != null)
        {
            context.recycle();
        }
        return (int)Math.pow(2D, Math.min(f1, f2));
    }

    private static int a(ByteBuffer bytebuffer)
    {
        short word0 = bytebuffer.getShort();
        if (bytebuffer.getInt() != 1)
        {
            throw new RuntimeException("Expected a count of 1 for the given field.");
        }
        switch (word0)
        {
        default:
            return bytebuffer.get() & 0xff;

        case 3: // '\003'
            return bytebuffer.getShort();

        case 4: // '\004'
            return bytebuffer.getInt();
        }
    }

    private static long a()
    {
        long l1;
        long l2;
        long l3;
        l3 = Runtime.getRuntime().totalMemory();
        l2 = Runtime.getRuntime().maxMemory();
        l1 = l2 / 2L;
        l3 = Math.min(l3, l1);
        com.kofax.kmc.ken.engines.service._cls1.b[o.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 63
    //                   2 70;
           goto _L1 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l1 = l3;
_L5:
        dumpHeapStats("getLargestUseableImage()");
        return l1;
_L3:
        l1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static IpImage a(Bitmap bitmap, int i1, int j1, int k1, int l1, boolean flag)
    {
        IpLib iplib = IpLib.getInstance();
        IpImage ipimage = new IpImage();
        i1 = iplib.createImage(ipimage, bitmap, i1, j1, k1, l1);
        if (flag)
        {
            bitmap.recycle();
        }
        if (i1 == -9900)
        {
            ipimage.mErrorInfo = ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL;
        } else
        {
            if (i1 == -9901)
            {
                ipimage.mErrorInfo = ErrorInfo.KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY;
                return ipimage;
            }
            if (i1 < 0)
            {
                Log.e("ImageService", (new StringBuilder()).append("Bad return code when creating an image from a bitmap. rc = ").append(i1).toString());
                throw new KmcException((ErrorInfo)IpLibUtil.ipErrHashMap.get(Integer.valueOf(i1)));
            }
        }
        return ipimage;
    }

    private static IpImage a(Bitmap bitmap, Integer integer)
    {
        return createIpImageFromBitmap(bitmap, integer, false);
    }

    private static EnhancementResults a(int i1, IpLib iplib, ProcessPageResults processpageresults, BasicSettingsProfile basicsettingsprofile, ImagePerfectionProfile imageperfectionprofile, String s, Image image, ProcessPageOutRep processpageoutrep)
    {
        if (i1 < 0)
        {
            iplib = (ErrorInfo)IpLibUtil.ipErrHashMap.get(Integer.valueOf(i1));
            iplib.setErrCause("Unable to enhance image due to IpLib error");
            iplib = new KmcException(iplib);
            Log.e("ImageService", (new StringBuilder()).append("IpLib rc=").append(i1).toString());
            Log.e("ImageService", "IpLib error", iplib);
            throw iplib;
        }
        String s1 = image.getImageID();
        Object obj = null;
        boolean flag;
        int j1;
        int k1;
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP == processpageoutrep.imageRep || processpageoutrep.isQuickAnalysisBitmapNeeded())
        {
            flag = true;
            i1 = 0;
        } else
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE == processpageoutrep.imageRep)
        {
            flag = false;
            i1 = 1;
        } else
        if (com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH == processpageoutrep.imageRep)
        {
            flag = true;
            i1 = 1;
        } else
        {
            flag = false;
            i1 = 0;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        dumpHeapStats("createEnhancementResults()");
        s = iplib.createBitmap(processpageresults.processedImg);
        Log.d("ImageService", (new StringBuilder()).append("Enhanced bitmap height -> ").append(s.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("Enhanced bitmap width -> ").append(s.getWidth()).toString());
        Log.d("ImageService", (new StringBuilder()).append("Enhanced bitmap row bytes -> ").append(s.getRowBytes()).toString());
        Log.d("ImageService", (new StringBuilder()).append("Enhanced bitmap total bytes -> ").append(s.getRowBytes() * s.getHeight()).toString());
_L3:
        obj = s;
        if (s == null)
        {
            iplib = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
            iplib.setErrCause("Out of memory error creating bitmap from processed image.");
            throw new KmcException(iplib);
        }
        break; /* Loop/switch isn't completed */
        obj;
        s = null;
_L8:
        Log.e("ImageService", "Out of memory error creating bitmap from processed image. Saving the Bitmap to a temp file and re-loading it as a scaled image.", ((Throwable) (obj)));
        if (true) goto _L3; else goto _L2
_L2:
        j1 = processpageresults.processedImg.getDpiX();
        k1 = processpageresults.processedImg.getBitDepth();
        iplib.releaseImage(processpageresults.processedImg);
        processpageresults.processedImg = null;
        s = new Image();
        if (i1 != 0)
        {
            s = new Image(processpageoutrep.processedFilePathStr, processpageoutrep.imageMimeType);
        }
        s.getClass();
        iplib = new com.kofax.kmc.ken.engines.data.Image.FriendI(s, "com.kofax");
        if (flag)
        {
            ((Bitmap) (obj)).setDensity(j1);
            iplib.setImageBitmap(((Bitmap) (obj)));
        }
        if (imageperfectionprofile != null)
        {
            iplib.setImagePerfectProfileUsed(imageperfectionprofile);
        } else
        {
            iplib.setBasicSettingsProfileUsed(basicsettingsprofile);
        }
        s.setImageDPI(j1);
        iplib.setImageSrcID(s1);
        iplib.setImageMetaData(processpageresults.resultStr);
        iplib.setImageLatitude(image.getImageLatitude());
        iplib.setImageLongitude(image.getImageLongitude());
        iplib = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_COLOR;
        if (1 != k1) goto _L5; else goto _L4
_L4:
        iplib = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_BITONAL;
_L7:
        s.setImageOutputColor(iplib);
        return new EnhancementResults(s, image);
_L5:
        if (8 == k1)
        {
            iplib = com.kofax.kmc.ken.engines.data.Image.OutputColor.BITDEPTH_GRAYSCALE;
        }
        if (true) goto _L7; else goto _L6
_L6:
        obj;
          goto _L8
    }

    private static EnhancementResults a(Bitmap bitmap, BasicSettingsProfile basicsettingsprofile, ImagePerfectionProfile imageperfectionprofile, Image image, int i1, ProcessPageOutRep processpageoutrep, com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient processingprogressclient)
    {
        a(bitmap);
        IpLib iplib = IpLib.getInstance();
        bitmap = a(bitmap, image.getImageDPI());
        ProcessPageResults processpageresults = new ProcessPageResults();
        Log.d("ImageService", (new StringBuilder()).append("inImg width ------> ").append(bitmap.getWidth()).toString());
        Log.d("ImageService", (new StringBuilder()).append("inImg height ------> ").append(bitmap.getHeight()).toString());
        a a1 = a(basicsettingsprofile, imageperfectionprofile, image);
        String s = a.a(a1);
        processpageresults.resultStr = com.kofax.kmc.ken.engines.service.a.b(a1);
        dumpHeapStats("enhanceImage(before processPage)");
        i1 = iplib.processPage(processpageresults, bitmap, s, processpageoutrep, i1, processingprogressclient, processpageoutrep);
        a(i1, processpageresults);
        iplib.releaseImage(bitmap);
        dumpHeapStats("enhanceImage(after processPage)");
        return a(i1, iplib, processpageresults, basicsettingsprofile, imageperfectionprofile, s, image, processpageoutrep);
    }

    private static ImageDimension a(InputStream inputstream)
    {
        ByteBuffer bytebuffer;
        byte byte0;
        byte byte1;
        int j1;
        int k1;
        int l1;
        int i2;
        byte1 = -1;
        ReadableByteChannel readablebytechannel = Channels.newChannel(inputstream);
        bytebuffer = ByteBuffer.allocate(12);
        a(readablebytechannel, bytebuffer, 8);
        int i1 = bytebuffer.get();
        if (i1 != bytebuffer.get() || i1 != 73 && i1 != 77)
        {
            throw new com.kofax.kmc.kut.utilities.error.IOException("Not a tiff file.");
        }
        ByteOrder byteorder;
        if (i1 == 73)
        {
            byteorder = ByteOrder.LITTLE_ENDIAN;
        } else
        {
            byteorder = ByteOrder.BIG_ENDIAN;
        }
        bytebuffer.order(byteorder);
        if (bytebuffer.getShort() != 42)
        {
            throw new com.kofax.kmc.kut.utilities.error.IOException("Not a tiff file.");
        }
        try
        {
            inputstream.skip(bytebuffer.getInt() - 8);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            throw new com.kofax.kmc.kut.utilities.error.IOException(inputstream);
        }
        a(readablebytechannel, bytebuffer, 2);
        i1 = bytebuffer.getShort();
        byte0 = -1;
        k1 = -1;
        if (i1 <= 0 || byte0 >= 0 && byte1 >= 0 && k1 >= 0)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        a(readablebytechannel, bytebuffer, 12);
        j1 = k1;
        l1 = byte1;
        i2 = byte0;
        bytebuffer.getShort();
        JVM INSTR tableswitch 256 259: default 208
    //                   256 255
    //                   257 272
    //                   258 220
    //                   259 289;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        i2 = byte0;
        l1 = byte1;
        j1 = k1;
_L8:
        i1--;
        k1 = j1;
        byte1 = l1;
        byte0 = i2;
        if (true) goto _L7; else goto _L6
_L7:
        break MISSING_BLOCK_LABEL_136;
_L6:
        i2 = a(bytebuffer);
        j1 = k1;
        l1 = byte1;
        continue; /* Loop/switch isn't completed */
_L3:
        l1 = a(bytebuffer);
        j1 = k1;
        i2 = byte0;
        if (true) goto _L8; else goto _L5
_L5:
        k1 = a(bytebuffer);
        j1 = k1;
        l1 = byte1;
        i2 = byte0;
        if (k1 != 5) goto _L8; else goto _L9
_L9:
        throw new com.kofax.kmc.kut.utilities.error.IOException("Unsupported tiff compression type - LZW");
        return new ImageDimension(byte0, byte1);
    }

    private static a a(BasicSettingsProfile basicsettingsprofile, ImagePerfectionProfile imageperfectionprofile, Image image)
    {
        String s1;
        a a1;
        a1 = new a(null);
        s1 = "";
        if (basicsettingsprofile == null && imageperfectionprofile == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_IP_NO_PROFILE);
        }
        if (imageperfectionprofile == null) goto _L2; else goto _L1
_L1:
        String s;
        imageperfectionprofile.getClass();
        imageperfectionprofile = (new com.kofax.kmc.ken.engines.data.ImagePerfectionProfile.FriendIPP(imageperfectionprofile, "com.kofax")).toFinalOpString();
        s = s1;
_L4:
        basicsettingsprofile = imageperfectionprofile;
        if (passBarcodes)
        {
            basicsettingsprofile = (new StringBuilder()).append(imageperfectionprofile).append(a(image)).toString();
        }
        a.a(a1, basicsettingsprofile);
        com.kofax.kmc.ken.engines.service.a.b(a1, s);
        return a1;
_L2:
        String s2;
        basicsettingsprofile.getClass();
        s2 = (new com.kofax.kmc.ken.engines.data.BasicSettingsProfile.FriendBSP(basicsettingsprofile, "com.kofax")).toFinalOpString();
        s = s1;
        imageperfectionprofile = s2;
        if (basicsettingsprofile.getCropType() != com.kofax.kmc.ken.engines.data.BasicSettingsProfile.CropType.CROP_QUICKANALYSIS)
        {
            continue; /* Loop/switch isn't completed */
        }
        basicsettingsprofile = image.getImageQuickAnalysisFeedBack();
        s = s1;
        imageperfectionprofile = s2;
        if (basicsettingsprofile == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        basicsettingsprofile.getClass();
        s = (new com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback.FriendQAF(basicsettingsprofile, "com.kofax")).getMetadata();
        imageperfectionprofile = s2;
        continue; /* Loop/switch isn't completed */
        basicsettingsprofile;
        basicsettingsprofile.printStackTrace();
        s = s1;
        imageperfectionprofile = s2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Image image)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        image = image.getImageBarCodes();
        if (image != null)
        {
            for (int i1 = 0; i1 < image.size(); i1++)
            {
                BarCodeResult barcoderesult = (BarCodeResult)image.get(i1);
                stringbuilder.append("_ExternalBarcodeFront_");
                BoundingTetragon boundingtetragon = barcoderesult.getBoundingBox();
                stringbuilder.append(boundingtetragon.getTopLeft().x);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getTopLeft().y);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getTopRight().x);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getTopRight().y);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getBottomLeft().x);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getBottomLeft().y);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getBottomRight().x);
                stringbuilder.append(",");
                stringbuilder.append(boundingtetragon.getBottomRight().y);
                stringbuilder.append(",");
                stringbuilder.append(barcoderesult.getType());
                stringbuilder.append(",");
                stringbuilder.append(barcoderesult.getDirection());
                stringbuilder.append(",");
                stringbuilder.append(BarCodeDataFormat.ASCII);
                stringbuilder.append(",");
                stringbuilder.append(i1);
            }

        }
        return stringbuilder.toString();
    }

    private static JSONObject a(IpImage ipimage)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("width", ipimage.getWidth());
            jsonobject.put("height", ipimage.getHeight());
            jsonobject.put("channels", ipimage.getChannels());
            jsonobject.put("bitDepth", ipimage.getBitDepth());
            jsonobject.put("dpiX", ipimage.getDpiX());
            jsonobject.put("dpiY", ipimage.getDpiY());
        }
        // Misplaced declaration of an exception variable
        catch (IpImage ipimage)
        {
            Log.e("IpImage", "Error creating JSON", ipimage);
            return jsonobject;
        }
        return jsonobject;
    }

    private static void a(int i1, ProcessPageResults processpageresults)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("resultCode", i1);
            jsonobject.put("resultStr", processpageresults.resultStr);
            jsonobject.put("processedImage", a(processpageresults.processedImg));
        }
        // Misplaced declaration of an exception variable
        catch (ProcessPageResults processpageresults)
        {
            Log.e("ImageService", "Error creating JSON for ProcessPageResults", processpageresults);
        }
        Log.d("ImageService", (new StringBuilder()).append("ProcessPageResults -> ").append(jsonobject.toString()).toString());
    }

    private static void a(Bitmap bitmap)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("height", bitmap.getHeight());
            jsonobject.put("width", bitmap.getWidth());
            jsonobject.put("density", bitmap.getDensity());
            jsonobject.put("rowBytes", bitmap.getRowBytes());
            jsonobject.put("totalBytes", bitmap.getRowBytes() * bitmap.getHeight());
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", "Error creating JSON for Bitmap", bitmap);
        }
        Log.d("ImageService", (new StringBuilder()).append("Bitmap -> ").append(jsonobject.toString()).toString());
    }

    private static void a(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer, int i1)
    {
        bytebuffer.position(0);
        bytebuffer.limit(i1);
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                break;
            }
            try
            {
                readablebytechannel.read(bytebuffer);
            }
            // Misplaced declaration of an exception variable
            catch (ReadableByteChannel readablebytechannel)
            {
                readablebytechannel.printStackTrace();
                throw new com.kofax.kmc.kut.utilities.error.IOException(readablebytechannel);
            }
        } while (true);
        bytebuffer.flip();
    }

    private static boolean a(String s)
    {
        return org.a.a.a.b.d(s, ".png");
    }

    private static boolean b(String s)
    {
        return org.a.a.a.b.d(s, ".tif") || org.a.a.a.b.d(s, ".tiff");
    }

    private static boolean c(String s)
    {
        return org.a.a.a.b.d(s, ".jpg") || org.a.a.a.b.d(s, ".jpeg");
    }

    public static void cancelImageProcessing()
    {
        try
        {
            IpLib.getInstance().cancelProcessing();
            return;
        }
        catch (KmcException kmcexception)
        {
            kmcexception.printStackTrace();
        }
    }

    public static ErrorInfo clearFileBufferUsingIp(IpFileBuffer ipfilebuffer)
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        if (IpLib.getInstance().releaseFileBuffer(ipfilebuffer) != 0)
        {
            throw new InternalError("clearFileBufferUsingIp: releaseFileBuffer failed");
        } else
        {
            return errorinfo;
        }
    }

    public static void copyImageToExternalStorage(File file)
    {
        File file1;
        File file2;
        Object obj;
        FileChannel filechannel;
        File file3;
        filechannel = null;
        file2 = null;
        obj = null;
        file1 = null;
        file3 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append(file.getName()).toString());
        file3.createNewFile();
        file = (new FileInputStream(file)).getChannel();
        file2 = file;
        file1 = file2;
        file = filechannel;
        filechannel = (new FileOutputStream(file3)).getChannel();
        file1 = file2;
        file = filechannel;
        obj = filechannel;
        file2.transferTo(0L, file2.size(), filechannel);
        file1 = file2;
        file = filechannel;
        obj = filechannel;
        Log.i("ImageService", (new StringBuilder()).append("copyImageToExternalStorage(), successfully moved image to external storage Path: ").append(file3.getAbsolutePath()).toString());
        if (file2 != null)
        {
            try
            {
                file2.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                throw new com.kofax.kmc.kut.utilities.error.IOException(file);
            }
        }
        if (filechannel == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        filechannel.close();
        return;
        IOException ioexception;
        ioexception;
        file2 = null;
        obj = file1;
_L4:
        file1 = file2;
        file = ((File) (obj));
        ioexception.printStackTrace();
        file1 = file2;
        file = ((File) (obj));
        throw new com.kofax.kmc.kut.utilities.error.IOException(ioexception);
        Exception exception;
        exception;
        file2 = file;
        file = exception;
_L2:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
                throw new com.kofax.kmc.kut.utilities.error.IOException(file);
            }
        }
        if (file2 == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        file2.close();
        throw file;
        file;
        file1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static File copyToTempImage(Context context, File file, String s)
    {
        context = new File((new StringBuilder()).append(FileService.getLocalPath(context)).append(File.separator).append(s).toString());
        boolean flag;
        try
        {
            flag = FileService.copyFile(file, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            throw new com.kofax.kmc.kut.utilities.error.IOException(context);
        }
        if (flag)
        {
            return context;
        } else
        {
            return null;
        }
    }

    public static String createGPSMetadata(Image image)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        String s1;
        int i1;
        if (image.getImageLatitude().floatValue() < 0.0F)
        {
            s = "S";
        } else
        {
            s = "N";
        }
        if (image.getImageLongitude().floatValue() < 0.0F)
        {
            s1 = "W";
        } else
        {
            s1 = "E";
        }
        stringbuilder.append("GPS Latitude Reference: ");
        stringbuilder.append(s);
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append("GPS Latitude: ");
        i1 = image.getImageLatitude().intValue();
        stringbuilder.append(Integer.toString(i1));
        stringbuilder.append("/1, ");
        stringbuilder.append(Integer.toString(Float.valueOf(Float.valueOf((image.getImageLatitude().floatValue() - (float)i1) * 100F).floatValue() * 60F).intValue()));
        stringbuilder.append("/100, 0/1");
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append("GPS Longitude Reference: ");
        stringbuilder.append(s1);
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append("GPS Longitude: ");
        i1 = image.getImageLongitude().intValue();
        stringbuilder.append(Integer.toString(i1));
        stringbuilder.append("/1, ");
        stringbuilder.append(Integer.toString(Float.valueOf(Float.valueOf((image.getImageLongitude().floatValue() - (float)i1) * 100F).floatValue() * 60F).intValue()));
        stringbuilder.append("/100, 0/1");
        stringbuilder.append(System.getProperty("line.separator"));
        return stringbuilder.toString();
    }

    public static IpImage createIpImageFromBitmap(Bitmap bitmap, Integer integer, boolean flag)
    {
        char c2 = '\310';
        int j1 = 1;
        char c1;
        int i1;
        int k1;
        int l1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 3;
        }
        if (!flag)
        {
            j1 = 24;
        }
        if (flag)
        {
            c1 = '\310';
        } else
        {
            c1 = 'H';
        }
        if (!flag)
        {
            c2 = 'H';
        }
        l1 = c1;
        k1 = c2;
        if (integer != null)
        {
            l1 = c1;
            k1 = c2;
            if (integer.intValue() > 0)
            {
                k1 = integer.intValue();
                l1 = k1;
            }
        }
        return a(bitmap, i1, j1, l1, k1, false);
    }

    public static Bitmap createScaledBitmap(Bitmap bitmap, boolean flag)
    {
        long l2 = a();
        long l3 = bitmap.getRowBytes() * bitmap.getHeight();
        Log.d("ImageService", "Creating scaled bitmap...");
        Log.d("ImageService", (new StringBuilder()).append("... original bitmap size -> ").append(l3).toString());
        Bitmap bitmap1 = bitmap;
        if (l3 <= l2)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        dumpHeapStats("createScaledBitmap - preScale");
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        float f1 = (float)l2 / (float)l3;
        int k1 = (int)((float)i1 * f1);
        int l1 = (int)((float)j1 * f1);
        Log.d("ImageService", (new StringBuilder()).append("... scaling bitmap with factor of ").append(f1).toString());
        bitmap1 = bitmap;
        Bitmap bitmap2;
        try
        {
            bitmap2 = Bitmap.createScaledBitmap(bitmap, k1, l1, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", "Got OOM while trying to create scaled bitmap", bitmap);
            Log.e("ImageService", (new StringBuilder()).append("... largestImageSize -> ").append(l2).toString());
            Log.e("ImageService", (new StringBuilder()).append("... bmSize -> ").append(l3).toString());
            Log.e("ImageService", (new StringBuilder()).append("... orgHeight -> ").append(j1).append(", orgWidth -> ").append(i1).toString());
            Log.e("ImageService", (new StringBuilder()).append("... height -> ").append(l1).append(", width -> ").append(k1).toString());
            return bitmap1;
        }
        bitmap1 = bitmap;
        Log.d("ImageService", (new StringBuilder()).append("... new bitmap size -> ").append(bitmap2.getRowBytes() * bitmap2.getHeight()).toString());
        bitmap1 = bitmap;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        bitmap1 = bitmap;
        Log.d("ImageService", "... recyling old bitmap");
        bitmap1 = bitmap;
        bitmap.recycle();
        bitmap1 = null;
        dumpHeapStats("createScaledBitmap - postScale");
        bitmap1 = bitmap2;
        return bitmap1;
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap createScaledBitmapFromBitmapWithMatrix(Bitmap bitmap, float f1)
    {
        com.kofax.kmc.ken.engines.data.Image.KenBitmap kenbitmap = new com.kofax.kmc.ken.engines.data.Image.KenBitmap();
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        int k1 = Math.round((float)i1 * f1);
        int l1 = Math.round((float)j1 * f1);
        Matrix matrix = new Matrix();
        matrix.postScale(f1, f1);
        try
        {
            kenbitmap.bitmap = Bitmap.createBitmap(bitmap, 0, 0, i1, j1, matrix, true);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", (new StringBuilder()).append("OOM while creating preview bitmap. width -> ").append(k1).append(", height -> ").append(l1).toString(), bitmap);
            bitmap = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
            bitmap.setErrCause("Out of memory error creating scaled bitmap from original bitmap with matrix.");
            kenbitmap.errInfo = bitmap;
            return kenbitmap;
        }
        return kenbitmap;
    }

    public static File createTempImageFile(Context context, String s)
    {
        context = new File(FileService.getLocalPath(context));
        context.mkdir();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("mmddyy-hhMMss");
        return new File(context, (new StringBuilder()).append(simpledateformat.format(new Date())).append(".").append(s).toString());
    }

    public static ErrorInfo deleteImage(File file)
    {
        if (file.exists())
        {
            Log.d("ImageService", (new StringBuilder()).append("Deleting image from '").append(file).append("'").toString());
            if (file.delete())
            {
                return ErrorInfo.KMC_SUCCESS;
            } else
            {
                return ErrorInfo.KMC_ED_FILE_STILL_REMAINS;
            }
        } else
        {
            return ErrorInfo.KMC_GN_FILE_NOT_FOUND;
        }
    }

    public static String dumpBitmapSize(Bitmap bitmap, String s)
    {
        if (bitmap == null || bitmap.isRecycled())
        {
            return "Unable to calculate size";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append((new StringBuilder()).append("Dumping bitmap data from ").append(s).append(": ").toString());
            stringbuilder.append((new StringBuilder()).append("Height -> ").append(bitmap.getHeight()).toString());
            stringbuilder.append((new StringBuilder()).append(", Width -> ").append(bitmap.getWidth()).toString());
            stringbuilder.append((new StringBuilder()).append(", Density -> ").append(bitmap.getDensity()).toString());
            stringbuilder.append((new StringBuilder()).append(", Size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
            return stringbuilder.toString();
        }
    }

    public static void dumpHeapStats(String s)
    {
        Log.d("ImageService", "*** [START] Dumping heap stats ***");
        Log.d("ImageService", (new StringBuilder()).append("--- msg -> ").append(s).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size -> ").append(Debug.getNativeHeapSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size (free) -> ").append(Debug.getNativeHeapFreeSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- native heap size (allocated) -> ").append(Debug.getNativeHeapAllocatedSize()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- totalMemory -> ").append(Runtime.getRuntime().totalMemory()).toString());
        Log.d("ImageService", (new StringBuilder()).append("--- maxMemory -> ").append(Runtime.getRuntime().maxMemory()).toString());
        Log.d("ImageService", "*** [END] Dumping heap stats ***");
    }

    public static EnhancementResults enhanceImage(Bitmap bitmap, BasicSettingsProfile basicsettingsprofile, ImagePerfectionProfile imageperfectionprofile, Image image, int i1, ProcessPageOutRep processpageoutrep, com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient processingprogressclient)
    {
        return a(bitmap, basicsettingsprofile, imageperfectionprofile, image, i1, processpageoutrep, processingprogressclient);
    }

    public static EnhancementResults enhanceImage(Bitmap bitmap, BasicSettingsProfile basicsettingsprofile, ImagePerfectionProfile imageperfectionprofile, Image image, ProcessPageOutRep processpageoutrep, com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient processingprogressclient)
    {
        return a(bitmap, basicsettingsprofile, imageperfectionprofile, image, 10240, processpageoutrep, processingprogressclient);
    }

    public static ImageDimension getImageDimension(String s)
    {
        if (!a(s) && !b(s) && !c(s))
        {
            throw new com.kofax.kmc.kut.utilities.error.IOException("File format not supported");
        }
        if (b(s))
        {
            try
            {
                s = new FileInputStream(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                throw new com.kofax.kmc.kut.utilities.error.FileNotFoundException(s);
            }
            return a(s);
        } else
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, options);
            return new ImageDimension(options.outWidth, options.outHeight);
        }
    }

    public static InterimImageFileFormat getInterimImageFileFormat()
    {
        return p;
    }

    public static String[] getProcessedTempFilenames(Activity activity, boolean flag)
    {
        String as[] = new String[2];
        if (flag)
        {
            as[0] = "temp_proc";
            as[1] = "temp_proc_thmb";
            return as;
        } else
        {
            as[0] = (new File((new StringBuilder()).append(FileService.getLocalPath(activity)).append(File.separator).append("temp_proc").toString())).getAbsolutePath();
            as[1] = (new File((new StringBuilder()).append(FileService.getLocalPath(activity)).append(File.separator).append("temp_proc_thmb").toString())).getAbsolutePath();
            return as;
        }
    }

    public static String[] getRawTempFilenames(Activity activity, boolean flag)
    {
        String as[] = new String[2];
        if (flag)
        {
            as[0] = "temp_raw";
            as[1] = "temp_raw_thmb";
            return as;
        } else
        {
            as[0] = (new File((new StringBuilder()).append(FileService.getLocalPath(activity)).append(File.separator).append("temp_raw").toString())).getAbsolutePath();
            as[1] = (new File((new StringBuilder()).append(FileService.getLocalPath(activity)).append(File.separator).append("temp_raw_thmb").toString())).getAbsolutePath();
            return as;
        }
    }

    public static UseableImageMemoryLimit getUseableImageMemoryLimits()
    {
        return o;
    }

    public static int imgMimeTypetoIpFileType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype)
    {
        if (com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG == imagemimetype)
        {
            return 2;
        }
        if (com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_PNG == imagemimetype)
        {
            return 5;
        }
        if (com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF == imagemimetype)
        {
            return 3;
        }
        if (imagemimetype == null || com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN == imagemimetype)
        {
            return 0;
        } else
        {
            throw new InternalError("ProcessPageOutRep: unable to recognize imageMimeType");
        }
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap loadBitmapFromFile(String s, int i1, boolean flag)
    {
        return loadBitmapFromURI(Uri.fromFile(new File(s)), i1, -1L, flag);
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap loadBitmapFromFileBuffer(IpFileBuffer ipfilebuffer)
    {
        com.kofax.kmc.ken.engines.data.Image.KenBitmap kenbitmap = new com.kofax.kmc.ken.engines.data.Image.KenBitmap();
        ipfilebuffer = ipfilebuffer.mByteBuffer;
        if (ipfilebuffer.capacity() <= 0)
        {
            throw new InternalError("loadBitmapFromFileBuffer: fileBuffer has no capacity");
        }
        byte abyte0[] = new byte[ipfilebuffer.capacity()];
        ipfilebuffer.get(abyte0);
        kenbitmap.bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        if (kenbitmap.bitmap == null)
        {
            kenbitmap.errInfo = ErrorInfo.KMC_ED_BUFFERED_READ_FAILED;
        }
        return kenbitmap;
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap loadBitmapFromURI(Uri uri, int i1, long l1, boolean flag)
    {
        com.kofax.kmc.ken.engines.data.Image.KenBitmap kenbitmap;
        Object obj;
        Bitmap bitmap;
        Object obj3;
        Object obj1 = null;
        Log.d("ImageService", (new StringBuilder()).append("Loading bitmap from uri '").append(uri).append("' at scale ").append(i1).append(" with a largest image size of ").append(l1).toString());
        kenbitmap = new com.kofax.kmc.ken.engines.data.Image.KenBitmap();
        try
        {
            obj = AppContextProvider.getContext();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e("ImageService", "Error loading file", uri);
            kenbitmap.errInfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
            kenbitmap.errInfo.setErrCause(uri.getMessage());
            return kenbitmap;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Context) (obj)).getContentResolver().openInputStream(uri);
_L11:
        bitmap = obj1;
        obj3 = new android.graphics.BitmapFactory.Options();
        bitmap = obj1;
        obj3.inPurgeable = true;
        if (i1 <= 1)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        bitmap = obj1;
        obj3.inSampleSize = i1;
        bitmap = obj1;
        obj3 = BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        bitmap = ((Bitmap) (obj3));
        kenbitmap.errInfo = ErrorInfo.KMC_ED_BITMAP_READ_FROM_FILE_FAILED;
_L7:
        Object obj2;
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ImageService", "Error closing input stream", ((Throwable) (obj)));
        }
        obj = kenbitmap;
        if (l1 > 0L)
        {
            obj = kenbitmap;
            if ((long)(((Bitmap) (obj3)).getRowBytes() * ((Bitmap) (obj3)).getHeight()) > l1)
            {
                if (obj3 != null)
                {
                    ((Bitmap) (obj3)).recycle();
                }
                obj = loadBitmapFromURI(uri, i1 * 2, l1, flag);
            }
        }
        return ((com.kofax.kmc.ken.engines.data.Image.KenBitmap) (obj));
_L2:
        kenbitmap.errInfo = ErrorInfo.KMC_GN_BAD_APPLICATION_CONTEXT;
        obj = null;
        continue; /* Loop/switch isn't completed */
_L4:
        bitmap = ((Bitmap) (obj3));
        kenbitmap.bitmap = ((Bitmap) (obj3));
        bitmap = ((Bitmap) (obj3));
        kenbitmap.scaleFactor = i1;
        if (i1 <= 1) goto _L6; else goto _L5
_L5:
        bitmap = ((Bitmap) (obj3));
        obj2 = ErrorInfo.KMC_ED_IMAGE_IS_SCALED;
_L8:
        bitmap = ((Bitmap) (obj3));
        kenbitmap.errInfo = ((ErrorInfo) (obj2));
        bitmap = ((Bitmap) (obj3));
        Log.d("ImageService", (new StringBuilder()).append("bm width=").append(((Bitmap) (obj3)).getWidth()).toString());
        bitmap = ((Bitmap) (obj3));
        Log.d("ImageService", (new StringBuilder()).append("bm height=").append(((Bitmap) (obj3)).getHeight()).toString());
          goto _L7
        obj2;
        Log.e("ImageService", (new StringBuilder()).append("OOM while loading a bitmap at scale ").append(i1).toString());
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        bitmap.recycle();
        kenbitmap.errInfo = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        uri = loadBitmapFromURI(uri, i1 * 2, l1, flag);
_L9:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (Exception exception)
        {
            Log.e("ImageService", "Error closing input stream", exception);
        }
        return uri;
_L6:
        bitmap = ((Bitmap) (obj3));
        obj2 = ErrorInfo.KMC_SUCCESS;
          goto _L8
        uri = kenbitmap;
          goto _L9
        uri;
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (Exception exception1)
        {
            Log.e("ImageService", "Error closing input stream", exception1);
        }
        throw uri;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static Bitmap loadScaledBitmap(Context context, Uri uri, int i1, int j1, int k1)
    {
        long l2;
        long l3;
        l3 = a();
        Object obj = FileService.getFileNameByUri(uri, context);
        l2 = -1L;
        if (!org.a.a.a.b.a(((CharSequence) (obj))))
        {
            obj = new File(((String) (obj)));
            Log.d("ImageService", "Getting file size...");
            Log.d("ImageService", (new StringBuilder()).append("... file -> ").append(obj).toString());
            l2 = ((File) (obj)).length();
        }
        if (l2 > 0L) goto _L2; else goto _L1
_L1:
        int l1 = a(context, uri, i1, j1);
          goto _L3
_L2:
        if (l2 <= l3) goto _L5; else goto _L4
_L4:
        double d1 = Math.pow(2D, Math.min(l3, l2));
        l1 = (int)d1;
          goto _L3
_L14:
        Object obj2;
        obj2 = new android.graphics.BitmapFactory.Options();
        obj2.inPurgeable = true;
        if (l1 <= 1)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj2.inSampleSize = l1;
        InputStream inputstream = context.getContentResolver().openInputStream(uri);
        Object obj1 = inputstream;
        obj2 = BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj2)));
        uri = ((Uri) (obj2));
        context = uri;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("ImageService", "Error closing input stream", context);
                return uri;
            }
            context = uri;
        }
_L7:
        return context;
        obj1;
        l1 = 1;
        inputstream = null;
_L12:
        obj1 = inputstream;
        Log.e("ImageService", (new StringBuilder()).append("Encountered OOM while trying to load scaled bitmap. Increasing minimum scale to ").append(l1).toString());
        if (true)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj1 = inputstream;
        throw new NullPointerException();
        obj1 = inputstream;
        uri = loadScaledBitmap(context, uri, i1, j1, l1);
        context = uri;
        if (inputstream == null) goto _L7; else goto _L6
_L6:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("ImageService", "Error closing input stream", context);
            return uri;
        }
        return uri;
        context;
        inputstream = null;
_L11:
        obj1 = inputstream;
        Log.e("ImageService", "Error decoding image", context);
        OutOfMemoryError outofmemoryerror;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("ImageService", "Error closing input stream", context);
                return null;
            }
            return null;
        } else
        {
            return null;
        }
        context;
        obj1 = null;
_L9:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Log.e("ImageService", "Error closing input stream", uri);
            }
        }
        throw context;
        context;
        if (true) goto _L9; else goto _L8
_L8:
        context;
        if (true) goto _L11; else goto _L10
_L10:
        outofmemoryerror;
        inputstream = null;
          goto _L12
        outofmemoryerror;
          goto _L12
_L5:
        l1 = 1;
_L3:
        while (l1 <= k1) 
        {
            l1 *= 2;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap readBitmapFromFileBufferUsingIp(IpFileBuffer ipfilebuffer, float f1)
    {
        com.kofax.kmc.ken.engines.data.Image.KenBitmap kenbitmap = new com.kofax.kmc.ken.engines.data.Image.KenBitmap();
        IpLib iplib;
        IpImage ipimage;
        iplib = IpLib.getInstance();
        ipimage = new IpImage();
        ipfilebuffer = Integer.valueOf(iplib.readImageFromFileBuffer(ipimage, f1, ipfilebuffer));
        if (ipfilebuffer.intValue() == 0) goto _L2; else goto _L1
_L1:
        kenbitmap.errInfo = (ErrorInfo)IpLibUtil.ipErrHashMap.get(ipfilebuffer);
_L4:
        return kenbitmap;
_L2:
        try
        {
            kenbitmap.bitmap = iplib.createBitmap(ipimage);
        }
        // Misplaced declaration of an exception variable
        catch (IpFileBuffer ipfilebuffer)
        {
            try
            {
                Log.e("ImageService", "OOM while creating bitmap.", ipfilebuffer);
                ipfilebuffer = ErrorInfo.KMC_GN_OUT_OF_MEMORY;
                ipfilebuffer.setErrCause("Out of memory error reading bitmap from file buffer");
                kenbitmap.errInfo = ipfilebuffer;
            }
            // Misplaced declaration of an exception variable
            catch (IpFileBuffer ipfilebuffer)
            {
                kenbitmap.errInfo = ipfilebuffer.getErrorInfo();
                ipfilebuffer.printStackTrace();
                return kenbitmap;
            }
        }
        if (kenbitmap.errInfo != ErrorInfo.KMC_SUCCESS) goto _L4; else goto _L3
_L3:
        kenbitmap.mDpiX = Integer.valueOf(ipimage.mDpiX);
        kenbitmap.mDpiY = Integer.valueOf(ipimage.mDpiY);
        iplib.releaseImage(ipimage);
        return kenbitmap;
    }

    public static com.kofax.kmc.ken.engines.data.Image.KenBitmap readBitmapFromFileUsingIp(String s, float f1, IpImageMetadata ipimagemetadata)
    {
        com.kofax.kmc.ken.engines.data.Image.KenBitmap kenbitmap = new com.kofax.kmc.ken.engines.data.Image.KenBitmap();
        IpLib iplib;
        IpImage ipimage;
        iplib = IpLib.getInstance();
        ipimage = new IpImage();
        s = Integer.valueOf(iplib.readImageFile(ipimage, s, f1, ipimagemetadata));
        if (s.intValue() == 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        kenbitmap.errInfo = (ErrorInfo)IpLibUtil.ipErrHashMap.get(s);
        return kenbitmap;
        try
        {
            kenbitmap.bitmap = iplib.createBitmap(ipimage);
            kenbitmap.mDpiX = Integer.valueOf(ipimage.mDpiX);
            kenbitmap.mDpiY = Integer.valueOf(ipimage.mDpiY);
            iplib.releaseImage(ipimage);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            kenbitmap.errInfo = s.getErrorInfo();
            s.printStackTrace();
            return kenbitmap;
        }
        return kenbitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, boolean flag, boolean flag1)
    {
        Object obj;
        Object obj1;
        Log.d("ImageService", "About to scale bitmap. Source information before scaling: ");
        Log.d("ImageService", (new StringBuilder()).append("... size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... height -> ").append(bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... width -> ").append(bitmap.getWidth()).toString());
        if (flag1)
        {
            bitmap = createScaledBitmap(bitmap, true);
        }
        obj = new Matrix();
        float f1;
        if (flag)
        {
            f1 = 90F;
        } else
        {
            f1 = -90F;
        }
        ((Matrix) (obj)).postRotate(f1);
        obj1 = null;
        dumpHeapStats("rotateImage - preRotate");
        Log.d("ImageService", "About to rotate bitmap. Source information: ");
        Log.d("ImageService", (new StringBuilder()).append("... size -> ").append(bitmap.getRowBytes() * bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... height -> ").append(bitmap.getHeight()).toString());
        Log.d("ImageService", (new StringBuilder()).append("... width -> ").append(bitmap.getWidth()).toString());
        obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), false);
        Log.d("ImageService", (new StringBuilder()).append("... rotated bitmap size -> ").append(((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight()).toString());
        bitmap.recycle();
_L2:
        return ((Bitmap) (obj));
        obj1;
        obj = null;
_L5:
        Log.e("ImageService", "Error rotating bitmap", ((Throwable) (obj1)));
        obj1 = obj;
_L3:
        obj = bitmap;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Bitmap) (obj1)).recycle();
        return bitmap;
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
_L4:
        Log.e("ImageService", "Error rotating bitmap", ((Throwable) (obj1)));
        obj1 = obj;
          goto _L3
        obj1;
          goto _L4
        obj1;
          goto _L5
    }

    public static Bitmap rotateImage(byte abyte0[], boolean flag, boolean flag1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        dumpHeapStats("rotateImage - preDecode");
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        dumpHeapStats("rotateImage - postDecode");
        return rotateBitmap(abyte0, flag, flag1);
    }

    public static ErrorInfo saveBitmap(Bitmap bitmap, String s, com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype, int i1)
    {
        android.graphics.Bitmap.CompressFormat compressformat;
        ErrorInfo errorinfo;
        Log.d("ImageService", (new StringBuilder()).append("Saving a bitmap to ").append(s).toString());
        errorinfo = ErrorInfo.KMC_SUCCESS;
        if (imagemimetype == com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG)
        {
            compressformat = android.graphics.Bitmap.CompressFormat.JPEG;
        } else
        {
            compressformat = android.graphics.Bitmap.CompressFormat.PNG;
        }
        if (imagemimetype != com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF && imagemimetype != com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN) goto _L2; else goto _L1
_L1:
        bitmap = ErrorInfo.KMC_ED_MIMETYPE;
        bitmap.setErrCause("saveBitmap method supports MIMETYPE_JPG, MIMETYPE_PNG only");
_L4:
        return bitmap;
_L2:
        if (!(new File(s)).exists())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        imagemimetype = ErrorInfo.KMC_ED_FILE_EXISTS;
        imagemimetype.setErrCause((new StringBuilder()).append("saveBitmap failed: file ").append(s).append(" already exists.").toString());
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                Log.e("ImageService", "Error flushing streams", bitmap);
            }
            break MISSING_BLOCK_LABEL_163;
        }
        bitmap = imagemimetype;
        if (true) goto _L4; else goto _L3
_L3:
        throw new NullPointerException();
        return imagemimetype;
        imagemimetype = new FileOutputStream(s);
        Object obj1 = new BufferedOutputStream(imagemimetype);
        com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype1;
        Object obj;
        obj = obj1;
        imagemimetype1 = imagemimetype;
        if (bitmap.compress(compressformat, i1, ((java.io.OutputStream) (obj1))))
        {
            break MISSING_BLOCK_LABEL_529;
        }
        obj = obj1;
        imagemimetype1 = imagemimetype;
        bitmap = ErrorInfo.KMC_ED_BITMAP_WRITE_TO_FILE_FAILED;
        obj = obj1;
        imagemimetype1 = imagemimetype;
        bitmap.setErrCause((new StringBuilder()).append("bitmap.compress failed: file ").append(s).append(", quality=").append(i1).toString());
        s = bitmap;
_L10:
        if (obj1 != null)
        {
            try
            {
                ((BufferedOutputStream) (obj1)).flush();
                ((BufferedOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                Log.e("ImageService", "Error flushing streams", bitmap);
                return s;
            }
        }
        bitmap = s;
        if (imagemimetype == null) goto _L4; else goto _L5
_L5:
        imagemimetype.flush();
        imagemimetype.close();
        return s;
        Exception exception;
        exception;
        bitmap = null;
        imagemimetype = null;
_L9:
        obj = bitmap;
        imagemimetype1 = imagemimetype;
        Log.e("ImageService", (new StringBuilder()).append("Error saving image - ").append(s).toString(), exception);
        obj = bitmap;
        imagemimetype1 = imagemimetype;
        obj1 = ErrorInfo.KMC_ED_BITMAP_WRITE_TO_FILE_FAILED;
        obj = bitmap;
        imagemimetype1 = imagemimetype;
        ((ErrorInfo) (obj1)).setErrCause((new StringBuilder()).append("bitmap.compress exception: file ").append(s).append(", quality=").append(i1).append(", exception info: ").append(exception.getMessage()).toString());
        if (bitmap != null)
        {
            try
            {
                bitmap.flush();
                bitmap.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                Log.e("ImageService", "Error flushing streams", bitmap);
                return ((ErrorInfo) (obj1));
            }
        }
        bitmap = ((Bitmap) (obj1));
        if (imagemimetype == null) goto _L4; else goto _L6
_L6:
        imagemimetype.flush();
        imagemimetype.close();
        return ((ErrorInfo) (obj1));
        bitmap;
        obj = null;
        imagemimetype = null;
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        ((BufferedOutputStream) (obj)).flush();
        ((BufferedOutputStream) (obj)).close();
        if (imagemimetype != null)
        {
            try
            {
                imagemimetype.flush();
                imagemimetype.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("ImageService", "Error flushing streams", s);
            }
        }
        throw bitmap;
        bitmap;
        obj = null;
        continue; /* Loop/switch isn't completed */
        bitmap;
        imagemimetype = imagemimetype1;
        if (true) goto _L8; else goto _L7
_L7:
        exception;
        bitmap = null;
          goto _L9
        exception;
        bitmap = ((Bitmap) (obj1));
          goto _L9
        s = errorinfo;
          goto _L10
    }

    public static ErrorInfo saveIpBitmap(Bitmap bitmap, int i1, IpFileBuffer ipfilebuffer)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj4;
        ErrorInfo errorinfo;
        ErrorInfo errorinfo1;
        byte byte0;
        int j1;
        obj1 = null;
        obj4 = null;
        obj2 = null;
        obj = null;
        Log.d("ImageService", "Saving a bitmap using image processor to FileBuffer");
        errorinfo1 = ErrorInfo.KMC_SUCCESS;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        j1 = ipfilebuffer.mBitDepth;
        if (j1 == 24)
        {
            byte0 = 3;
        } else
        {
            byte0 = 1;
        }
        if (bitmap == null)
        {
            bitmap = new StringBuilder("saveIpBitmapToFileBuffer: ");
            bitmap.append("bitmap is null");
            throw new NullPointerException(bitmap.toString());
        }
        Object obj3 = IpLib.getInstance();
        obj = obj3;
        obj1 = a(bitmap, byte0, j1, i1, i1, false);
        obj4 = obj1;
        obj2 = obj1;
        obj3 = ((IpImage) (obj1)).mErrorInfo;
        obj4 = obj1;
        i1 = ((IpLib) (obj)).writeImageToFileBuffer(((IpImage) (obj1)), ipfilebuffer);
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        obj4 = obj1;
        bitmap = (ErrorInfo)IpLibUtil.ipErrHashMap.get(Integer.valueOf(i1));
        obj4 = obj1;
        bitmap.setErrCause("saveIpBitmap: writeImageToFileBuffer returned error");
_L8:
        if (obj1 != null)
        {
            ((IpLib) (obj)).releaseImage(((IpImage) (obj1)));
            obj1 = obj3;
            obj2 = bitmap;
        } else
        {
            obj1 = obj3;
            obj2 = bitmap;
        }
_L3:
        bitmap = ((Bitmap) (obj2));
        if (obj2 == ErrorInfo.KMC_SUCCESS)
        {
            bitmap = ((Bitmap) (obj2));
            if (obj1 != null)
            {
                bitmap = ((Bitmap) (obj1));
            }
        }
        ipfilebuffer = bitmap;
        if (bitmap == ErrorInfo.KMC_EV_MEMORY)
        {
            ipfilebuffer = ErrorInfo.KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE;
        }
        return ipfilebuffer;
        obj3;
        obj1 = null;
        ipfilebuffer = errorinfo;
        bitmap = ((Bitmap) (obj));
        obj = obj1;
_L6:
        ((KmcException) (obj3)).printStackTrace();
        obj3 = ((KmcException) (obj3)).getErrorInfo();
        obj1 = ipfilebuffer;
        obj2 = obj3;
        if (bitmap != null)
        {
            ((IpLib) (obj)).releaseImage(bitmap);
            obj1 = ipfilebuffer;
            obj2 = obj3;
        }
          goto _L3
        ipfilebuffer;
        obj = null;
        bitmap = ((Bitmap) (obj1));
_L5:
        if (bitmap != null)
        {
            ((IpLib) (obj)).releaseImage(bitmap);
        }
        throw ipfilebuffer;
        ipfilebuffer;
        bitmap = ((Bitmap) (obj4));
        continue; /* Loop/switch isn't completed */
        ipfilebuffer;
        if (true) goto _L5; else goto _L4
_L4:
        obj3;
        ipfilebuffer = errorinfo;
        bitmap = ((Bitmap) (obj2));
          goto _L6
        bitmap;
        ipfilebuffer = ((IpFileBuffer) (obj3));
        obj3 = bitmap;
        bitmap = ((Bitmap) (obj1));
          goto _L6
_L2:
        bitmap = errorinfo1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static ErrorInfo saveIpBitmap(Bitmap bitmap, String s, com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype, int i1, int j1, int k1, String s1)
    {
        Object obj;
        ErrorInfo errorinfo;
        ErrorInfo errorinfo2;
        byte byte0;
        Log.d("ImageService", (new StringBuilder()).append("Saving a bitmap using image processor to ").append(s).toString());
        errorinfo2 = ErrorInfo.KMC_SUCCESS;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        if (i1 == 24)
        {
            byte0 = 3;
        } else
        {
            byte0 = 1;
        }
        if (bitmap == null || s == null)
        {
            s = new StringBuilder("saveIpBitmap: ");
            if (bitmap == null)
            {
                bitmap = "bitmap is null";
            } else
            {
                bitmap = "filename is null";
            }
            s.append(bitmap);
            throw new NullPointerException(s.toString());
        }
        obj = null;
        Object obj1 = IpLib.getInstance();
        obj = obj1;
        obj1 = a(bitmap, byte0, i1, j1, j1, false);
        ErrorInfo errorinfo1 = ((IpImage) (obj1)).mErrorInfo;
        _cls1.a[imagemimetype.ordinal()];
        JVM INSTR tableswitch 1 3: default 445
    //                   1 253
    //                   2 272
    //                   3 289;
           goto _L1 _L2 _L3 _L4
_L1:
        bitmap = ErrorInfo.KMC_ED_MIMETYPE;
        bitmap.setErrCause("saveIpBitmap method does not support MIMETYPE_UNKNOWN");
        i1 = 0;
_L7:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        bitmap = (ErrorInfo)IpLibUtil.ipErrHashMap.get(Integer.valueOf(i1));
        bitmap.setErrCause("saveIpBitmap write to file returned error");
_L6:
        if (obj1 != null)
        {
            ((IpLib) (obj)).releaseImage(((IpImage) (obj1)));
            s1 = errorinfo1;
            obj = bitmap;
        } else
        {
            s1 = errorinfo1;
            obj = bitmap;
        }
_L8:
        bitmap = ((Bitmap) (obj));
        if (obj == ErrorInfo.KMC_SUCCESS)
        {
            bitmap = ((Bitmap) (obj));
            if (s1 != null)
            {
                bitmap = s1;
            }
        }
        return bitmap;
_L2:
        i1 = ((IpLib) (obj)).writeJpegImage(((IpImage) (obj1)), k1, s, s1);
        bitmap = errorinfo2;
          goto _L7
_L3:
        i1 = ((IpLib) (obj)).writeTiffImage(((IpImage) (obj1)), k1, s);
        bitmap = errorinfo2;
          goto _L7
_L4:
        i1 = ((IpLib) (obj)).writePngImage(((IpImage) (obj1)), s);
        bitmap = errorinfo2;
          goto _L7
        s1;
        imagemimetype = null;
        bitmap = errorinfo;
        s = ((String) (obj));
_L11:
        s1.printStackTrace();
        obj1 = s1.getErrorInfo();
        s1 = bitmap;
        obj = obj1;
        if (imagemimetype != null)
        {
            s.releaseImage(imagemimetype);
            s1 = bitmap;
            obj = obj1;
        }
          goto _L8
        bitmap;
        obj = null;
        obj1 = null;
_L10:
        if (obj1 != null)
        {
            ((IpLib) (obj)).releaseImage(((IpImage) (obj1)));
        }
        throw bitmap;
        bitmap;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        bitmap;
        continue; /* Loop/switch isn't completed */
        bitmap;
        obj1 = imagemimetype;
        obj = s;
        if (true) goto _L10; else goto _L9
_L9:
        s1;
        s = ((String) (obj));
        imagemimetype = null;
        bitmap = errorinfo;
          goto _L11
        s1;
        imagemimetype = ((com.kofax.kmc.ken.engines.data.Image.ImageMimeType) (obj1));
        s = ((String) (obj));
        bitmap = errorinfo;
          goto _L11
        s1;
        imagemimetype = ((com.kofax.kmc.ken.engines.data.Image.ImageMimeType) (obj1));
        s = ((String) (obj));
        bitmap = errorinfo1;
          goto _L11
    }

    public static File saveIpJPG(Context context, IpLib iplib, IpImage ipimage)
    {
        context = createTempImageFile(context, "jpg");
        Log.d("ImageService", (new StringBuilder()).append("Using image processor to save a jpg to ").append(context.getAbsolutePath()).toString());
        int i1 = iplib.writeJpegImage(ipimage, 90, context.getAbsolutePath());
        Log.d("ImageService", (new StringBuilder()).append("Result code -> ").append(i1).toString());
        return context;
    }

    public static File saveIpPNG(Context context, IpLib iplib, IpImage ipimage, File file)
    {
        int i1;
        if (file == null)
        {
            file = createTempImageFile(context, "png");
        }
        Log.d("ImageService", (new StringBuilder()).append("Using image processor to save a png to ").append(file.getAbsolutePath()).toString());
        i1 = iplib.writePngImage(ipimage, file.getAbsolutePath());
        Log.d("ImageService", (new StringBuilder()).append("Result code -> ").append(i1).toString());
        return file;
    }

    public static File saveToGallery(Bitmap bitmap)
    {
        File file = new File(Environment.getExternalStorageDirectory(), "KofaxMobileCapture");
        file.mkdir();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("mmddyy-hhMMss");
        file = new File(file, (new StringBuilder()).append(simpledateformat.format(new Date())).append(".png").toString());
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileoutputstream);
            fileoutputstream.flush();
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            Log.e("ImageService", "Error saving image to gallery", bitmap);
            return null;
        }
        return file;
    }

    public static void setInterimImageFileFormat(InterimImageFileFormat interimimagefileformat)
    {
        p = interimimagefileformat;
    }

    public static void setUseableImageMemoryLimits(UseableImageMemoryLimit useableimagememorylimit)
    {
        o = useableimagememorylimit;
    }

    static 
    {
        o = UseableImageMemoryLimit.NORMAL;
        p = InterimImageFileFormat.PNG;
    }

    private class _cls1
    {

        static final int a[];
        static final int b[];

        static 
        {
            b = new int[UseableImageMemoryLimit.values().length];
            try
            {
                b[UseableImageMemoryLimit.LARGE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                b[UseableImageMemoryLimit.MAXIMUM.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                b[UseableImageMemoryLimit.NORMAL.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            a = new int[com.kofax.kmc.ken.engines.data.Image.ImageMimeType.values().length];
            try
            {
                a[com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_PNG.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class UseableImageMemoryLimit extends Enum
    {

        public static final UseableImageMemoryLimit LARGE;
        public static final UseableImageMemoryLimit MAXIMUM;
        public static final UseableImageMemoryLimit NORMAL;
        private static final UseableImageMemoryLimit a[];

        public static UseableImageMemoryLimit valueOf(String s)
        {
            return (UseableImageMemoryLimit)Enum.valueOf(com/kofax/kmc/ken/engines/service/ImageService$UseableImageMemoryLimit, s);
        }

        public static UseableImageMemoryLimit[] values()
        {
            return (UseableImageMemoryLimit[])a.clone();
        }

        static 
        {
            NORMAL = new UseableImageMemoryLimit("NORMAL", 0);
            LARGE = new UseableImageMemoryLimit("LARGE", 1);
            MAXIMUM = new UseableImageMemoryLimit("MAXIMUM", 2);
            a = (new UseableImageMemoryLimit[] {
                NORMAL, LARGE, MAXIMUM
            });
        }

        private UseableImageMemoryLimit(String s, int i1)
        {
            super(s, i1);
        }
    }


    private class EnhancementResults
    {

        public ErrorInfo errorInfo;
        public Image image;
        public Image originalImage;

        public EnhancementResults(Image image1, Image image2)
        {
            errorInfo = ErrorInfo.KMC_SUCCESS;
            image = image1;
            originalImage = image2;
        }

        public EnhancementResults(ErrorInfo errorinfo)
        {
            errorInfo = errorinfo;
        }
    }


    private class a
    {

        private String a;
        private String b;

        static String a(a a1)
        {
            return a1.a;
        }

        static String a(a a1, String s)
        {
            a1.a = s;
            return s;
        }

        static String b(a a1)
        {
            return a1.b;
        }

        static String b(a a1, String s)
        {
            a1.b = s;
            return s;
        }

        private a()
        {
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ImageDimension
    {

        private int a;
        private int b;

        public int getHeight()
        {
            return b;
        }

        public int getWidth()
        {
            return a;
        }

        public void setHeight(int i1)
        {
            b = i1;
        }

        public void setWidth(int i1)
        {
            a = i1;
        }

        public ImageDimension(int i1, int j1)
        {
            a = i1;
            b = j1;
        }
    }


    private class InterimImageFileFormat extends Enum
    {

        public static final InterimImageFileFormat JPEG;
        public static final InterimImageFileFormat PNG;
        private static final InterimImageFileFormat a[];

        public static InterimImageFileFormat valueOf(String s)
        {
            return (InterimImageFileFormat)Enum.valueOf(com/kofax/kmc/ken/engines/service/ImageService$InterimImageFileFormat, s);
        }

        public static InterimImageFileFormat[] values()
        {
            return (InterimImageFileFormat[])a.clone();
        }

        static 
        {
            PNG = new InterimImageFileFormat("PNG", 0);
            JPEG = new InterimImageFileFormat("JPEG", 1);
            a = (new InterimImageFileFormat[] {
                PNG, JPEG
            });
        }

        private InterimImageFileFormat(String s, int i1)
        {
            super(s, i1);
        }
    }

}
