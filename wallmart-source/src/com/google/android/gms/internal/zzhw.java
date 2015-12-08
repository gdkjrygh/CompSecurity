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
import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu

public class zzhw
{

    private final Context mContext;
    private int mState;
    private String zzHO;
    private float zzHP;
    private float zzHQ;
    private float zzHR;
    private final float zzzP;

    public zzhw(Context context)
    {
        mState = 0;
        mContext = context;
        zzzP = context.getResources().getDisplayMetrics().density;
    }

    public zzhw(Context context, String s)
    {
        this(context);
        zzHO = s;
    }

    private void showDialog()
    {
        if (!(mContext instanceof Activity))
        {
            zzb.zzaD("Can not create dialog without Activity Context");
            return;
        } else
        {
            String s = zzaA(zzHO);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
            builder.setMessage(s);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new android.content.DialogInterface.OnClickListener(s) {

                final String zzHS;
                final zzhw zzHT;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzhw.zza(zzHT).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzHS), "Share via"));
                }

            
            {
                zzHT = zzhw.this;
                zzHS = s;
                super();
            }
            });
            builder.setNegativeButton("Close", new android.content.DialogInterface.OnClickListener() {

                final zzhw zzHT;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                zzHT = zzhw.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    static Context zza(zzhw zzhw1)
    {
        return zzhw1.mContext;
    }

    static String zzaA(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = "No debug information";
        } else
        {
            s = s.replaceAll("\\+", "%20");
            Object obj = (new android.net.Uri.Builder()).encodedQuery(s).build();
            s = new StringBuilder();
            obj = zzp.zzbx().zze(((android.net.Uri) (obj)));
            String s1;
            for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); s.append(s1).append(" = ").append((String)((Map) (obj)).get(s1)).append("\n\n"))
            {
                s1 = (String)iterator.next();
            }

            obj = s.toString().trim();
            s = ((String) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return "No debug information";
            }
        }
        return s;
    }

    void zza(int i, float f, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        mState = 0;
        zzHP = f;
        zzHQ = f1;
        zzHR = f1;
_L4:
        return;
_L2:
        if (mState == -1) goto _L4; else goto _L3
_L3:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 <= zzHQ) goto _L6; else goto _L5
_L5:
        zzHQ = f1;
_L8:
        if (zzHQ - zzHR > 30F * zzzP)
        {
            mState = -1;
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (f1 < zzHR)
        {
            zzHR = f1;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (mState == 0 || mState == 2)
        {
            if (f - zzHP >= 50F * zzzP)
            {
                zzHP = f;
                mState = mState + 1;
            }
        } else
        if ((mState == 1 || mState == 3) && f - zzHP <= -50F * zzzP)
        {
            zzHP = f;
            mState = mState + 1;
        }
        if (mState != 1 && mState != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f <= zzHP) goto _L4; else goto _L9
_L9:
        zzHP = f;
        return;
        if (mState != 2 || f >= zzHP) goto _L4; else goto _L10
_L10:
        zzHP = f;
        return;
        if (i != 1 || mState != 4) goto _L4; else goto _L11
_L11:
        showDialog();
        return;
    }

    public void zzaz(String s)
    {
        zzHO = s;
    }

    public void zze(MotionEvent motionevent)
    {
        int j = motionevent.getHistorySize();
        for (int i = 0; i < j; i++)
        {
            zza(motionevent.getActionMasked(), motionevent.getHistoricalX(0, i), motionevent.getHistoricalY(0, i));
        }

        zza(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
    }
}
