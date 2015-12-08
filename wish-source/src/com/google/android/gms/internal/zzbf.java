// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe

class zzbf extends RelativeLayout
{

    private static final float zzsE[] = {
        5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
    };
    private final RelativeLayout zzsF;

    public zzbf(Context context, zzbe zzbe1)
    {
        super(context);
        zzv.zzr(zzbe1);
        Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        Object obj1 = new ShapeDrawable(new RoundRectShape(zzsE, null, null));
        ((ShapeDrawable) (obj1)).getPaint().setColor(zzbe1.getBackgroundColor());
        zzsF = new RelativeLayout(context);
        zzsF.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        zzsF.setBackground(((android.graphics.drawable.Drawable) (obj1)));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj = new TextView(context);
        ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((TextView) (obj)).setId(0x47470001);
        ((TextView) (obj)).setTypeface(Typeface.DEFAULT);
        ((TextView) (obj)).setText(zzbe1.getText());
        ((TextView) (obj)).setTextColor(zzbe1.zzcz());
        ((TextView) (obj)).setTextSize(zzbe1.getTextSize());
        ((TextView) (obj)).setPadding(zzj.zzbJ().zzb(context, 4), 0, zzj.zzbJ().zzb(context, 4), 0);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(1, ((TextView) (obj)).getId());
        context = new ImageView(context);
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        context.setId(0x47470002);
        context.setImageDrawable(zzbe1.getIcon());
        zzsF.addView(((android.view.View) (obj)));
        zzsF.addView(context);
        addView(zzsF);
    }

    public ViewGroup zzcA()
    {
        return zzsF;
    }

}
