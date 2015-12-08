// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzhz;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzb, zzg

public class zzi extends com.google.android.gms.internal.zzcm.zza
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final FrameLayout zznV;
    private final Object zzqt = new Object();
    private final FrameLayout zzvF;
    private final Map zzvG = new HashMap();
    private zzb zzvH;
    private zzg zzvq;

    public zzi(FrameLayout framelayout, FrameLayout framelayout1)
    {
        zzvF = framelayout;
        zznV = framelayout1;
        zzhz.zza(zzvF, this);
        zzhz.zza(zzvF, this);
        zzvF.setOnTouchListener(this);
    }

    private String zzi(View view)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzvH == null || !zzvH.zzdv().equals(view))
                {
                    break label0;
                }
            }
            return "1007";
        }
        Iterator iterator = zzvG.entrySet().iterator();
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
label0:
        {
            synchronized (zzqt)
            {
                if (zzvq != null)
                {
                    break label0;
                }
            }
            return;
        }
        view = zzi(view);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        zzvq.performClick(view);
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public void onGlobalLayout()
    {
        synchronized (zzqt)
        {
            if (zzvq != null)
            {
                zzvq.zzh(zzvF);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onScrollChanged()
    {
        synchronized (zzqt)
        {
            if (zzvq != null)
            {
                zzvq.zzh(zzvF);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzvq != null)
                {
                    break label0;
                }
            }
            return false;
        }
        zzvq.zzb(motionevent);
        view;
        JVM INSTR monitorexit ;
        return true;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public zzd zzS(String s)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)zzvG.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = zze.zzw(s);
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (View)s.get();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zza(String s, zzd zzd)
    {
        View view = (View)zze.zzn(zzd);
        zzd = ((zzd) (zzqt));
        zzd;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        zzvG.remove(s);
_L2:
        zzd;
        JVM INSTR monitorexit ;
        return;
        zzvG.put(s, new WeakReference(view));
        view.setOnClickListener(this);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        zzd;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void zzb(zzd zzd)
    {
        synchronized (zzqt)
        {
            zzvq = (zzg)zze.zzn(zzd);
            zznV.removeAllViews();
            zzvH = zzdI();
            if (zzvH != null)
            {
                zznV.addView(zzvH);
            }
        }
        return;
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }

    zzb zzdI()
    {
        return zzvq.zza(this);
    }
}
