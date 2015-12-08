.class public interface abstract Lcom/urbanairship/analytics/LifeCycleCallbacks$Callback;
.super Ljava/lang/Object;
.source "LifeCycleCallbacks.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/analytics/LifeCycleCallbacks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Callback"
.end annotation


# virtual methods
.method public abstract onStart(Landroid/app/Activity;)V
.end method

.method public abstract onStop(Landroid/app/Activity;)V
.end method
