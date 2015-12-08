// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzt;
import java.util.Iterator;
import java.util.List;

public final class AndroidAppUri
{

    private final Uri mUri;

    private AndroidAppUri(Uri uri)
    {
        mUri = uri;
    }

    public static AndroidAppUri newAndroidAppUri(Uri uri)
    {
        uri = new AndroidAppUri(uri);
        if (zza(uri))
        {
            return uri;
        } else
        {
            throw new IllegalArgumentException("AndroidAppUri validation failed.");
        }
    }

    public static AndroidAppUri newAndroidAppUri(String s, Uri uri)
    {
        s = (new android.net.Uri.Builder()).scheme("android-app").authority(s);
        if (uri != null)
        {
            s.appendPath(uri.getScheme());
            if (uri.getAuthority() != null)
            {
                s.appendPath(uri.getAuthority());
            }
            for (Iterator iterator = uri.getPathSegments().iterator(); iterator.hasNext(); s.appendPath((String)iterator.next())) { }
            s.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new AndroidAppUri(s.build());
    }

    private static boolean zza(AndroidAppUri androidappuri)
    {
        if (!"android-app".equals(androidappuri.mUri.getScheme()))
        {
            throw new IllegalArgumentException("android-app scheme is required.");
        }
        if (TextUtils.isEmpty(androidappuri.getPackageName()))
        {
            throw new IllegalArgumentException("Package name is empty.");
        }
        Uri uri = newAndroidAppUri(androidappuri.getPackageName(), androidappuri.getDeepLinkUri()).toUri();
        if (!androidappuri.mUri.equals(uri))
        {
            throw new IllegalArgumentException("URI is not canonical.");
        } else
        {
            return true;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof AndroidAppUri)
        {
            return mUri.equals(((AndroidAppUri)obj).mUri);
        } else
        {
            return false;
        }
    }

    public Uri getDeepLinkUri()
    {
        List list = mUri.getPathSegments();
        if (list.size() > 0)
        {
            String s = (String)list.get(0);
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme(s);
            if (list.size() > 1)
            {
                builder.authority((String)list.get(1));
                for (int i = 2; i < list.size(); i++)
                {
                    builder.appendPath((String)list.get(i));
                }

            }
            builder.encodedQuery(mUri.getEncodedQuery());
            builder.encodedFragment(mUri.getEncodedFragment());
            return builder.build();
        } else
        {
            return null;
        }
    }

    public String getPackageName()
    {
        return mUri.getAuthority();
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            mUri
        });
    }

    public String toString()
    {
        return mUri.toString();
    }

    public Uri toUri()
    {
        return mUri;
    }
}
