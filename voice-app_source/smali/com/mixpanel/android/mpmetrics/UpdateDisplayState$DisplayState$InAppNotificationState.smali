.class public final Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;
.super Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
.source "UpdateDisplayState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InAppNotificationState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;",
            ">;"
        }
    .end annotation
.end field

.field private static HIGHLIGHT_KEY:Ljava/lang/String; = null

.field private static INAPP_KEY:Ljava/lang/String; = null

.field public static final TYPE:Ljava/lang/String; = "InAppNotificationState"


# instance fields
.field private final mHighlightColor:I

.field private final mInAppNotification:Lcom/mixpanel/android/mpmetrics/InAppNotification;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState$1;-><init>()V

    .line 44
    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 99
    const-string v0, "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY"

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->INAPP_KEY:Ljava/lang/String;

    .line 100
    const-string v0, "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY"

    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->HIGHLIGHT_KEY:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Bundle;

    .prologue
    .line 91
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;-><init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;)V

    .line 92
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->INAPP_KEY:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mInAppNotification:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 93
    sget-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->HIGHLIGHT_KEY:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mHighlightColor:I

    .line 94
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/InAppNotification;I)V
    .locals 1
    .param p1, "notification"    # Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .param p2, "highlightColor"    # I

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;-><init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;)V

    .line 61
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mInAppNotification:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 62
    iput p2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mHighlightColor:I

    .line 63
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    return v0
.end method

.method public getHighlightColor()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mHighlightColor:I

    return v0
.end method

.method public getInAppNotification()Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mInAppNotification:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    const-string v0, "InAppNotificationState"

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 85
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 86
    .local v0, "write":Landroid/os/Bundle;
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->INAPP_KEY:Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mInAppNotification:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 87
    sget-object v1, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->HIGHLIGHT_KEY:Ljava/lang/String;

    iget v2, p0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;->mHighlightColor:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 88
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 89
    return-void
.end method
