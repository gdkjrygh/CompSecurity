// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.zzh;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgd, zzfl, zzak, 
//            zzfc, zzfm

public class zzdd extends zzdg
{

    private final Context mContext;
    private final Map zzvi;

    public zzdd(zzgd zzgd1, Map map)
    {
        super(zzgd1, "storePicture");
        zzvi = map;
        mContext = zzgd1.zzfp();
    }

    static Context zza(zzdd zzdd1)
    {
        return zzdd1.mContext;
    }

    public void execute()
    {
        if (mContext == null)
        {
            zzQ("Activity context is not available");
            return;
        }
        if (!zzh.zzaQ().zzz(mContext).zzbX())
        {
            zzQ("Feature is not supported by the device.");
            return;
        }
        String s = (String)zzvi.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            zzQ("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            zzQ((new StringBuilder()).append("Invalid image url: ").append(s).toString());
            return;
        }
        String s1 = zzP(s);
        if (!zzh.zzaQ().zzaf(s1))
        {
            zzQ((new StringBuilder()).append("Image type not recognized: ").append(s1).toString());
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = zzh.zzaQ().zzy(mContext);
            builder.setTitle(zzh.zzaT().zzc(com.google.android.gms.R.string.store_picture_title, "Save image"));
            builder.setMessage(zzh.zzaT().zzc(com.google.android.gms.R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(zzh.zzaT().zzc(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener(s, s1) {

                final String zzvG;
                final String zzvH;
                final zzdd zzvI;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = (DownloadManager)zzdd.zza(zzvI).getSystemService("download");
                    try
                    {
                        dialoginterface.enqueue(zzvI.zzg(zzvG, zzvH));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        zzvI.zzQ("Could not store picture.");
                    }
                }

            
            {
                zzvI = zzdd.this;
                zzvG = s;
                zzvH = s1;
                super();
            }
            });
            builder.setNegativeButton(zzh.zzaT().zzc(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final zzdd zzvI;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    zzvI.zzQ("User canceled the download.");
                }

            
            {
                zzvI = zzdd.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    String zzP(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    android.app.DownloadManager.Request zzg(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        zzh.zzaS().zza(s);
        return s;
    }
}
