// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.model;

import android.os.Parcelable;
import hnx;
import hny;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.model:
//            Shape_RegistrationFormError, RegistrationFormErrorPayload

public abstract class RegistrationFormError extends hnx
    implements Parcelable
{

    public RegistrationFormError()
    {
    }

    public static RegistrationFormError create()
    {
        return new Shape_RegistrationFormError();
    }

    public abstract String getErrorName();

    public abstract RegistrationFormErrorPayload getPayload();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.android.partner.funnel.signup.model.Shape_RegistrationFormError.Property[((Shape_RegistrationFormError.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 30;
           goto _L1 _L2
_L1:
        return obj;
_L2:
        if (obj == null)
        {
            return RegistrationFormErrorPayload.create();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    abstract RegistrationFormError setErrorName(String s);

    abstract RegistrationFormError setPayload(RegistrationFormErrorPayload registrationformerrorpayload);

    /* member class not found */
    class _cls1 {}

}
