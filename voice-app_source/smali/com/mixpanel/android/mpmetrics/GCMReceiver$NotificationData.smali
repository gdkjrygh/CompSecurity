.class Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;
.super Ljava/lang/Object;
.source "GCMReceiver.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/GCMReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "NotificationData"
.end annotation


# instance fields
.field public final icon:I

.field public final intent:Landroid/content/Intent;

.field public final message:Ljava/lang/String;

.field public final title:Ljava/lang/CharSequence;


# direct methods
.method private constructor <init>(ILjava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0
    .param p1, "anIcon"    # I
    .param p2, "aTitle"    # Ljava/lang/CharSequence;
    .param p3, "aMessage"    # Ljava/lang/String;
    .param p4, "anIntent"    # Landroid/content/Intent;

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput p1, p0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->icon:I

    .line 111
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->title:Ljava/lang/CharSequence;

    .line 112
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->message:Ljava/lang/String;

    .line 113
    iput-object p4, p0, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;->intent:Landroid/content/Intent;

    .line 114
    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mixpanel/android/mpmetrics/GCMReceiver$NotificationData;-><init>(ILjava/lang/CharSequence;Ljava/lang/String;Landroid/content/Intent;)V

    return-void
.end method
