// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.os.Bundle;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.wmservice.ItemImageDownloaderFactory;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.utils.WLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptImagePresenter

public class SaverReceiptImageActivity extends FullScreenActivity
{

    public static final String EXTRA_ERECEIPT_UUID = "EXTRA_ERECEIPT_UUID";
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptImageActivity.getSimpleName();
    private SaverReceiptImagePresenter mImagePresenter;

    public SaverReceiptImageActivity()
    {
    }

    private static int getMaxSize()
    {
        int i = 2048;
        EGL10 egl10 = (EGL10)EGLContext.getEGL();
        int j = i;
        if (egl10 != null)
        {
            javax.microedition.khronos.egl.EGLDisplay egldisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            j = i;
            if (egldisplay != EGL10.EGL_NO_DISPLAY)
            {
                j = i;
                if (egl10.eglInitialize(egldisplay, new int[2]))
                {
                    int ai[] = new int[1];
                    EGLConfig aeglconfig[] = new EGLConfig[1];
                    egl10.eglChooseConfig(egldisplay, new int[] {
                        12344
                    }, aeglconfig, 1, ai);
                    javax.microedition.khronos.egl.EGLSurface eglsurface = egl10.eglCreatePbufferSurface(egldisplay, aeglconfig[0], new int[] {
                        12375, 1, 12374, 1, 12344
                    });
                    j = i;
                    if (!eglsurface.equals(EGL10.EGL_NO_SURFACE))
                    {
                        EGLContext eglcontext = egl10.eglCreateContext(egldisplay, aeglconfig[0], EGL10.EGL_NO_CONTEXT, new int[] {
                            12344
                        });
                        j = i;
                        if (!eglcontext.equals(EGL10.EGL_NO_CONTEXT))
                        {
                            int ai1[] = new int[1];
                            if (!eglcontext.equals(egl10.eglGetCurrentContext()))
                            {
                                egl10.eglMakeCurrent(egldisplay, eglsurface, eglsurface, eglcontext);
                            }
                            ((GL10)eglcontext.getGL()).glGetIntegerv(3379, ai1, 0);
                            if (ai1[0] != 0)
                            {
                                i = ai1[0];
                            } else
                            {
                                WLog.w(TAG, "Could not get max texture size from platform. Defaulting to 2048.");
                            }
                            egl10.eglDestroyContext(egldisplay, eglcontext);
                            j = i;
                        }
                        egl10.eglDestroySurface(egldisplay, eglsurface);
                    }
                }
            }
        }
        return j;
    }

    private void handleIntent(Intent intent)
    {
        if (intent != null && intent.hasExtra("EXTRA_ERECEIPT_UUID"))
        {
            intent = intent.getStringExtra("EXTRA_ERECEIPT_UUID");
            EReceiptManager.get().getReceipt(intent, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                final SaverReceiptImageActivity this$0;

                public void onResult(EReceipt ereceipt)
                {
                    if (!isFinishing())
                    {
                        mImagePresenter.setReceipt(ereceipt);
                    }
                }

                public volatile void onResult(Object obj)
                {
                    onResult((EReceipt)obj);
                }

            
            {
                this$0 = SaverReceiptImageActivity.this;
                super();
            }
            });
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        } else
        {
            bundle = ItemImageDownloaderFactory.createImageDownloader(this);
            bundle.setMaxSize(getMaxSize());
            mImagePresenter = new SaverReceiptImagePresenter(this, bundle);
            getPresenterStack().pushPresenter(mImagePresenter, false);
            handleIntent(getIntent());
            return;
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleIntent(intent);
    }


}
