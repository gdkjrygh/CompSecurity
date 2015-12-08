// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import com.facebook.HttpMethod;
import java.util.List;
import org.json.JSONObject;

public interface JavaScriptListener
{

    public abstract void addAssetToList(String s);

    public abstract void closeApp();

    public abstract void facebookGraphRequest(String s, String s1, HttpMethod httpmethod, String s2);

    public abstract void facebookLogin(String s, List list, boolean flag);

    public abstract void facebookLogout(String s);

    public abstract void facebookPermissionRequest(String s, List list);

    public abstract void facebookShare(String s, String s1, String s2, String s3, String s4);

    public abstract void mixpanelIncrementPeopleProperties(JSONObject jsonobject);

    public abstract void mixpanelRegisterSuperProperties(JSONObject jsonobject);

    public abstract void mixpanelSetPeopleProperties(JSONObject jsonobject);

    public abstract void mixpanelTrackEvent(String s, JSONObject jsonobject);

    public abstract void openDialog(String s, String s1, String s2, String s3, String s4);

    public abstract void openUrl(String s, boolean flag, String s1);

    public abstract void pauseAudio(String s);

    public abstract void playAudio(String s, String s1);

    public abstract void pushSetting(boolean flag, String s);

    public abstract void reloadWebView();

    public abstract void resumeAudio(String s);

    public abstract void saveSharedPreference(String s, String s1);

    public abstract void sendNativeMessage(String s);

    public abstract void stopAudio(String s);
}
