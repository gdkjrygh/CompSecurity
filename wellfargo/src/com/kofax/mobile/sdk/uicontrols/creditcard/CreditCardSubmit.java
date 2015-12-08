// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.content.Intent;
import android.util.Log;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.async.ListenerCallbackThreadType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCard, DataExtractionTask, ExtractionResultsActivity

public class CreditCardSubmit
{

    static Image h;
    private static String m = "_DeviceType_2_DoBinarization__DoCropCorrection__DoSkewCorrectionAlt__DoDespeck_15_DoEdgeCleanup__DocDimLarge_3.375_DocDimSmall_2.125";
    final String a = getClass().getName();
    public int activityResultCode;
    CountDownLatch b;
    CountDownLatch c;
    ArrayList d;
    ArrayList e;
    int f;
    Image g;
    Image i;
    ImageProcessor j;
    ImagePerfectionProfile k;
    private String l;
    public d resultCode;

    public CreditCardSubmit(String s)
    {
        d = null;
        e = null;
        resultCode = d.a;
        activityResultCode = 0;
        f = 0;
        j = null;
        k = new ImagePerfectionProfile();
        l = s;
    }

    static ImageProcessor a(CreditCardSubmit creditcardsubmit)
    {
        return creditcardsubmit.c();
    }

    static String a()
    {
        return m;
    }

    private void a(a a1)
    {
        (new Thread(a1)).start();
    }

    static void a(CreditCardSubmit creditcardsubmit, String s)
    {
        creditcardsubmit.c(s);
    }

    private void a(ArrayList arraylist)
    {
        c c1 = new c(null);
        c1.a = arraylist;
        (new Thread(c1)).start();
    }

    static Image b(String s)
    {
        Image image1 = h;
        Image image = image1;
        if (image1 != null)
        {
            image = image1;
            if (!s.equals(image1.getImageID()))
            {
                image = null;
            }
        }
        return image;
    }

    private ArrayList b(Image image)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.clear();
        arraylist.add(image);
        return arraylist;
    }

    private boolean b()
    {
        return !l.contains("?processImage=true");
    }

    private ImageProcessor c()
    {
        if (j == null)
        {
            j = new ImageProcessor();
            j.setBasicSettingsProfile(null);
            j.setImagePerfectionProfile(null);
            j.setListenerCallbackThreadType(ListenerCallbackThreadType.WORKER_THREAD);
        }
        return j;
    }

    private void c(String s)
    {
        a(d.b);
        d.add(s);
    }

    int a(Intent intent)
    {
        if (resultCode == d.d)
        {
            Log.i(a, "CARD_CAPTURED (*)");
            intent.putExtra("com.kofax.mobile.sdk.uicontrols.creditcard.Image", h.getImageID());
            return 3;
        }
        if (resultCode == d.a)
        {
            Log.i(a, "Extraction SUCCESS (*)");
            CreditCard creditcard = new CreditCard();
            creditcard.setCardNumber((String)e.get(0));
            String s = (String)e.get(1);
            if (s != null && !s.isEmpty())
            {
                creditcard.setExpirationMonth(s.substring(0, 2));
                creditcard.setExpirationYear(((String)e.get(1)).substring(3));
            }
            intent.putExtra("com.kofax.mobile.sdk.uicontrols.creditcard.CreditCard", creditcard);
            intent.putExtra("com.kofax.mobile.sdk.uicontrols.creditcard.Image", h.getImageID());
            return 2;
        } else
        {
            Log.i(a, "Extraction FAILED (*)");
            intent.putExtra("com.kofax.mobile.sdk.uicontrols.creditcard.ErrorString", (String)e.get(0));
            return 4;
        }
    }

    void a(Image image)
    {
        if (h != null)
        {
            h.imageClearBitmap();
            h = null;
        }
        h = image;
    }

    void a(Image image, CountDownLatch countdownlatch)
    {
        Log.i("TARA ", l);
        g = image;
        image = new DataExtractionTask(ExtractionResultsActivity.h, l, new String[] {
            "CardID", "ExpirationDate", "CardNetwork"
        }, image);
        image.d = countdownlatch;
        image.e = this;
        image.execute(new String[] {
            ""
        });
    }

    void a(d d1)
    {
        resultCode = d1;
    }

    void a(String s)
    {
        a(d.c);
        e.add(s);
    }

    public void runAndSubmit()
    {
        d = new ArrayList();
        e = new ArrayList();
        a a1 = new a(f);
        a1.b = new ArrayList();
        if (b())
        {
            a1.a = new ArrayList();
            a1.a.add(h);
            b = new CountDownLatch(a1.a.size());
            a(a1);
        } else
        {
            a1.b.add(h);
        }
        c = new CountDownLatch(1);
        a(a1.b);
        try
        {
            c.await();
        }
        catch (InterruptedException interruptedexception)
        {
            a(interruptedexception.toString());
        }
        Log.i(a, "Submit(s) complete (*)");
    }

    public Intent test()
    {
        Object obj = new Image("/storage/sdcard0/vanilla1.jpg", com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG);
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        try
        {
            ((Image) (obj)).imageReadFromFile();
        }
        catch (KmcException kmcexception)
        {
            kmcexception.getErrorInfo();
        }
        h = ((Image) (obj));
        runAndSubmit();
        obj = new Intent();
        activityResultCode = a(((Intent) (obj)));
        return ((Intent) (obj));
    }


    private class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d e[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/kofax/mobile/sdk/uicontrols/creditcard/CreditCardSubmit$d, s);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            a = new d("SUCCESS", 0);
            b = new d("IMAGEPROCESSING_FAILURE", 1);
            c = new d("EXTRACTION_FAILURE", 2);
            d = new d("CARD_CAPTURED", 3);
            e = (new d[] {
                a, b, c, d
            });
        }

        private d(String s, int i1)
        {
            super(s, i1);
        }
    }


    private class c
        implements Runnable
    {

        ArrayList a;
        final CreditCardSubmit b;

        private void a(String s)
        {
            String s1 = Thread.currentThread().getName();
            System.out.format("%s: %s%n", new Object[] {
                s1, s
            });
        }

        public void run()
        {
            Looper.prepare();
            Iterator iterator;
            boolean flag;
            if (b.b != null)
            {
                try
                {
                    b.b.await();
                }
                catch (InterruptedException interruptedexception)
                {
                    b.a(interruptedexception.toString());
                }
            }
            iterator = a.iterator();
            flag = false;
            while (iterator.hasNext()) 
            {
                Image image = (Image)iterator.next();
                if (flag)
                {
                    continue;
                }
                CountDownLatch countdownlatch = new CountDownLatch(1);
                try
                {
                    b.a(image, countdownlatch);
                }
                catch (Exception exception)
                {
                    b.a(exception.toString());
                }
                try
                {
                    countdownlatch.await();
                }
                catch (InterruptedException interruptedexception1)
                {
                    b.a(interruptedexception1.toString());
                }
                if (b.resultCode != d.a)
                {
                    flag = true;
                }
                b.c.countDown();
            }
        }

        private c()
        {
            b = CreditCardSubmit.this;
            super();
        }

        c(_cls1 _pcls1)
        {
            this();
        }
    }


    private class a
        implements Runnable
    {

        ArrayList a;
        ArrayList b;
        int c;
        final CreditCardSubmit d;

        private void a(ImageProcessor imageprocessor, Image image)
        {
            ImagePerfectionProfile imageperfectionprofile = new ImagePerfectionProfile();
            imageperfectionprofile.setIpOperations(CreditCardSubmit.a());
            imageprocessor.setImagePerfectionProfile(imageperfectionprofile);
            imageprocessor.setProcessedImageRepresentation(com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP);
            try
            {
                imageprocessor.processImage(image);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ImageProcessor imageprocessor)
            {
                CreditCardSubmit.a(d, imageprocessor.toString());
            }
        }

        public void run()
        {
            Looper.prepare();
            b b1 = d. new b(null);
            ImageProcessor imageprocessor = CreditCardSubmit.a(d);
            imageprocessor.addImageOutEventListener(b1);
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                Image image = (Image)iterator.next();
                b1.a = new CountDownLatch(1);
                a(imageprocessor, image);
                try
                {
                    b1.a.await();
                }
                catch (InterruptedException interruptedexception)
                {
                    CreditCardSubmit.a(d, interruptedexception.toString());
                }
                b.add(d.i);
                d.b.countDown();
            }
            imageprocessor.removeImageOutEventListener(b1);
        }

        public a(int i1)
        {
            d = CreditCardSubmit.this;
            super();
            c = i1;
        }

        private class b
            implements com.kofax.kmc.ken.engines.ImageProcessor.ImageOutListener
        {

            CountDownLatch a;
            final CreditCardSubmit b;

            public void imageOut(com.kofax.kmc.ken.engines.ImageProcessor.ImageOutEvent imageoutevent)
            {
                if (b.i != null)
                {
                    b.i.imageClearBitmap();
                    try
                    {
                        b.i.imageClearFileBuffer();
                    }
                    catch (KmcException kmcexception)
                    {
                        CreditCardSubmit.a(b, kmcexception.toString());
                    }
                }
                b.i = imageoutevent.getImage();
                a.countDown();
            }

            private b()
            {
                b = CreditCardSubmit.this;
                super();
                a = null;
            }

            b(_cls1 _pcls1)
            {
                this();
            }
        }

    }

}
