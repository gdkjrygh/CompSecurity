// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization.api;


// Referenced classes of package com.amazon.identity.auth.device.authorization.api:
//            AuthzConstants

public static final class val extends Enum
{

    private static final FUTURE $VALUES[];
    public static final FUTURE APP_ID;
    public static final FUTURE AUTHORIZATION_CODE;
    public static final FUTURE AUTHORIZE;
    public static final FUTURE BROWSER_AUTHORIZATION;
    public static final FUTURE CAUSE_ID;
    public static final FUTURE CLIENT_ID;
    public static final FUTURE DEVICE_ID;
    public static final FUTURE DIRECTED_ID;
    public static final FUTURE FUTURE;
    public static final FUTURE ON_CANCEL_DESCRIPTION;
    public static final FUTURE ON_CANCEL_TYPE;
    public static final FUTURE PROFILE;
    public static final FUTURE REJECTED_SCOPE_LIST;
    public static final FUTURE TOKEN;
    public final String val;

    public static val valueOf(String s)
    {
        return (val)Enum.valueOf(com/amazon/identity/auth/device/authorization/api/AuthzConstants$BUNDLE_KEY, s);
    }

    public static val[] values()
    {
        return (val[])$VALUES.clone();
    }

    static 
    {
        TOKEN = new <init>("TOKEN", 0, "com.amazon.identity.auth.device.authorization.token");
        AUTHORIZATION_CODE = new <init>("AUTHORIZATION_CODE", 1, "com.amazon.identity.auth.device.authorization.authorizationCode");
        DIRECTED_ID = new <init>("DIRECTED_ID", 2, "com.amazon.identity.auth.device.authorization.directedId");
        DEVICE_ID = new <init>("DEVICE_ID", 3, "com.amazon.identity.auth.device.authorization.deviceId");
        APP_ID = new <init>("APP_ID", 4, "com.amazon.identity.auth.device.authorization.appId");
        CAUSE_ID = new <init>("CAUSE_ID", 5, "com.amazon.identity.auth.device.authorization.causeId");
        REJECTED_SCOPE_LIST = new <init>("REJECTED_SCOPE_LIST", 6, "com.amazon.identity.auth.device.authorization.ungrantedScopes");
        AUTHORIZE = new <init>("AUTHORIZE", 7, "com.amazon.identity.auth.device.authorization.authorize");
        CLIENT_ID = new <init>("CLIENT_ID", 8, "com.amazon.identity.auth.device.authorization.clietId");
        ON_CANCEL_TYPE = new <init>("ON_CANCEL_TYPE", 9, "com.amazon.identity.auth.device.authorization.onCancelType");
        ON_CANCEL_DESCRIPTION = new <init>("ON_CANCEL_DESCRIPTION", 10, "com.amazon.identity.auth.device.authorization.onCancelDescription");
        BROWSER_AUTHORIZATION = new <init>("BROWSER_AUTHORIZATION", 11, "com.amazon.identity.auth.device.authorization.useBrowserForAuthorization");
        PROFILE = new <init>("PROFILE", 12, "com.amazon.identity.auth.device.authorization.profile");
        FUTURE = new <init>("FUTURE", 13, "com.amazon.identity.auth.device.authorization.future.type");
        $VALUES = (new .VALUES[] {
            TOKEN, AUTHORIZATION_CODE, DIRECTED_ID, DEVICE_ID, APP_ID, CAUSE_ID, REJECTED_SCOPE_LIST, AUTHORIZE, CLIENT_ID, ON_CANCEL_TYPE, 
            ON_CANCEL_DESCRIPTION, BROWSER_AUTHORIZATION, PROFILE, FUTURE
        });
    }

    private Q(String s, int i, String s1)
    {
        super(s, i);
        val = s1;
    }
}
