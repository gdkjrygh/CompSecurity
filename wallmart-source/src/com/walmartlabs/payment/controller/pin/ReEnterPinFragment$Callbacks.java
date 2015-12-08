// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;


// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            ReEnterPinFragment

public static interface I
{

    public abstract void onPinConfirmed(String s);

    public abstract void onPinNotConfirmed();
}
