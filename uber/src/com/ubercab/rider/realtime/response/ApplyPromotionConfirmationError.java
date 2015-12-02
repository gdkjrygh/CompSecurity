// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_ApplyPromotionConfirmationError

public abstract class ApplyPromotionConfirmationError
{

    private static final String KEY_CONFIRMATION_CANCEL_COPY = "confirmationCancelCopy";
    private static final String KEY_CONFIRMATION_CONFIRM_COPY = "confirmationConfirmCopy";
    private static final String KEY_CONFIRMATION_MESSAGE = "confirmationMessage";

    public ApplyPromotionConfirmationError()
    {
    }

    public static ApplyPromotionConfirmationError create(Map map)
    {
        return (new Shape_ApplyPromotionConfirmationError()).setConfirmationCancelCopy((String)map.get("confirmationCancelCopy")).setConfirmationConfirmCopy((String)map.get("confirmationConfirmCopy")).setConfirmationMessage((String)map.get("confirmationMessage"));
    }

    public abstract String getConfirmationCancelCopy();

    public abstract String getConfirmationConfirmCopy();

    public abstract String getConfirmationMessage();

    abstract ApplyPromotionConfirmationError setConfirmationCancelCopy(String s);

    abstract ApplyPromotionConfirmationError setConfirmationConfirmCopy(String s);

    abstract ApplyPromotionConfirmationError setConfirmationMessage(String s);
}
