// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzby, zzbu, zzbj, zzgj, 
//            zzbh, zzip, zzbi, zzlv

public class zzbk extends Thread
{
    class zza
    {

        final zzbk zzrW;
        final int zzsb;
        final int zzsc;

        zza(int i, int j)
        {
            zzrW = zzbk.this;
            super();
            zzsb = i;
            zzsc = j;
        }
    }


    private boolean mStarted;
    private boolean zzam;
    private final Object zzpc = new Object();
    private final int zzrC;
    private final int zzrE;
    private boolean zzrO;
    private final zzbj zzrP;
    private final zzbi zzrQ;
    private final zzgj zzrR;
    private final int zzrS;
    private final int zzrT;
    private final int zzrU;

    public zzbk(zzbj zzbj1, zzbi zzbi1, zzgj zzgj1)
    {
        mStarted = false;
        zzrO = false;
        zzam = false;
        zzrP = zzbj1;
        zzrQ = zzbi1;
        zzrR = zzgj1;
        zzrC = ((Integer)zzby.zzuF.get()).intValue();
        zzrT = ((Integer)zzby.zzuG.get()).intValue();
        zzrE = ((Integer)zzby.zzuH.get()).intValue();
        zzrU = ((Integer)zzby.zzuI.get()).intValue();
        zzrS = ((Integer)zzby.zzuJ.get()).intValue();
        setName("ContentFetchTask");
    }

    public void run()
    {
_L11:
        if (zzam)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!zzcu()) goto _L2; else goto _L1
_L1:
        Object obj = zzrP.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            zzb.zzaC("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzb("Error in ContentFetchTask", ((Throwable) (obj)));
            zzrR.zza(((Throwable) (obj)), true);
        }
_L8:
        obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = zzrO;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            zzb.zzaC("ContentFetchTask: waiting");
            zzpc.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        zza(((Activity) (obj)));
_L9:
        Thread.sleep(zzrS * 1000);
          goto _L8
_L2:
        zzb.zzaC("ContentFetchTask: sleeping");
        zzcw();
          goto _L9
_L6:
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L11; else goto _L10
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L10:
    }

    public void wakeup()
    {
        synchronized (zzpc)
        {
            zzrO = false;
            zzpc.notifyAll();
            zzb.zzaC("ContentFetchThread: wakeup");
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    zza zza(View view, zzbh zzbh1)
    {
        int i = 0;
        if (view == null)
        {
            return new zza(0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText))
        {
            view = ((TextView)view).getText();
            if (!TextUtils.isEmpty(view))
            {
                zzbh1.zzw(view.toString());
                return new zza(1, 0);
            } else
            {
                return new zza(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof zzip))
        {
            zzbh1.zzcp();
            if (zza((WebView)view, zzbh1))
            {
                return new zza(0, 1);
            } else
            {
                return new zza(0, 0);
            }
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j = 0;
            int k = 0;
            for (; i < view.getChildCount(); i++)
            {
                zza zza1 = zza(view.getChildAt(i), zzbh1);
                k += zza1.zzsb;
                j += zza1.zzsc;
            }

            return new zza(k, j);
        } else
        {
            return new zza(0, 0);
        }
    }

    void zza(Activity activity)
    {
        if (activity != null)
        {
            Object obj = null;
            View view = obj;
            if (activity.getWindow() != null)
            {
                view = obj;
                if (activity.getWindow().getDecorView() != null)
                {
                    view = activity.getWindow().getDecorView().findViewById(0x1020002);
                }
            }
            if (view != null)
            {
                zzf(view);
                return;
            }
        }
    }

    void zza(zzbh zzbh1, WebView webview, String s)
    {
        zzbh1.zzco();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzbh1.zzv((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (zzbh1.zzcl())
        {
            zzrQ.zzb(zzbh1);
            return;
        }
        break MISSING_BLOCK_LABEL_116;
        zzbh1.zzv(s);
        if (true) goto _L2; else goto _L1
_L1:
        zzbh1;
        zzb.zzaC("Json string may be malformed.");
        return;
        zzbh1;
        zzb.zza("Failed to get webview content.", zzbh1);
        zzrR.zza(zzbh1, true);
    }

    boolean zza(android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo)
    {
        return runningappprocessinfo.importance == 100;
    }

    boolean zza(WebView webview, zzbh zzbh1)
    {
        if (!zzlv.zzpV())
        {
            return false;
        } else
        {
            zzbh1.zzcp();
            webview.post(new Runnable(zzbh1, webview) {

                final zzbk zzrW;
                ValueCallback zzrX;
                final zzbh zzrY;
                final WebView zzrZ;

                public void run()
                {
                    if (!zzrZ.getSettings().getJavaScriptEnabled())
                    {
                        break MISSING_BLOCK_LABEL_26;
                    }
                    zzrZ.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzrX);
                    return;
                    Throwable throwable;
                    throwable;
                    zzrX.onReceiveValue("");
                    return;
                }

            
            {
                zzrW = zzbk.this;
                zzrY = zzbh1;
                zzrZ = webview;
                super();
                zzrX = new _cls1(this);
            }
            });
            return true;
        }
    }

    public void zzct()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!mStarted)
                {
                    break label0;
                }
                zzb.zzaC("Content hash thread already started, quiting...");
            }
            return;
        }
        mStarted = true;
        obj;
        JVM INSTR monitorexit ;
        start();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean zzcu()
    {
        Context context;
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            context = zzrP.getContext();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        if (context == null)
        {
            return false;
        }
        obj = (ActivityManager)context.getSystemService("activity");
        keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
        if (obj == null || keyguardmanager == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_126;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (!zza(runningappprocessinfo) || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = zzr(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

    public zzbh zzcv()
    {
        return zzrQ.zzcs();
    }

    public void zzcw()
    {
        synchronized (zzpc)
        {
            zzrO = true;
            zzb.zzaC((new StringBuilder()).append("ContentFetchThread: paused, mPause = ").append(zzrO).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzcx()
    {
        return zzrO;
    }

    boolean zzf(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View zzrV;
                final zzbk zzrW;

                public void run()
                {
                    zzrW.zzg(zzrV);
                }

            
            {
                zzrW = zzbk.this;
                zzrV = view;
                super();
            }
            });
            return true;
        }
    }

    void zzg(View view)
    {
        zzbh zzbh1;
        zzbh1 = new zzbh(zzrC, zzrT, zzrE, zzrU);
        view = zza(view, zzbh1);
        zzbh1.zzcq();
        if (((zza) (view)).zzsb == 0 && ((zza) (view)).zzsc == 0)
        {
            return;
        }
        try
        {
            if ((((zza) (view)).zzsc != 0 || zzbh1.zzcr() != 0) && (((zza) (view)).zzsc != 0 || !zzrQ.zza(zzbh1)))
            {
                zzrQ.zzc(zzbh1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzb("Exception in fetchContentOnUIThread", view);
            zzrR.zza(view, true);
        }
        return;
    }

    boolean zzr(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        if (context == null)
        {
            return false;
        } else
        {
            return context.isScreenOn();
        }
    }

    // Unreferenced inner class com/google/android/gms/internal/zzbk$2$1

/* anonymous class */
    class _cls1
        implements ValueCallback
    {

        final _cls2 zzsa;

        public void onReceiveValue(Object obj)
        {
            zzy((String)obj);
        }

        public void zzy(String s)
        {
            zzsa.zzrW.zza(zzsa.zzrY, zzsa.zzrZ, s);
        }

            
            {
                zzsa = _pcls2;
                super();
            }
    }

}
