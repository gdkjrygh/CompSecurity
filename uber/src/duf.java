// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public final class duf
{

    public static void a(Context context, gqn gqn1)
    {
        gqn1.a(grx.a("BKS", context.getResources().openRawResource(0x7f060005), "sMdqVqJBdBmmkDMp6BK7EVeEkHcNbJ".toCharArray()));
_L2:
        return;
        context;
_L3:
        if (context.getMessage() != null && context.getMessage().equals("Wrong version of key store.")) goto _L2; else goto _L1
_L1:
        ijg.d(context, "Failed to set the SSLSocketFactory.", new Object[0]);
        return;
        context;
          goto _L3
        context;
          goto _L3
        context;
          goto _L3
    }
}
