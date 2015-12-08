.class enum Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$2;
.super Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
.source "InAppNotification.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;-><init>(Ljava/lang/String;ILcom/mixpanel/android/mpmetrics/InAppNotification$Type;)V

    .line 1
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    const-string v0, "mini"

    return-object v0
.end method
