.class public enum Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
.super Ljava/lang/Enum;
.source "InAppNotification.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/InAppNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

.field public static final enum MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

.field public static final enum TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

.field public static final enum UNKNOWN:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 28
    new-instance v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$1;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    .line 34
    new-instance v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$2;

    const-string v1, "MINI"

    invoke-direct {v0, v1, v3}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    .line 40
    new-instance v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$3;

    const-string v1, "TAKEOVER"

    invoke-direct {v0, v1, v4}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    .line 27
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->UNKNOWN:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->MINI:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->TAKEOVER:Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/mixpanel/android/mpmetrics/InAppNotification$Type;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    return-object v0
.end method

.method public static values()[Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;->ENUM$VALUES:[Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    array-length v1, v0

    new-array v2, v1, [Lcom/mixpanel/android/mpmetrics/InAppNotification$Type;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
