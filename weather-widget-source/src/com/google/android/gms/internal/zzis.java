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
import android.os.Handler;
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
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzip, zzhu, zzhv, zzlv, 
//            zzit, zzid, zzhl, zzdr, 
//            zziq, zzdq, zzan, zzfb, 
//            zzaz

public class zzis extends WebView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzip
{
    public static class zza extends MutableContextWrapper
    {

        private Activity zzIs;
        private Context zzJw;
        private Context zzqO;

        public Object getSystemService(String s)
        {
            return zzJw.getSystemService(s);
        }

        public void setBaseContext(Context context)
        {
            zzqO = context.getApplicationContext();
            Activity activity;
            if (context instanceof Activity)
            {
                activity = (Activity)context;
            } else
            {
                activity = null;
            }
            zzIs = activity;
            zzJw = context;
            super.setBaseContext(zzqO);
        }

        public void startActivity(Intent intent)
        {
            if (zzIs != null && !zzlv.isAtLeastL())
            {
                zzIs.startActivity(intent);
                return;
            } else
            {
                intent.setFlags(0x10000000);
                zzqO.startActivity(intent);
                return;
            }
        }

        public Activity zzgN()
        {
            return zzIs;
        }

        public Context zzgO()
        {
            return zzJw;
        }

        public zza(Context context)
        {
            super(context);
            setBaseContext(context);
        }
    }


    private String zzBm;
    private final zziq zzCq;
    private Boolean zzHi;
    private final zza zzJk;
    private zzd zzJl;
    private boolean zzJm;
    private boolean zzJn;
    private boolean zzJo;
    private boolean zzJp;
    private int zzJq;
    private boolean zzJr;
    private String zzJs;
    private zzd zzJt;
    private Map zzJu;
    private final com.google.android.gms.ads.internal.zzd zzov;
    private final VersionInfoParcel zzpa;
    private final Object zzpc = new Object();
    private zzid zzqG;
    private final WindowManager zzqX = (WindowManager)getContext().getSystemService("window");
    private final zzan zzwh;
    private AdSizeParcel zzyK;
    private int zzzQ;
    private int zzzR;
    private int zzzT;
    private int zzzU;

    protected zzis(zza zza1, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan1, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        super(zza1);
        zzJr = true;
        zzBm = "";
        zzzR = -1;
        zzzQ = -1;
        zzzT = -1;
        zzzU = -1;
        zzJk = zza1;
        zzyK = adsizeparcel;
        zzJo = flag;
        zzJq = -1;
        zzwh = zzan1;
        zzpa = versioninfoparcel;
        zzov = zzd1;
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
        zzp.zzbx().zza(zza1, versioninfoparcel.zzIz, adsizeparcel);
        zzp.zzbz().zza(getContext(), adsizeparcel);
        setDownloadListener(this);
        zzCq = zzp.zzbz().zzb(this, flag1);
        setWebViewClient(zzCq);
        setWebChromeClient(zzp.zzbz().zzf(this));
        zzhk();
        if (zzlv.zzpT())
        {
            addJavascriptInterface(new zzit(this), "googleAdsJsInterface");
        }
        zzqG = new zzid(zzJk.zzgN(), this, null);
    }

    static void zza(zzis zzis1)
    {
        zzis1.WebView.destroy();
    }

    static zzis zzb(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, zzan zzan1, VersionInfoParcel versioninfoparcel, com.google.android.gms.ads.internal.zzd zzd1)
    {
        return new zzis(new zza(context), adsizeparcel, flag, flag1, zzan1, versioninfoparcel, zzd1);
    }

    private void zzhj()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Boolean boolean1;
        zzHi = zzp.zzbA().zzgg();
        boolean1 = zzHi;
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

    private void zzhk()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzJo && !zzyK.zzsH) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Disabling hardware acceleration on an overlay.");
        zzhl();
_L5:
        return;
_L4:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Enabling hardware acceleration on an overlay.");
        zzhm();
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
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Disabling hardware acceleration on an AdView.");
            zzhl();
        }
          goto _L5
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Enabling hardware acceleration on an AdView.");
        zzhm();
          goto _L5
    }

    private void zzhl()
    {
        synchronized (zzpc)
        {
            if (!zzJp)
            {
                zzp.zzbz().zzl(this);
            }
            zzJp = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzhm()
    {
        synchronized (zzpc)
        {
            if (zzJp)
            {
                zzp.zzbz().zzk(this);
            }
            zzJp = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzhn()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzJu != null)
        {
            for (Iterator iterator = zzJu.values().iterator(); iterator.hasNext(); ((zzdr)iterator.next()).release()) { }
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void destroy()
    {
label0:
        {
            synchronized (zzpc)
            {
                zzqG.zzgE();
                if (zzJl != null)
                {
                    zzJl.close();
                    zzJl.onDestroy();
                    zzJl = null;
                }
                zzCq.reset();
                if (!zzJn)
                {
                    break label0;
                }
            }
            return;
        }
        zzp.zzbK().zza(this);
        zzhn();
        zzJn = true;
        com.google.android.gms.ads.internal.util.client.zzb.v("Initiating WebView self destruct sequence in 3...");
        zzCq.zzhd();
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
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!isDestroyed())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
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

    public String getRequestId()
    {
        String s;
        synchronized (zzpc)
        {
            s = zzBm;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getRequestedOrientation()
    {
        int i;
        synchronized (zzpc)
        {
            i = zzJq;
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
        synchronized (zzpc)
        {
            flag = zzJn;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void loadData(String s, String s1, String s2)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        super.loadData(s, s1, s2);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void loadUrl(String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        super.loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void onAttachedToWindow()
    {
        synchronized (zzpc)
        {
            super.onAttachedToWindow();
            if (!isDestroyed())
            {
                zzqG.onAttachedToWindow();
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
        synchronized (zzpc)
        {
            if (!isDestroyed())
            {
                zzqG.onDetachedFromWindow();
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
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
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
        boolean flag = zzhi();
        zzd zzd1 = zzgQ();
        if (zzd1 != null && flag)
        {
            zzd1.zzeC();
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l;
label0:
        {
            l = 0x7fffffff;
            synchronized (zzpc)
            {
                if (!isDestroyed())
                {
                    break label0;
                }
                setMeasuredDimension(0, 0);
            }
            return;
        }
        if (!isInEditMode() && !zzJo && !zzyK.zzsJ)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        super.onMeasure(i, j);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!zzyK.zzsH)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        zzqX.getDefaultDisplay().getMetrics(displaymetrics);
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
        break MISSING_BLOCK_LABEL_148;
_L4:
        if (zzyK.widthPixels <= i && zzyK.heightPixels <= j)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        float f = zzJk.getResources().getDisplayMetrics().density;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Not enough space to show ad. Needs ").append((int)((float)zzyK.widthPixels / f)).append("x").append((int)((float)zzyK.heightPixels / f)).append(" dp, but only has ").append((int)((float)k / f)).append("x").append((int)((float)i1 / f)).append(" dp.").toString());
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
        setMeasuredDimension(zzyK.widthPixels, zzyK.heightPixels);
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
        if (zzwh != null)
        {
            zzwh.zza(motionevent);
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
        zzJk.setBaseContext(context);
        zzqG.zzl(zzJk.zzgN());
    }

    public void setRequestedOrientation(int i)
    {
        synchronized (zzpc)
        {
            zzJq = i;
            if (zzJl != null)
            {
                zzJl.setRequestedOrientation(zzJq);
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

    public void zzC(boolean flag)
    {
        synchronized (zzpc)
        {
            zzJo = flag;
            zzhk();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzD(boolean flag)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzJl == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzJl.zza(zzCq.zzbY(), flag);
_L2:
        return;
        zzJm = flag;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzE(boolean flag)
    {
        synchronized (zzpc)
        {
            zzJr = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, AdSizeParcel adsizeparcel)
    {
        synchronized (zzpc)
        {
            zzqG.zzgE();
            setContext(context);
            zzJl = null;
            zzyK = adsizeparcel;
            zzJo = false;
            zzJm = false;
            zzBm = "";
            zzJq = -1;
            zzp.zzbz().zzb(this);
            loadUrl("about:blank");
            zzCq.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
            zzJr = true;
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        synchronized (zzpc)
        {
            zzyK = adsizeparcel;
            requestLayout();
        }
        return;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzd zzd1)
    {
        synchronized (zzpc)
        {
            zzJl = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    public void zza(zzaz zzaz, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            zzaz = "1";
        } else
        {
            zzaz = "0";
        }
        hashmap.put("isVisible", zzaz);
        zzc("onAdVisibilityChanged", hashmap);
    }

    protected void zza(String s, ValueCallback valuecallback)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed()) goto _L2; else goto _L1
_L1:
        evaluateJavascript(s, valuecallback);
_L4:
        return;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
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
        zzaK((new StringBuilder()).append(s).append("(").append(s1).append(");").toString());
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

    public void zzaF(String s)
    {
        synchronized (zzpc)
        {
            super.loadUrl(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzaG(String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        String s1;
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        zzBm = s1;
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzaH(String s)
    {
        synchronized (zzpc)
        {
            zzJs = s;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzaJ(String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (isDestroyed())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        loadUrl(s);
_L2:
        return;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("The webview is destroyed. Ignoring action.");
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void zzaK(String s)
    {
        if (zzlv.zzpV())
        {
            if (zzgg() == null)
            {
                zzhj();
            }
            if (zzgg().booleanValue())
            {
                zza(s, ((ValueCallback) (null)));
                return;
            } else
            {
                zzaJ((new StringBuilder()).append("javascript:").append(s).toString());
                return;
            }
        } else
        {
            zzaJ((new StringBuilder()).append("javascript:").append(s).toString());
            return;
        }
    }

    public AdSizeParcel zzaN()
    {
        AdSizeParcel adsizeparcel;
        synchronized (zzpc)
        {
            adsizeparcel = zzyK;
        }
        return adsizeparcel;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(zzd zzd1)
    {
        synchronized (zzpc)
        {
            zzJt = zzd1;
        }
        return;
        zzd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzd1;
    }

    void zzb(Boolean boolean1)
    {
        zzHi = boolean1;
        zzp.zzbA().zzb(boolean1);
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
        com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Dispatching AFMA event: ").append(((StringBuilder) (obj)).toString()).toString());
        zzaK(((StringBuilder) (obj)).toString());
    }

    public void zzc(String s, Map map)
    {
        try
        {
            map = zzp.zzbx().zzx(map);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Could not convert parameters to JSON.");
            return;
        }
        zzb(s, map);
    }

    public void zzeD()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzpa.zzIz);
        zzc("onshow", hashmap);
    }

    public void zzgM()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put("version", zzpa.zzIz);
        zzc("onhide", hashmap);
    }

    public Activity zzgN()
    {
        return zzJk.zzgN();
    }

    public Context zzgO()
    {
        return zzJk.zzgO();
    }

    public com.google.android.gms.ads.internal.zzd zzgP()
    {
        return zzov;
    }

    public zzd zzgQ()
    {
        zzd zzd1;
        synchronized (zzpc)
        {
            zzd1 = zzJl;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzd zzgR()
    {
        zzd zzd1;
        synchronized (zzpc)
        {
            zzd1 = zzJt;
        }
        return zzd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zziq zzgS()
    {
        return zzCq;
    }

    public boolean zzgT()
    {
        return zzJm;
    }

    public zzan zzgU()
    {
        return zzwh;
    }

    public VersionInfoParcel zzgV()
    {
        return zzpa;
    }

    public boolean zzgW()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzJo;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzgX()
    {
        synchronized (zzpc)
        {
            com.google.android.gms.ads.internal.util.client.zzb.v("Destroying WebView!");
            zzhu.zzHK.post(new Runnable() {

                final zzis zzJv;

                public void run()
                {
                    com.google.android.gms.internal.zzis.zza(zzJv);
                }

            
            {
                zzJv = zzis.this;
                super();
            }
            });
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzgY()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzJr;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzgZ()
    {
        zzqG.zzgD();
    }

    Boolean zzgg()
    {
        Boolean boolean1;
        synchronized (zzpc)
        {
            boolean1 = zzHi;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzha()
    {
        String s;
        synchronized (zzpc)
        {
            s = zzJs;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzhi()
    {
        if (zzgS().zzbY())
        {
            DisplayMetrics displaymetrics = zzp.zzbx().zza(zzqX);
            int k = zzk.zzcE().zzb(displaymetrics, displaymetrics.widthPixels);
            int l = zzk.zzcE().zzb(displaymetrics, displaymetrics.heightPixels);
            Activity activity = zzgN();
            int i;
            int j;
            if (activity == null || activity.getWindow() == null)
            {
                j = l;
                i = k;
            } else
            {
                int ai[] = zzp.zzbx().zzg(activity);
                i = zzk.zzcE().zzb(displaymetrics, ai[0]);
                j = zzk.zzcE().zzb(displaymetrics, ai[1]);
            }
            if (zzzQ != k || zzzR != l || zzzT != i || zzzU != j)
            {
                boolean flag;
                if (zzzQ != k || zzzR != l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzzQ = k;
                zzzR = l;
                zzzT = i;
                zzzU = j;
                (new zzfb(this)).zza(k, l, i, j, displaymetrics.density, zzqX.getDefaultDisplay().getRotation());
                return flag;
            }
        }
        return false;
    }

    public void zzv(int i)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put("closetype", String.valueOf(i));
        hashmap.put("version", zzpa.zzIz);
        zzc("onhide", hashmap);
    }
}
