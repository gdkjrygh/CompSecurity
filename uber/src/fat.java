// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.ApplyPromotionConfirmationError;
import com.ubercab.rider.realtime.response.ApplyPromotionResponse;

final class fat
    implements icg
{

    final fas a;

    private fat(fas fas1)
    {
        a = fas1;
        super();
    }

    fat(fas fas1, byte byte0)
    {
        this(fas1);
    }

    private void a(ApplyPromotionResponse applypromotionresponse)
    {
        a.a(false);
        fas.a(a, applypromotionresponse.getDescription());
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
        a.a(false);
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable == null)
        {
            a.a(a.getString(0x7f070436));
        } else
        {
            if (throwable.getCode().equals("rtapi.users.promotions.need_confirmation"))
            {
                throwable = ApplyPromotionConfirmationError.create(throwable.getData());
                a.j().a(l.ew);
                dtj.a((RiderActivity)a.getActivity(), 1321, null, throwable.getConfirmationMessage(), throwable.getConfirmationConfirmCopy(), throwable.getConfirmationCancelCopy());
                return;
            }
            throwable = throwable.getMessage();
            if (!TextUtils.isEmpty(throwable))
            {
                a.j().a(l.ex);
                a.a(throwable);
                return;
            }
        }
    }
}
