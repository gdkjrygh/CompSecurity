// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.client.core.model.TunesProvider;
import java.util.Set;

public final class ekn
{

    public static String a()
    {
        return "uber://rdio/auth";
    }

    public static String a(Resources resources, String s)
    {
        resources = (new android.net.Uri.Builder()).scheme("https").authority("www.rdio.com").appendPath("account/oauth2/authorize").appendQueryParameter("client_id", resources.getString(0x7f070795)).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", "uber://rdio/auth").appendQueryParameter("scope", "ad_supported_playback").appendQueryParameter("show_dialog", Boolean.toString(true));
        if (!TextUtils.isEmpty(s))
        {
            resources.appendQueryParameter("email", s);
        }
        return resources.build().toString();
    }

    public static String a(String s)
    {
        s = Uri.parse(s);
        if (s.getQueryParameterNames().contains("code"))
        {
            return s.getQueryParameter("code");
        } else
        {
            return null;
        }
    }

    public static TunesProvider b()
    {
        return TunesProvider.create("rdio", "Rdio");
    }
}
