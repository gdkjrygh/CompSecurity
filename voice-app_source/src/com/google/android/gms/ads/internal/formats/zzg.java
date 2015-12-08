// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzb, zza

public class zzg
{
    public static interface zza
    {

        public abstract String getCustomTemplateId();

        public abstract void zza(zzg zzg1);

        public abstract String zzdE();

        public abstract com.google.android.gms.ads.internal.formats.zza zzdF();
    }


    private final Context mContext;
    private final Object zzqt = new Object();
    private final zzan zzvA;
    private boolean zzvB;
    private final zzm zzvw;
    private final JSONObject zzvx;
    private final zzbb zzvy;
    private final zza zzvz;

    public zzg(Context context, zzm zzm1, zzbb zzbb1, zzan zzan1, JSONObject jsonobject, zza zza1)
    {
        mContext = context;
        zzvw = zzm1;
        zzvy = zzbb1;
        zzvA = zzan1;
        zzvx = jsonobject;
        zzvz = zza1;
    }

    public void performClick(String s)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("asset", s);
        jsonobject.put("template", zzvz.zzdE());
        s = new JSONObject();
        s.put("ad", zzvx);
        s.put("click", jsonobject);
        boolean flag;
        if (zzvw.zzq(zzvz.getCustomTemplateId()) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            s.put("has_custom_click_handler", flag);
            zzvy.zza("google.afma.nativeAds.handleClickGmsg", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to create click JSON.", s);
        }
        return;
    }

    public void recordImpression()
    {
        zzvB = true;
        zzvw.zzaP();
    }

    public com.google.android.gms.ads.internal.formats.zzb zza(android.view.View.OnClickListener onclicklistener)
    {
        Object obj = zzvz.zzdF();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new com.google.android.gms.ads.internal.formats.zzb(mContext, ((com.google.android.gms.ads.internal.formats.zza) (obj)));
            ((com.google.android.gms.ads.internal.formats.zzb) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((com.google.android.gms.ads.internal.formats.zzb) (obj)).zzdv().setOnClickListener(onclicklistener);
            return ((com.google.android.gms.ads.internal.formats.zzb) (obj));
        }
    }

    public void zzb(MotionEvent motionevent)
    {
        zzvA.zza(motionevent);
    }

    public void zzh(View view)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!zzvB)
                {
                    break label0;
                }
            }
            return;
        }
        if (view.isShown())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        if (view.getGlobalVisibleRect(new Rect(), null))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        recordImpression();
        obj;
        JVM INSTR monitorexit ;
    }
}
