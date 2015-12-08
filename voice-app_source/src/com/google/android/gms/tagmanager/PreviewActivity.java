// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, TagManager

public class PreviewActivity extends Activity
{

    public PreviewActivity()
    {
    }

    private void zzj(String s, String s1, String s2)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
        alertdialog.setTitle(s);
        alertdialog.setMessage(s1);
        alertdialog.setButton(-1, s2, new android.content.DialogInterface.OnClickListener() {

            final PreviewActivity zzaMD;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                zzaMD = PreviewActivity.this;
                super();
            }
        });
        alertdialog.show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzbg.zzaA("Preview activity");
        bundle = getIntent().getData();
        if (!TagManager.getInstance(this).zzl(bundle))
        {
            bundle = (new StringBuilder()).append("Cannot preview the app with the uri: ").append(bundle).append(". Launching current version instead.").toString();
            zzbg.zzaC(bundle);
            zzj("Preview failure", bundle, "Continue");
        }
        bundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (bundle != null)
        {
            try
            {
                zzbg.zzaA((new StringBuilder()).append("Invoke the launch activity for package name: ").append(getPackageName()).toString());
                startActivity(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                zzbg.zzaz((new StringBuilder()).append("Calling preview threw an exception: ").append(bundle.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_166;
        }
        zzbg.zzaA((new StringBuilder()).append("No launch activity found for package name: ").append(getPackageName()).toString());
        return;
    }
}
