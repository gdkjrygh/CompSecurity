// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import android.util.Base64;

// Referenced classes of package com.google.android.ads:
//            u

final class a
    implements u
{

    a()
    {
    }

    public final String a(byte abyte0[], boolean flag)
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public final byte[] a(String s, boolean flag)
    {
        return Base64.decode(s, 2);
    }
}
