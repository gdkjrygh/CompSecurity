// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzj

public class zzh extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton zzxd;
    private final com.google.android.gms.ads.internal.overlay.zzj zzxe;

    public zzh(Context context, int i, com.google.android.gms.ads.internal.overlay.zzj zzj1)
    {
        super(context);
        zzxe = zzj1;
        setOnClickListener(this);
        zzxd = new ImageButton(context);
        zzxd.setImageResource(0x1080017);
        zzxd.setBackgroundColor(0);
        zzxd.setOnClickListener(this);
        zzxd.setPadding(0, 0, 0, 0);
        zzxd.setContentDescription("Interstitial close button");
        i = zzj.zzbJ().zzb(context, i);
        addView(zzxd, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void onClick(View view)
    {
        if (zzxe != null)
        {
            zzxe.zzdu();
        }
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            if (flag)
            {
                zzxd.setVisibility(4);
                return;
            } else
            {
                zzxd.setVisibility(8);
                return;
            }
        } else
        {
            zzxd.setVisibility(0);
            return;
        }
    }
}
