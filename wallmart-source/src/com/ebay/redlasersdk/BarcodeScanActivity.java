// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk;

import RLSDK.b;
import RLSDK.c;
import RLSDK.d;
import RLSDK.e;
import RLSDK.g;
import RLSDK.p;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.ebay.redlasersdk:
//            BarcodeTypes, BarcodeResult

public abstract class BarcodeScanActivity extends Activity
{
    public static class Status
    {

        public static final String STATUS_CAMERA_SNAPSHOT = "CameraSnapshot";
        public static final String STATUS_FOUND_BARCODES = "FoundBarcodes";
        public static final String STATUS_GUIDANCE = "Guidance";
        public static final String STATUS_IN_RANGE = "InRange";
        public static final String STATUS_NEW_FOUND_BARCODES = "NewFoundBarcodes";
        public static final String STATUS_PARTIAL_BARCODE = "PartialBarcode";

        private Status()
        {
        }
    }


    public static final String PREF_ORIENTATION_LANDSCAPE = "orientationLandscape";
    public static final String PREF_ORIENTATION_PORTRAIT = "orientationPortrait";
    public static final String REDLASER_CAMERA_PREVIEW_VIEW_TAG = "RedLaser Camera Preview Tag";
    public static final String RESULT_EXTRA = "com.ebay.redlasersdk.results";
    private static final String TAG = "BarcodeScanActivity";
    private d barcodeEngine;
    public BarcodeTypes enabledTypes;
    private boolean isLicenseDialogVisible;
    private Rect mActiveRect;
    private boolean mCreatedPreviewParentView;
    private int mCurrentApiVersion;
    private FrameLayout mPreviewParentView;
    private int mRequestedCameraIndex;
    private String mRequestedOrientation;
    private int performanceFoundBarcodes;
    private long sessionStartTime;
    private Handler statusUpdateHandler;
    private final Runnable statusUpdateRunnable = new Runnable() {

        final BarcodeScanActivity this$0;

        public void run()
        {
            if (c.a() == RLSDK.c.c.c)
            {
                denyDecode("Unregistered SDK Limit Reached");
            } else
            if (c.a() == RLSDK.c.c.e)
            {
                denyDecode("RedLaser Error");
            } else
            {
                HashMap hashmap = barcodeEngine.b();
                Set set = (Set)hashmap.get("FoundBarcodes");
                Matrix matrix = g.get().cameraToPreviewMatrix();
                for (Iterator iterator = set.iterator(); iterator.hasNext();)
                {
                    BarcodeResult barcoderesult = (BarcodeResult)iterator.next();
                    float af[] = new float[2];
                    int i = 0;
                    while (i < barcoderesult.barcodeLocation.size()) 
                    {
                        PointF pointf = (PointF)barcoderesult.barcodeLocation.get(i);
                        af[0] = pointf.x;
                        af[1] = pointf.y;
                        matrix.mapPoints(af);
                        pointf.set(af[0], af[1]);
                        i++;
                    }
                }

                if (set.size() != performanceFoundBarcodes)
                {
                    int i = ((java.util) (this)). + 1;
                    (new StringBuilder("Calling StatusUpdate with ")).append(performanceFoundBarcodes).append(" barcodes.").toString();
                }
                onScanStatusUpdate(hashmap);
            }
            statusUpdateHandler.postDelayed(this, 200L);
        }

            
            {
                this$0 = BarcodeScanActivity.this;
                super();
            }
    };

    public BarcodeScanActivity()
    {
        enabledTypes = new BarcodeTypes();
        mPreviewParentView = null;
        mCreatedPreviewParentView = false;
        isLicenseDialogVisible = false;
        performanceFoundBarcodes = 0;
        statusUpdateHandler = new Handler();
        enabledTypes.changeListener = this;
        mRequestedCameraIndex = 0;
        mRequestedOrientation = "orientationPortrait";
        mCurrentApiVersion = android.os.Build.VERSION.SDK_INT;
    }

    private final void denyDecode(String s)
    {
        setRequestedOrientation(1);
        if (!isLicenseDialogVisible)
        {
            (new android.app.AlertDialog.Builder(this)).setTitle(s).setMessage("To continue developing with the RedLaser SDK, purchase a developer account at redlaser.com.").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final BarcodeScanActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    isLicenseDialogVisible = false;
                    doneScanning();
                }

            
            {
                this$0 = BarcodeScanActivity.this;
                super();
            }
            }).setCancelable(false).show();
            isLicenseDialogVisible = true;
        }
    }

    private final void displayFrameworkBugMessageAndExit()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("RedLaser");
        builder.setMessage("Sorry, the Android camera encountered a problem. You may need to restart the device.");
        builder.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final BarcodeScanActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = BarcodeScanActivity.this;
                super();
            }
        });
        builder.show();
    }

    private final void initCamera(FrameLayout framelayout)
    {
        try
        {
            g.get().setSelectedCameraIndex(mRequestedCameraIndex);
            g.get().openDriver(this, framelayout);
            g.get().setPreviewFrameHandler(barcodeEngine);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            displayFrameworkBugMessageAndExit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            Log.e("BarcodeScanActivity", framelayout.toString());
        }
        displayFrameworkBugMessageAndExit();
    }

    protected void doneScanning()
    {
        Set set = (Set)barcodeEngine.b().get("FoundBarcodes");
        Object obj = new Intent();
        if (c.a() == RLSDK.c.c.c || c.a() == RLSDK.c.c.e)
        {
            setResult(0, ((Intent) (obj)));
        } else
        {
            ((Intent) (obj)).putParcelableArrayListExtra("com.ebay.redlasersdk.results", new ArrayList(set));
            setResult(-1, ((Intent) (obj)));
            double d1 = (double)(SystemClock.uptimeMillis() - sessionStartTime) / 1000D;
            obj = new HashMap();
            ((HashMap) (obj)).put("numFinds", String.format("%d", new Object[] {
                Integer.valueOf(set.size())
            }));
            ((HashMap) (obj)).put("dur", String.format("%.2f", new Object[] {
                Double.valueOf(d1)
            }));
            b.a("ANDRSDK.SCAN_SESSION_FINISHED", ((Map) (obj)));
        }
        finish();
    }

    protected void enabledBarcodeTypesChanged()
    {
        barcodeEngine.a(enabledTypes);
    }

    public String getOrientationSetting()
    {
        return "orientationPortrait";
    }

    protected FrameLayout getPreviewView()
    {
        return null;
    }

    protected boolean getTorch()
    {
        return g.get().getTorch();
    }

    protected boolean isTorchAvailable()
    {
        return g.get().isTorchAvailable();
    }

    public void onBackPressed()
    {
        doneScanning();
    }

    public void onCameraError(int i)
    {
        onError(i);
    }

    public void onCameraPreviewStarted()
    {
        if (mActiveRect != null && !mActiveRect.isEmpty())
        {
            setActiveRect(mActiveRect);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mRequestedOrientation = getOrientationSetting();
        if (mRequestedOrientation == null)
        {
            mRequestedOrientation = "orientationPortrait";
        }
        if (mCurrentApiVersion < 8 || mRequestedOrientation.equals("orientationLandscape"))
        {
            setRequestedOrientation(0);
        } else
        {
            setRequestedOrientation(1);
        }
        p.a(getContentResolver());
        c.a(this);
        getWindow().addFlags(128);
        bundle = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(bundle);
        barcodeEngine = new d(enabledTypes, this);
        g.init(getApplication());
        mActiveRect = new Rect();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (barcodeEngine != null)
        {
            barcodeEngine.a();
        }
    }

    protected void onError(int i)
    {
    }

    protected void onPause()
    {
        super.onPause();
        (new StringBuilder("onPause, object:")).append(this).toString();
        statusUpdateHandler.removeCallbacks(statusUpdateRunnable);
        if (g.get() != null)
        {
            g.get().stopPreview(this);
            g.get().closeDriver(this);
        }
    }

    protected void onResume()
    {
        super.onResume();
        (new StringBuilder("onResume, object:")).append(this).toString();
        initCamera(mPreviewParentView);
        statusUpdateHandler.removeCallbacks(statusUpdateRunnable);
        statusUpdateHandler.postDelayed(statusUpdateRunnable, 200L);
        sessionStartTime = SystemClock.uptimeMillis();
    }

    protected abstract void onScanStatusUpdate(Map map);

    protected void onStart()
    {
        ViewGroup viewgroup;
label0:
        {
            super.onStart();
            (new StringBuilder("onStart, object:")).append(this).toString();
            barcodeEngine.a = enabledTypes;
            if (mPreviewParentView == null)
            {
                viewgroup = (ViewGroup)findViewById(0x1020002);
                android.view.View view = viewgroup.findViewWithTag("RedLaser Camera Preview Tag");
                Object obj = view;
                if (view == null)
                {
                    obj = getPreviewView();
                }
                if (obj == null || !(obj instanceof FrameLayout))
                {
                    break label0;
                }
                mPreviewParentView = (FrameLayout)obj;
                mCreatedPreviewParentView = false;
            }
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        mPreviewParentView = new FrameLayout(this);
        int i = viewgroup.getChildCount();
        viewgroup.addView(mPreviewParentView, i - 1, layoutparams);
        mCreatedPreviewParentView = true;
    }

    protected void onStop()
    {
        super.onStop();
        (new StringBuilder("onStop, object:")).append(this).toString();
        if (mCreatedPreviewParentView)
        {
            ((ViewGroup)findViewById(0x1020002)).removeView(mPreviewParentView);
        }
        mPreviewParentView = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if ((motionevent.getAction() & 1) != 0 && motionevent.getPointerCount() == 1 && motionevent.getEventTime() - motionevent.getDownTime() < 500L)
        {
            (new StringBuilder("touch event at x=")).append(motionevent.getX()).append(" y=").append(motionevent.getY()).toString();
            if (mPreviewParentView != null)
            {
                int ai[] = new int[2];
                mPreviewParentView.getLocationOnScreen(ai);
                int i = (int)motionevent.getX() - ai[0];
                int j = (int)motionevent.getY() - ai[1];
                if (i >= 0 && j >= 0 && i <= mPreviewParentView.getWidth() && j <= mPreviewParentView.getHeight())
                {
                    g.get().onTapEvent(i, j);
                }
                return true;
            }
        }
        return false;
    }

    protected void requestCameraIndex(int i)
    {
        mRequestedCameraIndex = i;
    }

    protected void requestImageData()
    {
        g.get().takePicture();
    }

    protected void setActiveRect(Rect rect)
    {
        mActiveRect = new Rect(rect);
        Matrix matrix = g.get().previewToCameraMatix();
        if (matrix != null)
        {
            rect = new RectF(rect);
            matrix.mapRect(rect);
            barcodeEngine.a(rect);
        }
    }

    protected void setTorch(boolean flag)
    {
        g.get().setTorch(flag);
    }





/*
    static int access$204(BarcodeScanActivity barcodescanactivity)
    {
        int i = barcodescanactivity.performanceFoundBarcodes + 1;
        barcodescanactivity.performanceFoundBarcodes = i;
        return i;
    }

*/



/*
    static boolean access$402(BarcodeScanActivity barcodescanactivity, boolean flag)
    {
        barcodescanactivity.isLicenseDialogVisible = flag;
        return flag;
    }

*/
}
