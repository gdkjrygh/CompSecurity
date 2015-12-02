// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Set;

public final class dcw
{

    private dcx a;
    private String b;

    public dcw(Intent intent)
    {
        a = a(intent);
        b = b(intent);
    }

    private static dcx a(Intent intent)
    {
        if (intent.getAction() != null && intent.getAction().equals("android.intent.action.MAIN") && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER"))
        {
            return dcx.a;
        }
        if (intent.hasExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER"))
        {
            return dcx.b;
        }
        if (intent.getDataString() != null)
        {
            return dcx.c;
        } else
        {
            return dcx.d;
        }
    }

    private static String b(Intent intent)
    {
        if (intent.hasExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER"))
        {
            return intent.getStringExtra("com.ubercab.client.EXTRA_MESSAGE_IDENTIFIER");
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return a.a();
    }

    public final String b()
    {
        return b;
    }
}
