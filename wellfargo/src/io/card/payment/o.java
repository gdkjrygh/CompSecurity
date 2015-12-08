// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Window;

// Referenced classes of package io.card.payment:
//            CardIOActivity, DataEntryActivity, aa

final class o
    implements Runnable
{

    private CardIOActivity a;

    o(CardIOActivity cardioactivity)
    {
        a = cardioactivity;
        super();
    }

    public final void run()
    {
        a.getWindow().clearFlags(1024);
        a.getWindow().addFlags(512);
        Intent intent = new Intent(a, io/card/payment/DataEntryActivity);
        if (CardIOActivity.a(a) != null)
        {
            CardIOActivity.a(a).b();
            if (CardIOActivity.f != null && !CardIOActivity.f.isRecycled())
            {
                CardIOActivity.f.recycle();
            }
            CardIOActivity.f = CardIOActivity.a(a).a();
        }
        if (CardIOActivity.b(a) != null)
        {
            intent.putExtra("io.card.payment.scanResult", CardIOActivity.b(a));
            CardIOActivity.a(a, null);
        }
        intent.putExtras(a.getIntent());
        intent.addFlags(0x40810000);
        a.startActivityForResult(intent, CardIOActivity.c());
    }
}
