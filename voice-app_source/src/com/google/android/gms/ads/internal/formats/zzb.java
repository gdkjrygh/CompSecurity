// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzhm;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza

class zzb extends RelativeLayout
{

    private static final float zzve[] = {
        5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
    };
    private final RelativeLayout zzvf;

    public zzb(Context context, com.google.android.gms.ads.internal.formats.zza zza1)
    {
        super(context);
        zzu.zzu(zza1);
        Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        Object obj1 = new ShapeDrawable(new RoundRectShape(zzve, null, null));
        ((ShapeDrawable) (obj1)).getPaint().setColor(zza1.getBackgroundColor());
        zzvf = new RelativeLayout(context);
        zzvf.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        zzo.zzbx().zza(zzvf, ((android.graphics.drawable.Drawable) (obj1)));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj = new TextView(context);
        ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((TextView) (obj)).setId(0x47470001);
        ((TextView) (obj)).setTypeface(Typeface.DEFAULT);
        ((TextView) (obj)).setText(zza1.getText());
        ((TextView) (obj)).setTextColor(zza1.zzdu());
        ((TextView) (obj)).setTextSize(zza1.getTextSize());
        ((TextView) (obj)).setPadding(zzk.zzcA().zzb(context, 4), 0, zzk.zzcA().zzb(context, 4), 0);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(1, ((TextView) (obj)).getId());
        context = new ImageView(context);
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        context.setId(0x47470002);
        context.setImageDrawable(zza1.getIcon());
        zzvf.addView(((android.view.View) (obj)));
        zzvf.addView(context);
        addView(zzvf);
    }

    public ViewGroup zzdv()
    {
        return zzvf;
    }

}
