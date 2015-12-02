// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import java.security.SecureRandom;

// Referenced classes of package com.whatsapp:
//            my

public class ad
{

    public byte a[];
    public String b;
    public String c;
    public String d;
    public String e;

    public ad(String s, String s1, String s2)
    {
        b = s;
        c = s2;
        e = s1;
        s = new byte[64];
        my.b().nextBytes(s);
        d = Base64.encodeToString(s, 2);
        a = s;
    }
}
