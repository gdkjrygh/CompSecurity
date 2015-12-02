// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Window;
import io.card.payment.CardIOActivity;
import io.card.payment.DataEntryActivity;

public final class hto
    implements Runnable
{

    private CardIOActivity a;

    public hto(CardIOActivity cardioactivity)
    {
        a = cardioactivity;
        super();
    }

    public final void run()
    {
        CardIOActivity.e();
        a.getWindow().clearFlags(1024);
        a.getWindow().addFlags(512);
        Intent intent = new Intent(a, io/card/payment/DataEntryActivity);
        if (CardIOActivity.a(a) != null)
        {
            CardIOActivity.a(a).c();
            if (CardIOActivity.f != null && !CardIOActivity.f.isRecycled())
            {
                CardIOActivity.f.recycle();
            }
            CardIOActivity.f = CardIOActivity.a(a).b();
        }
        if (CardIOActivity.b(a) != null)
        {
            intent.putExtra("io.card.payment.scanResult", CardIOActivity.b(a));
            CardIOActivity.c(a);
        } else
        {
            intent.putExtra("io.card.payment.manualEntryScanResult", true);
        }
        intent.putExtras(a.getIntent());
        intent.addFlags(0x40810000);
        a.startActivityForResult(intent, CardIOActivity.f());
    }
}
