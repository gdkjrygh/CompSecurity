// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import io.card.payment.CardIOActivity;

public final class htp
    implements android.view.View.OnClickListener
{

    private CardIOActivity a;

    public htp(CardIOActivity cardioactivity)
    {
        a = cardioactivity;
        super();
    }

    public final void onClick(View view)
    {
        CardIOActivity.d(a);
    }
}
