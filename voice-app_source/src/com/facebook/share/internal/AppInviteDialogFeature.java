// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class AppInviteDialogFeature extends Enum
    implements DialogFeature
{

    public static final AppInviteDialogFeature APP_INVITES_DIALOG;
    private static final AppInviteDialogFeature ENUM$VALUES[];
    private int minVersion;

    private AppInviteDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static AppInviteDialogFeature valueOf(String s)
    {
        return (AppInviteDialogFeature)Enum.valueOf(com/facebook/share/internal/AppInviteDialogFeature, s);
    }

    public static AppInviteDialogFeature[] values()
    {
        AppInviteDialogFeature aappinvitedialogfeature[] = ENUM$VALUES;
        int i = aappinvitedialogfeature.length;
        AppInviteDialogFeature aappinvitedialogfeature1[] = new AppInviteDialogFeature[i];
        System.arraycopy(aappinvitedialogfeature, 0, aappinvitedialogfeature1, 0, i);
        return aappinvitedialogfeature1;
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.APPINVITES_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        APP_INVITES_DIALOG = new AppInviteDialogFeature("APP_INVITES_DIALOG", 0, 0x133529d);
        ENUM$VALUES = (new AppInviteDialogFeature[] {
            APP_INVITES_DIALOG
        });
    }
}
