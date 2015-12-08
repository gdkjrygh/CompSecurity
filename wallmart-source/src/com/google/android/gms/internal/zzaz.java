// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzib, zzax, zzhj, zzdv, 
//            zzbe, zzba, zzlm, zzhv, 
//            zzhu, zzaw, zzdg, zzip

public class zzaz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private boolean zzpB;
    private final Object zzpc = new Object();
    private zzib zzqE;
    private final Context zzqO;
    private final WeakReference zzqQ;
    private WeakReference zzqR;
    private final WeakReference zzqS;
    private final zzax zzqT;
    private final zzdv zzqU;
    private final zzdv.zzd zzqV;
    private boolean zzqW;
    private final WindowManager zzqX;
    private final PowerManager zzqY;
    private final KeyguardManager zzqZ;
    private zzba zzra;
    private boolean zzrb;
    private boolean zzrc;
    private boolean zzrd;
    private boolean zzre;
    private BroadcastReceiver zzrf;
    private final HashSet zzrg = new HashSet();
    private final zzdg zzrh = new zzdg() {

        final zzaz zzrl;

        public void zza(zzip zzip1, Map map)
        {
            if (!zzrl.zzb(map))
            {
                return;
            } else
            {
                zzrl.zza(zzip1.getWebView(), map);
                return;
            }
        }

            
            {
                zzrl = zzaz.this;
                super();
            }
    };
    private final zzdg zzri = new zzdg() {

        final zzaz zzrl;

        public void zza(zzip zzip, Map map)
        {
            if (!zzrl.zzb(map))
            {
                return;
            } else
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzaz.zzb(zzrl).zzbX()).toString());
                zzrl.destroy();
                return;
            }
        }

            
            {
                zzrl = zzaz.this;
                super();
            }
    };
    private final zzdg zzrj = new zzdg() {

        final zzaz zzrl;

        public void zza(zzip zzip, Map map)
        {
            while (!zzrl.zzb(map) || !map.containsKey("isVisible")) 
            {
                return;
            }
            boolean flag;
            if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzrl.zzg(Boolean.valueOf(flag).booleanValue());
        }

            
            {
                zzrl = zzaz.this;
                super();
            }
    };

    public zzaz(AdSizeParcel adsizeparcel, zzhj zzhj1, VersionInfoParcel versioninfoparcel, View view, zzdv zzdv1)
    {
        zzpB = false;
        zzrc = false;
        zzqU = zzdv1;
        zzqQ = new WeakReference(zzhj1);
        zzqS = new WeakReference(view);
        zzqR = new WeakReference(null);
        zzrd = true;
        zzqE = new zzib(200L);
        zzqT = new zzax(UUID.randomUUID().toString(), versioninfoparcel, adsizeparcel.zzsG, zzhj1.zzGF, zzhj1.zzbY());
        zzqV = zzqU.zzdL();
        zzqX = (WindowManager)view.getContext().getSystemService("window");
        zzqY = (PowerManager)view.getContext().getApplicationContext().getSystemService("power");
        zzqZ = (KeyguardManager)view.getContext().getSystemService("keyguard");
        zzqO = view.getContext().getApplicationContext();
        try
        {
            adsizeparcel = zzd(view);
            zzqV.zza(new zzij.zzc(adsizeparcel) {

                final JSONObject zzrk;
                final zzaz zzrl;

                public void zzb(zzbe zzbe1)
                {
                    zzrl.zza(zzrk);
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzrl = zzaz.this;
                zzrk = jsonobject;
                super();
            }
            }, new zzij.zza() {

                final zzaz zzrl;

                public void run()
                {
                }

            
            {
                zzrl = zzaz.this;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel) { }
        // Misplaced declaration of an exception variable
        catch (AdSizeParcel adsizeparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure while processing active view data.", adsizeparcel);
        }
        zzqV.zza(new zzij.zzc() {

            final zzaz zzrl;

            public void zzb(zzbe zzbe1)
            {
                com.google.android.gms.internal.zzaz.zzb(zzrl, true);
                zzrl.zza(zzbe1);
                zzrl.zzbZ();
                zzrl.zzh(false);
            }

            public void zzc(Object obj)
            {
                zzb((zzbe)obj);
            }

            
            {
                zzrl = zzaz.this;
                super();
            }
        }, new zzij.zza() {

            final zzaz zzrl;

            public void run()
            {
                zzrl.destroy();
            }

            
            {
                zzrl = zzaz.this;
                super();
            }
        });
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Tracking ad unit: ").append(zzqT.zzbX()).toString());
    }

    static zzax zzb(zzaz zzaz1)
    {
        return zzaz1.zzqT;
    }

    static boolean zzb(zzaz zzaz1, boolean flag)
    {
        zzaz1.zzqW = flag;
        return flag;
    }

    protected void destroy()
    {
        synchronized (zzpc)
        {
            zzcf();
            zzca();
            zzrd = false;
            zzcc();
            zzqV.release();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean isScreenOn()
    {
        return zzqY.isScreenOn();
    }

    public void onGlobalLayout()
    {
        zzh(false);
    }

    public void onScrollChanged()
    {
        zzh(true);
    }

    public void pause()
    {
        synchronized (zzpc)
        {
            zzpB = true;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (zzpc)
        {
            zzpB = false;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (zzpc)
        {
            zzrc = true;
            zzh(false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int zza(int i, DisplayMetrics displaymetrics)
    {
        float f = displaymetrics.density;
        return (int)((float)i / f);
    }

    protected void zza(View view, Map map)
    {
        zzh(false);
    }

    public void zza(zzaw zzaw1)
    {
        zzrg.add(zzaw1);
    }

    public void zza(zzba zzba1)
    {
        synchronized (zzpc)
        {
            zzra = zzba1;
        }
        return;
        zzba1;
        obj;
        JVM INSTR monitorexit ;
        throw zzba1;
    }

    protected void zza(zzbe zzbe1)
    {
        zzbe1.zza("/updateActiveView", zzrh);
        zzbe1.zza("/untrackActiveViewUnit", zzri);
        zzbe1.zza("/visibilityChanged", zzrj);
    }

    protected void zza(JSONObject jsonobject)
    {
        try
        {
            JSONArray jsonarray = new JSONArray();
            JSONObject jsonobject1 = new JSONObject();
            jsonarray.put(jsonobject);
            jsonobject1.put("units", jsonarray);
            zzqV.zza(new zzij.zzc(jsonobject1) {

                final zzaz zzrl;
                final JSONObject zzrm;

                public void zzb(zzbe zzbe1)
                {
                    zzbe1.zza("AFMA_updateActiveView", zzrm);
                }

                public void zzc(Object obj)
                {
                    zzb((zzbe)obj);
                }

            
            {
                zzrl = zzaz.this;
                zzrm = jsonobject;
                super();
            }
            }, new zzij.zzb());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Skipping active view message.", jsonobject);
        }
    }

    protected boolean zzb(Map map)
    {
        if (map == null)
        {
            return false;
        }
        map = (String)map.get("hashCode");
        boolean flag;
        if (!TextUtils.isEmpty(map) && map.equals(zzqT.zzbX()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected void zzbZ()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzrf == null)
                {
                    break label0;
                }
            }
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        zzrf = new BroadcastReceiver() {

            final zzaz zzrl;

            public void onReceive(Context context, Intent intent)
            {
                zzrl.zzh(false);
            }

            
            {
                zzrl = zzaz.this;
                super();
            }
        };
        zzqO.registerReceiver(zzrf, intentfilter);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzca()
    {
        synchronized (zzpc)
        {
            if (zzrf != null)
            {
                zzqO.unregisterReceiver(zzrf);
                zzrf = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcb()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzrd) goto _L2; else goto _L1
_L1:
        zzre = true;
        zza(zzch());
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Untracking ad unit: ").append(zzqT.zzbX()).toString());
_L2:
        return;
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("JSON failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure while processing active view data.", ((Throwable) (obj1)));
          goto _L3
    }

    protected void zzcc()
    {
        if (zzra != null)
        {
            zzra.zza(this);
        }
    }

    public boolean zzcd()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzrd;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzce()
    {
        Object obj = (View)zzqS.get();
        if (obj != null)
        {
            ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzqR.get();
            obj = ((View) (obj)).getViewTreeObserver();
            if (obj != viewtreeobserver)
            {
                zzcf();
                if (!zzrb || viewtreeobserver != null && viewtreeobserver.isAlive())
                {
                    zzrb = true;
                    ((ViewTreeObserver) (obj)).addOnScrollChangedListener(this);
                    ((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(this);
                }
                zzqR = new WeakReference(obj);
                return;
            }
        }
    }

    protected void zzcf()
    {
        ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzqR.get();
        if (viewtreeobserver == null || !viewtreeobserver.isAlive())
        {
            return;
        } else
        {
            viewtreeobserver.removeOnScrollChangedListener(this);
            viewtreeobserver.removeGlobalOnLayoutListener(this);
            return;
        }
    }

    protected JSONObject zzcg()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("afmaVersion", zzqT.zzbV()).put("activeViewJSON", zzqT.zzbW()).put("timestamp", zzp.zzbB().elapsedRealtime()).put("adFormat", zzqT.zzbU()).put("hashCode", zzqT.zzbX()).put("isMraid", zzqT.zzbY());
        return jsonobject;
    }

    protected JSONObject zzch()
        throws JSONException
    {
        JSONObject jsonobject = zzcg();
        jsonobject.put("doneReasonCode", "u");
        return jsonobject;
    }

    protected JSONObject zzd(View view)
        throws JSONException
    {
        boolean flag = zzp.zzbz().isAttachedToWindow(view);
        int ai1[] = new int[2];
        int ai[] = new int[2];
        DisplayMetrics displaymetrics;
        Rect rect;
        Rect rect1;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        JSONObject jsonobject;
        boolean flag1;
        boolean flag2;
        try
        {
            view.getLocationOnScreen(ai1);
            view.getLocationInWindow(ai);
        }
        catch (Exception exception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Failure getting view location.", exception);
        }
        displaymetrics = view.getContext().getResources().getDisplayMetrics();
        rect = new Rect();
        rect.left = ai1[0];
        rect.top = ai1[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        rect1 = new Rect();
        rect1.right = zzqX.getDefaultDisplay().getWidth();
        rect1.bottom = zzqX.getDefaultDisplay().getHeight();
        rect2 = new Rect();
        flag1 = view.getGlobalVisibleRect(rect2, null);
        rect3 = new Rect();
        flag2 = view.getLocalVisibleRect(rect3);
        rect4 = new Rect();
        view.getHitRect(rect4);
        jsonobject = zzcg();
        jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isStopped", zzrc).put("isPaused", zzpB).put("isAttachedToWindow", flag).put("viewBox", (new JSONObject()).put("top", zza(rect1.top, displaymetrics)).put("bottom", zza(rect1.bottom, displaymetrics)).put("left", zza(rect1.left, displaymetrics)).put("right", zza(rect1.right, displaymetrics))).put("adBox", (new JSONObject()).put("top", zza(rect.top, displaymetrics)).put("bottom", zza(rect.bottom, displaymetrics)).put("left", zza(rect.left, displaymetrics)).put("right", zza(rect.right, displaymetrics))).put("globalVisibleBox", (new JSONObject()).put("top", zza(rect2.top, displaymetrics)).put("bottom", zza(rect2.bottom, displaymetrics)).put("left", zza(rect2.left, displaymetrics)).put("right", zza(rect2.right, displaymetrics))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", (new JSONObject()).put("top", zza(rect3.top, displaymetrics)).put("bottom", zza(rect3.bottom, displaymetrics)).put("left", zza(rect3.left, displaymetrics)).put("right", zza(rect3.right, displaymetrics))).put("localVisibleBoxVisible", flag2).put("hitBox", (new JSONObject()).put("top", zza(rect4.top, displaymetrics)).put("bottom", zza(rect4.bottom, displaymetrics)).put("left", zza(rect4.left, displaymetrics)).put("right", zza(rect4.right, displaymetrics))).put("screenDensity", displaymetrics.density).put("isVisible", zze(view));
        return jsonobject;
    }

    protected boolean zze(View view)
    {
        return view.getVisibility() == 0 && view.isShown() && isScreenOn() && (!zzqZ.inKeyguardRestrictedInputMode() || zzp.zzbx().zzgq());
    }

    protected void zzg(boolean flag)
    {
        for (Iterator iterator = zzrg.iterator(); iterator.hasNext(); ((zzaw)iterator.next()).zza(this, flag)) { }
    }

    protected void zzh(boolean flag)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzqW && zzrd)
                {
                    break label0;
                }
            }
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (zzqE.tryAcquire())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        zzhj zzhj1;
        View view;
        zzhj1 = (zzhj)zzqQ.get();
        view = (View)zzqS.get();
        Object obj;
        boolean flag1;
        if (view != null && zzhj1 != null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        zzcb();
        obj1;
        JVM INSTR monitorexit ;
        return;
        zza(zzd(view));
_L2:
        zzce();
        zzcc();
        obj1;
        JVM INSTR monitorexit ;
        return;
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zza("Active view update failed.", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
          goto _L3
        obj;
          goto _L3
    }
}
