// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.LinearLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.AnimatedDocumentCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureExperienceCriteria;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            CreditCardSubmit, CreditCard

public class CreditCardCaptureActivity extends Activity
{

    public static final String EXTRA_PARAM_CARD_NUMBER_STYLE = "com.kofax.mobile.sdk.uicontrols.creditcard.cardNumberStyle";
    public static final String EXTRA_PARAM_SERVER_URL = "com.kofax.mobile.sdk.uicontrols.creditcard.serverUrl";
    public static final String EXTRA_RESULT_CARD = "com.kofax.mobile.sdk.uicontrols.creditcard.CreditCard";
    public static final String EXTRA_RESULT_ERROR_STRING = "com.kofax.mobile.sdk.uicontrols.creditcard.ErrorString";
    public static final String EXTRA_RESULT_IMAGE = "com.kofax.mobile.sdk.uicontrols.creditcard.Image";
    public static final int RESULT_CARD_CAPTURED = 3;
    public static final int RESULT_CARD_EXTRACTED_ON_DEVICE = 1;
    public static final int RESULT_CARD_EXTRACTED_ON_SERVER = 2;
    public static final int RESULT_CARD_EXTRACTION_FAILED = 4;
    public static final int RESULT_CARD_SCAN_64BIT_NOT_SUPPORTED = 6;
    public static final int RESULT_CARD_SCAN_CANCELED = 5;
    public static final int STYLE_EMBOSSED = 0;
    public static final int STYLE_FLAT = 1;
    private static final boolean m = false;
    final String a = getClass().getName();
    CaptureExperienceCriteria b;
    private ImageCaptureView c;
    private AnimatedDocumentCaptureExperience d;
    private int e;
    private String f;
    private String g;
    private String h;
    private LinearLayout i;
    private b j;
    private a k;
    private Handler l;

    public CreditCardCaptureActivity()
    {
        c = null;
        b = null;
        d = null;
        e = 0;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
    }

    public static Image GetImage(String s)
    {
        return CreditCardSubmit.b(s);
    }

    private void a()
    {
        if (i == null)
        {
            i = new LinearLayout(this);
            i.setOrientation(1);
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
            setContentView(i, layoutparams);
        }
    }

    static void a(CreditCardCaptureActivity creditcardcaptureactivity)
    {
        creditcardcaptureactivity.f();
    }

    static String b(CreditCardCaptureActivity creditcardcaptureactivity)
    {
        return creditcardcaptureactivity.f;
    }

    private void b()
    {
        if (c == null)
        {
            c = new ImageCaptureView(this);
            c.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            i.addView(c, 0);
            c.doContinuousMode(true);
            j = new b(null);
            c.addOnImageCapturedListener(j);
            i.requestLayout();
        }
    }

    static ImageCaptureView c(CreditCardCaptureActivity creditcardcaptureactivity)
    {
        return creditcardcaptureactivity.c;
    }

    private void c()
    {
        if (c == null)
        {
            c = new ImageCaptureView(this);
            c.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            b = new CaptureExperienceCriteria();
            d = new AnimatedDocumentCaptureExperience(c, b);
            i.addView(c, 0);
            j = new b(null);
            c.addOnImageCapturedListener(j);
            k = new a(null);
            c.addCameraInitializationListener(k);
            i.requestLayout();
        }
    }

    static Handler d(CreditCardCaptureActivity creditcardcaptureactivity)
    {
        return creditcardcaptureactivity.l;
    }

    private void d()
    {
        if (e == 0)
        {
            if (System.getProperty("os.arch").contains("64"))
            {
                setResult(6, new Intent());
                finish();
                return;
            } else
            {
                Intent intent = new Intent(this, io/card/payment/CardIOActivity);
                intent.putExtra("io.card.payment.requireExpiry", false);
                intent.putExtra("io.card.payment.requireCVV", false);
                intent.putExtra("io.card.payment.requirePostalCode", false);
                intent.putExtra("io.card.payment.suppressManual", true);
                intent.putExtra("io.card.payment.suppressConfirmation", true);
                intent.putExtra("io.card.payment.useCardIOLogo", true);
                startActivityForResult(intent, 0);
                return;
            }
        } else
        {
            a();
            c();
            return;
        }
    }

    private void e()
    {
        Log.i(a, "Hello from testRig");
        CreditCardSubmit creditcardsubmit = new CreditCardSubmit(f);
        Object obj = new Image("/storage/sdcard0/vanilla1.jpg", com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG);
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        try
        {
            ((Image) (obj)).imageReadFromFile();
        }
        catch (KmcException kmcexception)
        {
            kmcexception.printStackTrace();
            kmcexception.getErrorInfo();
        }
        CreditCardSubmit.h = ((Image) (obj));
        creditcardsubmit.runAndSubmit();
        obj = new Intent();
        setResult(creditcardsubmit.a(((Intent) (obj))), ((Intent) (obj)));
        finish();
    }

    private void f()
    {
        d = null;
        i.removeView(c);
        c.removeCameraInitializationListener(k);
        c.removeOnImageCapturedListener(j);
        c = null;
    }

    public void launchRingDialog(CreditCardSubmit creditcardsubmit)
    {
        Object obj;
label0:
        {
            String s = g;
            if (s != null)
            {
                obj = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            obj = "Extracting...";
        }
        String s1;
label1:
        {
            String s2 = h;
            if (s2 != null)
            {
                s1 = s2;
                if (!s2.isEmpty())
                {
                    break label1;
                }
            }
            s1 = "Please wait.";
        }
        obj = ProgressDialog.show(this, ((CharSequence) (obj)), s1, true);
        ((ProgressDialog) (obj)).setCancelable(true);
        Log.i(a, "In launchRingDialog (*)");
        (new Thread(new _cls1(creditcardsubmit, ((ProgressDialog) (obj))))).start();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (intent != null && intent.hasExtra("io.card.payment.scanResult"))
        {
            Object obj = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            Log.i(a, (new StringBuilder()).append("scanResult: ").append(obj).toString());
            intent = new com.kofax.mobile.sdk.uicontrols.creditcard.CreditCard();
            intent.setCardNumber(((CreditCard) (obj)).a);
            obj = new Intent();
            ((Intent) (obj)).putExtra("com.kofax.mobile.sdk.uicontrols.creditcard.CreditCard", intent);
            setResult(1, ((Intent) (obj)));
            finish();
            return;
        } else
        {
            setResult(5, new Intent());
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        e = 0;
        if (bundle.hasExtra("com.kofax.mobile.sdk.uicontrols.creditcard.cardNumberStyle"))
        {
            e = bundle.getIntExtra("com.kofax.mobile.sdk.uicontrols.creditcard.cardNumberStyle", e);
        }
        f = new String();
        if (bundle.hasExtra("com.kofax.mobile.sdk.uicontrols.creditcard.serverUrl"))
        {
            f = bundle.getStringExtra("com.kofax.mobile.sdk.uicontrols.creditcard.serverUrl");
        }
        l = new Handler();
        d();
    }

    public void onStart()
    {
        super.onStart();
        if (c != null)
        {
            c.setFlash(Flash.OFF);
            c.setPageAreaForDetection(20);
            b.setFocusEnabled(true);
            b.setPageDetectionEnabled(true);
            b.setStabilityThreshold(93);
            b.setPageAreaThresholdEnabled(true);
            b.setPageAreaThreshold(40);
            b.setPageLongEdgeThresholdEnabled(true);
            b.setPageLongEdgeThreshold(75);
            b.setPageShortEdgeThresholdEnabled(true);
            b.setPageShortEdgeThreshold(75);
            d.setStaticFramePaddingPercent(7);
            d.takePictureContinually();
        }
    }

    static 
    {
        if (!System.getProperty("os.arch").contains("64"))
        {
            System.loadLibrary("cardioDecider");
            System.loadLibrary("opencv_core");
            System.loadLibrary("opencv_imgproc");
            System.loadLibrary("cardioRecognizer");
        }
    }

    private class b
        implements ImageCapturedListener
    {

        final CreditCardCaptureActivity a;

        public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
        {
            Log.i(a.a, "ImageCaptured (*)");
            Image image = imagecapturedevent.getImage();
            CreditCardCaptureActivity.a(a);
            imagecapturedevent = new CreditCardSubmit(CreditCardCaptureActivity.b(a));
            imagecapturedevent.a(image);
            if (CreditCardCaptureActivity.b(a) != null && !CreditCardCaptureActivity.b(a).isEmpty())
            {
                a.launchRingDialog(imagecapturedevent);
                return;
            } else
            {
                imagecapturedevent.a(CreditCardSubmit.d.d);
                Intent intent = new Intent();
                int i1 = imagecapturedevent.a(intent);
                a.setResult(i1, intent);
                a.finish();
                return;
            }
        }

        private b()
        {
            a = CreditCardCaptureActivity.this;
            super();
        }

        b(_cls1 _pcls1)
        {
            this();
        }
    }


    private class a
        implements CameraInitializationListener
    {

        final CreditCardCaptureActivity a;

        public void onCameraInitialized(CameraInitializationEvent camerainitializationevent)
        {
            CreditCardCaptureActivity.c(a).setFlash(Flash.OFF);
        }

        private a()
        {
            a = CreditCardCaptureActivity.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final CreditCardSubmit a;
        final ProgressDialog b;
        final CreditCardCaptureActivity c;

        public void run()
        {
            a.runAndSubmit();
            b.dismiss();
            class _cls1
                implements Runnable
            {

                final _cls1 a;

                public void run()
                {
                    Intent intent = new Intent();
                    int i1 = a.a.a(intent);
                    a.c.setResult(i1, intent);
                    a.c.finish();
                }

                _cls1()
                {
                    a = _cls1.this;
                    super();
                }
            }

            CreditCardCaptureActivity.d(c).post(new _cls1());
        }

        _cls1(CreditCardSubmit creditcardsubmit, ProgressDialog progressdialog)
        {
            c = CreditCardCaptureActivity.this;
            a = creditcardsubmit;
            b = progressdialog;
            super();
        }
    }

}
