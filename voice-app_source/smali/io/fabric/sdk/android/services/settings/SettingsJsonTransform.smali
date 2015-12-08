.class public interface abstract Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;
.super Ljava/lang/Object;
.source "SettingsJsonTransform.java"


# virtual methods
.method public abstract buildFromJson(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SettingsData;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation
.end method

.method public abstract toJson(Lio/fabric/sdk/android/services/settings/SettingsData;)Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation
.end method
