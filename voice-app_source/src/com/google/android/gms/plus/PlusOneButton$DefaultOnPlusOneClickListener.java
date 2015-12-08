// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton

protected class zzaHh
    implements android.view.eClickListener, zzaHh
{

    private final zzaHi zzaHh;
    final PlusOneButton zzaHi;

    public void onClick(View view)
    {
        view = (Intent)PlusOneButton.zza(zzaHi).getTag();
        if (zzaHh != null)
        {
            zzaHh.neClick(view);
            return;
        } else
        {
            onPlusOneClick(view);
            return;
        }
    }

    public void onPlusOneClick(Intent intent)
    {
        android.content.Context context = zzaHi.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.zzb(zzaHi));
        }
    }

    public (PlusOneButton plusonebutton,  )
    {
        zzaHi = plusonebutton;
        super();
        zzaHh = ;
    }
}
