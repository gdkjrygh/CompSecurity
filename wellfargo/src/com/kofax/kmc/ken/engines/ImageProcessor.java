// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.util.Log;
import com.kofax.kmc.ken.engines.appstats.AppStatsImageProcessorData;
import com.kofax.kmc.ken.engines.appstats.ImageProcessorAppStatsClient;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.async.ListenerCallbackThreadType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.a.a.a.b;

public class ImageProcessor
{

    private static final String a = "ImageProcessor";
    private static ImageProcessorAppStatsClient b;
    private static volatile long p;
    private AppStatsImageProcessorData c;
    private ImagePerfectionProfile d;
    private BasicSettingsProfile e;
    private com.kofax.kmc.ken.engines.data.Image.ImageRep f;
    private String g;
    private com.kofax.kmc.ken.engines.data.Image.ImageMimeType h;
    private int i;
    private ListenerCallbackThreadType j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private TaskRunner o;
    private boolean q;

    public ImageProcessor()
    {
        c = null;
        f = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP;
        h = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN;
        i = 90;
        j = ListenerCallbackThreadType.UI_THREAD;
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        b();
    }

    private ImageProcessor(boolean flag)
    {
        c = null;
        f = com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP;
        h = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN;
        i = 90;
        j = ListenerCallbackThreadType.UI_THREAD;
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
    }

    ImageProcessor(boolean flag, _cls1 _pcls1)
    {
        this(flag);
    }

    static long a()
    {
        return p;
    }

    static long a(long l1)
    {
        p = l1;
        return l1;
    }

    private a a(Image image)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        ErrorInfo errorinfo1;
        boolean flag;
        if (image.getImageBitmapScaling().floatValue() < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (p != 0L)
        {
            errorinfo = ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY;
            flag1 = flag2;
        } else
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP)
        {
            if (flag)
            {
                errorinfo = ErrorInfo.KMC_IP_NO_REPRESENTATION;
                errorinfo.setErrCause("Only representation is bitmap but it is scaled down");
                flag1 = flag2;
            } else
            {
                flag1 = true;
            }
        } else
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
        {
            if (image.getImageFileRep() == com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED)
            {
                errorinfo = ErrorInfo.KMC_IP_FILE_AND_BUFFERED_REPRESENTATION;
                flag1 = flag2;
            } else
            {
                flag1 = flag2;
            }
        } else
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH)
        {
            if (flag)
            {
                flag1 = false;
            }
        } else
        {
            errorinfo = ErrorInfo.KMC_IP_NO_REPRESENTATION;
            flag1 = flag2;
        }
        errorinfo1 = errorinfo;
        if (errorinfo == ErrorInfo.KMC_SUCCESS)
        {
            if (flag1)
            {
                errorinfo1 = errorinfo;
                if (image.getImageBitmap() == null)
                {
                    errorinfo1 = ErrorInfo.KMC_ED_NOIMAGE;
                    errorinfo1.setErrCause("imageBitmap field is null");
                }
            } else
            {
                image = image.getImageFilePath();
                if (image == null)
                {
                    errorinfo1 = ErrorInfo.KMC_ED_FILEPATH;
                    errorinfo1.setErrCause("imageFilePath field is null");
                } else
                {
                    errorinfo1 = errorinfo;
                    if (!(new File(image)).exists())
                    {
                        errorinfo1 = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                    }
                }
            }
        }
        return new a(errorinfo1, flag1);
    }

    private ProcessPageOutRep a(boolean flag, boolean flag1)
    {
        ProcessPageOutRep processpageoutrep = new ProcessPageOutRep();
        processpageoutrep.setQuickAnalysisMode(flag, flag1);
        if (getListenerCallbackThreadType() == ListenerCallbackThreadType.WORKER_THREAD)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        processpageoutrep.callbackOnWorkerThread = flag1;
        if (!flag)
        {
            processpageoutrep.setImageMimeType(getProcessedImageMimeType());
            processpageoutrep.setImageRep(getProcessedImageRepresentation());
            processpageoutrep.processedFilePathStr = getProcessedImageFilePath();
            processpageoutrep.processedImageJpegQuality = getProcessedImageJpegQuality();
        }
        return processpageoutrep;
    }

    static String a(ImageProcessor imageprocessor, Image image)
    {
        return imageprocessor.b(image);
    }

    private void a(Image image, boolean flag, boolean flag1)
    {
        Object obj;
        a a1;
label0:
        {
            obj = ErrorInfo.KMC_SUCCESS;
            a1 = a(image);
            ErrorInfo errorinfo1 = a1.a;
            obj = errorinfo1;
            if (flag)
            {
                break label0;
            }
            ErrorInfo errorinfo = errorinfo1;
            if (ErrorInfo.KMC_SUCCESS == errorinfo1)
            {
                errorinfo = errorinfo1;
                if (e == null)
                {
                    errorinfo = errorinfo1;
                    if (d == null)
                    {
                        errorinfo = ErrorInfo.KMC_IP_NO_PROFILE;
                    }
                }
            }
            obj = errorinfo;
            if (ErrorInfo.KMC_SUCCESS != errorinfo)
            {
                break label0;
            }
            if (f != com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
            {
                obj = errorinfo;
                if (f != com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH)
                {
                    break label0;
                }
            }
            if (h == com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_UNKNOWN)
            {
                obj = ErrorInfo.KMC_ED_MIMETYPE;
                ((ErrorInfo) (obj)).setErrCause("processedImageMimeType set to MIMETYPE_UNKNOWN");
            } else
            if (org.a.a.a.b.b(g))
            {
                obj = ErrorInfo.KMC_ED_FILEPATH;
                ((ErrorInfo) (obj)).setErrCause("processedImageFilePath field is whitespace, empty, or null");
            } else
            {
                File file = new File(g);
                if (file.getParentFile() == null || !file.getParentFile().exists())
                {
                    obj = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                    ((ErrorInfo) (obj)).setErrCause("File path is incorrect");
                } else
                if (!file.getParentFile().exists())
                {
                    obj = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                    ((ErrorInfo) (obj)).setErrCause((new StringBuilder()).append("processedImageFilePath parent directory").append(file.getParent()).append(" does not exist").toString());
                } else
                {
                    obj = errorinfo;
                    if (file.exists())
                    {
                        obj = ErrorInfo.KMC_ED_FILE_EXISTS;
                        ((ErrorInfo) (obj)).setErrCause((new StringBuilder()).append("processedImageFilePath ").append(file.getAbsolutePath()).append(" already exists").toString());
                    }
                }
            }
        }
        if (obj != ErrorInfo.KMC_SUCCESS)
        {
            if (a(((ErrorInfo) (obj))))
            {
                throw new KmcException(((ErrorInfo) (obj)));
            } else
            {
                throw new KmcRuntimeException(((ErrorInfo) (obj)));
            }
        }
        if (c != null)
        {
            b.logAppStats(AppStatsEventIDType.APP_STATS_IMG_PROCESSING_START_EVENT, c);
        }
        obj = new c(null);
        if (flag)
        {
            obj.a = null;
            Object obj1 = new ImagePerfectionProfile();
            TaskRunner taskrunner;
            if (flag1)
            {
                ((ImagePerfectionProfile) (obj1)).setIpOperations("_DoPreview_");
            } else
            {
                ((ImagePerfectionProfile) (obj1)).setIpOperations("_DoPreview_");
            }
            obj.b = ((ImagePerfectionProfile) (obj1));
        } else
        {
            obj.a = getBasicSettingsProfile();
            obj.b = getImagePerfectionProfile();
        }
        obj.c = image;
        obj.d = a1.b;
        obj.e = a(flag, flag1);
        if (flag)
        {
            image = new QaProgressClient();
        } else
        {
            image = new IpProgressClient();
        }
        obj.f = image;
        image = c();
        obj1 = new d(null);
        d.a(((d) (obj1)), this);
        d.a(((d) (obj1)), ((c) (obj)).e);
        taskrunner = o;
        if (j == ListenerCallbackThreadType.UI_THREAD)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        taskrunner.addOnTaskCompletedListener(((com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedListener) (obj1)), ((Callable) (obj)), flag);
        p = image.submit(((Callable) (obj)));
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

    static boolean a(ImageProcessor imageprocessor)
    {
        return imageprocessor.q;
    }

    private boolean a(ErrorInfo errorinfo)
    {
        switch (_cls1.a[errorinfo.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return true;
        }
    }

    private String b(Image image)
    {
        String s1 = "";
        String s;
        if (!image.getImageMetaData().isEmpty())
        {
            s = image.getImageMetaData();
        } else
        {
            s = s1;
            if (image.getImageLatitude() != null)
            {
                s = s1;
                if (image.getImageLongitude() != null)
                {
                    return ImageService.createGPSMetadata(image);
                }
            }
        }
        return s;
    }

    private void b()
    {
        if (IpLibUtil.isIpLicensed())
        {
            b = new ImageProcessorAppStatsClient(AppStatsInstanceType.INST_TYPE_IMAGE_PROCESSOR);
            return;
        } else
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
        }
    }

    private TaskRunner c()
    {
        if (o == null)
        {
            o = new TaskRunner(1);
        }
        return o;
    }

    public static ImageProcessor getInstance()
    {
        ImageProcessor imageprocessor = b.a;
        imageprocessor.b();
        return imageprocessor;
    }

    void a(ErrorInfo errorinfo, Image image)
    {
        if (c != null)
        {
            Iterator iterator;
            if (e != null)
            {
                try
                {
                    Object obj = e;
                    obj.getClass();
                    obj = new com.kofax.kmc.ken.engines.data.BasicSettingsProfile.FriendBSP(((BasicSettingsProfile) (obj)), "com.kofax");
                    c.setProfile(((com.kofax.kmc.ken.engines.data.BasicSettingsProfile.FriendBSP) (obj)).toFinalOpString());
                }
                catch (KmcException kmcexception)
                {
                    kmcexception.printStackTrace();
                }
            }
            if (d != null)
            {
                try
                {
                    Object obj1 = d;
                    obj1.getClass();
                    obj1 = new com.kofax.kmc.ken.engines.data.ImagePerfectionProfile.FriendIPP(((ImagePerfectionProfile) (obj1)), "com.kofax");
                    c.setProfile(((com.kofax.kmc.ken.engines.data.ImagePerfectionProfile.FriendIPP) (obj1)).toFinalOpString());
                }
                catch (KmcException kmcexception1)
                {
                    kmcexception1.printStackTrace();
                }
            }
            c.setResultCode(errorinfo.getErr());
            if (image != null)
            {
                c.setProcesedID(image.getImageID());
                c.setImageSize((int)image.getImageSize());
            }
            b.logAppStats(AppStatsEventIDType.APP_STATS_IMG_PROCESSING_STOP_EVENT, c);
            c = null;
        }
        for (iterator = k.iterator(); iterator.hasNext(); ((ImageOutListener)iterator.next()).imageOut(new ImageOutEvent(this, errorinfo, image))) { }
    }

    void a(ErrorInfo errorinfo, String s, int i1)
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((ProcessProgressListener)iterator.next()).processProgress(new ProcessProgressEvent(this, errorinfo, s, i1))) { }
    }

    public void addAnalysisCompleteEventListener(AnalysisCompleteListener analysiscompletelistener)
    {
        m.add(analysiscompletelistener);
    }

    public void addAnalysisProgressEventListener(AnalysisProgressListener analysisprogresslistener)
    {
        n.add(analysisprogresslistener);
    }

    public void addImageOutEventListener(ImageOutListener imageoutlistener)
    {
        if (imageoutlistener == null)
        {
            throw new NullPointerException("addImageOutEventListener: listener parameter is null");
        }
        if (!k.contains(imageoutlistener))
        {
            k.add(imageoutlistener);
        }
    }

    public void addProcessProgressEventListener(ProcessProgressListener processprogresslistener)
    {
        l.add(processprogresslistener);
    }

    void b(ErrorInfo errorinfo, Image image)
    {
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((AnalysisCompleteListener)iterator.next()).analysisComplete(new AnalysisCompleteEvent(this, errorinfo, image))) { }
    }

    void b(ErrorInfo errorinfo, String s, int i1)
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext(); ((AnalysisProgressListener)iterator.next()).analysisProgress(new AnalysisProgressEvent(this, errorinfo, s, i1))) { }
    }

    public void cancel()
    {
        Log.i("ImageProcessor", "cancelCalledExternalApi");
        ImageService.cancelImageProcessing();
    }

    public void doQuickAnalysis(Image image, boolean flag)
    {
        a(image, "image");
        q = flag;
        a(image, true, flag);
    }

    public BasicSettingsProfile getBasicSettingsProfile()
    {
        BasicSettingsProfile basicsettingsprofile = null;
        if (e != null)
        {
            basicsettingsprofile = e.clone();
        }
        return basicsettingsprofile;
    }

    public ImagePerfectionProfile getImagePerfectionProfile()
    {
        ImagePerfectionProfile imageperfectionprofile = null;
        if (d != null)
        {
            imageperfectionprofile = d.clone();
        }
        return imageperfectionprofile;
    }

    public ListenerCallbackThreadType getListenerCallbackThreadType()
    {
        return j;
    }

    public String getProcessedImageFilePath()
    {
        return g;
    }

    public int getProcessedImageJpegQuality()
    {
        return i;
    }

    public com.kofax.kmc.ken.engines.data.Image.ImageMimeType getProcessedImageMimeType()
    {
        return h;
    }

    public com.kofax.kmc.ken.engines.data.Image.ImageRep getProcessedImageRepresentation()
    {
        return f;
    }

    public void processImage(Image image)
    {
        a(image, "image");
        c = new AppStatsImageProcessorData();
        c.setSourceImageID(image.getImageID());
        a(image, false, false);
    }

    public void removeAnalysisCompleteEventListener(AnalysisCompleteListener analysiscompletelistener)
    {
        m.remove(analysiscompletelistener);
    }

    public void removeAnalysisProgressEventListener(AnalysisProgressListener analysisprogresslistener)
    {
        n.remove(analysisprogresslistener);
    }

    public void removeImageOutEventListener(ImageOutListener imageoutlistener)
    {
        k.remove(imageoutlistener);
    }

    public void removeProcessProgressEventListener(ProcessProgressListener processprogresslistener)
    {
        l.remove(processprogresslistener);
    }

    public void setBasicSettingsProfile(BasicSettingsProfile basicsettingsprofile)
    {
        BasicSettingsProfile basicsettingsprofile1 = basicsettingsprofile;
        if (basicsettingsprofile != null)
        {
            basicsettingsprofile1 = basicsettingsprofile.clone();
        }
        e = basicsettingsprofile1;
    }

    public void setImagePerfectionProfile(ImagePerfectionProfile imageperfectionprofile)
    {
        ImagePerfectionProfile imageperfectionprofile1 = imageperfectionprofile;
        if (imageperfectionprofile != null)
        {
            imageperfectionprofile1 = imageperfectionprofile.clone();
        }
        d = imageperfectionprofile1;
    }

    public void setListenerCallbackThreadType(ListenerCallbackThreadType listenercallbackthreadtype)
    {
        j = listenercallbackthreadtype;
    }

    public void setProcessedImageFilePath(String s)
    {
        g = s;
    }

    public void setProcessedImageJpegQuality(int i1)
    {
        if (i1 < 1 || i1 > 100)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_JPEG_QUALITY_VALUE);
        } else
        {
            i = i1;
            return;
        }
    }

    public void setProcessedImageMimeType(com.kofax.kmc.ken.engines.data.Image.ImageMimeType imagemimetype)
    {
        h = imagemimetype;
    }

    public void setProcessedImageRepresentation(com.kofax.kmc.ken.engines.data.Image.ImageRep imagerep)
    {
        f = imagerep;
    }

    private class a
    {

        public ErrorInfo a;
        public boolean b;
        final ImageProcessor c;

        public a(ErrorInfo errorinfo, boolean flag)
        {
            c = ImageProcessor.this;
            super();
            a = ErrorInfo.KMC_SUCCESS;
            b = false;
            a = errorinfo;
            b = flag;
        }
    }


    private class c
        implements Callable
    {

        public BasicSettingsProfile a;
        public ImagePerfectionProfile b;
        public Image c;
        public boolean d;
        public ProcessPageOutRep e;
        public com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient f;
        final ImageProcessor g;

        public com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults a()
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
                obj2 = new com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults(((ErrorInfo) (obj1)));
            }
            return ((com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults) (obj2));
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

        private c()
        {
            g = ImageProcessor.this;
            super();
            a = null;
            b = null;
            c = null;
            d = false;
            f = null;
        }

        c(_cls1 _pcls1)
        {
            this();
        }
    }


    private class QaProgressClient
        implements com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient
    {

        final ImageProcessor a;

        public void handleIpProgressUpdate(int i1, Object obj)
        {
            obj = (ProcessPageOutRep)obj;
            Handler handler = new Handler(Looper.getMainLooper());
            if (((ProcessPageOutRep) (obj)).callbackOnWorkerThread)
            {
                a.b(ErrorInfo.KMC_SUCCESS, ((ProcessPageOutRep) (obj)).imageID, i1);
                return;
            } else
            {
                class _cls1
                    implements Runnable
                {

                    final ProcessPageOutRep a;
                    final int b;
                    final QaProgressClient c;

                    public void run()
                    {
                        c.a.b(ErrorInfo.KMC_SUCCESS, a.imageID, b);
                    }

                _cls1(ProcessPageOutRep processpageoutrep, int i1)
                {
                    c = QaProgressClient.this;
                    a = processpageoutrep;
                    b = i1;
                    super();
                }
                }

                handler.post(new _cls1(((ProcessPageOutRep) (obj)), i1));
                return;
            }
        }

        public QaProgressClient()
        {
            a = ImageProcessor.this;
            super();
        }
    }


    private class d
        implements com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedListener
    {

        final ImageProcessor a;
        private ImageProcessor b;
        private ProcessPageOutRep c;

        static ImageProcessor a(d d1, ImageProcessor imageprocessor)
        {
            d1.b = imageprocessor;
            return imageprocessor;
        }

        static ProcessPageOutRep a(d d1, ProcessPageOutRep processpageoutrep)
        {
            d1.c = processpageoutrep;
            return processpageoutrep;
        }

        public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedEvent taskcompletedevent)
        {
            Object obj;
            com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults enhancementresults;
            Object obj1 = null;
            long l1 = taskcompletedevent.getTaskID();
            Log.i("ImageProcessor", (new StringBuilder()).append("Task ").append(l1).append(" completed.").toString());
            obj = taskcompletedevent.getTaskError();
            QuickAnalysisFeedback quickanalysisfeedback;
            if (obj == ErrorInfo.KMC_SUCCESS)
            {
                Log.i("ImageProcessor", "No Task Error. Good.");
                if (ImageProcessor.a() != l1)
                {
                    Log.i("ImageProcessor", (new StringBuilder()).append("Unexpected: Task ").append(ImageProcessor.a()).append(" was running.").toString());
                }
            } else
            {
                Log.i("ImageProcessor", (new StringBuilder()).append("Task Error: ").append(((ErrorInfo) (obj)).toString()).toString());
            }
            ImageProcessor.a(0L);
            enhancementresults = (com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults)taskcompletedevent.getTaskReturnValue();
            if (!c.isQuickAnalysisEnabled()) goto _L2; else goto _L1
_L1:
            if (obj != ErrorInfo.KMC_SUCCESS || enhancementresults.image == null) goto _L4; else goto _L3
_L3:
            quickanalysisfeedback = new QuickAnalysisFeedback();
            obj = enhancementresults.image.getImageMetaData();
            quickanalysisfeedback.getClass();
            taskcompletedevent = new com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback.FriendQAF(quickanalysisfeedback, "com.kofax");
            taskcompletedevent.setMetadata(((String) (obj)));
_L5:
            obj = obj1;
            if (ImageProcessor.a(a))
            {
                obj = enhancementresults.image.getImageBitmap();
            }
            taskcompletedevent.setViewBoundariesImage(((android.graphics.Bitmap) (obj)));
            try
            {
                taskcompletedevent = enhancementresults.originalImage;
                taskcompletedevent.getClass();
                taskcompletedevent = new com.kofax.kmc.ken.engines.data.Image.FriendI(taskcompletedevent, "com.kofax");
                taskcompletedevent.setImageQuickAnalysisFeedBack(quickanalysisfeedback);
                taskcompletedevent.setImageMetaData(enhancementresults.image.getImageMetaData());
            }
            // Misplaced declaration of an exception variable
            catch (com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedEvent taskcompletedevent)
            {
                taskcompletedevent.printStackTrace();
            }
            b.b(enhancementresults.errorInfo, enhancementresults.originalImage);
            return;
            obj;
            taskcompletedevent = null;
_L6:
            ((KmcException) (obj)).printStackTrace();
              goto _L5
_L4:
            taskcompletedevent = enhancementresults.errorInfo;
            b.b(taskcompletedevent, null);
            return;
_L2:
            if (obj == ErrorInfo.KMC_SUCCESS)
            {
                b.a(enhancementresults.errorInfo, enhancementresults.image);
                return;
            } else
            {
                b.a(((ErrorInfo) (obj)), null);
                return;
            }
            obj;
              goto _L6
        }

        private d()
        {
            a = ImageProcessor.this;
            super();
        }

        d(_cls1 _pcls1)
        {
            this();
        }
    }


    private class IpProgressClient
        implements com.kofax.kmc.ken.engines.iplib.IpLib.ProcessingProgressClient
    {

        final ImageProcessor a;

        public void handleIpProgressUpdate(int i1, Object obj)
        {
            obj = (ProcessPageOutRep)obj;
            Handler handler = new Handler(Looper.getMainLooper());
            if (((ProcessPageOutRep) (obj)).callbackOnWorkerThread)
            {
                a.a(ErrorInfo.KMC_SUCCESS, ((ProcessPageOutRep) (obj)).imageID, i1);
                return;
            } else
            {
                class _cls1
                    implements Runnable
                {

                    final ProcessPageOutRep a;
                    final int b;
                    final IpProgressClient c;

                    public void run()
                    {
                        c.a.a(ErrorInfo.KMC_SUCCESS, a.imageID, b);
                    }

                _cls1(ProcessPageOutRep processpageoutrep, int i1)
                {
                    c = IpProgressClient.this;
                    a = processpageoutrep;
                    b = i1;
                    super();
                }
                }

                handler.post(new _cls1(((ProcessPageOutRep) (obj)), i1));
                return;
            }
        }

        public IpProgressClient()
        {
            a = ImageProcessor.this;
            super();
        }
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ErrorInfo.values().length];
            try
            {
                a[ErrorInfo.KMC_GN_FILE_NOT_FOUND.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[ErrorInfo.KMC_ED_NONEXISTENT_FILE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ErrorInfo.KMC_GN_OUT_OF_MEMORY.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[ErrorInfo.KMC_ED_FILE_STILL_REMAINS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ErrorInfo.KMC_ED_FILE_EXISTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class b
    {

        public static final ImageProcessor a = new ImageProcessor(true, null);


        private b()
        {
        }
    }


    private class ImageOutListener
    {

        public abstract void imageOut(ImageOutEvent imageoutevent);
    }


    private class ImageOutEvent extends EventObject
    {

        private static final long serialVersionUID = 0x2fc536069e572875L;
        private ErrorInfo a;
        private Image b;

        public Image getImage()
        {
            return b;
        }

        public ErrorInfo getStatus()
        {
            return a;
        }

        public ImageOutEvent(Object obj, ErrorInfo errorinfo, Image image)
        {
            super(obj);
            a = errorinfo;
            b = image;
        }
    }


    private class ProcessProgressListener
    {

        public abstract void processProgress(ProcessProgressEvent processprogressevent);
    }


    private class ProcessProgressEvent extends EventObject
    {

        private static final long serialVersionUID = 0x2fc536069e572875L;
        private ErrorInfo a;
        private String b;
        private int c;

        public String getImageID()
        {
            return b;
        }

        public int getProgressPct()
        {
            return c;
        }

        public ErrorInfo getStatus()
        {
            return a;
        }

        public ProcessProgressEvent(Object obj, ErrorInfo errorinfo, String s, int i1)
        {
            super(obj);
            a = errorinfo;
            b = s;
            c = i1;
        }
    }


    private class AnalysisCompleteListener
    {

        public abstract void analysisComplete(AnalysisCompleteEvent analysiscompleteevent);
    }


    private class AnalysisCompleteEvent extends EventObject
    {

        private static final long serialVersionUID = 0x47e6346f54c5d67dL;
        private ErrorInfo a;
        private Image b;

        public Image getImage()
        {
            return b;
        }

        public ErrorInfo getStatus()
        {
            return a;
        }

        public AnalysisCompleteEvent(Object obj, ErrorInfo errorinfo, Image image)
        {
            super(obj);
            a = errorinfo;
            b = image;
        }
    }


    private class AnalysisProgressListener
    {

        public abstract void analysisProgress(AnalysisProgressEvent analysisprogressevent);
    }


    private class AnalysisProgressEvent extends EventObject
    {

        private static final long serialVersionUID = 0x7cff5eb92390c22aL;
        private ErrorInfo a;
        private String b;
        private int c;

        public String getImageID()
        {
            return b;
        }

        public int getProgressPct()
        {
            return c;
        }

        public ErrorInfo getStatus()
        {
            return a;
        }

        public AnalysisProgressEvent(Object obj, ErrorInfo errorinfo, String s, int i1)
        {
            super(obj);
            a = errorinfo;
            b = s;
            c = i1;
        }
    }

}
