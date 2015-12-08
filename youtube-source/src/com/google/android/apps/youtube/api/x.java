// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import java.security.Provider;
import javax.crypto.Cipher;

// Referenced classes of package com.google.android.apps.youtube.api:
//            y

public final class x extends Cipher
{

    private static final Provider a = new FroyoRC4._cls1("FroyoRC4Provider", 1.0D, "Based on SpongyCastle");

    protected x()
    {
        super(new y((byte)0), a, "RC4");
    }

}
