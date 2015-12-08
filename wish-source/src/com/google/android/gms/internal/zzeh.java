// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeg, zzgd, zzfa

public class zzeh extends zzeg
{

    private Object zzyn;
    private PopupWindow zzyo;
    private boolean zzyp;

    zzeh(Context context, zzfa.zza zza, zzgd zzgd1, zzef.zza zza1)
    {
        super(context, zza, zzgd1, zza1);
        zzyn = new Object();
        zzyp = false;
    }

    private void zzeh()
    {
        synchronized (zzyn)
        {
            zzyp = true;
            if ((mContext instanceof Activity) && ((Activity)mContext).isDestroyed())
            {
                zzyo = null;
            }
            if (zzyo != null)
            {
                if (zzyo.isShowing())
                {
                    zzyo.dismiss();
                }
                zzyo = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onStop()
    {
        zzeh();
        super.onStop();
    }

    protected void zzeg()
    {
        FrameLayout framelayout;
        if (mContext instanceof Activity)
        {
            obj = ((Activity)mContext).getWindow();
        } else
        {
            obj = null;
        }
        while (obj == null || ((Window) (obj)).getDecorView() == null || ((Activity)mContext).isDestroyed()) 
        {
            return;
        }
        framelayout = new FrameLayout(mContext);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        framelayout.addView(zznp.getWebView(), -1, -1);
        synchronized (zzyn)
        {
            if (!zzyp)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzyo = new PopupWindow(framelayout, 1, 1, false);
        zzyo.setOutsideTouchable(true);
        zzyo.setClippingEnabled(false);
        zzb.zzaj("Displaying the 1x1 popup off the screen.");
        zzyo.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        zzyo = null;
          goto _L1
    }

    protected void zzh(zzfa zzfa)
    {
        zzeh();
        super.zzh(zzfa);
    }
}
