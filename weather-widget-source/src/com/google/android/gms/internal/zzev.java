// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzfb, zzip, zzhu, zzbq, 
//            zzhl

public class zzev extends zzfb
{

    private final Context mContext;
    private final Map zzvs;
    private String zzzi;
    private long zzzj;
    private long zzzk;
    private String zzzl;
    private String zzzm;

    public zzev(zzip zzip1, Map map)
    {
        super(zzip1, "createCalendarEvent");
        zzvs = map;
        mContext = zzip1.zzgN();
        zzdV();
    }

    static Context zza(zzev zzev1)
    {
        return zzev1.mContext;
    }

    private String zzae(String s)
    {
        if (TextUtils.isEmpty((CharSequence)zzvs.get(s)))
        {
            return "";
        } else
        {
            return (String)zzvs.get(s);
        }
    }

    private long zzaf(String s)
    {
        s = (String)zzvs.get(s);
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    private void zzdV()
    {
        zzzi = zzae("description");
        zzzl = zzae("summary");
        zzzj = zzaf("start_ticks");
        zzzk = zzaf("end_ticks");
        zzzm = zzae("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", zzzi);
        intent.putExtra("eventLocation", zzzm);
        intent.putExtra("description", zzzl);
        if (zzzj > -1L)
        {
            intent.putExtra("beginTime", zzzj);
        }
        if (zzzk > -1L)
        {
            intent.putExtra("endTime", zzzk);
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzah("Activity context is not available.");
            return;
        }
        if (!zzp.zzbx().zzM(mContext).zzda())
        {
            zzah("This feature is not available on the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzp.zzbx().zzL(mContext);
            builder.setTitle(zzp.zzbA().zzc(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(zzp.zzbA().zzc(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzp.zzbA().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final zzev zzzn;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = zzzn.createIntent();
                    zzev.zza(zzzn).startActivity(dialoginterface);
                }

            
            {
                zzzn = zzev.this;
                super();
            }
            });
            builder.setNegativeButton(zzp.zzbA().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzev zzzn;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzzn.zzah("Operation denied by user.");
                }

            
            {
                zzzn = zzev.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
