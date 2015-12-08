// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbf, zzk, zzy, zzbj, 
//            zzfz, zzbe

public class zzbi
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{
    public static interface zza
    {

        public abstract void zza(zzbi zzbi1);

        public abstract String zzcJ();

        public abstract zzbe zzcK();
    }


    private final Context mContext;
    private final com.google.android.gms.ads.internal.zza zzsS;
    private final JSONObject zzsT;
    private final zzy zzsU;
    private final zza zzsV;
    private final zzk zzsW;
    private final Object zzsX = new Object();
    private final Map zzsY = new HashMap();
    private FrameLayout zzsZ;
    private zzbf zzta;
    private boolean zztb;

    public zzbi(Context context, com.google.android.gms.ads.internal.zza zza1, zzy zzy1, zzk zzk1, JSONObject jsonobject, zza zza2)
    {
        mContext = context;
        zzsS = zza1;
        zzsU = zzy1;
        zzsW = zzk1;
        zzsT = jsonobject;
        zzsV = zza2;
    }

    private void zza(zzbj zzbj1)
    {
        synchronized (zzsX)
        {
            if (zzbj1 == zzsZ)
            {
                zzcI();
            }
        }
        return;
        zzbj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbj1;
    }

    private void zzcO()
    {
label0:
        {
            synchronized (zzsX)
            {
                if (!zztb && zzsZ != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (zzsZ.isShown())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzsZ.getGlobalVisibleRect(new Rect(), null))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        zztb = true;
        recordImpression();
        obj;
        JVM INSTR monitorexit ;
    }

    private String zzi(View view)
    {
label0:
        {
            synchronized (zzsX)
            {
                if (zzta == null || !zzta.zzcA().equals(view))
                {
                    break label0;
                }
            }
            return "1007";
        }
        Iterator iterator = zzsY.entrySet().iterator();
        java.util.Map.Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_111;
            }
            entry = (java.util.Map.Entry)iterator.next();
        } while (!view.equals((View)((WeakReference)entry.getValue()).get()));
        view = (String)entry.getKey();
        obj;
        JVM INSTR monitorexit ;
        return view;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public void onClick(View view)
    {
        view = zzi(view);
        if (view != null)
        {
            zzE(view);
        }
    }

    public void onGlobalLayout()
    {
        zzcO();
    }

    public void onScrollChanged()
    {
        zzcO();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        zzsW.zza(motionevent);
        return true;
    }

    public void recordImpression()
    {
        zzsS.zzar();
    }

    public void zzE(String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("asset", s);
            jsonobject.put("template", zzsV.zzcJ());
            s = new JSONObject();
            s.put("ad", zzsT);
            s.put("click", jsonobject);
            zzsU.zza("google.afma.nativeAds.handleClick", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Unable to create click JSON.", s);
        }
    }

    protected zzbj zza(View view, zzbf zzbf1)
    {
        return new zzbj(mContext, this, view, zzbf1);
    }

    public void zza(String s, View view)
    {
        synchronized (zzsX)
        {
            zzsY.put(s, new WeakReference(view));
            view.setOnClickListener(this);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzcI()
    {
        Object obj = zzsX;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzsY.entrySet().iterator();
_L2:
        View view;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
            view = (View)((WeakReference)((java.util.Map.Entry)iterator.next()).getValue()).get();
        } while (view == null);
        view.setOnClickListener(null);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzsZ != null)
        {
            zzsZ.setOnTouchListener(null);
        }
        zzsY.clear();
        zzsZ = null;
        obj;
        JVM INSTR monitorexit ;
    }

    protected zzbf zzcN()
    {
        Object obj = zzsV.zzcK();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new zzbf(mContext, ((zzbe) (obj)));
            ((zzbf) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((zzbf) (obj)).zzcA().setOnClickListener(this);
            return ((zzbf) (obj));
        }
    }

    public View zzh(View view)
    {
        Object obj = zzsX;
        obj;
        JVM INSTR monitorenter ;
        View view1 = view;
        if (view instanceof zzbj)
        {
            view = (zzbj)view;
            view1 = view.zzcQ();
            view.removeView(view1);
            view.zzcP().zza(view);
        }
        zzta = zzcN();
        view1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        zzsZ = zza(view1, zzta);
        com.google.android.gms.internal.zzfz.zza(zzsZ, this);
        com.google.android.gms.internal.zzfz.zza(zzsZ, this);
        zzsZ.setOnTouchListener(this);
        view = zzsZ;
        obj;
        JVM INSTR monitorexit ;
        return view;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }
}
