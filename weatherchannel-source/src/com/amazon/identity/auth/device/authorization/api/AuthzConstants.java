// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization.api;


public final class AuthzConstants
{
    public static final class BUNDLE_KEY extends Enum
    {

        private static final BUNDLE_KEY $VALUES[];
        public static final BUNDLE_KEY APP_ID;
        public static final BUNDLE_KEY AUTHORIZATION_CODE;
        public static final BUNDLE_KEY AUTHORIZE;
        public static final BUNDLE_KEY BROWSER_AUTHORIZATION;
        public static final BUNDLE_KEY CAUSE_ID;
        public static final BUNDLE_KEY CLIENT_ID;
        public static final BUNDLE_KEY DEVICE_ID;
        public static final BUNDLE_KEY DIRECTED_ID;
        public static final BUNDLE_KEY FUTURE;
        public static final BUNDLE_KEY ON_CANCEL_DESCRIPTION;
        public static final BUNDLE_KEY ON_CANCEL_TYPE;
        public static final BUNDLE_KEY PROFILE;
        public static final BUNDLE_KEY REJECTED_SCOPE_LIST;
        public static final BUNDLE_KEY TOKEN;
        public final String val;

        public static BUNDLE_KEY valueOf(String s)
        {
            return (BUNDLE_KEY)Enum.valueOf(com/amazon/identity/auth/device/authorization/api/AuthzConstants$BUNDLE_KEY, s);
        }

        public static BUNDLE_KEY[] values()
        {
            return (BUNDLE_KEY[])$VALUES.clone();
        }

        static 
        {
            TOKEN = new BUNDLE_KEY("TOKEN", 0, "com.amazon.identity.auth.device.authorization.token");
            AUTHORIZATION_CODE = new BUNDLE_KEY("AUTHORIZATION_CODE", 1, "com.amazon.identity.auth.device.authorization.authorizationCode");
            DIRECTED_ID = new BUNDLE_KEY("DIRECTED_ID", 2, "com.amazon.identity.auth.device.authorization.directedId");
            DEVICE_ID = new BUNDLE_KEY("DEVICE_ID", 3, "com.amazon.identity.auth.device.authorization.deviceId");
            APP_ID = new BUNDLE_KEY("APP_ID", 4, "com.amazon.identity.auth.device.authorization.appId");
            CAUSE_ID = new BUNDLE_KEY("CAUSE_ID", 5, "com.amazon.identity.auth.device.authorization.causeId");
            REJECTED_SCOPE_LIST = new BUNDLE_KEY("REJECTED_SCOPE_LIST", 6, "com.amazon.identity.auth.device.authorization.ungrantedScopes");
            AUTHORIZE = new BUNDLE_KEY("AUTHORIZE", 7, "com.amazon.identity.auth.device.authorization.authorize");
            CLIENT_ID = new BUNDLE_KEY("CLIENT_ID", 8, "com.amazon.identity.auth.device.authorization.clietId");
            ON_CANCEL_TYPE = new BUNDLE_KEY("ON_CANCEL_TYPE", 9, "com.amazon.identity.auth.device.authorization.onCancelType");
            ON_CANCEL_DESCRIPTION = new BUNDLE_KEY("ON_CANCEL_DESCRIPTION", 10, "com.amazon.identity.auth.device.authorization.onCancelDescription");
            BROWSER_AUTHORIZATION = new BUNDLE_KEY("BROWSER_AUTHORIZATION", 11, "com.amazon.identity.auth.device.authorization.useBrowserForAuthorization");
            PROFILE = new BUNDLE_KEY("PROFILE", 12, "com.amazon.identity.auth.device.authorization.profile");
            FUTURE = new BUNDLE_KEY("FUTURE", 13, "com.amazon.identity.auth.device.authorization.future.type");
            $VALUES = (new BUNDLE_KEY[] {
                TOKEN, AUTHORIZATION_CODE, DIRECTED_ID, DEVICE_ID, APP_ID, CAUSE_ID, REJECTED_SCOPE_LIST, AUTHORIZE, CLIENT_ID, ON_CANCEL_TYPE, 
                ON_CANCEL_DESCRIPTION, BROWSER_AUTHORIZATION, PROFILE, FUTURE
            });
        }

        private BUNDLE_KEY(String s, int i, String s1)
        {
            super(s, i);
            val = s1;
        }
    }


    public static final int CAUSE_FAILED_AUTHENTICATION = 0;
    public static final int CAUSE_REJECTED_SCOPES = 1;
    private static final String CONSTANT_PREFIX = "com.amazon.identity.auth.device.authorization";

    public AuthzConstants()
    {
    }

    // Unreferenced inner class com/amazon/identity/auth/device/authorization/api/AuthzConstants$FUTURE_TYPE
    /* block-local class not found */
    class FUTURE_TYPE {}


    // Unreferenced inner class com/amazon/identity/auth/device/authorization/api/AuthzConstants$PROFILE_KEY
    /* block-local class not found */
    class PROFILE_KEY {}

}
