// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.model;

import android.os.Parcelable;
import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.model:
//            Shape_PartnerFunnelClient

public abstract class PartnerFunnelClient
    implements Parcelable
{

    public static final String CLIENT = "client";
    public static final String CLIENT_EMAIL = "email";
    public static final String CLIENT_FIRST_NAME = "firstName";
    public static final String CLIENT_LAST_NAME = "lastName";
    public static final String CLIENT_MOBILE = "mobile";
    public static final String CLIENT_PICTURE_URL = "pictureUrl";
    public static final String CLIENT_TOKEN = "token";
    public static final String CLIENT_UUID = "uuid";
    public static final String CONTEXT = "context";

    public PartnerFunnelClient()
    {
    }

    public static PartnerFunnelClient create()
    {
        return new Shape_PartnerFunnelClient();
    }

    public static PartnerFunnelClient createFromErrorContext(Map map)
    {
        try
        {
            map = (Map)map.get("client");
            map = create().setEmail((String)map.get("email")).setUuid((String)map.get("uuid")).setPictureUrl((String)map.get("pictureUrl")).setFirstName((String)map.get("firstName")).setLastName((String)map.get("lastName")).setMobile((String)map.get("mobile")).setToken((String)map.get("token"));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getMobile();

    public abstract String getPictureUrl();

    public abstract String getToken();

    public abstract String getUuid();

    public abstract PartnerFunnelClient setEmail(String s);

    public abstract PartnerFunnelClient setFirstName(String s);

    public abstract PartnerFunnelClient setLastName(String s);

    public abstract PartnerFunnelClient setMobile(String s);

    public abstract PartnerFunnelClient setPictureUrl(String s);

    public abstract PartnerFunnelClient setToken(String s);

    public abstract PartnerFunnelClient setUuid(String s);
}
