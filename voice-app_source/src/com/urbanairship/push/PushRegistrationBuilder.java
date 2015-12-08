// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;


// Referenced classes of package com.urbanairship.push:
//            PushManager, PushPreferences, PushRegistrationPayload

public class PushRegistrationBuilder
{

    public PushRegistrationBuilder()
    {
    }

    public static PushRegistrationPayload buildWithCurrentPreferences()
    {
        Object obj = PushManager.shared().getPreferences();
        String s = ((PushPreferences) (obj)).getAlias();
        String s1 = ((PushPreferences) (obj)).getGcmId();
        if (PushManager.shared().getDeviceTagsEnabled())
        {
            obj = ((PushPreferences) (obj)).getTags();
        } else
        {
            obj = null;
        }
        return new PushRegistrationPayload(s, s1, ((java.util.Set) (obj)));
    }
}
