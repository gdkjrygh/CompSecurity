// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.player;

import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.youtube.core.player.overlay.DefaultAnnotationOverlay;
import com.google.android.apps.youtube.core.utils.Typefaces;

public class RobotoAnnotationOverlay extends DefaultAnnotationOverlay
{

    public RobotoAnnotationOverlay(Context context)
    {
        super(context);
        android.graphics.Typeface typeface = Typefaces.ROBOTO_REGULAR.toTypeface(context);
        context = Typefaces.ROBOTO_LIGHT.toTypeface(context);
        if (typeface != null)
        {
            a.setTypeface(typeface);
            c.setTypeface(typeface);
        }
        if (context != null)
        {
            b.setTypeface(context);
            d.setTypeface(context);
        }
    }
}
