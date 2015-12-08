.class public abstract Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;
.super Ljava/lang/Object;
.source "UpdateDisplayState.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "DisplayState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;,
        Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATE_IMPL_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY"

.field public static final STATE_TYPE_KEY:Ljava/lang/String; = "com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 211
    new-instance v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$1;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$1;-><init>()V

    .line 210
    sput-object v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 234
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getType()Ljava/lang/String;
.end method
