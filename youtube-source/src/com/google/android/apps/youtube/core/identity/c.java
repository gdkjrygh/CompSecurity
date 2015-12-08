// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.a;
import java.io.IOException;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            b, a

final class c
    implements Runnable
{

    final String a;
    final com.google.android.apps.youtube.common.a.c b;
    final b c;

    c(b b1, String s, com.google.android.apps.youtube.common.a.c c1)
    {
        c = b1;
        a = s;
        b = c1;
        super();
    }

    public final void run()
    {
        try
        {
            String s = com.google.android.gms.auth.a.a(com.google.android.apps.youtube.core.identity.b.a(c), a, com.google.android.apps.youtube.core.identity.b.b(c));
            com.google.android.apps.youtube.core.identity.b.a(c, s);
            b.a(null, com.google.android.apps.youtube.core.identity.a.a(s));
            return;
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            b.a(null, com.google.android.apps.youtube.core.identity.a.a(userrecoverableauthexception.getIntent()));
            return;
        }
        catch (GoogleAuthException googleauthexception)
        {
            b.a(null, com.google.android.apps.youtube.core.identity.a.b(googleauthexception));
            return;
        }
        catch (IOException ioexception)
        {
            b.a(null, com.google.android.apps.youtube.core.identity.a.a(ioexception));
        }
    }
}
