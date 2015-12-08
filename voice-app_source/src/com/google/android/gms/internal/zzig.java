// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzhl, zzhm, zzlk, 
//            zzih, zzhc, zzie, zzdq, 
//            zzan, zzeu

public class zzig extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzid
{
    public static class zza extends MutableContextWrapper
    {

        private Activity zzHy;
        private Context zzHz;
        private Context zzqw;

        public Object getSystemService(String s)
        {
            return zzHz.getSystemService(s);
        }

        public void setBaseContext(Context context)
        {
            zzqw = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            zzHy = activity;
            zzHz = context;
            super.setBaseContext(zzqw);
        }

        public void startActivity(Intent intent)
        {
            if (zzHy != null && !zzlk.isAtLeastL())
            {
                zzHy.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                zzqw.startActivity(intent);
                return;
            }
        }

        public Activity zzgB()
        {
            return zzHy;
        }

        public Context zzgC()
        {
            return zzHz;
        }

        public zza(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private final zzie zzBd;
    private Boolean zzFO;
    private final zza zzHo;
    private zzc zzHp;
    private boolean zzHq;
    private boolean zzHr;
    private boolean zzHs;
    private boolean zzHt;
    private boolean zzHu;
    private int zzHv;
    private zzc zzHw;
    boolean zzHx;
    private final VersionInfoParcel zzoM;
    private final WindowManager zzqF = (WindowManager)getContext().getSystemService("window");
    private final Object zzqt = new Object();
    private final zzan zzvA;
    private AdSizeParcel zzxT;
    private int zzyW;
    private int zzyX;
    private int zzyZ;
    private int zzza;

    protected zzig(zza zza1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan1, VersionInfoParcel versioninfoparcel)
    {
        super(zza1);
        zzyX = -1;
        zzyW = -1;
        zzyZ = -1;
        zzza = -1;
        zzHo = zza1;
        zzxT = adsizeparcel;
        zzHs = flag;
        zzHu = false;
        zzHv = -1;
        zzvA = zzan1;
        zzoM = versioninfoparcel;
        setBackgroundColor(0);
        adsizeparcel = getSettings();
        adsizeparcel.setJavaScriptEnabled(true);
        adsizeparcel.setSavePassword(false);
        adsizeparcel.setSupportMultipleWindows(true);
        adsizeparcel.setJavaScriptCanOpenWindowsAutomatically(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            adsizeparcel.setMixedContentMode(0);
        }
        zzo.zzbv().zza(zza1, versioninfoparcel.zzGG, adsizeparcel);
        zzo.zzbx().zza(getContext(), adsizeparcel);
        setDownloadListener(this);
        zzBd = zzo.zzbx().zzb(this, flag1);
        setWebViewClient(zzBd);
        setWebChromeClient(zzo.zzbx().zzf(this));
        zzgX();
        if (zzlk.zzoW())
        {
            addJavascriptInterface(new zzih(this), "googleAdsJsInterface");
        }
    }

    static zzig zzb(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan1, VersionInfoParcel versioninfoparcel)
    {
        return new zzig(new zza(context), adsizeparcel, flag, flag1, zzan1, versioninfoparcel);
    }

    private void zzgU()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        zzFO = zzo.zzby().zzgc();
        boolean1 = zzFO;
        if (boolean1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        evaluateJavascript("(function(){})()", null);
        zzb(Boolean.valueOf(true));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        zzb(Boolean.valueOf(false));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void zzgV()
    {
        Activity activity = zzgB();
        if (zzHu && activity != null)
        {
            zzo.zzbx().zzb(activity, this);
            zzHu = false;
        }
    }

    private void zzgX()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzHs && !zzxT.zzsn) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Disabling hardware acceleration on an overlay.");
        zzgY();
_L5:
        return;
_L4:
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Enabling hardware acceleration on an overlay.");
        zzgZ();
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                break label0;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Disabling hardware acceleration on an AdView.");
            zzgY();
        }
          goto _L5
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Enabling hardware acceleration on an AdView.");
        zzgZ();
          goto _L5
    }

    private void zzgY()
    {
        synchronized (zzqt)
        {
            if (!zzHt)
            {
                zzo.zzbx().zzm(this);
            }
            zzHt = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzgZ()
    {
        synchronized (zzqt)
        {
            if (zzHt)
            {
                zzo.zzbx().zzl(this);
            }
            zzHt = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void destroy()
    {
label0:
        {
            synchronized (zzqt)
            {
                zzgV();
                if (zzHp != null)
                {
                    zzHp.close();
                    zzHp.onDestroy();
                    zzHp = null;
                }
                zzBd.reset();
                if (!zzHr)
                {
                    break label0;
                }
            }
            return;
        }
        zzo.zzbH().zza(this);
        zzHr = true;
        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Initiating WebView self destruct sequence in 3...");
        zzBd.zzgN();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void evaluateJavascript(String s, ValueCallback valuecallback)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (valuecallback == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        valuecallback.onReceiveValue(null);
        obj;
        JVM INSTR monitorexit ;
        return;
        super.evaluateJavascript(s, valuecallback);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int getRequestedOrientation()
    {
        int i;
        synchronized (zzqt)
        {
            i = zzHv;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public WebView getWebView()
    {
        return this;
    }

    public boolean isDestroyed()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzHr;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void loadData(String s, String s1, String s2)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s, s1, s2);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadUrl(String s)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void onAttachedToWindow()
    {
        synchronized (zzqt)
        {
            super.onAttachedToWindow();
            if (!isDestroyed())
            {
                zzHx = true;
                if (zzBd.zzbU())
                {
                    zzgW();
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onDetachedFromWindow()
    {
        synchronized (zzqt)
        {
            if (!isDestroyed())
            {
                zzgV();
                zzHx = false;
            }
            super.onDetachedFromWindow();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        try
        {
            s1 = new Intent("android.intent.action.VIEW");
            s1.setDataAndType(Uri.parse(s), s3);
            getContext().startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
        }
    }

    protected void onDraw(Canvas canvas)
    {
        while (isDestroyed() || android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) 
        {
            return;
        }
        super.onDraw(canvas);
    }

    public void onGlobalLayout()
    {
        boolean flag = zzgT();
        zzc zzc1 = zzgD();
        if (zzc1 != null && flag)
        {
            zzc1.zzev();
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l;
label0:
        {
            l = 0x7fffffff;
            synchronized (zzqt)
            {
                if (!isDestroyed())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !zzHs)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        super.onMeasure(i, j);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!zzxT.zzsn)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        zzqF.getDefaultDisplay().getMetrics(displaymetrics);
        setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
        obj;
        JVM INSTR monitorexit ;
        return;
        int k;
        int i1;
        int j1;
        int k1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        k = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        i1 = android.view.View.MeasureSpec.getSize(j);
        break MISSING_BLOCK_LABEL_138;
_L4:
        if (zzxT.widthPixels <= i && zzxT.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        float f = zzHo.getResources().getDisplayMetrics().density;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)zzxT.widthPixels / f)).append("x").append((int)((float)zzxT.heightPixels / f)).append(" dp, but only has ").append((int)((float)k / f)).append("x").append((int)((float)i1 / f)).append(" dp.").toString());
        if (getVisibility() != 8)
        {
            setVisibility(4);
        }
        setMeasuredDimension(0, 0);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (getVisibility() != 8)
        {
            setVisibility(0);
        }
        setMeasuredDimension(zzxT.widthPixels, zzxT.heightPixels);
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 != 0x80000000 && k1 != 0x40000000)
        {
            i = 0x7fffffff;
        } else
        {
            i = k;
        }
        if (j1 != 0x80000000)
        {
            j = l;
            if (j1 != 0x40000000)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = i1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        if (isDestroyed())
        {
            return;
        }
        try
        {
            super.onPause();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not pause webview.", exception);
        }
    }

    public void onResume()
    {
        if (isDestroyed())
        {
            return;
        }
        try
        {
            super.onResume();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not resume webview.", exception);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (zzvA != null)
        {
            zzvA.zza(motionevent);
        }
        if (isDestroyed())
        {
            return false;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setContext(Context context)
    {
        zzHo.setBaseContext(context);
    }

    public void setRequestedOrientation(int i)
    {
        synchronized (zzqt)
        {
            zzHv = i;
            if (zzHp != null)
            {
                zzHp.setRequestedOrientation(zzHv);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stopLoading()
    {
        if (isDestroyed())
        {
            return;
        }
        try
        {
            super.stopLoading();
            return;
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not stop loading webview.", exception);
        }
    }

    public void zzB(boolean flag)
    {
        synchronized (zzqt)
        {
            zzHs = flag;
            zzgX();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzC(boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzHp == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzHp.zza(zzBd.zzbU(), flag);
_L2:
        return;
        zzHq = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, AdSizeParcel adsizeparcel)
    {
        synchronized (zzqt)
        {
            zzgV();
            setContext(context);
            zzHp = null;
            zzxT = adsizeparcel;
            zzHs = false;
            zzHq = false;
            zzHv = -1;
            zzo.zzbx().zzb(this);
            loadUrl("about:blank");
            zzBd.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        synchronized (zzqt)
        {
            zzxT = adsizeparcel;
            requestLayout();
        }
        return;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzc zzc1)
    {
        synchronized (zzqt)
        {
            zzHp = zzc1;
        }
        return;
        zzc1;
        obj;
        JVM INSTR monitorexit ;
        throw zzc1;
    }

    protected void zza(String s, ValueCallback valuecallback)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed()) goto _L2; else goto _L1
_L1:
        evaluateJavascript(s, valuecallback);
_L4:
        return;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (valuecallback == null) goto _L4; else goto _L3
_L3:
        valuecallback.onReceiveValue(null);
          goto _L4
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(String s, String s1)
    {
        zzaF((new StringBuilder()).append(s).append("(").append(s1).append(");").toString());
    }

    public void zza(String s, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject;
        if (jsonobject == null)
        {
            jsonobject1 = new JSONObject();
        }
        zza(s, jsonobject1.toString());
    }

    public void zzaD(String s)
    {
        synchronized (zzqt)
        {
            super.loadUrl(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzaE(String s)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzaF(String s)
    {
        if (zzlk.zzoX())
        {
            if (zzgc() == null)
            {
                zzgU();
            }
            if (zzgc().booleanValue())
            {
                zza(s, ((ValueCallback) (null)));
                return;
            } else
            {
                zzaE((new StringBuilder()).append("javascript:").append(s).toString());
                return;
            }
        } else
        {
            zzaE((new StringBuilder()).append("javascript:").append(s).toString());
            return;
        }
    }

    public AdSizeParcel zzaN()
    {
        AdSizeParcel adsizeparcel;
        synchronized (zzqt)
        {
            adsizeparcel = zzxT;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(zzc zzc1)
    {
        synchronized (zzqt)
        {
            zzHw = zzc1;
        }
        return;
        zzc1;
        obj;
        JVM INSTR monitorexit ;
        throw zzc1;
    }

    void zzb(Boolean boolean1)
    {
        zzFO = boolean1;
        zzo.zzby().zzb(boolean1);
    }

    public void zzb(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject;
        if (jsonobject == null)
        {
            obj = new JSONObject();
        }
        jsonobject = ((JSONObject) (obj)).toString();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AFMA_ReceiveMessage('");
        ((StringBuilder) (obj)).append(s);
        ((StringBuilder) (obj)).append("'");
        ((StringBuilder) (obj)).append(",");
        ((StringBuilder) (obj)).append(jsonobject);
        ((StringBuilder) (obj)).append(");");
        com.google.android.gms.ads.internal.util.client.zzb.zzaB((new StringBuilder()).append("Dispatching AFMA event: ").append(((StringBuilder) (obj)).toString()).toString());
        zzaF(((StringBuilder) (obj)).toString());
    }

    public void zzc(String s, Map map)
    {
        try
        {
            map = zzo.zzbv().zzy(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not convert parameters to JSON.");
            return;
        }
        zzb(s, map);
    }

    public void zzew()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzoM.zzGG);
        zzc("onshow", hashmap);
    }

    public void zzgA()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzoM.zzGG);
        zzc("onhide", hashmap);
    }

    public Activity zzgB()
    {
        return zzHo.zzgB();
    }

    public Context zzgC()
    {
        return zzHo.zzgC();
    }

    public zzc zzgD()
    {
        zzc zzc1;
        synchronized (zzqt)
        {
            zzc1 = zzHp;
        }
        return zzc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzc zzgE()
    {
        zzc zzc1;
        synchronized (zzqt)
        {
            zzc1 = zzHw;
        }
        return zzc1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzie zzgF()
    {
        return zzBd;
    }

    public boolean zzgG()
    {
        return zzHq;
    }

    public zzan zzgH()
    {
        return zzvA;
    }

    public VersionInfoParcel zzgI()
    {
        return zzoM;
    }

    public boolean zzgJ()
    {
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzHs;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzgK()
    {
        synchronized (zzqt)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("Destroying WebView!");
            super.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzgL()
    {
        synchronized (zzqt)
        {
            zzgW();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzgT()
    {
        if (zzgF().zzbU())
        {
            DisplayMetrics displaymetrics = zzo.zzbv().zza(zzqF);
            int k = zzk.zzcA().zzb(displaymetrics, displaymetrics.widthPixels);
            int l = zzk.zzcA().zzb(displaymetrics, displaymetrics.heightPixels);
            Activity activity = zzgB();
            int i;
            int j;
            if (activity == null || activity.getWindow() == null)
            {
                j = l;
                i = k;
            } else
            {
                int ai[] = zzo.zzbv().zzg(activity);
                i = zzk.zzcA().zzb(displaymetrics, ai[0]);
                j = zzk.zzcA().zzb(displaymetrics, ai[1]);
            }
            if (zzyW != k || zzyX != l || zzyZ != i || zzza != j)
            {
                boolean flag;
                if (zzyW != k || zzyX != l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzyW = k;
                zzyX = l;
                zzyZ = i;
                zzza = j;
                (new zzeu(this)).zza(k, l, i, j, displaymetrics.density, zzqF.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    void zzgW()
    {
        Activity activity = zzgB();
        if (!zzHu && activity != null && zzHx)
        {
            zzo.zzbv().zza(activity, this);
            zzHu = true;
        }
    }

    Boolean zzgc()
    {
        Boolean boolean1;
        synchronized (zzqt)
        {
            boolean1 = zzFO;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzv(int i)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i));
        hashmap.put("version", zzoM.zzGG);
        zzc("onhide", hashmap);
    }
}
