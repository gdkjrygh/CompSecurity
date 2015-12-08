// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public class b
{

    private boolean a;
    private boolean b;

    public b()
    {
        a = false;
        b = true;
    }

    static boolean a(b b1)
    {
        return b1.a;
    }

    static boolean b(b b1)
    {
        return b1.b;
    }

    public CredentialPickerConfig a()
    {
        return new CredentialPickerConfig(this, null);
    }
}
