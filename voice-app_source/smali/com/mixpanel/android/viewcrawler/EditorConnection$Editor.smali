.class public interface abstract Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
.super Ljava/lang/Object;
.source "EditorConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/EditorConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Editor"
.end annotation


# virtual methods
.method public abstract bindEvents(Lorg/json/JSONObject;)V
.end method

.method public abstract cleanup()V
.end method

.method public abstract clearEdits(Lorg/json/JSONObject;)V
.end method

.method public abstract performEdit(Lorg/json/JSONObject;)V
.end method

.method public abstract sendDeviceInfo()V
.end method

.method public abstract sendSnapshot(Lorg/json/JSONObject;)V
.end method

.method public abstract setTweaks(Lorg/json/JSONObject;)V
.end method
