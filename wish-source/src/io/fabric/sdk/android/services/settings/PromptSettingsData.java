// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class PromptSettingsData
{

    public final String alwaysSendButtonTitle;
    public final String cancelButtonTitle;
    public final String message;
    public final String sendButtonTitle;
    public final boolean showAlwaysSendButton;
    public final boolean showCancelButton;
    public final String title;

    public PromptSettingsData(String s, String s1, String s2, boolean flag, String s3, boolean flag1, String s4)
    {
        title = s;
        message = s1;
        sendButtonTitle = s2;
        showCancelButton = flag;
        cancelButtonTitle = s3;
        showAlwaysSendButton = flag1;
        alwaysSendButtonTitle = s4;
    }
}
