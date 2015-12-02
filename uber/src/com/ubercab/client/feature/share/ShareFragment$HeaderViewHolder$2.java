// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ubercab.client.core.app.RiderActivity;
import dtp;

// Referenced classes of package com.ubercab.client.feature.share:
//            ShareFragment

final class a extends ClickableSpan
{

    final a a;

    public final void onClick(View view)
    {
        dtp.a((RiderActivity)a.a.getActivity(), 0, null, a.a.getString(0x7f070407, new Object[] {
            ShareFragment.c(a.a)
        }), a.a.getString(0x7f07009a).toUpperCase());
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    ( )
    {
        a = ;
        super();
    }
}
