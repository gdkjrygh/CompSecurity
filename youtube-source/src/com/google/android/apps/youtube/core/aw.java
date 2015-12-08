// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.async.GDataResponseException;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.InvalidFormatException;
import com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException;
import com.google.android.apps.youtube.core.offline.exception.OfflinePolicyException;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.medialib.player.MissingStreamException;
import com.google.android.youtube.p;
import java.io.IOException;
import java.net.SocketException;
import org.apache.http.client.HttpResponseException;

public final class aw
{

    private final Context a;
    private final h b;

    public aw(Context context, h h1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
    }

    public static boolean a(Throwable throwable, String s, String s1, String s2, String s3)
    {
        return (throwable instanceof GDataResponseException) && ((GDataResponseException)throwable).containsError(s, s1, null, s3);
    }

    public final String a(Throwable throwable)
    {
        return (String)b(throwable).first;
    }

    public final void a(int i)
    {
        a(a.getString(i));
    }

    public final void a(String s)
    {
        ah.b(a, s, 1);
    }

    public final Pair b(Throwable throwable)
    {
_L6:
        Throwable throwable1;
        if (throwable == null)
        {
            return Pair.create(a.getString(p.bn), "genericError");
        }
        throwable1 = throwable;
_L3:
        if (throwable1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!com/google/android/apps/youtube/core/async/DeviceAuthorizerForV2Apis$DeviceRegistrationException.isAssignableFrom(throwable1.getClass())) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag)
        {
            return Pair.create(a.getString(p.bj), "deviceRegistration");
        }
        break MISSING_BLOCK_LABEL_76;
_L2:
        throwable1 = throwable1.getCause();
          goto _L3
        flag = false;
          goto _L4
        if (throwable instanceof MissingStreamException)
        {
            return Pair.create(a.getString(p.go), "missingStream");
        }
        if (throwable instanceof AuthenticatorException)
        {
            return Pair.create(a.getString(p.bf), "authenticator");
        }
        if (throwable instanceof SocketException)
        {
            if (b.a())
            {
                return Pair.create(a.getString(p.bi), "connection");
            } else
            {
                return Pair.create(a.getString(p.cO), "noNetwork");
            }
        }
        if (throwable instanceof HttpResponseException)
        {
            if (throwable instanceof GDataResponseException)
            {
                GDataResponseException gdataresponseexception = (GDataResponseException)throwable;
                if (gdataresponseexception.containsDisabledInMaintenanceModeError())
                {
                    return Pair.create(a.getString(p.bB), "youtubeServerDown");
                }
                if (gdataresponseexception.containsYouTubeSignupRequiredError())
                {
                    return Pair.create(a.getString(p.bt), "noLinkedYoutubeAccount");
                }
                if (gdataresponseexception.containsInvalidUriError())
                {
                    return Pair.create(a.getString(p.bq), "invalidRequest");
                }
                if (gdataresponseexception.containsVideoIsPrivateError())
                {
                    return Pair.create(a.getString(p.gM), "videoIsPrivate");
                }
            }
            throwable = (HttpResponseException)throwable;
            String s = (new StringBuilder("httpError ")).append(throwable.getStatusCode()).toString();
            if (throwable.getStatusCode() == 403)
            {
                return Pair.create(a.getString(p.bl), s);
            } else
            {
                return Pair.create(a.getString(p.bo, new Object[] {
                    Integer.valueOf(throwable.getStatusCode())
                }), s);
            }
        }
        if (throwable instanceof VolleyError)
        {
            VolleyError volleyerror = (VolleyError)throwable;
            j j1 = volleyerror.networkResponse;
            if (j1 != null && j1.a > 0)
            {
                throwable = (new StringBuilder("httpError ")).append(j1.a).toString();
                if (volleyerror.networkResponse.a == 403)
                {
                    return Pair.create(a.getString(p.bl), throwable);
                } else
                {
                    return Pair.create(a.getString(p.bo, new Object[] {
                        Integer.valueOf(j1.a)
                    }), throwable);
                }
            }
        }
        if (throwable instanceof InvalidFormatException)
        {
            return Pair.create(a.getString(p.bx), "invalidResponse");
        }
        if (throwable instanceof ConverterException)
        {
            return Pair.create(a.getString(p.bw), "genericResponseError");
        }
        if (throwable instanceof IOException)
        {
            if (b.a())
            {
                return Pair.create(a.getString(p.bs), "genericNetworkError");
            } else
            {
                return Pair.create(a.getString(p.cO), "noNetwork");
            }
        }
        if (throwable instanceof OfflinePolicyException)
        {
            if (throwable instanceof com.google.android.apps.youtube.core.offline.exception.OfflinePolicyException.OfflineVideoExpiredPolicyException)
            {
                return Pair.create(a.getString(p.gm), "offlinePolicyExpired");
            } else
            {
                return Pair.create(a.getString(p.gm), "offlinePolicyError");
            }
        }
        if (throwable instanceof OfflinePlaybackException)
        {
            if (throwable instanceof com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineMediaUnplayableException)
            {
                return Pair.create(a.getString(p.gm), "offlineMediaUnplayable");
            }
            if (throwable instanceof com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineMediaIncompleteException)
            {
                return Pair.create(a.getString(p.gO), "offlineMediaIncomplete");
            }
            if (throwable instanceof com.google.android.apps.youtube.core.offline.exception.OfflinePlaybackException.OfflineNoMediaException)
            {
                return Pair.create(a.getString(p.gO), "offlineNoMedia");
            }
        }
        throwable = throwable.getCause();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c(Throwable throwable)
    {
        a(a(throwable));
    }
}
