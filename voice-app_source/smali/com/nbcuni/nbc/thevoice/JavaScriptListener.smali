.class public interface abstract Lcom/nbcuni/nbc/thevoice/JavaScriptListener;
.super Ljava/lang/Object;
.source "JavaScriptListener.java"


# virtual methods
.method public abstract addAssetToList(Ljava/lang/String;)V
.end method

.method public abstract closeApp()V
.end method

.method public abstract facebookGraphRequest(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/HttpMethod;Ljava/lang/String;)V
.end method

.method public abstract facebookLogin(Ljava/lang/String;Ljava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public abstract facebookLogout(Ljava/lang/String;)V
.end method

.method public abstract facebookPermissionRequest(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract mixpanelIncrementPeopleProperties(Lorg/json/JSONObject;)V
.end method

.method public abstract mixpanelRegisterSuperProperties(Lorg/json/JSONObject;)V
.end method

.method public abstract mixpanelSetPeopleProperties(Lorg/json/JSONObject;)V
.end method

.method public abstract mixpanelTrackEvent(Ljava/lang/String;Lorg/json/JSONObject;)V
.end method

.method public abstract openDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract openUrl(Ljava/lang/String;ZLjava/lang/String;)V
.end method

.method public abstract pauseAudio(Ljava/lang/String;)V
.end method

.method public abstract playAudio(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract pushSetting(ZLjava/lang/String;)V
.end method

.method public abstract reloadWebView()V
.end method

.method public abstract resumeAudio(Ljava/lang/String;)V
.end method

.method public abstract saveSharedPreference(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract sendNativeMessage(Ljava/lang/String;)V
.end method

.method public abstract stopAudio(Ljava/lang/String;)V
.end method
