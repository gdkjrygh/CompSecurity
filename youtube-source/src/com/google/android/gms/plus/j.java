// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;

public final class j
{

    private final Context a;
    private final Intent b = (new Intent()).setAction("android.intent.action.SEND");
    private boolean c;
    private ArrayList d;

    public j(Activity activity)
    {
        a = activity;
        b.addFlags(0x80000);
        if (activity != null && activity.getComponentName() != null)
        {
            c = true;
        }
    }

    public final Intent a()
    {
        String s;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        boolean flag;
        boolean flag3;
        boolean flag4;
        if (d != null && d.size() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = "android.intent.action.SEND_MULTIPLE".equals(b.getAction());
        flag4 = b.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
        if (!flag || !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gi.a(flag1, "Call-to-action buttons are only available for URLs.");
        if (!flag4 || b.hasExtra("com.google.android.apps.plus.CONTENT_URL"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gi.a(flag1, "The content URL is required for interactive posts.");
        if (!flag4 || b.hasExtra("com.google.android.apps.plus.CONTENT_URL") || b.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gi.a(flag1, "Must set content URL or content deep-link ID to use a call-to-action button.");
        if (!b.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")) goto _L2; else goto _L1
_L1:
        s = b.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
        flag1 = false;
_L6:
        gi.a(flag1, "The specified deep-link ID was malformed.");
_L2:
        if (!flag && flag3)
        {
            b.setAction("android.intent.action.SEND");
            if (d != null && !d.isEmpty())
            {
                b.putExtra("android.intent.extra.STREAM", (Parcelable)d.get(0));
            } else
            {
                b.removeExtra("android.intent.extra.STREAM");
            }
            d = null;
        }
        if (flag && !flag3)
        {
            b.setAction("android.intent.action.SEND_MULTIPLE");
            if (d != null && !d.isEmpty())
            {
                b.putParcelableArrayListExtra("android.intent.extra.STREAM", d);
            } else
            {
                b.removeExtra("android.intent.extra.STREAM");
            }
        }
        if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(b.getAction()))
        {
            b.setPackage("com.google.android.gms");
            return b;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag1 = flag2;
        if (s.contains(" "))
        {
            Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
            flag1 = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!b.hasExtra("android.intent.extra.STREAM"))
        {
            b.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
            b.setPackage("com.google.android.gms");
            return b;
        } else
        {
            b.setPackage("com.google.android.apps.plus");
            return b;
        }
    }

    public final j a(int i)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_ICON_RESOURCE", i);
        return this;
    }

    public final j a(Uri uri)
    {
        String s = null;
        if (uri != null)
        {
            s = uri.toString();
        }
        if (TextUtils.isEmpty(s))
        {
            b.removeExtra("com.google.android.apps.plus.CONTENT_URL");
            return this;
        } else
        {
            b.putExtra("com.google.android.apps.plus.CONTENT_URL", s);
            return this;
        }
    }

    public final j a(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_NAME", s);
        return this;
    }

    public final j a(boolean flag)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.SHARE_ON_PLUS", true);
        return this;
    }

    public final j b(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.INTERNAL_SHARE_BUTTON_NAME", s);
        return this;
    }

    public final j c(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE", s);
        return this;
    }

    public final j d(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.ACCOUNT", s);
        return this;
    }

    public final j e(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID", s);
        return this;
    }

    public final j f(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_DISPLAY_NAME", s);
        return this;
    }

    public final j g(String s)
    {
        b.setAction("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
        b.putExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_IMAGE_URL", s);
        return this;
    }

    public final j h(String s)
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
        b.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID", s);
        return this;
    }
}
