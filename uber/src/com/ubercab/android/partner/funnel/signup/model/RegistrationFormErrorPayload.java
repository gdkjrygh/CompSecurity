// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.model:
//            Shape_RegistrationFormErrorPayload

public abstract class RegistrationFormErrorPayload
    implements Parcelable
{

    public RegistrationFormErrorPayload()
    {
    }

    public static RegistrationFormErrorPayload create()
    {
        return new Shape_RegistrationFormErrorPayload();
    }

    public abstract String getComponentId();

    public abstract String getEmailComponentId();

    public abstract int getErrorCode();

    public abstract String getMessage();

    public abstract String getPasswordComponentId();

    public abstract String getReason();

    abstract RegistrationFormErrorPayload setComponentId(String s);

    abstract RegistrationFormErrorPayload setEmailComponentId(String s);

    abstract RegistrationFormErrorPayload setErrorCode(int i);

    abstract RegistrationFormErrorPayload setMessage(String s);

    abstract RegistrationFormErrorPayload setPasswordComponentId(String s);

    abstract RegistrationFormErrorPayload setReason(String s);
}
