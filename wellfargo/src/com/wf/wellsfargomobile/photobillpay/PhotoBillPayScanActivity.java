// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.a;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.captureanimations.AnimatedDocumentCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureExperienceCriteria;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage;
import com.kofax.kmc.kut.utilities.Licensing;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.ao;
import com.wf.wellsfargomobile.aq;
import java.util.Timer;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            n, s, p, q, 
//            r, u, c

public class PhotoBillPayScanActivity extends BaseActionBarActivity
    implements android.view.View.OnClickListener, CameraInitializationListener, ImageCapturedListener, aq
{

    private Timer b;
    private String c;
    private String d;
    private String e;
    private long f;
    private long g;
    private ImageView h;
    private TextView i;
    private Button j;
    private ImageCaptureView k;
    private AnimatedDocumentCaptureExperience l;
    private boolean m;
    private boolean n;
    private final BroadcastReceiver o = new n(this);

    public PhotoBillPayScanActivity()
    {
        k = null;
        m = false;
        n = false;
    }

    static AnimatedDocumentCaptureExperience a(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        return photobillpayscanactivity.l;
    }

    private void a(CaptureMessage capturemessage)
    {
        capturemessage.setOrientation(com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage.KUIMessageOrientation.PORTRAIT);
        capturemessage.setBackgroundColor(getResources().getColor(0x7f0e0043));
        capturemessage.setTextSize(15);
    }

    static void a(PhotoBillPayScanActivity photobillpayscanactivity, String s1)
    {
        photobillpayscanactivity.a(s1);
    }

    private void a(String s1)
    {
        if (s1 != null)
        {
            ao ao1 = new ao();
            Bundle bundle = new Bundle();
            bundle.putInt("SELECT_FRAGMENT", 2);
            bundle.putString("DIALOG_TITLE", s1);
            bundle.putString("DIALOG_MESSAGE", null);
            ao1.setArguments(bundle);
            ao1.show(getSupportFragmentManager(), "ErrorMessageDialogFragment");
        }
    }

    static boolean a(PhotoBillPayScanActivity photobillpayscanactivity, boolean flag)
    {
        photobillpayscanactivity.m = flag;
        return flag;
    }

    static ImageCaptureView b(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        return photobillpayscanactivity.k;
    }

    private void b()
    {
        e();
        k.removeCameraInitializationListener(this);
        k.removeOnImageCapturedListener(this);
        l.stopCapture();
        l.destroy();
        Intent intent = new Intent();
        intent.putExtra("error", false);
        setResult(33, intent);
        finish();
    }

    private void c()
    {
        if (!m)
        {
            if (b == null)
            {
                b = new Timer("BillPayBillScanInputTimer", true);
            }
            b.purge();
            b.schedule(new s(this), f * 1000L);
            m = true;
        }
    }

    static boolean c(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        return photobillpayscanactivity.m;
    }

    static boolean d(PhotoBillPayScanActivity photobillpayscanactivity)
    {
        return photobillpayscanactivity.n;
    }

    private void e()
    {
        if (b != null)
        {
            b.cancel();
            b = null;
            m = false;
        }
    }

    public void d()
    {
        n = false;
        l.takePicture();
        k.setVisibility(0);
        c();
    }

    public void onBackPressed()
    {
        b();
    }

    public void onCameraInitialized(CameraInitializationEvent camerainitializationevent)
    {
        k.addOnImageCapturedListener(this);
        l.takePicture();
    }

    public void onClick(View view)
    {
        if (view.equals(j))
        {
            b();
        } else
        if (view.equals(h) || view.equals(i))
        {
            l.stopCapture();
            e();
            n = true;
            view = new ao();
            Bundle bundle = new Bundle();
            bundle.putInt("SELECT_FRAGMENT", 1);
            view.setArguments(bundle);
            view.show(getSupportFragmentManager(), "PhotoBillPayPhotoTipsDialogFragment");
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateUserLocale();
        if (a != null)
        {
            a.b();
        }
        setContentView(0x7f04004c);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            c = bundle.getString("activitySource");
            d = bundle.getString("actionMethod");
            f = bundle.getLong("timoutSeconds");
            g = bundle.getLong("responseWaitTimoutSeconds");
            e = bundle.getString("callBackFunctionName");
        }
        h = (ImageView)findViewById(0x7f0f00f1);
        h.setOnClickListener(this);
        i = (TextView)findViewById(0x7f0f00f2);
        i.setOnClickListener(this);
        j = (Button)findViewById(0x7f0f00f3);
        j.setOnClickListener(this);
        Licensing.setMobileSDKLicense("ttP,,thT0#4FZ&8#8l,@tvtjLfD$xr^TB@[089nl5n[6qb04[(NPIUEAWGUNKl;dfvkhzdf7rglcvjck=,mIOF&^BUL?!!!!!!Z2");
        k = (ImageCaptureView)findViewById(0x7f0f00f4);
        LocalBroadcastManager.getInstance(this).registerReceiver(o, new IntentFilter("action_photo_scan_event"));
        k.addCameraInitializationListener(this);
        bundle = new CaptureExperienceCriteria();
        bundle.setStabilityThresholdEnabled(true);
        bundle.setStabilityThreshold(98);
        bundle.setPitchThresholdEnabled(true);
        bundle.setPitchThreshold(12);
        bundle.setRollThresholdEnabled(true);
        bundle.setRollThreshold(12);
        bundle.setPageLongEdgeThreshold(75);
        l = new AnimatedDocumentCaptureExperience(k, bundle);
        bundle = new CaptureMessage();
        a(bundle);
        bundle.setMessage(getResources().getString(0x7f0800c4));
        CaptureMessage capturemessage = new CaptureMessage();
        a(capturemessage);
        capturemessage.setMessage(getResources().getString(0x7f0800c0));
        capturemessage.setWidth(400);
        k.post(new p(this, capturemessage));
        CaptureMessage capturemessage1 = new CaptureMessage();
        a(capturemessage1);
        capturemessage1.setMessage(getResources().getString(0x7f0800c1));
        capturemessage1.setWidth(400);
        k.post(new q(this, capturemessage1));
        CaptureMessage capturemessage2 = new CaptureMessage();
        a(capturemessage2);
        capturemessage2.setMessage(getString(0x7f0800c5));
        capturemessage2.setWidth(400);
        k.post(new r(this, capturemessage2));
        CaptureMessage capturemessage3 = new CaptureMessage();
        capturemessage3.setVisibility(false);
        l.setUserInstructionMessage(bundle);
        l.setZoomInMessage(capturemessage);
        l.setHoldSteadyMessage(capturemessage1);
        l.setNoDocumentFoundMessage(capturemessage3);
        l.setPageOrientationMessage(capturemessage2);
        l.setStaticFrameBorderThickness(10F);
        k.setBackgroundColor(0);
        c();
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            b.cancel();
            b = null;
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(o);
        super.onDestroy();
    }

    public void onImageCaptured(ImageCapturedEvent imagecapturedevent)
    {
        e();
        k.removeOnImageCapturedListener(this);
        k.removeCameraInitializationListener(this);
        l.stopCapture();
        l.destroy();
        u.b(imagecapturedevent.getImage());
        imagecapturedevent = new Intent("action_photo_scan_event");
        c.c.a(imagecapturedevent);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcastSync(imagecapturedevent);
        imagecapturedevent = new Intent();
        imagecapturedevent.putExtra("activitySource", c);
        imagecapturedevent.putExtra("responseWaitTimoutSeconds", g);
        imagecapturedevent.putExtra("actionMethod", d);
        imagecapturedevent.putExtra("callBackFunctionName", e);
        setResult(34, imagecapturedevent);
        finish();
    }
}
