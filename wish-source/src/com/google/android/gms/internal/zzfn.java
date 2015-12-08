// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzfl

public class zzfn
{

    private final Context mContext;
    private int mState;
    private String zzCv;
    private float zzCw;
    private float zzCx;
    private float zzCy;
    private final float zzvQ;

    public zzfn(Context context)
    {
        mState = 0;
        mContext = context;
        zzvQ = context.getResources().getDisplayMetrics().density;
    }

    public zzfn(Context context, String s)
    {
        this(context);
        zzCv = s;
    }

    private void showDialog()
    {
        if (!(mContext instanceof Activity))
        {
            zzb.zzal("Can not create dialog without Activity Context");
            return;
        }
        Object obj;
        if (!TextUtils.isEmpty(zzCv))
        {
            Object obj1 = (new android.net.Uri.Builder()).encodedQuery(zzCv).build();
            obj = new StringBuilder();
            obj1 = zzh.zzaQ().zzd(((android.net.Uri) (obj1)));
            String s;
            for (Iterator iterator = ((Map) (obj1)).keySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(s).append(" = ").append((String)((Map) (obj1)).get(s)).append("\n\n"))
            {
                s = (String)iterator.next();
            }

            obj = ((StringBuilder) (obj)).toString().trim();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "No debug information";
            }
        } else
        {
            obj = "No debug information";
        }
        obj1 = new android.app.AlertDialog.Builder(mContext);
        ((android.app.AlertDialog.Builder) (obj1)).setMessage(((CharSequence) (obj)));
        ((android.app.AlertDialog.Builder) (obj1)).setTitle("Ad Information");
        ((android.app.AlertDialog.Builder) (obj1)).setPositiveButton("Share", new android.content.DialogInterface.OnClickListener(((String) (obj))) {

            final zzfn zzCA;
            final String zzCz;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                zzfn.zza(zzCA).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzCz), "Share via"));
            }

            
            {
                zzCA = zzfn.this;
                zzCz = s;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() {

            final zzfn zzCA;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                zzCA = zzfn.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj1)).create().show();
    }

    static Context zza(zzfn zzfn1)
    {
        return zzfn1.mContext;
    }

    void zza(int i, float f, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        mState = 0;
        zzCw = f;
        zzCx = f1;
        zzCy = f1;
_L4:
        return;
_L2:
        if (mState == -1) goto _L4; else goto _L3
_L3:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 <= zzCx) goto _L6; else goto _L5
_L5:
        zzCx = f1;
_L8:
        if (zzCx - zzCy > 30F * zzvQ)
        {
            mState = -1;
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (f1 < zzCy)
        {
            zzCy = f1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (mState == 0 || mState == 2)
        {
            if (f - zzCw >= 50F * zzvQ)
            {
                zzCw = f;
                mState = mState + 1;
            }
        } else
        if ((mState == 1 || mState == 3) && f - zzCw <= -50F * zzvQ)
        {
            zzCw = f;
            mState = mState + 1;
        }
        if (mState != 1 && mState != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f <= zzCw) goto _L4; else goto _L9
_L9:
        zzCw = f;
        return;
        if (mState != 2 || f >= zzCw) goto _L4; else goto _L10
_L10:
        zzCw = f;
        return;
        if (i != 1 || mState != 4) goto _L4; else goto _L11
_L11:
        showDialog();
        return;
    }

    public void zzag(String s)
    {
        zzCv = s;
    }

    public void zzc(MotionEvent motionevent)
    {
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            zza(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        zza(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
    }
}
