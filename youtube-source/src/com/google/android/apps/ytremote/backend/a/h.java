// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import com.google.android.apps.ytremote.a.a.a;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.util.Join;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;

public final class h
{

    public static HttpPost a(PairingCode pairingcode)
    {
        HttpPost httppost = new HttpPost("https://www.youtube.com/api/lounge/pairing/get_screen");
        pairingcode = com.google.android.apps.ytremote.a.a.a.a(new BasicNameValuePair[] {
            new BasicNameValuePair("pairing_code", pairingcode.toString())
        });
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(pairingcode));
        }
        // Misplaced declaration of an exception variable
        catch (PairingCode pairingcode)
        {
            return httppost;
        }
        return httppost;
    }

    public static HttpPost a(PairingCode pairingcode, ScreenId screenid, String s)
    {
        HttpPost httppost = new HttpPost("https://www.youtube.com/api/lounge/pairing/register_pairing_code");
        pairingcode = com.google.android.apps.ytremote.a.a.a.a(new BasicNameValuePair[] {
            new BasicNameValuePair("pairing_code", pairingcode.toString()), new BasicNameValuePair("access_type", com.google.android.apps.ytremote.model.CloudScreen.AccessType.PERMANENT.toString().toLowerCase(Locale.US)), new BasicNameValuePair("screen_id", screenid.toString()), new BasicNameValuePair("screen_name", s)
        });
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(pairingcode));
        }
        // Misplaced declaration of an exception variable
        catch (PairingCode pairingcode)
        {
            return httppost;
        }
        return httppost;
    }

    public static HttpPost a(String s, String s1, String s2, String s3)
    {
        s1 = new HttpPost((new StringBuilder("https://www.youtube.com/api/lounge/screens/")).append(s1.toString()).toString());
        s1.setHeader("Authorization", (new StringBuilder("Bearer ")).append(s).toString());
        s1.setHeader("Cache-Control", "max-age=0");
        s = com.google.android.apps.ytremote.a.a.a.a(new BasicNameValuePair[] {
            new BasicNameValuePair("screen_name", s2), new BasicNameValuePair("device_id", s3)
        });
        try
        {
            s1.setEntity(new UrlEncodedFormEntity(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s1;
    }

    public static HttpPost a(Collection collection)
    {
        HttpPost httppost = new HttpPost("https://www.youtube.com/api/lounge/pairing/get_screen_availability");
        collection = com.google.android.apps.ytremote.a.a.a.a(new BasicNameValuePair[] {
            new BasicNameValuePair("lounge_token", Join.a(",", collection))
        });
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(collection));
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return httppost;
        }
        return httppost;
    }

    public static HttpPut a(String s, ScreenId screenid, String s1)
    {
        screenid = new HttpPut((new StringBuilder("https://www.youtube.com/api/lounge/screens/")).append(screenid.toString()).toString());
        screenid.setHeader("Authorization", (new StringBuilder("Bearer ")).append(s).toString());
        screenid.setHeader("Cache-Control", "max-age=0");
        s = com.google.android.apps.ytremote.a.a.a.a(new BasicNameValuePair[] {
            new BasicNameValuePair("screen_name", s1)
        });
        try
        {
            screenid.setEntity(new UrlEncodedFormEntity(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return screenid;
        }
        return screenid;
    }

    public static HttpPost b(Collection collection)
    {
        HttpPost httppost = new HttpPost("https://www.youtube.com/api/lounge/pairing/get_lounge_token_batch");
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(new BasicNameValuePair("screen_ids", Join.a(",", collection)));
        try
        {
            httppost.setEntity(new UrlEncodedFormEntity(arraylist));
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return httppost;
        }
        return httppost;
    }
}
