.class public interface abstract Lcom/urbanairship/push/PushNotificationBuilder;
.super Ljava/lang/Object;
.source "PushNotificationBuilder.java"


# virtual methods
.method public abstract buildNotification(Ljava/lang/String;Ljava/util/Map;)Landroid/app/Notification;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation
.end method

.method public abstract getNextId(Ljava/lang/String;Ljava/util/Map;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation
.end method
