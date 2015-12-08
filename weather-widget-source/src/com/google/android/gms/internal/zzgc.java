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
//            zzgb, zzip, zzhj

public class zzgc extends zzgb
{

    private Object zzCK;
    private PopupWindow zzCL;
    private boolean zzCM;

    zzgc(Context context, zzhj.zza zza, zzip zzip1, zzga.zza zza1)
    {
        super(context, zza, zzip1, zza1);
        zzCK = new Object();
        zzCM = false;
    }

    private void zzfq()
    {
        synchronized (zzCK)
        {
            zzCM = true;
            if ((mContext instanceof Activity) && ((Activity)mContext).isDestroyed())
            {
                zzCL = null;
            }
            if (zzCL != null)
            {
                if (zzCL.isShowing())
                {
                    zzCL.dismiss();
                }
                zzCL = null;
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
        zzfq();
        super.onStop();
    }

    protected void zzfp()
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
        framelayout.addView(zzoL.getWebView(), -1, -1);
        synchronized (zzCK)
        {
            if (!zzCM)
            {
                break MISSING_BLOCK_LABEL_108;
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        zzCL = new PopupWindow(framelayout, 1, 1, false);
        zzCL.setOutsideTouchable(true);
        zzCL.setClippingEnabled(false);
        zzb.zzaC("Displaying the 1x1 popup off the screen.");
        zzCL.showAtLocation(((Window) (obj)).getDecorView(), 0, -1, -1);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        zzCL = null;
          goto _L1
    }

    protected void zzi(zzhj zzhj)
    {
        zzfq();
        super.zzi(zzhj);
    }
}
