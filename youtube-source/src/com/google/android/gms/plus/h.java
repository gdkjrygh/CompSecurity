// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.internal.gi;

public final class h
{

    private final Intent a = new Intent("com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE");

    public h()
    {
        a.addFlags(0x80000);
    }

    public final Intent a()
    {
        a.setPackage("com.google.android.gms");
        return a;
    }

    public final h a(String s)
    {
        a.putExtra("com.google.android.gms.plus.intent.extra.ACCOUNT", s);
        return this;
    }

    public final h a(String s, String s1, String s2)
    {
        s = AudienceMember.forPersonWithGaiaId(s, s1, s2);
        a.putExtra("com.google.android.gms.plus.intent.extra.INTERNAL_PREFILLED_PLUS_MENTION", s);
        return this;
    }

    public final h b(String s)
    {
        a.putExtra("com.google.android.gms.plus.intent.extra.INTERNAL_REPLY_ACTIVITY_ID", s);
        return this;
    }

    public final h c(String s)
    {
        a.putExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID", s);
        return this;
    }

    public final h d(String s)
    {
        a.putExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE", s);
        return this;
    }

    public final h e(String s)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "clientApplicationId must not be empty.");
        try
        {
            Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("clientApplicationId must be parsable to an int.");
        }
        a.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID", s);
        return this;
    }
}
