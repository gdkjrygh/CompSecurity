// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.text.TextUtils;
import com.google.android.exoplayer.drm.MediaDrmCallback;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.UUID;

public class WidevineTestMediaDrmCallback
    implements MediaDrmCallback
{

    private static final String WIDEVINE_GTS_DEFAULT_BASE_URI = "http://wv-staging-proxy.appspot.com/proxy?provider=YouTube&video_id=";
    private final String defaultUri;

    public WidevineTestMediaDrmCallback(String s)
    {
        defaultUri = (new StringBuilder()).append("http://wv-staging-proxy.appspot.com/proxy?provider=YouTube&video_id=").append(s).toString();
    }

    public byte[] executeKeyRequest(UUID uuid, android.media.MediaDrm.KeyRequest keyrequest)
        throws IOException
    {
        String s = keyrequest.getDefaultUrl();
        uuid = s;
        if (TextUtils.isEmpty(s))
        {
            uuid = defaultUri;
        }
        return Util.executePost(uuid, keyrequest.getData(), null);
    }

    public byte[] executeProvisionRequest(UUID uuid, android.media.MediaDrm.ProvisionRequest provisionrequest)
        throws IOException
    {
        return Util.executePost((new StringBuilder()).append(provisionrequest.getDefaultUrl()).append("&signedRequest=").append(new String(provisionrequest.getData())).toString(), null, null);
    }
}
