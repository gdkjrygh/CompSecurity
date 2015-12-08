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
//            zzbz, zzbv, zzbj, zzgc, 
//            zzbh, zzid, zzbi, zzlk

public class zzbk extends Thread
{
    class zza
    {

        final zzbk zzrD;
        final int zzrI;
        final int zzrJ;

        zza(int i, int j)
        {
            zzrD = zzbk.this;
            super();
            zzrI = i;
            zzrJ = j;
        }
    }


    private boolean mStarted;
    private boolean zzam;
    private final Object zzqt = new Object();
    private final int zzrA;
    private final int zzrB;
    private final int zzrj;
    private final int zzrl;
    private boolean zzrv;
    private final zzbj zzrw;
    private final zzbi zzrx;
    private final zzgc zzry;
    private final int zzrz;

    public zzbk(zzbj zzbj1, zzbi zzbi1, zzgc zzgc1)
    {
        mStarted = false;
        zzrv = false;
        zzam = false;
        zzrw = zzbj1;
        zzrx = zzbi1;
        zzry = zzgc1;
        zzrj = ((Integer)zzbz.zzud.get()).intValue();
        zzrA = ((Integer)zzbz.zzue.get()).intValue();
        zzrl = ((Integer)zzbz.zzuf.get()).intValue();
        zzrB = ((Integer)zzbz.zzug.get()).intValue();
        zzrz = ((Integer)zzbz.zzuh.get()).intValue();
        setName("ContentFetchTask");
    }

    public void run()
    {
_L11:
        if (zzam)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!zzcq()) goto _L2; else goto _L1
_L1:
        Object obj = zzrw.getActivity();
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            zzb.zzay("ContentFetchThread: no activity");
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzb("Error in ContentFetchTask", ((Throwable) (obj)));
            zzry.zza(((Throwable) (obj)), true);
        }
_L8:
        obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
_L7:
        boolean flag = zzrv;
        if (!flag) goto _L6; else goto _L5
_L5:
        Exception exception;
        try
        {
            zzb.zzay("ContentFetchTask: waiting");
            zzqt.wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L7; else goto _L6
_L4:
        zza(((Activity) (obj)));
_L9:
        Thread.sleep(zzrz * 1000);
          goto _L8
_L2:
        zzb.zzay("ContentFetchTask: sleeping");
        zzcs();
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
        synchronized (zzqt)
        {
            zzrv = false;
            zzqt.notifyAll();
            zzb.zzay("ContentFetchThread: wakeup");
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
                zzbh1.zzv(view.toString());
                return new zza(1, 0);
            } else
            {
                return new zza(0, 0);
            }
        }
        if ((view instanceof WebView) && !(view instanceof zzid))
        {
            zzbh1.zzcl();
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
                k += zza1.zzrI;
                j += zza1.zzrJ;
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
        zzbh1.zzck();
        if (!TextUtils.isEmpty(s))
        {
            s = (new JSONObject(s)).optString("text");
            if (TextUtils.isEmpty(webview.getTitle()))
            {
                break MISSING_BLOCK_LABEL_83;
            }
            zzbh1.zzu((new StringBuilder()).append(webview.getTitle()).append("\n").append(s).toString());
        }
_L2:
        if (zzbh1.zzch())
        {
            zzrx.zzb(zzbh1);
            return;
        }
        break MISSING_BLOCK_LABEL_116;
        zzbh1.zzu(s);
        if (true) goto _L2; else goto _L1
_L1:
        zzbh1;
        zzb.zzay("Json string may be malformed.");
        return;
        zzbh1;
        zzb.zza("Failed to get webview content.", zzbh1);
        zzry.zza(zzbh1, true);
    }

    boolean zza(android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo)
    {
        return runningappprocessinfo.importance == 100;
    }

    boolean zza(WebView webview, zzbh zzbh1)
    {
        if (!zzlk.zzoX())
        {
            return false;
        } else
        {
            zzbh1.zzcl();
            webview.post(new Runnable(zzbh1, webview) {

                final zzbk zzrD;
                ValueCallback zzrE;
                final zzbh zzrF;
                final WebView zzrG;

                public void run()
                {
                    if (!zzrG.getSettings().getJavaScriptEnabled())
                    {
                        break MISSING_BLOCK_LABEL_26;
                    }
                    zzrG.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", zzrE);
                    return;
                    Throwable throwable;
                    throwable;
                    zzrE.onReceiveValue("");
                    return;
                }

            
            {
                zzrD = zzbk.this;
                zzrF = zzbh1;
                zzrG = webview;
                super();
                zzrE = new _cls1(this);
            }
            });
            return true;
        }
    }

    public void zzcp()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!mStarted)
                {
                    break label0;
                }
                zzb.zzay("Content hash thread already started, quiting...");
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

    boolean zzcq()
    {
        Context context;
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            context = zzrw.getContext();
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

    public zzbh zzcr()
    {
        return zzrx.zzco();
    }

    public void zzcs()
    {
        synchronized (zzqt)
        {
            zzrv = true;
            zzb.zzay((new StringBuilder()).append("ContentFetchThread: paused, mPause = ").append(zzrv).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzct()
    {
        return zzrv;
    }

    boolean zzf(View view)
    {
        if (view == null)
        {
            return false;
        } else
        {
            view.post(new Runnable(view) {

                final View zzrC;
                final zzbk zzrD;

                public void run()
                {
                    zzrD.zzg(zzrC);
                }

            
            {
                zzrD = zzbk.this;
                zzrC = view;
                super();
            }
            });
            return true;
        }
    }

    void zzg(View view)
    {
        zzbh zzbh1;
        zzbh1 = new zzbh(zzrj, zzrA, zzrl, zzrB);
        view = zza(view, zzbh1);
        zzbh1.zzcm();
        if (((zza) (view)).zzrI == 0 && ((zza) (view)).zzrJ == 0)
        {
            return;
        }
        try
        {
            if ((((zza) (view)).zzrJ != 0 || zzbh1.zzcn() != 0) && (((zza) (view)).zzrJ != 0 || !zzrx.zza(zzbh1)))
            {
                zzrx.zzc(zzbh1);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzb("Exception in fetchContentOnUIThread", view);
            zzry.zza(view, true);
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

        final _cls2 zzrH;

        public void onReceiveValue(Object obj)
        {
            zzx((String)obj);
        }

        public void zzx(String s)
        {
            zzrH.zzrD.zza(zzrH.zzrF, zzrH.zzrG, s);
        }

            
            {
                zzrH = _pcls2;
                super();
            }
    }

}
