// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import com.ubercab.client.core.model.TunesProvider;
import java.util.Set;

public final class eko
{

    private static final String a[] = {
        "user-library-read", "playlist-read-private", "streaming", "user-read-private", "user-trial-start"
    };

    public static TunesProvider a()
    {
        return TunesProvider.create("spotify", "Spotify");
    }

    public static String a(Resources resources)
    {
        return (new android.net.Uri.Builder()).scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", resources.getString(0x7f07079f)).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", "uber://spotify/auth").appendQueryParameter("scope", gjw.a(" ").a(a)).appendQueryParameter("show_dialog", Boolean.toString(true)).appendQueryParameter("utm_source", "uber").appendQueryParameter("utm_medium", "growth_acquisition").appendQueryParameter("utm_campaign", "acquisition_uber_all").appendQueryParameter("utm_content", "all501433").appendQueryParameter("utm_term", "mobile").build().toString();
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

    public static String b()
    {
        return "uber://spotify/auth";
    }

}
