// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzhu;
import com.google.android.gms.internal.zzil;
import com.google.android.gms.internal.zzip;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzb, zzh, zzg

public class zzj extends com.google.android.gms.internal.zzcl.zza
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final FrameLayout zznY;
    private final Object zzpc = new Object();
    private zzh zzvT;
    private final FrameLayout zzwq;
    private final Map zzwr = new HashMap();
    private zzb zzws;
    boolean zzwt;

    public zzj(FrameLayout framelayout, FrameLayout framelayout1)
    {
        zzwt = false;
        zzwq = framelayout;
        zznY = framelayout1;
        zzil.zza(zzwq, this);
        zzil.zza(zzwq, this);
        zzwq.setOnTouchListener(this);
    }

    static FrameLayout zza(zzj zzj1)
    {
        return zzj1.zznY;
    }

    int getMeasuredHeight()
    {
        return zzwq.getMeasuredHeight();
    }

    int getMeasuredWidth()
    {
        return zzwq.getMeasuredWidth();
    }

    public void onClick(View view)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (zzws == null || !zzws.zzdq().equals(view))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzvT.performClick("1007");
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        zzvT.zzb(view, zzwr);
          goto _L1
    }

    public void onGlobalLayout()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        int i;
        int j;
        if (!zzwt)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        if (i == 0 || j == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        zznY.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, j));
        zzwt = false;
        if (zzvT != null)
        {
            zzvT.zzi(zzwq);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onScrollChanged()
    {
        synchronized (zzpc)
        {
            if (zzvT != null)
            {
                zzvT.zzi(zzwq);
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
            synchronized (zzpc)
            {
                if (zzvT != null)
                {
                    break label0;
                }
            }
            return false;
        }
        Point point = zzc(motionevent);
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setLocation(point.x, point.y);
        zzvT.zzb(motionevent);
        motionevent.recycle();
        view;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        view;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public zzd zzU(String s)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        s = (WeakReference)zzwr.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        s = zze.zzx(s);
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
        View view = (View)zze.zzp(zzd);
        zzd = ((zzd) (zzpc));
        zzd;
        JVM INSTR monitorenter ;
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        zzwr.remove(s);
_L2:
        zzd;
        JVM INSTR monitorexit ;
        return;
        zzwr.put(s, new WeakReference(view));
        view.setOnTouchListener(this);
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
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzwt = true;
        zzd = (zzh)zze.zzp(zzd);
        if (!(zzvT instanceof zzg) || !((zzg)zzvT).zzdx())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ((zzg)zzvT).zzb(zzd);
_L2:
        zznY.removeAllViews();
        zzws = zzf(zzd);
        if (zzws != null)
        {
            zznY.addView(zzws);
        }
        zzhu.zzHK.post(new Runnable(zzd) {

            final zzh zzwu;
            final zzj zzwv;

            public void run()
            {
                zzip zzip1 = zzwu.zzdy();
                if (zzip1 != null)
                {
                    zzj.zza(zzwv).addView(zzip1.getWebView());
                }
            }

            
            {
                zzwv = zzj.this;
                zzwu = zzh1;
                super();
            }
        });
        zzd.zzh(zzwq);
        return;
        zzvT = zzd;
        if (zzvT instanceof zzg)
        {
            ((zzg)zzvT).zzb(null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }

    Point zzc(MotionEvent motionevent)
    {
        int ai[] = new int[2];
        zzwq.getLocationOnScreen(ai);
        float f = motionevent.getRawX();
        float f1 = ai[0];
        float f2 = motionevent.getRawY();
        float f3 = ai[1];
        return new Point((int)(f - f1), (int)(f2 - f3));
    }

    zzb zzf(zzh zzh1)
    {
        return zzh1.zza(this);
    }
}
