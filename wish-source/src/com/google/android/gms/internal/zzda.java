// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzh;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgd, zzfl, zzak, 
//            zzfc

public class zzda extends zzdg
{

    private final Context mContext;
    private final Map zzvi;
    private String zzvj;
    private long zzvk;
    private long zzvl;
    private String zzvm;
    private String zzvn;

    public zzda(zzgd zzgd1, Map map)
    {
        super(zzgd1, "createCalendarEvent");
        zzvi = map;
        mContext = zzgd1.zzfp();
        zzdd();
    }

    private String zzN(String s)
    {
        if (TextUtils.isEmpty((CharSequence)zzvi.get(s)))
        {
            return "";
        } else
        {
            return (String)zzvi.get(s);
        }
    }

    private long zzO(String s)
    {
        s = (String)zzvi.get(s);
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

    static Context zza(zzda zzda1)
    {
        return zzda1.mContext;
    }

    private void zzdd()
    {
        zzvj = zzN("description");
        zzvm = zzN("summary");
        zzvk = zzO("start_ticks");
        zzvl = zzO("end_ticks");
        zzvn = zzN("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", zzvj);
        intent.putExtra("eventLocation", zzvn);
        intent.putExtra("description", zzvm);
        if (zzvk > -1L)
        {
            intent.putExtra("beginTime", zzvk);
        }
        if (zzvl > -1L)
        {
            intent.putExtra("endTime", zzvl);
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzQ("Activity context is not available.");
            return;
        }
        if (!zzh.zzaQ().zzz(mContext).zzca())
        {
            zzQ("This feature is not available on the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzh.zzaQ().zzy(mContext);
            builder.setTitle(zzh.zzaT().zzc(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(zzh.zzaT().zzc(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(zzh.zzaT().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final zzda zzvo;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = zzvo.createIntent();
                    zzda.zza(zzvo).startActivity(dialoginterface);
                }

            
            {
                zzvo = zzda.this;
                super();
            }
            });
            builder.setNegativeButton(zzh.zzaT().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzda zzvo;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzvo.zzQ("Operation denied by user.");
                }

            
            {
                zzvo = zzda.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
