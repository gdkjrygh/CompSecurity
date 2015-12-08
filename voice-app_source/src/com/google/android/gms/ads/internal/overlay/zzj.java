// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzl

public class zzj extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton zzAo;
    private final zzl zzAp;

    public zzj(Context context, int i, zzl zzl1)
    {
        super(context);
        zzAp = zzl1;
        setOnClickListener(this);
        zzAo = new ImageButton(context);
        zzAo.setImageResource(0x1080017);
        zzAo.setBackgroundColor(0);
        zzAo.setOnClickListener(this);
        zzAo.setPadding(0, 0, 0, 0);
        zzAo.setContentDescription("Interstitial close button");
        i = zzk.zzcA().zzb(context, i);
        addView(zzAo, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void onClick(View view)
    {
        if (zzAp != null)
        {
            zzAp.zzes();
        }
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            if (flag)
            {
                zzAo.setVisibility(4);
                return;
            } else
            {
                zzAo.setVisibility(8);
                return;
            }
        } else
        {
            zzAo.setVisibility(0);
            return;
        }
    }
}
