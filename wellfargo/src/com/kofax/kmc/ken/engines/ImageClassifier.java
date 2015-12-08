// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import com.kofax.kmc.ken.engines.appstats.ImgClassifierAppStatsClient;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageClassificationCompletedListener

public class ImageClassifier
{

    private static boolean b;
    private static ImgClassifierAppStatsClient c;
    private static volatile ImageClassificationStatus i;
    final Runnable a;
    private com.kofax.android.abc.image_classification.ImageClassifier d;
    private final Handler e;
    private CopyOnWriteArrayList f;
    private String g;
    private String h;
    private int j;
    private Image k;
    private boolean l;
    private boolean m;

    public ImageClassifier()
    {
        d = new com.kofax.android.abc.image_classification.ImageClassifier();
        e = new Handler();
        f = new CopyOnWriteArrayList();
        j = 20;
        k = null;
        l = false;
        m = false;
        a = new _cls1();
        b();
    }

    private ImageClassifier(boolean flag)
    {
        d = new com.kofax.android.abc.image_classification.ImageClassifier();
        e = new Handler();
        f = new CopyOnWriteArrayList();
        j = 20;
        k = null;
        l = false;
        m = false;
        a = new _cls1();
    }

    ImageClassifier(boolean flag, _cls1 _pcls1)
    {
        this(flag);
    }

    static com.kofax.android.abc.image_classification.ImageClassifier a(ImageClassifier imageclassifier)
    {
        return imageclassifier.d;
    }

    static ImageClassificationStatus a(ImageClassificationStatus imageclassificationstatus)
    {
        i = imageclassificationstatus;
        return imageclassificationstatus;
    }

    static ImgClassifierAppStatsClient a()
    {
        return c;
    }

    private void a(Bitmap bitmap)
    {
        (new _cls3(bitmap)).start();
    }

    private void a(String s)
    {
        (new _cls2(s)).start();
    }

    static boolean a(ImageClassifier imageclassifier, boolean flag)
    {
        imageclassifier.l = flag;
        return flag;
    }

    private boolean a(Image image)
    {
        return image.getImageBitmapHeight().intValue() * image.getImageBitmapWidth().intValue() < image.getImageFileHeight().intValue() * image.getImageFileWidth().intValue();
    }

    static Image b(ImageClassifier imageclassifier)
    {
        return imageclassifier.k;
    }

    private static void b()
    {
label0:
        {
            if (!b)
            {
                if (!IpLibUtil.isIpLicensed())
                {
                    break label0;
                }
                b = true;
                if (c == null)
                {
                    c = new ImgClassifierAppStatsClient(AppStatsInstanceType.INST_TYPE_IMAGE_CLASSIFIER);
                }
            }
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
    }

    private void c()
    {
        b();
        if (g == null || g.length() == 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_CONFIG_NOT_LOADED);
        }
        if (h == null || h.length() == 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MODEL_NOT_LOADED);
        } else
        {
            return;
        }
    }

    static boolean c(ImageClassifier imageclassifier)
    {
        return imageclassifier.l;
    }

    static CopyOnWriteArrayList d(ImageClassifier imageclassifier)
    {
        return imageclassifier.f;
    }

    static int e(ImageClassifier imageclassifier)
    {
        return imageclassifier.j;
    }

    static Handler f(ImageClassifier imageclassifier)
    {
        return imageclassifier.e;
    }

    public static ImageClassifier getInstance()
    {
        ImageClassifier imageclassifier = a.a;
        b();
        return imageclassifier;
    }

    public void addImageClassificationCompletedEventListener(ImageClassificationCompletedListener imageclassificationcompletedlistener)
    {
        if (imageclassificationcompletedlistener == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_LISTENER_NULL);
        } else
        {
            f.add(imageclassificationcompletedlistener);
            return;
        }
    }

    public int classifyImage(Image image)
    {
        Object obj;
        if (image == null)
        {
            return ErrorInfo.KMC_CL_NO_IMAGE_SUPPLIED.getErr();
        }
        c.logAppStats(AppStatsEventIDType.APP_STATS_CLASSIFY_START_EVENT, image.getImageID());
        c();
        if (i == ImageClassificationStatus.IN_PROGRESS)
        {
            return ErrorInfo.KMC_CL_CLASSIFIER_BUSY.getErr();
        }
        k = image;
        i = ImageClassificationStatus.IN_PROGRESS;
        obj = image.getImageRepresentation();
        if (obj == null || ((com.kofax.kmc.ken.engines.data.Image.ImageRep) (obj)).equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_NONE))
        {
            i = ImageClassificationStatus.ERROR;
            return ErrorInfo.KMC_CL_NO_IMAGE_SUPPLIED.getErr();
        }
        if (!((com.kofax.kmc.ken.engines.data.Image.ImageRep) (obj)).equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP)) goto _L2; else goto _L1
_L1:
        a(image.getImageBitmap());
_L4:
        return ErrorInfo.KMC_SUCCESS.getErr();
_L2:
        if (((com.kofax.kmc.ken.engines.data.Image.ImageRep) (obj)).equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE))
        {
            if (image.getImageMimeType() == com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF)
            {
                l = true;
                try
                {
                    image.imageReadFromFile();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((KmcRuntimeException) (obj)).printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((KmcException) (obj)).printStackTrace();
                }
                a(image.getImageBitmap());
            } else
            {
                a(image.getImageFilePath());
            }
        } else
        if (((com.kofax.kmc.ken.engines.data.Image.ImageRep) (obj)).equals(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH))
        {
            if (a(image))
            {
                a(image.getImageFilePath());
            } else
            {
                a(image.getImageBitmap());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getMaxNumberOfResults()
    {
        return j;
    }

    public ImageClassificationStatus getStatus()
    {
        return i;
    }

    public int loadConfigurationFile(String s)
    {
        ErrorInfo errorinfo;
        if (s == null || s.length() == 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_CONFIG_NULL);
        }
        if (!(new File(s)).exists())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
        }
        errorinfo = ErrorInfo.KMC_SUCCESS;
        d.loadConfigurationFile(s);
        g = s;
        s = errorinfo;
_L2:
        return s.getErr();
        s;
        s = ErrorInfo.KMC_CL_CONFIG_NOT_LOADED;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int loadModel(String s)
    {
        ErrorInfo errorinfo;
        if (s == null || s.length() == 0)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MODEL_NULL);
        }
        if (!(new File(s)).exists())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
        }
        errorinfo = ErrorInfo.KMC_SUCCESS;
        d.loadModel(s);
        h = s;
        s = errorinfo;
_L2:
        return s.getErr();
        s;
        s = ErrorInfo.KMC_CL_MODEL_NOT_LOADED;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void removeImageClassificationCompletedEventListener(ImageClassificationCompletedListener imageclassificationcompletedlistener)
    {
        if (imageclassificationcompletedlistener != null)
        {
            f.remove(imageclassificationcompletedlistener);
        }
    }

    public void sessionCreate()
    {
        this;
        JVM INSTR monitorenter ;
        if (m)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_CREATE_ERROR);
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (c == null)
        {
            c = new ImgClassifierAppStatsClient(AppStatsInstanceType.INST_TYPE_IMAGE_CLASSIFIER);
        }
        c.appStatsSessionCreate();
        m = true;
        this;
        JVM INSTR monitorexit ;
    }

    public void sessionDismiss()
    {
        this;
        JVM INSTR monitorenter ;
        if (!m)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_DISMISS_ERROR);
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c.appStatsSessionDismiss();
        m = false;
        this;
        JVM INSTR monitorexit ;
    }

    public void setMaxNumberOfResults(int i1)
    {
        if (i1 < 1 || i1 > 64)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MAX_NUM_RESULTS_INVALID);
        } else
        {
            j = i1;
            return;
        }
    }

    static 
    {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("sol_isg_mobile");
        i = ImageClassificationStatus.COMPLETE;
    }

    private class _cls1
        implements Runnable
    {

        final ImageClassifier a;

        private List a(Vector vector)
        {
            ArrayList arraylist = new ArrayList();
            if (vector == null)
            {
                return arraylist;
            }
            for (int i1 = 0; i1 < vector.size(); i1++)
            {
                ResultPair resultpair = (ResultPair)vector.get(i1);
                if (resultpair != null)
                {
                    arraylist.add(new ImageClassificationResult(resultpair.classID, resultpair.confidence, resultpair.orientation));
                }
            }

            return arraylist;
        }

        private void a(Image image, List list)
        {
            if (list != null)
            {
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    ImageClassificationCompletedListener imageclassificationcompletedlistener = (ImageClassificationCompletedListener)list.next();
                    if (imageclassificationcompletedlistener != null)
                    {
                        imageclassificationcompletedlistener.onImageClassified(new ImageClassificationCompleteEvent(this, image));
                    }
                } while (true);
            }
        }

        public void run()
        {
            List list = null;
            List list1 = a(ImageClassifier.a(a).getClassificationResults());
            list = list1;
_L2:
            if (ImageClassifier.b(a) != null)
            {
                ImageClassifier.b(a).setImageClassifyResults(list);
                if (ImageClassifier.c(a))
                {
                    ImageClassifier.b(a).imageClearBitmap();
                    ImageClassifier.a(a, false);
                }
            }
            ImageClassifier.a(ImageClassificationStatus.COMPLETE);
            ImageClassifier.a().logAppStats(AppStatsEventIDType.APP_STATS_CLASSIFY_STOP_EVENT, list, ImageClassifier.b(a).getImageID());
            a(ImageClassifier.b(a), ImageClassifier.d(a));
            return;
            Exception exception;
            exception;
            ImageClassifier.a(ImageClassificationStatus.ERROR);
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls1()
        {
            a = ImageClassifier.this;
            super();
        }
    }


    private class _cls3 extends Thread
    {

        final Bitmap a;
        final ImageClassifier b;

        public void run()
        {
            ImageClassifier.a(b).classify(a, ImageClassifier.e(b));
            ImageClassifier.f(b).post(b.a);
        }

        _cls3(Bitmap bitmap)
        {
            b = ImageClassifier.this;
            a = bitmap;
            super();
        }
    }


    private class _cls2 extends Thread
    {

        final String a;
        final ImageClassifier b;

        public void run()
        {
            ImageClassifier.a(b).classify(a, ImageClassifier.e(b));
            ImageClassifier.f(b).post(b.a);
        }

        _cls2(String s)
        {
            b = ImageClassifier.this;
            a = s;
            super();
        }
    }


    private class a
    {

        public static final ImageClassifier a = new ImageClassifier(true, null);


        private a()
        {
        }
    }


    private class ImageClassificationStatus extends Enum
    {

        public static final ImageClassificationStatus COMPLETE;
        public static final ImageClassificationStatus ERROR;
        public static final ImageClassificationStatus IN_PROGRESS;
        private static final ImageClassificationStatus a[];

        public static ImageClassificationStatus valueOf(String s)
        {
            return (ImageClassificationStatus)Enum.valueOf(com/kofax/kmc/ken/engines/ImageClassifier$ImageClassificationStatus, s);
        }

        public static ImageClassificationStatus[] values()
        {
            return (ImageClassificationStatus[])a.clone();
        }

        static 
        {
            IN_PROGRESS = new ImageClassificationStatus("IN_PROGRESS", 0);
            COMPLETE = new ImageClassificationStatus("COMPLETE", 1);
            ERROR = new ImageClassificationStatus("ERROR", 2);
            a = (new ImageClassificationStatus[] {
                IN_PROGRESS, COMPLETE, ERROR
            });
        }

        private ImageClassificationStatus(String s, int i1)
        {
            super(s, i1);
        }
    }

}
