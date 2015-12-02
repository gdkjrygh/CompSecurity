// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.Toast;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.promo.PromoFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.ApplyPromotionConfirmationError;
import com.ubercab.rider.realtime.response.ApplyPromotionResponse;

public final class fao
    implements icg
{

    final PromoFragment a;

    private fao(PromoFragment promofragment)
    {
        a = promofragment;
        super();
    }

    public fao(PromoFragment promofragment, byte byte0)
    {
        this(promofragment);
    }

    private void a(ApplyPromotionResponse applypromotionresponse)
    {
        PromoFragment.b(a);
        PromoFragment.a(a, applypromotionresponse.getDescription());
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ApplyPromotionResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        PromoFragment.b(a);
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable == null)
        {
            Toast.makeText(a.getActivity(), 0x7f070631, 0).show();
        } else
        {
            if (throwable.getCode().equals("rtapi.users.promotions.need_confirmation"))
            {
                throwable = ApplyPromotionConfirmationError.create(throwable.getData());
                dtj.a((RiderActivity)a.getActivity(), 1321, null, throwable.getConfirmationMessage(), throwable.getConfirmationConfirmCopy(), throwable.getConfirmationCancelCopy());
                return;
            }
            if (!TextUtils.isEmpty(throwable.getMessage()))
            {
                PromoFragment.b(a, throwable.getMessage());
                return;
            }
        }
    }
}
